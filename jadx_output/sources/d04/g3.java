package d04;

/* loaded from: classes14.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView f225422d;

    public g3(com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView) {
        this.f225422d = scanSharedMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView.G;
        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f225422d;
        scanSharedMaskView.i();
        android.view.TextureView textureView = scanSharedMaskView.f159797q;
        android.graphics.Bitmap bitmap = textureView != null ? textureView.getBitmap() : null;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanSharedMaskView", "updateBackgroundBlurView get bitmap failed");
        } else {
            new e04.h3(new kotlin.jvm.internal.h0(), bitmap, new d04.f3(scanSharedMaskView)).invoke();
        }
    }
}
