package zb3;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        }
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        f(activity, null);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "LuckyFreePwdProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        if (bundle == null) {
            bundle = new android.os.Bundle();
        }
        intent.putExtras(bundle);
        k(activity, "luckymoney", ".sns.SnsLuckyMoneyFreePwdSetting", -1, intent, true);
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        f(activity, bundle);
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new zb3.a(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
