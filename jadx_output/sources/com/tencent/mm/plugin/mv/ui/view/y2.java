package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class y2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151994e;

    public y2(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        this.f151994e = musicMvLyricView;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c4z;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.mv.ui.view.w2 item = (com.tencent.mm.plugin.mv.ui.view.w2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.j7p);
        com.tencent.mm.plugin.mv.ui.view.v2 v2Var = item.f151979d;
        if (textView != null) {
            textView.setText(v2Var.f151968e);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.j7p);
        if (textView2 != null) {
            textView2.setContentDescription(v2Var.f151968e);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.by8);
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView = this.f151994e;
        p17.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.x2(musicMvLyricView));
        com.tencent.mm.ui.bk.q0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.j7p)).getPaint());
        if (v2Var.f151969f) {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.j7p);
            if (textView3 != null) {
                textView3.setTextColor(musicMvLyricView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                return;
            }
            return;
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.j7p);
        if (textView4 != null) {
            textView4.setTextColor(musicMvLyricView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
