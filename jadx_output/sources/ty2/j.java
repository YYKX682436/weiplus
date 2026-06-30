package ty2;

/* loaded from: classes9.dex */
public final class j extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView f423072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f423108h, config);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(config, "config");
        this.f423072d = new com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView(context);
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        kotlin.jvm.internal.o.g(item, "item");
        ty2.z zVar = this.f423060c;
        ty2.c cVar = zVar.f423131f;
        ty2.i iVar = cVar instanceof ty2.i ? (ty2.i) cVar : null;
        if (iVar == null) {
            iVar = new ty2.i(null, true, true, true);
        }
        int i17 = zVar.f423130e;
        java.lang.String source = a();
        boolean z17 = iVar.f423069b;
        boolean z18 = iVar.f423070c;
        boolean z19 = iVar.f423071d;
        com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView productCardSubPriceView = this.f423072d;
        productCardSubPriceView.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        android.content.Context context = productCardSubPriceView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView productCardSubPriceView2 = new com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView(context);
        java.lang.Float f17 = iVar.f423068a;
        productCardSubPriceView.a(productCardSubPriceView.b(productCardSubPriceView2, new ty2.p(item, f17 != null ? f17.floatValue() : com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView.f136949m, com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView.f136950n, i17, z17, z18, z19)), source);
        return productCardSubPriceView;
    }
}
