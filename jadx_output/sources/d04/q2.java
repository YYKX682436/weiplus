package d04;

/* loaded from: classes8.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f225492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView) {
        super(0);
        this.f225492d = scanProductNewMaskDecorView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView = this.f225492d;
        com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView scanProductDetectRectView = new com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView(scanProductNewMaskDecorView.getContext());
        scanProductNewMaskDecorView.addView(scanProductDetectRectView);
        return scanProductDetectRectView;
    }
}
