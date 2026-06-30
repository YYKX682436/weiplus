package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public abstract class v {
    public static final com.tencent.mm.ui.widget.MMNeat7extView a(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView;
        java.lang.Object tag = k3Var.itemView.getTag();
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.ao ? (com.tencent.mm.ui.chatting.viewitems.ao) tag : null;
        if (aoVar == null) {
            aoVar = null;
        }
        if (aoVar != null && (mMNeat7extView = aoVar.f203379b) != null) {
            return mMNeat7extView;
        }
        android.view.View findViewById = k3Var.itemView.findViewById(com.tencent.mm.R.id.bkl);
        if (findViewById == null || !(findViewById instanceof com.tencent.mm.ui.widget.MMNeat7extView)) {
            return null;
        }
        return (com.tencent.mm.ui.widget.MMNeat7extView) findViewById;
    }

    public static final com.tencent.mm.ui.chatting.view.w b(android.view.View view) {
        int width = view.getWidth() > 0 ? view.getWidth() : view.getMeasuredWidth();
        int height = view.getHeight() > 0 ? view.getHeight() : view.getMeasuredHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return new com.tencent.mm.ui.chatting.view.w(width, height, 0);
    }

    public static final void c(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.n2 animator) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(animator, "animator");
        recyclerView.post(new com.tencent.mm.ui.chatting.view.t(recyclerView, animator));
    }
}
