package p14;

/* loaded from: classes8.dex */
public class a implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI f351209a;

    public a(com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI getQRCodeInfoUI) {
        this.f351209a = getQRCodeInfoUI;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        java.lang.String str;
        com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI getQRCodeInfoUI = this.f351209a;
        if (sVar == null) {
            getQRCodeInfoUI.finish();
            return;
        }
        if (!gm0.j1.a() || gm0.m.r()) {
            ((com.tencent.mm.app.y7) f14.g.b()).u(new android.content.Intent(), getQRCodeInfoUI);
            getQRCodeInfoUI.finish();
            return;
        }
        java.lang.String dataString = getQRCodeInfoUI.getIntent().getDataString();
        int i17 = com.tencent.mm.plugin.setting.ui.qrcode.GetQRCodeInfoUI.f160090g;
        getQRCodeInfoUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(dataString)) {
            return;
        }
        if (dataString.startsWith("weixin://qr/")) {
            str = dataString.substring(12) + "@qr";
        } else {
            java.lang.String str2 = jd0.y1.f299130b;
            if (dataString.startsWith(str2)) {
                str = dataString.substring(str2.length()) + "@qr";
            } else {
                java.lang.String str3 = jd0.y1.f299129a;
                if (dataString.startsWith(str3)) {
                    str = dataString.substring(str3.length()) + "@qr";
                } else {
                    str = "";
                }
            }
        }
        gm0.j1.d().a(106, getQRCodeInfoUI);
        getQRCodeInfoUI.f160092f = new tg3.r1(str, 5);
        gm0.j1.d().g(getQRCodeInfoUI.f160092f);
    }
}
