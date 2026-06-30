package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes12.dex */
public class RemittanceMsgAlertActivity extends androidx.appcompat.app.AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_no_contact", false);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(booleanExtra ? com.tencent.mm.R.string.i0a : com.tencent.mm.R.string.i0_));
        u1Var.k(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.aaq));
        u1Var.m(com.tencent.mm.R.string.f492294fz1);
        u1Var.l(new com.tencent.mm.plugin.remittance.ui.a7(this));
        u1Var.e(new com.tencent.mm.plugin.remittance.ui.b7(this));
        u1Var.q(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        overridePendingTransition(0, 0);
    }
}
