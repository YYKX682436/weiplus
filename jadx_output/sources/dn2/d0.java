package dn2;

/* loaded from: classes3.dex */
public final class d0 implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241901a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241902b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f241903c;

    /* renamed from: d, reason: collision with root package name */
    public cn2.k f241904d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f241905e;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241901a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241902b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f483515b23);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.r5f);
        e(1, 1);
        android.widget.TextView textView = this.f241902b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        android.view.View view = this.f241901a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        android.widget.ImageView imageView2 = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.f483512b20);
        java.lang.Object D = liveMsg.D();
        r45.tj1 tj1Var = D instanceof r45.tj1 ? (r45.tj1) D : null;
        if (tj1Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            r45.tj1 tj1Var2 = tj1Var;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeRealTimeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeRealTimeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView2.setVisibility(0);
            imageView.setVisibility(0);
            ng5.a.a(imageView2, tj1Var2.getString(0));
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = zl2.q4.f473933a.p(tj1Var2.getString(0), null, false);
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = rootView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.widget.TextView textView2 = this.f241902b;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            android.text.TextPaint paint = textView2.getPaint();
            kotlin.jvm.internal.o.f(paint, "getPaint(...)");
            java.lang.String obj = c61.yb.nf(ybVar, context, paint, (java.lang.CharSequence) h0Var.f310123d, 0, 8, null).toString();
            h0Var.f310123d = obj;
            android.widget.TextView textView3 = this.f241902b;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            textView3.setText(obj);
            android.content.Context context2 = rootView.getContext();
            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity != null) {
                java.lang.Object Ej = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ej(activity, new dn2.c0(widget, this, rootView));
                android.view.View view2 = this.f241901a;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("bulletContent");
                    throw null;
                }
                view2.setOnClickListener(new dn2.a0(this, Ej, tj1Var2, h0Var));
            }
            android.widget.TextView textView4 = this.f241902b;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i17 = cn2.d0.f43489b;
                marginLayoutParams.setMargins(cn2.d0.f43490c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            android.view.View view3 = this.f241901a;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("bulletContent");
                throw null;
            }
            if (view3 == null) {
                kotlin.jvm.internal.o.o("bulletContent");
                throw null;
            }
            view3.setBackgroundDrawable(view3.getContext().getDrawable(com.tencent.mm.R.drawable.cs8));
            imageView.setVisibility(0);
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = c1Var != null ? c1Var.f328846n : null;
            zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
            zy2.r6 r6Var = new zy2.r6();
            r6Var.f477558i = finderObject;
            android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.finder_live_heart, i65.a.d(imageView.getContext(), com.tencent.mm.R.color.f478553an));
            kotlin.jvm.internal.o.f(e17, "getColorDrawable(...)");
            ((ht2.y0) s6Var).sj(imageView, r6Var, e17);
        }
        return rootView;
    }

    @Override // dn2.e
    public void d(cn2.k curConfig, yz5.l continueAnim) {
        kotlin.jvm.internal.o.g(curConfig, "curConfig");
        kotlin.jvm.internal.o.g(continueAnim, "continueAnim");
        this.f241903c = continueAnim;
        this.f241904d = curConfig;
    }

    public final void e(int i17, int i18) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.J2;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("friend_like_cnt", i18);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488866ba5;
    }
}
