package p14;

/* loaded from: classes4.dex */
public class o0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI f351240a;

    public o0(com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI) {
        this.f351240a = showQRCodeStep1UI;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI = this.f351240a;
        if (i17 == 0) {
            showQRCodeStep1UI.T6();
        } else {
            if (i17 != 1) {
                return;
            }
            showQRCodeStep1UI.getClass();
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(showQRCodeStep1UI, new p14.p0(showQRCodeStep1UI), new p14.q0(showQRCodeStep1UI));
        }
    }
}
