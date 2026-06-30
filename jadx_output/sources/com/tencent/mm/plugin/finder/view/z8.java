package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class z8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f133454d;

    public z8(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f133454d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendActivityView$showPostActivitySheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f133454d.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendActivityView$showPostActivitySheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
