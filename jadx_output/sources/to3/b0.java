package to3;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        java.lang.String str;
        java.util.List list;
        if (bundle != null) {
            str = "key_trans_id";
            if (com.tencent.mm.sdk.platformtools.t8.K0(bundle.getString("key_trans_id"))) {
                com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) bundle.getParcelable("key_orders");
                if (orders != null && (list = orders.M) != null && ((java.util.ArrayList) list).size() >= 1) {
                    str = ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) orders.M).get(0)).f179714r;
                }
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new wo3.g("offlineshowpage", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, str));
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI.class, bundle);
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            return this;
        }
        str = "";
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new wo3.g("offlineshowpage", com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH, str));
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI.class, bundle);
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "ShowOrderSuccessProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        g(activity);
        if (this.f213801c.getInt("key_from_scene") == 8) {
            yo3.m.h(this.f213801c.getString("key_appid"));
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI) {
            m(activity);
            f(activity, null);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
