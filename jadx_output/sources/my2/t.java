package my2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f332762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(my2.u uVar) {
        super(0);
        this.f332762d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 c17;
        my2.k0 k0Var;
        my2.k0 k0Var2;
        android.view.ViewGroup viewGroup;
        com.tencent.mars.xlog.Log.i(this.f332762d.f332765f, "updateStatus");
        if (((mm2.c1) this.f332762d.f332763d.a(mm2.c1.class)).f328789c6) {
            my2.u uVar = this.f332762d;
            r45.me2 me2Var = ((mm2.c1) uVar.f332763d.a(mm2.c1.class)).f328784b6;
            if (me2Var == null) {
                com.tencent.mars.xlog.Log.i(uVar.f332765f, "update votingInfo is null");
                qo0.c.a(uVar.f332764e, qo0.b.f365439y2, null, 2, null);
            } else {
                com.tencent.mm.plugin.finder.live.view.k0 c18 = uVar.c();
                if (((c18 == null || (k0Var2 = (my2.k0) c18.getPlugin(my2.k0.class)) == null || (viewGroup = k0Var2.f365323d) == null || viewGroup.getVisibility() != 0) ? false : true) && (c17 = uVar.c()) != null && (k0Var = (my2.k0) c17.getPlugin(my2.k0.class)) != null) {
                    k0Var.u1();
                }
                if (me2Var.getInteger(3) < 0 || !(me2Var.getInteger(4) == 1 || me2Var.getInteger(4) == 1)) {
                    my2.b bVar = uVar.f332766g;
                    if (bVar != null) {
                        ((my2.y) bVar).F(new my2.l(uVar));
                    }
                    java.lang.String string = me2Var.getString(5);
                    com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC;
                    if (kotlin.jvm.internal.o.b(string, c19.v(u3Var, "")) || !(me2Var.getInteger(11) == 0 || uVar.f())) {
                        r45.me2 me2Var2 = ((mm2.c1) uVar.f332763d.a(mm2.c1.class)).f328784b6;
                        int integer = me2Var2 != null ? me2Var2.getInteger(9) : 0;
                        ((ku5.t0) ku5.t0.f312615d).A(uVar.f332767h);
                        ((ku5.t0) ku5.t0.f312615d).l(uVar.f332768i, integer * 1000, uVar.f332767h);
                        com.tencent.mars.xlog.Log.i(uVar.f332765f, "voteInfo clear task execute");
                    } else {
                        com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
                        java.lang.String string2 = me2Var.getString(5);
                        c27.x(u3Var, string2 != null ? string2 : "");
                        com.tencent.mm.plugin.finder.live.view.k0 c28 = uVar.c();
                        if (c28 != null) {
                            com.tencent.mm.plugin.finder.live.util.y.n(c28, null, null, new my2.n(uVar, null), 3, null);
                        }
                    }
                    ((mm2.c1) uVar.f332763d.a(mm2.c1.class)).f328789c6 = false;
                } else {
                    my2.b bVar2 = uVar.f332766g;
                    if (bVar2 != null) {
                        ((my2.y) bVar2).G(new my2.k(uVar));
                    }
                    qo0.c.a(uVar.f332764e, qo0.b.f365433x2, null, 2, null);
                    ((mm2.c1) uVar.f332763d.a(mm2.c1.class)).f328789c6 = true;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
