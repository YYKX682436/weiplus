package yt4;

/* loaded from: classes9.dex */
public class g extends yt4.f {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "PayUForgotPwdProcess";
    }

    @Override // yt4.f, com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI) {
            B(activity, com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI.class, bundle);
        } else {
            super.o(activity, i17, bundle);
        }
    }

    @Override // yt4.f, com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        return mMActivity instanceof com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI ? new zt4.a(mMActivity, b0Var, this.f213801c) : super.p(mMActivity, b0Var);
    }
}
