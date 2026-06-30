package d04;

/* loaded from: classes3.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f225557d;

    public y0(com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView) {
        this.f225557d = scanInfoMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f225557d.requestLayout();
    }
}
