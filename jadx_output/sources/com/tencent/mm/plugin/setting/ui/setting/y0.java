package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class y0 implements r14.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161770a;

    public y0(com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f161770a = colorfulChatroomQRCodeUI;
    }

    @Override // r14.b
    public void a() {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI.f160124u;
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f161770a;
        db5.e1.K(colorfulChatroomQRCodeUI, true, colorfulChatroomQRCodeUI.getString(com.tencent.mm.R.string.i2g), colorfulChatroomQRCodeUI.getString(com.tencent.mm.R.string.i2h), colorfulChatroomQRCodeUI.getString(com.tencent.mm.R.string.i2i), colorfulChatroomQRCodeUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.setting.ui.setting.m0(colorfulChatroomQRCodeUI), null);
    }

    @Override // r14.b
    public void b() {
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI.U6(this.f161770a);
    }

    @Override // r14.b
    public void c(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = lp0.b.h0("qrcode_tmp").o() + "mmqrcode-" + java.lang.System.currentTimeMillis() + ".png";
        android.graphics.Bitmap V6 = this.f161770a.V6();
        com.tencent.mm.plugin.setting.ui.setting.x0 x0Var = new com.tencent.mm.plugin.setting.ui.setting.x0(callback, str);
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f161770a;
        colorfulChatroomQRCodeUI.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.setting.ui.setting.g1(V6, str, colorfulChatroomQRCodeUI, x0Var));
    }

    @Override // r14.b
    public int d() {
        return 99;
    }
}
