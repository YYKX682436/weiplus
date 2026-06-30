package com.tencent.mm.plugin.fingerprint.faceid.auth;

@db5.a(3)
/* loaded from: classes9.dex */
public class WalletFaceIdAuthUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f136981d;

    /* renamed from: e, reason: collision with root package name */
    public lz2.n f136982e;

    /* renamed from: f, reason: collision with root package name */
    public int f136983f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f136984g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f136985h = "verifyFail";

    public void U6(java.lang.String str) {
        db5.e1.E(this, str, "", getString(com.tencent.mm.R.string.f490455vj), false, new lz2.f(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aap;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.g6j);
        this.f136981d = button;
        button.setOnClickListener(new lz2.e(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean isTransparent() {
        return this.f136982e.d();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f136983f = getIntent().getIntExtra("key_scene", 1);
        boolean booleanExtra = getIntent().getBooleanExtra("key_show_succ_toast", true);
        this.f136984g = ih.a.h("clicfg_android_pay_liteapp_success_page", false) || ((h45.q) i95.n0.c(h45.q.class)).isKindaLitePaying();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "scene: %s", java.lang.Integer.valueOf(this.f136983f));
        int i17 = this.f136983f;
        if (i17 == 0) {
            lz2.k kVar = new lz2.k(this);
            this.f136982e = kVar;
            kVar.f322340f = booleanExtra;
        } else if (i17 == 1) {
            this.f136982e = new lz2.i(this, this.f136984g);
        }
        super.onCreate(bundle);
        setBackBtn(new lz2.d(this));
        setMMTitle(com.tencent.mm.R.string.c8y);
        this.f136982e.f();
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f136984g && !this.f136985h.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "useLiteApp successpage");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("event_name", "openFaceIdPayFail");
                jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, this.f136985h);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdAuthUI", "JSONException %s", e17.toString());
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.w.k(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID, "pay.notifyAll", jSONObject);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onProgressFinish() {
        return true;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return this.f136982e.i(i17, i18, str, m1Var);
    }
}
