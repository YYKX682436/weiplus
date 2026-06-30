package com.tencent.mm.plugin.wallet.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletJsApiAdapterUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179134d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179135e = "";

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intValue;
        super.onCreate(bundle);
        setContentViewVisibility(8);
        if (getIntent().getIntExtra("from_hk", 0) == 1 && (intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue()) != 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletJsApiAdapterUI", "user wallet region is %s, not HK, show tips and ret fail", java.lang.Integer.valueOf(intValue));
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
            u1Var.g(getContext().getString(com.tencent.mm.R.string.hei));
            u1Var.l(new hs4.i(this));
            u1Var.n(getContext().getString(com.tencent.mm.R.string.kl_));
            u1Var.q(false);
            return;
        }
        this.f179134d = getIntent().getStringExtra("intent_jump_package");
        this.f179135e = getIntent().getStringExtra("intent_jump_ui");
        addSceneEndListener(580);
        if (getIntent() == null) {
            setResult(0);
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("source_type", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJsApiAdapterUI", "do check jsapi: %s", java.lang.Integer.valueOf(intExtra));
        ss4.d dVar = intExtra == 1 ? new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), getIntent().getIntExtra("jsapi_scene", 0), "openWCPayCardList", getIntent().getIntExtra("pay_channel", 0)) : intExtra == 2 ? new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getIntExtra("jsapi_scene", 0), getIntent().getStringExtra("wxapp_username"), getIntent().getStringExtra("wxapp_path"), getIntent().getStringExtra("command_word"), getIntent().getIntExtra("pay_channel", 0)) : null;
        if (dVar != null) {
            doSceneForceProgress(dVar);
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        removeSceneEndListener(580);
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("RESET_PWD_USER_ACTION", 0);
        if (intExtra == 1) {
            setResult(-1);
            finish();
        } else if (intExtra == 2) {
            setResult(-1000);
            finish();
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJsApiAdapterUI", "onSceneEnd errType %s errCode %s errMsg %s scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 != 0 || i18 != 0) {
            setResult(-1000);
            db5.e1.T(this, str);
            finish();
            return true;
        }
        if (!(m1Var instanceof ss4.d)) {
            return false;
        }
        ss4.d dVar = (ss4.d) m1Var;
        h45.y.f278968a = dVar.H();
        r45.y10 y10Var = dVar.f412030f;
        if (y10Var != null && y10Var.f390709p != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", y10Var.f390709p.f388777d);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, y10Var.f390709p.f388778e);
            bundle.putString("query", y10Var.f390709p.f388779f);
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WEB_VIEW;
            bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(getContext(), bundle, true, false, new hs4.j(this));
            setResult(-1);
            finish();
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f179135e) && this.f179135e.equals(com.tencent.mm.plugin.appbrand.jsapi.pay.c0.NAME)) {
            ((h45.q) i95.n0.c(h45.q.class)).startHKOfflinePrePayFromJsApi(this, getIntent().getStringExtra("packageExt"));
            setResult(-1);
            finish();
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f179135e) && this.f179135e.equals("requestHKCashier")) {
            ((h45.q) i95.n0.c(h45.q.class)).requestHKCashierNotify(this, getIntent().getStringExtra("packageExt"));
            setResult(-1);
            finish();
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f179135e) && this.f179135e.equals(com.tencent.mm.plugin.appbrand.jsapi.pay.s.NAME)) {
            ((h45.q) i95.n0.c(h45.q.class)).startGetEncryptHKPasswd(getIntent().getStringExtra("packageExt"), new hs4.k(this));
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f179135e) && this.f179135e.equals(".bind.ui.WalletBankcardManageUI")) {
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase("bankCard", com.tencent.kinda.gen.ITransmitKvData.create(), new hs4.l(this));
            setResult(-1);
            finish();
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179134d) || com.tencent.mm.sdk.platformtools.t8.K0(this.f179135e)) {
            setResult(-1);
            finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_finish_self", true);
            j45.l.n(this, this.f179134d, this.f179135e, intent, 1);
        }
        return true;
    }
}
