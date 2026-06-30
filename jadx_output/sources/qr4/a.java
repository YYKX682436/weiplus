package qr4;

/* loaded from: classes9.dex */
public class a extends qs4.j {
    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.wallet_core.model.i1.b(14);
        return super.A(activity, bundle);
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        com.tencent.mm.wallet_core.model.i1.a();
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
        com.tencent.mm.wallet_core.model.i1.a();
        if (bundle == null || !bundle.getBoolean("intent_bind_end", false)) {
            activity.finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        if (bundle.getInt("from_bind_ui", 2) == 1) {
            intent.putExtra("from_bind_ui", 1);
            k(activity, "wallet", ".balance.ui.WalletBalanceManagerUI", -1, intent, true);
        } else {
            intent.putExtra("from_bind_ui", 2);
            k(activity, "wallet", ".balance.ui.WalletBalanceFetchUI", -1, intent, true);
        }
    }
}
