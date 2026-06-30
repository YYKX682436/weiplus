package yr4;

/* loaded from: classes9.dex */
public class a extends qs4.j {
    @Override // qs4.b, com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "BindCardForPayProcess";
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        k(activity, "wallet", ".pay.ui.WalletPayUI", -1, intent, false);
    }
}
