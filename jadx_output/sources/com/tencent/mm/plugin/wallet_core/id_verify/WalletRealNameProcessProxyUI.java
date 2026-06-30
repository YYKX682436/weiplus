package com.tencent.mm.plugin.wallet_core.id_verify;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletRealNameProcessProxyUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179224d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179225e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f179226f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI.1
        {
            this.__eventId = 323604482;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
            com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent2 = walletRealNameResultNotifyEvent;
            com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI walletRealNameProcessProxyUI = com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameProcessProxyUI.this;
            walletRealNameProcessProxyUI.f179226f.dead();
            int i17 = walletRealNameResultNotifyEvent2.f54973g.f6120a;
            if (i17 == -1 || i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "WalletRealNameProcessProxyUI finish");
                int i18 = walletRealNameResultNotifyEvent2.f54973g.f6120a;
                if (i18 == -1) {
                    walletRealNameProcessProxyUI.setResult(-1);
                } else if (i18 == 0) {
                    walletRealNameProcessProxyUI.setResult(0);
                }
                walletRealNameProcessProxyUI.finish();
            }
            return false;
        }
    };

    public void U6(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI");
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "goRealNameUI, param is null");
            bundle = new android.os.Bundle();
        }
        bundle.putString("key_realname_scene", this.f179225e);
        bundle.putString("key_realname_sessionid", this.f179224d);
        bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        bundle.putString("realname_verify_process_jump_activity", ".id_verify.WalletRealNameProcessProxyUI");
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putParcelable("JsApiRequestWCPayRealnameVerifyParameter", (com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter) getIntent().getParcelableExtra("JSAPI_TYPE_TINYAPP_PARAMETER"));
        bundle.putInt("realname_verify_process_from_scene", getIntent().getIntExtra("realname_verify_process_from_scene", 10));
        com.tencent.mm.wallet_core.a.j(this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, bundle, new com.tencent.mm.plugin.wallet_core.id_verify.w0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "on create");
        addSceneEndListener(580);
        this.f179226f.alive();
        android.os.Bundle input = getInput();
        if (input != null) {
            i17 = input.getInt("realname_scene", 0);
            str = input.getString("JSAPI_TYPE", "");
        } else {
            i17 = 0;
            str = "";
        }
        if (i17 == 0) {
            i17 = getIntent().getIntExtra("realname_scene", 0);
        }
        if (str.equals("JSAPI_TYPE_TINYAPP")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "from tiny app jsapi, do NetSceneCheckPayJsapi");
            doSceneForceProgress(new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), 8, getIntent().getStringExtra("wxapp_username"), getIntent().getStringExtra("wxapp_path"), getIntent().getStringExtra("command_word"), 0));
        } else {
            if (i17 != 1) {
                U6(input);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "from jsapi, do NetSceneCheckPayJsapi");
            if (getIntent() == null) {
                db5.e1.G(this, com.tencent.mm.sdk.platformtools.t8.K0("") ? getString(com.tencent.mm.R.string.l0g) : "", null, false, new com.tencent.mm.plugin.wallet_core.id_verify.x0(this));
            } else {
                doSceneForceProgress(new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), getInput().getInt("realname_scene") == 2 ? 12 : 8, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)));
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
        this.f179226f.dead();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletRealNameProcessProxyUI", "onNewIntent");
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras == null || !extras.getBoolean("key_is_realname_verify_process")) {
            setResult(0);
        } else if (extras.getInt("realname_verify_process_ret", 0) != -1) {
            setResult(0);
        } else {
            setResult(-1);
        }
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof ss4.d)) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletRealNameProcessProxyUI", "NetSceneCheckPayJsapi resp,errType = " + i17 + ",errCode=" + i18);
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        ss4.d dVar = (ss4.d) m1Var;
        h45.y.f278968a = dVar.H();
        com.tencent.mm.protobuf.f fVar = dVar.f412029e.f70711b.f70700a;
        this.f179224d = ((r45.y10) fVar).f390707n;
        this.f179225e = ((r45.y10) fVar).f390708o;
        U6(getInput());
        return true;
    }
}
