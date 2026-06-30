package com.tencent.mm.plugin.wallet_ecard.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletOpenECardProxyUI extends com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBaseUI {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenECardProxyUI", "activity result, request:%s, result: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 1) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        if (i18 != -1) {
            finish();
            return;
        }
        setResult(0);
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process == null) {
            finish();
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", 0);
        process.l(this, 0, bundle);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(4);
        com.tencent.mm.wallet_core.h process = getProcess();
        if (process == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletOpenECardProxyUI", "no process!!!");
            finish();
            return;
        }
        int i17 = getInput().getInt("key_open_scene", 0);
        boolean z17 = getInput().getBoolean("key_is_reuse_existing_ecard", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, isReuseExistCard: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (z17) {
            getNetController().d(2, java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            return;
        }
        java.lang.String string = getInput().getString("key_open_token");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenECardProxyUI", "onCreate, openScene: %s, token==null:%s, isTokenInvalid: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(string)), java.lang.Boolean.valueOf(getInput().getBoolean("key_is_token_invalid", false)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            process.o(getContext(), 0, getInput());
        } else {
            getNetController().d(1, java.lang.Integer.valueOf(i17), string);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("key_process_result_code", -1);
        boolean booleanExtra = intent.getBooleanExtra("key_process_is_end", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenECardProxyUI", "new intent, resultCode: %d, isEnd: %s", java.lang.Integer.valueOf(intExtra), java.lang.Boolean.valueOf(booleanExtra));
        if (intExtra == -1) {
            if (intent.getBooleanExtra("key_goto_lqt_detail", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenECardProxyUI", "jump to detail");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_account_type", 2);
                if (!((h45.q) i95.n0.c(h45.q.class)).startLqtDetailUseCaseInMMProcess(getContext())) {
                    j45.l.j(getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent2, null);
                }
            }
            setResult(-1);
        } else {
            setResult(0);
        }
        com.tencent.mm.wallet_core.h process = getProcess();
        if (booleanExtra) {
            finish();
        } else if (process != null) {
            process.g(getContext());
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
