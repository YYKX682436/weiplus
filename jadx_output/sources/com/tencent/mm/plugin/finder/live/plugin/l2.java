package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.eg1 f113341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113342f;

    public l2(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, r45.eg1 eg1Var, java.lang.String str) {
        this.f113340d = v3Var;
        this.f113341e = eg1Var;
        this.f113342f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var;
        java.lang.String str2;
        java.lang.Class cls;
        jz5.f0 f0Var;
        android.view.ViewGroup viewGroup;
        r45.nw1 nw1Var;
        jz5.f0 f0Var2;
        java.lang.String str3;
        int i17;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.live.util.j0 j0Var;
        java.util.Map map;
        java.lang.String str4;
        java.lang.String str5;
        android.widget.TextView textView;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.util.List i18;
        r45.e02 e02Var;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String H1 = this.f113340d.H1();
        ya2.b2 b17 = ya2.h.f460484a.b(H1);
        jz5.f0 f0Var3 = null;
        if (b17 != null) {
            com.tencent.mm.protocal.protobuf.FinderContact i19 = ya2.d.i(b17);
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var2 = this.f113340d;
            r45.eg1 closePageInfo = this.f113341e;
            java.lang.String str11 = this.f113342f;
            ef2.c cVar = (ef2.c) v3Var2.U0(ef2.c.class);
            jz5.f0 f0Var4 = jz5.f0.f302826a;
            if (cVar != null) {
                km2.b bVar = v3Var2.S;
                kotlin.jvm.internal.o.g(closePageInfo, "closePageInfo");
                boolean w17 = zl2.r4.f473950a.w1();
                mm2.n0 n0Var = (mm2.n0) cVar.business(mm2.n0.class);
                boolean z17 = n0Var != null && n0Var.f329273r;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show Card, isAnchor=");
                sb6.append(w17);
                sb6.append(", isCoInvitee=");
                sb6.append(z17);
                sb6.append(", rootLayout=");
                sb6.append(cVar.f252402m != null);
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorMilestoneShareController", sb6.toString());
                if (w17 || z17) {
                    android.widget.RelativeLayout relativeLayout = cVar.f252402m;
                    if (relativeLayout != null) {
                        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = cVar.f252403n;
                        if (anchorMilestoneShareView != null) {
                            android.view.ViewParent parent = anchorMilestoneShareView.getParent();
                            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                                ((android.view.ViewGroup) parent).removeView(anchorMilestoneShareView);
                            }
                            cVar.f252403n = null;
                        }
                        if (cVar.f252403n == null) {
                            if (bVar == null || (nw1Var = bVar.f309070t) == null) {
                                nw1Var = ((mm2.e1) cVar.business(mm2.e1.class)).f328988r;
                            }
                            int integer = nw1Var.getInteger(4);
                            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("M月d日HH:mm", java.util.Locale.CHINESE);
                            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+08:00"));
                            cls = mm2.e1.class;
                            v3Var = v3Var2;
                            java.lang.String postSubTitle = simpleDateFormat.format(new java.util.Date(integer * 1000)) + ' ' + ((mm2.c1) cVar.business(mm2.c1.class)).V1;
                            android.content.Context context = relativeLayout.getContext();
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView2 = new com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView(context, null);
                            ef2.b bVar2 = new ef2.b(cVar);
                            kotlin.jvm.internal.o.g(postSubTitle, "postSubTitle");
                            anchorMilestoneShareView2.f111572d = cVar;
                            anchorMilestoneShareView2.f111573e = i19;
                            anchorMilestoneShareView2.f111574f = postSubTitle;
                            android.view.View inflate = android.view.View.inflate(anchorMilestoneShareView2.getContext(), com.tencent.mm.R.layout.f488836e84, anchorMilestoneShareView2);
                            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bwo);
                            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                            anchorMilestoneShareView2.f111576h = (com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator) findViewById;
                            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ugp);
                            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                            anchorMilestoneShareView2.f111577i = (androidx.viewpager.widget.ViewPager) findViewById2;
                            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.v4a);
                            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
                            anchorMilestoneShareView2.f111578m = findViewById3;
                            android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.v4b);
                            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
                            anchorMilestoneShareView2.f111579n = findViewById4;
                            android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.v4c);
                            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
                            anchorMilestoneShareView2.f111580o = findViewById5;
                            androidx.viewpager.widget.ViewPager viewPager = anchorMilestoneShareView2.f111577i;
                            if (viewPager == null) {
                                kotlin.jvm.internal.o.o("milestonePostViewPager");
                                throw null;
                            }
                            viewPager.setPageMargin((int) (40 * anchorMilestoneShareView2.getResources().getDisplayMetrics().density));
                            anchorMilestoneShareView2.f111581p = new gf2.a0();
                            java.lang.String string = closePageInfo.getString(2);
                            if (string != null) {
                                anchorMilestoneShareView2.f111575g = string;
                                f0Var2 = f0Var4;
                            } else {
                                f0Var2 = null;
                            }
                            if (f0Var2 == null) {
                                com.tencent.mars.xlog.Log.e("FinderLiveAnchorMilestoneShareView", "empty postViewShareUrl");
                            }
                            androidx.viewpager.widget.ViewPager viewPager2 = anchorMilestoneShareView2.f111577i;
                            if (viewPager2 == null) {
                                kotlin.jvm.internal.o.o("milestonePostViewPager");
                                throw null;
                            }
                            android.view.View inflate2 = com.tencent.mm.ui.id.b(anchorMilestoneShareView2.getContext()).inflate(com.tencent.mm.R.layout.f488835e83, (android.view.ViewGroup) viewPager2, false);
                            android.view.View findViewById6 = inflate2.findViewById(com.tencent.mm.R.id.ci6);
                            if (findViewById6 != null) {
                                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                                gradientDrawable.setShape(0);
                                gradientDrawable.setCornerRadius(anchorMilestoneShareView2.getResources().getDisplayMetrics().density * 20.0f);
                                f0Var = f0Var4;
                                gradientDrawable.setColor(anchorMilestoneShareView2.getResources().getColor(com.tencent.mm.R.color.f478513v, null));
                                findViewById6.setBackground(gradientDrawable);
                            } else {
                                f0Var = f0Var4;
                            }
                            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.v4_);
                            if (textView2 != null) {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\u3000\u3000");
                                com.tencent.mm.protocal.protobuf.FinderContact finderContact = anchorMilestoneShareView2.f111573e;
                                if (finderContact == null) {
                                    kotlin.jvm.internal.o.o("contact");
                                    throw null;
                                }
                                sb7.append(finderContact.getNickname());
                                sb7.append(' ');
                                sb7.append(anchorMilestoneShareView2.getContext().getResources().getString(com.tencent.mm.R.string.f491454no3));
                                textView2.setText(sb7.toString());
                            }
                            android.widget.TextView textView3 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.v49);
                            if (textView3 != null) {
                                java.lang.String str12 = anchorMilestoneShareView2.f111574f;
                                if (str12 == null) {
                                    kotlin.jvm.internal.o.o("postViewSubTitle");
                                    throw null;
                                }
                                textView3.setText(str12);
                            }
                            android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.f486895v46);
                            mn2.g1 g1Var = mn2.g1.f329975a;
                            if (imageView != null) {
                                vo0.d a17 = g1Var.a();
                                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = anchorMilestoneShareView2.f111573e;
                                if (finderContact2 == null) {
                                    kotlin.jvm.internal.o.o("contact");
                                    throw null;
                                }
                                str = H1;
                                str2 = str11;
                                a17.c(new mn2.n(finderContact2.getHeadUrl(), null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
                            } else {
                                str = H1;
                                str2 = str11;
                            }
                            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.v47);
                            java.lang.String str13 = anchorMilestoneShareView2.f111575g;
                            com.tencent.mm.plugin.finder.live.util.j0 j0Var2 = com.tencent.mm.plugin.finder.live.util.j0.f115565a;
                            if (str13 != null) {
                                android.graphics.Bitmap c17 = com.tencent.mm.plugin.finder.live.util.j0.c(j0Var2, str13, 0, com.tencent.mm.plugin.finder.live.util.h0.f115531e, anchorMilestoneShareView2.getResources().getDisplayMetrics().density * 56.0f, 0.0f, anchorMilestoneShareView2.getResources().getColor(com.tencent.mm.R.color.adh, null), 0, 64, null);
                                if (c17 != null && imageView2 != null) {
                                    imageView2.setImageBitmap(c17);
                                }
                            }
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate2.findViewById(com.tencent.mm.R.id.v48);
                            if (viewGroup2 != null) {
                                ff2.c cVar2 = ff2.c.f261638a;
                                java.util.LinkedList list = closePageInfo.getList(0);
                                kotlin.jvm.internal.o.f(list, "getPage_item_list(...)");
                                str3 = "milestonePostViewPager";
                                i17 = 1;
                                cVar2.b(list, viewGroup2, true, null);
                            } else {
                                str3 = "milestonePostViewPager";
                                i17 = 1;
                            }
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            android.view.View[] viewArr = new android.view.View[i17];
                            int i27 = 0;
                            viewArr[0] = inflate2;
                            anchorMilestoneShareView2.f111582q = kz5.c0.d(viewArr);
                            java.util.LinkedList list2 = closePageInfo.getList(0);
                            kotlin.jvm.internal.o.f(list2, "getPage_item_list(...)");
                            java.util.Iterator it = list2.iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                java.util.Map map2 = anchorMilestoneShareView2.f111583r;
                                java.lang.String str14 = "postViewList";
                                if (hasNext) {
                                    r45.fg1 fg1Var = (r45.fg1) it.next();
                                    if (fg1Var.getInteger(i27) == 1) {
                                        r45.d02 d02Var = (r45.d02) fg1Var.getCustom(1);
                                        java.util.LinkedList list3 = (d02Var == null || (e02Var = (r45.e02) d02Var.getCustom(0)) == null) ? null : e02Var.getList(0);
                                        if (list3 != null) {
                                            java.util.Iterator it6 = list3.iterator();
                                            while (it6.hasNext()) {
                                                r45.c02 c02Var = (r45.c02) it6.next();
                                                kotlin.jvm.internal.o.d(c02Var);
                                                java.util.Iterator it7 = it;
                                                java.util.Iterator it8 = it6;
                                                android.view.View inflate3 = com.tencent.mm.ui.id.b(anchorMilestoneShareView2.getContext()).inflate(com.tencent.mm.R.layout.e86, (android.view.ViewGroup) viewPager2, false);
                                                android.widget.TextView textView4 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.v6a);
                                                android.widget.TextView textView5 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.v6g);
                                                androidx.viewpager.widget.ViewPager viewPager3 = viewPager2;
                                                android.widget.TextView textView6 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.v6h);
                                                android.widget.RelativeLayout relativeLayout2 = relativeLayout;
                                                ef2.c cVar3 = cVar;
                                                ef2.b bVar3 = bVar2;
                                                android.view.View view2 = inflate2;
                                                java.lang.String str15 = str14;
                                                if (textView4 != null) {
                                                    arrayList = arrayList3;
                                                    com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = anchorMilestoneShareView2.f111573e;
                                                    if (finderContact3 == null) {
                                                        kotlin.jvm.internal.o.o("contact");
                                                        throw null;
                                                    }
                                                    textView4.setText(finderContact3.getNickname());
                                                    map = map2;
                                                    int integer2 = c02Var.getInteger(0);
                                                    j0Var = j0Var2;
                                                    textView = textView5;
                                                    java.util.List i28 = integer2 != 1 ? integer2 != 2 ? integer2 != 3 ? integer2 != 6 ? kz5.c0.i("#FEF3B9", "#FEF3B9", "#FEF3B9") : kz5.c0.i("#FEF3B9", "#FEF3B9", "#FEF3B9") : kz5.c0.i("#CEA670", "#F9E5B8", "#CC9C59") : kz5.c0.i("#CFCFCF", "#FBFBFB", "#CFCFCF") : kz5.c0.i("#DE986C", "#EE8989", "#B84836");
                                                    str4 = "#FEF3B9";
                                                    str5 = "#DE986C";
                                                    java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(i28, 10));
                                                    java.util.Iterator it9 = i28.iterator();
                                                    while (it9.hasNext()) {
                                                        arrayList4.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it9.next())));
                                                    }
                                                    textView4.post(new com.tencent.mm.plugin.finder.live.util.v1(new com.tencent.mm.plugin.finder.live.util.u1(kz5.n0.R0(arrayList4), new float[]{0.0f, 0.6f, 1.0f}), textView4));
                                                } else {
                                                    arrayList = arrayList3;
                                                    j0Var = j0Var2;
                                                    map = map2;
                                                    str4 = "#FEF3B9";
                                                    str5 = "#DE986C";
                                                    textView = textView5;
                                                }
                                                if (textView != null) {
                                                    textView.setText(c02Var.getString(3));
                                                    int integer3 = c02Var.getInteger(0);
                                                    java.util.List i29 = integer3 != 1 ? integer3 != 2 ? integer3 != 3 ? integer3 != 6 ? kz5.c0.i("#FDE977", "#FDE977", "#FDE977") : kz5.c0.i("#FDE977", "#FDE977", "#FDE977") : kz5.c0.i("#CEA670", "#F9E5B8", "#CC9C59") : kz5.c0.i("#CACACA", "#FFFFFF", "#C8C8C8") : kz5.c0.i("#E29E73", "#EEB189", "#C77960");
                                                    str6 = "#EEB189";
                                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(i29, 10));
                                                    java.util.Iterator it10 = i29.iterator();
                                                    while (it10.hasNext()) {
                                                        arrayList5.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it10.next())));
                                                    }
                                                    textView.post(new com.tencent.mm.plugin.finder.live.util.v1(new com.tencent.mm.plugin.finder.live.util.u1(kz5.n0.R0(arrayList5), new float[]{0.0f, 0.6f, 1.0f}), textView));
                                                } else {
                                                    str6 = "#EEB189";
                                                }
                                                if (textView6 != null) {
                                                    textView6.setText(c02Var.getString(1));
                                                    int integer4 = c02Var.getInteger(0);
                                                    java.util.List i37 = integer4 != 1 ? integer4 != 2 ? integer4 != 3 ? integer4 != 6 ? kz5.c0.i("#FFF09D", "#FFF09D", "#FFF09D") : kz5.c0.i("#FFF09D", "#FFF09D", "#FFF09D") : kz5.c0.i("#D5AB71", "#F9E5B8", "#CC9C59") : kz5.c0.i("#B19696", "#FFF2F2", "#966D6D") : kz5.c0.i("#DE7E6C", "#FFC7BA", "#B84836");
                                                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(i37, 10));
                                                    java.util.Iterator it11 = i37.iterator();
                                                    while (it11.hasNext()) {
                                                        arrayList6.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it11.next())));
                                                    }
                                                    textView6.post(new com.tencent.mm.plugin.finder.live.util.v1(new com.tencent.mm.plugin.finder.live.util.u1(kz5.n0.R0(arrayList6), new float[]{0.0f, 0.6f, 1.0f}), textView6));
                                                }
                                                android.view.View findViewById7 = inflate3.findViewById(com.tencent.mm.R.id.ci6);
                                                com.tencent.mm.plugin.finder.live.util.y1 y1Var = com.tencent.mm.plugin.finder.live.util.y1.f115751a;
                                                if (findViewById7 != null) {
                                                    float f17 = anchorMilestoneShareView2.getResources().getDisplayMetrics().density * 2.0f;
                                                    float f18 = anchorMilestoneShareView2.getResources().getDisplayMetrics().density * 40.0f;
                                                    com.tencent.mm.plugin.finder.live.util.u1 u1Var = new com.tencent.mm.plugin.finder.live.util.u1(ff2.a.f261636d);
                                                    int integer5 = c02Var.getInteger(0);
                                                    if (integer5 == 1) {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = kz5.c0.i("#EAAB82", "#A77979", "#A97D7D", "#49352E");
                                                    } else if (integer5 == 2) {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = kz5.c0.i("#5F5F5F", "#AE9C9C", "#9E8484", "#312A2A");
                                                    } else if (integer5 != 3) {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = integer5 != 6 ? kz5.c0.i("#5D4E11", "#9D9143", "#C6BD8E", "#3E3A1A") : kz5.c0.i("#5D4E11", "#9D9143", "#C6BD8E", "#3E3A1A");
                                                    } else {
                                                        str7 = "#FFFFFF";
                                                        str8 = "#CEA670";
                                                        str9 = "#CC9C59";
                                                        str10 = "#F9E5B8";
                                                        i18 = kz5.c0.i("#615B4F", "#A29982", "#A09780", "#372E23");
                                                    }
                                                    java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(i18, 10));
                                                    java.util.Iterator it12 = i18.iterator();
                                                    while (it12.hasNext()) {
                                                        arrayList7.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it12.next())));
                                                    }
                                                    android.graphics.drawable.Drawable a18 = y1Var.a(u1Var, new com.tencent.mm.plugin.finder.live.util.u1(kz5.n0.R0(arrayList7), new float[]{0.0f, 0.14f, 0.23f, 1.0f}), f18, f17);
                                                    if (a18 != null) {
                                                        findViewById7.setBackground(a18);
                                                    }
                                                } else {
                                                    str7 = "#FFFFFF";
                                                    str8 = "#CEA670";
                                                    str9 = "#CC9C59";
                                                    str10 = "#F9E5B8";
                                                }
                                                android.widget.ImageView imageView3 = (android.widget.ImageView) inflate3.findViewById(com.tencent.mm.R.id.v69);
                                                if (imageView3 != null) {
                                                    vo0.d a19 = g1Var.a();
                                                    com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = anchorMilestoneShareView2.f111573e;
                                                    if (finderContact4 == null) {
                                                        kotlin.jvm.internal.o.o("contact");
                                                        throw null;
                                                    }
                                                    a19.c(new mn2.n(finderContact4.getHeadUrl(), null, 2, null), imageView3, g1Var.h(mn2.f1.f329957h));
                                                }
                                                android.view.View findViewById8 = inflate3.findViewById(com.tencent.mm.R.id.v6_);
                                                if (findViewById8 != null) {
                                                    float f19 = anchorMilestoneShareView2.getResources().getDisplayMetrics().density * 2.0f;
                                                    float f27 = anchorMilestoneShareView2.getResources().getDisplayMetrics().density * 25.0f;
                                                    int integer6 = c02Var.getInteger(0);
                                                    java.util.List c18 = integer6 != 1 ? integer6 != 2 ? integer6 != 3 ? integer6 != 6 ? kz5.b0.c("#A19881") : kz5.b0.c("#A19881") : kz5.c0.i(str8, str10, str9) : kz5.c0.i("#D1D1D1", str7, "#C9C9C9") : kz5.c0.i(str5, str6, "#AD5344");
                                                    java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(c18, 10));
                                                    java.util.Iterator it13 = c18.iterator();
                                                    while (it13.hasNext()) {
                                                        arrayList8.add(java.lang.Integer.valueOf(android.graphics.Color.parseColor((java.lang.String) it13.next())));
                                                    }
                                                    android.graphics.drawable.Drawable a27 = y1Var.a(null, new com.tencent.mm.plugin.finder.live.util.u1(kz5.n0.R0(arrayList8), null), f27, f19);
                                                    if (a27 != null) {
                                                        findViewById8.setBackground(a27);
                                                    }
                                                }
                                                android.widget.ImageView imageView4 = (android.widget.ImageView) inflate3.findViewById(com.tencent.mm.R.id.v6c);
                                                int integer7 = c02Var.getInteger(0);
                                                int parseColor = integer7 != 1 ? integer7 != 2 ? integer7 != 3 ? integer7 != 6 ? android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor("#F8E3B7") : android.graphics.Color.parseColor("#D2CDCD") : android.graphics.Color.parseColor("#F6B394");
                                                java.lang.String str16 = anchorMilestoneShareView2.f111575g;
                                                if (str16 != null) {
                                                    android.graphics.Bitmap c19 = com.tencent.mm.plugin.finder.live.util.j0.c(j0Var, str16, 0, com.tencent.mm.plugin.finder.live.util.h0.f115530d, anchorMilestoneShareView2.getResources().getDisplayMetrics().density * 56.0f, 0.0f, parseColor, 0, 64, null);
                                                    if (c19 != null && imageView4 != null) {
                                                        imageView4.setImageBitmap(c19);
                                                    }
                                                }
                                                int integer8 = c02Var.getInteger(0);
                                                int parseColor2 = integer8 != 1 ? integer8 != 2 ? integer8 != 3 ? integer8 != 6 ? android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor(str4) : android.graphics.Color.parseColor("#F4DDAF") : android.graphics.Color.parseColor("#FDFDFD") : android.graphics.Color.parseColor("#F6A884");
                                                android.widget.TextView textView7 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.v6i);
                                                if (textView7 != null) {
                                                    textView7.setText(c02Var.getString(12));
                                                    textView7.setTextColor(parseColor2);
                                                    textView7.setAlpha(0.5f);
                                                }
                                                android.widget.TextView textView8 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.v6e);
                                                if (textView8 != null) {
                                                    textView8.setTextColor(parseColor2);
                                                    textView8.setAlpha(0.8f);
                                                }
                                                android.widget.TextView textView9 = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.v6d);
                                                if (textView9 != null) {
                                                    textView9.setTextColor(parseColor2);
                                                    textView9.setAlpha(0.3f);
                                                }
                                                com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) inflate3.findViewById(com.tencent.mm.R.id.v6f);
                                                if (mMPAGView != null) {
                                                    com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController = anchorMilestoneShareView2.f111572d;
                                                    if (liveRoomController == null) {
                                                        kotlin.jvm.internal.o.o("controller");
                                                        throw null;
                                                    }
                                                    kotlinx.coroutines.l.d(liveRoomController.getStore().getLiveRoomData().f272475i, null, null, new gf2.c(c02Var, anchorMilestoneShareView2, mMPAGView, inflate3, null), 3, null);
                                                }
                                                java.util.ArrayList arrayList9 = anchorMilestoneShareView2.f111582q;
                                                if (arrayList9 == null) {
                                                    kotlin.jvm.internal.o.o(str15);
                                                    throw null;
                                                }
                                                arrayList9.add(inflate3);
                                                anchorMilestoneShareView2.e(inflate3);
                                                java.lang.String valueOf = java.lang.String.valueOf(c02Var.getInteger(9));
                                                gf2.z zVar = (gf2.z) ((java.util.LinkedHashMap) map).get(inflate3);
                                                if (zVar != null) {
                                                    zVar.f271326a = valueOf;
                                                }
                                                java.util.ArrayList arrayList10 = arrayList;
                                                arrayList10.add(valueOf);
                                                arrayList3 = arrayList10;
                                                it = it7;
                                                it6 = it8;
                                                viewPager2 = viewPager3;
                                                relativeLayout = relativeLayout2;
                                                cVar = cVar3;
                                                bVar2 = bVar3;
                                                inflate2 = view2;
                                                str14 = str15;
                                                map2 = map;
                                                j0Var2 = j0Var;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                    arrayList3 = arrayList3;
                                    it = it;
                                    viewPager2 = viewPager2;
                                    relativeLayout = relativeLayout;
                                    cVar = cVar;
                                    bVar2 = bVar2;
                                    inflate2 = inflate2;
                                    j0Var2 = j0Var2;
                                    i27 = 0;
                                } else {
                                    java.util.ArrayList arrayList11 = arrayList3;
                                    ef2.c cVar4 = cVar;
                                    ef2.b bVar4 = bVar2;
                                    android.widget.RelativeLayout relativeLayout3 = relativeLayout;
                                    android.view.View view3 = inflate2;
                                    anchorMilestoneShareView2.e(view3);
                                    gf2.z zVar2 = (gf2.z) ((java.util.LinkedHashMap) map2).get(view3);
                                    if (zVar2 != null) {
                                        zVar2.f271326a = kz5.n0.g0(arrayList11, "#", null, null, 0, null, null, 62, null);
                                    }
                                    anchorMilestoneShareView2.f111584s = 0;
                                    com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator = anchorMilestoneShareView2.f111576h;
                                    if (commonCircleIndicator == null) {
                                        kotlin.jvm.internal.o.o("circleIndicator");
                                        throw null;
                                    }
                                    java.util.ArrayList arrayList12 = anchorMilestoneShareView2.f111582q;
                                    if (arrayList12 == null) {
                                        kotlin.jvm.internal.o.o("postViewList");
                                        throw null;
                                    }
                                    int size = arrayList12.size();
                                    if (commonCircleIndicator.f115424d != size) {
                                        commonCircleIndicator.f115424d = size;
                                        commonCircleIndicator.requestLayout();
                                    }
                                    com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator2 = anchorMilestoneShareView2.f111576h;
                                    if (commonCircleIndicator2 == null) {
                                        kotlin.jvm.internal.o.o("circleIndicator");
                                        throw null;
                                    }
                                    commonCircleIndicator2.a(anchorMilestoneShareView2.f111584s);
                                    com.tencent.mm.plugin.finder.live.util.CommonCircleIndicator commonCircleIndicator3 = anchorMilestoneShareView2.f111576h;
                                    if (commonCircleIndicator3 == null) {
                                        kotlin.jvm.internal.o.o("circleIndicator");
                                        throw null;
                                    }
                                    java.util.ArrayList arrayList13 = anchorMilestoneShareView2.f111582q;
                                    if (arrayList13 == null) {
                                        kotlin.jvm.internal.o.o("postViewList");
                                        throw null;
                                    }
                                    commonCircleIndicator3.setVisibility(arrayList13.size() > 1 ? 0 : 4);
                                    gf2.a0 a0Var = anchorMilestoneShareView2.f111581p;
                                    if (a0Var == null) {
                                        kotlin.jvm.internal.o.o("pagerAdapter");
                                        throw null;
                                    }
                                    java.util.ArrayList arrayList14 = anchorMilestoneShareView2.f111582q;
                                    if (arrayList14 == null) {
                                        kotlin.jvm.internal.o.o("postViewList");
                                        throw null;
                                    }
                                    a0Var.f271258d = arrayList14;
                                    a0Var.notifyDataSetChanged();
                                    androidx.viewpager.widget.ViewPager viewPager4 = anchorMilestoneShareView2.f111577i;
                                    if (viewPager4 == null) {
                                        kotlin.jvm.internal.o.o(str3);
                                        throw null;
                                    }
                                    gf2.a0 a0Var2 = anchorMilestoneShareView2.f111581p;
                                    if (a0Var2 == null) {
                                        kotlin.jvm.internal.o.o("pagerAdapter");
                                        throw null;
                                    }
                                    viewPager4.setAdapter(a0Var2);
                                    androidx.viewpager.widget.ViewPager viewPager5 = anchorMilestoneShareView2.f111577i;
                                    if (viewPager5 == null) {
                                        kotlin.jvm.internal.o.o(str3);
                                        throw null;
                                    }
                                    viewPager5.addOnPageChangeListener(new gf2.k(anchorMilestoneShareView2));
                                    android.view.View view4 = anchorMilestoneShareView2.f111578m;
                                    if (view4 == null) {
                                        kotlin.jvm.internal.o.o("cancelBtn");
                                        throw null;
                                    }
                                    view4.setOnClickListener(new gf2.l(bVar4));
                                    android.view.View view5 = anchorMilestoneShareView2.f111579n;
                                    if (view5 == null) {
                                        kotlin.jvm.internal.o.o("saveBtn");
                                        throw null;
                                    }
                                    ym5.a1.h(view5, new gf2.m(anchorMilestoneShareView2));
                                    android.view.View view6 = anchorMilestoneShareView2.f111579n;
                                    if (view6 == null) {
                                        kotlin.jvm.internal.o.o("saveBtn");
                                        throw null;
                                    }
                                    view6.setOnClickListener(new gf2.o(anchorMilestoneShareView2));
                                    android.view.View view7 = anchorMilestoneShareView2.f111580o;
                                    if (view7 == null) {
                                        kotlin.jvm.internal.o.o("shareBtn");
                                        throw null;
                                    }
                                    ym5.a1.h(view7, new gf2.p(anchorMilestoneShareView2));
                                    android.view.View view8 = anchorMilestoneShareView2.f111580o;
                                    if (view8 == null) {
                                        kotlin.jvm.internal.o.o("shareBtn");
                                        throw null;
                                    }
                                    view8.setOnClickListener(new gf2.r(anchorMilestoneShareView2));
                                    cVar4.f252403n = anchorMilestoneShareView2;
                                    relativeLayout3.removeAllViews();
                                    com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView3 = cVar4.f252403n;
                                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                                    layoutParams.addRule(13, -1);
                                    viewGroup = relativeLayout3;
                                    viewGroup.addView(anchorMilestoneShareView3, layoutParams);
                                }
                            }
                        } else {
                            str = H1;
                            v3Var = v3Var2;
                            str2 = str11;
                            cls = mm2.e1.class;
                            viewGroup = relativeLayout;
                            f0Var = f0Var4;
                        }
                        viewGroup.setVisibility(0);
                        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                        ml2.t1 t1Var = ml2.t1.f327979q2;
                        long j17 = ((mm2.e1) v3Var.P0(cls)).f328988r.getLong(0);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("milestone", str2);
                        r0Var.mk(t1Var, str, j17, hashMap);
                        f0Var3 = f0Var;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("FinderLiveAnchorMilestoneShareController", "showCard ignored: neither anchor nor co-live invitee");
                }
            }
            str = H1;
            v3Var = v3Var2;
            str2 = str11;
            cls = mm2.e1.class;
            f0Var = f0Var4;
            ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.t1 t1Var2 = ml2.t1.f327979q2;
            long j172 = ((mm2.e1) v3Var.P0(cls)).f328988r.getLong(0);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("milestone", str2);
            r0Var2.mk(t1Var2, str, j172, hashMap2);
            f0Var3 = f0Var;
        } else {
            str = H1;
        }
        if (f0Var3 == null) {
            com.tencent.mars.xlog.Log.e("Finder.LiveAnchorAfterPlugin", "clickShareMilestone: finder contact is null, username=" + str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$insertMilestoneInfoPanel$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
