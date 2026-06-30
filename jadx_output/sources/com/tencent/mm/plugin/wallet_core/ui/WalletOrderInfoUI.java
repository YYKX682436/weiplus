package com.tencent.mm.plugin.wallet_core.ui;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletOrderInfoUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f180072d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180073e;

    /* renamed from: f, reason: collision with root package name */
    public final c01.o8 f180074f = new com.tencent.mm.plugin.wallet_core.ui.a7(this);

    public java.lang.String U6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String encode;
        try {
            encode = java.net.URLEncoder.encode(java.net.URLEncoder.encode(str5, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOrderInfoUI", e17, "", new java.lang.Object[0]);
        }
        if (str.indexOf("%7Breqkey%7D") <= 0 && str.indexOf("%7Btransid%7D") <= 0 && str.indexOf("%7Bphone%7D") <= 0 && str.indexOf("%7Bremark%7D") <= 0) {
            if (str.indexOf("{reqkey}") <= 0 && str.indexOf("{transid}") <= 0 && str.indexOf("{phone}") <= 0 && str.indexOf("{remark}") <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoUI", "concat url 3: ");
                str = str + java.lang.String.format("?reqkey=%s&transid=%s&phone=%s&remark=%s", str2, str3, str4, encode);
                return str;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoUI", "concat url 2: ");
            str = str.replace("{reqkey}", str2).replace("{transid}", str3).replace("{phone}", str4).replace("{remark}", encode);
            return str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoUI", "concat url 1: ");
        str = str.replace("%7Breqkey%7D", str2).replace("%7Btransid%7D", str3).replace("%7Bphone%7D", str4).replace("%7Bremark%7D", encode);
        return str;
    }

    public void V6(java.lang.String str) {
        doSceneProgress(new ss4.f0(str));
    }

    public void W6(java.lang.String str, int i17) {
        doSceneProgress(new ss4.f0(str, i17));
    }

    public com.tencent.mm.plugin.wallet_core.model.Orders X6() {
        return (com.tencent.mm.plugin.wallet_core.model.Orders) getInput().getParcelable("key_orders");
    }

    public void Y6(com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WalletOrderInfoUI", "goToOrderInfoUI, is_use_new_paid_succ_page: %d", java.lang.Integer.valueOf(orders.V));
        if (orders.V == 1) {
            getProcess().B(this, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI.class, getInput());
        } else {
            getProcess().B(this, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.class, getInput());
        }
        finish();
    }

    public boolean Z6() {
        return true;
    }

    public void a7(com.tencent.mm.storage.z3 z3Var) {
        if (z3Var == null || ((int) z3Var.E2) == 0) {
            return;
        }
        java.lang.String f27 = z3Var.f2();
        java.util.List list = this.f180072d.M;
        if (list == null || ((java.util.ArrayList) list).size() <= 0) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f180072d.M).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) it.next()).f179717u = f27;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d2d;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (Z6()) {
            this.f180072d = X6();
            this.f180073e = getInput().getString("key_trans_id");
            int i17 = getInput().getInt("key_pay_type", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletOrderInfoUI", "mTransId %s", this.f180073e);
            java.lang.String str = this.f180073e;
            if (str != null) {
                if (i17 == -1) {
                    V6(str);
                    return;
                } else {
                    W6(str, i17);
                    return;
                }
            }
            com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180072d;
            if (orders != null) {
                Y6(orders);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.wallet_core.model.Orders orders = this.f180072d;
        if (orders == null || com.tencent.mm.sdk.platformtools.t8.K0(orders.f179691u)) {
            return;
        }
        ((c01.k7) c01.n8.a()).f(this.f180072d.f179691u);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ss4.f0) || i17 != 0 || i18 != 0) {
            return false;
        }
        com.tencent.mm.plugin.wallet_core.model.Orders orders = ((ss4.f0) m1Var).f412058d;
        this.f180072d = orders;
        if (orders != null) {
            java.util.List list = orders.M;
            if (list != null && ((java.util.ArrayList) list).size() != 0) {
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) this.f180072d.M).get(0);
                this.f180073e = commodity.f179714r;
                commodity.toString();
                gm0.j1.i();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(commodity.f179717u, true);
                if (n17 == null || ((int) n17.E2) == 0) {
                    ((c01.k7) c01.n8.a()).b(commodity.f179717u, 4, this.f180074f);
                } else {
                    a7(n17);
                }
            }
            Y6(this.f180072d);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletOrderInfoUI", "cannot get orders");
            db5.e1.m(getContext(), com.tencent.mm.R.string.ks_, 0, new com.tencent.mm.plugin.wallet_core.ui.b7(this));
        }
        return true;
    }
}
