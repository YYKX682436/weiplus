package ur4;

/* loaded from: classes9.dex */
public class a extends qs4.j {
    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            B(activity, com.tencent.mm.plugin.wallet.loan.WalletLoanCheckPwdUI.class, bundle);
        } else {
            super.A(activity, bundle);
        }
        return this;
    }

    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        f(activity, this.f213801c);
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        h(activity, com.tencent.mm.plugin.wallet.pay.ui.WalletLoanRepaymentUI.class, bundle.getBoolean("intent_bind_end", false) ? -1 : 0, null, true);
    }
}
