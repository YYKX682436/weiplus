package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161415d;

    public p0(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f161415d = colorfulChatroomQRCodeUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.STORAGE;
        d85.f0 f0Var = d85.f0.M;
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f161415d;
        if (((d85.d1) m0Var).Di(g0Var, f0Var, new com.tencent.mm.plugin.setting.ui.setting.o0(colorfulChatroomQRCodeUI))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ColorfulChatroomQRCodeUI", "business switch close ,return");
            return;
        }
        android.graphics.Bitmap V6 = colorfulChatroomQRCodeUI.V6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
        sb6.append(q75.c.d());
        sb6.append("mmqrcode");
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append(".png");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.setting.ui.setting.n0 n0Var = new com.tencent.mm.plugin.setting.ui.setting.n0(colorfulChatroomQRCodeUI, V6);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.setting.ui.setting.g1(V6, sb7, colorfulChatroomQRCodeUI, n0Var));
    }
}
