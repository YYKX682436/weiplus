package my2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.me2 f332739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my2.u f332740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.me2 me2Var, my2.u uVar) {
        super(0);
        this.f332739d = me2Var;
        this.f332740e = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        if (this.f332739d.getInteger(3) <= 0 || this.f332739d.getInteger(4) == 3 || this.f332739d.getInteger(4) == 4) {
            boolean z18 = false;
            if (this.f332740e.f()) {
                if (this.f332739d.getInteger(9) > 0) {
                    qo0.c.a(this.f332740e.f332764e, qo0.b.f365433x2, null, 2, null);
                    my2.u uVar = this.f332740e;
                    my2.b bVar = uVar.f332766g;
                    if (bVar != null) {
                        ((my2.y) bVar).F(new my2.g(uVar));
                    }
                    java.lang.String string = this.f332739d.getString(5);
                    com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC;
                    if (!kotlin.jvm.internal.o.b(string, c17.v(u3Var, ""))) {
                        com.tencent.mm.plugin.finder.live.view.k0 c18 = this.f332740e.c();
                        if (c18 != null) {
                            com.tencent.mm.plugin.finder.live.util.y.n(c18, null, null, new my2.i(this.f332740e, null), 3, null);
                        }
                        com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
                        java.lang.String string2 = this.f332739d.getString(5);
                        c19.x(u3Var, string2 != null ? string2 : "");
                    }
                    r45.me2 me2Var = ((mm2.c1) this.f332740e.f332763d.a(mm2.c1.class)).f328784b6;
                    int integer = me2Var != null ? me2Var.getInteger(9) : ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3781j2).getValue()).r()).intValue();
                    ((ku5.t0) ku5.t0.f312615d).A(this.f332740e.f332767h);
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    my2.u uVar2 = this.f332740e;
                    ((ku5.t0) u0Var).l(uVar2.f332768i, integer * 1000, uVar2.f332767h);
                } else {
                    my2.u uVar3 = this.f332740e;
                    uVar3.getClass();
                    qo0.c.a(uVar3.f332764e, qo0.b.f365439y2, null, 2, null);
                    mm2.c1 c1Var = (mm2.c1) uVar3.f332763d.a(mm2.c1.class);
                    c1Var.f328784b6 = null;
                    c1Var.f328789c6 = false;
                    c1Var.f328794d6 = false;
                }
                ((mm2.c1) this.f332740e.f332763d.a(mm2.c1.class)).f328789c6 = false;
            } else {
                java.lang.String str = this.f332740e.f332765f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("visitor resume show vote, choiceListHaveChoice: ");
                java.util.LinkedList list = this.f332739d.getList(2);
                kotlin.jvm.internal.o.f(list, "getChoice_list(...)");
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((r45.l30) it.next()).getInteger(2) == 1) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (!kotlin.jvm.internal.o.b(this.f332739d.getString(5), gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC, ""))) {
                    java.util.LinkedList list2 = this.f332739d.getList(2);
                    kotlin.jvm.internal.o.f(list2, "getChoice_list(...)");
                    if (!list2.isEmpty()) {
                        java.util.Iterator it6 = list2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (((r45.l30) it6.next()).getInteger(2) == 1) {
                                z18 = true;
                                break;
                            }
                        }
                    }
                    if (z18) {
                        com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_AUTO_SHOW_VOTE_STRING_SYNC;
                        java.lang.String string3 = this.f332739d.getString(5);
                        c27.x(u3Var2, string3 != null ? string3 : "");
                        my2.u uVar4 = this.f332740e;
                        uVar4.f332769m = true;
                        com.tencent.mars.xlog.Log.i(uVar4.f332765f, "visitor resume show card");
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
