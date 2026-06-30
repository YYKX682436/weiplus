package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI f144416d;

    public h2(com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI wxaLiteAppSheetUI) {
        this.f144416d = wxaLiteAppSheetUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/ui/WxaLiteAppSheetUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.lite.ui.WxaLiteAppSheetUI.f144352x;
        this.f144416d.Q6();
        yj0.a.h(this, "com/tencent/mm/plugin/lite/ui/WxaLiteAppSheetUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
