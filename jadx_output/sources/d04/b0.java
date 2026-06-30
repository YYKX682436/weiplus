package d04;

/* loaded from: classes13.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225379d;

    public b0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        this.f225379d = scanCodeMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView.H1;
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225379d;
        if (scanCodeMaskView.isViewDestroy || (bitmap = scanCodeMaskView.f159686J) == null) {
            return;
        }
        kotlin.jvm.internal.o.d(bitmap);
        if (bitmap.isRecycled()) {
            return;
        }
        android.widget.ImageView imageView = scanCodeMaskView.C;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("frameImage");
            throw null;
        }
        imageView.setImageBitmap(scanCodeMaskView.f159686J);
        android.widget.ImageView imageView2 = scanCodeMaskView.C;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("frameImage");
            throw null;
        }
        imageView2.setVisibility(0);
        android.widget.ImageView imageView3 = scanCodeMaskView.C;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("frameImage");
            throw null;
        }
        imageView3.setAlpha(0.0f);
        android.widget.ImageView imageView4 = scanCodeMaskView.C;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("frameImage");
            throw null;
        }
        android.view.ViewPropertyAnimator animate = imageView4.animate();
        if (animate != null) {
            animate.cancel();
        }
        android.widget.ImageView imageView5 = scanCodeMaskView.C;
        if (imageView5 == null) {
            kotlin.jvm.internal.o.o("frameImage");
            throw null;
        }
        android.view.ViewPropertyAnimator animate2 = imageView5.animate();
        if (animate2 == null || (alpha = animate2.alpha(1.0f)) == null || (duration = alpha.setDuration(200L)) == null) {
            return;
        }
        duration.start();
    }
}
