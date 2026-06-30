package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class f9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123707d;

    public f9(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123707d = obVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_scene", 2);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123707d;
        intent.putExtra("finder_username", obVar.getUsername());
        xy2.c.c(obVar.getActivity(), intent);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Ok(obVar.getContext(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
