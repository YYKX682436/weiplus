package f53;

/* loaded from: classes15.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f53.n f259650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView f259651b;

    public g(com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView, f53.n nVar) {
        this.f259651b = atSomeoneView;
        this.f259650a = nVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeoneView", "do GetRemindUserListResponse errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        if (fVar2.f70615a == 0 && fVar2.f70616b == 0 && (fVar = fVar2.f70618d) != null) {
            ((java.util.LinkedList) this.f259651b.f139979l2).addAll(((o33.b) fVar).f342726d);
            ((java.util.LinkedList) this.f259651b.f139980m2).addAll(((o33.b) fVar2.f70618d).f342727e);
            if (((o33.b) fVar2.f70618d).f342729g) {
                f53.o oVar = f53.p.f259680d;
                if (oVar.a().size() != 0) {
                    com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView = this.f259651b;
                    atSomeoneView.o1(atSomeoneView.f139979l2, oVar.a());
                    f53.n nVar = this.f259650a;
                    if (nVar != null) {
                        ((f53.c) nVar).a(true);
                    }
                } else {
                    this.f259651b.f139982o2.putByteArray("context", ((o33.b) fVar2.f70618d).f342728f.g());
                    this.f259651b.m1(this.f259650a);
                }
            } else {
                com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView2 = this.f259651b;
                atSomeoneView2.o1(atSomeoneView2.f139979l2, atSomeoneView2.f139980m2);
                java.util.List normalFriends = this.f259651b.f139980m2;
                kotlin.jvm.internal.o.g(normalFriends, "normalFriends");
                if (f53.p.f259681e == null) {
                    synchronized (f53.p.class) {
                        if (f53.p.f259681e == null) {
                            f53.p.f259681e = new f53.p(null);
                        }
                    }
                }
                f53.p pVar = f53.p.f259681e;
                if (pVar == null) {
                    kotlin.jvm.internal.o.o("instance");
                    throw null;
                }
                pVar.f259682a = gm0.j1.b().h();
                f53.p pVar2 = f53.p.f259681e;
                if (pVar2 == null) {
                    kotlin.jvm.internal.o.o("instance");
                    throw null;
                }
                pVar2.f259683b = normalFriends;
                f53.p pVar3 = f53.p.f259681e;
                if (pVar3 == null) {
                    kotlin.jvm.internal.o.o("instance");
                    throw null;
                }
                pVar3.f259684c = java.lang.System.currentTimeMillis();
                f53.n nVar2 = this.f259650a;
                if (nVar2 != null) {
                    ((f53.c) nVar2).a(true);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AtSomeoneView", "cgi request fail");
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView3 = this.f259651b;
            atSomeoneView3.o1(atSomeoneView3.f139979l2, f53.p.f259680d.a());
        }
        return null;
    }
}
