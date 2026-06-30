package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class iw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f134769d;

    public iw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f134769d = sxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f134769d;
        android.app.Activity context = sxVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("view_id", "projection_break");
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(sxVar.f135943y));
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[3] = new jz5.l("projection_source", java.lang.Integer.valueOf(sxVar.D));
        lVarArr[4] = new jz5.l("projection_time", java.lang.Long.valueOf(c01.id.c() - sxVar.E));
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "breakDevice: " + sxVar.f135941w);
        x91.h hVar = sxVar.f135941w;
        if (hVar == null) {
            sxVar.m1();
        } else {
            hVar.e(new com.tencent.mm.plugin.finder.viewmodel.component.lx(sxVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
