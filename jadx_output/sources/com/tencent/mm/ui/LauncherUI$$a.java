package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public final /* synthetic */ class LauncherUI$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = com.tencent.mm.ui.LauncherUI.f196826y;
        java.lang.String wi6 = ((com.tencent.mm.feature.performance.t4) ((ob0.k3) i95.n0.c(ob0.k3.class))).wi(1.0f);
        if (wi6 != null) {
            jx3.f.INSTANCE.d(24354, com.tencent.matrix.trace.core.AppMethodBeat.getVisibleScene(), "", 1111, bm5.f1.a(), com.tencent.mm.sdk.platformtools.z.f193109e, 0, 0, wi6, 0, "");
            com.tencent.mm.feature.performance.t4 t4Var = (com.tencent.mm.feature.performance.t4) ((ob0.k3) i95.n0.c(ob0.k3.class));
            com.tencent.matrix.trace.tracer.StackTracer stackTracer = t4Var.f67734d;
            if (stackTracer != null) {
                stackTracer.e();
                t4Var.f67734d = null;
            }
        }
    }
}
