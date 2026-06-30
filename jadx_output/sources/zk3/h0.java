package zk3;

/* loaded from: classes8.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17, int i18) {
        float f17;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.T = rk3.e.P;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.F = i17;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.G = i18;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.D = java.lang.Math.min(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.F, com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.G);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.E = java.lang.Math.max(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.F, com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.G);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.W = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 59) / com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.D;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.H = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.I = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 14);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.f150590J = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.V = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 44);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.U = com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 32) - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.H;
        int b17 = a06.d.b(((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.D - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.T) - (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.I * 2)) / 2.0f);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K = b17;
        int i19 = b17 - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.H;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.P = i19;
        float f18 = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Z;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Q = a06.d.b(i19 * f18);
        float a17 = r7 + com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.H + com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.U + (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.V * com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.X) + com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        int i27 = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K;
        if (i27 != 0) {
            f17 = a17 / i27;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTask.MultiTaskUIC", "initMultiTaskViewParams itemWidth is 0");
            f17 = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Y;
        }
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Y = f17;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.L = a06.d.b(a17);
        int b18 = a06.d.b(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K * 1.5f);
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.M = b18;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.N = a06.d.b(b18 * com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Y);
        int i28 = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.M - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.H;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.R = i28;
        com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.S = a06.d.b(i28 * f18);
        a06.d.a(((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.E - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.N) - (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.H * 6)) / 2.0d);
        a06.d.a((((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.D - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.T) - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.M) / 2.0d) - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.I);
        a06.d.a(((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.E - com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.L) - (com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.H * 8)) / 2.0d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTask.MultiTaskUIC", "initMultiTaskViewParams width:" + com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.K + " height:" + com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.L + " oneItemContentWidth:" + com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.M + " oneItemContentHeight:" + com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.N);
    }
}
