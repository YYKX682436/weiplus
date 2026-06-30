package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class qv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.tv f135740e;

    public qv(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar, com.tencent.mm.plugin.finder.viewmodel.component.tv tvVar) {
        this.f135739d = sxVar;
        this.f135740e = tvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f135739d.Y6(this.f135740e.f136061a);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
