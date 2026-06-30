package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayModifyQuotaUI extends com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f142347w = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f142348f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f142349g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142350h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142351i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f142352m;

    /* renamed from: n, reason: collision with root package name */
    public long f142353n;

    /* renamed from: o, reason: collision with root package name */
    public long f142354o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f142355p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f142356q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f142357r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f142358s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f142359t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f142360u;

    /* renamed from: v, reason: collision with root package name */
    public r45.an6 f142361v;

    public static boolean V6(com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI honeyPayModifyQuotaUI) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(honeyPayModifyQuotaUI.f142348f.getText())) {
            honeyPayModifyQuotaUI.X6(false);
            honeyPayModifyQuotaUI.Y6(false);
            honeyPayModifyQuotaUI.f142349g.setEnabled(false);
            return false;
        }
        int i07 = com.tencent.mm.wallet_core.ui.r1.i0(honeyPayModifyQuotaUI.f142348f.getText(), "100");
        long j17 = i07;
        if (j17 < honeyPayModifyQuotaUI.f142354o) {
            honeyPayModifyQuotaUI.Y6(true);
            honeyPayModifyQuotaUI.f142349g.setEnabled(false);
            return false;
        }
        if (j17 > honeyPayModifyQuotaUI.f142353n) {
            honeyPayModifyQuotaUI.X6(true);
            honeyPayModifyQuotaUI.f142349g.setEnabled(false);
            return false;
        }
        if (i07 == 0) {
            honeyPayModifyQuotaUI.f142349g.setEnabled(false);
            return false;
        }
        honeyPayModifyQuotaUI.X6(false);
        honeyPayModifyQuotaUI.Y6(false);
        honeyPayModifyQuotaUI.f142349g.setEnabled(true);
        return true;
    }

    public final void W6() {
        java.lang.String str = this.f142260d;
        com.tencent.mars.xlog.Log.i(str, "go to check pwd ui");
        long j07 = com.tencent.mm.wallet_core.ui.r1.j0(this.f142348f.getText(), "100");
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.honey_pay.ui.HoneyPayCheckPwdUI.class);
        intent.putExtra("key_scene", 2);
        intent.putExtra("key_credit_line", j07);
        intent.putExtra("key_card_no", this.f142355p);
        intent.putExtra("key_take_message", this.f142356q);
        try {
            intent.putExtra("key_toke_mess", this.f142361v.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
        }
        startActivityForResult(intent, 1);
    }

    public final void X6(boolean z17) {
        if (!z17 || this.f142350h.isShown()) {
            if (z17 || !this.f142350h.isShown()) {
                return;
            }
            this.f142350h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477834cs));
            this.f142350h.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.wallet_core.model.c2.b());
        sb6.append(com.tencent.mm.wallet_core.ui.r1.i("" + this.f142353n, "100", 2, java.math.RoundingMode.HALF_UP));
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142359t)) {
            this.f142350h.setText(getString(com.tencent.mm.R.string.fx9, sb7));
        } else {
            this.f142350h.setText(this.f142359t);
        }
        this.f142350h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477814c8));
        this.f142350h.setVisibility(0);
    }

    public final void Y6(boolean z17) {
        if (!z17 || this.f142350h.isShown()) {
            if (z17 || !this.f142350h.isShown()) {
                return;
            }
            this.f142350h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477834cs));
            this.f142350h.setVisibility(8);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.wallet_core.model.c2.b());
        sb6.append(com.tencent.mm.wallet_core.ui.r1.i("" + this.f142354o, "100", 2, java.math.RoundingMode.HALF_UP).toString());
        this.f142350h.setText(getString(com.tencent.mm.R.string.fxc, sb6.toString()));
        this.f142350h.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, com.tencent.mm.R.anim.f477814c8));
        this.f142350h.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bjt;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f142348f = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485268h40);
        this.f142349g = (android.widget.Button) findViewById(com.tencent.mm.R.id.h3y);
        this.f142350h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485271h43);
        this.f142351i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485270h42);
        this.f142352m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.h3z);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142358s)) {
            this.f142351i.setText(com.tencent.mm.R.string.f492287fx4);
        } else {
            this.f142351i.setText(this.f142358s);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142360u)) {
            this.f142352m.setText(this.f142360u);
        }
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f142348f.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setPadding(0, 0, 0, 0);
        }
        this.f142348f.getTitleTv().setText(com.tencent.mm.wallet_core.model.c2.b());
        setEditFocusListener(this.f142348f, 2, false);
        this.f142348f.b(new v73.w0(this));
        this.f142349g.setOnClickListener(new v73.x0(this));
        this.f142348f.postDelayed(new v73.y0(this), 100L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1 && intent.getBooleanExtra("key_modify_create_line_succ", false)) {
            setResult(-1, intent);
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f142353n = getIntent().getLongExtra("key_max_credit_line", 0L);
        this.f142354o = getIntent().getLongExtra("key_min_credit_line", 0L);
        this.f142355p = getIntent().getStringExtra("key_card_no");
        this.f142356q = getIntent().getStringExtra("key_take_message");
        this.f142357r = getIntent().getStringExtra("key_title");
        this.f142358s = getIntent().getStringExtra("key_subtitle");
        this.f142359t = getIntent().getStringExtra("key_over_quota_tips");
        this.f142360u = getIntent().getStringExtra("key_bottom_tips");
        initView();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142357r)) {
            setMMTitle(com.tencent.mm.R.string.fxd);
        } else {
            setMMTitle(this.f142357r);
        }
        addSceneEndListener(2815);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2815);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof r73.g)) {
            return false;
        }
        hideProgress();
        r45.fi3 fi3Var = ((r73.g) m1Var).f393170r;
        this.f142356q = fi3Var.f374381g;
        this.f142361v = fi3Var.f374378d;
        r45.di4 di4Var = fi3Var.f374382h;
        if (di4Var == null) {
            W6();
            return false;
        }
        db5.e1.C(this, di4Var.f372508d, "", di4Var.f372510f, di4Var.f372509e, false, new v73.z0(this), null);
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(v73.a1.class);
    }
}
