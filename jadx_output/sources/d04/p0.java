package d04;

/* loaded from: classes13.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225483d;

    public p0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView) {
        this.f225483d = scanCodeProductMergeMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = this.f225483d.Z1;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
    }
}
