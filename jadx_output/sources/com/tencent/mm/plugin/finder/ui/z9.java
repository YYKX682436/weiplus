package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class z9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderManagementUI f130086d;

    public z9(com.tencent.mm.plugin.finder.ui.FinderManagementUI finderManagementUI) {
        this.f130086d = finderManagementUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderManagementUI finderManagementUI = this.f130086d;
        if (finderManagementUI.f128619z) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            androidx.appcompat.app.AppCompatActivity context = finderManagementUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.plugin.finder.assist.i0) c17).ik(context, null, 2);
        } else {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            androidx.appcompat.app.AppCompatActivity context2 = finderManagementUI.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((com.tencent.mm.plugin.finder.assist.i0) c18).mj(context2, null, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
