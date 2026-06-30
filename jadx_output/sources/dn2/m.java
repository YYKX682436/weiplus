package dn2;

/* loaded from: classes3.dex */
public final class m implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241938a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241939b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f241940c;

    /* renamed from: d, reason: collision with root package name */
    public cn2.k f241941d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f241942e;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        df2.cn cnVar;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241938a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241939b = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f483515b23);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.r5f);
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore != null && (cnVar = (df2.cn) liveRoomControllerStore.controller(df2.cn.class)) != null) {
            cnVar.s7(7, null);
        }
        android.widget.TextView textView = this.f241939b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        android.view.View view = this.f241938a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        jz5.g b17 = jz5.h.b(new dn2.l(rootView));
        java.lang.Object D = liveMsg.D();
        r45.qq1 qq1Var = D instanceof r45.qq1 ? (r45.qq1) D : null;
        if (qq1Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            r45.qq1 qq1Var2 = qq1Var;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LikeRecommendBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LikeRecommendBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            jz5.n nVar = (jz5.n) b17;
            for (android.widget.ImageView imageView2 : (android.widget.ImageView[]) nVar.getValue()) {
                imageView2.setVisibility(8);
            }
            java.util.LinkedList list = qq1Var2.getList(0);
            kotlin.jvm.internal.o.f(list, "getFriend_list(...)");
            java.util.Collections.reverse(list);
            android.content.Context context = rootView.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                java.lang.Object Ej = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ej(activity, new dn2.k(widget, this, qq1Var2, rootView));
                android.view.View view2 = this.f241938a;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("bulletContent");
                    throw null;
                }
                view2.setOnClickListener(new dn2.i(this, qq1Var2, Ej));
            }
            java.util.LinkedList list2 = qq1Var2.getList(0);
            kotlin.jvm.internal.o.f(list2, "getFriend_list(...)");
            java.util.List L0 = kz5.n0.L0(list2, 3);
            int i17 = 0;
            for (java.lang.Object obj : L0) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.xj5 xj5Var = (r45.xj5) obj;
                android.widget.ImageView imageView3 = ((android.widget.ImageView[]) nVar.getValue())[i17];
                imageView3.setVisibility(0);
                java.lang.String string = xj5Var.getString(0);
                if (string == null || string.length() == 0) {
                    ng5.a.a(imageView3, xj5Var.getString(1));
                } else {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.l().c(new mn2.n(xj5Var.getString(0), com.tencent.mm.plugin.finder.storage.y90.X), imageView3, g1Var.h(mn2.f1.f329961o));
                }
                i17 = i18;
            }
            r45.xj5 xj5Var2 = (r45.xj5) kz5.n0.k0(L0);
            if (xj5Var2 != null) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String string2 = xj5Var2.getString(1);
                java.lang.String string3 = xj5Var2.getString(2);
                ((c61.l7) b6Var).getClass();
                str = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ri(string2, string3, false);
            } else {
                str = "";
            }
            java.lang.String str2 = str;
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context2 = rootView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            android.widget.TextView textView2 = this.f241939b;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            android.text.TextPaint paint = textView2.getPaint();
            kotlin.jvm.internal.o.f(paint, "getPaint(...)");
            java.lang.String obj2 = c61.yb.nf(ybVar, context2, paint, str2, 0, 8, null).toString();
            java.lang.String string4 = qq1Var2.getString(1);
            if (!(string4 == null || string4.length() == 0) || qq1Var2.getList(0).size() > 1) {
                java.lang.String string5 = qq1Var2.getString(1);
                if (!(!(string5 == null || string5.length() == 0))) {
                    string5 = null;
                }
                if (string5 == null) {
                    android.view.View view3 = this.f241938a;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("bulletContent");
                        throw null;
                    }
                    string5 = view3.getContext().getString(com.tencent.mm.R.string.nqu, java.lang.Integer.valueOf(qq1Var2.getList(0).size()));
                }
                kotlin.jvm.internal.o.d(string5);
                android.widget.TextView textView3 = this.f241939b;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("bulletContentTv");
                    throw null;
                }
                textView3.setText(obj2 + ' ' + string5);
            } else {
                android.widget.TextView textView4 = this.f241939b;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("bulletContentTv");
                    throw null;
                }
                textView4.setText(java.lang.String.valueOf(obj2));
            }
            e(1, qq1Var2.getList(0).size());
            android.widget.TextView textView5 = this.f241939b;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("bulletContentTv");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(cn2.d0.f43490c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            android.view.View view4 = this.f241938a;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("bulletContent");
                throw null;
            }
            view4.setBackgroundDrawable(view4.getContext().getDrawable(com.tencent.mm.R.drawable.cs8));
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
        this.f241940c = continueAnim;
        this.f241941d = curConfig;
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
