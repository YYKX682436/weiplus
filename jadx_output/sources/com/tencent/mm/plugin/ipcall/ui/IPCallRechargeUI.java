package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class IPCallRechargeUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f142650z = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f142651d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String[] f142652e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f142653f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142654g;

    /* renamed from: h, reason: collision with root package name */
    public int f142655h;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f142658n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f142659o;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f142663s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.y3 f142664t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f142665u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f142666v;

    /* renamed from: w, reason: collision with root package name */
    public p83.f f142667w;

    /* renamed from: i, reason: collision with root package name */
    public int f142656i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f142657m = -1;

    /* renamed from: p, reason: collision with root package name */
    public final q83.g f142660p = new q83.g();

    /* renamed from: q, reason: collision with root package name */
    public final q83.f f142661q = new q83.f();

    /* renamed from: r, reason: collision with root package name */
    public final q83.i f142662r = new q83.i();

    /* renamed from: x, reason: collision with root package name */
    public final ec0.e f142668x = new com.tencent.mm.plugin.ipcall.ui.n3(this);

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f142669y = new com.tencent.mm.plugin.ipcall.ui.l3(this);

    public final void T6(java.lang.String str) {
        com.tencent.mm.plugin.ipcall.model.j a17 = com.tencent.mm.plugin.ipcall.model.j.a();
        if (!a17.f142473c) {
            a17.b(false);
        }
        java.util.ArrayList arrayList = a17.f142471a;
        this.f142667w = new p83.f(arrayList.size() == 0 ? t83.c.g(t83.f.f()) : t83.c.g(((java.lang.Integer) arrayList.get(0)).toString()), str);
        c01.d9.e().g(this.f142667w);
    }

    public final void U6(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(com.tencent.mm.R.string.g5l);
        }
        db5.e1.t(this, str, getString(com.tencent.mm.R.string.g5l), new com.tencent.mm.plugin.ipcall.ui.v3(this));
    }

    public final boolean V6(java.lang.String str) {
        int i17;
        if ((((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WCOSecondPurchaseSwitch", 0) > 0) && (i17 = this.f142657m) >= 0) {
            java.lang.Object item = this.f142664t.getItem(i17);
            if (item instanceof r45.l57) {
                r45.l57 l57Var = (r45.l57) item;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l57Var.f379168o)) {
                    java.lang.String str2 = l57Var.f379168o;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "tryHandleShowWebViewPayDialog:" + str2);
                    db5.e1.C(this, str, getString(com.tencent.mm.R.string.g5l), getString(com.tencent.mm.R.string.g4z), getString(com.tencent.mm.R.string.f490347sg), true, new com.tencent.mm.plugin.ipcall.ui.k3(this, str2), null);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bm8;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        int i27;
        java.lang.String str;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        java.lang.String str2;
        int i47;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. requestCode:[%d] resultCode:[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str3 = "";
        if (i17 != 2001) {
            if (i17 == 2002) {
                android.app.ProgressDialog progressDialog = this.f142666v;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f142666v.dismiss();
                }
                boolean z17 = false;
                if (intent != null) {
                    i19 = intent.getIntExtra("key_err_code", 0);
                    str3 = intent.getStringExtra("key_err_msg");
                    int intExtra = intent.getIntExtra("key_response_position", 0);
                    z17 = i19 == 100000001;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult restore.errCode:[%d] errMsg:[%s] errPosition:[%d] isFailedConsume:[%s]", java.lang.Integer.valueOf(i19), str3, java.lang.Integer.valueOf(intExtra), java.lang.String.valueOf(z17));
                    i27 = intExtra;
                } else {
                    i19 = 0;
                    i27 = 0;
                }
                q83.i iVar = this.f142662r;
                iVar.f360782f = i19;
                long j17 = 0;
                iVar.f360780d = j17;
                if (i18 != -1) {
                    iVar.f360781e = 2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore failed");
                    dp.a.makeText(this, com.tencent.mm.R.string.f492351g60, 0).show();
                } else if (intent == null || i19 != 0) {
                    if (z17) {
                        iVar.f360781e = 1;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 17L, 1L, true);
                        str3 = getString(com.tencent.mm.R.string.f492352g61);
                    } else if (i27 == 3) {
                        iVar.f360781e = 2;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 16L, 1L, true);
                    } else {
                        iVar.f360781e = 2;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore not ok");
                    dp.a.makeText(this, str3, 0).show();
                } else {
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_response_product_ids");
                    if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                        iVar.f360781e = 3;
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. no product can be restored");
                        dp.a.makeText(this, com.tencent.mm.R.string.f492352g61, 0).show();
                    } else {
                        iVar.f360781e = j17;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 15L, 1L, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult. restore ok");
                        db5.e1.t(this, getString(com.tencent.mm.R.string.f492353g62), getString(com.tencent.mm.R.string.f492354g63), new com.tencent.mm.plugin.ipcall.ui.u3(this));
                    }
                }
                iVar.getClass();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                iVar.f360779c = java.lang.System.currentTimeMillis();
                iVar.b();
                return;
            }
            return;
        }
        if (intent != null) {
            i29 = intent.getIntExtra("key_err_code", 0);
            java.lang.String stringExtra = intent.getStringExtra("key_err_msg");
            long longExtra = intent.getLongExtra("key_launch_ts", 0L);
            int intExtra2 = intent.getIntExtra("key_gw_error_code", 0);
            int intExtra3 = intent.getIntExtra("key_response_position", 0);
            boolean z19 = i29 == 100000001;
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onActivityResult pay.errCode:[%d] errMsg:[%s] errGWCode:[%s] errPosition:[%d] isFailedConsume:[%s]", java.lang.Integer.valueOf(i29), stringExtra, java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra3), java.lang.String.valueOf(z19));
            q83.f fVar = this.f142661q;
            if (i29 != 6 || intExtra2 == 0) {
                fVar.f360770h = i29;
            } else {
                fVar.f360770h = intExtra2;
            }
            if (intExtra3 == 3) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(257L, 9L, 1L, true);
                g0Var.idkeyStat(257L, 11L, 1L, true);
                fVar.f360770h = 0;
                fVar.f360771i = 2;
                str = getString(com.tencent.mm.R.string.g6k);
                i39 = intExtra3;
                i47 = intExtra2;
            } else {
                if (intExtra3 != 1) {
                    if (i18 == -1 && i29 == 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 9L, 1L, true);
                    } else if (z19) {
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.idkeyStat(257L, 9L, 1L, true);
                        g0Var2.idkeyStat(257L, 12L, 1L, true);
                        i39 = intExtra3;
                        str2 = stringExtra;
                        fVar.f360770h = 0;
                        i47 = intExtra2;
                        fVar.f360771i = 1;
                        str = str2;
                    }
                }
                i39 = intExtra3;
                str2 = stringExtra;
                i47 = intExtra2;
                str = str2;
            }
            fVar.f360769g = longExtra;
            fVar.getClass();
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            fVar.f360765c = java.lang.System.currentTimeMillis();
            fVar.b();
            i38 = i47;
            i37 = i39;
            i28 = -1;
        } else {
            str = "";
            i28 = -1;
            i29 = 0;
            i37 = 0;
            i38 = 0;
        }
        if (i18 == i28) {
            if (intent != null && i29 == 0) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_response_product_ids");
                intent.getStringArrayListExtra("key_response_series_ids");
                java.util.Iterator<java.lang.String> it = stringArrayListExtra2.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (next == null) {
                        next = "";
                    }
                    objArr[0] = next;
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "buy product ok productId:", objArr);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var3.idkeyStat(257L, 6L, 1L, true);
                g0Var3.idkeyStat(257L, 10L, 1L, true);
                dp.a.makeText(this, com.tencent.mm.R.string.g5m, 0).show();
                finish();
                return;
            }
            if (intent != null && i29 == 100000002) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 6L, 1L, true);
                U6(str);
                return;
            }
            if (intent != null && i29 == 109) {
                U6(str);
                return;
            }
            if (intent != null && i29 == 1) {
                java.lang.String string = getString(com.tencent.mm.R.string.g5k);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 8L, 1L, true);
                dp.a.makeText(this, string, 0).show();
                return;
            }
            if (intent != null && i29 == 113) {
                db5.e1.t(this, getString(com.tencent.mm.R.string.f492350g56), getString(com.tencent.mm.R.string.g5l), new com.tencent.mm.plugin.ipcall.ui.t3(this));
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 7L, 1L, true);
            if (i37 == 3) {
                U6(str);
                return;
            }
            if (i29 == 100000001 || i29 == 6) {
                if (i38 == 0) {
                    dp.a.makeText(this, getString(com.tencent.mm.R.string.g3w), 0).show();
                    return;
                }
                java.lang.String string2 = getString(com.tencent.mm.R.string.g3y);
                if (V6(string2)) {
                    return;
                }
                dp.a.makeText(this, string2, 0).show();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(com.tencent.wxmm.v2helper.EMethodGetNetworkQuality, this);
        setMMTitle(com.tencent.mm.R.string.g4b);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.o3(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.ipcall.ui.p3(this));
        this.f142663s = (android.widget.ListView) findViewById(com.tencent.mm.R.id.lmx);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bm6, null);
        this.f142663s.addFooterView(viewGroup, null, false);
        com.tencent.mm.plugin.ipcall.ui.y3 y3Var = new com.tencent.mm.plugin.ipcall.ui.y3(this);
        this.f142664t = y3Var;
        this.f142663s.setAdapter((android.widget.ListAdapter) y3Var);
        this.f142665u = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.o_q);
        java.lang.String string = getString(com.tencent.mm.R.string.g4h);
        android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(string);
        newSpannable.setSpan(new com.tencent.mm.plugin.ipcall.ui.q3(this), 0, string.length(), 33);
        this.f142665u.setText(newSpannable);
        this.f142665u.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        this.f142666v = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.g3z), true, true, new com.tencent.mm.plugin.ipcall.ui.r3(this));
        T6("");
        this.f142660p.d();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 4L, 1L, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q83.g gVar = this.f142660p;
        gVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        gVar.f360774c = java.lang.System.currentTimeMillis();
        gVar.b();
        c01.d9.e().q(com.tencent.wxmm.v2helper.EMethodGetNetworkQuality, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof p83.f) {
            q83.g gVar = this.f142660p;
            gVar.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            gVar.f360775d = java.lang.System.currentTimeMillis();
            gVar.f360776e = i18;
            int i19 = 0;
            if (i17 != 0 || i18 != 0) {
                android.app.ProgressDialog progressDialog = this.f142666v;
                if (progressDialog != null && progressDialog.isShowing()) {
                    this.f142666v.dismiss();
                }
                dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.g3w), 0).show();
                finish();
                return;
            }
            p83.f fVar = (p83.f) m1Var;
            r45.rr3 rr3Var = fVar.f352744e;
            com.tencent.mm.plugin.ipcall.ui.y3 y3Var = this.f142664t;
            y3Var.f143083d = rr3Var.f385135e;
            y3Var.f143085f = rr3Var;
            y3Var.notifyDataSetChanged();
            java.util.LinkedList linkedList = rr3Var.f385135e;
            this.f142651d = new java.lang.String[linkedList.size()];
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.f142651d[i19] = ((r45.l57) it.next()).f379161e;
                i19++;
            }
            this.f142658n = rr3Var.f385140m;
            this.f142659o = rr3Var.f385141n;
            this.f142654g = rr3Var.f385139i;
            this.f142655h = rr3Var.f385138h;
            if (fVar.f352745f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "onSceneEnd IsUnkownCurency=true");
                java.lang.String[] strArr = this.f142651d;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRechargeUI", "startQueryGooglePrice");
                com.tencent.mm.pluginsdk.model.i2.a(this, this.f142651d, this.f142668x);
                return;
            }
            android.app.ProgressDialog progressDialog2 = this.f142666v;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f142666v.dismiss();
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f142669y;
            if (n3Var != null) {
                n3Var.sendEmptyMessage(1002);
            }
        }
    }
}
