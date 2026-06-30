package gx0;

/* loaded from: classes5.dex */
public final class o3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f276785d;

    public o3(gx0.y3 y3Var) {
        this.f276785d = y3Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ex0.v vVar;
        ex0.v vVar2;
        ex0.v vVar3;
        int itemId = menuItem.getItemId();
        gx0.y3 y3Var = this.f276785d;
        if (itemId == 1) {
            ex0.a0 A7 = y3Var.A7();
            com.tencent.maas.model.time.MJTime c17 = (A7 == null || (vVar = A7.f257097g) == null) ? null : vVar.c();
            if (c17 == null) {
                return;
            }
            java.lang.Object V6 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.V6(y3Var, "key_dest_segment_id", null, 2, null);
            ex0.f n76 = y3Var.n7(V6 instanceof com.tencent.maas.base.MJID ? (com.tencent.maas.base.MJID) V6 : null);
            if (n76 == null) {
                return;
            }
            com.tencent.maas.model.time.MJTime add = n76.k().add(n76.j());
            kotlin.jvm.internal.o.f(add, "add(...)");
            n76.z(add);
            n76.y(c17);
            kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.w2(y3Var, null), 3, null);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ex0.a0 A72 = y3Var.A7();
        com.tencent.maas.model.time.MJTime c18 = (A72 == null || (vVar3 = A72.f257097g) == null) ? null : vVar3.c();
        if (c18 == null) {
            return;
        }
        java.lang.Object V62 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.V6(y3Var, "key_dest_segment_id", null, 2, null);
        ex0.f n77 = y3Var.n7(V62 instanceof com.tencent.maas.base.MJID ? (com.tencent.maas.base.MJID) V62 : null);
        if (n77 == null) {
            return;
        }
        ex0.a0 A73 = y3Var.A7();
        ex0.r f17 = (A73 == null || (vVar2 = A73.f257097g) == null) ? null : vVar2.f(y3Var.z7().h7());
        if (f17 == null) {
            return;
        }
        com.tencent.maas.model.time.MJTime add2 = n77.k().add(n77.j());
        kotlin.jvm.internal.o.f(add2, "add(...)");
        n77.z(add2);
        n77.y(c18);
        com.tencent.maas.model.time.MJTime endTime = f17.l().getEndTime();
        kotlin.jvm.internal.o.f(endTime, "getEndTime(...)");
        n77.y(endTime);
        n77.z(f17.i());
        kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.v2(y3Var, null), 3, null);
    }
}
