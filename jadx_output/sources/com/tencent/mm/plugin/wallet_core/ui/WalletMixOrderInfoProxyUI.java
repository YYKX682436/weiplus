package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class WalletMixOrderInfoProxyUI extends com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI {

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f180002c2;

    /* renamed from: d2, reason: collision with root package name */
    public java.lang.String f180003d2 = null;

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public com.tencent.mm.plugin.wallet_core.model.Orders X6() {
        return this.f180002c2;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI
    public void e7() {
        java.util.Iterator it = ((java.util.HashSet) this.f180027i).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.wallet_core.model.a1(str));
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f180003d2)) {
            com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_pay_end", true);
            intent.putExtra("is_jsapi_close_page", this.f180002c2.Y);
            am.s10 s10Var = walletPayResultEvent.f54965g;
            s10Var.f7861a = intent;
            s10Var.f7864d = this.f180003d2;
            s10Var.f7863c = -1;
            s10Var.f7866f = 1;
            walletPayResultEvent.e();
        }
        setResult(-1);
        finish();
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI
    public void h7() {
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f180002c2 = (com.tencent.mm.plugin.wallet_core.model.Orders) getIntent().getParcelableExtra("key_orders");
        this.f180003d2 = getIntent().getStringExtra("prepayId");
        super.onCreate(bundle);
    }
}
