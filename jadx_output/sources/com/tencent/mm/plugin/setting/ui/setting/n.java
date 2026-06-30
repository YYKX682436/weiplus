package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.setting.ui.setting.n f161341d = new com.tencent.mm.plugin.setting.ui.setting.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_profile_qrcode_url_with_style_disable, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Setting.ColorSelfQRCodeGradientFgWhiteBgUIC", "enableQrCodeUrlWithStyle " + Ni);
        return java.lang.Boolean.valueOf(Ni == 1);
    }
}
