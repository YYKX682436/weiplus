package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.i0 f161718d;

    public x(com.tencent.mm.plugin.setting.ui.setting.i0 i0Var) {
        this.f161718d = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, d85.f0.M, new com.tencent.mm.plugin.setting.ui.setting.w(this.f161718d))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "business switch close ,return");
            return;
        }
        android.graphics.Bitmap Q6 = this.f161718d.Q6();
        com.tencent.mm.plugin.setting.ui.setting.i0 i0Var = this.f161718d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        sb6.append(q75.c.d());
        sb6.append("mmqrcode");
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.setting.ui.setting.v vVar = new com.tencent.mm.plugin.setting.ui.setting.v(this.f161718d, Q6);
        i0Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.setting.ui.setting.f0(Q6, sb7, i0Var, vVar));
    }
}
