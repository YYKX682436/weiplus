package com.tencent.mm.plugin.wallet_payu.security_question.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletPayUSecurityQuestionAnswerUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionView f181274d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f181275e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f181276f;

    /* renamed from: g, reason: collision with root package name */
    public au4.c f181277g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489358c95;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean needConfirmFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181277g = new au4.c(this);
        this.f181274d = (com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionView) findViewById(com.tencent.mm.R.id.ksz);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.ksy);
        this.f181275e = walletFormView;
        if (walletFormView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            walletFormView.setIsSecretAnswer(true);
        }
        this.f181276f = (android.widget.Button) findViewById(com.tencent.mm.R.id.ksx);
        this.f181275e.setOnInputValidChangeListener(new au4.a(this));
        this.f181276f.setOnClickListener(new au4.b(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion payUSecurityQuestion = (com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion) getInput().getParcelable("key_security_question");
        if (payUSecurityQuestion != null) {
            this.f181274d.setQuestionText(payUSecurityQuestion.f181273e);
        }
        this.f181275e.d();
        return false;
    }
}
