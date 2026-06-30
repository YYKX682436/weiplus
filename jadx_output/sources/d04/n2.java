package d04;

/* loaded from: classes8.dex */
public final class n2 implements d04.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView f225472a;

    public n2(com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView) {
        this.f225472a = scanProductNewMaskDecorView;
    }

    public void a(int i17) {
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView scanProductNewMaskDecorView = this.f225472a;
        scanProductNewMaskDecorView.f159782v = i17;
        if (i17 == 0) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.f(scanProductNewMaskDecorView).getClass();
        } else if (i17 == 2) {
            com.tencent.mm.plugin.scanner.ui.widget.ScanProductNewMaskDecorView.f(scanProductNewMaskDecorView).getClass();
        }
        d04.h hVar = scanProductNewMaskDecorView.f159780t;
        if (hVar != null) {
            hVar.a(i17);
        }
    }
}
