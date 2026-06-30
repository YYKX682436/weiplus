package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i30 f114863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo0.c f114864e;

    public w20(com.tencent.mm.plugin.finder.live.plugin.i30 i30Var, qo0.c cVar) {
        this.f114863d = i30Var;
        this.f114864e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.i30 i30Var = this.f114863d;
        dk2.xf W0 = i30Var.W0();
        if (W0 != null) {
            ((dk2.r4) W0).T(java.lang.System.currentTimeMillis(), new com.tencent.mm.plugin.finder.live.plugin.v20(i30Var, this.f114864e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGiftPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
