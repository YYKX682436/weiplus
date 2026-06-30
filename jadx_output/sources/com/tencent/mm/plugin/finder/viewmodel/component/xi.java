package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136465d;

    public xi(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f136465d = blVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.bl.p7(this.f136465d, false, null, false, 2, null);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.assist.i0.pj((com.tencent.mm.plugin.finder.assist.i0) c17, this.f136465d.getContext(), null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeActionBarUIC$checkShowRedDotBubble$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
