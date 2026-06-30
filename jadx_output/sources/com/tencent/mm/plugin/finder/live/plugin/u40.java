package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class u40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f114520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f114521e;

    public u40(com.tencent.mm.plugin.finder.live.plugin.z40 z40Var, cm2.d0 d0Var) {
        this.f114520d = z40Var;
        this.f114521e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.z40 z40Var = this.f114520d;
        kotlinx.coroutines.l.d(z40Var.f115282e.f272475i, null, null, new com.tencent.mm.plugin.finder.live.plugin.t40(this.f114521e, z40Var, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePlayListBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
