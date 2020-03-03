package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.models.Event;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.EventViewHolder> {
    private Event[] eventList;
    private EventClickListener clickListener;

    public EventAdapter(Event[] eventList, EventClickListener clickListener) {
        this.eventList = eventList;
        this.clickListener = clickListener;
    }

    public Event[] getEventList() {
        return eventList;
    }

    public void setEventList(Event[] eventList) {
        this.eventList = eventList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_event, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        holder.onBind(eventList[position], position, clickListener);
    }

    @Override
    public int getItemCount() {
        if (eventList == null) return 0;
        return eventList.length;
    }

    class EventViewHolder extends RecyclerView.ViewHolder {
        private ImageView eventImg;
        private TextView titleTv;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            eventImg = itemView.findViewById(R.id.img_event);
            titleTv = itemView.findViewById(R.id.tv_title);
        }

        private void onBind(final Event event, final int position, final EventClickListener clickListener) {
            eventImg.setImageResource(event.getImgResource());
            titleTv.setText(event.getTitle());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onEventClick(event, position);
                }
            });
        }
    }
}
