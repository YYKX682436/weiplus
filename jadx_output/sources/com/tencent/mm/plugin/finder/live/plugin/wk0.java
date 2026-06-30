package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class wk0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.yk0 f114954d;

    public wk0(com.tencent.mm.plugin.finder.live.plugin.yk0 yk0Var) {
        this.f114954d = yk0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.j7 j7Var = (mm2.j7) obj;
        if (j7Var == null || j7Var.a()) {
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.yk0 yk0Var = this.f114954d;
        if (!yk0Var.w1()) {
            com.tencent.mars.xlog.Log.i(yk0Var.v1(), "openSongListLocateInfo.observe - Plugin not available, skip");
            return;
        }
        if (!zl2.r4.f473950a.h2(yk0Var.S0())) {
            com.tencent.mars.xlog.Log.i(yk0Var.v1(), "openSongListLocateInfo.observe - songList closed");
            int i17 = ((mm2.m6) yk0Var.S0().a(mm2.m6.class)).f329248p ? com.tencent.mm.R.string.f491850ef3 : com.tencent.mm.R.string.p1n;
            android.view.ViewGroup viewGroup = yk0Var.f365323d;
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(i17));
            return;
        }
        com.tencent.mars.xlog.Log.i(yk0Var.v1(), "openSongListLocateInfo.observe - songName=" + j7Var.f329183a + ", uniqueAddId=" + j7Var.f329184b);
        if (dk2.ef.f233384g) {
            return;
        }
        yk0Var.x1();
    }
}
