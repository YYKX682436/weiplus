package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144479d;

    public t(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView) {
        this.f144479d = wxaHalfScreenLiteAppView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/ui/WxaHalfScreenLiteAppView$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f144479d.l();
        yj0.a.h(this, "com/tencent/mm/plugin/lite/ui/WxaHalfScreenLiteAppView$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
