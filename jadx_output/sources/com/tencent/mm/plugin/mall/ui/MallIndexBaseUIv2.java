package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public abstract class MallIndexBaseUIv2 extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements y60.e, at4.i0 {

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f148253w = {"moneydata.hk", "wechatpay.com.hk"};

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f148257g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WcPayBannerView f148258h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f148259i;

    /* renamed from: q, reason: collision with root package name */
    public int f148264q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f148265r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f148266s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f148267t;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f148254d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.mall.ui.o f148255e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f148256f = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f148260m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f148261n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f148262o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f148263p = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f148268u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f148269v = false;

    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a0, code lost:
    
        r0 = r0.buildUpon();
        r0.appendQueryParameter("wx_client_click_time", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        r0.appendQueryParameter("wx_client_render_opt", java.lang.String.valueOf(r16));
        r0 = r0.build().toString();
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "wrapUrlWithWebViewRenderOptParams src:%s", r7);
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "wrapUrlWithWebViewRenderOptParams wrapUrl:%s", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d8, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V6(com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2 r17, r45.n53 r18, int r19) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2.V6(com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2, r45.n53, int):void");
    }

    private com.tencent.mm.plugin.wallet_core.model.mall.MallFunction a7(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f148262o)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) list.get(i17);
                if (mallFunction != null && this.f148262o.equals(mallFunction.f179819d)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    private com.tencent.mm.plugin.wallet_core.model.mall.MallFunction b7(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f148263p)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) list.get(i17);
                if (mallFunction != null && this.f148263p.equals(mallFunction.f179824i)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
    }

    public final void U6() {
        r45.r67 r67Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int lastVisiblePosition = this.f148254d.getLastVisiblePosition();
        if (lastVisiblePosition <= this.f148254d.getHeaderViewsCount()) {
            return;
        }
        int headerViewsCount = lastVisiblePosition <= this.f148254d.getHeaderViewsCount() + this.f148255e.getCount() ? lastVisiblePosition - this.f148254d.getHeaderViewsCount() : this.f148255e.getCount();
        java.util.List list = this.f148255e.f148449d;
        for (int i17 = 0; i17 < headerViewsCount; i17++) {
            java.util.Iterator it = ((java.util.ArrayList) ((java.util.ArrayList) list).get(i17)).iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.plugin.mall.ui.m) it.next()) != null) {
                    sb6.append(java.lang.Long.toString(r8.f148441a.f381082d.f381996d & io.flutter.embedding.android.KeyboardMap.kValueMask));
                    sb6.append(";");
                }
            }
        }
        int i18 = headerViewsCount - 1;
        if (i18 < 0) {
            return;
        }
        int intValue = ((java.lang.Integer) bt4.d.e(this.f148264q).get(((com.tencent.mm.plugin.mall.ui.m) ((java.util.ArrayList) ((java.util.ArrayList) list).get(i18)).get(0)).f148441a.f381089n)).intValue();
        int i19 = this.f148264q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = bt4.d.d(i19).f382048d;
        if (linkedList != null) {
            for (int i27 = 0; i27 < linkedList.size(); i27++) {
                r45.o53 o53Var = (r45.o53) linkedList.get(i27);
                if (o53Var != null && (r67Var = o53Var.f381940d) != null) {
                    arrayList.add(java.lang.Integer.valueOf(r67Var.f384581d));
                }
            }
        }
        for (int i28 = 0; i28 < intValue; i28++) {
            sb7.append(arrayList.get(i28));
            sb7.append(";");
        }
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "exposure report productID：%s、groupId：%s", sb6, sb7);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20548, sb6, sb7);
    }

    public abstract void W6();

    public abstract void X6();

    public abstract void Y6();

    public abstract int Z6();

    @Override // at4.i0
    public void c6(int i17, java.util.Map map, java.lang.Object[] objArr) {
        if (i17 != 12 || this.f148256f == null) {
            return;
        }
        m7();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r12, int r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2.c7(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction, int):void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    public abstract void d7();

    public abstract boolean e7();

    public abstract void f7(android.view.View view);

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    public abstract void g7();

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bw8;
    }

    public void h7() {
    }

    public abstract void i7();

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.mall.ui.c0(this));
        this.f148267t = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.m7o);
        this.f148254d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.j9u);
        g7();
        d7();
        com.tencent.mm.plugin.mall.ui.o oVar = new com.tencent.mm.plugin.mall.ui.o(this, this.f148264q);
        this.f148255e = oVar;
        this.f148254d.setAdapter((android.widget.ListAdapter) oVar);
        this.f148255e.f148451f = new com.tencent.mm.plugin.mall.ui.f0(this);
        f7(this.f148265r);
        this.f148257g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7);
        com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) findViewById(com.tencent.mm.R.id.pga);
        this.f148258h = wcPayBannerView;
        wcPayBannerView.a();
        k7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.f148262o) && com.tencent.mm.sdk.platformtools.t8.K0(this.f148263p)) ? false : true;
    }

    public abstract void j7();

    public abstract void k7();

    public abstract void l7();

    public abstract void m7();

    public void n7() {
        r45.r67 r67Var;
        int i17;
        int i18;
        int i19;
        showOptionMenu(true);
        com.tencent.mm.plugin.mall.ui.o oVar = this.f148255e;
        if (oVar != null) {
            java.util.ArrayList arrayList = this.f148261n;
            java.util.ArrayList arrayList2 = (java.util.ArrayList) oVar.f148449d;
            arrayList2.clear();
            if (arrayList != null) {
                for (int i27 = 0; i27 < arrayList.size(); i27 += i17) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    i17 = 0;
                    while (i17 < 4 && (i18 = i27 + i17) < arrayList.size() && (i17 <= 0 || i18 - 1 < 0 || ((r45.n53) arrayList.get(i19)).f381089n == ((r45.n53) arrayList.get(i18)).f381089n)) {
                        com.tencent.mm.plugin.mall.ui.m mVar = new com.tencent.mm.plugin.mall.ui.m(oVar);
                        mVar.f148442b = i18;
                        mVar.f148441a = (r45.n53) arrayList.get(i18);
                        arrayList3.add(mVar);
                        i17++;
                    }
                    if (arrayList3.size() > 0) {
                        arrayList2.add(arrayList3);
                    }
                }
            }
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            java.util.LinkedList linkedList = bt4.d.d(oVar.f148454i).f382048d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.o53 o53Var = (r45.o53) it.next();
                    if (o53Var != null && (r67Var = o53Var.f381940d) != null) {
                        sparseArray.put(r67Var.f384581d, r67Var.f384582e);
                    }
                }
            }
            oVar.f148450e = sparseArray;
            oVar.notifyDataSetChanged();
        }
        W6();
        X6();
        l7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            gm0.j1.i();
            this.f148264q = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            if (i18 == -1) {
                if (c01.z1.z()) {
                    finish();
                    return;
                }
                finish();
                com.tencent.mm.autogen.events.RequestEnterWalletEvent requestEnterWalletEvent = new com.tencent.mm.autogen.events.RequestEnterWalletEvent();
                requestEnterWalletEvent.f54693g.f6968a = getContext();
                requestEnterWalletEvent.e();
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "onCreate");
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            finish();
        }
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f148264q = getIntent().getIntExtra("key_wallet_region", intValue);
        java.lang.String stringExtra = getIntent().getStringExtra("key_uuid");
        this.f148259i = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f148259i = java.util.UUID.randomUUID().toString();
        }
        addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX);
        addSceneEndListener(4362);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().a(this);
        this.f148262o = getIntent().getStringExtra("key_func_id");
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "mFuncId:" + this.f148262o + " wallet_region: " + this.f148264q + " walletType: " + c01.z1.m() + " default_region: " + intValue);
        this.f148263p = getIntent().getStringExtra("key_native_url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mNativeUrl:");
        sb6.append(this.f148263p);
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", sb6.toString());
        if (isTransparent()) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "Oncreate：isTransparent()");
            return;
        }
        Y6();
        setContentViewVisibility(0);
        j7();
        initView();
        bt4.f.a();
        i7();
        if (c01.z1.I()) {
            com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexBaseUIv2", "it is payu account ,not initFingerPrint");
        } else {
            pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
            if (aVar != null) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
                ((mz2.a) aVar).f(this);
            } else {
                com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexBaseUIv2", "IFingerPrintMgr is not null");
            }
        }
        com.tencent.mm.wallet_core.model.n1.d(1, 0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11850, 1, 0);
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.mall.ui.MallIndexBaseUIv2$$a());
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX);
        removeSceneEndListener(4362);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().b(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        if (isTransparent()) {
            return true;
        }
        n7();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.widget.RelativeLayout relativeLayout;
        super.onResume();
        boolean z17 = true;
        h45.g0.f278945a = 1;
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "onResume");
        if (!gm0.j1.a()) {
            finish();
        }
        if (!isTransparent() && (relativeLayout = this.f148267t) != null) {
            relativeLayout.post(new com.tencent.mm.plugin.mall.ui.b0(this));
        }
        if (!isTransparent()) {
            e7();
            if (bt4.d.b(this.f148264q).size() == 0) {
                com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexBaseUIv2", "funcitonlist invalid");
                doSceneProgress(new ef3.k(this.f148264q, false), true);
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "funcitonlist has cache");
                doSceneProgress(new ef3.k(this.f148264q, true), false);
                this.f148261n = bt4.d.b(this.f148264q);
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "has data");
                n7();
                U6();
                return;
            }
            return;
        }
        java.util.ArrayList Ai = ef3.r.wi().Ai(this.f148264q);
        this.f148260m = Ai;
        if (Ai != null && Ai.size() > 0) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction a76 = a7(this.f148260m);
            if (a76 == null) {
                a76 = b7(this.f148260m);
            }
            c7(a76, -1);
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "mFunctionList == null");
        try {
            if (getIntent().getIntExtra("key_scene", 0) != 1 && com.tencent.mm.sdk.platformtools.t8.K0(this.f148263p)) {
                java.lang.String stringExtra = getIntent().getStringExtra("key_url");
                doSceneForceProgress(new ef3.j(this.f148264q, bt4.d.a(), getIntent().getStringExtra("key_app_id"), this.f148262o, stringExtra == null ? "" : stringExtra, 0));
            }
            doSceneForceProgress(new ef3.j(this.f148264q, bt4.d.a(), 0));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicorMsg.MallIndexBaseUIv2", e17, "", new java.lang.Object[0]);
            setResult(0);
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.c77 c77Var;
        r45.n53 n53Var;
        m1Var.getType();
        if (m1Var.getType() != 4362) {
            if (m1Var.getType() != 495) {
                return false;
            }
            ef3.j jVar = (ef3.j) m1Var;
            int i19 = this.f148264q;
            if (jVar.f252413g != i19) {
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "pass wallet local: %d cgi: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(jVar.f252413g));
            }
            if (isTransparent()) {
                if (i17 == 0 && i18 == 0 && jVar.f252410d != null) {
                    if (getIntent().getIntExtra("key_scene", 0) == 1) {
                        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction a76 = a7(jVar.f252410d);
                        if (a76 != null) {
                            c7(a76, -1);
                        }
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f148263p)) {
                        java.util.ArrayList arrayList = jVar.f252410d;
                        if (arrayList != null && arrayList.size() > 0) {
                            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "functionScene.mFunctionList != null");
                            c7(a7(jVar.f252410d), -1);
                        } else if (ef3.r.wi().Ai(this.f148264q) == null || ef3.r.wi().Ai(this.f148264q).size() <= 0) {
                            com.tencent.mars.xlog.Log.e("MicorMsg.MallIndexBaseUIv2", "SubCoreMall.getCore().getFunctionList() == null");
                        } else {
                            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "SubCoreMall.getCore().getFunctionList() != null");
                            c7(a7(ef3.r.wi().Ai(this.f148264q)), -1);
                        }
                    } else {
                        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction b76 = b7(jVar.f252410d);
                        if (b76 == null) {
                            setResult(0);
                            finish();
                            return true;
                        }
                        c7(b76, -1);
                    }
                    setResult(-1);
                    finish();
                } else {
                    setResult(0);
                    finish();
                }
            }
            return true;
        }
        ef3.k kVar = (ef3.k) m1Var;
        int i27 = this.f148264q;
        if (kVar.f252417g != i27) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "pass wallet local: %d cgi: %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(kVar.f252417g));
        }
        if (i17 == 0 && i18 == 0) {
            this.f148261n = bt4.d.b(this.f148264q);
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "get from server now! " + this.f148264q + " " + this.f148261n.size());
            bt4.f b17 = bt4.f.b();
            java.util.ArrayList arrayList2 = this.f148261n;
            b17.getClass();
            if (arrayList2 != null) {
                java.util.HashMap hashMap = (java.util.HashMap) b17.f24470a;
                java.util.HashSet hashSet = new java.util.HashSet(hashMap.keySet());
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashSet.remove(((r45.n53) it.next()).f381082d.f381996d + "");
                }
                java.util.Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    hashMap.remove((java.lang.String) it6.next());
                }
                b17.g();
            }
        }
        n7();
        boolean booleanExtra = getIntent().getBooleanExtra("key_wallet_has_red", false);
        if (this.f148254d.getChildCount() != 0) {
            int firstVisiblePosition = this.f148254d.getFirstVisiblePosition();
            int top = this.f148254d.getChildAt(0).getTop();
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "initCheckNew %s fpos %s top %s", java.lang.Boolean.valueOf(booleanExtra), java.lang.Integer.valueOf(firstVisiblePosition), java.lang.Integer.valueOf(top));
            if (firstVisiblePosition == 0 && top == 0 && booleanExtra && !this.f148268u && this.f148261n != null) {
                this.f148268u = true;
                int headerViewsCount = this.f148254d.getHeaderViewsCount() + this.f148255e.getCount();
                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "mFunctionsGv.getHeaderViewsCount()： %s mFunctionAdapter.getCount(): %s", java.lang.Integer.valueOf(this.f148254d.getHeaderViewsCount()), java.lang.Integer.valueOf(this.f148255e.getCount()));
                java.util.List list = this.f148255e.f148449d;
                if (list != null) {
                    java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
                    int size = arrayList3.size() - 1;
                    while (true) {
                        if (size <= 0) {
                            break;
                        }
                        java.util.Iterator it7 = ((java.util.ArrayList) arrayList3.get(size)).iterator();
                        while (it7.hasNext()) {
                            com.tencent.mm.plugin.mall.ui.m mVar = (com.tencent.mm.plugin.mall.ui.m) it7.next();
                            if (mVar != null && (n53Var = mVar.f148441a) != null && com.tencent.mm.plugin.mall.ui.o.c(n53Var)) {
                                int firstVisiblePosition2 = this.f148254d.getFirstVisiblePosition();
                                int lastVisiblePosition = this.f148254d.getLastVisiblePosition();
                                com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "get listview show top %s bottom %s redPos: %d", java.lang.Integer.valueOf(firstVisiblePosition2), java.lang.Integer.valueOf(lastVisiblePosition), java.lang.Integer.valueOf(headerViewsCount));
                                if (headerViewsCount < firstVisiblePosition2 || headerViewsCount > lastVisiblePosition) {
                                    int Z6 = Z6() + (com.tencent.mm.plugin.mall.ui.b.f148335d * (headerViewsCount + 1)) + ((i65.a.b(getContext(), 48) + i65.a.b(getContext(), 8)) * ((java.lang.Integer) bt4.d.e(this.f148264q).get(mVar.f148441a.f381089n)).intValue());
                                    int i28 = com.tencent.mm.ui.bk.h(this).y;
                                    if (com.tencent.mm.ui.bk.k(this)) {
                                        i28 -= com.tencent.mm.ui.bk.j(this);
                                    }
                                    if (getSupportActionBar() != null) {
                                        i28 -= getSupportActionBar().l();
                                    }
                                    this.f148254d.smoothScrollBy(((Z6 - i28) - this.f148254d.getScrollY()) + (com.tencent.mm.plugin.mall.ui.b.f148335d / 3), 1000);
                                    r45.n53 n53Var2 = mVar.f148441a;
                                    com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "offset function is %s, groupName is %s", n53Var2.f381082d.f381997e, java.lang.Integer.valueOf(n53Var2.f381089n));
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "the last redDot item is visible");
                                }
                            }
                        }
                        headerViewsCount--;
                        size--;
                    }
                }
            }
        }
        d7();
        U6();
        java.util.ArrayList arrayList4 = this.f148261n;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                r45.n53 n53Var3 = (r45.n53) it8.next();
                r45.n67 n67Var = n53Var3.f381084f;
                if (n67Var != null && n67Var.f381113g == 2 && (c77Var = n67Var.f381112f) != null && !android.text.TextUtils.isEmpty(c77Var.f371361d)) {
                    linkedList.add(n53Var3.f381084f.f381112f.f371361d);
                }
            }
            if (!linkedList.isEmpty()) {
                ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).Y4(linkedList);
            }
        }
        java.util.ArrayList arrayList5 = this.f148261n;
        if (arrayList5 != null && arrayList5.size() > 0) {
            java.util.Iterator it9 = this.f148261n.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                r45.n67 n67Var2 = ((r45.n53) it9.next()).f381084f;
                if (n67Var2 != null && n67Var2.f381113g == 2) {
                    ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.G);
                    break;
                }
            }
        }
        if (kVar.f252416f == null) {
            new r45.o93();
        }
        r45.o93 o93Var = kVar.f252416f;
        if (o93Var == null) {
            o93Var = new r45.o93();
        }
        r45.g7 g7Var = o93Var.f382050f;
        if (g7Var == null) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "alert info is null");
        } else if (!g7Var.f374934d) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "need alert is false");
        } else if (this.f148269v) {
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "has show tips halfpage, ignore show");
        } else {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(getContext(), 2, 3, false);
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.dv7, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g7Var.f374935e)) {
                textView.setText("");
            } else {
                textView.setText(g7Var.f374935e);
            }
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            z2Var.t(inflate);
            android.view.View inflate2 = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.dv6, null);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.cgi);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g7Var.f374936f)) {
                textView2.setText("");
            } else {
                textView2.setText(g7Var.f374936f);
            }
            z2Var.j(inflate2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g7Var.f374937g)) {
                z2Var.y(getResources().getString(com.tencent.mm.R.string.f490454vi));
            } else {
                z2Var.y(g7Var.f374937g);
            }
            z2Var.x(1);
            z2Var.z(getResources().getColor(com.tencent.mm.R.color.f478719fa));
            com.tencent.mars.xlog.Log.i("MicorMsg.MallIndexBaseUIv2", "show alert dialog, title is : %s, desc is : %s", textView.getText(), textView2.getText());
            z2Var.F = new com.tencent.mm.plugin.mall.ui.g0(this, z2Var);
            this.f148269v = true;
            h7();
            z2Var.C();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14419, this.f148259i, 7);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void setStatusColor() {
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public void shouldFixStatusBar() {
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(hf3.c.class);
        hashSet.add(hf3.e.class);
    }
}
