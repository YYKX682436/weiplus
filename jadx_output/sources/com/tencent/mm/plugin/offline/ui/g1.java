package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes3.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI f152625d;

    public g1(com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI offlinePayShortcutGuideUI) {
        this.f152625d = offlinePayShortcutGuideUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f152625d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
