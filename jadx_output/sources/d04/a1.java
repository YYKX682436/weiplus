package d04;

/* loaded from: classes3.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f225373d;

    public a1(com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView) {
        this.f225373d = scanInfoMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f225373d.requestLayout();
    }
}
