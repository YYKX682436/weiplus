package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class f3 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151827d;

    public f3(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        this.f151827d = musicMvLyricView;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
        if (i17 < 0 && i17 >= wxRecyclerAdapter.getItemCount()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicMvCommentView", "invalid position:" + i17);
            return;
        }
        long j17 = ((com.tencent.mm.plugin.mv.ui.view.w2) wxRecyclerAdapter.getData().get(i17)).f151979d.f151967d;
        int duration = kl3.t.g().a().getDuration();
        if (j17 >= duration) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicMvCommentView", "invalid time, position:" + i17 + ", currentPosTime:" + j17 + ", duration:" + duration);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "onItemClick position:" + i17);
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView = this.f151827d;
        musicMvLyricView.f151696v = true;
        musicMvLyricView.f();
        musicMvLyricView.setShowLyricPrelude(false);
        musicMvLyricView.c(musicMvLyricView.f151695u, i17);
        musicMvLyricView.f151700z = true;
        com.tencent.mm.plugin.mv.ui.view.z2 eventListener = musicMvLyricView.getEventListener();
        if (eventListener != null) {
            com.tencent.mm.plugin.mv.ui.uic.j1 j1Var = (com.tencent.mm.plugin.mv.ui.uic.j1) eventListener;
            int i18 = (int) ((com.tencent.mm.plugin.mv.ui.view.w2) wxRecyclerAdapter.getData().get(i17)).f151979d.f151967d;
            b21.m.h(i18);
            if (b21.m.c()) {
                b21.m.g();
            } else {
                b21.r b17 = b21.m.b();
                if (b17 != null) {
                    b17.D = i18;
                }
                kl3.t.g().d(b17);
            }
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(j1Var.f151215b, 7, r45.bt4.class);
            if (bt4Var != null) {
                bt4Var.f371050u = 1;
            }
            com.tencent.mm.plugin.mv.ui.uic.s1.Q6(j1Var.f151214a, 51);
        }
    }
}
