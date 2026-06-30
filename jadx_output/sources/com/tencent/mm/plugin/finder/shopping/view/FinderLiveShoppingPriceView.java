package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingPriceView;", "Landroid/widget/RelativeLayout;", "Los5/w;", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "getSellPrice", "()Landroid/widget/TextView;", "sellPrice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "xt2/i5", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShoppingPriceView extends android.widget.RelativeLayout implements os5.w {

    /* renamed from: i, reason: collision with root package name */
    public static final float f126323i;

    /* renamed from: m, reason: collision with root package name */
    public static final float f126324m;

    /* renamed from: n, reason: collision with root package name */
    public static final float f126325n;

    /* renamed from: o, reason: collision with root package name */
    public static final xt2.i5 f126326o;

    /* renamed from: p, reason: collision with root package name */
    public static final xt2.i5 f126327p;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f126328d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f126329e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f126330f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f126331g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView sellPrice;

    static {
        float a17 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 17.0f);
        f126323i = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 15.0f);
        f126324m = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 14.0f);
        float a18 = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12.0f);
        f126325n = a18;
        f126326o = new xt2.i5(a17, a18, a18, a18, true, true, a18, true, i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a), false, false, false, 3584, null);
        f126327p = new xt2.i5(a18, 0.0f, 0.0f, 0.0f, false, false, 0.0f, false, i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a), false, false, false, 3584, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingPriceView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.azj, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486414l51);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l7g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.sellPrice = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dio);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f126328d = textView2;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qw6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f126331g = textView3;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.kme);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f126329e = textView4;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.l7h);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f126330f = textView5;
        com.tencent.mm.ui.fk.a(textView5);
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView3);
        hc2.o.a(textView, false);
        hc2.o.b(textView4);
        textView4.getPaint().setFlags(16);
    }

    public final xt2.i5 a(android.content.Context context, cm2.m0 item, float f17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, float f18) {
        float f19;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView finderLiveShoppingPriceView = new com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView(context);
        float f27 = f18 * 0.75f;
        xt2.i5 i5Var = new xt2.i5(f18, f27, f27, f27, z17, z18, f27, z19, f17, z27, z28, false, 2048, null);
        finderLiveShoppingPriceView.b(0, item, i5Var);
        finderLiveShoppingPriceView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        if (finderLiveShoppingPriceView.getMeasuredWidth() <= f17) {
            return i5Var;
        }
        if (z28) {
            item.f43368v.getString(1);
            return a(context, item, f17, z17, z18, z19, z27, false, f18);
        }
        if (z19) {
            item.f43368v.getString(1);
            return a(context, item, f17, z17, z18, false, z27, false, f18);
        }
        if (z17) {
            item.f43368v.getString(1);
            return a(context, item, f17, false, false, false, z27, false, f18);
        }
        float f28 = f126325n;
        if (f18 <= f28) {
            item.f43368v.getString(1);
            return new xt2.i5(f18, 0.0f, 0.0f, 0.0f, i5Var.f456795e, z18, 0.0f, i5Var.f456798h, f17, false, false, false, 2048, null);
        }
        float f29 = f126323i;
        if (f18 > f29) {
            item.f43368v.getString(1);
        } else {
            f29 = f126324m;
            if (f18 <= f29) {
                item.f43368v.getString(1);
                f19 = f28;
                return a(context, item, f17, false, false, false, z27, false, f19);
            }
            item.f43368v.getString(1);
        }
        f19 = f29;
        return a(context, item, f17, false, false, false, z27, false, f19);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r17, cm2.m0 r18, xt2.i5 r19) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.b(int, cm2.m0, xt2.i5):void");
    }

    public final android.widget.TextView getSellPrice() {
        return this.sellPrice;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingPriceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.azj, (android.view.ViewGroup) this, false);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(inflate, layoutParams);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486414l51);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l7g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.sellPrice = textView;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.dio);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f126328d = textView2;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.qw6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f126331g = textView3;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.kme);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
        this.f126329e = textView4;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.l7h);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        this.f126330f = textView5;
        com.tencent.mm.ui.fk.a(textView5);
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView3);
        hc2.o.a(textView, false);
        hc2.o.b(textView4);
        textView4.getPaint().setFlags(16);
    }
}
