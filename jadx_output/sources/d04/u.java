package d04;

/* loaded from: classes13.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d04.y f225512e;

    public u(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView, d04.y yVar) {
        this.f225511d = scanCodeMaskView;
        this.f225512e = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225511d;
        scanCodeMaskView.G(0.8f, 1.0f, scanCodeMaskView.f159692x1, this.f225512e);
    }
}
