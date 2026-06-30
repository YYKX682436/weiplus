package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f125382d;

    public u1(int i17) {
        this.f125382d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.report.v1.f125399g;
        int i17 = this.f125382d;
        com.tencent.mm.plugin.finder.report.r1 r1Var = (com.tencent.mm.plugin.finder.report.r1) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (r1Var == null) {
            r1Var = com.tencent.mm.plugin.finder.report.v1.f125393a.e(i17);
        }
        boolean z17 = false;
        if (r1Var != null && r1Var.f125297d > 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "reportViewPagerFirsFrameTime: tabType=" + i17 + " viewPagerFirstFrameCost=" + (c01.id.c() - r1Var.f125297d) + "ms");
            r1Var.f125316m0 = c01.id.c() - r1Var.f125297d;
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.e("Finder.FinderLoadingTimeReporter", "reportViewPagerFirsFrameTime: report failed, tabType=" + i17);
    }
}
