package com.tencent.mm.plugin.wallet.pwd.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletForgotPwdVerifyIdUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI implements android.view.View.OnLayoutChangeListener {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f178882u = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f178883d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178884e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f178885f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f178886g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f178887h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f178888i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f178889m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f178890n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup.MarginLayoutParams f178891o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup.MarginLayoutParams f178892p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f178893q;

    /* renamed from: r, reason: collision with root package name */
    public int f178894r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f178895s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f178896t = false;

    public static void U6(com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI walletForgotPwdVerifyIdUI) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveIdentityText：" + walletForgotPwdVerifyIdUI.f178896t);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " haveNameText：" + walletForgotPwdVerifyIdUI.f178895s);
        if (walletForgotPwdVerifyIdUI.f178896t && walletForgotPwdVerifyIdUI.f178895s) {
            walletForgotPwdVerifyIdUI.f178887h.setEnabled(true);
        } else {
            walletForgotPwdVerifyIdUI.f178887h.setEnabled(false);
        }
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " setChangParams()");
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.wallet.pwd.ui.p0(this), 100L);
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "updateView");
        int i17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_cre_type;
        java.lang.String str = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_cre_name;
        this.f178883d.setHint(getString(com.tencent.mm.R.string.kjl, com.tencent.mm.wallet_core.ui.r1.y(((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_true_name)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletForgotPwdVerifyIdUI", "creName is null");
        } else {
            this.f178884e.setText(str);
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "no need tenpay keyboard");
        } else {
            qp5.p.e(this.f178886g);
            setEditFocusListener(this.f178886g, 1, false, false, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        fs4.g gVar;
        super.finish();
        getIntent().putExtra("process_id", fs4.h.class.hashCode());
        fs4.h hVar = (fs4.h) com.tencent.mm.wallet_core.a.g(this);
        if (hVar == null || (gVar = hVar.f266341d) == null) {
            return;
        }
        gVar.run(-1);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d6m;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "onCreate");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitleVisibility(8);
        this.f178893q = findViewById(com.tencent.mm.R.id.m7o);
        this.f178894r = getWindowManager().getDefaultDisplay().getHeight() / 3;
        this.f178893q.addOnLayoutChangeListener(this);
        if (!getInput().getBoolean("key_is_force_bind", false)) {
            doSceneProgress(new ss4.e0(null, 6));
            setContentViewVisibility(4);
        }
        this.f178883d = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.k3m);
        this.f178884e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485304h84);
        this.f178886g = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485303h83);
        this.f178887h = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f178888i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ld8);
        this.f178889m = findViewById(com.tencent.mm.R.id.m7g);
        this.f178885f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f178890n = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.k3o);
        this.f178886g.setEnabled(false);
        this.f178886g.setFocusable(false);
        this.f178887h.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.n0(this));
        this.f178888i.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.o0(this));
        W6();
        setTenpayKBStateListener(new com.tencent.mm.plugin.wallet.pwd.ui.s0(this));
        this.f178883d.setOnFocusChangeListener(new com.tencent.mm.plugin.wallet.pwd.ui.t0(this));
        this.f178883d.addTextChangedListener(new com.tencent.mm.plugin.wallet.pwd.ui.q0(this));
        this.f178886g.b(new com.tencent.mm.plugin.wallet.pwd.ui.r0(this));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i38 != 0 && i27 != 0 && i38 - i27 > this.f178894r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " up");
            V6();
        } else {
            if (i38 == 0 || i27 == 0 || i27 - i38 <= this.f178894r) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " down");
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " errCode: %s errMsg: %s  scene: %s", java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.e0) {
                W6();
                setContentViewVisibility(0);
            } else if (m1Var instanceof gs4.w) {
                gs4.w wVar = (gs4.w) m1Var;
                getInput().putInt("key_is_support_face", wVar.f275141g);
                getInput().putInt("key_face_action_scene", wVar.f275142h);
                getInput().putString("key_face_action_package", wVar.f275143i);
                getInput().putString("key_face_action_package_sign", wVar.f275145n);
                if (wVar.f275144m == 1) {
                    com.tencent.mm.wallet_core.model.p1.c().getClass();
                    if (com.tencent.mm.wallet_core.model.j.b().f(com.tencent.mm.wallet_core.model.p1.b())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "already install cert, go to next process");
                        getProcess().o(this, 0, getInput());
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "checkInstallCert, crt not installed");
                        com.tencent.mm.wallet_core.model.i iVar = com.tencent.mm.wallet_core.model.p1.c().f213981f;
                        doSceneForceProgress(new com.tencent.mm.wallet_core.model.t0(wVar.f275138d, wVar.f275139e, wVar.f275140f, iVar));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "verify realname info finish, go to next process");
                    getProcess().o(this, 0, getInput());
                }
            } else if (m1Var instanceof com.tencent.mm.wallet_core.model.t0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", "install cert finish, go to next process");
                getProcess().o(this, 0, getInput());
            }
        }
        return false;
    }
}
