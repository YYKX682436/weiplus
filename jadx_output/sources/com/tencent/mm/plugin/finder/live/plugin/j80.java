package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.k80 f113069d;

    public j80(com.tencent.mm.plugin.finder.live.plugin.k80 k80Var) {
        this.f113069d = k80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRehearsalBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.k80 k80Var = this.f113069d;
        k80Var.K0(8);
        qo0.c.a(k80Var.f113204p, qo0.b.f365362h5, null, 2, null);
        com.tencent.mm.plugin.finder.live.plugin.k80.f113203r.add(java.lang.Long.valueOf(((mm2.e1) k80Var.S0().a(mm2.e1.class)).f328988r.getLong(0)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRehearsalBubblePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
