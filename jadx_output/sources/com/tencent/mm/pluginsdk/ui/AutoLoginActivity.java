package com.tencent.mm.pluginsdk.ui;

@db5.a(3)
/* loaded from: classes8.dex */
public abstract class AutoLoginActivity extends com.tencent.mm.ui.MMActivity {
    public boolean T6() {
        js.t0 t0Var = (js.t0) i95.n0.c(js.t0.class);
        android.content.Intent intent = getIntent();
        java.lang.Class<?> cls = getClass();
        ((is.h) t0Var).getClass();
        if (gm0.j1.b().n() && !gm0.m.r()) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AccountSdkFeatureService", "not login");
        android.content.Intent intent2 = new android.content.Intent(this, cls);
        intent2.putExtras(intent);
        intent2.addFlags(67108864);
        intent2.setDataAndType(intent.getData(), intent.getType());
        intent2.setAction(intent.getAction());
        android.content.Intent intent3 = new android.content.Intent();
        intent3.putExtras(intent);
        j45.l.C(this, "account", "com.tencent.mm.plugin.account.ui.SimpleLoginUI", intent3, intent2);
        return true;
    }

    public final void U6(int i17) {
        if (i17 == -1) {
            X6(com.tencent.mm.pluginsdk.ui.p.LOGIN_OK, getIntent());
            return;
        }
        if (i17 == 0) {
            T6();
            return;
        }
        if (i17 == 1) {
            X6(com.tencent.mm.pluginsdk.ui.p.LOGIN_CANCEL, getIntent());
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AutoLoginActivity", "onNewIntent, should not reach here, resultCode = " + i17);
        X6(com.tencent.mm.pluginsdk.ui.p.LOGIN_FAIL, getIntent());
    }

    public final void V6(java.lang.String str) {
        if (Z6()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoLoginActivity", "Activity finish with report, reason: " + str);
            W6(str);
        }
        finish();
    }

    public void W6(java.lang.String str) {
    }

    public abstract void X6(com.tencent.mm.pluginsdk.ui.p pVar, android.content.Intent intent);

    public abstract boolean Y6(android.content.Intent intent);

    public boolean Z6() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setTitleVisibility(8);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoLoginActivity", "onCreate intent is null");
            V6("intent is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoLoginActivity", "onCreate, intent action = " + intent.getAction());
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "wizard_activity_result_code", -2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoLoginActivity", "onCreate, resultCode = " + g17);
        if (g17 != -2) {
            U6(g17);
            return;
        }
        if (!Y6(intent)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AutoLoginActivity", "preLogin fail, no need to process");
            V6("preLogin fail");
        } else if (!T6()) {
            X6(com.tencent.mm.pluginsdk.ui.p.LOGIN_OK, intent);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AutoLoginActivity", "not login, go to SimpleLogin");
            V6("not login");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(intent, "wizard_activity_result_code", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoLoginActivity", "onNewIntent, resultCode = " + g17);
        U6(g17);
    }
}
