package com.tencent.mm.plugin.remittance.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class RemittanceOSRedirect extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f157556d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f157557e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitleVisibility(8);
        this.f157557e = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f157556d = getIntent().getStringExtra("receiver_name");
        int i17 = this.f157557e;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceOSRedirect", "error scene: %s", java.lang.Integer.valueOf(i17));
            finish();
        } else if (i17 == 5) {
            this.mNetSceneMgr.c(1574);
            doSceneProgress(new com.tencent.mm.plugin.remittance.model.i1(c01.z1.m()));
        } else if (i17 == 6) {
            this.mNetSceneMgr.c(com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
            doSceneProgress(new com.tencent.mm.plugin.remittance.model.a0(this.f157556d), true);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        int i17 = this.f157557e;
        if (i17 == 5) {
            removeSceneEndListener(1574);
        } else if (i17 == 6) {
            removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.pay.n.CTRL_INDEX);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof com.tencent.mm.plugin.remittance.model.i1) {
                com.tencent.mm.plugin.remittance.model.i1 i1Var = (com.tencent.mm.plugin.remittance.model.i1) m1Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceOSRedirect", "indexScene  %s", i1Var.f156857g);
                android.content.Intent intent = getIntent();
                if (i1Var.f156856f == 1) {
                    h45.a0.i(this, 2, this.f157556d, 11, null);
                } else {
                    intent.setClass(this, com.tencent.mm.plugin.remittance.ui.RemittanceOSUI.class);
                    intent.putExtra("os_currency", i1Var.f156856f);
                    intent.putExtra("os_currencyuint", i1Var.f156857g);
                    intent.putExtra("os_currencywording", i1Var.f156858h);
                    intent.putExtra("os_notice", i1Var.f156859i);
                    intent.putExtra("os_notice_url", i1Var.f156860m);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                finish();
                return;
            }
            if (m1Var instanceof com.tencent.mm.plugin.remittance.model.a0) {
                com.tencent.mm.plugin.remittance.model.a0 a0Var = (com.tencent.mm.plugin.remittance.model.a0) m1Var;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.tencent.mm.plugin.remittance.ui.RemittanceHKUI.class);
                this.f157556d = a0Var.f156774f;
                intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f157557e);
                intent2.putExtra("fee", a0Var.f156778m / 100.0d);
                intent2.putExtra("desc", a0Var.f156777i);
                intent2.putExtra("scan_remittance_id", a0Var.f156782q);
                intent2.putExtra("receiver_name", a0Var.f156774f);
                intent2.putExtra("receiver_true_name", a0Var.f156775g);
                intent2.putExtra("receiver_nick_name", a0Var.f156776h);
                intent2.putExtra("hk_currency", a0Var.f156780o);
                intent2.putExtra("hk_currencyuint", a0Var.f156781p);
                intent2.putExtra("hk_notice", a0Var.f156783r);
                intent2.putExtra("hk_notice_url", a0Var.f156784s);
                intent2.putExtra("recv_headimgurl", a0Var.f156785t);
                int i19 = a0Var.f156779n;
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceOSRedirect", "setAmount: %d", java.lang.Integer.valueOf(i19));
                intent2.putExtra("pay_scene", i19 == 1 ? 33 : 32);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                return;
            }
            return;
        }
        if (m1Var instanceof com.tencent.mm.plugin.remittance.model.i1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceOSRedirect", "indexScene  errMsg %s", str);
            db5.e1.t(this, str, "", new com.tencent.mm.plugin.remittance.ui.e7(this));
        } else if (m1Var instanceof com.tencent.mm.plugin.remittance.model.a0) {
            db5.e1.t(this, str, "", new com.tencent.mm.plugin.remittance.ui.f7(this));
        }
    }
}
