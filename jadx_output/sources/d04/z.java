package d04;

/* loaded from: classes13.dex */
public final class z implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225568d;

    public z(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView) {
        this.f225568d = scanCodeMaskView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView.H1;
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225568d;
        scanCodeMaskView.getClass();
        scanCodeMaskView.G(1.0f, 0.8f, scanCodeMaskView.f159689p1, new d04.v(scanCodeMaskView, new d04.y(1, scanCodeMaskView)));
        return true;
    }
}
