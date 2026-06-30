package dt2;

/* loaded from: classes3.dex */
public final class d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f243164d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f243165e;

    /* renamed from: f, reason: collision with root package name */
    public final long f243166f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f243167g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f243168h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f243169i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f243170m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f243171n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, boolean z17, boolean z18, long j17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f243164d = z17;
        this.f243165e = z18;
        this.f243166f = j17;
    }

    public static final void a(dt2.d dVar, boolean z17, boolean z18, long j17) {
        java.lang.String str;
        if (dVar.f243164d) {
            return;
        }
        if (!z18) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f327280y1, z17 ? 4 : 5, 0L);
            return;
        }
        if (z17) {
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            str = "watch_live_new_pay_click";
        } else {
            ml2.o3[] o3VarArr2 = ml2.o3.f327773d;
            str = "watch_live_new_pay_cancel";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("object_id", pm0.v.u(j17));
        ml2.z0.f328330a.a(jSONObject);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((ml2.j0) zbVar).Wj(str, jSONObject2);
    }

    public final void b(boolean z17, java.lang.String licenseDescStr, java.lang.String licenseContentStr, yz5.a callback) {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        kotlin.jvm.internal.o.g(licenseDescStr, "licenseDescStr");
        kotlin.jvm.internal.o.g(licenseContentStr, "licenseContentStr");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.ap8, (android.view.ViewGroup) this, false);
        this.f243167g = inflate;
        android.widget.TextView textView3 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bfe) : null;
        this.f243168h = textView3;
        if (textView3 != null) {
            int L = r26.n0.L(licenseDescStr, licenseContentStr, 0, false, 6, null);
            int length = licenseContentStr.length() + L;
            android.text.SpannableString spannableString = new android.text.SpannableString(licenseDescStr);
            spannableString.setSpan(new dt2.c(this), L, length, 33);
            textView3.setHighlightColor(getContext().getResources().getColor(android.R.color.transparent));
            textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView3.setText(spannableString);
        }
        android.view.View view = this.f243167g;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.tencent.mm.R.id.bfc) : null;
        this.f243169i = button;
        if (button != null) {
            button.setOnClickListener(new dt2.a(this));
        }
        android.view.View view2 = this.f243167g;
        android.widget.Button button2 = view2 != null ? (android.widget.Button) view2.findViewById(com.tencent.mm.R.id.bfd) : null;
        this.f243170m = button2;
        if (button2 != null) {
            button2.setOnClickListener(new dt2.b(this, callback));
        }
        if (z17) {
            android.view.View view3 = this.f243167g;
            android.view.View findViewById2 = view3 != null ? view3.findViewById(com.tencent.mm.R.id.bfj) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                android.view.View view4 = findViewById2;
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = this.f243167g;
            if (view5 != null && (textView2 = (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.bfe)) != null) {
                textView2.setTextSize(1, 17.0f);
            }
            android.view.View view6 = this.f243167g;
            android.view.View findViewById3 = view6 != null ? view6.findViewById(com.tencent.mm.R.id.bff) : null;
            if (findViewById3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view7 = findViewById3;
                yj0.a.d(view7, arrayList2.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view8 = this.f243167g;
            android.view.View findViewById4 = view8 != null ? view8.findViewById(com.tencent.mm.R.id.bfg) : null;
            if (findViewById4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view9 = this.f243167g;
            findViewById = view9 != null ? view9.findViewById(com.tencent.mm.R.id.bfh) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view10 = this.f243167g;
            android.view.View findViewById5 = view10 != null ? view10.findViewById(com.tencent.mm.R.id.bfj) : null;
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                android.view.View view11 = findViewById5;
                yj0.a.d(view11, arrayList5.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view12 = this.f243167g;
            if (view12 != null && (textView = (android.widget.TextView) view12.findViewById(com.tencent.mm.R.id.bfe)) != null) {
                textView.setTextSize(1, 15.0f);
            }
            android.view.View view13 = this.f243167g;
            android.view.View findViewById6 = view13 != null ? view13.findViewById(com.tencent.mm.R.id.bff) : null;
            if (findViewById6 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                android.view.View view14 = findViewById6;
                yj0.a.d(view14, arrayList6.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view15 = this.f243167g;
            android.view.View findViewById7 = view15 != null ? view15.findViewById(com.tencent.mm.R.id.bfg) : null;
            if (findViewById7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                android.view.View view16 = findViewById7;
                yj0.a.d(view16, arrayList7.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view17 = this.f243167g;
            findViewById = view17 != null ? view17.findViewById(com.tencent.mm.R.id.bfh) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                android.view.View view18 = findViewById;
                yj0.a.d(view18, arrayList8.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view18, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget", "initView", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        y1Var.k(this.f243167g);
        y1Var.B.setBackgroundResource(com.tencent.mm.R.drawable.b8p);
        y1Var.s();
        this.f243171n = y1Var;
    }

    public final com.tencent.mm.ui.widget.dialog.y1 getBottomSheet() {
        return this.f243171n;
    }

    public final android.widget.Button getCancelBtn() {
        return this.f243169i;
    }

    public final android.widget.Button getConfirmBtn() {
        return this.f243170m;
    }

    public final android.widget.TextView getLicenseDesc() {
        return this.f243168h;
    }

    public final long getObjId() {
        return this.f243166f;
    }

    public final android.view.View getRoot() {
        return this.f243167g;
    }

    public final void setBottomSheet(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f243171n = y1Var;
    }

    public final void setCancelBtn(android.widget.Button button) {
        this.f243169i = button;
    }

    public final void setConfirmBtn(android.widget.Button button) {
        this.f243170m = button;
    }

    public final void setLicenseDesc(android.widget.TextView textView) {
        this.f243168h = textView;
    }

    public final void setRoot(android.view.View view) {
        this.f243167g = view;
    }
}
