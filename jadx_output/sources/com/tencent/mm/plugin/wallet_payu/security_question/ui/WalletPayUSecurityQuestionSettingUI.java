package com.tencent.mm.plugin.wallet_payu.security_question.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletPayUSecurityQuestionSettingUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f181278m = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionView f181279d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181280e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f181281f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.tools.w6 f181282g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181283h = "";

    /* renamed from: i, reason: collision with root package name */
    public au4.i f181284i;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c96;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.ui.tools.w6 w6Var = new com.tencent.mm.ui.tools.w6(this);
        this.f181282g = w6Var;
        w6Var.f210430n = true;
        w6Var.f210431o = com.tencent.mm.R.style.f494099e6;
        w6Var.f210880u = new au4.d(this);
        w6Var.f210881v = new au4.e(this);
        this.f181284i = new au4.i(this);
        this.f181279d = (com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionView) findViewById(com.tencent.mm.R.id.ksz);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ksy);
        this.f181280e = walletFormView;
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setIsSecretAnswer(true);
        }
        this.f181281f = (android.widget.Button) findViewById(com.tencent.mm.R.id.ksx);
        this.f181279d.setOnClickListener(new au4.f(this));
        this.f181280e.setOnInputValidChangeListener(new au4.g(this));
        this.f181281f.setOnClickListener(new au4.h(this));
        au4.i.a(this.f181284i);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
