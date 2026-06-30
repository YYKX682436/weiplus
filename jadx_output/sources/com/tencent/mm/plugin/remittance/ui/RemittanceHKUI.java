package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class RemittanceHKUI extends com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI {
    public static final /* synthetic */ int N1 = 0;
    public int J1;
    public java.lang.String K1;
    public java.lang.String L1;
    public java.lang.String M1;

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void X6() {
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void Y6() {
        doSceneProgress(new com.tencent.mm.plugin.remittance.model.y(this.f157135f, this.f157143p, this.J1, ((long) this.f157134e) * 100, this.f157141n == 33 ? 1 : 0), false);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void Z6(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.autogen.events.F2fDynamicStartPayEvent f2fDynamicStartPayEvent) {
        doSceneProgress(new com.tencent.mm.plugin.remittance.model.z(java.lang.Math.round(this.f157134e * 100.0d), this.f157135f, this.f157137h, this.M, this.H, this.f157143p, this.J1, this.f157141n == 33 ? 1 : 0), true);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void d7() {
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void f7() {
        db5.t7.makeText(getContext(), getString(com.tencent.mm.R.string.i0p, this.K1), 0).show();
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI
    public void k7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.L1)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.af7);
        textView.setText(this.L1);
        textView.setOnClickListener(new com.tencent.mm.plugin.remittance.ui.x6(this));
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 4 && i18 == -1) {
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1529);
        addSceneEndListener(1257);
        this.J1 = getIntent().getIntExtra("hk_currency", 0);
        this.K1 = getIntent().getStringExtra("hk_currencyuint");
        this.L1 = getIntent().getStringExtra("hk_notice");
        this.M1 = getIntent().getStringExtra("hk_notice_url");
        this.f157147r.setTitleText(this.K1);
        this.A.setText(this.K1);
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1529);
        removeSceneEndListener(1257);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        if (!(m1Var instanceof com.tencent.mm.plugin.remittance.model.z)) {
            super.onSceneEnd(i17, i18, str, m1Var, z17);
            return;
        }
        com.tencent.mm.plugin.remittance.model.z zVar = (com.tencent.mm.plugin.remittance.model.z) m1Var;
        if (i17 != 0 || i18 != 0) {
            db5.e1.F(getContext(), str, "", false);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(zVar.f157068f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceHKUI", "empty payurl");
            return;
        }
        r45.x57 Di = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Di(zVar.f157068f);
        if (Di == null || com.tencent.mm.sdk.platformtools.t8.K0(Di.f389803d)) {
            com.tencent.mm.wallet_core.ui.r1.W(getContext(), zVar.f157068f, false, 4);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceHKUI", "start hk native cashier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("attach", Di.f389803d);
        bundle.putInt("cashierType", Di.f389806g);
        ((h45.q) i95.n0.c(h45.q.class)).handleHKNativeCashier(getContext(), bundle, new h45.k() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI$$a
            @Override // h45.k
            public final void a(int i19) {
                final com.tencent.mm.plugin.remittance.ui.RemittanceHKUI remittanceHKUI = com.tencent.mm.plugin.remittance.ui.RemittanceHKUI.this;
                int i27 = com.tencent.mm.plugin.remittance.ui.RemittanceHKUI.N1;
                remittanceHKUI.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceHKUI", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(i19));
                if (i19 == 1) {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceHKUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i28 = com.tencent.mm.plugin.remittance.ui.RemittanceHKUI.N1;
                            com.tencent.mm.plugin.remittance.ui.RemittanceHKUI.this.finish();
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, 200L, false);
                }
            }
        });
    }
}
