package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class f extends qs4.j {
    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("intent_bind_end", false)) {
            activity.finish();
        } else {
            k(activity, "wallet", ".balance.ui.lqt.WalletLqtPlanAddUI", -1, new android.content.Intent(), true);
        }
    }
}
