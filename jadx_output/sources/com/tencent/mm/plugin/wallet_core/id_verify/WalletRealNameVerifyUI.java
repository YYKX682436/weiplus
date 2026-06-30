package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class WalletRealNameVerifyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements android.view.View.OnClickListener, qp5.i0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f179228w = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179229d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179230e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179231f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f179232g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f179233h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.CheckBox f179234i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f179235m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f179236n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.ElementQuery f179237o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[] f179238p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.model.Profession f179239q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f179240r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f179241s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f179242t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179243u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f179244v;

    public final void U6(com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.wallet_core.h process = getProcess();
        android.os.Bundle bundle = process != null ? process.f213801c : null;
        java.lang.String str = ((ys4.g) m1Var).f465232d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response succ");
        if (process != null) {
            bundle.putString("key_real_name_token", str);
            bundle.putString("key_country_code", this.f179242t);
            bundle.putString("key_province_code", this.f179243u);
            bundle.putString("key_city_code", this.f179244v);
            bundle.putParcelable("key_profession", this.f179239q);
            process.o(this, 0, bundle);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489632d81;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.kx9);
        this.f179233h = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f179229d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.k3n);
        this.f179230e = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f483580bb3);
        this.f179231f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.l5u);
        this.f179232g = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.l5m);
        this.f179236n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hdt);
        this.f179229d.setOnInputValidChangeListener(this);
        this.f179230e.setOnInputValidChangeListener(this);
        this.f179231f.setOnInputValidChangeListener(this);
        this.f179232g.setOnInputValidChangeListener(this);
        this.f179229d.setFocusable(true);
        this.f179229d.getInfoIv().setVisibility(8);
        qp5.p.e(this.f179230e);
        rp5.b logicDelegate = this.f179230e.getLogicDelegate();
        if (logicDelegate instanceof qp5.n) {
            ((qp5.n) logicDelegate).f(1);
        }
        this.f179231f.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.y0(this));
        this.f179232g.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.z0(this));
        this.f179233h.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.a1(this));
        setEditFocusListener(this.f179230e, 1, false);
        setBackBtn(new com.tencent.mm.plugin.wallet_core.id_verify.b1(this));
        this.f179234i = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.f482782nu);
        this.f179235m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482781nt);
        this.f179234i.setChecked(true);
        this.f179234i.setOnCheckedChangeListener(new com.tencent.mm.plugin.wallet_core.id_verify.c1(this));
        this.f179235m.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.e1(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameVerifyUI", "no choose!");
                return;
            }
            com.tencent.mm.plugin.wallet_core.id_verify.model.Profession profession = (com.tencent.mm.plugin.wallet_core.id_verify.model.Profession) intent.getParcelableExtra("key_select_profession");
            this.f179239q = profession;
            this.f179231f.setText(profession.f179421d);
            return;
        }
        if (i17 == 2) {
            if (i18 != -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameVerifyUI", "no area choose!");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("CountryName");
            java.lang.String stringExtra2 = intent.getStringExtra("ProviceName");
            java.lang.String stringExtra3 = intent.getStringExtra("CityName");
            this.f179242t = intent.getStringExtra("Country");
            this.f179243u = intent.getStringExtra("Contact_Province");
            this.f179244v = intent.getStringExtra("Contact_City");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                sb6.append(stringExtra);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                sb6.append(" ");
                sb6.append(stringExtra2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                sb6.append(" ");
                sb6.append(stringExtra3);
            }
            this.f179232g.setText(sb6.toString());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mNetSceneMgr.c(1616);
        this.f179237o = (com.tencent.mm.plugin.wallet_core.model.ElementQuery) getInput().getParcelable("elemt_query");
        initView();
        doSceneForceProgress(new ys4.k(null));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.mNetSceneMgr.i(1616);
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (((com.tencent.mm.sdk.platformtools.t8.K0(r3.f179242t) && com.tencent.mm.sdk.platformtools.t8.K0(r3.f179243u) && com.tencent.mm.sdk.platformtools.t8.K0(r3.f179244v)) ? false : true) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    @Override // qp5.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInputValidChange(boolean r4) {
        /*
            r3 = this;
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r4 = r3.f179229d
            java.lang.String r4 = r4.getText()
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r3.f179230e
            java.lang.String r0 = r0.getText()
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L15
            goto L47
        L15:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r4 == 0) goto L1c
            goto L47
        L1c:
            boolean r4 = r3.f179240r
            if (r4 == 0) goto L3f
            java.lang.String r4 = r3.f179242t
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 == 0) goto L3b
            java.lang.String r4 = r3.f179243u
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 == 0) goto L3b
            java.lang.String r4 = r3.f179244v
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto L39
            goto L3b
        L39:
            r4 = r1
            goto L3c
        L3b:
            r4 = r2
        L3c:
            if (r4 != 0) goto L3f
            goto L47
        L3f:
            boolean r4 = r3.f179241s
            if (r4 == 0) goto L49
            com.tencent.mm.plugin.wallet_core.id_verify.model.Profession r4 = r3.f179239q
            if (r4 != 0) goto L49
        L47:
            r4 = r1
            goto L4a
        L49:
            r4 = r2
        L4a:
            if (r4 != 0) goto L57
            android.widget.Button r4 = r3.f179233h
            r4.setEnabled(r1)
            android.widget.Button r4 = r3.f179233h
            r4.setClickable(r1)
            goto L61
        L57:
            android.widget.Button r4 = r3.f179233h
            r4.setEnabled(r2)
            android.widget.Button r4 = r3.f179233h
            r4.setClickable(r2)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.onInputValidChange(boolean):void");
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response fail");
        } else {
            if (m1Var instanceof ys4.g) {
                ys4.g gVar = (ys4.g) m1Var;
                if (gVar.f465239n == null) {
                    U6(m1Var);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify show juveniles dialog");
                    at4.y0 y0Var = gVar.f465239n;
                    db5.e1.A(this, y0Var.f14013a, "", y0Var.f14015c, y0Var.f14014b, new com.tencent.mm.plugin.wallet_core.id_verify.f1(this, m1Var), new com.tencent.mm.plugin.wallet_core.id_verify.g1(this));
                }
                return true;
            }
            if (m1Var instanceof ys4.k) {
                ys4.k kVar = (ys4.k) m1Var;
                this.f179240r = kVar.f465249d == 1;
                boolean z17 = kVar.f465250e == 1;
                this.f179241s = z17;
                if (!z17) {
                    this.f179231f.setVisibility(8);
                }
                if (!this.f179240r) {
                    this.f179232g.setVisibility(8);
                }
                if (this.f179240r || this.f179241s) {
                    this.f179236n.setText(com.tencent.mm.R.string.f493604kx4);
                }
                this.f179238p = kVar.f465251f;
                return true;
            }
        }
        return false;
    }
}
