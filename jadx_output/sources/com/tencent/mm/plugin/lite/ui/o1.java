package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes11.dex */
public class o1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI f144453d;

    public o1(com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI) {
        this.f144453d = wxaLiteAppListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI = this.f144453d;
        com.tencent.liteapp.storage.WxaLiteAppInfo item = wxaLiteAppListUI.f144342f.getItem(i17);
        if (item != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", item.appId);
            if (item.appId.equals("TestFragment")) {
                android.content.Intent intent = new android.content.Intent(wxaLiteAppListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.lite.ui.WxaLiteAppTestFragmentUI.class);
                androidx.appcompat.app.AppCompatActivity context = wxaLiteAppListUI.getContext();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (item.appId.equals("widget测试")) {
                kotlinx.coroutines.y0 y0Var = com.tencent.mm.plugin.lite.v.f144509a;
                androidx.appcompat.app.AppCompatActivity context2 = wxaLiteAppListUI.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                kotlinx.coroutines.l.d(com.tencent.mm.plugin.lite.v.f144509a, null, null, new com.tencent.mm.plugin.lite.u("wxalite57af7e6c7eea13b5e789762aecade923", context2, null), 3, null);
            } else if (com.tencent.mm.plugin.lite.LiteAppCenter.LITE_APP_BASE_LIB.equals(item.appId)) {
                dp.a.makeText(wxaLiteAppListUI.getContext(), "Is Base Lib ", 0).show();
            } else {
                if (item.appId.equals("wxalite9f49cc96fb30017059f65139fee9f535")) {
                    bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
                }
                com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
                sVar.d(new com.tencent.mm.plugin.lite.ui.l1(this));
                sVar.f144167d = new com.tencent.mm.plugin.lite.ui.m1(this, sVar);
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, sVar, new com.tencent.mm.plugin.lite.ui.n1(this));
            }
        } else {
            java.util.Map map = com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI.f144339m;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
