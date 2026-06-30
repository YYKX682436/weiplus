package ha0;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.app.a3 {
    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class);
        i1Var.getClass();
        com.tencent.mars.xlog.Log.i(i1Var.f150445d, "onAppBackground, activity:%s", activity);
        com.tencent.mm.plugin.multitask.w0 w0Var = com.tencent.mm.plugin.multitask.i1.f150443w;
        if (w0Var != null) {
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) w0Var).e7(com.tencent.mm.app.w.INSTANCE.f53889n);
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.multitask.i1 i1Var = (com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class);
        i1Var.getClass();
        com.tencent.mars.xlog.Log.i(i1Var.f150445d, "onAppForeground, activity:%s", activity);
        if (com.tencent.mm.app.w.INSTANCE.f53889n && gm0.j1.a()) {
            boolean V0 = com.tencent.mm.sdk.platformtools.t8.V0(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i(i1Var.f150445d, "onAppForeground isTopApplication: %b", java.lang.Boolean.valueOf(V0));
            if (V0) {
                com.tencent.mm.plugin.multitask.w0 w0Var = com.tencent.mm.plugin.multitask.i1.f150443w;
                if (w0Var != null) {
                    ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) w0Var).e7(true);
                }
                i1Var.oj();
            }
        }
    }
}
