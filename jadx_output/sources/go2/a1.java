package go2;

/* loaded from: classes8.dex */
public final class a1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f273947d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f273948e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f273949f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f273950g;

    /* renamed from: h, reason: collision with root package name */
    public long f273951h;

    /* renamed from: i, reason: collision with root package name */
    public final int f273952i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f273953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f273947d = true;
        this.f273952i = 2000;
    }

    public static final void O6(go2.a1 a1Var, android.content.Context context) {
        a1Var.getClass();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null || mMActivity.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED || mMActivity.mo133getLifecycle().b() == androidx.lifecycle.n.RESUMED || mMActivity.isFinishing() || ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Zi(mMActivity) || !((com.tencent.mm.plugin.finder.service.l3) i95.n0.c(com.tencent.mm.plugin.finder.service.l3.class)).Di(mMActivity)) {
            return;
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).Yj(mMActivity, null);
    }

    public final void P6(android.content.Context context, java.lang.String str, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pm0.v.T(new ho2.c(((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), str, 0, 4, null).l(), new go2.f0(this, str, context, z17, z18)).f((com.tencent.mm.plugin.finder.ui.MMFinderUI) context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(1:(2:11|12)(2:14|15))(2:16|17))(4:18|19|20|21))(2:58|(12:60|(1:89)(1:65)|(1:67)(1:88)|68|69|70|71|72|73|74|75|(1:77)(1:78))(2:90|91))|22|23|24|(2:26|27)(2:28|(5:30|(1:32)(1:38)|(1:34)|35|(1:37)(1:17))(5:39|(1:41)(1:47)|(1:43)|44|(1:46)(1:12)))))|92|6|(0)(0)|22|23|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r5 = r0;
        r0 = r2;
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(android.content.Context r26, java.lang.String r27, int r28, java.lang.Integer r29, boolean r30, int r31, kotlin.coroutines.Continuation r32) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go2.a1.Q6(android.content.Context, java.lang.String, int, java.lang.Integer, boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String authorFinderUsername, android.view.View view, int i17, int i18, yz5.l lVar) {
        boolean z17;
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17 || num == null) {
            return;
        }
        synchronized (eo2.f.f255565a) {
            ((java.util.HashMap) eo2.f.f255566b).remove(authorFinderUsername);
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127717gc).getValue()).r()).intValue() != 1 && (num3 == null || num3.intValue() != 1)) {
            if (i18 == 1) {
                db5.t7.m(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.f491902m42));
                return;
            }
            if (view != null) {
                view.setClickable(false);
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new go2.l0(this, authorFinderUsername, num, num2, i17, view, lVar, null), 3, null);
            return;
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(getContext());
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.b2p, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bys);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.hci);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.btf);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_MEMBER_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        checkBox.setChecked(((java.lang.Boolean) m17).booleanValue());
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.kqx);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486276kr0);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kqy);
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.f486277kr1);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486280kr4);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486278kr2);
        textView2.setText((num2 == null || num2.intValue() <= 0) ? num.toString() : num2.toString());
        textView4.setText(num.toString());
        qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((pg0.s3) h0Var).getClass();
        textView2.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(activity, 3));
        qg0.h0 h0Var2 = (qg0.h0) i95.n0.c(qg0.h0.class);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        ((pg0.s3) h0Var2).getClass();
        textView4.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(activity2, 3));
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f482790o2);
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482784nw);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.jfe);
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kqz);
        kotlin.jvm.internal.o.d(textView5);
        S6(textView5, checkBox, true);
        kotlin.jvm.internal.o.d(findViewById3);
        kotlin.jvm.internal.o.d(textView);
        T6(true, findViewById3, textView, textView2);
        kotlin.jvm.internal.o.d(findViewById4);
        kotlin.jvm.internal.o.d(textView3);
        T6(false, findViewById4, textView3, textView4);
        findViewById3.setOnClickListener(new go2.m0(this, textView6, button, findViewById3, textView, textView2, findViewById4, textView3, textView4, textView5, checkBox));
        findViewById4.setOnClickListener(new go2.n0(this, textView6, button, findViewById3, textView, textView2, findViewById4, textView3, textView4, textView5, checkBox));
        if (this.f273950g) {
            return;
        }
        button.setOnClickListener(new go2.p0(i18, this, checkBox, findViewById5, button, findViewById4, findViewById3, y1Var, authorFinderUsername, num, num2, i17, lVar));
        findViewById.setOnClickListener(new go2.q0(y1Var));
        findViewById2.setOnClickListener(new go2.s0(this, y1Var));
        y1Var.k(inflate);
        this.f273947d = true;
        y1Var.s();
    }

    public final void S6(android.widget.TextView textView, android.widget.CheckBox checkBox, boolean z17) {
        textView.setOnClickListener(new go2.t0(checkBox));
        com.tencent.mm.plugin.finder.assist.d8 d8Var = com.tencent.mm.plugin.finder.assist.d8.f102092a;
        if (!z17) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.emm, getContext().getString(com.tencent.mm.R.string.ema), getContext().getString(com.tencent.mm.R.string.end));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/XUitUE77PrSs1E17");
            java.lang.String format = java.lang.String.format("https://weixin.qq.com/cgi-bin/readtemplate?lang=%s&t=wxbean", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.m2.f(getContext())}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            arrayList.add(format);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(getContext().getString(com.tencent.mm.R.string.ema));
            arrayList2.add(getContext().getString(com.tencent.mm.R.string.end));
            com.tencent.mm.plugin.finder.assist.d8.f(d8Var, getContext(), textView, "Finder.FinderMemberPayUIC", string, arrayList, arrayList2, null, 64, null);
            return;
        }
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.emn, getContext().getString(com.tencent.mm.R.string.ema), getContext().getString(com.tencent.mm.R.string.en8), getContext().getString(com.tencent.mm.R.string.end));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/XUitUE77PrSs1E17");
        arrayList3.add("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/3iJr1veYBdD6XWTI");
        java.lang.String format2 = java.lang.String.format("https://weixin.qq.com/cgi-bin/readtemplate?lang=%s&t=wxbean", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.sdk.platformtools.m2.f(getContext())}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        arrayList3.add(format2);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(getContext().getString(com.tencent.mm.R.string.ema));
        arrayList4.add(getContext().getString(com.tencent.mm.R.string.en8));
        arrayList4.add(getContext().getString(com.tencent.mm.R.string.end));
        com.tencent.mm.plugin.finder.assist.d8.f(d8Var, getContext(), textView, "Finder.FinderMemberPayUIC", string2, arrayList3, arrayList4, null, 64, null);
    }

    public final void T6(boolean z17, android.view.View layout, android.widget.TextView tvType, android.widget.TextView tvPrice) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(tvType, "tvType");
        kotlin.jvm.internal.o.g(tvPrice, "tvPrice");
        if (!z17) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
            gradientDrawable.setStroke(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479112qb));
            layout.setBackground(gradientDrawable);
            tvType.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.t_));
            tvPrice.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.t_));
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
        gradientDrawable2.setStroke(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479642bh), com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478502m));
        gradientDrawable2.setColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479111qa));
        layout.setBackground(gradientDrawable2);
        tvType.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_0));
        tvPrice.setTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_0));
    }

    public final com.tencent.mm.ui.widget.dialog.y1 U6(android.content.Context context, java.lang.String authorFinderUsername, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b2q, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.c9x);
        com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bys);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a9m);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_w);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        ya2.b2 b17 = ya2.h.f460484a.b(authorFinderUsername);
        boolean z17 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String w07 = b17 != null ? b17.w0() : null;
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        objArr[0] = com.tencent.mm.pluginsdk.ui.span.c0.j(context, w07, textSize);
        textView2.setText(context.getString(com.tencent.mm.R.string.emc, objArr));
        if (i17 != 1 && i17 != 2) {
            textView.setVisibility(0);
            button.setText(com.tencent.mm.R.string.f490454vi);
        }
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b18 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = b18.x;
        int i27 = b18.y;
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i18 = i27 - c17;
        } else {
            if (i27 >= i19) {
                i19 = i27;
            }
            i18 = i19 - c17;
        }
        if (layoutParams == null) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams.height = (int) (i18 * 0.7d);
        inflate.setLayoutParams(layoutParams);
        ng5.a.a(imageView, c01.z1.r());
        findViewById.setOnClickListener(new go2.u0(y1Var));
        button.setOnClickListener(new go2.w0(context, i17, authorFinderUsername, y1Var));
        y1Var.k(inflate);
        y1Var.s();
        return y1Var;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("Finder.FinderMemberPayUIC", "onResume:has startSubscribe " + this.f273948e);
        if (!this.f273948e || (str = this.f273949f) == null) {
            return;
        }
        P6(getContext(), str, true, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f273947d = true;
        this.f273952i = 2000;
    }
}
