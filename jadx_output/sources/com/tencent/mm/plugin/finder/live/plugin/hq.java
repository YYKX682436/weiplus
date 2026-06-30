package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jq f112860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.v f112861e;

    public hq(com.tencent.mm.plugin.finder.live.plugin.jq jqVar, cm2.v vVar) {
        this.f112860d = jqVar;
        this.f112861e = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.jq jqVar = this.f112860d;
        java.lang.String str = jqVar.f113160i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, url:");
        cm2.v vVar = this.f112861e;
        sb6.append(vVar.A);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        bf2.c.c(bf2.c.f19598a, jqVar.f113156e, 2, 8, vVar.A, 0, null, 0, 0, null, 0, 1008, null);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(vVar.f43385d));
            f52Var.set(0, 8);
            f52Var.set(2, new com.tencent.mm.protobuf.g(vVar.f43401v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
