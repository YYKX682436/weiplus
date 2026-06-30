package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vy implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dz f120109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120110e;

    public vy(com.tencent.mm.plugin.finder.live.widget.dz dzVar, android.content.Context context) {
        this.f120109d = dzVar;
        this.f120110e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.dz dzVar = this.f120109d;
        if (dzVar.f118177p) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = dzVar.f118180s;
            if (lVar != null) {
                android.content.Context context = this.f120110e;
                ke2.u uVar = new ke2.u(((mm2.e1) lVar.P0(mm2.e1.class)).f328983m, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), com.tencent.mm.protobuf.g.b(((mm2.e1) lVar.P0(mm2.e1.class)).f328985o), ((mm2.e1) lVar.P0(mm2.e1.class)).f328992v, 0, null, false, 112, null);
                az2.j.u(uVar, context, null, 0L, 6, null);
                uVar.l().K(new com.tencent.mm.plugin.finder.live.widget.uy(context, dzVar));
            }
        } else {
            com.tencent.mm.plugin.finder.live.widget.dz.i(dzVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
