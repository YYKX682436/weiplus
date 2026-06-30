package com.tencent.mm.plugin.lite.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppSheetBGUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WxaLiteAppSheetBGUI extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f144351d = "MicroMsg.WxaLiteAppSheetBGUI";

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477723k, com.tencent.mm.R.anim.f477724l);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        setResult(i18, intent);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        if (!com.tencent.mm.plugin.lite.p.f144150b.get()) {
            com.tencent.mars.xlog.Log.e(this.f144351d, "LiteAppProcessProfileInit has no init.");
            super.onCreate(bundle);
            finish();
            return;
        }
        super.onCreate(bundle);
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        if (bundleExtra != null && bundleExtra.containsKey("halfScreenConfig")) {
        }
        setContentView(com.tencent.mm.R.layout.f489216bq0);
        android.view.View rootView = findViewById(android.R.id.content).getRootView();
        if (rootView != null) {
            rootView.setBackgroundColor(0);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
            getWindow().getDecorView().setSystemUiVisibility(1280);
        } else {
            com.tencent.mars.xlog.Log.e(this.f144351d, "rootView:" + rootView);
        }
        n3.h2.a(getWindow(), true);
        setRequestedOrientation(10);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        getIntent().setFlags(0);
        getIntent().setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI.class);
        startActivityForResult(getIntent(), 0);
        com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(com.tencent.mm.ui.bk.E(com.tencent.mm.sdk.platformtools.x2.f193075e));
        com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(com.tencent.mm.plugin.lite.LiteAppCenter.fontScale);
        overridePendingTransition(com.tencent.mm.R.anim.f477723k, com.tencent.mm.R.anim.f477724l);
    }
}
