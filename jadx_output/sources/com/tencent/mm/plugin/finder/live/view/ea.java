package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ea implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116278d;

    public ea(com.tencent.mm.plugin.finder.live.view.ka kaVar) {
        this.f116278d = kaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddSubWidget$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.ka kaVar = this.f116278d;
        kaVar.getClass();
        com.tencent.mm.plugin.finder.live.widget.e0.t(kaVar, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddSubWidget$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
