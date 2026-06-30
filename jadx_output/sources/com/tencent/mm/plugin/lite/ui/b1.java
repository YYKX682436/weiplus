package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes8.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppDragHalfScreenUI f144388d;

    public b1(com.tencent.mm.plugin.lite.ui.WxaLiteAppDragHalfScreenUI wxaLiteAppDragHalfScreenUI) {
        this.f144388d = wxaLiteAppDragHalfScreenUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/ui/WxaLiteAppDragHalfScreenUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f144388d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/lite/ui/WxaLiteAppDragHalfScreenUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
