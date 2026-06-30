package com.tencent.mm.plugin.wallet_core.id_verify;

@db5.a(3)
/* loaded from: classes9.dex */
public class WcPayRealnameProxyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179259d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI.1
        {
            this.__eventId = 323604482;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI wcPayRealnameProxyUI = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameProxyUI.this;
            wcPayRealnameProxyUI.f179259d.dead();
            int i17 = walletRealNameResultNotifyEvent.f54973g.f6120a;
            if (i17 != -1 && i17 != 0) {
                return false;
            }
            wcPayRealnameProxyUI.finish();
            return false;
        }
    };

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameProxyUI", "on create");
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f179259d.alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameProxyUI", "do get wording");
        ys4.e eVar = new ys4.e(getInput().getString("key_realname_sessionid"));
        addSceneEndListener(1666);
        doSceneProgress(eVar);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameProxyUI", "on destroy");
        this.f179259d.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        removeSceneEndListener(1666);
        ys4.e eVar = (ys4.e) m1Var;
        r45.lm3 lm3Var = eVar.f465227i;
        if (lm3Var == null) {
            com.tencent.mm.wallet_core.a.c(getContext(), getInput(), 0);
            finish();
            return false;
        }
        try {
            java.lang.String str2 = new java.lang.String(lm3Var.toByteArray(), s46.a.f403001a);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_get_wording_cache", str2);
            bundle.putAll(getInput());
            bundle.putInt("real_name_verify_mode", 4);
            bundle.putBoolean("realname_verify_process_show_bindcard_page", eVar.f465227i.D);
            getInput().putBoolean("realname_verify_process_verify_sms_without_bindcard", eVar.f465227i.H);
            com.tencent.mm.wallet_core.a.d(getContext(), bundle);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WcPayRealnameProxyUI", e17, "", new java.lang.Object[0]);
        }
        return false;
    }
}
