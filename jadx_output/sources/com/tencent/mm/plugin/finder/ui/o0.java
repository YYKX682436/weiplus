package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129564d;

    public o0(java.lang.String str) {
        this.f129564d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(qc0.e1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) c17)).Ai(this.f129564d, true);
        if (Ai != null && Ai.f361373k == -1) {
            return;
        }
        com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker multiMediaVideoChecker = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a;
        if (kz5.c0.i(0, 12, 35, 54, 55, 69, 70, 71, 72, 72, 95, 96, 101, 102, 107, 108, 129, 130, 133, 134).contains(java.lang.Integer.valueOf(Ai != null ? Ai.f361373k : 0))) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select invalid pixelFormat video:");
        sb6.append(Ai != null ? java.lang.Integer.valueOf(Ai.f361373k) : null);
        com.tencent.mars.xlog.Log.i("Finder.AlbumUI", sb6.toString());
        uo4.a aVar = uo4.a.f429674a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1371L, 127L, 1L);
    }
}
