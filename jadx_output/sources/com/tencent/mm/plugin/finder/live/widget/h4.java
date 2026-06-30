package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f118527a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.oo0 f118528b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f118529c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f118530d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f118531e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f118532f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f118533g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f118534h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f118535i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f118536j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f118537k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f118538l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f118539m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f118540n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f118541o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f118542p;

    public h4(android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.plugin.oo0 plugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f118527a = root;
        this.f118528b = plugin;
        this.f118529c = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.f483581bb4);
        this.f118530d = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.bcl);
        this.f118531e = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.bca);
        this.f118532f = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.muk);
        this.f118533g = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.lzh);
        this.f118534h = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.lzk);
        this.f118535i = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.lzj);
        this.f118536j = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.kcm);
        this.f118537k = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.ohq);
        this.f118538l = root.findViewById(com.tencent.mm.R.id.lzi);
        this.f118539m = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.awq);
        this.f118540n = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.muj);
        this.f118541o = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.mwz);
        this.f118542p = root.findViewById(com.tencent.mm.R.id.hpg);
    }

    public static final void a(com.tencent.mm.plugin.finder.live.widget.h4 h4Var, r45.b56 b56Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        h4Var.getClass();
        int integer = b56Var.getInteger(6);
        com.tencent.mm.plugin.finder.live.plugin.oo0 oo0Var = h4Var.f118528b;
        android.view.ViewGroup viewGroup = h4Var.f118527a;
        if (integer == 0) {
            r45.k74 k74Var = (r45.k74) b56Var.getCustom(2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump liteapp, appId = ");
            sb6.append(k74Var != null ? k74Var.getString(0) : null);
            sb6.append(", path = ");
            sb6.append(k74Var != null ? k74Var.getString(1) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveAfterRecommendProductWidget", sb6.toString());
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.ac4 ac4Var = new r45.ac4();
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
            finderJumpInfo.setLite_app_info(k74Var);
            finderJumpInfo.setJumpinfo_type(6);
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.v9.class))).T6(oo0Var.Y().f410659n.getLong(0), finderJumpInfo);
            ac4Var.set(1, finderJumpInfo);
            c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        } else {
            r45.c33 c33Var = (r45.c33) b56Var.getCustom(7);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("jump weApp, appId = ");
            sb7.append(c33Var != null ? c33Var.getString(0) : null);
            sb7.append(", path = ");
            sb7.append(c33Var != null ? c33Var.getString(1) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveAfterRecommendProductWidget", sb7.toString());
            l81.b1 b1Var = new l81.b1();
            java.lang.String str3 = "";
            if (c33Var == null || (str = c33Var.getString(0)) == null) {
                str = "";
            }
            b1Var.f317014b = str;
            if (c33Var == null || (str2 = c33Var.getString(1)) == null) {
                str2 = "";
            }
            b1Var.f317022f = str2;
            if (c33Var != null && (string = c33Var.getString(2)) != null) {
                str3 = string;
            }
            b1Var.f317012a = str3;
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            b1Var.f317032k = 1205;
            android.content.Context context3 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).c(zy2.v9.class))).U6(oo0Var.Y().f410659n.getLong(0), b1Var);
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(viewGroup.getContext(), b1Var);
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c18;
        ml2.b4 b4Var = ml2.b4.f327264s;
        cl0.g gVar = new cl0.g();
        gVar.o("commerceAction", 1026);
        ml2.r0.mj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void b(r45.wa1 wa1Var) {
        java.lang.String str;
        java.lang.String string;
        android.view.ViewGroup viewGroup = this.f118527a;
        if (viewGroup.isShown()) {
            com.tencent.mars.xlog.Log.e("FinderLiveAfterRecommendProductWidget", "has init once");
            return;
        }
        java.util.LinkedList list = wa1Var != null ? wa1Var.getList(2) : null;
        int i17 = 1;
        if (list == null || list.isEmpty()) {
            return;
        }
        viewGroup.setVisibility(0);
        java.util.LinkedList list2 = wa1Var.getList(2);
        kotlin.jvm.internal.o.f(list2, "getProducts(...)");
        android.content.Context context = viewGroup.getContext();
        java.util.Iterator it = list2.iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            pf5.u uVar = pf5.u.f353936a;
            str = "";
            if (!hasNext) {
                ae2.b2 b2Var = ae2.b2.f3461a;
                int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3466c0).getValue()).r()).intValue();
                android.view.ViewGroup viewGroup2 = this.f118540n;
                android.view.ViewGroup viewGroup3 = this.f118541o;
                if (intValue == 0) {
                    r45.b56 b56Var = (r45.b56) wa1Var.getCustom(1);
                    if (b56Var != null) {
                        viewGroup3.setVisibility(0);
                        viewGroup2.setVisibility(8);
                        this.f118542p.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.g4(this, b56Var));
                        viewGroup.setOnClickListener(null);
                    }
                } else {
                    r45.b56 b56Var2 = (r45.b56) wa1Var.getCustom(1);
                    if (b56Var2 != null) {
                        viewGroup3.setVisibility(8);
                        viewGroup2.setVisibility(0);
                        java.lang.String string2 = b56Var2.getString(0);
                        if (string2 == null) {
                            string2 = "";
                        }
                        this.f118532f.setText(string2);
                        r45.fr5 fr5Var = (r45.fr5) b56Var2.getCustom(4);
                        boolean z17 = fr5Var != null && fr5Var.getInteger(0) == 1;
                        android.view.ViewGroup viewGroup4 = this.f118533g;
                        android.widget.TextView textView = this.f118536j;
                        if (z17) {
                            if (textView != null) {
                                textView.setVisibility(8);
                            }
                            if (viewGroup4 != null) {
                                viewGroup4.setVisibility(0);
                            }
                            r45.fr5 fr5Var2 = (r45.fr5) b56Var2.getCustom(4);
                            android.widget.TextView textView2 = this.f118534h;
                            if (fr5Var2 != null) {
                                java.lang.String format = new java.text.DecimalFormat("0.##").format(fr5Var2.getInteger(1) / 100.0d);
                                if (textView2 != null) {
                                    textView2.setText(format);
                                }
                            }
                            android.widget.TextView textView3 = this.f118535i;
                            if (textView3 != null) {
                                r45.fr5 fr5Var3 = (r45.fr5) b56Var2.getCustom(4);
                                textView3.setText(fr5Var3 != null ? fr5Var3.getString(5) : null);
                            }
                            r45.fr5 fr5Var4 = (r45.fr5) b56Var2.getCustom(4);
                            int parseColor = android.graphics.Color.parseColor(fr5Var4 != null ? fr5Var4.getString(4) : null);
                            if (textView2 != null) {
                                textView2.setTextColor(parseColor);
                            }
                            if (textView3 != null) {
                                textView3.setTextColor(parseColor);
                            }
                            if (textView2 != null) {
                                com.tencent.mm.ui.fk.a(textView2);
                            }
                            if (textView3 != null) {
                                com.tencent.mm.ui.fk.a(textView3);
                            }
                        } else {
                            if (textView != null) {
                                textView.setVisibility(0);
                            }
                            if (viewGroup4 != null) {
                                viewGroup4.setVisibility(8);
                            }
                        }
                        java.lang.String string3 = b56Var2.getString(5);
                        if (string3 == null || string3.length() == 0) {
                            r45.fr5 fr5Var5 = (r45.fr5) b56Var2.getCustom(4);
                            java.lang.String string4 = fr5Var5 != null ? fr5Var5.getString(2) : null;
                            if (string4 == null || string4.length() == 0) {
                                if (textView != null) {
                                    textView.setVisibility(8);
                                }
                                if (viewGroup4 != null) {
                                    viewGroup4.setVisibility(8);
                                }
                            } else {
                                if (textView != null) {
                                    r45.fr5 fr5Var6 = (r45.fr5) b56Var2.getCustom(4);
                                    if (fr5Var6 != null && (string = fr5Var6.getString(2)) != null) {
                                        str = string;
                                    }
                                    textView.setText(str);
                                }
                                if (textView != null) {
                                    textView.setVisibility(0);
                                }
                                if (viewGroup4 != null) {
                                    viewGroup4.setVisibility(8);
                                }
                            }
                        } else {
                            android.widget.TextView textView4 = this.f118537k;
                            if (textView4 != null) {
                                textView4.setVisibility(0);
                            }
                            if (textView4 != null) {
                                textView4.setText(b56Var2.getString(5));
                            }
                            android.view.View view = this.f118538l;
                            if (view != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget", "showDetailInfo", "(Lcom/tencent/mm/protocal/protobuf/ShopWindowCardProfileInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterRecommendProductWidget", "showDetailInfo", "(Lcom/tencent/mm/protocal/protobuf/ShopWindowCardProfileInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                        java.lang.String string5 = b56Var2.getString(3);
                        if (string5 != null) {
                            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(string5, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                            android.widget.ImageView brandIcon = this.f118539m;
                            kotlin.jvm.internal.o.f(brandIcon, "brandIcon");
                            ((wo0.b) a17).c(brandIcon);
                        }
                        viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.f4(this, b56Var2));
                    }
                }
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.r0 r0Var = (ml2.r0) c17;
                ml2.b4 b4Var = ml2.b4.f327264s;
                cl0.g gVar = new cl0.g();
                gVar.o("commerceAction", 1025);
                ml2.r0.mj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.eb7 eb7Var = (r45.eb7) next;
            android.view.ViewGroup viewGroup5 = i18 != 0 ? i18 != i17 ? this.f118531e : this.f118530d : this.f118529c;
            kotlin.jvm.internal.o.d(context);
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(context);
            java.util.Iterator it6 = it;
            mMRoundCornerImageView.setRadius((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl));
            mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            int a18 = com.tencent.mm.ui.zk.a(context, 104);
            mMRoundCornerImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(a18, a18));
            viewGroup5.removeAllViews();
            viewGroup5.addView(mMRoundCornerImageView);
            viewGroup5.setVisibility(0);
            java.lang.String string6 = eb7Var.getString(1);
            str = string6 != null ? string6 : "";
            wo0.c a19 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            a19.f447873d = new com.tencent.mm.plugin.finder.live.widget.e4(mMRoundCornerImageView, str);
            a19.f();
            ae2.b2 b2Var2 = ae2.b2.f3461a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3466c0).getValue()).r()).intValue() == 0 || ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3468d0).getValue()).r()).intValue() == 0) {
                viewGroup5.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.c4(eb7Var, this, context));
            }
            long j17 = eb7Var.getLong(0);
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0 r0Var2 = (ml2.r0) c18;
            ml2.b4 b4Var2 = ml2.b4.f327264s;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("commerceAction", 1027);
            gVar2.p("productid", j17);
            ml2.r0.mj(r0Var2, b4Var2, gVar2.toString(), 0L, null, null, null, null, null, 252, null);
            i18 = i19;
            it = it6;
            i17 = 1;
        }
    }
}
