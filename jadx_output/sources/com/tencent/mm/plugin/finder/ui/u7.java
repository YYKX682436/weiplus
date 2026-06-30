package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class u7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderKitUI f129905d;

    public u7(com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI) {
        this.f129905d = finderKitUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f129905d);
        e4Var.f211776c = "非紫版不支持覆盖更新";
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
