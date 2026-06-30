package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public abstract class BaseLifeUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int U = 0;
    public long A;
    public long B;
    public int C;
    public boolean D;
    public boolean E;
    public java.lang.String F;
    public java.lang.String G;
    public com.tencent.mm.ui.tools.c9 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f152230J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public int P;
    public boolean Q;
    public boolean R;
    public final android.view.View.OnClickListener S;
    public final i11.c T;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLoadMoreListView f152231d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f152232e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent f152233f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.nearlife.ui.a f152234g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.nearlife.ui.a f152235h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f152236i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f152237m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f152238n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f152239o = "";

    /* renamed from: p, reason: collision with root package name */
    public final i11.e f152240p;

    /* renamed from: q, reason: collision with root package name */
    public dn3.k f152241q;

    /* renamed from: r, reason: collision with root package name */
    public int f152242r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f152243s;

    /* renamed from: t, reason: collision with root package name */
    public r45.d64 f152244t;

    /* renamed from: u, reason: collision with root package name */
    public float f152245u;

    /* renamed from: v, reason: collision with root package name */
    public float f152246v;

    /* renamed from: w, reason: collision with root package name */
    public int f152247w;

    /* renamed from: x, reason: collision with root package name */
    public float f152248x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f152249y;

    /* renamed from: z, reason: collision with root package name */
    public long f152250z;

    public BaseLifeUI() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f152240p = i11.h.e();
        this.f152244t = null;
        this.f152245u = 0.0f;
        this.f152246v = 0.0f;
        this.f152247w = 0;
        this.f152248x = 0.0f;
        this.f152249y = true;
        this.f152250z = -1L;
        this.A = -1L;
        this.B = -1L;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = "";
        this.G = "";
        this.I = false;
        this.f152230J = false;
        this.K = false;
        this.L = 0;
        this.M = false;
        this.N = 1;
        this.P = -1;
        this.Q = true;
        this.S = new com.tencent.mm.plugin.nearlife.ui.b(this);
        this.T = new com.tencent.mm.plugin.nearlife.ui.j(this);
    }

    public static void U6(com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI, com.tencent.mm.plugin.nearlife.ui.a aVar) {
        r45.d64 d64Var;
        if (baseLifeUI.f152244t == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseLifeUI", "location is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        ((java.util.ArrayList) baseLifeUI.f152243s).clear();
        if (aVar.f152309q && (d64Var = baseLifeUI.f152244t) != null) {
            ((java.util.ArrayList) baseLifeUI.f152243s).add(d64Var);
            r45.d64 d64Var2 = baseLifeUI.f152244t;
            hashMap.put(new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(d64Var2.f372175e, d64Var2.f372174d), 1);
        }
        java.util.Iterator it = aVar.f152304i.iterator();
        while (it.hasNext()) {
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData = (com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData) it.next();
            if (!hashMap.containsKey(backwardSupportUtil$ExifHelper$LatLongData)) {
                r45.d64 d64Var3 = new r45.d64();
                d64Var3.f372178h = "";
                d64Var3.f372179i = 0;
                d64Var3.f372175e = backwardSupportUtil$ExifHelper$LatLongData.f192409d;
                d64Var3.f372174d = backwardSupportUtil$ExifHelper$LatLongData.f192410e;
                d64Var3.f372177g = "";
                d64Var3.f372176f = 0;
                ((java.util.ArrayList) baseLifeUI.f152243s).add(d64Var3);
                hashMap.put(backwardSupportUtil$ExifHelper$LatLongData, 1);
            }
        }
        baseLifeUI.f152241q = null;
        baseLifeUI.f152242r = -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "list size:" + ((java.util.ArrayList) baseLifeUI.f152243s).size() + " show curpos: " + aVar.f152309q);
    }

    public boolean V6() {
        return true;
    }

    public final void W6(int i17) {
        this.f152231d.removeFooterView(this.f152232e);
        this.f152231d.removeFooterView(this.f152236i);
        com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView = this.f152231d;
        mMLoadMoreListView.removeFooterView(mMLoadMoreListView.f197493d);
        android.view.View view = this.f152236i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "creaetPoiVisble", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "creaetPoiVisble", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f152237m.setVisibility(i17);
        this.f152238n.setVisibility(i17);
        if (i17 == 0) {
            this.f152231d.addFooterView(this.f152236i);
            return;
        }
        com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView2 = this.f152231d;
        if (mMLoadMoreListView2.f197493d == null) {
            mMLoadMoreListView2.f();
        }
        try {
            mMLoadMoreListView2.removeFooterView(mMLoadMoreListView2.f197493d);
            mMLoadMoreListView2.addFooterView(mMLoadMoreListView2.f197493d);
        } catch (java.lang.Exception unused) {
        }
        this.f152231d.addFooterView(this.f152232e);
    }

    public abstract com.tencent.mm.plugin.nearlife.ui.a X6();

    public abstract com.tencent.mm.plugin.nearlife.ui.a Y6();

    public void Z6(int i17, boolean z17, java.lang.String str, boolean z18) {
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "";
        java.lang.String str6 = (str == null || !str.startsWith("mm_")) ? str : "";
        if (i17 >= 0) {
            i18 = z17 ? z18 ? 43 : 3 : z18 ? 41 : 1;
            if (this.E) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(z17 ? 5 : 4);
                g0Var.d(11139, objArr);
            }
            if (z17) {
                str4 = this.f152235h.getItem(i17).f242006a;
                if (this.f152235h.getCount() >= 1) {
                    str5 = this.f152235h.getItem(1).f242013h;
                }
            } else {
                str4 = this.f152234g.getItem(i17).f242006a;
                if (this.f152234g.getCount() >= 1) {
                    str5 = this.f152234g.getItem(1).f242013h;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                str5 = this.G;
            }
            str2 = str4;
            str3 = str5;
        } else {
            if (!this.D) {
                r2 = z18 ? 42 : 2;
            } else if (z18) {
                r2 = 44;
            }
            i18 = r2;
            str2 = "";
            str3 = str2;
        }
        r45.d64 d64Var = this.f152244t;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11135, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17 + 1), java.lang.Long.valueOf(this.f152250z), java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(this.A), java.lang.Integer.valueOf(this.C), d64Var == null ? "null/null" : java.lang.String.format("%f/%f", java.lang.Float.valueOf(d64Var.f372175e), java.lang.Float.valueOf(this.f152244t.f372174d)), str6, java.lang.Integer.valueOf(this.P), str2, wo.w0.g(true), 0, 0, 0, "", 0, str3);
    }

    public abstract void a7(double d17, double d18);

    public abstract void b7(double d17, double d18);

    public void c7() {
        android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.a39, null);
        this.f152236i = inflate;
        this.f152237m = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.olz);
        this.f152238n = (android.widget.TextView) this.f152236i.findViewById(com.tencent.mm.R.id.oly);
        this.f152236i.setOnClickListener(this.S);
        android.view.View inflate2 = android.view.View.inflate(this, com.tencent.mm.R.layout.c_b, null);
        this.f152232e = inflate2;
        this.f152231d.addFooterView(inflate2);
        android.view.View view = this.f152232e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "preAddHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI", "preAddHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d7(boolean z17) {
        java.lang.Object[] objArr;
        if (this.f152241q != null) {
            return false;
        }
        int size = ((java.util.ArrayList) this.f152243s).size() - 1;
        int i17 = this.f152242r;
        if (size <= i17) {
            this.f152242r = -1;
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "index inc to end, ret");
            return false;
        }
        int i18 = i17 + 1;
        this.f152242r = i18;
        r45.d64 d64Var = (r45.d64) ((java.util.ArrayList) this.f152243s).get(i18);
        if (this.f152242r == 0) {
            this.C++;
        }
        if ((this.I ? this.f152235h.g(new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(d64Var.f372175e, d64Var.f372174d)) : this.f152234g.g(new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(d64Var.f372175e, d64Var.f372174d))) <= 0) {
            return d7(z17);
        }
        r45.cu5 cu5Var = null;
        if (this.I) {
            com.tencent.mm.plugin.nearlife.ui.a aVar = this.f152235h;
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(d64Var.f372175e, d64Var.f372174d);
            java.util.HashMap hashMap = (java.util.HashMap) aVar.f152305m;
            if (hashMap.containsKey(backwardSupportUtil$ExifHelper$LatLongData)) {
                cu5Var = (r45.cu5) hashMap.get(backwardSupportUtil$ExifHelper$LatLongData);
            }
        } else {
            com.tencent.mm.plugin.nearlife.ui.a aVar2 = this.f152234g;
            com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData2 = new com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData(d64Var.f372175e, d64Var.f372174d);
            java.util.HashMap hashMap2 = (java.util.HashMap) aVar2.f152305m;
            if (hashMap2.containsKey(backwardSupportUtil$ExifHelper$LatLongData2)) {
                cu5Var = (r45.cu5) hashMap2.get(backwardSupportUtil$ExifHelper$LatLongData2);
            }
        }
        r45.cu5 cu5Var2 = cu5Var;
        boolean z18 = this.I;
        java.util.Vector vector = dn3.k.f242023p;
        java.lang.String str = (z18 ? 1 : 0) + "";
        java.util.Vector vector2 = dn3.k.f242023p;
        if (vector2.contains(str)) {
            objArr = false;
        } else {
            vector2.add(str);
            objArr = true;
        }
        if (objArr != true) {
            this.f152242r = -1;
            return false;
        }
        if (-1 == this.f152250z) {
            this.f152250z = java.lang.System.currentTimeMillis();
        }
        this.f152241q = new dn3.k(z18 ? 1 : 0, this.L, d64Var.f372174d, d64Var.f372175e, d64Var.f372176f, d64Var.f372179i, d64Var.f372177g, d64Var.f372178h, cu5Var2, this.I ? this.f152235h.f152310r : "", this.P, z17, false, this.M);
        c01.d9.e().g(this.f152241q);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "start get lbs life list, index:%d, lat:%f, long:%f", java.lang.Integer.valueOf(this.f152242r), java.lang.Float.valueOf(d64Var.f372175e), java.lang.Float.valueOf(d64Var.f372174d));
        return true;
    }

    public final void e7() {
        if (!this.I) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "is not Search mode pass createpoi");
            return;
        }
        if (V6()) {
            boolean z17 = true;
            try {
                int intValue = java.lang.Integer.valueOf(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("POICreateForbiden")).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseLifeUI", "getDynamicConfig createpoi %d", java.lang.Integer.valueOf(intValue));
                if (intValue == 1) {
                    return;
                }
            } catch (java.lang.Exception unused) {
            }
            com.tencent.mm.plugin.nearlife.ui.a aVar = this.f152235h;
            java.lang.String str = aVar.f152310r;
            aVar.getClass();
            java.lang.String trim = str.trim();
            java.util.Iterator it = aVar.f152302g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                dn3.i iVar = (dn3.i) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.f242008c) && trim.equals(iVar.f242008c.trim())) {
                    break;
                }
            }
            if (z17) {
                W6(8);
            } else {
                this.f152237m.setText(java.lang.String.format(getResources().getString(com.tencent.mm.R.string.h9j), this.f152235h.f152310r));
                W6(0);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c5y;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView = (com.tencent.mm.ui.base.MMLoadMoreListView) findViewById(com.tencent.mm.R.id.k5a);
        this.f152231d = mMLoadMoreListView;
        mMLoadMoreListView.setFooterTips(getString(this.M ? com.tencent.mm.R.string.f492617m22 : com.tencent.mm.R.string.h5t));
        this.f152233f = (com.tencent.mm.plugin.nearlife.ui.NearLifeErrorContent) findViewById(com.tencent.mm.R.id.k5_);
        c7();
        this.f152234g = X6();
        this.f152235h = Y6();
        this.f152231d.setAdapter((android.widget.ListAdapter) this.f152234g);
        this.f152233f.setListView(this.f152231d);
        this.f152234g.notifyDataSetChanged();
        setBackBtn(new com.tencent.mm.plugin.nearlife.ui.c(this));
        setToTop(new com.tencent.mm.plugin.nearlife.ui.d(this));
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        this.H = c9Var;
        c9Var.f210324i = new com.tencent.mm.plugin.nearlife.ui.f(this);
        this.f152231d.setOnLoadMoreListener(new com.tencent.mm.plugin.nearlife.ui.g(this));
        this.f152231d.g();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.Q = getIntent().getBooleanExtra("poi_show_none", true);
        this.P = (int) (java.lang.System.currentTimeMillis() / 1000);
        dn3.k.f242023p.clear();
        c01.d9.e().a(603, this);
        this.L = getIntent().getIntExtra("near_life_scene", 0);
        this.G = getIntent().getStringExtra("request_id");
        this.M = getIntent().getBooleanExtra("search_all", false);
        this.f152243s = new java.util.ArrayList();
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(603, this);
        super.onDestroy();
        i11.e eVar = this.f152240p;
        if (eVar != null) {
            ((i11.h) eVar).m(this.T);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((i11.h) this.f152240p).m(this.T);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        i11.e eVar;
        super.onResume();
        this.f152234g.notifyDataSetChanged();
        this.f152231d.c();
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.LOCAION, new com.tencent.mm.plugin.nearlife.ui.h(this)) || (eVar = this.f152240p) == null) {
            return;
        }
        ((i11.h) eVar).l(this.T, true, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0352  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r22, int r23, java.lang.String r24, com.tencent.mm.modelbase.m1 r25) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.nearlife.ui.BaseLifeUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
