package d04;

/* loaded from: classes13.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f225545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225546e;

    public x(int i17, com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        this.f225545d = i17;
        this.f225546e = scanCodeMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f225545d;
        if (i17 < 2) {
            int i18 = com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView.H1;
            com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225546e;
            scanCodeMaskView.getClass();
            scanCodeMaskView.G(1.0f, 0.8f, scanCodeMaskView.f159689p1, new d04.v(scanCodeMaskView, new d04.y(i17 + 1, scanCodeMaskView)));
        }
    }
}
