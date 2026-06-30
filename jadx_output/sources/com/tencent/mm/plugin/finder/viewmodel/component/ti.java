package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ti implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f136034e;

    public ti(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, android.content.Intent intent) {
        this.f136033d = blVar;
        this.f136034e = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.bl.p7(this.f136033d, false, null, false, 2, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).zk(this.f136033d.getActivity(), this.f136034e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
