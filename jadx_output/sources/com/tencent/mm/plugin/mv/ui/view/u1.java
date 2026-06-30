package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class u1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151959d;

    public u1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView) {
        this.f151959d = musicMvCommentView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        rm3.a aVar;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        if (i17 < 0 && i17 >= wxRecyclerAdapter.getItemCount()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicMvCommentView", "invalid position:" + i17);
            return;
        }
        long j17 = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381649o;
        java.lang.String str = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381650p;
        if (str == null) {
            str = "";
        }
        if (0 == j17 || (aVar = this.f151959d.f151661g) == null) {
            return;
        }
        aVar.c(j17, str);
    }
}
