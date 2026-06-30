package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.az f115389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.x f115390e;

    public zy(com.tencent.mm.plugin.finder.live.plugin.az azVar, cm2.x xVar) {
        this.f115389d = azVar;
        this.f115390e = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.az azVar = this.f115389d;
        java.lang.String str = azVar.f111951i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, url:");
        cm2.x xVar = this.f115390e;
        sb6.append(xVar.f43407v.getString(3));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        bf2.c.c(bf2.c.f19598a, azVar.f111947e, 2, 2, null, 0, null, 0, 0, null, 0, 1016, null);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(xVar.f43385d));
            f52Var.set(0, 2);
            f52Var.set(2, new com.tencent.mm.protobuf.g(xVar.f43407v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveMpArticleBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
