package com.tencent.mm.plugin.finder.widget.product;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/product/ProductCardSubPriceView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ty2/p", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ProductCardSubPriceView extends android.widget.RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final float f136949m = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 17.0f);

    /* renamed from: n, reason: collision with root package name */
    public static final float f136950n;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f136951d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f136952e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f136953f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f136954g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f136955h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f136956i;

    static {
        i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 15.0f);
        i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 14.0f);
        f136950n = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCardSubPriceView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.edl, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486414l51);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f136951d = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.utj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f136952e = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.l7g);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f136955h = textView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486728v05);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f136954g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.dio);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f136953f = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.vhs);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f136956i = (android.widget.TextView) findViewById6;
        ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).getClass();
        hc2.o.a(textView, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ty2.p r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView.a(ty2.p, java.lang.String):void");
    }

    public final ty2.p b(com.tencent.mm.plugin.finder.widget.product.ProductCardSubPriceView productCardSubPriceView, ty2.p pVar) {
        productCardSubPriceView.a(pVar, "");
        productCardSubPriceView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        if (productCardSubPriceView.f136952e.getMeasuredWidth() + productCardSubPriceView.f136955h.getMeasuredWidth() + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8) <= pVar.f423101d) {
            return pVar;
        }
        bw5.q5 q5Var = pVar.f423098a;
        q5Var.getTitle();
        if (pVar.f423102e) {
            q5Var.getTitle();
            return b(productCardSubPriceView, ty2.p.a(pVar, null, 0.0f, 0.0f, 0, false, false, false, 111, null));
        }
        if (pVar.f423103f) {
            q5Var.getTitle();
            return b(productCardSubPriceView, ty2.p.a(pVar, null, 0.0f, 0.0f, 0, false, false, false, 95, null));
        }
        if (!pVar.f423104g) {
            return pVar;
        }
        q5Var.getTitle();
        return b(productCardSubPriceView, ty2.p.a(pVar, null, 0.0f, 0.0f, 0, false, false, false, 63, null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductCardSubPriceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.edl, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486414l51);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f136951d = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.utj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f136952e = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.l7g);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f136955h = textView;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f486728v05);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f136954g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.dio);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f136953f = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.vhs);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f136956i = (android.widget.TextView) findViewById6;
        ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).getClass();
        hc2.o.a(textView, false);
    }
}
