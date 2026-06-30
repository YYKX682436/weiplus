package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f133313d;

    public x2(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f133313d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.e3 e3Var = this.f133313d;
        e3Var.h();
        e3Var.getClass();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
