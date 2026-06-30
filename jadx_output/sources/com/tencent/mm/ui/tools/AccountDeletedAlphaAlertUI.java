package com.tencent.mm.ui.tools;

@db5.a(3)
/* loaded from: classes11.dex */
public class AccountDeletedAlphaAlertUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI f209959d;

    public static void T6(com.tencent.mm.ui.tools.AccountDeletedAlphaAlertUI accountDeletedAlphaAlertUI) {
        accountDeletedAlphaAlertUI.finish();
        android.content.Intent intent = new android.content.Intent(accountDeletedAlphaAlertUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        androidx.appcompat.app.AppCompatActivity context = accountDeletedAlphaAlertUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/tools/AccountDeletedAlphaAlertUI", "kickOff", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/tools/AccountDeletedAlphaAlertUI", "kickOff", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f209959d = this;
        new com.tencent.mm.autogen.events.BackupCoreResetEvent().e();
        gm0.m.o();
        tm.a b17 = tm.a.b(getIntent().getStringExtra("errmsg"));
        if (b17 != null) {
            b17.c(this, new com.tencent.mm.ui.tools.a(this), null);
        } else {
            db5.e1.G(this, getString(com.tencent.mm.R.string.gqm), null, false, new com.tencent.mm.ui.tools.b(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (equals(f209959d)) {
            f209959d = null;
        }
        super.onDestroy();
    }
}
