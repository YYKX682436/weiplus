package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI f144424d;

    public j1(com.tencent.mm.plugin.lite.ui.WxaLiteAppListUI wxaLiteAppListUI) {
        this.f144424d = wxaLiteAppListUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalite6249b65249893bb23a2d4347a17db5b9@pay");
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk(this.f144424d.f144345i, bundle, true, false, null, new com.tencent.mm.plugin.lite.ui.i1(this));
        yj0.a.h(this, "com/tencent/mm/plugin/lite/ui/WxaLiteAppListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
