package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f135219d = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135219d;
        x91.h hVar = sxVar.f135941w;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Stopped;
        }
        android.app.Activity context = sxVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("view_id", "projection_type");
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(sxVar.f135942x));
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
        lVarArr[3] = new jz5.l("projection_time", java.lang.Long.valueOf(c01.id.c() - sxVar.E));
        lVarArr[4] = new jz5.l("break_source", 1);
        ((cy1.a) rVar).Ej("break_projection", kz5.c1.k(lVarArr), 25496);
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.vw(sxVar.f135941w, sxVar, false));
        sxVar.f135941w = null;
        sxVar.f135942x = 0L;
        return jz5.f0.f302826a;
    }
}
