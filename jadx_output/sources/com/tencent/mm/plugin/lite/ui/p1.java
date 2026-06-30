package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes11.dex */
public class p1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI f144460d;

    public p1(com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI) {
        this.f144460d = wxaLiteAppListUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI = this.f144460d;
        com.tencent.liteapp.storage.WxaLiteAppInfo item = wxaLiteAppListUI.f144342f.getItem(i17);
        if (item == null) {
            java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        } else {
            if (item.appId.equals("TestFragment")) {
                android.content.Intent intent = new android.content.Intent(wxaLiteAppListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.lite.ui.WxaLiteAppTestFragmentUI.class);
                androidx.appcompat.app.AppCompatActivity context = wxaLiteAppListUI.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$5", "onItemLongClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$5", "onItemLongClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", item.appId);
            bundle.putBoolean("isHalfScreen", true);
            bundle.putDouble("heightPercent", 0.75d);
            if (com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB.equals(item.appId)) {
                dp.a.makeText(wxaLiteAppListUI.getContext(), "Is Base Lib ", 0).show();
            } else {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, null);
            }
        }
        return false;
    }
}
