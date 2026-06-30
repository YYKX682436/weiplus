package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class j8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123844d;

    public j8(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123844d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleInfoArea$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ks2.j) ((jz5.n) this.f123844d.W1).getValue()).i();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleInfoArea$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
