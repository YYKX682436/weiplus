package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class iq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jq f113005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.v f113006e;

    public iq(com.tencent.mm.plugin.finder.live.plugin.jq jqVar, cm2.v vVar) {
        this.f113005d = jqVar;
        this.f113006e = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var;
        xu2.u uVar;
        xu2.v vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.jq jqVar = this.f113005d;
        yz5.l lVar = jqVar.f113158g;
        cm2.v vVar2 = this.f113006e;
        if (lVar != null) {
            lVar.invoke(vVar2);
        }
        bf2.c.c(bf2.c.f19598a, jqVar.f113156e, 5, 8, vVar2.A, 0, null, 0, 0, null, 0, 1008, null);
        if (((mm2.c1) jqVar.f113156e.a(mm2.c1.class)).M7()) {
            qo0.c cVar = jqVar.f113157f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
            if (k0Var != null && (uVar = (xu2.u) k0Var.getPlugin(xu2.u.class)) != null && (vVar = uVar.f457232r) != null) {
                vVar.b();
            }
        }
        if (jqVar.f113155d.getResources().getConfiguration().orientation == 2) {
            qo0.c cVar2 = jqVar.f113157f;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = cVar2 instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar2 : null;
            if (k0Var2 != null && (r60Var = (com.tencent.mm.plugin.finder.live.plugin.r60) k0Var2.getPlugin(com.tencent.mm.plugin.finder.live.plugin.r60.class)) != null) {
                java.lang.String str = jqVar.f113161m;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray(jqVar.f113162n, vVar2.f43401v.toByteArray());
                r60Var.p1(str, bundle);
            }
        } else {
            com.tencent.mm.plugin.finder.live.plugin.jq.f113154p.a(jqVar.f113155d, vVar2.f43401v);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveH5HalfBubble$refreshView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
