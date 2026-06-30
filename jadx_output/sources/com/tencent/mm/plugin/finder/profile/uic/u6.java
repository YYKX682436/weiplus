package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124258d;

    public u6(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124258d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$checkHeaderUIState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124258d;
        obVar.f124061g2 = kotlinx.coroutines.l.d(obVar.getMainScope(), null, null, new com.tencent.mm.plugin.finder.profile.uic.j7(obVar, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$checkHeaderUIState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
