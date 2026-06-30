package com.tencent.mm.plugin.wallet.pwd.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletResetPwdAdapterUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f178940d = "";

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        java.lang.String stringExtra = getIntent().getStringExtra("reset_pwd_token");
        this.f178940d = stringExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletResetPwdAdapterUI", "token_by_resetPwd %s", stringExtra);
        addSceneEndListener(580);
        if (getIntent() == null) {
            setResult(0);
            finish();
        } else {
            ss4.d dVar = new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 13, "setWCPayPassword", getIntent().getIntExtra("pay_channel", 0));
            dVar.setProcessName("RemittanceProcess");
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
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("kreq_token", this.f178940d);
        r45.r65 r65Var = ((r45.y10) dVar.f412029e.f70711b.f70700a).f390703g;
        if (r65Var != null) {
            bundle.putString("key_pwd_title", r65Var.f384573d);
            bundle.putString("key_pwd_desc", r65Var.f384574e);
        }
        com.tencent.mm.wallet_core.a.j(this, fs4.m.class, bundle, null);
        return true;
    }
}
