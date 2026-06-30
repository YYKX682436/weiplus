package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class y9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderManagementUI f130047d;

    public y9(com.tencent.mm.plugin.finder.ui.FinderManagementUI finderManagementUI) {
        this.f130047d = finderManagementUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity context = this.f130047d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).mj(context, null, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderManagementUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
