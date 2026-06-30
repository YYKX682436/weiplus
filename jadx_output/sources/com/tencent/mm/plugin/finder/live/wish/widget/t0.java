package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class t0 extends com.tencent.mm.plugin.finder.live.wish.widget.a implements kn2.b {
    public androidx.constraintlayout.widget.ConstraintLayout A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public com.tencent.mm.ui.widget.MMSwitchBtn D;
    public android.widget.TextView E;
    public android.widget.TextView F;
    public android.view.ViewGroup G;
    public android.view.ViewGroup H;
    public android.widget.ImageView I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f120776J;
    public com.tencent.mm.ui.widget.dialog.k0 K;

    /* renamed from: n, reason: collision with root package name */
    public final kn2.c f120777n;

    /* renamed from: o, reason: collision with root package name */
    public final kn2.d f120778o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.k0 f120779p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f120780q;

    /* renamed from: r, reason: collision with root package name */
    public r45.c04 f120781r;

    /* renamed from: s, reason: collision with root package name */
    public r45.c04 f120782s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f120783t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f120784u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedHashMap f120785v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedHashMap f120786w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f120787x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f120788y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.l f120789z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(android.content.Context r24, androidx.lifecycle.y r25, kn2.c r26, kn2.d r27, com.tencent.mm.plugin.finder.live.view.k0 r28) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.wish.widget.t0.<init>(android.content.Context, androidx.lifecycle.y, kn2.c, kn2.d, com.tencent.mm.plugin.finder.live.view.k0):void");
    }

    public final void A(ln2.f fVar) {
        android.view.View view;
        java.lang.String str;
        r45.kv1 kv1Var;
        java.lang.String string;
        r45.kv1 kv1Var2;
        java.lang.String str2;
        r45.kv1 kv1Var3;
        java.lang.String string2;
        r45.kv1 kv1Var4;
        java.lang.String str3;
        r45.kv1 kv1Var5;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.A;
        if (constraintLayout == null) {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
        int childCount = constraintLayout.getChildCount();
        java.lang.String str4 = "NULL_ITEM";
        if (childCount >= 0) {
            int i17 = 0;
            while (true) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.A;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.o.o("giftPanelLayout");
                    throw null;
                }
                android.view.View childAt = constraintLayout2.getChildAt(i17);
                java.lang.Object tag = childAt != null ? childAt.getTag() : null;
                if (fVar == null || (kv1Var5 = fVar.f319890a) == null || (str3 = kv1Var5.getString(0)) == null) {
                    str3 = "NULL_ITEM";
                }
                if (!kotlin.jvm.internal.o.b(tag, str3)) {
                    if (i17 == childCount) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.A;
                    if (constraintLayout3 == null) {
                        kotlin.jvm.internal.o.o("giftPanelLayout");
                        throw null;
                    }
                    view = constraintLayout3.getChildAt(i17);
                }
            }
        }
        view = null;
        if (view != null) {
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "add same view return data: " + fVar);
            return;
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = this.A;
        if (constraintLayout4 == null) {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
        int childCount2 = constraintLayout4.getChildCount();
        java.util.LinkedHashMap linkedHashMap = this.f120786w;
        java.util.LinkedHashMap linkedHashMap2 = this.f120785v;
        if (childCount2 != 3) {
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "addView contesxt: " + this.f118381d);
            com.tencent.mm.plugin.finder.live.wish.widget.y yVar = new com.tencent.mm.plugin.finder.live.wish.widget.y(this, fVar);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = this.A;
            if (constraintLayout5 == null) {
                kotlin.jvm.internal.o.o("giftPanelLayout");
                throw null;
            }
            android.view.View rootView = yVar.f120813e;
            kotlin.jvm.internal.o.f(rootView, "rootView");
            constraintLayout5.addView(rootView);
            if (fVar == null || (kv1Var2 = fVar.f319890a) == null || (str = kv1Var2.getString(0)) == null) {
                str = "NULL_ITEM";
            }
            linkedHashMap2.put(str, fVar);
            if (fVar != null && (kv1Var = fVar.f319890a) != null && (string = kv1Var.getString(0)) != null) {
                str4 = string;
            }
            linkedHashMap.put(str4, yVar);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add view size = MAX: ");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout6 = this.A;
        if (constraintLayout6 == null) {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
        sb6.append(constraintLayout6.getChildCount());
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", sb6.toString());
        linkedHashMap2.remove("NULL_ITEM");
        com.tencent.mm.plugin.finder.live.wish.widget.y yVar2 = (com.tencent.mm.plugin.finder.live.wish.widget.y) linkedHashMap.remove("NULL_ITEM");
        if (yVar2 != null) {
            if (fVar == null || (kv1Var4 = fVar.f319890a) == null || (str2 = kv1Var4.getString(0)) == null) {
                str2 = "NULL_ITEM";
            }
            linkedHashMap2.put(str2, fVar);
            yVar2.a(fVar);
            if (fVar != null && (kv1Var3 = fVar.f319890a) != null && (string2 = kv1Var3.getString(0)) != null) {
                str4 = string2;
            }
            linkedHashMap.put(str4, yVar2);
        }
    }

    public final void B() {
        android.widget.TextView textView = this.C;
        if (textView == null) {
            kotlin.jvm.internal.o.o("sumValueText");
            throw null;
        }
        textView.setText(java.lang.String.valueOf(D()));
        java.util.Collection values = this.f120785v.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        boolean z17 = !((java.util.ArrayList) kz5.n0.V(values)).isEmpty();
        kn2.d dVar = this.f120778o;
        boolean z18 = z17 || ((com.tencent.mm.plugin.finder.live.plugin.wn0) dVar).D1();
        android.view.View view = this.f118383f;
        if (!z18) {
            r45.c04 data = this.f120781r;
            kotlin.jvm.internal.o.g(data, "data");
            if (!(((data.getLong(1) > 0L ? 1 : (data.getLong(1) == 0L ? 0 : -1)) > 0 && (data.getLong(0) > ((long) 0) ? 1 : (data.getLong(0) == ((long) 0) ? 0 : -1)) > 0 && (data.getLong(0) > ((long) 3) ? 1 : (data.getLong(0) == ((long) 3) ? 0 : -1)) <= 0) || ((com.tencent.mm.plugin.finder.live.plugin.wn0) dVar).f114980w)) {
                kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
                android.widget.TextView textView2 = (android.widget.TextView) view;
                textView2.setTextColor(textView2.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                textView2.setEnabled(false);
                return;
            }
        }
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView3 = (android.widget.TextView) view;
        textView3.setTextColor(textView3.getContext().getResources().getColor(com.tencent.mm.R.color.aaz));
        textView3.setEnabled(true);
    }

    public final java.lang.String C() {
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        boolean z17 = false;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T7()) {
            z17 = true;
        }
        return z17 ? "startlive.more.anchorwish.interactionwish" : "anchorlive.more.anchorwish.interactionwish";
    }

    public final long D() {
        java.util.Iterator it = this.f120785v.entrySet().iterator();
        long j17 = 0;
        while (it.hasNext()) {
            ln2.f fVar = (ln2.f) ((java.util.Map.Entry) it.next()).getValue();
            if (fVar != null) {
                j17 += ((int) fVar.f319890a.getFloat(9)) * fVar.f319891b;
            }
        }
        return j17;
    }

    public final void E() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.A;
        if (constraintLayout == null) {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
        constraintLayout.removeAllViews();
        this.f120785v.clear();
        this.f120786w.clear();
        A(null);
        android.widget.TextView textView = this.C;
        if (textView == null) {
            kotlin.jvm.internal.o.o("sumValueText");
            throw null;
        }
        textView.setText(java.lang.String.valueOf(D()));
        I();
    }

    public final void F(r45.xs1 xs1Var) {
        r45.c04 c04Var;
        java.lang.String str;
        if (!((com.tencent.mm.plugin.finder.live.plugin.wn0) this.f120778o).C1()) {
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "updateCurrentInteractionWishPanel ignore as isInteractionWishSwitchEnable false");
            return;
        }
        if (xs1Var == null) {
            com.tencent.mars.xlog.Log.w("WishEditPanelWidget", "updateCurrentInteractionWishPanel with null configResp");
            return;
        }
        this.f120788y = xs1Var.getBoolean(7);
        java.util.LinkedList list = xs1Var.getList(5);
        kotlin.jvm.internal.o.f(list, "getEnable_config_interaction_type(...)");
        java.util.ArrayList arrayList = this.f120783t;
        arrayList.clear();
        java.util.Iterator it = list.iterator();
        while (true) {
            r45.b04 b04Var = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer num = (java.lang.Integer) it.next();
            kotlin.jvm.internal.o.d(num);
            int intValue = num.intValue();
            if (intValue == 0) {
                b04Var = r45.b04.kInteractionType_Unknown;
            } else if (intValue == 1) {
                b04Var = r45.b04.kInteractionType_Like;
            } else if (intValue == 2) {
                b04Var = r45.b04.kInteractionType_Comment;
            } else if (intValue == 3) {
                b04Var = r45.b04.kInteractionType_Share;
            }
            if (b04Var != null) {
                arrayList.add(b04Var);
            }
        }
        if (xs1Var.getBoolean(3)) {
            c04Var = (r45.c04) xs1Var.getCustom(1);
            if (c04Var == null) {
                com.tencent.mars.xlog.Log.w("WishEditPanelWidget", "getInteractionWishConfig with config " + xs1Var.getBoolean(3) + " but invalid wish config.");
                c04Var = new r45.c04();
            }
        } else {
            c04Var = new r45.c04();
        }
        H(c04Var);
        java.util.LinkedList list2 = xs1Var.getList(6);
        kotlin.jvm.internal.o.f(list2, "getDefault_wish_config_list(...)");
        java.util.HashMap hashMap = this.f120784u;
        hashMap.clear();
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            r45.c04 c04Var2 = (r45.c04) it6.next();
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "updateInteractionWishDefaultTarget add " + ((int) c04Var2.getLong(0)) + " -> " + c04Var2.getLong(1));
            hashMap.put(java.lang.Integer.valueOf((int) c04Var2.getLong(0)), java.lang.Long.valueOf(c04Var2.getLong(1)));
        }
        boolean z17 = xs1Var.getBoolean(4);
        r45.c04 c04Var3 = (r45.c04) xs1Var.getCustom(2);
        if (!z17) {
            android.widget.TextView textView = this.F;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("interactionWishRecommendDesc");
                throw null;
            }
        }
        if (c04Var3 != null) {
            if (c04Var3.getLong(1) > 0 && c04Var3.getLong(0) > ((long) 0) && c04Var3.getLong(0) <= ((long) 3)) {
                com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "updateInteractionWishRecommendTarget type:" + c04Var3.getLong(0) + ", target:" + c04Var3.getLong(1));
                this.f120782s = c04Var3;
                android.widget.TextView textView2 = this.F;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("interactionWishRecommendDesc");
                    throw null;
                }
                android.content.Context context = this.f118381d;
                android.content.res.Resources resources = context.getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                int i17 = (int) c04Var3.getLong(0);
                java.lang.String targetCount = zl2.r4.S(zl2.r4.f473950a, c04Var3.getLong(1), 0, 2, null);
                kotlin.jvm.internal.o.g(targetCount, "targetCount");
                if (i17 == 1) {
                    str = context.getString(com.tencent.mm.R.string.f493713or0, targetCount);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                } else if (i17 == 2) {
                    str = context.getString(com.tencent.mm.R.string.oqp, targetCount);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                } else if (i17 == 3) {
                    str = context.getString(com.tencent.mm.R.string.f493717or4, targetCount);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                } else {
                    com.tencent.mars.xlog.Log.w("InteractionWishDataHelper", "getInteractionTypeDescText: unknown interactionType=" + i17 + ", using defaultString=\"\"");
                    str = "";
                }
                objArr[0] = str;
                textView2.setText(resources.getString(com.tencent.mm.R.string.f493715or2, objArr));
                android.widget.TextView textView3 = this.F;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("interactionWishRecommendDesc");
                    throw null;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("WishEditPanelWidget", "updateInteractionWishRecommendTarget fail, recommendWishConfig invalid");
        android.widget.TextView textView4 = this.F;
        if (textView4 != null) {
            textView4.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("interactionWishRecommendDesc");
            throw null;
        }
    }

    public final void G(java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        java.util.LinkedList linkedList3;
        jz5.f0 f0Var;
        if (!((com.tencent.mm.plugin.finder.live.plugin.wn0) this.f120778o).B1()) {
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "updateGiftWishPanel ignore as isGiftEnable false");
            return;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.z94 z94Var = (r45.z94) it.next();
                r45.kv1 kv1Var = (r45.kv1) z94Var.getCustom(0);
                if (kv1Var != null) {
                    A(new ln2.f(kv1Var, z94Var.getLong(1), z94Var.getLong(2)));
                    I();
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateGiftWishRecommend called with recommendValue size: ");
        sb6.append(linkedList2 != null ? java.lang.Integer.valueOf(linkedList2.size()) : null);
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", sb6.toString());
        this.f120787x.clear();
        if (linkedList2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (((r45.kv1) ((r45.z94) obj).getCustom(0)) != null) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(new com.tencent.mm.plugin.finder.live.wish.widget.z((r45.z94) it6.next(), new android.text.SpannableString("")));
            }
            linkedList3 = new java.util.LinkedList(arrayList2);
        } else {
            linkedList3 = new java.util.LinkedList();
        }
        this.f120787x = linkedList3;
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "Created giftRecommendData with size: " + this.f120787x.size());
        int i17 = 0;
        for (java.lang.Object obj2 : this.f120787x) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.kv1 kv1Var2 = (r45.kv1) ((com.tencent.mm.plugin.finder.live.wish.widget.z) obj2).f120824a.getCustom(0);
            if (kv1Var2 != null) {
                java.lang.String string = kv1Var2.getString(2);
                com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "Loading recommend gift image[" + i17 + "] URL: " + string);
                if (string == null || string.length() == 0) {
                    com.tencent.mars.xlog.Log.w("WishEditPanelWidget", "Recommend gift image URL[" + i17 + "] is null or empty");
                    i17 = i18;
                } else {
                    try {
                        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                        a17.f447873d = new com.tencent.mm.plugin.finder.live.wish.widget.s0(i17, this);
                        ((wo0.b) a17).a();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("WishEditPanelWidget", "Exception when setting up image loader for[" + i17 + "] URL: " + string, e17);
                    }
                    f0Var = jz5.f0.f302826a;
                }
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("WishEditPanelWidget", "Recommend wish[" + i17 + "] has no gift data");
            }
            i17 = i18;
        }
        if (this.f120787x.isEmpty()) {
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "No recommend data available, hiding recommend desc");
            android.widget.TextView textView = this.B;
            if (textView == null) {
                kotlin.jvm.internal.o.o("giftRecommendDesc");
                throw null;
            }
            textView.setVisibility(8);
        }
        B();
    }

    public final void H(r45.c04 c04Var) {
        java.lang.String string;
        this.f120781r = c04Var;
        java.lang.String str = "";
        java.lang.String str2 = (this.f120788y || (string = c04Var.getString(4)) == null) ? "" : string;
        android.widget.TextView textView = this.E;
        if (textView == null) {
            kotlin.jvm.internal.o.o("interactionWishSelectorDesc");
            throw null;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(c04Var.getLong(1));
        java.lang.Long l17 = valueOf.longValue() > 0 ? valueOf : null;
        if (l17 != null) {
            java.lang.String b17 = ln2.a.b(ln2.b.f319876a, this.f118381d, (int) c04Var.getLong(0), zl2.r4.S(zl2.r4.f473950a, l17.longValue(), 0, 2, null), str2, null, 16, null);
            if (b17 != null) {
                str = b17;
            }
        }
        textView.setText(str);
        B();
    }

    public final void I() {
        com.tencent.mm.plugin.finder.live.wish.widget.y yVar = (com.tencent.mm.plugin.finder.live.wish.widget.y) this.f120786w.get("NULL_ITEM");
        if (yVar != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.A;
            if (constraintLayout == null) {
                kotlin.jvm.internal.o.o("giftPanelLayout");
                throw null;
            }
            android.view.View rootView = yVar.f120813e;
            kotlin.jvm.internal.o.f(rootView, "rootView");
            constraintLayout.removeView(rootView);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = this.A;
            if (constraintLayout2 == null) {
                kotlin.jvm.internal.o.o("giftPanelLayout");
                throw null;
            }
            kotlin.jvm.internal.o.f(rootView, "rootView");
            constraintLayout2.addView(rootView);
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = this.A;
        if (constraintLayout3 != null) {
            z(constraintLayout3);
        } else {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        return g();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        return f();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.anl;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getString(com.tencent.mm.R.string.ekt);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ln2.f fVar = (ln2.f) obj;
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "onChanged: " + fVar);
        A(fVar);
        I();
        B();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        boolean z17;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.frh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.A = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f487719pk1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.C = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f483015ud);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById3;
        this.D = mMSwitchBtn;
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            z17 = !pm0.v.z((int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q, 4194304);
        } else {
            z17 = false;
        }
        mMSwitchBtn.setCheck(z17);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.D;
        if (mMSwitchBtn2 == null) {
            kotlin.jvm.internal.o.o("giftWallSwitchBtn");
            throw null;
        }
        mMSwitchBtn2.setSwitchListener(new com.tencent.mm.plugin.finder.live.wish.widget.b0(this));
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.tiu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.H = (android.view.ViewGroup) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.tj7);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.G = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.tjj);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.E = (android.widget.TextView) findViewById6;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) rootView.findViewById(com.tencent.mm.R.id.sd8);
        if (weImageView != null) {
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.widget.c0(this));
        }
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.f484680tj5);
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.widget.d0(this));
        }
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.tjf);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.I = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.tje);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById9;
        this.F = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.widget.g0(this));
        android.view.View findViewById10 = rootView.findViewById(com.tencent.mm.R.id.tiv);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById10;
        this.B = textView2;
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.wish.widget.h0(this));
        android.widget.TextView textView3 = this.C;
        if (textView3 != null) {
            hc2.o.a(textView3, false);
        } else {
            kotlin.jvm.internal.o.o("sumValueText");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = (com.tencent.mm.plugin.finder.live.plugin.wn0) this.f120778o;
        if (wn0Var.B1()) {
            boolean D1 = wn0Var.D1();
            java.util.LinkedHashMap linkedHashMap = this.f120785v;
            kn2.c cVar = this.f120777n;
            boolean z17 = true;
            if (D1) {
                java.util.Collection values = linkedHashMap.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                if (((java.util.ArrayList) kz5.n0.V(values)).isEmpty()) {
                    com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var2 = (com.tencent.mm.plugin.finder.live.plugin.wn0) cVar;
                    wn0Var2.getClass();
                    com.tencent.mm.plugin.finder.live.util.y.m(wn0Var2, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.zm0(wn0Var2, true, null), 2, null);
                }
            }
            kotlin.jvm.internal.o.f(linkedHashMap.values(), "<get-values>(...)");
            if (!((java.util.ArrayList) kz5.n0.V(r0)).isEmpty()) {
                java.util.Collection values2 = linkedHashMap.values();
                kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
                java.util.LinkedList linkedList = new java.util.LinkedList(kz5.n0.V(values2));
                com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var3 = (com.tencent.mm.plugin.finder.live.plugin.wn0) cVar;
                wn0Var3.getClass();
                com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "createRewardWishList: " + wn0Var3.D1());
                r45.i82 i82Var = (r45.i82) ((mm2.f7) wn0Var3.P0(mm2.f7.class)).f329058f.getValue();
                if (i82Var != null && i82Var.getLong(2) < i82Var.getLong(1)) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mm.plugin.finder.live.util.y.m(wn0Var3, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.wm0(wn0Var3, linkedList, null), 2, null);
                } else {
                    com.tencent.mm.plugin.finder.live.util.y.m(wn0Var3, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.finder.live.plugin.vn0(wn0Var3, linkedList, null), 2, null);
                }
            }
        }
        a();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        kn2.d dVar = this.f120778o;
        if (((com.tencent.mm.plugin.finder.live.plugin.wn0) dVar).C1()) {
            android.view.ViewGroup viewGroup = this.G;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("interactionWishLayout");
                throw null;
            }
            viewGroup.setVisibility(0);
            java.lang.Integer num = 1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 3);
            if (num != null) {
                num.intValue();
                jSONObject.put("type", num.intValue());
            }
            jSONObject.put("sub_element", 1);
            jSONObject.put("sub_type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
        } else {
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "interactiveWish disable, hide interaction wish UI.");
            android.view.ViewGroup viewGroup2 = this.G;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("interactionWishLayout");
                throw null;
            }
            viewGroup2.setVisibility(8);
        }
        if (((com.tencent.mm.plugin.finder.live.plugin.wn0) dVar).B1()) {
            android.view.ViewGroup viewGroup3 = this.H;
            if (viewGroup3 == null) {
                kotlin.jvm.internal.o.o("giftWishLayout");
                throw null;
            }
            viewGroup3.setVisibility(0);
        } else {
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", "gift disable, hide gift wish UI.");
            android.view.ViewGroup viewGroup4 = this.H;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("giftWishLayout");
                throw null;
            }
            viewGroup4.setVisibility(8);
        }
        super.w();
    }
}
