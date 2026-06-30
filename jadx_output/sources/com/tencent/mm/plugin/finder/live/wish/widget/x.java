package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class x extends com.tencent.mm.plugin.finder.live.wish.widget.a {
    public android.view.View A;
    public android.widget.LinearLayout B;

    /* renamed from: n, reason: collision with root package name */
    public final kn2.c f120798n;

    /* renamed from: o, reason: collision with root package name */
    public final kn2.d f120799o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f120800p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.wish.view.x f120801q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120802r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f120803s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f120804t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f120805u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f120806v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f120807w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f120808x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f120809y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f120810z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, androidx.lifecycle.y owner, kn2.c serviceLive, kn2.d viewEvent) {
        super(context, owner, false, true);
        android.view.View view;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(serviceLive, "serviceLive");
        kotlin.jvm.internal.o.g(viewEvent, "viewEvent");
        this.f120798n = serviceLive;
        this.f120799o = viewEvent;
        if (context.getResources().getConfiguration().orientation == 2) {
            wd2.g gVar = this.f118384g;
            android.view.View findViewById = (gVar == null || (view = gVar.f444837d) == null) ? null : view.findViewById(com.tencent.mm.R.id.f6b);
            if (findViewById != null) {
                findViewById.setRotation(0.0f);
            }
        }
        android.view.View findViewById2 = this.f118384g.f444836c.b().getDecorView().findViewById(com.tencent.mm.R.id.jhc);
        if (findViewById2 != null) {
            findViewById2.setImportantForAccessibility(2);
        }
        android.view.View findViewById3 = this.f118384g.f444837d.findViewById(com.tencent.mm.R.id.f6b);
        if (findViewById3 == null) {
            return;
        }
        findViewById3.setContentDescription(context.getString(com.tencent.mm.R.string.ekn));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488854ao0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.ekm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        ln2.e eVar = (ln2.e) obj;
        com.tencent.mars.xlog.Log.i("WishAudiencePanelWidget", "onChanged: " + eVar);
        int i17 = 1;
        if (eVar != null && eVar.f319885b) {
            r45.vu1 vu1Var = eVar.f319884a;
            if (vu1Var != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f120800p;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.o.o("giftPanelLayout");
                    throw null;
                }
                constraintLayout.removeAllViews();
                java.util.LinkedList list = vu1Var.getList(1);
                if (list == null || list.isEmpty()) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f120800p;
                    if (constraintLayout2 == null) {
                        kotlin.jvm.internal.o.o("giftPanelLayout");
                        throw null;
                    }
                    constraintLayout2.setVisibility(8);
                    android.view.View view = this.f120804t;
                    if (view == null) {
                        kotlin.jvm.internal.o.o("subTitleView");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.LinkedList<r45.z94> list2 = vu1Var.getList(1);
                    kotlin.jvm.internal.o.f(list2, "getWish_list(...)");
                    for (r45.z94 z94Var : list2) {
                        kotlin.jvm.internal.o.d(z94Var);
                        com.tencent.mm.plugin.finder.live.wish.widget.s sVar = new com.tencent.mm.plugin.finder.live.wish.widget.s(this, z94Var, new com.tencent.mm.plugin.finder.live.wish.widget.u(this, eVar.f319884a));
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.f120800p;
                        if (constraintLayout3 == null) {
                            kotlin.jvm.internal.o.o("giftPanelLayout");
                            throw null;
                        }
                        android.view.View rootView = sVar.f120770c;
                        kotlin.jvm.internal.o.f(rootView, "rootView");
                        constraintLayout3.addView(rootView);
                    }
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = this.f120800p;
                    if (constraintLayout4 == null) {
                        kotlin.jvm.internal.o.o("giftPanelLayout");
                        throw null;
                    }
                    constraintLayout4.setVisibility(0);
                    android.view.View view2 = this.f120804t;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("subTitleView");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = this.f120800p;
            if (constraintLayout5 == null) {
                kotlin.jvm.internal.o.o("giftPanelLayout");
                throw null;
            }
            z(constraintLayout5);
        }
        boolean z17 = eVar != null && eVar.f319887d;
        android.content.Context context = this.f118381d;
        if (z17) {
            dk2.z7 z7Var = eVar.f319886c;
            if (z7Var != null) {
                boolean z18 = z7Var.f234425b;
                if (z18) {
                    ln2.a aVar = ln2.b.f319876a;
                    r45.c04 c04Var = z7Var.f234424a;
                    if (aVar.a(c04Var)) {
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f120805u;
                        if (weImageView == null) {
                            kotlin.jvm.internal.o.o("interactionWishIcon");
                            throw null;
                        }
                        weImageView.setImageResource(aVar.c((int) c04Var.getLong(0), com.tencent.mm.R.raw.finder_live_thumb_filled));
                        zl2.r4 r4Var = zl2.r4.f473950a;
                        java.lang.String S = zl2.r4.S(r4Var, c04Var.getLong(2), 0, 2, null);
                        java.lang.String S2 = zl2.r4.S(r4Var, c04Var.getLong(1), 0, 2, null);
                        android.widget.TextView textView = this.f120806v;
                        if (textView == null) {
                            kotlin.jvm.internal.o.o("interactionWishDesc");
                            throw null;
                        }
                        android.content.Context context2 = this.f118381d;
                        int i18 = (int) c04Var.getLong(0);
                        java.lang.String string = c04Var.getString(4);
                        textView.setText(ln2.a.b(aVar, context2, i18, S2, string == null ? "" : string, null, 16, null));
                        android.widget.TextView textView2 = this.f120807w;
                        if (textView2 == null) {
                            kotlin.jvm.internal.o.o("interactionWishCurrentCount");
                            throw null;
                        }
                        textView2.setText(S);
                        android.widget.TextView textView3 = this.f120808x;
                        if (textView3 == null) {
                            kotlin.jvm.internal.o.o("interactionWishTargetCount");
                            throw null;
                        }
                        textView3.setText("/".concat(S2));
                        android.widget.TextView textView4 = this.f120810z;
                        if (textView4 == null) {
                            kotlin.jvm.internal.o.o("interactionWishActionBtn");
                            throw null;
                        }
                        int i19 = (int) c04Var.getLong(0);
                        kotlin.jvm.internal.o.g(context, "context");
                        if (i19 == 1) {
                            str = context.getString(com.tencent.mm.R.string.oqz);
                            kotlin.jvm.internal.o.f(str, "getString(...)");
                        } else if (i19 == 2) {
                            str = context.getString(com.tencent.mm.R.string.oqo);
                            kotlin.jvm.internal.o.f(str, "getString(...)");
                        } else if (i19 == 3) {
                            str = context.getString(com.tencent.mm.R.string.f493716or3);
                            kotlin.jvm.internal.o.f(str, "getString(...)");
                        } else {
                            com.tencent.mars.xlog.Log.w("InteractionWishDataHelper", "getInteractionTypeActionText: unknown interactionType=" + i19 + ", using defaultString=\"\"");
                            str = "";
                        }
                        textView4.setText(str);
                        android.view.View view3 = this.f120809y;
                        if (view3 == null) {
                            kotlin.jvm.internal.o.o("interactionWishLayout");
                            throw null;
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        f0Var = jz5.f0.f302826a;
                    }
                }
                com.tencent.mars.xlog.Log.i("WishAudiencePanelWidget", "hideInteractionWishLayout: enableFlag=" + z18);
                android.view.View view4 = this.f120809y;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("interactionWishLayout");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("WishAudiencePanelWidget", "hideInteractionWishLayout: data.interactionWishInfo is null");
                android.view.View view5 = this.f120809y;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("interactionWishLayout");
                    throw null;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (eVar != null && eVar.f319889f) {
            java.util.List<r45.hn> list3 = eVar.f319888e;
            if (list3 == null || list3.isEmpty()) {
                com.tencent.mars.xlog.Log.i("WishAudiencePanelWidget", "hideBoardEventLayout: entries is null or empty");
                android.view.View view6 = this.A;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("boardEventLayout");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.widget.LinearLayout linearLayout = this.B;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("boardEventListContainer");
                throw null;
            }
            linearLayout.removeAllViews();
            for (r45.hn hnVar : list3) {
                android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
                android.widget.LinearLayout linearLayout2 = this.B;
                if (linearLayout2 == null) {
                    kotlin.jvm.internal.o.o("boardEventListContainer");
                    throw null;
                }
                android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488864e94, (android.view.ViewGroup) linearLayout2, false);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.tgm);
                android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.tgl);
                android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.tgk);
                java.lang.String string2 = hnVar.getString(0);
                if (string2 == null) {
                    string2 = "";
                }
                textView5.setText(string2);
                java.lang.String string3 = hnVar.getString(i17);
                if (string3 == null) {
                    string3 = "";
                }
                textView6.setText(string3);
                java.lang.String string4 = hnVar.getString(3);
                if (((string4 == null || string4.length() == 0) ? i17 : 0) == 0) {
                    imageView.setVisibility(0);
                    ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(string4, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
                } else {
                    imageView.setVisibility(8);
                }
                inflate.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.widget.t(hnVar, this));
                android.widget.LinearLayout linearLayout3 = this.B;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.o.o("boardEventListContainer");
                    throw null;
                }
                linearLayout3.addView(inflate);
                i17 = 1;
            }
            android.view.View view7 = this.A;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("boardEventLayout");
                throw null;
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/wish/widget/WishAudiencePanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAudiencePanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.pn7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120802r = (com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView) findViewById;
        android.content.Context context = this.f118381d;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b1j, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f120803s = inflate;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.frh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120800p = (androidx.constraintlayout.widget.ConstraintLayout) findViewById2;
        android.view.View view = this.f120803s;
        if (view == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.fri);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f120804t = findViewById3;
        android.view.View view2 = this.f120803s;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.tj6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f120805u = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View view3 = this.f120803s;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById5 = view3.findViewById(com.tencent.mm.R.id.f484678tj3);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f120806v = (android.widget.TextView) findViewById5;
        android.view.View view4 = this.f120803s;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById6 = view4.findViewById(com.tencent.mm.R.id.f484677tj2);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f120807w = (android.widget.TextView) findViewById6;
        android.view.View view5 = this.f120803s;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById7 = view5.findViewById(com.tencent.mm.R.id.tjk);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f120808x = (android.widget.TextView) findViewById7;
        android.view.View view6 = this.f120803s;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById8 = view6.findViewById(com.tencent.mm.R.id.tj7);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f120809y = findViewById8;
        android.view.View view7 = this.f120803s;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById9 = view7.findViewById(com.tencent.mm.R.id.u5d);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.f120810z = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.widget.v(this));
        android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488865e95, (android.view.ViewGroup) null, false);
        android.view.View findViewById10 = inflate2.findViewById(com.tencent.mm.R.id.tgn);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.A = findViewById10;
        android.view.View findViewById11 = inflate2.findViewById(com.tencent.mm.R.id.tgo);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.B = (android.widget.LinearLayout) findViewById11;
        if (this.f120801q == null) {
            this.f120801q = new com.tencent.mm.plugin.finder.live.wish.view.x();
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) rootView.findViewById(com.tencent.mm.R.id.f3v);
        android.view.View inflate3 = viewStub != null ? viewStub.inflate() : null;
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120801q;
        if (xVar != null) {
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = this.f120802r;
            if (maxHeightWxRecyclerView == null) {
                kotlin.jvm.internal.o.o("contentRv");
                throw null;
            }
            android.view.View view8 = this.f120803s;
            if (view8 == null) {
                kotlin.jvm.internal.o.o("wishHeaderView");
                throw null;
            }
            xVar.f(maxHeightWxRecyclerView, view8, inflate3, new com.tencent.mm.plugin.finder.live.wish.widget.w(this));
        }
        com.tencent.mm.plugin.finder.live.wish.view.x xVar2 = this.f120801q;
        if (xVar2 == null || (wxRecyclerAdapter = xVar2.f120665b) == null) {
            return;
        }
        wxRecyclerAdapter.O(inflate2, 4, false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120801q;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120801q;
        if (xVar != null) {
            xVar.f120680q.alive();
        }
        com.tencent.mm.plugin.finder.live.wish.view.x xVar2 = this.f120801q;
        if (xVar2 != null) {
            xVar2.k(this.f120683m);
        }
        super.w();
    }
}
