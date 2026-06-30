package pk2;

/* loaded from: classes3.dex */
public final class wa implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.xa f356337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356338b;

    public wa(pk2.xa xaVar, pk2.o9 o9Var) {
        this.f356337a = xaVar;
        this.f356338b = o9Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mars.xlog.Log.i("VisitorP2PSwitchOption", "p2p switch check=" + z17);
        r45.ll1 ll1Var = new r45.ll1();
        ll1Var.set(1, db2.t4.f228171a.a(8652));
        ll1Var.set(2, 1);
        java.util.LinkedList list = ll1Var.getList(3);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 1);
        r45.pl1 pl1Var = new r45.pl1();
        pl1Var.set(0, java.lang.Boolean.valueOf(!z17));
        pl1Var.set(1, java.lang.Integer.valueOf(c01.id.e()));
        pk2.xa xaVar = this.f356337a;
        pl1Var.set(2, java.lang.Long.valueOf(((mm2.e1) xaVar.f364427a.c(mm2.e1.class)).f328983m));
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(pl1Var.toByteArray()));
        list.add(hx0Var);
        pq5.g l17 = ll1Var.d().l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new pk2.va(this.f356338b, xaVar, z17));
        qk2.f.f(xaVar, false, 1, null);
    }
}
