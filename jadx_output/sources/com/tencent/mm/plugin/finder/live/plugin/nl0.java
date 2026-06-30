package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nl0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.pl0 f113647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.z f113648e;

    public nl0(com.tencent.mm.plugin.finder.live.plugin.pl0 pl0Var, cm2.z zVar) {
        this.f113647d = pl0Var;
        this.f113648e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.pl0 pl0Var = this.f113647d;
        java.lang.String str = pl0Var.f113912i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, data:");
        cm2.z zVar = this.f113648e;
        sb6.append(pm0.b0.b(zVar.f43409v));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        bf2.c.c(bf2.c.f19598a, pl0Var.f113908e, 2, 3, null, 0, null, 0, 0, null, 0, 1016, null);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(zVar.f43385d));
            f52Var.set(0, 3);
            f52Var.set(2, new com.tencent.mm.protobuf.g(zVar.f43409v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
