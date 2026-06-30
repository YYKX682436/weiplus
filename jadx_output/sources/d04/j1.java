package d04;

/* loaded from: classes13.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout f225445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout scanNewProductListLayout) {
        super(1);
        this.f225445d = scanNewProductListLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int closeStateTopMargin;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout scanNewProductListLayout = this.f225445d;
        if (intValue == 0) {
            d04.e1 productListCallBack = scanNewProductListLayout.getProductListCallBack();
            if (productListCallBack != null) {
                ((d04.n2) productListCallBack).a(6);
            }
        } else if (intValue == 1) {
            closeStateTopMargin = scanNewProductListLayout.getCloseStateTopMargin();
            scanNewProductListLayout.setRecyclerViewMarginTop(closeStateTopMargin - 0);
            d04.e1 productListCallBack2 = scanNewProductListLayout.getProductListCallBack();
            if (productListCallBack2 != null) {
                ((d04.n2) productListCallBack2).a(0);
            }
        }
        return jz5.f0.f302826a;
    }
}
