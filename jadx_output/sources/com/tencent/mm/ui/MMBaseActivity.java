package com.tencent.mm.ui;

@db5.a(3)
/* loaded from: classes14.dex */
public class MMBaseActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f196887d;

    @Override // android.app.Activity
    public android.content.Intent getIntent() {
        android.content.Intent intent = super.getIntent();
        if (intent != null) {
            lk5.d.f319023a.f(intent);
        }
        return intent;
    }

    public final android.content.res.Resources getOriginalResources() {
        return super.getResources();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) ? super.getResources() : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        return (getAssets() == null || !"layout_inflater".equals(str)) ? systemService : com.tencent.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // android.app.Activity
    public android.view.WindowManager getWindowManager() {
        if (!isDestroyed()) {
            return super.getWindowManager();
        }
        try {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 2 && stackTrace[1].getMethodName().equals("handleDestroyActivity")) {
                return tp.a.a(super.getWindowManager());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMBaseActivity", th6.getMessage());
        }
        return super.getWindowManager();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        this.f196887d = true;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f196887d = false;
        super.onResume();
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        if (!com.tencent.mm.sdk.platformtools.d.a(this, i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMBaseActivity", "AndroidOSafety.safety false ignore setRequestedOrientation %s for activity %s", java.lang.Integer.valueOf(i17), this);
            return;
        }
        try {
            super.setRequestedOrientation(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMBaseActivity", th6, "AndroidOSafety.safety uncaught", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr) {
        super.startActivities(intentArr);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        super.startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        if (com.tencent.mm.ui.b2.a(this, this.f196887d, intentArr, bundle)) {
            return;
        }
        super.startActivities(intentArr, bundle);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        super.startActivity(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (com.tencent.mm.ui.b2.a(this, this.f196887d, new android.content.Intent[]{intent}, java.lang.Integer.valueOf(i17), bundle)) {
            return;
        }
        if (intent != null) {
            lk5.d.f319023a.g(intent);
        }
        super.startActivityForResult(intent, i17, bundle);
    }
}
