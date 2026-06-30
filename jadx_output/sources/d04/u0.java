package d04;

/* loaded from: classes13.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView f225513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f225514e;

    public u0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, android.graphics.Bitmap bitmap) {
        this.f225513d = scanCodeProductMergeMaskView;
        this.f225514e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bz3.l lVar = bz3.l.f36802d;
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f225513d;
        scanCodeProductMergeMaskView.S1 = true;
        scanCodeProductMergeMaskView.T1 = true;
        scanCodeProductMergeMaskView.L(this.f225514e);
    }
}
