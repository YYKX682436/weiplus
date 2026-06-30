package kt4;

/* loaded from: classes9.dex */
public class a extends qs4.j {
    @Override // qs4.j, qs4.b, com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        a("start", activity, bundle);
        if (bundle != null) {
            com.tencent.mm.wallet_core.model.n1.d(6, bundle.getInt("key_bind_scene"));
            com.tencent.mm.wallet_core.model.i1.b(bundle.getInt("key_bind_scene"));
        } else {
            com.tencent.mm.wallet_core.model.n1.d(6, 0);
            com.tencent.mm.wallet_core.model.i1.b(0);
        }
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            if (bundle == null) {
                return super.A(activity, bundle);
            }
            if (bundle.getBoolean("key_is_import_bind", false)) {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.class, bundle);
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI.class, bundle);
            }
            return this;
        }
        if (bundle != null) {
            com.tencent.mm.plugin.wallet_core.utils.b1.b(activity, bundle.getInt("key_bind_scene", 0), 1);
        }
        if (bundle == null || !bundle.getBoolean("key_is_import_bind", false)) {
            return super.A(activity, bundle);
        }
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.class, bundle);
        return this;
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "OpenECardBindCardProcess";
    }

    @Override // qs4.j, com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        if (bundle != null && bundle.getBoolean("intent_bind_end", false)) {
            k(activity, "wallet_ecard", ".ui.WalletECardBindCardListUI", -1, new android.content.Intent(), true);
        } else {
            k(activity, "wallet_ecard", ".ui.WalletECardBindCardListUI", 0, new android.content.Intent(), true);
            activity.finish();
        }
    }
}
