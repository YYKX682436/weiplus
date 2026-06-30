package com.tencent.mm.plugin.wallet_core.id_verify;

@db5.a(3)
/* loaded from: classes9.dex */
public class RealnameDialogActivity extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper f179203d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("key_realname_guide_helper")) {
            finish();
            return;
        }
        this.f179203d = (com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("realname_verify_process_jump_plugin", "wallet_core");
        bundle2.putString("realname_verify_process_jump_activity", ".id_verify.RealnameDialogActivity");
        bundle2.putBoolean("process_finish_stay_orgpage", false);
        boolean b17 = this.f179203d.b(this, bundle2, new com.tencent.mm.plugin.wallet_core.id_verify.v(this), null, true);
        boolean c17 = this.f179203d.c(this, bundle2, new com.tencent.mm.plugin.wallet_core.id_verify.w(this), null, false);
        if (b17 || c17) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
