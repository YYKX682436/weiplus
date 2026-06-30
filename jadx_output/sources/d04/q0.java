package d04;

/* loaded from: classes13.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225490d;

    public q0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f225490d = scanCodeProductMergeMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225490d;
        d04.j jVar = scanCodeProductMergeMaskView.N1;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (jVar == null) {
            kotlin.jvm.internal.o.o("scanProductListView");
            throw null;
        }
        jVar.c(scanCodeProductMergeMaskView.getMBottomExtraHeight());
        android.widget.ImageView imageView = scanCodeProductMergeMaskView.K1;
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
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = scanCodeProductMergeMaskView.getMBottomExtraHeight();
            }
            layoutParams = layoutParams2;
        }
        imageView.setLayoutParams(layoutParams);
    }
}
