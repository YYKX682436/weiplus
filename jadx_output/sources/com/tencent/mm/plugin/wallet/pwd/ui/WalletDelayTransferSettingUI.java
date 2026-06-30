package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class WalletDelayTransferSettingUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f178839u = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f178840d;

    /* renamed from: e, reason: collision with root package name */
    public long f178841e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference f178842f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference f178843g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference f178844h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f178845i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f178846m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f178847n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f178848o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f178849p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f178851r;

    /* renamed from: q, reason: collision with root package name */
    public int f178850q = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f178852s = 1;

    /* renamed from: t, reason: collision with root package name */
    public int f178853t = 0;

    public final boolean V6(int i17) {
        return (this.f178841e & ((long) i17)) != 0;
    }

    public final void W6() {
        if (this.f178850q != 1 || com.tencent.mm.sdk.platformtools.t8.K0(this.f178851r)) {
            removeAllOptionMenu();
        } else {
            addIconOptionMenu(0, com.tencent.mm.R.drawable.chy, new com.tencent.mm.plugin.wallet.pwd.ui.l(this));
        }
    }

    public final void X6(boolean z17) {
        if (V6(16)) {
            this.f178842f.M = false;
            this.f178843g.M = true;
            this.f178844h.M = false;
            if (z17) {
                return;
            }
            this.f178853t = 2;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(this.f178852s), java.lang.Integer.valueOf(this.f178853t), 0);
            return;
        }
        if (V6(32)) {
            this.f178842f.M = false;
            this.f178843g.M = false;
            this.f178844h.M = true;
            if (z17) {
                return;
            }
            this.f178853t = 3;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(this.f178852s), java.lang.Integer.valueOf(this.f178853t), 0);
            return;
        }
        this.f178842f.M = true;
        this.f178843g.M = false;
        this.f178844h.M = false;
        if (z17) {
            return;
        }
        this.f178853t = 1;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23319, java.lang.Integer.valueOf(this.f178852s), java.lang.Integer.valueOf(this.f178853t), 0);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setPadding(0, 0, 0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479657bu));
        linearLayout.setOrientation(1);
        android.widget.Button button = new android.widget.Button(getContext());
        linearLayout.addView(button);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(button.getLayoutParams());
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        button.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478838io));
        button.setBackground(getDrawable(com.tencent.mm.R.drawable.f481057jk));
        button.setTextSize(1, 17.0f);
        button.setPadding(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479862hb), 0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479862hb), 0);
        button.setMinHeight(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479881hu));
        button.setMinWidth(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479883hw));
        button.setText(getString(com.tencent.mm.R.string.kfd));
        button.setGravity(17);
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.n(this));
        return linearLayout;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.d6c;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f178842f = (com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178840d).h("wallet_transfer_realtime");
        this.f178843g = (com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178840d).h("wallet_transfer_2h");
        this.f178844h = (com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferUISelectPreference) ((com.tencent.mm.ui.base.preference.h0) this.f178840d).h("wallet_transfer_24h");
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.csz);
        this.f178845i = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f178846m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.csy);
        this.f178842f.E(8);
        this.f178843g.E(8);
        this.f178844h.E(8);
        X6(false);
        setBackBtn(new com.tencent.mm.plugin.wallet.pwd.ui.m(this));
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean H;
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        hideActionbarLine();
        this.f178840d = getPreferenceScreen();
        this.f178852s = getIntent().getIntExtra("key_scene", 1);
        if (getListView() != null) {
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
            getListView().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            getListView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jlw);
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178840d).g(com.tencent.mm.R.xml.f494971d0);
        gm0.j1.i();
        this.f178841e = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        initView();
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, this);
        gm0.j1.i();
        this.f178847n = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_REMIND_WORDING_STRING, "");
        gm0.j1.i();
        this.f178848o = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_HALF_PAGE_WORDING_STRING, "");
        gm0.j1.i();
        this.f178849p = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_SWITCH_WORDING_STRING, "");
        gm0.j1.i();
        this.f178851r = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_DESC_URL_STRING, "");
        gm0.j1.i();
        this.f178850q = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT, 0)).intValue();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178847n) || com.tencent.mm.sdk.platformtools.t8.K0(this.f178849p) || com.tencent.mm.sdk.platformtools.t8.K0(this.f178851r) || com.tencent.mm.sdk.platformtools.t8.K0(this.f178848o)) {
            H = ss4.k0.H(true, null, null);
        } else {
            this.f178846m.setText(this.f178847n);
            this.f178845i.setText(this.f178849p);
            W6();
            H = ss4.k0.H(false, null, null);
        }
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        if (H) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletDelayTransferSettingUI", "no need do scene, remove listener");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletDelayTransferSettingUI", "do oplog, %s", java.lang.Long.valueOf(this.f178841e));
        int i17 = V6(16) ? 1 : V6(32) ? 2 : 0;
        r45.po4 po4Var = new r45.po4();
        po4Var.f383253d = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(205, po4Var));
        gm0.j1.i();
        gm0.j1.n().f273288b.q(385, this);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if ("wallet_transfer_realtime".equals(str)) {
            this.f178841e = (-17) & this.f178841e & (-33);
        } else if ("wallet_transfer_2h".equals(str)) {
            this.f178841e = (this.f178841e & (-33)) | 16;
        } else if ("wallet_transfer_24h".equals(str)) {
            this.f178841e = (this.f178841e & (-17)) | 32;
        }
        X6(true);
        ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ss4.k0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletDelayTransferSettingUI", "other scene");
            return;
        }
        if (i17 == 0 && i18 == 0) {
            ss4.k0 k0Var = (ss4.k0) m1Var;
            java.lang.String str2 = k0Var.f412077f;
            this.f178847n = str2;
            this.f178849p = k0Var.f412076e;
            this.f178851r = k0Var.f412080i;
            this.f178850q = k0Var.f412081m;
            this.f178848o = k0Var.f412078g;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode wording");
                this.f178846m.setText(com.tencent.mm.R.string.f493523kl1);
            } else {
                this.f178846m.setText(this.f178847n);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f178849p)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode title wording");
                this.f178845i.setText(com.tencent.mm.R.string.ktl);
            } else {
                this.f178845i.setText(this.f178849p);
            }
            W6();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletDelayTransferSettingUI", "net error, use hardcode wording");
            this.f178846m.setText(com.tencent.mm.R.string.f493523kl1);
            this.f178845i.setText(com.tencent.mm.R.string.ktl);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f178840d).notifyDataSetChanged();
    }
}
