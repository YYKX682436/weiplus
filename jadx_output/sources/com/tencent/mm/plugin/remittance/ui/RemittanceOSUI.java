package com.tencent.mm.plugin.remittance.ui;

@db5.a(19)
/* loaded from: classes9.dex */
public class RemittanceOSUI extends com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI {
    public static final /* synthetic */ int P1 = 0;
    public int J1;
    public java.lang.String K1;
    public java.lang.String L1;
    public java.lang.String M1;
    public boolean N1 = false;
    public final com.tencent.mm.sdk.event.IListener O1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WebViewCloseWindowEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.1
        {
            this.__eventId = -704562821;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WebViewCloseWindowEvent webViewCloseWindowEvent) {
            com.tencent.mm.plugin.remittance.ui.RemittanceOSUI remittanceOSUI = com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.this;
            if (!remittanceOSUI.N1) {
                return false;
            }
            remittanceOSUI.finish();
            return false;
        }
    };

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, kv.e0
    public void U(java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void W6() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13337, 2);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void X6() {
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void Z6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent) {
        java.lang.String l17 = c01.z1.l();
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            l17 = c01.z1.r();
        }
        java.lang.String str7 = l17;
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f157135f, true);
        com.tencent.mm.plugin.remittance.model.j1 j1Var = new com.tencent.mm.plugin.remittance.model.j1(this.f157134e, str7, this.f157135f, ((int) n17.E2) != 0 ? n17.g2() : this.f157135f, str, this.J1);
        j1Var.setProcessName("RemittanceProcess");
        doSceneProgress(j1Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13337, 1, java.lang.Double.valueOf(this.f157134e));
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void f7() {
        db5.t7.makeText(getContext(), getString(com.tencent.mm.R.string.i0p, this.K1), 0).show();
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ce_;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void k7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.L1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceOSUI", "no bulletin data");
        } else {
            com.tencent.mm.wallet_core.ui.r1.s0(null, (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7), "", this.L1, this.M1);
        }
    }

    public boolean n7(java.lang.String str) {
        r45.x57 Di;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (Di = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Di(str)) == null || com.tencent.mm.sdk.platformtools.t8.K0(Di.f389803d)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceOSUI", "start hk native cashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("attach", Di.f389803d);
        bundle.putInt("cashierType", Di.f389806g);
        ((h45.q) i95.n0.c(h45.q.class)).handleHKNativeCashier(getContext(), bundle, new h45.k() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI$$a
            @Override // h45.k
            public final void a(int i17) {
                final com.tencent.mm.plugin.remittance.ui.RemittanceOSUI remittanceOSUI = com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.this;
                int i18 = com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.P1;
                remittanceOSUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceOSUI", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(i17));
                if (i17 == 1) {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceOSUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i19 = com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.P1;
                            com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.this.finish();
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, 200L, false);
                }
            }
        });
        return true;
    }

    public void o7(java.lang.String str) {
        if (n7(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        com.tencent.mm.wallet_core.ui.r1.U(getContext(), intent, 3);
        this.N1 = true;
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.N1 = false;
        if (i17 == 3 && i18 == -1) {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.O1.alive();
        this.mNetSceneMgr.c(1622);
        this.mNetSceneMgr.c(1574);
        initView();
        this.f157147r.setTitleText("");
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this);
        this.J1 = getIntent().getIntExtra("os_currency", 0);
        this.K1 = getIntent().getStringExtra("os_currencyuint");
        getIntent().getStringExtra("os_currencywording");
        this.L1 = getIntent().getStringExtra("os_notice");
        this.M1 = getIntent().getStringExtra("os_notice_url");
        this.f157147r.setTitleText(this.K1);
        k7();
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.O1.dead();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().q(this);
        this.mNetSceneMgr.i(1622);
        this.mNetSceneMgr.i(1574);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        boolean z18;
        super.onSceneEnd(i17, i18, str, m1Var, z17);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof com.tencent.mm.plugin.remittance.model.j1)) {
            com.tencent.mm.plugin.remittance.model.j1 j1Var = (com.tencent.mm.plugin.remittance.model.j1) m1Var;
            int i19 = j1Var.f156868h;
            if (i19 > 0) {
                int i27 = j1Var.f156869i;
                z18 = true;
                if (i27 == 0) {
                    db5.e1.A(this, getString(com.tencent.mm.R.string.f492826i10, java.lang.Integer.valueOf(i19)), getString(com.tencent.mm.R.string.f490539xy), getString(com.tencent.mm.R.string.f492818hz5), getString(com.tencent.mm.R.string.i0o), new com.tencent.mm.plugin.remittance.ui.g7(this, j1Var), new com.tencent.mm.plugin.remittance.ui.h7(this, j1Var));
                } else if (i27 == 1) {
                    db5.e1.A(this, getString(com.tencent.mm.R.string.f492826i10, java.lang.Integer.valueOf(i19)), getString(com.tencent.mm.R.string.f490539xy), getString(com.tencent.mm.R.string.f492818hz5), getString(com.tencent.mm.R.string.i0o), new com.tencent.mm.plugin.remittance.ui.i7(this, j1Var), new com.tencent.mm.plugin.remittance.ui.j7(this, j1Var));
                }
                if (!z18 || n7(j1Var.f156866f)) {
                }
                java.lang.String str2 = j1Var.f156866f;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str2);
                intent.putExtra("showShare", false);
                com.tencent.mm.wallet_core.ui.r1.U(getContext(), intent, 3);
                return;
            }
            z18 = false;
            if (z18) {
            }
        }
    }

    public void p7(java.lang.String str) {
        if (n7(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        com.tencent.mm.wallet_core.ui.r1.U(getContext(), intent, 3);
        this.N1 = true;
    }
}
