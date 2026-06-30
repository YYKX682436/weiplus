package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.i f161122d = new com.tencent.mm.plugin.setting.ui.setting.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        v24.g gVar = v24.g.f432918a;
        boolean z18 = false;
        if (com.tencent.mm.sdk.platformtools.o4.M("ColorfulQRConfig").getBoolean("focusDisable", false)) {
            z17 = false;
        } else {
            z17 = !(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_colorful_qrcode_disable_locally_generated, 0) == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ColorfulQRConfig", "canUseQRCodeLocallyGenerated: " + z17);
        }
        if (z17 && com.tencent.mm.sdk.platformtools.o4.M("LocalGenFinishSuccess").getBoolean("LocalGenFinishSuccess".concat(gVar.a()), true)) {
            z18 = true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseColorfulSelfQRCodeUIC", "init useLocalGenQR: " + valueOf.booleanValue());
        return valueOf;
    }
}
