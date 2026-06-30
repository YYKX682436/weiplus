package d04;

/* loaded from: classes13.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout f225471d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout) {
        super(1);
        this.f225471d = scanProductListLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        d04.l1 productListCallBack;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout = this.f225471d;
        if (intValue == 0) {
            d04.l1 productListCallBack2 = scanProductListLayout.getProductListCallBack();
            if (productListCallBack2 != null) {
                ((d04.a2) productListCallBack2).a(4);
            }
        } else if (intValue == 1 && (productListCallBack = scanProductListLayout.getProductListCallBack()) != null) {
            ((d04.a2) productListCallBack).a(1);
        }
        return jz5.f0.f302826a;
    }
}
