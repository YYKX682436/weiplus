package l94;

/* loaded from: classes4.dex */
public final class p extends l94.e {

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f317384h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f317385i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f317386j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context) {
        super("WsFoldAdTitleComponent", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        r45.gr0 gr0Var;
        java.lang.String str;
        r45.gr0 gr0Var2;
        r45.gr0 gr0Var3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e(h(), "the fold sns info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
            return;
        }
        android.widget.TextView textView = this.f317384h;
        java.lang.String str2 = "";
        if (textView != null) {
            java.lang.String str3 = b17.f372083s;
            if (str3 == null) {
                str3 = "";
            }
            textView.setText(str3);
        }
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (!kotlin.jvm.internal.o.b("zh_CN", f17) ? !(kotlin.jvm.internal.o.b("zh_HK", f17) || kotlin.jvm.internal.o.b("zh_TW", f17) ? (gr0Var = b17.f372082r) == null || (str = gr0Var.f375497i) == null : (gr0Var2 = b17.f372082r) == null || (str = gr0Var2.f375498m) == null) : !((gr0Var3 = b17.f372082r) == null || (str = gr0Var3.f375496h) == null)) {
            str2 = str;
        }
        if (str2.length() > 0) {
            android.widget.TextView textView2 = this.f317386j;
            if (textView2 != null) {
                textView2.setText(str2);
            }
        } else {
            android.widget.TextView textView3 = this.f317386j;
            if (textView3 != null) {
                textView3.setText("Ad");
            }
        }
        android.view.ViewGroup viewGroup = this.f317385i;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new l94.o(this, adInfo));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(f());
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -1;
            linearLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.height = -2;
            linearLayout.setLayoutParams(layoutParams2);
        }
        c44.a.j();
        linearLayout.setOrientation(0);
        linearLayout.setGravity(c44.a.f());
        android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
        linearLayout.addView(textView);
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams3.width = 0;
            textView.setLayoutParams(layoutParams3);
        }
        c44.a.o();
        if (textView.getLayoutParams() == null) {
            c44.a.o();
            textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
            layoutParams4.height = -2;
            textView.setLayoutParams(layoutParams4);
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.weight = 1;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 500, false);
            kotlin.jvm.internal.o.f(create, "create(...)");
            textView.setTypeface(create, 0);
        }
        textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.abw));
        textView.setTextSize(0, i65.a.j(textView.getContext()) * i65.a.a(textView.getContext(), 14.0f));
        this.f317384h = textView;
        int a17 = c44.b.a(4);
        android.view.ViewGroup.LayoutParams layoutParams7 = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams7 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams7 : null;
        if (marginLayoutParams != null) {
            n3.u.h(marginLayoutParams, a17);
        }
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout.addView(linearLayout2);
        this.f317385i = linearLayout2;
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams8 = linearLayout2.getLayoutParams();
            layoutParams8.width = -2;
            linearLayout2.setLayoutParams(layoutParams8);
        }
        c44.a.o();
        if (linearLayout2.getLayoutParams() == null) {
            c44.a.o();
            linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = linearLayout2.getLayoutParams();
            layoutParams9.height = -2;
            linearLayout2.setLayoutParams(layoutParams9);
        }
        linearLayout2.setGravity(c44.a.d());
        c44.a.j();
        linearLayout2.setOrientation(0);
        linearLayout2.setForeground(linearLayout2.getContext().getDrawable(com.tencent.mm.R.drawable.f482237da4));
        linearLayout2.setPadding(c44.b.a(4), c44.b.a(2), c44.b.a(4), c44.b.a(2));
        linearLayout2.setClipToOutline(true);
        linearLayout2.setOutlineProvider(new al5.z1(c44.b.a(4)));
        android.widget.TextView textView2 = new android.widget.TextView(linearLayout2.getContext());
        linearLayout2.addView(textView2);
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams10 = textView2.getLayoutParams();
            layoutParams10.width = -2;
            textView2.setLayoutParams(layoutParams10);
        }
        c44.a.o();
        if (textView2.getLayoutParams() == null) {
            c44.a.o();
            textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams11 = textView2.getLayoutParams();
            layoutParams11.height = -2;
            textView2.setLayoutParams(layoutParams11);
        }
        if (i17 >= 28) {
            android.graphics.Typeface create2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 400, false);
            kotlin.jvm.internal.o.f(create2, "create(...)");
            textView2.setTypeface(create2, 0);
        }
        textView2.setTextSize(0, i65.a.j(textView2.getContext()) * i65.a.a(textView2.getContext(), 12.0f));
        textView2.setTextColor(i65.a.d(textView2.getContext(), com.tencent.mm.R.color.f478520a84));
        this.f317386j = textView2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout2.getContext());
        linearLayout2.addView(weImageView);
        int a18 = c44.b.a(14);
        if (weImageView.getLayoutParams() == null) {
            c44.a.o();
            weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a18, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams12 = weImageView.getLayoutParams();
            layoutParams12.width = a18;
            weImageView.setLayoutParams(layoutParams12);
        }
        int a19 = c44.b.a(7);
        if (weImageView.getLayoutParams() == null) {
            c44.a.o();
            weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a19));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams13 = weImageView.getLayoutParams();
            layoutParams13.height = a19;
            weImageView.setLayoutParams(layoutParams13);
        }
        weImageView.setImageResource(com.tencent.mm.R.raw.icon_arrow_light);
        weImageView.setIconColor(i65.a.d(weImageView.getContext(), com.tencent.mm.R.color.f478520a84));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent");
        return linearLayout;
    }
}
