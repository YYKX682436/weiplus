package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class x1 extends com.tencent.mm.plugin.location.ui.impl.w implements com.tencent.mm.modelbase.u0, d85.j0 {
    public android.view.View A;
    public int A1;
    public android.widget.TextView B;
    public android.view.View B1;
    public android.widget.LinearLayout C;
    public android.view.View C1;
    public com.tencent.mm.plugin.location.ui.MyPoiPoint D;
    public android.widget.EditText D1;
    public double E;
    public android.widget.ImageView E1;
    public double F;
    public android.view.View F1;
    public double G;
    public android.view.View.OnTouchListener G1;
    public double H;
    public za3.v H1;
    public java.lang.String I;
    public com.tencent.mm.plugin.location.ui.PoiPoint I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f144920J;
    public final java.util.Map J1;
    public java.lang.String K;
    public boolean K1;
    public android.widget.RelativeLayout L;
    public final com.tencent.mm.plugin.location.ui.impl.d0 L1;
    public int M;
    public android.location.Location M1;
    public int N;
    public com.tencent.mm.ui.widget.dialog.u3 N1;
    public final com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.MyLocationSource O1;
    public int P;
    public boolean P1;
    public boolean Q;
    public final i11.c Q1;
    public boolean R;
    public boolean R1;
    public boolean S;
    public boolean S1;
    public android.widget.FrameLayout T;
    public boolean T1;
    public int U;
    public boolean U1;
    public long V;
    public long W;
    public long X;
    public int Y;
    public boolean Z;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.PoiHeaderView f144921i;

    /* renamed from: l1, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct f144922l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f144923m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.PickPoi f144924n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLoadMoreListView f144925o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLoadMoreListView f144926p;

    /* renamed from: p0, reason: collision with root package name */
    public int f144927p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f144928p1;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f144929q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f144930r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.c0 f144931s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.c0 f144932t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f144933u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView f144934v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker f144935w;

    /* renamed from: x, reason: collision with root package name */
    public va3.b0 f144936x;

    /* renamed from: x0, reason: collision with root package name */
    public final java.lang.String f144937x0;

    /* renamed from: x1, reason: collision with root package name */
    public final int[] f144938x1;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f144939y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f144940y0;

    /* renamed from: y1, reason: collision with root package name */
    public int[] f144941y1;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f144942z;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f144943z1;

    public x1(android.app.Activity activity, java.lang.String str) {
        super(activity);
        this.f144936x = null;
        this.E = -85.0d;
        this.F = -1000.0d;
        this.G = -85.0d;
        this.H = -1000.0d;
        this.I = "";
        this.f144920J = false;
        this.K = "";
        this.Q = true;
        this.R = false;
        this.S = false;
        this.U = 0;
        this.V = -1L;
        this.W = -1L;
        this.X = -1L;
        this.Y = -1;
        this.Z = false;
        this.f144927p0 = 1;
        this.f144937x0 = "";
        this.f144940y0 = "";
        this.f144922l1 = new com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct();
        this.f144938x1 = new int[]{24, 24};
        this.J1 = new java.util.HashMap();
        this.L1 = new com.tencent.mm.plugin.location.ui.impl.d0();
        this.M1 = null;
        this.N1 = null;
        this.O1 = new com.tencent.mm.plugin.location.ui.impl.c1(this);
        this.P1 = false;
        this.Q1 = new com.tencent.mm.plugin.location.ui.impl.k1(this);
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = false;
        this.f144937x0 = str;
    }

    public static void n(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        byte[] bArr;
        x1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "loadingMore");
        if (x1Var.f144936x != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "scene is doing");
            return;
        }
        boolean z17 = x1Var.f144920J;
        if (z17) {
            bArr = x1Var.f144932t.f144761g;
            if (bArr == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "buffer is null");
                return;
            }
        } else {
            bArr = x1Var.f144931s.f144761g;
            if (bArr == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "buffer is null");
                return;
            }
        }
        if (!z17) {
            x1Var.I = x1Var.f144931s.f144763i;
        }
        r45.nk3 nk3Var = new r45.nk3();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        nk3Var.f381461g = cu5Var;
        nk3Var.f381463i = x1Var.E;
        nk3Var.f381462h = x1Var.F;
        nk3Var.f381458d = 0;
        nk3Var.f381459e = !x1Var.f144920J ? 1 : 0;
        nk3Var.f381464m = x1Var.H;
        nk3Var.f381465n = x1Var.G;
        nk3Var.f381460f = x1Var.K;
        nk3Var.f381466o = 0;
        nk3Var.f381467p = x1Var.f144910e.getZoomLevel();
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = x1Var.f144935w;
        nk3Var.f381469r = customIndoorPicker.f144696m2;
        nk3Var.f381470s = customIndoorPicker.f144697n2;
        nk3Var.f381471t = customIndoorPicker.f144698o2;
        x1Var.f144936x = new va3.b0(nk3Var, x1Var.I);
        gm0.j1.d().g(x1Var.f144936x);
        x1Var.U++;
    }

    public static void o(com.tencent.mm.plugin.location.ui.impl.x1 x1Var, int i17) {
        int i18 = 0;
        android.view.View childAt = x1Var.f144926p.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight();
            int i19 = 0;
            int i27 = 0;
            while (true) {
                if (i19 < x1Var.f144926p.getChildCount()) {
                    i27 = x1Var.f144926p.getChildAt(i19).getTop();
                    if (i27 <= 0 && i27 > (-height)) {
                        i18 = x1Var.f144926p.getFirstVisiblePosition() + i19;
                        break;
                    }
                    i19++;
                } else {
                    break;
                }
            }
            int i28 = i17 - i18;
            int i29 = (height * i28) + i27;
            if (i29 == 0) {
                return;
            }
            x1Var.f144926p.smoothScrollBy(i29, java.lang.Math.abs(i28) > 10 ? java.lang.Math.abs(i28) * 100 : 300);
        }
    }

    public static void p(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        if (x1Var.S1) {
            x1Var.S1 = false;
            x1Var.D1.requestFocus();
            android.app.Activity activity = x1Var.f144909d;
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager == null || (currentFocus = activity.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(com.tencent.mm.plugin.location.ui.impl.d0 r19, com.tencent.mm.plugin.location.ui.impl.e0 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.location.ui.impl.x1.A(com.tencent.mm.plugin.location.ui.impl.d0, com.tencent.mm.plugin.location.ui.impl.e0, boolean):void");
    }

    public final void B(com.tencent.mm.plugin.location.ui.impl.w1 w1Var) {
        com.tencent.mm.plugin.location.ui.impl.w1 w1Var2 = com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED;
        android.app.Activity activity = this.f144909d;
        if (w1Var2 == w1Var) {
            ((android.widget.FrameLayout.LayoutParams) this.L.getLayoutParams()).topMargin = this.M;
            ((android.widget.RelativeLayout.LayoutParams) this.T.getLayoutParams()).topMargin = 0;
            ((android.widget.RelativeLayout.LayoutParams) ((android.view.View) this.f144934v.getParent()).getLayoutParams()).bottomMargin = i65.a.b(activity, 36);
            com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144935w;
            if (customIndoorPicker.f144696m2 == 1) {
                customIndoorPicker.setVisibility(0);
            }
            this.f144910e.setLogoMargin(this.f144938x1);
        } else if (com.tencent.mm.plugin.location.ui.impl.w1.OPENED == w1Var) {
            ((android.widget.FrameLayout.LayoutParams) this.L.getLayoutParams()).topMargin = this.N;
            ((android.widget.RelativeLayout.LayoutParams) this.T.getLayoutParams()).topMargin = -this.P;
            ((android.widget.RelativeLayout.LayoutParams) ((android.view.View) this.f144934v.getParent()).getLayoutParams()).bottomMargin = ((this.M - this.N) - this.P) + i65.a.b(activity, 36);
            this.f144935w.setVisibility(8);
            this.f144910e.setLogoMargin(this.f144941y1);
        }
        this.L.requestLayout();
        this.f144934v.requestLayout();
        this.T.requestLayout();
    }

    public final void C() {
        if (this.S1) {
            return;
        }
        this.D1.requestFocus();
        this.D1.post(new com.tencent.mm.plugin.location.ui.impl.l1(this));
    }

    public final void D() {
        if (this.f144920J) {
            android.view.View view = this.B1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.C1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.F1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.B1;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.C1;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.F1;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "updateSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ab3.e
    public boolean a(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = this.f144922l1;
        finishSelectPOIStruct.f58105d = 2;
        finishSelectPOIStruct.f58109h = this.f144935w.getShowTimes();
        finishSelectPOIStruct.f58110i = this.f144935w.getClickTimes();
        finishSelectPOIStruct.k();
        if (this.f144920J) {
            t();
            r(14, this.f144932t.f144760f, true);
            return false;
        }
        r(12, this.f144931s.f144760f, false);
        this.f144909d.finish();
        return true;
    }

    @Override // ab3.e
    public void e(android.os.Bundle bundle) {
        com.tencent.tencentmap.mapsdk.maps.CustomLocationProvider.getInstance().setMyLocationSource(null, this.O1);
        android.app.Activity activity = this.f144909d;
        activity.setContentView(com.tencent.mm.R.layout.c_0);
        int intExtra = k().getIntExtra("map_view_type", 0);
        this.f144911f = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseMapUI", "init oncreate type %d", java.lang.Integer.valueOf(intExtra));
        this.f144910e = com.tencent.mm.plugin.location.ui.impl.x.wi(activity);
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, null)) {
            ((android.widget.FrameLayout) j(com.tencent.mm.R.id.jbp)).addView((com.tencent.mm.plugin.location_soso.api.SoSoMapView) this.f144910e);
        }
        this.f144910e.setMapViewOnTouchListener(new com.tencent.mm.plugin.location.ui.impl.t(this));
        this.f144910e.setMapAnchor(0.5f, 0.5f);
        ((com.tencent.mm.plugin.location_soso.api.SoSoMapView) this.f144910e).getMap().setOnMapClickListener(new com.tencent.mm.plugin.location.ui.impl.u(this));
        ((com.tencent.mm.plugin.location_soso.api.SoSoMapView) this.f144910e).getMap().setOnMapPoiClickListener(new com.tencent.mm.plugin.location.ui.impl.v(this));
        this.f144940y0 = (java.lang.System.currentTimeMillis() / 1000) + "";
        android.view.Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(1280);
        window.setStatusBarColor(0);
        gm0.j1.d().a(457, this);
        gm0.j1.d().a(11363, this);
        this.Y = (int) (java.lang.System.currentTimeMillis() / 1000);
        this.f144910e.setCanRotate(false);
        this.f144935w = (com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker) j(com.tencent.mm.R.id.cov);
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap = this.f144910e.getViewManager().getTencentMap();
        if (tencentMap != null) {
            this.f144910e.enableIndoorLevelPick(false);
            tencentMap.setIndoorEnabled(false);
            if (k().getIntExtra("map_indoor_support", 0) == 1) {
                tencentMap.setIndoorEnabled(true);
                this.f144935w.g1(tencentMap, new com.tencent.mm.plugin.location.ui.impl.n1(this));
            }
        }
        if (com.tencent.mm.ui.bk.C()) {
            ((com.tencent.mm.plugin.location_soso.api.SoSoMapView) this.f144910e).enableDarkMode();
        } else {
            ((com.tencent.mm.plugin.location_soso.api.SoSoMapView) this.f144910e).disableDarkMode();
        }
        this.C = (android.widget.LinearLayout) j(com.tencent.mm.R.id.gy8);
        ((android.widget.TextView) j(com.tencent.mm.R.id.azz)).setText(com.tencent.mm.R.string.f490347sg);
        android.view.View j17 = j(com.tencent.mm.R.id.obt);
        this.f144939y = j17;
        j17.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.o1(this));
        android.view.View view = this.f144939y;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f144942z = j(com.tencent.mm.R.id.obu);
        this.A = j(com.tencent.mm.R.id.b1_);
        int i17 = this.f144911f;
        if (i17 == 0) {
            ((android.widget.TextView) j(com.tencent.mm.R.id.b1_)).setText(com.tencent.mm.R.string.ggw);
        } else if (i17 == 3) {
            ((android.widget.TextView) j(com.tencent.mm.R.id.b1_)).setText(com.tencent.mm.R.string.f490502ww);
        } else if (i17 == 8) {
            if (k().getIntExtra("type_pick_location_btn", 1) == 2) {
                ((android.widget.TextView) j(com.tencent.mm.R.id.b1_)).setText(com.tencent.mm.R.string.f490004i6);
            } else {
                ((android.widget.TextView) j(com.tencent.mm.R.id.b1_)).setText(com.tencent.mm.R.string.f490441v5);
            }
        }
        this.f144942z.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.p1(this));
        android.view.View view2 = this.f144942z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s(false);
        this.L = (android.widget.RelativeLayout) j(com.tencent.mm.R.id.ind);
        this.f144925o = (com.tencent.mm.ui.base.MMLoadMoreListView) activity.findViewById(com.tencent.mm.R.id.kyq);
        this.f144926p = (com.tencent.mm.ui.base.MMLoadMoreListView) activity.findViewById(com.tencent.mm.R.id.mer);
        this.f144933u = j(com.tencent.mm.R.id.ilp);
        this.B = (android.widget.TextView) j(com.tencent.mm.R.id.f486763me1);
        this.f144921i = (com.tencent.mm.plugin.location.ui.PoiHeaderView) j(com.tencent.mm.R.id.kyj);
        this.f144929q = android.view.View.inflate(activity, com.tencent.mm.R.layout.cjt, null);
        this.f144930r = android.view.View.inflate(activity, com.tencent.mm.R.layout.cjt, null);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.service.p3 p3Var = com.tencent.mm.plugin.finder.service.p3.f126174a;
        p3Var.c(this.f144929q, false, true, "add_poi_using_qqmap_in_poi_page", null);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        p3Var.c(this.f144930r, false, true, "add_poi_using_qqmap_in_poi_page", null);
        int c17 = com.tencent.mm.ui.bl.c(activity);
        android.view.ViewGroup.LayoutParams layoutParams = this.f144926p.getLayoutParams();
        if (layoutParams != null) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = c17;
            this.f144926p.setLayoutParams(layoutParams);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f144925o.getLayoutParams();
        if (layoutParams2 != null) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = c17;
            this.f144925o.setLayoutParams(layoutParams2);
        }
        this.T = (android.widget.FrameLayout) j(com.tencent.mm.R.id.jbq);
        com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView locationCrossHairView = (com.tencent.mm.plugin.location.ui.impl.LocationCrossHairView) j(com.tencent.mm.R.id.f485687in2);
        this.f144934v = locationCrossHairView;
        locationCrossHairView.setSelected(true);
        this.f144934v.setContentDescription(activity.getString(com.tencent.mm.R.string.gge));
        this.f144934v.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.q1(this));
        this.f144910e.setBuiltInZoomControls(false);
        this.f144923m = (android.widget.FrameLayout) j(com.tencent.mm.R.id.cic);
        this.D = new com.tencent.mm.plugin.location.ui.MyPoiPoint(activity, this.f144910e);
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi = new com.tencent.mm.plugin.location.ui.impl.PickPoi(activity);
        this.f144924n = pickPoi;
        pickPoi.setOnCurPoiGet(new com.tencent.mm.plugin.location.ui.impl.r1(this));
        this.f144923m.addView(this.f144924n);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LAST_LOCATION_STRING, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (this.G == -85.0d || this.H == -1000.0d)) {
            java.lang.String[] split = str.split(",");
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "last locationInfo ".concat(str));
            if (split.length == 2) {
                this.f144910e.getIController().animateTo((float) ((com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0) * 1.0d) / 1000000.0d), (float) ((com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0) * 1.0d) / 1000000.0d));
            }
        }
        com.tencent.mm.plugin.location.ui.impl.s1 s1Var = new com.tencent.mm.plugin.location.ui.impl.s1(this);
        this.G1 = s1Var;
        this.f144925o.setOnTouchListener(s1Var);
        this.f144925o.setOnLoadMoreListener(new com.tencent.mm.plugin.location.ui.impl.t1(this));
        this.f144925o.setOnItemClickListener(new com.tencent.mm.plugin.location.ui.impl.r0(this));
        com.tencent.mm.plugin.location.ui.impl.c0 c0Var = new com.tencent.mm.plugin.location.ui.impl.c0(activity);
        this.f144931s = c0Var;
        this.f144925o.setAdapter((android.widget.ListAdapter) c0Var);
        this.f144924n.setAdapter(this.f144931s);
        this.H1 = new com.tencent.mm.plugin.location.ui.impl.s0(this);
        com.tencent.mm.plugin.location.ui.impl.c0 c0Var2 = new com.tencent.mm.plugin.location.ui.impl.c0(activity);
        this.f144932t = c0Var2;
        c0Var2.f144765n = true;
        c0Var2.f144760f = -1;
        this.f144926p.setAdapter((android.widget.ListAdapter) c0Var2);
        this.f144926p.setOnLoadMoreListener(new com.tencent.mm.plugin.location.ui.impl.t0(this));
        this.f144926p.setOnItemClickListener(new com.tencent.mm.plugin.location.ui.impl.v0(this));
        this.f144926p.setOnTouchListener(this.G1);
        this.B1 = j(com.tencent.mm.R.id.mlk);
        this.C1 = j(com.tencent.mm.R.id.mlm);
        this.D1 = (android.widget.EditText) j(com.tencent.mm.R.id.mlj);
        this.E1 = (android.widget.ImageView) j(com.tencent.mm.R.id.mlo);
        this.F1 = j(com.tencent.mm.R.id.mli);
        this.B1.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.b1(this));
        this.F1.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.d1(this));
        this.D1.setOnTouchListener(new com.tencent.mm.plugin.location.ui.impl.e1(this));
        this.L.setClickable(true);
        this.D1.setOnEditorActionListener(new com.tencent.mm.plugin.location.ui.impl.f1(this));
        this.D1.addTextChangedListener(new com.tencent.mm.plugin.location.ui.impl.g1(this));
        this.E1.setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.h1(this));
        D();
        android.view.View j18 = j(com.tencent.mm.R.id.mlh);
        this.f144943z1 = j18;
        j18.post(new com.tencent.mm.plugin.location.ui.impl.w0(this));
        j(com.tencent.mm.R.id.mlg).setOnClickListener(new com.tencent.mm.plugin.location.ui.impl.x0(this));
        ((com.tencent.mm.ui.widget.InputPanelFrameLayout) j(com.tencent.mm.R.id.kyr)).setExternalListener(new com.tencent.mm.plugin.location.ui.impl.y0(this));
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(activity);
        int max = java.lang.Math.max(h17.x, h17.y);
        int d17 = max - com.tencent.mm.sdk.platformtools.j.d(activity, 320.0f);
        this.M = d17;
        this.N = (int) ((max * 0.25f) + 0.5d);
        this.P = (int) (((d17 - r6) / 3.0d) + 0.5d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "collapsedTopMargin: %d, openedTopMargin: %d, mapViewTopMargin: %d.", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(this.N), java.lang.Integer.valueOf(this.P));
        this.f144941y1 = new int[]{((this.M - this.N) - this.P) + 24, 24};
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) this.C.getLayoutParams();
        layoutParams3.height += dimensionPixelSize * 2;
        this.C.setLayoutParams(layoutParams3);
        this.C.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        int i18 = max - this.N;
        android.view.ViewGroup.LayoutParams layoutParams4 = this.L.getLayoutParams();
        layoutParams4.height = i18;
        this.L.setLayoutParams(layoutParams4);
        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) this.T.getLayoutParams();
        layoutParams5.height = this.M;
        this.T.setLayoutParams(layoutParams5);
        B(com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED);
        int i19 = this.f144911f;
        com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = this.f144922l1;
        if (i19 == 0 || i19 == 8) {
            finishSelectPOIStruct.f58106e = com.tencent.mm.plugin.location.ui.impl.s.a(k().getIntExtra("type_tag", 0));
        } else {
            finishSelectPOIStruct.f58106e = com.tencent.mm.plugin.location.ui.impl.s.a(i19);
        }
        this.f144924n.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.location.ui.impl.m1(this));
    }

    @Override // ab3.e
    public void f() {
        this.f144910e.destroy();
        gm0.j1.d().q(457, this);
        gm0.j1.d().q(11363, this);
    }

    @Override // ab3.e
    public void h() {
        this.R1 = false;
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this.Q1);
        com.tencent.mm.plugin.location.ui.MyPoiPoint myPoiPoint = this.D;
        ((i11.h) myPoiPoint.f144615e).m(myPoiPoint.f144618h);
    }

    @Override // ab3.e
    public void i() {
        this.R1 = true;
        if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new com.tencent.mm.plugin.location.ui.impl.i1(this))) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().j(this.Q1, true);
        }
        com.tencent.mm.plugin.location.ui.MyPoiPoint myPoiPoint = this.D;
        ((i11.h) myPoiPoint.f144615e).j(myPoiPoint.f144618h, true);
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.w
    public void l(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi = this.f144924n;
        pickPoi.f144704f.clearAnimation();
        pickPoi.f144704f.startAnimation(pickPoi.f144703e);
        this.E = latLng.getLatitude();
        double longitude = latLng.getLongitude();
        this.F = longitude;
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi2 = this.f144924n;
        double d17 = this.E;
        boolean booleanExtra = k().getBooleanExtra("key_geo_coder_four_level", false);
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144935w;
        pickPoi2.b(d17, longitude, booleanExtra, customIndoorPicker.f144696m2, customIndoorPicker.f144697n2, customIndoorPicker.f144698o2);
        this.f144934v.setSelected(false);
        if (this.S) {
            y(com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED);
        }
        if (this.f144920J) {
            this.P1 = false;
            t();
        } else {
            ((com.tencent.mm.plugin.location_soso.api.SoSoMapView) this.f144910e).getIController().animateTo(this.E, this.F);
        }
        w(false);
        this.Z = false;
        com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = this.f144922l1;
        finishSelectPOIStruct.f58108g = 0L;
        finishSelectPOIStruct.f58107f = 3;
        ((com.tencent.mm.plugin.location_soso.api.SoSoMapView) this.f144910e).announceForAccessibility(this.f144909d.getString(com.tencent.mm.R.string.ggv));
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.w
    public void m() {
        if (this.f144934v.isSelected()) {
            this.f144934v.setSelected(false);
        }
        if (this.f144920J) {
            return;
        }
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi = this.f144924n;
        pickPoi.f144704f.clearAnimation();
        pickPoi.f144704f.startAnimation(pickPoi.f144703e);
        this.E = this.f144910e.getMapCenterX() / 1000000.0d;
        double mapCenterY = this.f144910e.getMapCenterY() / 1000000.0d;
        this.F = mapCenterY;
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi2 = this.f144924n;
        double d17 = this.E;
        boolean booleanExtra = k().getBooleanExtra("key_geo_coder_four_level", false);
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144935w;
        pickPoi2.b(d17, mapCenterY, booleanExtra, customIndoorPicker.f144696m2, customIndoorPicker.f144697n2, customIndoorPicker.f144698o2);
        this.f144934v.setSelected(false);
        if (this.S) {
            y(com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED);
        }
        w(false);
        this.Z = false;
        com.tencent.mm.autogen.mmdata.rpt.FinishSelectPOIStruct finishSelectPOIStruct = this.f144922l1;
        finishSelectPOIStruct.f58108g = 0L;
        finishSelectPOIStruct.f58107f = 3;
    }

    @Override // d85.j0
    public void onBusinessPermissionDenied(java.lang.String str) {
        this.f144909d.finish();
    }

    @Override // d85.j0
    public void onBusinessPermissionGranted(java.lang.String str) {
        this.f144909d.recreate();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        int i27;
        if (m1Var.getType() != 457) {
            if (m1Var.getType() == 11363) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var = this.N1;
                if (u3Var != null) {
                    u3Var.dismiss();
                    this.N1 = null;
                }
                va3.a0 a0Var = (va3.a0) m1Var;
                com.tencent.mm.plugin.location.ui.impl.d0 d0Var = a0Var.f434258e;
                if (i17 == 0 && i18 == 0) {
                    A(d0Var, a0Var.f434259f, true);
                    return;
                } else {
                    A(d0Var, null, false);
                    return;
                }
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            this.f144936x = null;
            va3.b0 b0Var = (va3.b0) m1Var;
            boolean equals = b0Var.f434269n.equals(this.I);
            java.lang.String str2 = b0Var.f434269n;
            if (!equals) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "pass this resp!" + this.I + " " + str2);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "isEnd: " + b0Var.f434268m + " searchId: " + b0Var.f434265g + " isInSearch: " + this.f144920J);
            if (this.V == -1) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                this.W = currentTimeMillis;
                this.V = currentTimeMillis;
            } else {
                this.W = java.lang.System.currentTimeMillis();
            }
            this.f144927p0 = b0Var.f434270o;
            android.view.View view = this.f144933u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z17 = this.f144920J;
            java.util.List list = b0Var.f434266h;
            if (z17) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.K)) {
                    return;
                }
                if (list != null && ((java.util.ArrayList) list).size() == 0) {
                    this.B.setVisibility(0);
                    this.f144926p.b();
                }
                if (b0Var.f434264f) {
                    com.tencent.mm.plugin.location.ui.impl.c0 c0Var = this.f144932t;
                    c0Var.f144766o = true;
                    ((java.util.ArrayList) c0Var.f144758d).clear();
                }
                this.f144932t.a(list, b0Var.f434267i, b0Var.f434268m, str2);
                if (this.f144932t.f144762h) {
                    this.f144926p.b();
                    com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView = this.f144926p;
                    mMLoadMoreListView.removeFooterView(mMLoadMoreListView.f197493d);
                    if (!this.f144932t.isEmpty()) {
                        this.f144926p.addFooterView(this.f144929q, null, false);
                    }
                } else {
                    this.f144926p.g();
                    this.f144926p.c();
                }
                if (this.K1) {
                    this.K1 = false;
                    z();
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.location.ui.PoiHeaderView poiHeaderView = this.f144921i;
            if (poiHeaderView != null) {
                r45.ok3 ok3Var = (r45.ok3) b0Var.f434263e.f70711b.f70700a;
                java.lang.String str3 = ok3Var.f382326n;
                java.lang.String str4 = ok3Var.f382325m;
                java.lang.String str5 = ok3Var.f382324i;
                java.lang.String a17 = g83.a.a();
                poiHeaderView.f144626e = str5;
                poiHeaderView.f144627f = "";
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    poiHeaderView.setVisibility(8);
                    poiHeaderView.f144625d.setVisibility(8);
                    poiHeaderView.f144628g.setVisibility(8);
                } else {
                    poiHeaderView.setVisibility(0);
                    poiHeaderView.f144625d.setVisibility(0);
                    poiHeaderView.f144628g.setVisibility(0);
                    poiHeaderView.f144625d.setText(str3);
                    com.tencent.mm.plugin.location.ui.SimpleImageView simpleImageView = poiHeaderView.f144628g;
                    simpleImageView.f144663d = a17;
                    simpleImageView.f144664e = str4;
                    simpleImageView.f144665f = 0;
                    simpleImageView.f144666g = 0;
                    if (str4 == null || str4.length() == 0) {
                        simpleImageView.setVisibility(8);
                    } else if (str4.startsWith("http")) {
                        android.graphics.Bitmap c17 = com.tencent.mm.graphics.e.c(simpleImageView.f144663d + kk.k.g(str4.getBytes()));
                        if (c17 != null) {
                            int i28 = simpleImageView.f144665f;
                            if (i28 > 0 && (i27 = simpleImageView.f144666g) > 0) {
                                c17 = com.tencent.mm.sdk.platformtools.x.S(c17, i28, i27, true, false);
                            }
                            simpleImageView.setImageBitmap(c17);
                        } else {
                            s75.d.b(new za3.k0(str4, simpleImageView.f144667h), "SimpleImageView_download");
                        }
                    } else if (com.tencent.mm.vfs.w6.j(str4)) {
                        int i29 = simpleImageView.f144665f;
                        android.graphics.Bitmap i07 = (i29 <= 0 || (i19 = simpleImageView.f144666g) <= 0) ? com.tencent.mm.sdk.platformtools.x.i0(str4) : com.tencent.mm.sdk.platformtools.x.T(str4, i29, i19, true);
                        if (i07 == null) {
                            simpleImageView.setVisibility(8);
                        } else {
                            simpleImageView.setImageBitmap(i07);
                        }
                    } else {
                        simpleImageView.setVisibility(8);
                    }
                }
            }
            s(true);
            this.f144931s.a(list, b0Var.f434267i, b0Var.f434268m, str2);
            com.tencent.mm.plugin.location.ui.impl.c0 c0Var2 = this.f144931s;
            c0Var2.f144760f = 0;
            c0Var2.notifyDataSetChanged();
            if (!this.f144931s.f144762h) {
                this.f144925o.g();
                this.f144925o.c();
            } else {
                this.f144925o.b();
                com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView2 = this.f144925o;
                mMLoadMoreListView2.removeFooterView(mMLoadMoreListView2.f197493d);
                this.f144925o.addFooterView(this.f144930r, null, false);
            }
        }
    }

    public final void q() {
        java.util.Map map = this.J1;
        for (com.tencent.mm.plugin.location.ui.PoiPoint poiPoint : ((java.util.HashMap) map).values()) {
            if (poiPoint.f144642t) {
                poiPoint.f144630e.removeView(poiPoint);
            }
            poiPoint.f144642t = false;
        }
        ((java.util.HashMap) map).clear();
        this.I1 = null;
    }

    public final void r(int i17, int i18, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i19;
        int i27 = i18;
        double d17 = this.G;
        java.lang.String format = (d17 == -85.0d || this.H == -1000.0d) ? "null/null" : java.lang.String.format("%f/%f", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(this.H));
        java.lang.String str4 = "";
        if (z17) {
            if (i27 >= 0 && i27 < this.f144932t.getCount()) {
                str = this.f144932t.getItem(i27).f144785k;
                str2 = this.f144932t.getItem(i27).f144779e;
                str3 = str2;
            }
            str = "";
            str3 = str;
        } else {
            if (i27 >= 0 && i27 < this.f144931s.getCount()) {
                str = this.f144931s.getItem(i27).f144785k;
                str2 = this.f144931s.getItem(i27).f144779e;
                str3 = str2;
            }
            str = "";
            str3 = str;
        }
        if (i27 == 0 && com.tencent.mm.sdk.platformtools.t8.K0(str) && this.f144931s.getCount() > 1) {
            str = this.f144931s.getItem(1).f144785k;
        }
        java.lang.String str5 = str;
        if (this.f144931s.getCount() > 0 && !z17) {
            str4 = this.f144931s.getItem(0).f144786l;
        }
        if (i27 == 0 && !z17 && this.f144931s.getCount() > 0 && (i19 = this.f144931s.getItem(0).f144791q) >= 0) {
            i27 = i19;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11135, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27 + 1), java.lang.Long.valueOf(this.X), java.lang.Long.valueOf(this.W), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(this.V), java.lang.Integer.valueOf(this.U), format, str3, java.lang.Integer.valueOf(this.Y), str5, wo.w0.g(true), 0, 0, 0, "", 0, str4);
    }

    public final void s(boolean z17) {
        this.f144942z.setEnabled(z17);
        this.A.setEnabled(z17);
    }

    public final void t() {
        this.f144920J = false;
        this.f144923m.setVisibility(0);
        y(com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED);
        D();
        this.K = "";
        this.f144926p.setVisibility(8);
        this.f144931s.notifyDataSetChanged();
        this.f144925o.setVisibility(0);
        android.view.View view = this.f144933u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "exitSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "exitSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.B.setVisibility(8);
        q();
        s(true);
        this.f144934v.setSelected(this.P1);
        this.f144910e.getIController().animateTo(this.E, this.F);
    }

    public final int u() {
        return ((android.view.ViewGroup.MarginLayoutParams) this.L.getLayoutParams()).topMargin;
    }

    public final void v(com.tencent.mm.plugin.location.ui.impl.d0 d0Var) {
        android.app.Activity activity = this.f144909d;
        this.N1 = com.tencent.mm.ui.widget.dialog.u3.f(activity, activity.getString(com.tencent.mm.R.string.ggd), false, 0, null);
        gm0.j1.d().g(new va3.a0(d0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(boolean r13) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.location.ui.impl.x1.w(boolean):void");
    }

    public final boolean x() {
        return (k().getDoubleExtra("KPickPoiLat", -85.0d) == -85.0d || k().getDoubleExtra("KPickPoiLong", -85.0d) == -1000.0d) ? false : true;
    }

    public final void y(com.tencent.mm.plugin.location.ui.impl.w1 w1Var) {
        com.tencent.mm.plugin.location.ui.impl.u1 u1Var;
        com.tencent.mm.plugin.location.ui.impl.u1 u1Var2;
        android.animation.ValueAnimator ofInt;
        com.tencent.mm.plugin.location.ui.impl.w1 w1Var2 = com.tencent.mm.plugin.location.ui.impl.w1.OPENED;
        if (w1Var2 == w1Var && this.S) {
            return;
        }
        if (com.tencent.mm.plugin.location.ui.impl.w1.COLLAPSED == w1Var && !this.S) {
            return;
        }
        int i17 = 0;
        if (this.f144943z1.getVisibility() != 0) {
            android.view.View view = this.f144943z1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "playDrawerAnimation", "(Lcom/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$TopMarginState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI", "playDrawerAnimation", "(Lcom/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$TopMarginState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.Q = false;
        if (w1Var2 == w1Var) {
            u();
            u1Var = new com.tencent.mm.plugin.location.ui.impl.u1(this, 0.0f, 0.0f, 0.0f, -(u() - this.N));
            u1Var2 = new com.tencent.mm.plugin.location.ui.impl.u1(this, 0.0f, 0.0f, 0.0f, -this.P);
            ofInt = android.animation.ValueAnimator.ofInt(0, this.A1);
        } else {
            u();
            u1Var = new com.tencent.mm.plugin.location.ui.impl.u1(this, 0.0f, 0.0f, 0.0f, this.M - u());
            u1Var2 = new com.tencent.mm.plugin.location.ui.impl.u1(this, 0.0f, 0.0f, 0.0f, this.P);
            ofInt = android.animation.ValueAnimator.ofInt(this.A1, 0);
        }
        com.tencent.mm.plugin.location.ui.impl.z0 z0Var = new com.tencent.mm.plugin.location.ui.impl.z0(this, w1Var);
        ofInt.addUpdateListener(new com.tencent.mm.plugin.location.ui.impl.a1(this));
        u1Var.setDuration(200L);
        u1Var.setFillEnabled(true);
        u1Var.setFillAfter(true);
        u1Var.setAnimationListener(z0Var);
        android.widget.RelativeLayout relativeLayout = this.L;
        java.util.List list = u1Var.f144904d;
        ((java.util.ArrayList) list).add(relativeLayout);
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            if (i18 >= arrayList2.size()) {
                break;
            }
            ((android.view.View) arrayList2.get(i18)).startAnimation(u1Var);
            i18++;
        }
        u1Var2.setDuration(200L);
        u1Var2.setFillEnabled(true);
        u1Var2.setFillAfter(true);
        android.widget.FrameLayout frameLayout = this.T;
        java.util.List list2 = u1Var2.f144904d;
        ((java.util.ArrayList) list2).add(frameLayout);
        while (true) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
            if (i17 >= arrayList3.size()) {
                ofInt.setDuration(200L).start();
                return;
            } else {
                ((android.view.View) arrayList3.get(i17)).startAnimation(u1Var2);
                i17++;
            }
        }
    }

    public final void z() {
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        for (int i17 = 0; i17 < 5 && i17 < this.f144932t.getCount(); i17++) {
            arrayList.add(this.f144932t.getItem(i17));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(5);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            if (i18 == 0) {
                arrayList2.add((com.tencent.mm.plugin.location.ui.impl.d0) arrayList.get(0));
            } else {
                com.tencent.mm.plugin.location.ui.impl.d0 d0Var = (com.tencent.mm.plugin.location.ui.impl.d0) arrayList.get(i18);
                com.tencent.mm.plugin.location.ui.impl.d0 d0Var2 = (com.tencent.mm.plugin.location.ui.impl.d0) arrayList2.get(arrayList2.size() - 1);
                if (com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(d0Var.f144778d, d0Var.f144777c, d0Var2.f144778d, d0Var2.f144777c) > 5000.0d) {
                    break;
                } else {
                    arrayList2.add(d0Var);
                }
            }
        }
        q();
        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
            com.tencent.mm.plugin.location.ui.impl.d0 item = this.f144932t.getItem(i19);
            com.tencent.mm.plugin.location.ui.PoiPoint poiPoint = new com.tencent.mm.plugin.location.ui.PoiPoint(this.f144909d, this.f144910e);
            poiPoint.setPosition(i19);
            poiPoint.setOnPointClick(this.H1);
            ((java.util.HashMap) this.J1).put(item.f144778d + "" + item.f144777c, poiPoint);
            poiPoint.b(item.f144778d, item.f144777c, false);
        }
        if (arrayList2.size() <= 0) {
            return;
        }
        if (1 == arrayList2.size()) {
            this.f144935w.h1(((com.tencent.mm.plugin.location.ui.impl.d0) arrayList2.get(0)).f144789o, ((com.tencent.mm.plugin.location.ui.impl.d0) arrayList2.get(0)).f144790p);
            this.f144910e.getIController().animateTo(((com.tencent.mm.plugin.location.ui.impl.d0) arrayList2.get(0)).f144778d, ((com.tencent.mm.plugin.location.ui.impl.d0) arrayList2.get(0)).f144777c, com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.location.ui.impl.d0) arrayList2.get(0)).f144789o) ? 15 : 18);
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(5);
        for (int i27 = 0; i27 < arrayList2.size(); i27++) {
            com.tencent.mm.plugin.location.ui.impl.d0 d0Var3 = (com.tencent.mm.plugin.location.ui.impl.d0) arrayList2.get(i27);
            arrayList3.add(new com.tencent.mapsdk.raster.model.LatLng(d0Var3.f144778d, d0Var3.f144777c));
        }
        com.tencent.mapsdk.raster.model.LatLngBounds build = com.tencent.mapsdk.raster.model.LatLngBounds.builder().include(arrayList3).build();
        if (java.lang.Double.isInfinite(build.getNortheast().getLatitude()) || java.lang.Double.isNaN(build.getNortheast().getLongitude()) || java.lang.Double.isInfinite(build.getSouthwest().getLatitude()) || java.lang.Double.isNaN(build.getSouthwest().getLongitude())) {
            return;
        }
        this.f144910e.animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory.newLatLngBounds(build, 250));
    }
}
