package com.tencent.mm.plugin.wallet_core.ui.ibg;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletIbgOrderInfoUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: n, reason: collision with root package name */
    public static com.tencent.mm.plugin.wallet_core.model.Orders f180343n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f180344d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f180345e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f180346f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f180347g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f180348h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f180349i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f180350m = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d2d;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            if (i17 == 1) {
                com.tencent.mm.autogen.events.JsapiResultEvent jsapiResultEvent = new com.tencent.mm.autogen.events.JsapiResultEvent();
                am.yh yhVar = jsapiResultEvent.f54449g;
                yhVar.f8461a = 25;
                yhVar.f8462b = -1;
                yhVar.f8463c = new android.content.Intent();
                jsapiResultEvent.e();
            }
            setResult(-1);
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.i9.CTRL_INDEX);
        this.f180344d = getIntent().getStringExtra("appId");
        this.f180345e = getIntent().getStringExtra("nonceStr");
        this.f180346f = getIntent().getStringExtra("timeStamp");
        this.f180347g = getIntent().getStringExtra("packageExt");
        this.f180348h = getIntent().getStringExtra("paySignature");
        this.f180349i = getIntent().getStringExtra("signtype");
        this.f180350m = getIntent().getStringExtra("url");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("appid", this.f180344d);
        bundle2.putString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, this.f180346f);
        bundle2.putString("nonce_str", this.f180345e);
        bundle2.putString("package", this.f180347g);
        bundle2.putString("sign_type", this.f180349i);
        bundle2.putString("pay_sign", this.f180348h);
        bundle2.putString("webview_url", this.f180350m);
        if (((h45.q) i95.n0.c(h45.q.class)).startPayIBGJsGetSuccPageUseCase(this, bundle2)) {
            return;
        }
        doSceneForceProgress(new ts4.c(this.f180344d, this.f180345e, this.f180346f, this.f180347g, this.f180348h, this.f180349i, this.f180350m));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.i9.CTRL_INDEX);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIbgOrderInfoUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (m1Var instanceof ts4.c) {
            removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.i9.CTRL_INDEX);
            if (i17 == 0 && i18 == 0) {
                ts4.c cVar = (ts4.c) m1Var;
                com.tencent.mm.plugin.wallet_core.model.Orders orders = cVar.f421721f;
                f180343n = orders;
                int i19 = cVar.f421722g;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletIbgOrderInfoUI", "gotoIbgOrderInfoUI, useNewPage: %s, orders: %s", java.lang.Integer.valueOf(i19), orders);
                if (i19 == 1) {
                    android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoNewUI.class);
                    intent.putExtra("key_orders", orders);
                    startActivityForResult(intent, 1);
                } else {
                    android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoOldUI.class);
                    intent2.putExtra("key_orders", orders);
                    startActivityForResult(intent2, 2);
                }
                return true;
            }
            setResult(0);
            finish();
        }
        setResult(0);
        finish();
        return false;
    }
}
