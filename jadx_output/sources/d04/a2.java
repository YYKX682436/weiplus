package d04;

/* loaded from: classes8.dex */
public final class a2 implements d04.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView f225374a;

    public a2(com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView scanProductMaskDecorView) {
        this.f225374a = scanProductMaskDecorView;
    }

    public void a(int i17) {
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView scanProductMaskDecorView = this.f225374a;
        scanProductMaskDecorView.f159765i = i17;
        if (i17 == 0) {
            d04.w1 w1Var = scanProductMaskDecorView.f159762f;
        } else if (i17 == 2) {
            d04.w1 w1Var2 = scanProductMaskDecorView.f159762f;
        }
        d04.h hVar = scanProductMaskDecorView.f159764h;
        if (hVar != null) {
            hVar.a(i17);
        }
    }
}
