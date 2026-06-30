package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.s1 f151325d;

    public n1(com.tencent.mm.plugin.mv.ui.uic.s1 s1Var) {
        this.f151325d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = this.f151325d;
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R6 = s1Var.R6();
        if (R6 != null) {
            pm0.v.X(new com.tencent.mm.plugin.mv.ui.view.i3(R6, s1Var.f151421o, false));
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R62 = s1Var.R6();
        if (R62 != null) {
            R62.setVisibility(0);
        }
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView R63 = s1Var.R6();
        if (R63 != null) {
            R63.animate().cancel();
            R63.animate().alpha(1.0f).start();
        }
        r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(s1Var.getActivity(), 7, r45.bt4.class);
        java.lang.Integer valueOf = bt4Var != null ? java.lang.Integer.valueOf(bt4Var.f371049t + 1) : null;
        r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(s1Var.getActivity(), 7, r45.bt4.class);
        if (bt4Var2 != null) {
            bt4Var2.f371049t = valueOf.intValue();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        s1Var.f151425s = android.os.SystemClock.elapsedRealtime();
    }
}
