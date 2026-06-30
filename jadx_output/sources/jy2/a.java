package jy2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy2.b f302485d;

    public a(jy2.b bVar) {
        this.f302485d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/FinderLiveAnchorVoteEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jy2.b bVar = this.f302485d;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = bVar.f302488f;
        if (lVar.x0()) {
            com.tencent.mm.plugin.finder.live.plugin.l.q1(lVar, bVar.f302489g, null, 2, null);
        } else if (((mm2.c1) lVar.S0().a(mm2.c1.class)).f328784b6 != null) {
            qo0.c.a(bVar.f302487e, qo0.b.f365419u2, null, 2, null);
        } else {
            mm2.e1 e1Var = (mm2.e1) lVar.S0().a(mm2.e1.class);
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context = bVar.f302486d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r4Var.k1(context, e1Var.f328988r.getLong(0), e1Var.f328983m, e1Var.f328992v, ((mm2.c1) lVar.S0().a(mm2.c1.class)).f328852o);
        }
        ll2.e.b(ll2.e.f319133a, bVar.f302492m, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/FinderLiveAnchorVoteEntranceWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
