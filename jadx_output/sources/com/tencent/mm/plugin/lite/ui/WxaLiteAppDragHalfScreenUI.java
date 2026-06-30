package com.tencent.mm.plugin.lite.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppDragHalfScreenUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class WxaLiteAppDragHalfScreenUI extends androidx.appcompat.app.AppCompatActivity {
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477723k, com.tencent.mm.R.anim.f477830co);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.bpx);
        overridePendingTransition(com.tencent.mm.R.anim.f477723k, com.tencent.mm.R.anim.f477724l);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485557i40);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollableFrameLayout = (com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout) findViewById;
        android.view.ViewGroup.LayoutParams layoutParams = scrollableFrameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        if (bundleExtra != null) {
            int i17 = com.tencent.mm.ui.bk.h(this).y;
            layoutParams2.height = i17 - com.tencent.mm.ui.bk.p(this);
            double d17 = 0.75d;
            if (bundleExtra.containsKey("heightPercent")) {
                double d18 = bundleExtra.getDouble("heightPercent");
                if (d18 > 0.0d && d18 < 1.0d) {
                    d17 = d18;
                }
            }
            int i18 = (int) (i17 * (1 - d17));
            scrollableFrameLayout.setSpaceHolderHeight(i18);
            layoutParams2.topMargin = i18;
        }
        scrollableFrameLayout.setOutlineProvider(new com.tencent.mm.plugin.lite.ui.y0());
        scrollableFrameLayout.setClipToOutline(true);
        scrollableFrameLayout.setUiEventListener(new com.tencent.mm.plugin.lite.ui.z0(this));
        com.tencent.mm.plugin.lite.ui.WxaLiteAppView wxaLiteAppView = (com.tencent.mm.plugin.lite.ui.WxaLiteAppView) ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(this, false, false, null);
        wxaLiteAppView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        scrollableFrameLayout.addView(wxaLiteAppView);
        scrollableFrameLayout.setChildScrolledReferee(new com.tencent.mm.plugin.lite.ui.a1(wxaLiteAppView));
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP_ID);
        java.lang.String stringExtra2 = getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String stringExtra3 = getIntent().getStringExtra("query");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("appId", stringExtra);
        bundle2.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, stringExtra2);
        bundle2.putString("query", stringExtra3);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk(wxaLiteAppView, bundle2, false, false, null, null);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.i3z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.widget.FrameLayout) findViewById2).setOnClickListener(new com.tencent.mm.plugin.lite.ui.b1(this));
    }
}
