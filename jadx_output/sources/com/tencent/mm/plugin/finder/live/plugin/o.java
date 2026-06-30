package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r f113687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.h0 f113688e;

    public o(com.tencent.mm.plugin.finder.live.plugin.r rVar, cm2.h0 h0Var) {
        this.f113687d = rVar;
        this.f113688e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.r rVar = this.f113687d;
        java.lang.String str = rVar.f114065i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close promote, id:");
        cm2.h0 h0Var = this.f113688e;
        sb6.append(h0Var.f43348v.getLong(0));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        bf2.c cVar = bf2.c.f19598a;
        gk2.e eVar = rVar.f114061e;
        kotlin.jvm.internal.o.d(eVar);
        bf2.c.c(cVar, eVar, 2, 4, pm0.v.u(h0Var.f43349w), h0Var.D, null, 0, 0, null, 0, 992, null);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.f327439o;
        java.lang.String u17 = pm0.v.u(h0Var.f43349w);
        r45.n3 n3Var = h0Var.f43350x;
        java.lang.String str2 = (n3Var == null || (string = n3Var.getString(3)) == null) ? "" : string;
        java.lang.String u18 = pm0.v.u(h0Var.f43349w);
        java.lang.String str3 = h0Var.C;
        ml2.r0.Dj(r0Var, f4Var, null, u17, str2, u18, str3 == null ? "" : str3, h0Var.D, h0Var.E, null, null, null, null, false, null, 16128, null);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(4, java.lang.Long.valueOf(h0Var.f43385d));
            f52Var.set(0, 4);
            f52Var.set(2, new com.tencent.mm.protobuf.g(h0Var.f43348v.toByteArray()));
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdBubble$refreshView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
