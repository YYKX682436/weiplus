package p14;

/* loaded from: classes5.dex */
public final class r implements com.tencent.mm.plugin.setting.ui.setting.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView f351245a;

    public r(com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView) {
        this.f351245a = selfQrCodeView;
    }

    public void a() {
        android.view.ViewGroup qrContainer;
        android.widget.LinearLayout buttonLayout;
        android.view.ViewGroup qrCodeCard;
        android.view.ViewGroup qrCodeCard2;
        android.view.ViewGroup qrCodeFailedContainer;
        wd0.u1 u1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfQrCodeView", "onLoadQRCodeSuccess");
        com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView = this.f351245a;
        selfQrCodeView.f160094e = true;
        qrContainer = selfQrCodeView.getQrContainer();
        qrContainer.setVisibility(0);
        buttonLayout = selfQrCodeView.getButtonLayout();
        buttonLayout.setVisibility(0);
        qrCodeCard = selfQrCodeView.getQrCodeCard();
        qrCodeCard.setVisibility(0);
        qrCodeCard2 = selfQrCodeView.getQrCodeCard();
        qrCodeCard2.setBackgroundResource(com.tencent.mm.R.drawable.d8m);
        qrCodeFailedContainer = selfQrCodeView.getQrCodeFailedContainer();
        qrCodeFailedContainer.setVisibility(8);
        if (!selfQrCodeView.f160094e || !selfQrCodeView.f160093d || selfQrCodeView.f160095f || (u1Var = selfQrCodeView.D) == null) {
            return;
        }
        com.tencent.mm.plugin.scanner.model.h2.F(kd0.g3.f306643e, ((b04.c) u1Var).f16881a.T6());
    }
}
