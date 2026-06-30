package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class MobileRemitHistoryRecodUI extends com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f156562r = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f156563d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f156564e;

    /* renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f156569m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.mobile.ui.v f156570n;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f156565f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f156566g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f156567h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f156568i = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f156571o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f156572p = new int[2];

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f156573q = new com.tencent.mm.plugin.remittance.mobile.ui.o(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489305c24;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        setMMTitle(getString(com.tencent.mm.R.string.f492548gx3));
        setBackBtn(new com.tencent.mm.plugin.remittance.mobile.ui.i(this));
        this.f156563d = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.jnj);
        this.f156564e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jni);
        java.util.List list = this.f156568i;
        if (((java.util.ArrayList) list).isEmpty()) {
            this.f156563d.setVisibility(8);
            this.f156564e.setVisibility(0);
            return;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(this);
        this.f156569m = linearLayoutManager;
        linearLayoutManager.Q(1);
        this.f156563d.setLayoutManager(this.f156569m);
        this.f156563d.N(new com.tencent.mm.plugin.remittance.mobile.ui.w(getContext()));
        com.tencent.mm.plugin.remittance.mobile.ui.v vVar = new com.tencent.mm.plugin.remittance.mobile.ui.v(getContext(), this.f156567h, list, new com.tencent.mm.plugin.remittance.mobile.ui.l(this));
        this.f156570n = vVar;
        this.f156563d.setAdapter(vVar);
        this.f156563d.i(new com.tencent.mm.plugin.remittance.mobile.ui.m(this));
        this.f156570n.notifyDataSetChanged();
        this.f156563d.post(this.f156573q);
        this.f156563d.P(new com.tencent.mm.plugin.remittance.mobile.ui.n(this));
        this.f156563d.setVisibility(0);
        this.f156564e.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f156565f = getIntent().getStringExtra("key_homepage_ext");
        this.f156567h = getIntent().getBooleanExtra("key_finish", true);
        this.f156566g = getIntent().getStringExtra("key_last_id");
        java.util.ArrayList<com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord$HisRcvrParcel> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_history_record");
        java.util.List list = this.f156568i;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            int i17 = sw3.f.f413466u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecord$HisRcvrParcel netSceneMobileRemitGetRecord$HisRcvrParcel : parcelableArrayListExtra) {
                r45.ow3 ow3Var = new r45.ow3();
                ow3Var.f382575d = netSceneMobileRemitGetRecord$HisRcvrParcel.f156548d;
                ow3Var.f382576e = netSceneMobileRemitGetRecord$HisRcvrParcel.f156549e;
                ow3Var.f382577f = netSceneMobileRemitGetRecord$HisRcvrParcel.f156550f;
                ow3Var.f382578g = netSceneMobileRemitGetRecord$HisRcvrParcel.f156551g;
                ow3Var.f382579h = netSceneMobileRemitGetRecord$HisRcvrParcel.f156552h;
                ow3Var.f382580i = netSceneMobileRemitGetRecord$HisRcvrParcel.f156553i;
                arrayList.add(ow3Var);
            }
            ((java.util.ArrayList) list).addAll(arrayList);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "initData() mFinish:%s mLastId:%s mHisRecord.size:%s", java.lang.Boolean.valueOf(this.f156567h), this.f156566g, java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
        initView();
        addSceneEndListener(2993);
        addSceneEndListener(1495);
        addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX);
    }

    @Override // com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2993);
        removeSceneEndListener(1495);
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.getType());
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof sw3.f;
            java.util.List list = this.f156568i;
            if (z17) {
                r45.hp6 hp6Var = ((sw3.f) m1Var).f413467t;
                r45.hp6 hp6Var2 = hp6Var != null ? hp6Var : null;
                if (hp6Var2 == null || hp6Var2.f376378d != 0) {
                    db5.t7.makeText(getContext(), (hp6Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(hp6Var2.f376379e)) ? getString(com.tencent.mm.R.string.kkk) : hp6Var2.f376379e, 0).show();
                } else {
                    this.f156566g = hp6Var2.f376382h;
                    boolean z18 = hp6Var2.f376381g;
                    this.f156567h = z18;
                    this.f156570n.f156724d = z18;
                    java.util.LinkedList linkedList = hp6Var2.f376380f;
                    if (!linkedList.isEmpty()) {
                        ((java.util.ArrayList) list).addAll(linkedList);
                    }
                    this.f156570n.notifyDataSetChanged();
                }
                return true;
            }
            if (m1Var instanceof sw3.h) {
                sw3.h hVar = (sw3.h) m1Var;
                r45.jp6 jp6Var = hVar.f413471v;
                if (jp6Var == null) {
                    jp6Var = null;
                }
                if (jp6Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "NetSceneMobileRemitGetRecvInfo rcvrResp is null");
                    return true;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(jp6Var.f378017d);
                java.lang.String str2 = jp6Var.f378018e;
                java.lang.String str3 = hVar.f413469t;
                com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "NetSceneMobileRemitGetRecvInfo rcvrId:%s ret_code:%s ret_msg:%s", str3, valueOf, str2);
                if (jp6Var.f378017d == 0) {
                    if (jp6Var.f378020g != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "show remark or nickname change dialog!");
                        com.tencent.mm.wallet_core.model.f0.d(this, jp6Var.f378020g, null, new com.tencent.mm.plugin.remittance.mobile.ui.p(this, jp6Var));
                    } else if (jp6Var.f378033w != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHistoryRecodUI", "show free oneself from dialog!");
                        com.tencent.mm.wallet_core.model.f0.d(this, jp6Var.f378033w, null, new com.tencent.mm.plugin.remittance.mobile.ui.q(this, jp6Var));
                    } else {
                        tw3.b.a(getContext(), jp6Var);
                    }
                    return true;
                }
                if (jp6Var.f378019f == 1) {
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r45.ow3 ow3Var = (r45.ow3) it.next();
                        if (com.tencent.mm.sdk.platformtools.t8.D0(ow3Var.f382575d, str3)) {
                            ow3Var.f382580i = 1;
                            break;
                        }
                    }
                    this.f156570n.notifyDataSetChanged();
                }
                db5.e1.E(getContext(), com.tencent.mm.sdk.platformtools.t8.K0(jp6Var.f378018e) ? getString(com.tencent.mm.R.string.kkk) : jp6Var.f378018e, "", getResources().getString(com.tencent.mm.R.string.gww), false, null).show();
                return true;
            }
            if (m1Var instanceof sw3.c) {
                r45.fp6 fp6Var = ((sw3.c) m1Var).f413463t;
                r45.fp6 fp6Var2 = fp6Var != null ? fp6Var : null;
                if (fp6Var2 == null || fp6Var2.f374537d != 0) {
                    db5.t7.makeText(getContext(), (fp6Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(fp6Var2.f374538e)) ? getString(com.tencent.mm.R.string.kkk) : fp6Var2.f374538e, 0).show();
                }
                return true;
            }
        } else {
            if (!(m1Var instanceof sw3.f) && !(m1Var instanceof sw3.h)) {
                boolean z19 = m1Var instanceof sw3.c;
            }
            if (i18 == 0) {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = getString(com.tencent.mm.R.string.gwx);
                }
                db5.t7.makeText(context, str, 0).show();
            }
        }
        return false;
    }
}
