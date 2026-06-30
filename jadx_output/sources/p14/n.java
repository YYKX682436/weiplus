package p14;

/* loaded from: classes5.dex */
public final class n implements x14.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView f351237a;

    public n(com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView) {
        this.f351237a = selfQrCodeView;
    }

    public final void a(int i17, int i18) {
        int qrCodeImagePadding;
        int qrCodeImagePadding2;
        int qrCodeImagePadding3;
        int qrCodeImageFixedSize;
        int qrCodeImagePadding4;
        int qrCodeImageFixedSize2;
        android.widget.ImageView qrImgView;
        android.widget.LinearLayout disableDescRoot;
        com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView = this.f351237a;
        selfQrCodeView.getQrCodeImagePadding();
        qrCodeImagePadding = selfQrCodeView.getQrCodeImagePadding();
        if (i17 > qrCodeImagePadding) {
            qrCodeImagePadding2 = selfQrCodeView.getQrCodeImagePadding();
            if (i18 > qrCodeImagePadding2) {
                qrCodeImagePadding3 = selfQrCodeView.getQrCodeImagePadding();
                int i19 = i17 - qrCodeImagePadding3;
                qrCodeImageFixedSize = selfQrCodeView.getQrCodeImageFixedSize();
                int min = java.lang.Math.min(i19, qrCodeImageFixedSize);
                qrCodeImagePadding4 = selfQrCodeView.getQrCodeImagePadding();
                int i27 = i18 - qrCodeImagePadding4;
                qrCodeImageFixedSize2 = selfQrCodeView.getQrCodeImageFixedSize();
                int min2 = java.lang.Math.min(i27, qrCodeImageFixedSize2);
                qrImgView = selfQrCodeView.getQrImgView();
                com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView.l(selfQrCodeView, qrImgView, min, java.lang.Integer.valueOf(min2));
                disableDescRoot = selfQrCodeView.getDisableDescRoot();
                com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView.l(selfQrCodeView, disableDescRoot, min, java.lang.Integer.valueOf(min2));
            }
        }
    }
}
