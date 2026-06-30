package com.tencent.mm.plugin.scanner;

@j95.b
/* loaded from: classes12.dex */
public class u0 extends i95.w implements com.tencent.mm.plugin.scanner.a0 {
    public java.lang.String Ai(java.lang.String str) {
        com.tencent.mm.plugin.scanner.m1.Ai().Ri();
        return com.tencent.mm.plugin.scanner.m1.Ai().Ni() + java.lang.String.format("%s_%d.%s", "tmp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginScanner", "PluginScanner onAccountInitialized");
        e04.f2 f2Var = e04.f2.f245925a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        e04.f2.f245926b = com.tencent.mm.sdk.platformtools.o4.M("ScanDebug");
        e04.f2.f();
        e04.r1 r1Var = e04.t1.f246095c;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCameraThreadPoolManager", "setScanTaskExecutor " + r1Var.a());
        if (r1Var.a()) {
            rt5.c.f399546a = new e04.o1();
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.g(context2, "context");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Bi(new com.tencent.mm.plugin.scanner.model.u0(context2));
        q25.b.b(new e04.i2(), "//scan");
    }

    public java.lang.String wi(java.lang.String str) {
        com.tencent.mm.plugin.scanner.m1.Ai().Ri();
        return com.tencent.mm.plugin.scanner.m1.Ai().Ni() + java.lang.String.format("%s_%d.%s", "capture", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str);
    }
}
