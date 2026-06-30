package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class p7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderKitUI f129622d;

    public p7(com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI) {
        this.f129622d = finderKitUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSettingsUI.g;
        android.content.Intent intent = new android.content.Intent((android.content.Context) this.f129622d, (java.lang.Class<?>) com.tencent.mm.plugin.finder.ui.FinderSettingsUI.class);
        com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI = this.f129622d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(finderKitUI, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finderKitUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(finderKitUI, "com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
