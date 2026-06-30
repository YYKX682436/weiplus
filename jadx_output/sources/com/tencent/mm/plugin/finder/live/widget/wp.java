package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xp f120226d;

    public wp(com.tencent.mm.plugin.finder.live.widget.xp xpVar) {
        this.f120226d = xpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMultiStreamBtnWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rk2.r.b(rk2.r.f396485a, 3, null, null, 6, null);
        com.tencent.mm.plugin.finder.live.widget.xp xpVar = this.f120226d;
        ((mm2.h7) xpVar.f120363e.P0(mm2.h7.class)).f329114f.postValue(java.lang.Boolean.TRUE);
        ll2.e.b(ll2.e.f319133a, xpVar.f120365g, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMultiStreamBtnWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
