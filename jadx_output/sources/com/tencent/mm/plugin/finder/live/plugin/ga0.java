package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ga0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112666p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f112667q;

    /* renamed from: r, reason: collision with root package name */
    public st2.h1 f112668r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112666p = statusMonitor;
        this.f112667q = "Finder.LiveShoppingListPlugin";
        if (zl2.r4.f473950a.w1() && ((mm2.c1) P0(mm2.c1.class)).Y4) {
            root.setElevation(root.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480546a43));
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "FinderLiveShoppingListPlugin init!");
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        dk2.xf xfVar;
        st2.h1 h1Var = this.f112668r;
        if (h1Var == null || i17 != 1013) {
            return;
        }
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "onActivityResult:REQUEST_MANAGER_PRODUCT,resultCode:" + i18);
            return;
        }
        java.io.Serializable a17 = com.tencent.mm.plugin.finder.live.util.q1.f115653a.a(intent, "KEY_PRODUCTLIST");
        java.util.List list = null;
        java.util.List<byte[]> list2 = a17 instanceof java.util.List ? (java.util.List) a17 : null;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (byte[] bArr : list2) {
                r45.y46 y46Var = new r45.y46();
                if (bArr != null) {
                    try {
                        y46Var.parseFrom(bArr);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                    arrayList.add(y46Var);
                }
                y46Var = null;
                arrayList.add(y46Var);
            }
            list = kz5.n0.V(arrayList);
        }
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_DELETE", false) : false;
        if (list != null && (xfVar = h1Var.f412336g) != null) {
            android.content.Context context = h1Var.f412333d.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
            gk2.e eVar = h1Var.f412335f;
            ((dk2.r4) xfVar).a0(mMActivity, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.c1) eVar.a(mm2.c1.class)).f328852o, zl2.r4.f473950a.I(booleanExtra ? 102 : 101, new java.util.LinkedList(list)), new st2.g0(h1Var));
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "list:" + list + ",delete:" + booleanExtra);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        st2.h1 h1Var = this.f112668r;
        if (h1Var != null) {
            java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
            java.lang.String str = string != null ? string : "";
            if (kotlin.jvm.internal.o.b(str, "PORTRAIT_ACTION_FULL_SCREEN_MINIPRO")) {
                st2.j0 j0Var = new st2.j0(h1Var, obj, j17);
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                com.tencent.mm.sdk.platformtools.u3.i(j0Var, j17);
            } else if (kotlin.jvm.internal.o.b(str, "PORTRAIT_ACTION_HALF_SCREEN_MINIPRO")) {
                st2.k0 k0Var = new st2.k0(h1Var, obj, j17);
                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                com.tencent.mm.sdk.platformtools.u3.i(k0Var, j17);
            }
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        st2.h1 h1Var = this.f112668r;
        if (h1Var != null) {
            h1Var.u();
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        android.content.Context context = this.f365323d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        t1(activity != null ? activity.getIntent() : null);
        st2.h1 h1Var = this.f112668r;
        if (h1Var == null || !h1Var.z()) {
            return;
        }
        h1Var.B(null);
        com.tencent.mm.plugin.finder.live.plugin.l lVar = h1Var.f412337h;
        if (lVar != null) {
            com.tencent.mm.plugin.finder.live.util.y.m(lVar, null, null, new st2.k(h1Var, false, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
    
        if (r5.getInteger(0) == 1) goto L57;
     */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ga0.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        st2.h1 h1Var = this.f112668r;
        if (h1Var != null) {
            tt2.e1 e1Var = h1Var.P;
            e1Var.f421892w = null;
            e1Var.f421893x = null;
            e1Var.f421894y = null;
            e1Var.f421895z = null;
            e1Var.A = null;
            tt2.a aVar = h1Var.Q;
            aVar.f421828m = null;
            aVar.f421829n = null;
            tt2.e1 e1Var2 = h1Var.R;
            e1Var2.f421892w = null;
            e1Var2.f421893x = null;
            e1Var2.f421894y = null;
            e1Var2.f421895z = null;
            e1Var2.A = null;
            ut2.j5 k17 = h1Var.k();
            java.lang.Object value = ((jz5.n) k17.f430942m).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.view.View) value).setOnClickListener(null);
            k17.j().setOnClickListener(null);
            k17.m().setOnClickListener(null);
            k17.h().setOnClickListener(null);
            android.view.View view = h1Var.f412346s;
            if (view == null) {
                kotlin.jvm.internal.o.o("blankArea");
                throw null;
            }
            view.setOnClickListener(null);
            androidx.recyclerview.widget.v2 v2Var = h1Var.f412343p0;
            if (v2Var != null) {
                h1Var.q().U0(v2Var);
            }
            h1Var.f412343p0 = null;
            h1Var.h().setOnVisibilityListener(null);
            e1Var.f421891v = null;
            aVar.getClass();
            e1Var2.f421891v = null;
            st2.p2 p2Var = h1Var.K;
            if (p2Var != null && p2Var.f412420g != null) {
                com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView finderLiveFixClickIssueRecyclerView = p2Var.f412415b;
                finderLiveFixClickIssueRecyclerView.setTouchEventListener(null);
                finderLiveFixClickIssueRecyclerView.setConsumedTouchEnvent(false);
                p2Var.f412414a.k();
            }
            h1Var.K = null;
        }
        this.f112668r = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void k1(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f112667q, "clickEmptyAreaClose = " + (intent != null ? intent.getBooleanExtra("extra_start_by_half_screen_empty_area_click_scene", false) : false));
        t1(intent);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.content.Intent intent) {
        android.app.Activity activity;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0;
        android.view.ViewGroup viewGroup = this.f365323d;
        qo0.c cVar = this.f112666p;
        boolean z17 = true;
        if (intExtra == 6) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
            java.lang.Long valueOf = intent != null ? java.lang.Long.valueOf(intent.getLongExtra("KEY_SHOP_SHELF_TARGET_PRODUCT_ID", -1L)) : null;
            if (valueOf != null && valueOf.longValue() == -1) {
                z17 = false;
            }
            if (!z17) {
                valueOf = null;
            }
            if (valueOf != null) {
                bundle.putLong("PARAM_FINDER_LIVE_AUTO_LOCATE_PRODUCTID", valueOf.longValue());
            }
            cVar.statusChange(qo0.b.f365349f2, bundle);
            android.content.Context context = viewGroup.getContext();
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent2 = activity.getIntent()) == null) {
                return;
            }
            intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra == 17) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
            bundle2.putBoolean("PARAM_FINDER_LIVE_SHOPPING_LOCATE_HOT_SALE_TAB", true);
            cVar.statusChange(qo0.b.f365349f2, bundle2);
            android.content.Context context2 = viewGroup.getContext();
            activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity == null || (intent3 = activity.getIntent()) == null) {
                return;
            }
            intent3.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra != 18) {
            return;
        }
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
        bundle3.putBoolean("PARAM_FINDER_LIVE_SHOPPING_AUTO_SHOW_COUPON", true);
        cVar.statusChange(qo0.b.f365349f2, bundle3);
        android.content.Context context3 = viewGroup.getContext();
        activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity == null || (intent4 = activity.getIntent()) == null) {
            return;
        }
        intent4.putExtra("KEY_PARAMS_DO_ACTION", 0);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        com.tencent.mars.xlog.Log.i(this.f112667q, "FinderLiveShoppingListPlugin mount!");
        super.z0();
        st2.h1 h1Var = new st2.h1(this.f365323d, this.f112666p, S0(), W0(), this);
        this.f112668r = h1Var;
        st2.d0 d0Var = new st2.d0(h1Var);
        tt2.e1 e1Var = h1Var.P;
        h1Var.H(e1Var);
        tt2.a aVar = h1Var.Q;
        aVar.f421828m = d0Var;
        aVar.f421829n = new st2.z(h1Var);
        tt2.e1 e1Var2 = h1Var.R;
        e1Var2.f421892w = h1Var.Z;
        e1Var2.f421893x = new st2.t(h1Var);
        e1Var2.f421895z = new st2.u(h1Var);
        android.view.View view = h1Var.f412346s;
        if (view == null) {
            kotlin.jvm.internal.o.o("blankArea");
            throw null;
        }
        view.setOnClickListener(h1Var);
        android.view.View view2 = h1Var.F;
        if (view2 != null) {
            view2.setOnClickListener(h1Var);
        }
        android.view.View view3 = h1Var.D;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("goodListOfCouponBack");
            throw null;
        }
        view3.setOnClickListener(h1Var);
        android.view.View view4 = h1Var.E;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("secondaryPageBack");
            throw null;
        }
        view4.setOnClickListener(h1Var);
        st2.v vVar = new st2.v(h1Var);
        h1Var.q().P(vVar);
        h1Var.f412343p0 = vVar;
        h1Var.h().setOnVisibilityListener(new st2.x(h1Var));
        e1Var.f421891v = h1Var;
        e1Var2.f421891v = h1Var;
        aVar.getClass();
        android.view.ViewGroup viewGroup = this.f365323d;
        android.content.Context context = viewGroup.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.content.Intent intent = activity != null ? activity.getIntent() : null;
        if ((intent != null && intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) == 8) || ((mm2.f6) P0(mm2.f6.class)).f329052x1) {
            if (intent != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            ((mm2.f6) P0(mm2.f6.class)).T6(false);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SHOP_FROM_SNS", true);
            this.f112666p.statusChange(qo0.b.f365349f2, bundle);
        }
        android.content.Context context2 = viewGroup.getContext();
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        t1(activity2 != null ? activity2.getIntent() : null);
    }
}
