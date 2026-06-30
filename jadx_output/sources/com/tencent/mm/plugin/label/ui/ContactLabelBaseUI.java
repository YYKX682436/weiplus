package com.tencent.mm.plugin.label.ui;

@db5.a(1024)
/* loaded from: classes11.dex */
public class ContactLabelBaseUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f143211d;

    public void U6(java.lang.String str) {
        this.f143211d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), str, true, true, new f93.v0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 0;
    }

    public void hideLoading() {
        android.app.ProgressDialog progressDialog = this.f143211d;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f143211d.dismiss();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setNavigationbarColor(getColor(com.tencent.mm.R.color.f478490b));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        setNavigationbarColor(getColor(com.tencent.mm.R.color.f478490b));
    }
}
