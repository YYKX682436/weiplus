package xt2;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f456926a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f456927b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f456928c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f456929d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f456930e;

    /* renamed from: f, reason: collision with root package name */
    public int f456931f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f456932g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f456933h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f456934i;

    /* renamed from: j, reason: collision with root package name */
    public int f456935j;

    /* renamed from: k, reason: collision with root package name */
    public int f456936k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f456937l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f456938m;

    public p0(android.content.Context context, android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f456926a = parent;
        this.f456927b = "FinderLiveShopDiscountView";
        this.f456928c = jz5.h.b(new xt2.l0(context, this));
        this.f456929d = jz5.h.b(new xt2.k0(this));
        this.f456930e = jz5.h.b(new xt2.j0(this));
        this.f456932g = jz5.h.b(new xt2.m0(this));
        this.f456933h = jz5.h.b(new xt2.n0(this));
        this.f456937l = jz5.h.b(new xt2.i0(this));
        this.f456938m = jz5.h.b(new xt2.o0(this));
    }

    public final void a(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mars.xlog.Log.i(this.f456927b, "attachToParent " + i17 + '}');
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv), 0);
        if (parent.indexOfChild(d()) == -1) {
            if (i17 <= parent.getChildCount()) {
                parent.addView(d(), i17, layoutParams);
            } else {
                parent.addView(d(), 0, layoutParams);
            }
        }
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i(this.f456927b, "detach " + this.f456935j + " source:" + i17);
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f456938m).getValue()).d();
        this.f456934i = null;
        this.f456931f = 0;
        this.f456935j = 0;
        this.f456936k = 0;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.view.View d17 = d();
        kotlin.jvm.internal.o.f(d17, "<get-discountView>(...)");
        r4Var.Q2(d17);
    }

    public final android.widget.TextView c() {
        return (android.widget.TextView) ((jz5.n) this.f456930e).getValue();
    }

    public final android.view.View d() {
        return (android.view.View) ((jz5.n) this.f456928c).getValue();
    }

    public final android.widget.TextView e() {
        return (android.widget.TextView) ((jz5.n) this.f456933h).getValue();
    }

    public final int f() {
        float f17;
        int i17;
        int measuredWidth = d().getMeasuredWidth();
        if (measuredWidth > 0) {
            return measuredWidth;
        }
        jz5.g gVar = this.f456929d;
        float desiredWidth = android.text.Layout.getDesiredWidth(((android.widget.TextView) ((jz5.n) gVar).getValue()).getText().toString(), ((android.widget.TextView) ((jz5.n) gVar).getValue()).getPaint());
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.TextView) ((jz5.n) gVar).getValue()).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        float desiredWidth2 = android.text.Layout.getDesiredWidth(c().getText().toString(), c().getPaint());
        android.view.ViewGroup.LayoutParams layoutParams2 = c().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
        float desiredWidth3 = android.text.Layout.getDesiredWidth(e().getText().toString(), e().getPaint());
        android.view.ViewGroup.LayoutParams layoutParams3 = e().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
        android.view.ViewGroup.LayoutParams layoutParams4 = ((android.view.View) ((jz5.n) this.f456932g).getValue()).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
        if (this.f456935j > 0) {
            f17 = desiredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + desiredWidth2 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + desiredWidth3 + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin + marginLayoutParams4.leftMargin;
            i17 = marginLayoutParams4.rightMargin;
        } else {
            f17 = desiredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + desiredWidth3 + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin + marginLayoutParams4.leftMargin;
            i17 = marginLayoutParams4.rightMargin;
        }
        return (int) (f17 + i17);
    }

    public final void g(java.lang.String str, int i17) {
        android.widget.TextView c17 = c();
        if (i17 > 0) {
            str = c().getContext().getResources().getString(com.tencent.mm.R.string.edr, java.lang.Integer.valueOf(i17), str);
        }
        c17.setText(str);
        if (this.f456931f <= 0) {
            float desiredWidth = android.text.Layout.getDesiredWidth(c().getText().toString(), c().getPaint());
            if (desiredWidth > 0.0f) {
                c().getLayoutParams().width = (int) (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv) + desiredWidth);
            }
            com.tencent.mars.xlog.Log.i(this.f456927b, hashCode() + " countDownTvWidth:" + this.f456931f + " to " + desiredWidth + '(' + c().getLayoutParams().width + ')');
            this.f456931f = (int) desiredWidth;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r11, r45.y64 r12, boolean r13, yz5.a r14) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.p0.h(java.lang.String, r45.y64, boolean, yz5.a):void");
    }
}
