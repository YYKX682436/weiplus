package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes8.dex */
public class WalletForgotPwdSelectUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f178864f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f178865d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f178866e;

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "goToBankcard");
        getInput().putBoolean("key_select_bank_card", true);
        getProcess().o(this, 0, getInput());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d6i;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.content.Intent intent2 = intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "onActivityResult, requestCode: %s, resultCode: %s, data: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent2);
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        int intExtra = intent2.getIntExtra("err_code", 0);
        int intExtra2 = intent2.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int intExtra3 = intent2.getIntExtra("countFace", 0);
        long longExtra = intent2.getLongExtra("totalTime", 0L);
        int intExtra4 = intent2.getIntExtra("err_type", 6);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "errCode： " + intExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "scene： " + intExtra2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "countFace： " + intExtra3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "totalTime： " + longExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "errorType： " + intExtra4);
        if (i17 == 233) {
            if (i18 != -1) {
                if (intent2.getExtras() != null) {
                    java.lang.String string = intent2.getExtras().getString("click_other_verify_btn");
                    boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(string) && string.equalsIgnoreCase("yes");
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "isClickOtherVerify: %s", string);
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "check face failed, click other verify");
                        if (getProcess() != null) {
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            g0Var.d(15774, java.lang.Integer.valueOf(getProcess().f213801c.getInt("key_forgot_scene", 1)), 5);
                            g0Var.d(15711, java.lang.Integer.valueOf(intExtra2), 3, java.lang.Integer.valueOf(intExtra3), java.lang.Long.valueOf(longExtra), 1, java.lang.Integer.valueOf(intExtra4), java.lang.Integer.valueOf(intExtra));
                        }
                        U6();
                    }
                }
                if (i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_CANCELED");
                    if (getProcess() != null) {
                        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var2.d(15774, java.lang.Integer.valueOf(getProcess().f213801c.getInt("key_forgot_scene", 1)), 6);
                        g0Var2.d(15711, java.lang.Integer.valueOf(intExtra2), 2, java.lang.Integer.valueOf(intExtra3), java.lang.Long.valueOf(longExtra), 1, 1, java.lang.Integer.valueOf(intExtra));
                        return;
                    }
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_OK");
            if (intent2.getExtras() != null) {
                java.lang.String string2 = intent2.getExtras().getString("token");
                if (getProcess() != null && !com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var3.d(15774, java.lang.Integer.valueOf(getProcess().f213801c.getInt("key_forgot_scene", 1)), 4);
                    g0Var3.d(15711, java.lang.Integer.valueOf(intExtra2), 0, java.lang.Integer.valueOf(intExtra3), java.lang.Long.valueOf(longExtra), 1, 0, java.lang.Integer.valueOf(intExtra));
                }
                getInput().putString("key_face_action_result_token", string2);
                getInput().putBoolean("key_is_set_pwd_after_face_action", true);
                getProcess().o(this, 0, getInput());
                finish();
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        setMMTitleVisibility(8);
        this.f178865d = findViewById(com.tencent.mm.R.id.dmr);
        this.f178866e = findViewById(com.tencent.mm.R.id.aeb);
        this.f178865d.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.c0(this));
        this.f178866e.setOnClickListener(new com.tencent.mm.plugin.wallet.pwd.ui.d0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
