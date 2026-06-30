package com.tencent.mm.plugin.wallet_core.ui.ibg;

/* loaded from: classes9.dex */
public class WalletIbgOrderInfoNewUI extends com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI {

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f180342c2;

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI
    public com.tencent.mm.plugin.wallet_core.model.Orders X6() {
        return this.f180342c2;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI
    public void e7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIbgOrderInfoNewUI", "hy: result is not set manly. set to OK");
        for (java.lang.String str : this.f180027i) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new com.tencent.mm.wallet_core.model.a1(str));
            }
        }
        setResult(-1);
        finish();
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI
    public void h7() {
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f180342c2 = com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI.f180343n;
        super.onCreate(bundle);
        com.tencent.mm.autogen.events.JsapiResultEvent jsapiResultEvent = new com.tencent.mm.autogen.events.JsapiResultEvent();
        am.yh yhVar = jsapiResultEvent.f54449g;
        yhVar.f8461a = 25;
        yhVar.f8462b = -1;
        yhVar.f8463c = new android.content.Intent();
        jsapiResultEvent.e();
    }
}
