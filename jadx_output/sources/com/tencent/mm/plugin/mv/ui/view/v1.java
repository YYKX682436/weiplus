package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class v1 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151966d;

    public v1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView) {
        this.f151966d = musicMvCommentView;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.os4 os4Var;
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        if (i17 < 0 && i17 >= wxRecyclerAdapter.getItemCount()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicMvCommentView", "invalid position:" + i17);
            return false;
        }
        long j17 = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381644g;
        java.lang.String str2 = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381646i;
        java.lang.String str3 = str2 == null ? "" : str2;
        r45.ls4 ls4Var = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381641d;
        java.lang.String str4 = (ls4Var == null || (os4Var = ls4Var.f379801e) == null || (str = os4Var.f382496d) == null) ? "" : str;
        boolean z17 = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381648n == 1;
        long j18 = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381649o;
        java.lang.String str5 = ((com.tencent.mm.plugin.mv.ui.view.m1) wxRecyclerAdapter.getData().get(i17)).f151898d.f151920a.f381650p;
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f151966d;
        musicMvCommentView.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(musicMvCommentView.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.mv.ui.view.q1(musicMvCommentView, z17);
        k0Var.f211881s = new com.tencent.mm.plugin.mv.ui.view.r1(str4, musicMvCommentView, valueOf, str5, j17, str3);
        k0Var.v();
        return true;
    }
}
