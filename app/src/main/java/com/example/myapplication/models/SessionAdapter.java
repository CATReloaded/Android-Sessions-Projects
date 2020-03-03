package com.example.myapplication.models;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.SessionViewHolder> {
    private Session[] sessions;

    public SessionAdapter(Session[] sessions) {
        this.sessions = sessions;
    }

    @NonNull
    @Override
    public SessionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_session, parent, false);
        return new SessionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SessionViewHolder holder, int position) {
        holder.onBind(sessions[position]);
    }

    @Override
    public int getItemCount() {
        if (sessions == null) return 0;
        return sessions.length;
    }

    class SessionViewHolder extends RecyclerView.ViewHolder {
        ImageView imgHeader, imgInstructor;
        TextView nameTv, titleTv, descriptionTv;

        public SessionViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHeader = itemView.findViewById(R.id.img_header);
            imgInstructor = itemView.findViewById(R.id.img_instructor);
            nameTv = itemView.findViewById(R.id.tv_name);
            titleTv = itemView.findViewById(R.id.tv_title);
            descriptionTv = itemView.findViewById(R.id.tv_description);
        }

        public void onBind(Session session) {
            imgHeader.setImageResource(session.getResources()[0]);
            imgInstructor.setImageResource(session.getInstructor().getImgResource());
            titleTv.setText(session.getTitle());
            nameTv.setText(session.getInstructor().getName());
            descriptionTv.setText(session.getInstructor().getDetails());
        }
    }
}
