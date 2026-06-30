package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes5.dex */
public class JDRemindDialog extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f172112f = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f172113e = null;

    public final void O6() {
        android.os.Bundle extras;
        if (getIntent() == null || (extras = getIntent().getExtras()) == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = "";
        aVar.f211729s = extras.getString("alertcontent");
        aVar.f211732v = extras.getString("alertconfirm");
        aVar.E = new com.tencent.mm.plugin.subapp.jdbiz.i(this);
        aVar.f211733w = extras.getString("alert_cancel");
        aVar.F = new com.tencent.mm.plugin.subapp.jdbiz.j(this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        this.f172113e = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f172113e.show();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        O6();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f172113e;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f172113e = null;
        }
        O6();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        db5.m9.a(false, null);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        db5.m9.a(true, null);
    }
}
