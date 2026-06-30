package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.b0 f137254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.d0 f137255e;

    public v(com.tencent.mm.plugin.flash.d0 d0Var, com.tencent.mm.plugin.flash.b0 b0Var) {
        this.f137255e = d0Var;
        this.f137254d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.d0 d0Var = this.f137255e;
        boolean a17 = com.tencent.mm.plugin.flash.d0.a(d0Var);
        if (!a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "reopen Camera");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            d0Var.getClass();
            g0Var.idkeyStat(917L, 39L, 1L, false);
            a17 = com.tencent.mm.plugin.flash.d0.a(d0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "isOpenCamera：%s", java.lang.Boolean.valueOf(a17));
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        d0Var.getClass();
        g0Var2.idkeyStat(917L, 38L, 1L, false);
        this.f137254d.a(java.lang.Boolean.valueOf(a17), d0Var);
    }
}
