package com.example.testl.bookweb;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.testl.bookweb.models.Comment;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentViewHolder>{

    private Comment.List commentsList;

    public CommentAdapter() {
        commentsList = new Comment.List();
        commentsList.add(new Comment(0,"afg43r", "14.04.2015", "Alina", "Fajna książka"));
        commentsList.add(new Comment(1,"afer3r", "14.04.2015", "Marcin", "Lubię książki"));
        commentsList.add(new Comment(2,"ertyq43r", "14.04.2015", "Wojtek", "Książka ssie od początku do końca"));
        commentsList.add(new Comment(3,"aert3e", "14.04.2015", "Tadeusz", "Matematyka to moja pasja"));
        commentsList.add(new Comment(4,"aafsgh", "14.04.2015", "Izabela", "Nie lubię tej książki"));
        commentsList.add(new Comment(5,"gsdgs3", "14.04.2015", "Kuba", "Co to ma być??? Totalne dno! Autor przeliczył siły na zamiary. Szczerze nie polecam"));
        commentsList.add(new Comment(6,"lsdkjgs", "14.04.2015", "Ilona", "Czytałabym :)"));

    }

    @Override
    public CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_row, parent, false);
        CommentViewHolder commentViewHolder = new CommentViewHolder(view);
        return commentViewHolder;
    }

    @Override
    public void onBindViewHolder(CommentViewHolder holder, int position) {
        Comment comment = commentsList.get(position);
        holder.nameTextView.setText(comment.author);
        holder.dateTextView.setText(comment.date);
        holder.commentTextView.setText(comment.comment);
    }

    @Override
    public int getItemCount() {
        return commentsList.size();
    }



    public class CommentViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public TextView dateTextView;
        public TextView commentTextView;

        public CommentViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            commentTextView = itemView.findViewById(R.id.commentTextView);
        }
    }

}
