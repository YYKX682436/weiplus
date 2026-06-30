package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class q extends com.tencent.mm.plugin.finder.live.wish.widget.a {
    public android.view.View A;
    public android.view.View B;
    public android.widget.LinearLayout C;

    /* renamed from: n, reason: collision with root package name */
    public final kn2.d f120749n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f120750o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f120751p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView f120752q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.wish.view.x f120753r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f120754s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f120755t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f120756u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f120757v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f120758w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f120759x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f120760y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f120761z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, androidx.lifecycle.y owner, kn2.c serviceLive, kn2.d viewEvent) {
        super(context, owner, false, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(serviceLive, "serviceLive");
        kotlin.jvm.internal.o.g(viewEvent, "viewEvent");
        this.f120749n = viewEvent;
    }

    public final void A(boolean z17) {
        android.view.View view = this.A;
        if (view == null) {
            kotlin.jvm.internal.o.o("finderLiveWishEditTipsGroup");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        android.content.Context context = this.f118381d;
        if (z17) {
            layoutParams2.f10893h = -1;
            android.view.View view2 = this.f120761z;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("interactionWishLayout");
                throw null;
            }
            layoutParams2.f10895i = view2.getId();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479718db);
        } else {
            layoutParams2.f10893h = 0;
            layoutParams2.f10895i = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        }
        android.view.View view3 = this.A;
        if (view3 != null) {
            view3.setLayoutParams(layoutParams2);
        } else {
            kotlin.jvm.internal.o.o("finderLiveWishEditTipsGroup");
            throw null;
        }
    }

    public final void B() {
        android.view.View view = this.f120761z;
        if (view == null) {
            kotlin.jvm.internal.o.o("interactionWishLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "hideInteractionWishLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "hideInteractionWishLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        A(false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        android.widget.TextView textView = new android.widget.TextView(this.f118381d);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo));
        com.tencent.mm.ui.fk.a(textView);
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.dkb));
        return textView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.anp;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ln2.d dVar;
        java.lang.String str;
        java.lang.Integer num;
        java.lang.String str2;
        pf5.u uVar;
        android.content.Context context;
        java.lang.Class<mn2.i4> cls;
        java.lang.Class<zy2.b6> cls2;
        java.lang.Integer num2;
        java.lang.String str3;
        java.lang.Class<mn2.i4> cls3;
        pf5.u uVar2;
        java.lang.Class<zy2.b6> cls4;
        java.lang.Throwable th6;
        java.lang.Object obj2;
        ln2.d dVar2;
        pf5.u uVar3;
        java.lang.Class<mn2.i4> cls5;
        java.lang.Class<zy2.b6> cls6;
        int i17;
        r45.kv1 kv1Var;
        int i18;
        int i19;
        ln2.d dVar3 = (ln2.d) obj;
        java.lang.String str4 = "WishAnchorPanelWidget";
        com.tencent.mars.xlog.Log.i("WishAnchorPanelWidget", "onChanged: " + dVar3);
        int i27 = 0;
        java.lang.Integer num3 = 0;
        boolean z17 = dVar3 != null && dVar3.f319879b;
        pf5.u uVar4 = pf5.u.f353936a;
        java.lang.Class<mn2.i4> cls7 = mn2.i4.class;
        java.lang.Class<zy2.b6> cls8 = zy2.b6.class;
        android.content.Context context2 = this.f118381d;
        java.lang.String str5 = "";
        if (z17) {
            r45.vu1 vu1Var = dVar3.f319878a;
            if (vu1Var != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f120750o;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.o.o("giftPanelLayout");
                    throw null;
                }
                constraintLayout.removeAllViews();
                if (vu1Var.getLong(3) >= vu1Var.getLong(2)) {
                    x("", "");
                    android.view.View view = this.f120756u;
                    if (view == null) {
                        kotlin.jvm.internal.o.o("allFinishGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(num3);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = this.f120755t;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("sumValueGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (vu1Var.getLong(2) == 0) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.f120750o;
                        if (constraintLayout2 == null) {
                            kotlin.jvm.internal.o.o("giftPanelLayout");
                            throw null;
                        }
                        constraintLayout2.setVisibility(8);
                        android.view.View view3 = this.f120755t;
                        if (view3 == null) {
                            kotlin.jvm.internal.o.o("sumValueGroup");
                            throw null;
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view4 = this.f120756u;
                        if (view4 == null) {
                            kotlin.jvm.internal.o.o("allFinishGroup");
                            throw null;
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    android.view.View view5 = this.f120756u;
                    if (view5 == null) {
                        kotlin.jvm.internal.o.o("allFinishGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view6 = this.f120755t;
                    if (view6 == null) {
                        kotlin.jvm.internal.o.o("sumValueGroup");
                        throw null;
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(num3);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleRewardWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.f120750o;
                    if (constraintLayout3 == null) {
                        kotlin.jvm.internal.o.o("giftPanelLayout");
                        throw null;
                    }
                    constraintLayout3.setVisibility(0);
                }
                java.lang.String string = context2.getResources().getString(com.tencent.mm.R.string.ekt);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                this.f118384g.d(string);
                java.util.LinkedList list = vu1Var.getList(1);
                kotlin.jvm.internal.o.f(list, "getWish_list(...)");
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.kv1 kv1Var2 = (r45.kv1) ((r45.z94) obj2).getCustom(i27);
                    if (kv1Var2 != null) {
                        i19 = kv1Var2.getInteger(12);
                        i18 = 8;
                    } else {
                        i18 = 8;
                        i19 = 0;
                    }
                    if (pm0.v.z(i19, i18)) {
                        break;
                    } else {
                        i27 = 0;
                    }
                }
                boolean z18 = obj2 != null;
                int i28 = 1;
                java.util.LinkedList list2 = vu1Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getWish_list(...)");
                java.util.Iterator it6 = list2.iterator();
                int i29 = 0;
                while (it6.hasNext()) {
                    r45.z94 z94Var = (r45.z94) it6.next();
                    long j17 = z94Var.getLong(i28);
                    r45.kv1 kv1Var3 = (r45.kv1) z94Var.getCustom(0);
                    float f17 = kv1Var3 != null ? kv1Var3.getFloat(9) : 0.0f;
                    java.lang.String str6 = str5;
                    java.util.Iterator it7 = it6;
                    int i37 = i29 + ((int) (f17 * j17));
                    android.view.LayoutInflater from = android.view.LayoutInflater.from(context2);
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = this.f120750o;
                    if (constraintLayout4 == null) {
                        kotlin.jvm.internal.o.o("giftPanelLayout");
                        throw null;
                    }
                    android.view.View inflate = from.inflate(com.tencent.mm.R.layout.ann, (android.view.ViewGroup) constraintLayout4, false);
                    android.widget.ImageView giftView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f0o);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484648f11);
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.pn8);
                    android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487739pn4);
                    android.content.Context context3 = context2;
                    android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mlf);
                    java.lang.Integer num4 = num3;
                    android.view.View tagView = inflate.findViewById(com.tencent.mm.R.id.f3g);
                    java.lang.String str7 = str4;
                    inflate.setId(z94Var.hashCode());
                    r45.kv1 kv1Var4 = (r45.kv1) z94Var.getCustom(0);
                    if (kv1Var4 != null) {
                        dVar2 = dVar3;
                        cls5 = cls7;
                        uVar3 = uVar4;
                        cls6 = cls8;
                        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar4.e(cls8).c(cls7))).H).getValue()).a(new mn2.q3(kv1Var4.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f));
                        kotlin.jvm.internal.o.f(giftView, "giftView");
                        ((wo0.b) a17).c(giftView);
                        i17 = 8;
                        textView.setText(kv1Var4.getString(8));
                    } else {
                        dVar2 = dVar3;
                        uVar3 = uVar4;
                        cls5 = cls7;
                        cls6 = cls8;
                        i17 = 8;
                    }
                    textView4.setVisibility(i17);
                    textView2.setText("/" + z94Var.getLong(1));
                    long j18 = z94Var.getLong(2);
                    textView3.setText(j18 > 1000000 ? "100万+" : java.lang.String.valueOf(j18));
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    kotlin.jvm.internal.o.f(tagView, "tagView");
                    r45.kv1 kv1Var5 = (r45.kv1) z94Var.getCustom(0);
                    r4Var.P2(tagView, kv1Var5 != null ? ce2.i.U1.b(kv1Var5) : null);
                    if (z18 && (kv1Var = (r45.kv1) z94Var.getCustom(0)) != null) {
                        if (pm0.v.z(kv1Var.getInteger(12), 8)) {
                            textView4.setVisibility(0);
                        } else {
                            textView4.setVisibility(4);
                        }
                    }
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = this.f120750o;
                    if (constraintLayout5 == null) {
                        kotlin.jvm.internal.o.o("giftPanelLayout");
                        throw null;
                    }
                    constraintLayout5.addView(inflate);
                    it6 = it7;
                    i29 = i37;
                    str5 = str6;
                    context2 = context3;
                    num3 = num4;
                    str4 = str7;
                    dVar3 = dVar2;
                    cls7 = cls5;
                    uVar4 = uVar3;
                    cls8 = cls6;
                    i28 = 1;
                }
                dVar = dVar3;
                str = str4;
                num = num3;
                str2 = str5;
                uVar = uVar4;
                context = context2;
                cls = cls7;
                cls2 = cls8;
                th6 = null;
                android.widget.TextView textView5 = this.f120754s;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("sumValueText");
                    throw null;
                }
                textView5.setText(java.lang.String.valueOf(i29));
            } else {
                dVar = dVar3;
                str = "WishAnchorPanelWidget";
                num = num3;
                str2 = "";
                uVar = uVar4;
                context = context2;
                cls = cls7;
                cls2 = cls8;
                th6 = null;
            }
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = this.f120750o;
            if (constraintLayout6 == null) {
                kotlin.jvm.internal.o.o("giftPanelLayout");
                throw th6;
            }
            z(constraintLayout6);
        } else {
            dVar = dVar3;
            str = "WishAnchorPanelWidget";
            num = num3;
            str2 = "";
            uVar = uVar4;
            context = context2;
            cls = cls7;
            cls2 = cls8;
        }
        ln2.d dVar4 = dVar;
        if (dVar != null && dVar4.f319881d) {
            r45.xs1 xs1Var = dVar4.f319880c;
            if (xs1Var == null) {
                str3 = str;
                com.tencent.mars.xlog.Log.i(str3, "handleInteractionWishUpdate hideInteractionWishLayout: data.interactionWishResp is null");
                B();
            } else {
                str3 = str;
                if (xs1Var.getBoolean(3)) {
                    r45.c04 c04Var = (r45.c04) xs1Var.getCustom(1);
                    if (c04Var == null) {
                        com.tencent.mars.xlog.Log.w(str3, "handleInteractionWishUpdate hideInteractionWishLayout: cur_wish_config is null");
                        B();
                    } else {
                        ln2.a aVar = ln2.b.f319876a;
                        if (aVar.a(c04Var)) {
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f120757v;
                            if (weImageView == null) {
                                kotlin.jvm.internal.o.o("interactionWishIcon");
                                throw null;
                            }
                            weImageView.setImageResource(aVar.c((int) c04Var.getLong(0), com.tencent.mm.R.raw.finder_live_thumb_filled));
                            zl2.r4 r4Var2 = zl2.r4.f473950a;
                            java.lang.String S = zl2.r4.S(r4Var2, c04Var.getLong(2), 0, 2, null);
                            java.lang.String S2 = zl2.r4.S(r4Var2, c04Var.getLong(1), 0, 2, null);
                            android.widget.TextView textView6 = this.f120758w;
                            if (textView6 == null) {
                                kotlin.jvm.internal.o.o("interactionWishDesc");
                                throw null;
                            }
                            android.content.Context context4 = this.f118381d;
                            int i38 = (int) c04Var.getLong(0);
                            java.lang.String string2 = c04Var.getString(4);
                            textView6.setText(ln2.a.b(aVar, context4, i38, S2, string2 == null ? str2 : string2, null, 16, null));
                            android.widget.TextView textView7 = this.f120759x;
                            if (textView7 == null) {
                                kotlin.jvm.internal.o.o("interactionWishCurrentCount");
                                throw null;
                            }
                            textView7.setText(S);
                            android.widget.TextView textView8 = this.f120760y;
                            if (textView8 == null) {
                                kotlin.jvm.internal.o.o("interactionWishTargetCount");
                                throw null;
                            }
                            textView8.setText("/".concat(S2));
                            android.view.View view7 = this.f120761z;
                            if (view7 == null) {
                                kotlin.jvm.internal.o.o("interactionWishLayout");
                                throw null;
                            }
                            java.util.ArrayList arrayList7 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            num2 = num;
                            arrayList7.add(num2);
                            java.util.Collections.reverse(arrayList7);
                            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                            yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleInteractionWishUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            A(true);
                        } else {
                            com.tencent.mars.xlog.Log.w(str3, "handleInteractionWishUpdate hideInteractionWishLayout: invalid wish config.");
                            B();
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(str3, "handleInteractionWishUpdate hideInteractionWishLayout: enableFlag=" + xs1Var.getBoolean(3));
                    B();
                }
            }
            num2 = num;
        } else {
            num2 = num;
            str3 = str;
        }
        if (dVar4 != null && dVar4.f319883f) {
            java.util.List<r45.hn> list3 = dVar4.f319882e;
            if (list3 == null || list3.isEmpty()) {
                com.tencent.mars.xlog.Log.i(str3, "hideBoardEventLayout: entries is null or empty");
                android.view.View view8 = this.B;
                if (view8 == null) {
                    kotlin.jvm.internal.o.o("boardEventLayout");
                    throw null;
                }
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.widget.LinearLayout linearLayout = this.C;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("boardEventListContainer");
                throw null;
            }
            linearLayout.removeAllViews();
            for (r45.hn hnVar : list3) {
                android.view.LayoutInflater from2 = android.view.LayoutInflater.from(context);
                android.widget.LinearLayout linearLayout2 = this.C;
                if (linearLayout2 == null) {
                    kotlin.jvm.internal.o.o("boardEventListContainer");
                    throw null;
                }
                android.view.View inflate2 = from2.inflate(com.tencent.mm.R.layout.f488864e94, (android.view.ViewGroup) linearLayout2, false);
                android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.tgm);
                android.widget.TextView textView9 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.tgl);
                android.widget.TextView textView10 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.tgk);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.tgj);
                android.content.Context context5 = context;
                textView9.setTextColor(b3.l.getColor(context5, com.tencent.mm.R.color.FG_0));
                textView10.setTextColor(b3.l.getColor(context5, com.tencent.mm.R.color.FG_1));
                weImageView2.setIconColor(b3.l.getColor(context5, com.tencent.mm.R.color.FG_1));
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                gradientDrawable.setColor(167772160);
                gradientDrawable.setCornerRadius(context5.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv));
                inflate2.setBackground(gradientDrawable);
                java.lang.String string3 = hnVar.getString(0);
                if (string3 == null) {
                    string3 = str2;
                }
                textView9.setText(string3);
                java.lang.String string4 = hnVar.getString(1);
                if (string4 == null) {
                    string4 = str2;
                }
                textView10.setText(string4);
                java.lang.String string5 = hnVar.getString(3);
                if (string5 == null || string5.length() == 0) {
                    cls3 = cls;
                    uVar2 = uVar;
                    cls4 = cls2;
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                    uVar2 = uVar;
                    cls4 = cls2;
                    cls3 = cls;
                    ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar2.e(cls4).c(cls3))).H).getValue()).a(new mn2.q3(string5, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
                }
                inflate2.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.widget.o(hnVar, this));
                android.widget.LinearLayout linearLayout3 = this.C;
                if (linearLayout3 == null) {
                    kotlin.jvm.internal.o.o("boardEventListContainer");
                    throw null;
                }
                linearLayout3.addView(inflate2);
                uVar = uVar2;
                context = context5;
                cls2 = cls4;
                cls = cls3;
            }
            android.view.View view9 = this.B;
            if (view9 == null) {
                kotlin.jvm.internal.o.o("boardEventLayout");
                throw null;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList9.add(num2);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/wish/widget/WishAnchorPanelWidget", "handleBoardEventUpdate", "(Lcom/tencent/mm/plugin/finder/live/wish/data/WishAnchorPanelData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.pn7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f120752q = (com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView) findViewById;
        android.content.Context context = this.f118381d;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.anq, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f120751p = inflate;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.frh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f120750o = (androidx.constraintlayout.widget.ConstraintLayout) findViewById2;
        android.view.View view = this.f120751p;
        if (view == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f487719pk1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f120754s = (android.widget.TextView) findViewById3;
        android.view.View view2 = this.f120751p;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.frj);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f120755t = findViewById4;
        android.view.View view3 = this.f120751p;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById5 = view3.findViewById(com.tencent.mm.R.id.fre);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View view4 = this.f120751p;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById6 = view4.findViewById(com.tencent.mm.R.id.frd);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f120756u = findViewById6;
        android.view.View view5 = this.f120751p;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById7 = view5.findViewById(com.tencent.mm.R.id.tj6);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f120757v = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        android.view.View view6 = this.f120751p;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById8 = view6.findViewById(com.tencent.mm.R.id.f484678tj3);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f120758w = (android.widget.TextView) findViewById8;
        android.view.View view7 = this.f120751p;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById9 = view7.findViewById(com.tencent.mm.R.id.f484677tj2);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f120759x = (android.widget.TextView) findViewById9;
        android.view.View view8 = this.f120751p;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById10 = view8.findViewById(com.tencent.mm.R.id.tjk);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f120760y = (android.widget.TextView) findViewById10;
        android.view.View view9 = this.f120751p;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById11 = view9.findViewById(com.tencent.mm.R.id.tj7);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f120761z = findViewById11;
        android.view.View view10 = this.f120751p;
        if (view10 == null) {
            kotlin.jvm.internal.o.o("wishHeaderView");
            throw null;
        }
        android.view.View findViewById12 = view10.findViewById(com.tencent.mm.R.id.frk);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.A = findViewById12;
        android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488865e95, (android.view.ViewGroup) null, false);
        android.view.View findViewById13 = inflate2.findViewById(com.tencent.mm.R.id.tgn);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.B = findViewById13;
        android.view.View findViewById14 = inflate2.findViewById(com.tencent.mm.R.id.tgo);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.C = (android.widget.LinearLayout) findViewById14;
        android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.tgp);
        if (textView != null) {
            textView.setTextColor(b3.l.getColor(context, com.tencent.mm.R.color.FG_0));
        }
        if (this.f120753r == null) {
            this.f120753r = new com.tencent.mm.plugin.finder.live.wish.view.x();
        }
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120753r;
        if (xVar != null) {
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView maxHeightWxRecyclerView = this.f120752q;
            if (maxHeightWxRecyclerView == null) {
                kotlin.jvm.internal.o.o("contentRv");
                throw null;
            }
            android.view.View view11 = this.f120751p;
            if (view11 == null) {
                kotlin.jvm.internal.o.o("wishHeaderView");
                throw null;
            }
            xVar.f(maxHeightWxRecyclerView, view11, null, new com.tencent.mm.plugin.finder.live.wish.widget.p(this));
        }
        com.tencent.mm.plugin.finder.live.wish.view.x xVar2 = this.f120753r;
        if (xVar2 == null || (wxRecyclerAdapter = xVar2.f120665b) == null) {
            return;
        }
        wxRecyclerAdapter.O(inflate2, 4, false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120753r;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        a();
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = (com.tencent.mm.plugin.finder.live.plugin.wn0) this.f120749n;
        wn0Var.z1().E();
        ln2.d dVar = (ln2.d) wn0Var.x1().y().getValue();
        java.util.LinkedList linkedList = null;
        wn0Var.z1().F(dVar != null ? dVar.f319880c : null);
        r45.vu1 vu1Var = dVar != null ? dVar.f319878a : null;
        com.tencent.mm.plugin.finder.live.wish.widget.t0 z17 = wn0Var.z1();
        java.util.LinkedList list = vu1Var != null ? vu1Var.getList(1) : null;
        if (vu1Var != null) {
            if (!vu1Var.getBoolean(8)) {
                vu1Var = null;
            }
            if (vu1Var != null) {
                linkedList = vu1Var.getList(7);
            }
        }
        z17.G(list, linkedList);
        wn0Var.z1().w();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        com.tencent.mm.plugin.finder.live.wish.view.x xVar = this.f120753r;
        if (xVar != null) {
            xVar.f120680q.alive();
        }
        com.tencent.mm.plugin.finder.live.wish.view.x xVar2 = this.f120753r;
        if (xVar2 != null) {
            xVar2.k(this.f120683m);
        }
        super.w();
    }
}
