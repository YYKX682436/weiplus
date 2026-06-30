package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class WalletLqtPlanBeforeHomeUI extends androidx.appcompat.app.AppCompatActivity {
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanBeforeHomeUI", "activity result: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 65281) {
            if (i18 != -1) {
                finish();
                return;
            }
            com.tencent.mm.plugin.wallet.balance.model.lqt.c0 c0Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.c0();
            c0Var.f213885c = new com.tencent.mm.plugin.wallet.balance.model.lqt.r();
            c0Var.c(new com.tencent.mm.plugin.wallet.balance.ui.lqt.g4(this), true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.plugin.wallet.balance.model.lqt.c0 c0Var = new com.tencent.mm.plugin.wallet.balance.model.lqt.c0();
        c0Var.f213885c = new com.tencent.mm.plugin.wallet.balance.model.lqt.r();
        c0Var.c(new com.tencent.mm.plugin.wallet.balance.ui.lqt.g4(this), true);
    }
}
