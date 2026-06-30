package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class e extends qs4.j {
    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        return super.A(activity, bundle);
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "BalanceFetchCardProcess";
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("intent_bind_end", false)) {
            activity.finish();
        } else {
            k(activity, "wallet", ".balance.ui.lqt.WalletLqtSaveFetchUI", -1, new android.content.Intent(), true);
        }
    }
}
