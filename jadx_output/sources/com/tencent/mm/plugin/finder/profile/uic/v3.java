package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f124282d;

    public v3(com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f124282d = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onResume$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f124282d.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileEduUIC$onResume$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
