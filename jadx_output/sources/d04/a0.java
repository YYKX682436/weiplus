package d04;

/* loaded from: classes13.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225372d;

    public a0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        this.f225372d = scanCodeMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225372d;
        scanCodeMaskView.setProductListBottomMarginDelta(scanCodeMaskView.getMyQrCodeButton().getHeight() - i65.a.b(scanCodeMaskView.getContext(), 64));
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeMaskView", "productListBottomMarginDelta:" + scanCodeMaskView.getProductListBottomMarginDelta());
        android.widget.ImageView imageView = scanCodeMaskView.H;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (imageView == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
        if (imageView == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = scanCodeMaskView.getMBottomExtraHeight();
            }
            layoutParams = layoutParams2;
        }
        imageView.setLayoutParams(layoutParams);
    }
}
