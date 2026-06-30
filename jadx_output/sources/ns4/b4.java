package ns4;

/* loaded from: classes8.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f339441a;

    /* renamed from: b, reason: collision with root package name */
    public final pr4.e f339442b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f339443c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f339444d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f339445e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f339446f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f339447g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f339448h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f339449i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f339450j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f339451k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f339452l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.CheckBox f339453m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f339454n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f339455o;

    /* renamed from: p, reason: collision with root package name */
    public int f339456p;

    /* renamed from: q, reason: collision with root package name */
    public kotlin.coroutines.Continuation f339457q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f339458r;

    public b4(android.content.Context context, pr4.e parameter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parameter, "parameter");
        this.f339441a = context;
        this.f339442b = parameter;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context, 0, true, false);
        y1Var.E = new com.tencent.mm.ui.al(context);
        this.f339443c = y1Var;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.ddp, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cgr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f339444d = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.puq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f339445e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.pxf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f339446f = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f339447g = textView;
        os4.h.m(textView, 17);
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.nrk);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f339448h = textView2;
        os4.h.m(textView2, 14);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.pzl);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f339449i = findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.pzm);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f339450j = findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.krc);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f339451k = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.f482790o2);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f339452l = findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.btf);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f339453m = (android.widget.CheckBox) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.f482784nw);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById11;
        this.f339454n = textView3;
        os4.h.m(textView3, 14);
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.c_3);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f339455o = (android.widget.Button) findViewById12;
        y1Var.k(inflate);
        y1Var.o(new ns4.r3(this));
        a();
        android.view.View view = this.f339445e;
        if (view == null) {
            kotlin.jvm.internal.o.o("closeButton");
            throw null;
        }
        view.setOnClickListener(new ns4.s3(this));
        android.view.View view2 = this.f339446f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("infoButton");
            throw null;
        }
        view2.setOnClickListener(new ns4.u3(this));
        android.view.View view3 = this.f339449i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("pay_option_left_layout");
            throw null;
        }
        view3.setOnClickListener(new ns4.v3(this));
        android.view.View view4 = this.f339450j;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("pay_option_right_layout");
            throw null;
        }
        view4.setOnClickListener(new ns4.w3(this));
        android.widget.TextView textView4 = this.f339454n;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("agreement");
            throw null;
        }
        textView4.setOnClickListener(new ns4.x3(this));
        android.widget.Button button = this.f339455o;
        if (button == null) {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
        button.setOnClickListener(new ns4.y3(this));
        java.lang.String str = parameter.f357994h;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        js4.r.f301566b = str;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.LinearLayout linearLayout = this.f339444d;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(linearLayout, "tyt_vip_pay_panel");
        android.widget.LinearLayout linearLayout2 = this.f339444d;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar.rj(linearLayout2);
        android.widget.LinearLayout linearLayout3 = this.f339444d;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar.gk(linearLayout3, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f301566b)));
        android.widget.LinearLayout linearLayout4 = this.f339444d;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar.ik(linearLayout4, 32, 25955);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.Button button2 = this.f339455o;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
        cy1.a aVar2 = (cy1.a) rVar2;
        aVar2.pk(button2, "tyt_vip_pay_panel_open");
        android.widget.Button button3 = this.f339455o;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
        aVar2.gk(button3, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f301566b)));
        android.widget.Button button4 = this.f339455o;
        if (button4 == null) {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
        aVar2.Ai(button4, new ns4.z3(this));
        android.widget.Button button5 = this.f339455o;
        if (button5 != null) {
            aVar2.ik(button5, 8, 25955);
        } else {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
    }

    public final void a() {
        pr4.e eVar = this.f339442b;
        android.view.View view = eVar.f357993g;
        android.content.Context context = this.f339441a;
        boolean z17 = true;
        if (view != null && view.getParent() == null) {
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(view.getLayoutParams().width, view.getLayoutParams().height);
            layoutParams.bottomMargin = i65.a.b(context, 8);
            layoutParams.topMargin = i65.a.b(context, 8);
            layoutParams.gravity = 1;
            view.setLayoutParams(layoutParams);
            android.widget.LinearLayout linearLayout = this.f339444d;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("contentView");
                throw null;
            }
            android.widget.TextView textView = this.f339447g;
            if (textView == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            int indexOfChild = linearLayout.indexOfChild(textView);
            if (indexOfChild != -1) {
                android.widget.LinearLayout linearLayout2 = this.f339444d;
                if (linearLayout2 == null) {
                    kotlin.jvm.internal.o.o("contentView");
                    throw null;
                }
                linearLayout2.addView(view, indexOfChild);
            }
        }
        android.widget.TextView textView2 = this.f339447g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        textView2.setText(eVar.f357988b);
        java.lang.String str = eVar.f357989c;
        if (str == null || r26.n0.N(str)) {
            android.widget.TextView textView3 = this.f339448h;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("subtitle");
                throw null;
            }
            textView3.setVisibility(8);
            android.widget.TextView textView4 = this.f339447g;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = textView4.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((android.widget.LinearLayout.LayoutParams) layoutParams2).bottomMargin = i65.a.b(context, 16);
        } else {
            android.widget.TextView textView5 = this.f339448h;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("subtitle");
                throw null;
            }
            textView5.setVisibility(0);
            android.widget.TextView textView6 = this.f339448h;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("subtitle");
                throw null;
            }
            textView6.setText(str);
        }
        java.util.List list = eVar.f357990d;
        pr4.h hVar = (pr4.h) list.get(0);
        android.view.View view2 = this.f339449i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("pay_option_left_layout");
            throw null;
        }
        b(hVar, view2);
        boolean z18 = this.f339456p == 0;
        android.view.View view3 = this.f339449i;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("pay_option_left_layout");
            throw null;
        }
        c(z18, view3);
        pr4.h hVar2 = (pr4.h) list.get(1);
        android.view.View view4 = this.f339450j;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("pay_option_right_layout");
            throw null;
        }
        b(hVar2, view4);
        boolean z19 = 1 == this.f339456p;
        android.view.View view5 = this.f339450j;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("pay_option_right_layout");
            throw null;
        }
        c(z19, view5);
        android.widget.TextView textView7 = this.f339451k;
        if (textView7 == null) {
            kotlin.jvm.internal.o.o("pay_tips");
            throw null;
        }
        textView7.setText(((pr4.h) eVar.f357990d.get(this.f339456p)).f358007g);
        android.widget.TextView textView8 = this.f339454n;
        if (textView8 == null) {
            kotlin.jvm.internal.o.o("agreement");
            throw null;
        }
        os4.h.b(textView8, eVar.f357991e);
        if (this.f339456p != 0) {
            hVar = hVar2;
        }
        java.lang.String str2 = hVar.f358008h;
        if (str2 != null && !r26.n0.N(str2)) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        android.widget.Button button = this.f339455o;
        if (button != null) {
            button.setText(hVar.f358008h);
        } else {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
    }

    public final void b(pr4.h priceTier, android.view.View layout) {
        kotlin.jvm.internal.o.g(priceTier, "priceTier");
        kotlin.jvm.internal.o.g(layout, "layout");
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.pzp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = layout.findViewById(com.tencent.mm.R.id.q0w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        os4.h.m(textView, 14);
        os4.h.m(textView2, 32);
        textView.setText(priceTier.f358001a);
        textView2.setText(java.lang.Long.toString(priceTier.f358002b & io.flutter.embedding.android.KeyboardMap.kValueMask, 10));
        android.view.View findViewById3 = layout.findViewById(com.tencent.mm.R.id.pzi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = layout.findViewById(com.tencent.mm.R.id.pzn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        if (priceTier.f358005e) {
            textView3.setVisibility(0);
            textView3.post(new ns4.a4(textView3));
            android.view.View findViewById5 = findViewById3.findViewById(com.tencent.mm.R.id.kme);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            android.widget.TextView textView4 = (android.widget.TextView) findViewById5;
            os4.h.m(textView4, 16);
            textView4.setText(java.lang.Long.toString(priceTier.f358006f & io.flutter.embedding.android.KeyboardMap.kValueMask, 10));
        } else {
            textView3.setVisibility(8);
        }
        if (java.lang.Integer.compare(priceTier.f358006f ^ Integer.MIN_VALUE, Integer.MIN_VALUE) <= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel", "setPriceData", "(Lcom/tencent/mm/plugin/wallet/api/WCCoinSubscribePriceTier;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel", "setPriceData", "(Lcom/tencent/mm/plugin/wallet/api/WCCoinSubscribePriceTier;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel", "setPriceData", "(Lcom/tencent/mm/plugin/wallet/api/WCCoinSubscribePriceTier;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel", "setPriceData", "(Lcom/tencent/mm/plugin/wallet/api/WCCoinSubscribePriceTier;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById6 = findViewById3.findViewById(com.tencent.mm.R.id.kme);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView5 = (android.widget.TextView) findViewById6;
        os4.h.m(textView5, 16);
        textView5.setText(java.lang.Long.toString(priceTier.f358006f & io.flutter.embedding.android.KeyboardMap.kValueMask, 10));
    }

    public final void c(boolean z17, android.view.View view) {
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.pzp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.q0w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        android.content.Context context = this.f339441a;
        if (!z17) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
            gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), context.getColor(com.tencent.mm.R.color.aci));
            view.setBackground(gradientDrawable);
            textView.setTextColor(context.getColor(com.tencent.mm.R.color.t_));
            textView2.setTextColor(context.getColor(com.tencent.mm.R.color.t_));
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
        gradientDrawable2.setStroke(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), context.getColor(com.tencent.mm.R.color.f478502m));
        gradientDrawable2.setColor(context.getColor(com.tencent.mm.R.color.ach));
        view.setBackground(gradientDrawable2);
        textView.setTextColor(context.getColor(com.tencent.mm.R.color.FG_0));
        textView2.setTextColor(context.getColor(com.tencent.mm.R.color.FG_0));
    }
}
