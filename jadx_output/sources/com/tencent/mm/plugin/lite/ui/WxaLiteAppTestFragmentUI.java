package com.tencent.mm.plugin.lite.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppTestFragmentUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class WxaLiteAppTestFragmentUI extends androidx.appcompat.app.AppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.f489218bq2);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.i2 beginTransaction = supportFragmentManager != null ? supportFragmentManager.beginTransaction() : null;
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y("wxalite57af7e6c7eea13b5e789762aecade923", null);
        if (y17 != null) {
            com.tencent.liteapp.ui.j jVar = new com.tencent.liteapp.ui.j(com.tencent.liteapp.ui.WxaLiteAppFragment.class);
            jVar.f46191f = y17;
            jVar.f46190e = "wxalite57af7e6c7eea13b5e789762aecade923";
            com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = (com.tencent.liteapp.ui.WxaLiteAppFragment) jVar.a();
            if (beginTransaction != null) {
                beginTransaction.h(com.tencent.mm.R.id.gd9, wxaLiteAppFragment, null, 1);
            }
            if (beginTransaction != null) {
                beginTransaction.d();
            }
        }
        android.view.View oj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(this, false, false, null);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.p1c)).addView(oj6, new android.view.ViewGroup.LayoutParams(-1, -1));
        android.os.Bundle bundle2 = new android.os.Bundle();
        h73.e.d(bundle2, "appId", "wxalite2ceddca8b296458a527661862c5664b2");
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk(oj6, bundle2, false, false, null, null);
    }
}
