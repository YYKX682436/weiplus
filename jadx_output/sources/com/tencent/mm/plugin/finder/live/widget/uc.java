package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class uc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yc f119968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119969e;

    public uc(com.tencent.mm.plugin.finder.live.widget.yc ycVar, android.view.View view) {
        this.f119968d = ycVar;
        this.f119969e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$showWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.yc ycVar = this.f119968d;
        ycVar.f120434c.dismiss();
        kotlinx.coroutines.r2 r2Var = ycVar.f120438g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f119969e.performClick();
        ycVar.f120432a.f119622d.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$showWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
