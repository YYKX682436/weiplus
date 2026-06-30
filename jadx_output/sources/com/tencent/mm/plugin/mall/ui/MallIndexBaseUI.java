package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public abstract class MallIndexBaseUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements y60.e, at4.i0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f148238u = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f148242g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f148243h;

    /* renamed from: p, reason: collision with root package name */
    public int f148248p;

    /* renamed from: q, reason: collision with root package name */
    public int f148249q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f148250r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f148251s;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f148239d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.mall.ui.i f148240e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f148241f = null;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f148244i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f148245m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f148246n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f148247o = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f148252t = false;

    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.f492291fy2);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
    }

    public abstract void U6();

    public abstract void V6();

    public final com.tencent.mm.plugin.wallet_core.model.mall.MallFunction W6(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f148245m)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) list.get(i17);
                if (mallFunction != null && this.f148245m.equals(mallFunction.f179819d)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    public final com.tencent.mm.plugin.wallet_core.model.mall.MallFunction X6(java.util.List list) {
        if (list != null && list.size() != 0 && !android.text.TextUtils.isEmpty(this.f148246n)) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) list.get(i17);
                if (mallFunction != null && this.f148246n.equals(mallFunction.f179824i)) {
                    return mallFunction;
                }
            }
        }
        return null;
    }

    public void Y6(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction, int i17) {
        int i18;
        if (mallFunction != null && i17 >= 0) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = mallFunction.f179827o;
            java.lang.String str = (mallNews == null || com.tencent.mm.sdk.platformtools.t8.K0(mallNews.f179834g)) ? "" : mallFunction.f179827o.f179834g;
            java.util.ArrayList arrayList = this.f148244i;
            int size = arrayList == null ? 0 : arrayList.size();
            boolean d17 = com.tencent.mm.plugin.mall.ui.i.d(mallFunction);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[10];
            objArr[0] = mallFunction.f179819d;
            objArr[1] = java.lang.Integer.valueOf(size);
            objArr[2] = 0;
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = str;
            objArr[5] = java.lang.Integer.valueOf(d17 ? 2 : 1);
            objArr[6] = 1;
            objArr[7] = 0;
            objArr[8] = 0;
            objArr[9] = 0;
            g0Var.d(10881, objArr);
        }
        if (mallFunction != null && !com.tencent.mm.sdk.platformtools.t8.K0(mallFunction.f179824i)) {
            if (((tg1.n) ((com.tencent.mm.plugin.appbrand.service.i6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i6.class))).wi(mallFunction.f179824i, null)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "handleFunction, intercept by AppBrandNativeLink, nativeUrl = %s", mallFunction.f179824i);
                bt4.f.b().f(mallFunction.f179819d);
                bt4.g.b().d(mallFunction.f179819d);
                if (mallFunction.f179827o != null) {
                    bt4.f.b().d(mallFunction);
                    return;
                }
                return;
            }
        }
        int a17 = com.tencent.mm.plugin.mall.ui.n1.a(mallFunction);
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "functionType : " + a17);
        switch (a17) {
            case 0:
                android.content.Intent intent = new android.content.Intent();
                if (isTransparent()) {
                    intent.putExtra("key_is_hide_progress", true);
                }
                intent.putExtra("key_func_info", mallFunction);
                j45.l.j(this, "recharge", ".ui.PhoneRechargeUI", intent, null);
                com.tencent.mm.wallet_core.model.n1.d(15, 0);
                return;
            case 1:
                gm0.j1.i();
                this.f148248p = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", mallFunction.f179825m);
                intent2.putExtra("geta8key_username", c01.z1.r());
                intent2.putExtra("pay_channel", 1);
                intent2.putExtra("KPublisherId", "pay_wallet");
                intent2.putExtra("key_download_restrict", mallFunction.f179830r);
                intent2.putExtra("key_wallet_region", this.f148248p);
                intent2.putExtra("key_function_id", mallFunction.f179819d);
                intent2.putExtra(com.tencent.mm.ui.w2.f211205r, true);
                intent2.putExtra("geta8key_scene", 46);
                com.tencent.mm.wallet_core.ui.r1.T(getContext(), intent2);
                return;
            case 2:
                com.tencent.mars.xlog.Log.w("MicroMsg.MallIndexBaseUI", "doSelectFunction no jump");
                return;
            case 3:
                com.tencent.mars.xlog.Log.w("MicroMsg.MallIndexBaseUI", "doSelectFunction do nothing");
                db5.t7.makeText(this, "fuction list error", 1).show();
                return;
            case 4:
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.d(11701, 0, 0, 0, 0, 1);
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("pay_channel", 1);
                j45.l.j(this, "luckymoney", ".ui.LuckyMoneyIndexUI", intent3, null);
                com.tencent.mm.wallet_core.model.n1.d(13, 0);
                g0Var2.d(11850, 4, 0);
                return;
            case 5:
                com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var3.d(11458, 1);
                if (c01.z1.I()) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList.add(getString(com.tencent.mm.R.string.i1h));
                    linkedList2.add(0);
                    linkedList.add(getString(com.tencent.mm.R.string.b_x));
                    linkedList2.add(1);
                    i18 = 11850;
                    db5.e1.d(this, getString(com.tencent.mm.R.string.f492816hz3), linkedList, linkedList2, null, true, new com.tencent.mm.plugin.mall.ui.z(this));
                } else {
                    i18 = 11850;
                    gm0.j1.i();
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MALL_INDEX_HAS_SHOWN_FTF_NOTICE_BOOLEAN;
                    if (((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                        d7();
                    } else {
                        gm0.j1.i();
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                        db5.e1.t(this, getString(com.tencent.mm.R.string.kmt), "", new com.tencent.mm.plugin.mall.ui.a0(this));
                    }
                }
                com.tencent.mm.wallet_core.model.n1.d(14, 0);
                g0Var3.d(i18, 3, 0);
                return;
            case 6:
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("key_from_scene", 1);
                j45.l.j(getContext(), "offline", ".ui.WalletOfflineEntranceUI", intent4, null);
                com.tencent.mm.wallet_core.model.n1.d(9, 0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11850, 5, 0);
                return;
            case 7:
                android.content.Intent intent5 = new android.content.Intent();
                if (isTransparent()) {
                    intent5.putExtra("key_is_hide_progress", true);
                }
                intent5.putExtra("key_func_info", mallFunction);
                j45.l.j(this, "recharge", ".ui.RechargeUI", intent5, null);
                return;
            case 8:
                android.content.Intent intent6 = new android.content.Intent();
                intent6.putExtra("BaseScanUI_select_scan_mode", 1);
                intent6.putExtra("key_scan_report_enter_scene", 3);
                j45.l.j(getContext(), "scanner", ".ui.BaseScanUI", intent6, null);
                return;
            case 9:
                j45.l.h(getContext(), "luckymoney", ".f2f.ui.LuckyMoneyF2FQRCodeUI");
                return;
            default:
                return;
        }
    }

    public abstract void Z6();

    public abstract boolean a7();

    public abstract void b7(android.view.View view);

    @Override // at4.i0
    public void c6(int i17, java.util.Map map, java.lang.Object[] objArr) {
        if (i17 != 12 || this.f148241f == null) {
            return;
        }
        j7();
    }

    public abstract void c7();

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean checkProcLife() {
        return false;
    }

    public final void d7() {
        if (c01.z1.I()) {
            com.tencent.mm.wallet_core.a.k(getContext(), "wallet_payu", "PayURemittanceProcess", null, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("pay_channel", 1);
        com.tencent.mm.wallet_core.a.k(getContext(), "remittance", "RemittanceProcess", bundle, null);
    }

    public abstract void e7();

    public abstract void f7();

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

    public abstract void h7();

    public abstract void i7();

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.mall.ui.v(this));
        this.f148239d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.j9u);
        c7();
        Z6();
        com.tencent.mm.plugin.mall.ui.i iVar = new com.tencent.mm.plugin.mall.ui.i(this, this.f148248p);
        this.f148240e = iVar;
        this.f148239d.setAdapter((android.widget.ListAdapter) iVar);
        this.f148240e.f148393f = new com.tencent.mm.plugin.mall.ui.y(this);
        b7(this.f148250r);
        this.f148242g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7);
        h7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.f148245m) && com.tencent.mm.sdk.platformtools.t8.K0(this.f148246n)) ? false : true;
    }

    public abstract void j7();

    public void k7() {
        java.util.ArrayList arrayList;
        int i17;
        boolean z17 = true;
        showOptionMenu(true);
        com.tencent.mm.plugin.mall.ui.i iVar = this.f148240e;
        java.util.ArrayList arrayList2 = this.f148244i;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) iVar.f148391d;
        arrayList3.clear();
        if (arrayList2 != null) {
            int i18 = 0;
            while (i18 < arrayList2.size()) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int i19 = 0;
                while (i19 < 3) {
                    int i27 = i18 + i19;
                    if (i27 >= arrayList2.size() || (i19 > 0 && i27 - 1 >= 0 && ((com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) arrayList2.get(i17)).f179828p != ((com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) arrayList2.get(i27)).f179828p)) {
                        break;
                    }
                    com.tencent.mm.plugin.mall.ui.g gVar = new com.tencent.mm.plugin.mall.ui.g(iVar);
                    gVar.f148382b = i27;
                    gVar.f148381a = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) arrayList2.get(i27);
                    arrayList4.add(gVar);
                    i19++;
                }
                if (arrayList4.size() > 0) {
                    arrayList3.add(arrayList4);
                }
                i18 += i19;
            }
            iVar.f148398n = 0;
            iVar.f148399o = 0;
            java.util.Iterator it = arrayList3.iterator();
            int i28 = -1;
            while (it.hasNext()) {
                java.util.ArrayList arrayList5 = (java.util.ArrayList) it.next();
                if (arrayList5.size() > 0) {
                    if (i28 != -1 && i28 != ((com.tencent.mm.plugin.mall.ui.g) arrayList5.get(0)).f148381a.f179828p) {
                        break;
                    }
                    iVar.f148398n += arrayList5.size();
                    iVar.f148399o++;
                    i28 = ((com.tencent.mm.plugin.mall.ui.g) arrayList5.get(0)).f148381a.f179828p;
                }
            }
            iVar.f148399o--;
        }
        iVar.f148392e = ef3.r.wi().Bi(iVar.f148396i).f13824y;
        if (arrayList3.size() > 3 && (arrayList = (java.util.ArrayList) arrayList3.get(3)) != null && arrayList.size() > 0) {
            int i29 = ((com.tencent.mm.plugin.mall.ui.g) arrayList.get(0)).f148381a.f179828p;
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = ((com.tencent.mm.plugin.mall.ui.g) it6.next()).f148381a;
                if (mallFunction.f179828p != i29) {
                    break;
                } else if (com.tencent.mm.plugin.mall.ui.i.d(mallFunction)) {
                    break;
                }
            }
        }
        z17 = false;
        iVar.f148400p = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionListAdapter", "hasMoreNewAtFirstSectionBottom: %s", java.lang.Boolean.valueOf(z17));
        iVar.notifyDataSetChanged();
        U6();
        i7();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            gm0.j1.i();
            this.f148248p = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
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
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "onCreate");
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            finish();
        }
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f148248p = getIntent().getIntExtra("key_wallet_region", intValue);
        java.lang.String stringExtra = getIntent().getStringExtra("key_uuid");
        this.f148243h = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f148243h = java.util.UUID.randomUUID().toString();
        }
        addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().a(this);
        this.f148245m = getIntent().getStringExtra("key_func_id");
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "mFuncId:" + this.f148245m + " wallet_region: " + this.f148248p + " walletType: " + c01.z1.m() + " default_region: " + intValue);
        this.f148246n = getIntent().getStringExtra("key_native_url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mNativeUrl:");
        sb6.append(this.f148246n);
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", sb6.toString());
        if (isTransparent()) {
            return;
        }
        V6();
        setContentViewVisibility(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "index Oncreate");
        f7();
        initView();
        bt4.f.a();
        e7();
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "hy: use default controller for MallIndexUI");
        g7();
        if (c01.z1.I()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MallIndexBaseUI", "it is payu account ,not initFingerPrint");
        } else {
            pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
            if (aVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null, do showFingerPrintEntrance()");
                ((mz2.a) aVar).f(this);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MallIndexBaseUI", "IFingerPrintMgr is not null");
            }
        }
        com.tencent.mm.wallet_core.model.n1.d(1, 0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11850, 1, 0);
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.mall.ui.MallIndexBaseUI$$a());
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX);
        ((pg0.a3) i95.n0.c(pg0.a3.class)).aj().b(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        if (isTransparent()) {
            return true;
        }
        k7();
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean z17 = true;
        h45.g0.f278945a = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "index onResume");
        if (!gm0.j1.a()) {
            finish();
        }
        if (!isTransparent()) {
            a7();
            if (ef3.r.wi().Ai(this.f148248p) == null) {
                doSceneProgress(new ef3.j(this.f148248p, bt4.d.a(), 0), true);
                com.tencent.mars.xlog.Log.e("MicroMsg.MallIndexBaseUI", "funcitonlist invalid");
                z17 = false;
            } else {
                doSceneProgress(new ef3.j(this.f148248p, bt4.d.a(), 1), false);
                this.f148244i = ef3.r.wi().Ai(this.f148248p);
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "has data");
                k7();
                return;
            }
            return;
        }
        java.util.ArrayList Ai = ef3.r.wi().Ai(this.f148248p);
        this.f148244i = Ai;
        if (Ai != null && Ai.size() > 0) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction W6 = W6(this.f148244i);
            if (W6 == null) {
                W6 = X6(this.f148244i);
            }
            Y6(W6, -1);
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "mFunctionList == null");
        try {
            if (getIntent().getIntExtra("key_scene", 0) != 1 && com.tencent.mm.sdk.platformtools.t8.K0(this.f148246n)) {
                java.lang.String stringExtra = getIntent().getStringExtra("key_url");
                doSceneForceProgress(new ef3.j(this.f148248p, bt4.d.a(), getIntent().getStringExtra("key_app_id"), this.f148245m, stringExtra == null ? "" : stringExtra, 0));
            }
            doSceneForceProgress(new ef3.j(this.f148248p, bt4.d.a(), 0));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallIndexBaseUI", e17, "", new java.lang.Object[0]);
            setResult(0);
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction;
        com.tencent.mm.plugin.appbrand.service.s6 s6Var;
        if (m1Var instanceof us4.a) {
            if (i17 != 0 || i18 != 0) {
                finish();
                return true;
            }
            if (this.f148247o) {
                this.f148247o = false;
                if (((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_is_reg == 0) {
                    com.tencent.mm.wallet_core.a.k(this, "wallet_payu", "PayUOpenProcess", null, null);
                    return true;
                }
            }
        }
        if (m1Var.getType() != 495) {
            return false;
        }
        ef3.j jVar = (ef3.j) m1Var;
        int i19 = this.f148248p;
        if (jVar.f252413g != i19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "pass wallet local: %d cgi: %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(jVar.f252413g));
        }
        if (!isTransparent()) {
            if (i17 == 0 && i18 == 0 && ef3.r.wi().Ai(this.f148248p) != null && jVar.f252410d != null) {
                this.f148244i = ef3.r.wi().Ai(this.f148248p);
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "get from server now! " + this.f148248p + " " + this.f148244i.size());
                bt4.f b17 = bt4.f.b();
                java.util.ArrayList arrayList = this.f148244i;
                b17.getClass();
                if (arrayList != null) {
                    java.util.HashMap hashMap = (java.util.HashMap) b17.f24470a;
                    java.util.HashSet hashSet = new java.util.HashSet(hashMap.keySet());
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(((com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) it.next()).f179819d);
                    }
                    java.util.Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        hashMap.remove((java.lang.String) it6.next());
                    }
                    b17.g();
                }
                if (!com.tencent.mm.sdk.platformtools.t8.L0(this.f148244i)) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.Iterator it7 = this.f148244i.iterator();
                    while (it7.hasNext()) {
                        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction2 = (com.tencent.mm.plugin.wallet_core.model.mall.MallFunction) it7.next();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(mallFunction2.f179824i)) {
                            linkedList.add(mallFunction2.f179824i);
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList) && (s6Var = (com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)) != null) {
                        s6Var.gd(linkedList);
                    }
                }
            }
            k7();
            boolean booleanExtra = getIntent().getBooleanExtra("key_wallet_has_red", false);
            if (this.f148239d.getChildCount() != 0) {
                int firstVisiblePosition = this.f148239d.getFirstVisiblePosition();
                int top = this.f148239d.getChildAt(0).getTop();
                com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "initCheckNew %s fpos %s top %s", java.lang.Boolean.valueOf(booleanExtra), java.lang.Integer.valueOf(firstVisiblePosition), java.lang.Integer.valueOf(top));
                if (firstVisiblePosition == 0 && top == 0 && booleanExtra && !this.f148252t && this.f148244i != null) {
                    this.f148252t = true;
                    int headerViewsCount = this.f148239d.getHeaderViewsCount() + this.f148240e.getCount();
                    java.util.List list = this.f148240e.f148391d;
                    if (list != null) {
                        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                        int size = arrayList2.size() - 1;
                        while (true) {
                            if (size <= 0) {
                                break;
                            }
                            java.util.Iterator it8 = ((java.util.ArrayList) arrayList2.get(size)).iterator();
                            while (it8.hasNext()) {
                                com.tencent.mm.plugin.mall.ui.g gVar = (com.tencent.mm.plugin.mall.ui.g) it8.next();
                                if (gVar != null && (mallFunction = gVar.f148381a) != null && com.tencent.mm.plugin.mall.ui.i.d(mallFunction)) {
                                    int firstVisiblePosition2 = this.f148239d.getFirstVisiblePosition();
                                    int lastVisiblePosition = this.f148239d.getLastVisiblePosition();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "get listview show top %s bottom %s redPos: %d", java.lang.Integer.valueOf(firstVisiblePosition2), java.lang.Integer.valueOf(lastVisiblePosition), java.lang.Integer.valueOf(headerViewsCount));
                                    if (headerViewsCount < firstVisiblePosition2 || headerViewsCount > lastVisiblePosition) {
                                        int i27 = com.tencent.mm.plugin.mall.ui.b.f148334c;
                                        int i28 = com.tencent.mm.plugin.mall.ui.b.f148337f;
                                        int i29 = com.tencent.mm.plugin.mall.ui.b.f148335d;
                                        int i37 = i28 + ((headerViewsCount + 1) * i29) + i27;
                                        if (headerViewsCount > 2) {
                                            i37 += i27;
                                        }
                                        if (headerViewsCount > 3) {
                                            i37 += i27;
                                        }
                                        int scrollY = (i37 + (i29 / 3)) - this.f148239d.getScrollY();
                                        int i38 = com.tencent.mm.ui.bk.h(this).y;
                                        if (com.tencent.mm.ui.bk.k(this)) {
                                            i38 -= com.tencent.mm.ui.bk.j(this);
                                        }
                                        if (getSupportActionBar() != null) {
                                            i38 -= getSupportActionBar().l();
                                        }
                                        this.f148239d.smoothScrollBy(scrollY - i38, 1000);
                                    }
                                }
                            }
                            headerViewsCount--;
                            size--;
                        }
                    }
                }
            }
            Z6();
        } else if (i17 == 0 && i18 == 0 && jVar.f252410d != null) {
            if (getIntent().getIntExtra("key_scene", 0) == 1) {
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction W6 = W6(jVar.f252410d);
                if (W6 != null) {
                    Y6(W6, -1);
                }
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f148246n)) {
                java.util.ArrayList arrayList3 = jVar.f252410d;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "functionScene.mFunctionList != null");
                    Y6(W6(jVar.f252410d), -1);
                } else if (ef3.r.wi().Ai(this.f148248p) == null || ef3.r.wi().Ai(this.f148248p).size() <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() == null");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MallIndexBaseUI", "SubCoreMall.getCore().getFunctionList() != null");
                    Y6(W6(ef3.r.wi().Ai(this.f148248p)), -1);
                }
            } else {
                com.tencent.mm.plugin.wallet_core.model.mall.MallFunction X6 = X6(jVar.f252410d);
                if (X6 == null) {
                    setResult(0);
                    finish();
                    return true;
                }
                Y6(X6, -1);
            }
            setResult(-1);
            finish();
        } else {
            setResult(0);
            finish();
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
}
