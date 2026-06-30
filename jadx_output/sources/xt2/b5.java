package xt2;

/* loaded from: classes3.dex */
public final class b5 extends com.tencent.mm.plugin.finder.live.widget.g {
    public com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView A;
    public com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView B;
    public com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView C;
    public com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView D;
    public android.view.View E;
    public android.view.View F;
    public yz5.a G;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f456636h;

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f456637i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f456638m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f456639n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f456640o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f456641p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f456642q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f456643r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f456644s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f456645t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f456646u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f456647v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f456648w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f456649x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f456650y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f456651z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.ui.MMActivity activity, gk2.e buContext, int i17) {
        super(activity, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f456636h = activity;
        this.f456637i = buContext;
        r45.nt2 nt2Var = ((mm2.f6) buContext.a(mm2.f6.class)).E;
        if (nt2Var != null) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f456638m;
            if (mMSwitchBtn == null) {
                kotlin.jvm.internal.o.o("productReplaySwitchBtn");
                throw null;
            }
            mMSwitchBtn.setCheck(nt2Var.getInteger(0) == 1);
            android.view.View view = this.f456641p;
            if (view == null) {
                kotlin.jvm.internal.o.o("optionParent");
                throw null;
            }
            int i18 = nt2Var.getInteger(0) == 1 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int integer = nt2Var.getInteger(1);
            if (integer == 0) {
                android.view.View view2 = this.f456643r;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("autoChooseIcon");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (integer == 1) {
                android.view.View view3 = this.f456644s;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("manualChooseIcon");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initReplaySettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f456638m;
            if (mMSwitchBtn2 == null) {
                kotlin.jvm.internal.o.o("productReplaySwitchBtn");
                throw null;
            }
            mMSwitchBtn2.setSwitchListener(new xt2.r4(nt2Var, this));
            android.view.View view4 = this.f456645t;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("autoOptionView");
                throw null;
            }
            view4.setOnClickListener(new xt2.t4(this));
            android.view.View view5 = this.f456646u;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("manualOptionView");
                throw null;
            }
            view5.setOnClickListener(new xt2.v4(this));
        }
        r45.k31 k31Var = ((mm2.f6) buContext.a(mm2.f6.class)).W;
        r45.j31 j31Var = ((mm2.f6) buContext.a(mm2.f6.class)).Y;
        if (k31Var != null && k31Var.getInteger(0) == 1) {
            android.view.View view6 = this.f456648w;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("flashSaleSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FLASH_SALE_ENABLED_BOOLEAN_SYNC, true), j31Var);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = this.f456649x;
            if (mMSwitchBtn3 == null) {
                kotlin.jvm.internal.o.o("flashSaleSwitchBtn");
                throw null;
            }
            mMSwitchBtn3.setSwitchListener(new xt2.e4(this, j31Var));
        } else {
            android.view.View view7 = this.f456648w;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("flashSaleSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (j31Var != null && j31Var.getInteger(0) == 1) {
                android.view.View view8 = this.f456647v;
                if (view8 == null) {
                    kotlin.jvm.internal.o.o("flashSaleRecordBtn");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view9 = this.f456647v;
                if (view9 == null) {
                    kotlin.jvm.internal.o.o("flashSaleRecordBtn");
                    throw null;
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initFlashSaleSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view10 = this.f456647v;
        if (view10 == null) {
            kotlin.jvm.internal.o.o("flashSaleRecordBtn");
            throw null;
        }
        view10.setOnClickListener(new xt2.f4(this, j31Var));
        r45.yv2 yv2Var = ((mm2.f6) buContext.a(mm2.f6.class)).f329051x0;
        if (yv2Var != null) {
            android.view.View view11 = this.E;
            if (view11 == null) {
                kotlin.jvm.internal.o.o("productOrderContainer");
                throw null;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view11, arrayList8.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view12 = this.F;
            if (view12 == null) {
                kotlin.jvm.internal.o.o("insertOrderContainer");
                throw null;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view12, arrayList9.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initOrderSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            for (int i19 = 1; i19 < 5; i19++) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (dk2.ef.f233372a.x()) {
                    jSONObject.put("type", 21);
                    jSONObject.put("func_type", i19);
                    com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "report 21054, " + jSONObject);
                    i95.m c17 = i95.n0.c(ml2.j0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    zy2.zb.y6((zy2.zb) c17, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
                } else {
                    jSONObject.put("type", 10);
                    jSONObject.put("func_type", i19);
                    com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "report 21017, " + jSONObject);
                    i95.m c18 = i95.n0.c(zy2.zb.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    zy2.zb zbVar = (zy2.zb) c18;
                    ml2.c1 c1Var = ml2.c1.f327325e;
                    zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
                }
            }
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView = this.A;
            if (finderLiveProductListOptionView == null) {
                kotlin.jvm.internal.o.o("ascendingOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView.a(yv2Var.getInteger(0) == 1);
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView2 = this.B;
            if (finderLiveProductListOptionView2 == null) {
                kotlin.jvm.internal.o.o("descendingOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView2.a(yv2Var.getInteger(0) == 0);
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView3 = this.D;
            if (finderLiveProductListOptionView3 == null) {
                kotlin.jvm.internal.o.o("addToBottomOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView3.a(yv2Var.getInteger(1) == 1);
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView4 = this.C;
            if (finderLiveProductListOptionView4 == null) {
                kotlin.jvm.internal.o.o("addToTopOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView4.a(yv2Var.getInteger(1) == 0);
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView5 = this.A;
            if (finderLiveProductListOptionView5 == null) {
                kotlin.jvm.internal.o.o("ascendingOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView5.setOnClickListener(new xt2.h4(this));
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView6 = this.B;
            if (finderLiveProductListOptionView6 == null) {
                kotlin.jvm.internal.o.o("descendingOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView6.setOnClickListener(new xt2.j4(this));
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView7 = this.D;
            if (finderLiveProductListOptionView7 == null) {
                kotlin.jvm.internal.o.o("addToBottomOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView7.setOnClickListener(new xt2.l4(this));
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView finderLiveProductListOptionView8 = this.C;
            if (finderLiveProductListOptionView8 == null) {
                kotlin.jvm.internal.o.o("addToTopOptionBtn");
                throw null;
            }
            finderLiveProductListOptionView8.setOnClickListener(new xt2.n4(this));
        }
        if (((mm2.f6) this.f456637i.a(mm2.f6.class)).A1 == 1) {
            android.view.View view13 = this.f456650y;
            if (view13 == null) {
                kotlin.jvm.internal.o.o("prehotSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view13, arrayList10.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_PREHOT_ENABLED_BOOLEAN_SYNC, true);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn4 = this.f456651z;
            if (mMSwitchBtn4 == null) {
                kotlin.jvm.internal.o.o("prehotSwitchBtn");
                throw null;
            }
            mMSwitchBtn4.setCheck(o17);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn5 = this.f456651z;
            if (mMSwitchBtn5 == null) {
                kotlin.jvm.internal.o.o("prehotSwitchBtn");
                throw null;
            }
            mMSwitchBtn5.setSwitchListener(xt2.o4.f456923a);
        } else {
            android.view.View view14 = this.f456650y;
            if (view14 == null) {
                kotlin.jvm.internal.o.o("prehotSwitchItem");
                throw null;
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view14, arrayList11.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initPrehotSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r45.uv2 uv2Var = ((mm2.f6) this.f456637i.a(mm2.f6.class)).F;
        if (uv2Var != null) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn6 = this.f456639n;
            if (mMSwitchBtn6 == null) {
                kotlin.jvm.internal.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            mMSwitchBtn6.setCheck(uv2Var.getInteger(0) == 1);
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn7 = this.f456639n;
            if (mMSwitchBtn7 == null) {
                kotlin.jvm.internal.o.o("askForPromoteSwitchBtn");
                throw null;
            }
            mMSwitchBtn7.setSwitchListener(new xt2.c4(this));
        }
        r45.dv1 dv1Var = ((mm2.f6) this.f456637i.a(mm2.f6.class)).f329038n;
        if (dv1Var != null) {
            android.view.View view15 = this.f456642q;
            if (view15 == null) {
                kotlin.jvm.internal.o.o("presentParent");
                throw null;
            }
            bw5.q30 q30Var = (bw5.q30) dv1Var.getCustom(41);
            int i27 = (q30Var != null ? q30Var.f31920g[3] ? q30Var.f31919f : new bw5.x7() : null) != null ? 0 : 8;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view15, arrayList12.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initAnchorPresenterSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel", "initAnchorPresenterSettings", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view16 = this.f456642q;
            if (view16 == null) {
                kotlin.jvm.internal.o.o("presentParent");
                throw null;
            }
            view16.setOnClickListener(new xt2.a4(dv1Var, this));
        }
    }

    public static final void A(xt2.b5 b5Var, int i17, int i18, yz5.q qVar) {
        b5Var.getClass();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new xt2.a5(h0Var, b5Var, null), 2, null);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = b5Var.f456637i;
        dk2.xf k17 = efVar.k(eVar);
        if (k17 != null) {
            com.tencent.mm.ui.MMActivity mMActivity = b5Var.f456636h;
            long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
            long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
            java.lang.String str = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
            r45.hx0 hx0Var = new r45.hx0();
            r45.k12 k12Var = new r45.k12();
            k12Var.set(0, java.lang.Integer.valueOf(i17));
            k12Var.set(1, java.lang.Integer.valueOf(i18));
            hx0Var.set(1, hc2.b.a(k12Var));
            hx0Var.set(0, 104);
            ((dk2.r4) k17).a0(mMActivity, j17, j18, str, hx0Var, new xt2.z4(d17, h0Var, qVar, i17, i18));
        }
    }

    public static final void B(xt2.b5 b5Var, int i17) {
        b5Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (dk2.ef.f233372a.x()) {
            jSONObject.put("type", 22);
            jSONObject.put("func_type", i17);
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "report 21054, " + jSONObject);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
            return;
        }
        jSONObject.put("type", 11);
        jSONObject.put("func_type", i17);
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "report 21017, " + jSONObject);
        i95.m c18 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c18;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 6L, jSONObject.toString(), null, 4, null);
    }

    public static final void y(xt2.b5 b5Var, int i17, yz5.a aVar) {
        r45.yv2 yv2Var = ((mm2.f6) b5Var.f456637i.a(mm2.f6.class)).f329051x0;
        if (yv2Var == null || yv2Var.getInteger(1) == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "mod insert to " + i17);
        r45.hx0 hx0Var = new r45.hx0();
        r45.g12 g12Var = new r45.g12();
        g12Var.set(0, java.lang.Integer.valueOf(yv2Var.getInteger(0)));
        g12Var.set(1, java.lang.Integer.valueOf(i17));
        hx0Var.set(1, hc2.b.a(g12Var));
        hx0Var.set(0, 108);
        b5Var.D(hx0Var, aVar);
    }

    public static final void z(xt2.b5 b5Var, int i17, yz5.a aVar) {
        r45.yv2 yv2Var = ((mm2.f6) b5Var.f456637i.a(mm2.f6.class)).f329051x0;
        if (yv2Var == null || yv2Var.getInteger(0) == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "mod order to " + i17);
        r45.hx0 hx0Var = new r45.hx0();
        r45.g12 g12Var = new r45.g12();
        g12Var.set(0, java.lang.Integer.valueOf(i17));
        g12Var.set(1, java.lang.Integer.valueOf(yv2Var.getInteger(1)));
        hx0Var.set(1, hc2.b.a(g12Var));
        hx0Var.set(0, 108);
        b5Var.D(hx0Var, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r23.getInteger(0) == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(boolean r22, r45.j31 r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            com.tencent.mm.ui.widget.MMSwitchBtn r3 = r0.f456649x
            r4 = 0
            if (r3 == 0) goto Lb8
            r3.setCheck(r1)
            java.lang.String r3 = "flashSaleRecordBtn"
            r5 = 0
            if (r1 == 0) goto L6b
            if (r2 == 0) goto L1d
            int r1 = r2.getInteger(r5)
            r2 = 1
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r2 = r5
        L1e:
            if (r2 == 0) goto L6b
            android.view.View r1 = r0.f456647v
            if (r1 == 0) goto L67
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r7 = r2.toArray()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r9 = "enableFlashSale"
            java.lang.String r10 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            yj0.a.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r8 = "enableFlashSale"
            java.lang.String r9 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r1
            yj0.a.f(r6, r7, r8, r9, r10, r11, r12)
            goto Lb3
        L67:
            kotlin.jvm.internal.o.o(r3)
            throw r4
        L6b:
            android.view.View r1 = r0.f456647v
            if (r1 == 0) goto Lb4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r14 = r2.toArray()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r16 = "enableFlashSale"
            java.lang.String r17 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            yj0.a.d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingListMoreSettingPanel"
            java.lang.String r15 = "enableFlashSale"
            java.lang.String r16 = "(ZLcom/tencent/mm/protocal/protobuf/FinderFlashSaleOrderSetting;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r13 = r1
            yj0.a.f(r13, r14, r15, r16, r17, r18, r19)
        Lb3:
            return
        Lb4:
            kotlin.jvm.internal.o.o(r3)
            throw r4
        Lb8:
            java.lang.String r1 = "flashSaleSwitchBtn"
            kotlin.jvm.internal.o.o(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.b5.C(boolean, r45.j31):void");
    }

    public final void D(r45.hx0 hx0Var, yz5.a aVar) {
        java.lang.String str;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        if (e1Var != null) {
            az2.c cVar = az2.f.f16125d;
            com.tencent.mm.ui.MMActivity mMActivity = this.f456636h;
            az2.f a17 = az2.c.a(cVar, mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490604zq), 500L, null, 8, null);
            a17.a();
            dk2.xf k17 = efVar.k(this.f456637i);
            if (k17 != null) {
                com.tencent.mm.ui.MMActivity mMActivity2 = this.f456636h;
                long j17 = e1Var.f328988r.getLong(0);
                long j18 = e1Var.f328983m;
                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var == null || (str = c1Var.f328852o) == null) {
                    str = "";
                }
                ((dk2.r4) k17).a0(mMActivity2, j17, j18, str, hx0Var, new xt2.y4(a17, this, aVar, hx0Var));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.axe;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        rootView.findViewById(com.tencent.mm.R.id.f486257yf);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.fhn)).getPaint(), 0.8f);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.fho);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f456638m = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rlj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f456639n = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.flg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f456640o = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.fhm);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f456641p = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.tnn);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f456642q = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.fh9);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f456643r = findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.fha);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f456644s = findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.fhk);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f456645t = findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.fhl);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f456646u = findViewById9;
        android.view.View findViewById10 = rootView.findViewById(com.tencent.mm.R.id.g86);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f456647v = findViewById10;
        android.view.View findViewById11 = rootView.findViewById(com.tencent.mm.R.id.qfp);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f456648w = findViewById11;
        android.view.View findViewById12 = rootView.findViewById(com.tencent.mm.R.id.qfq);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f456649x = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById12;
        android.view.View findViewById13 = rootView.findViewById(com.tencent.mm.R.id.r47);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f456650y = findViewById13;
        android.view.View findViewById14 = rootView.findViewById(com.tencent.mm.R.id.r48);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f456651z = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById14;
        android.view.View findViewById15 = rootView.findViewById(com.tencent.mm.R.id.a5a);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.A = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView) findViewById15;
        android.view.View findViewById16 = rootView.findViewById(com.tencent.mm.R.id.cuy);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.B = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView) findViewById16;
        android.view.View findViewById17 = rootView.findViewById(com.tencent.mm.R.id.f482719m2);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.C = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView) findViewById17;
        android.view.View findViewById18 = rootView.findViewById(com.tencent.mm.R.id.f482716lz);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.D = (com.tencent.mm.plugin.finder.shopping.view.FinderLiveProductListOptionView) findViewById18;
        android.view.View findViewById19 = rootView.findViewById(com.tencent.mm.R.id.l7c);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.E = findViewById19;
        android.view.View findViewById20 = rootView.findViewById(com.tencent.mm.R.id.hdw);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.F = findViewById20;
        android.view.View view = this.f456640o;
        if (view != null) {
            view.setOnClickListener(new xt2.d4(this));
        } else {
            kotlin.jvm.internal.o.o("closeBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        yz5.a aVar = this.G;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
