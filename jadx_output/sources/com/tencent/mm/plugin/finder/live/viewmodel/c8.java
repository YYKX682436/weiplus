package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class c8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.d8 f116977d;

    public c8(com.tencent.mm.plugin.finder.live.viewmodel.d8 d8Var) {
        this.f116977d = d8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveSimpleResultUIC$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f116977d.getActivity().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveSimpleResultUIC$onCreate$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
