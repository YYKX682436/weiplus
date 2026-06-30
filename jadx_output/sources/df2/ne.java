package df2;

/* loaded from: classes3.dex */
public final class ne extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ym1 f230851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.qe f230852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(r45.ym1 ym1Var, df2.qe qeVar) {
        super(0);
        this.f230851d = ym1Var;
        this.f230852e = qeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ym1 ym1Var = this.f230851d;
        int size = ym1Var.getList(1).size();
        df2.qe qeVar = this.f230852e;
        if (size > 0) {
            dk2.y4 y4Var = (dk2.y4) ((mm2.c1) qeVar.business(mm2.c1.class)).f328837l4.peek();
            java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = ((mm2.c1) qeVar.business(mm2.c1.class)).f328837l4;
            java.util.LinkedList<r45.vm1> list = ym1Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getButton_animation_infos(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.vm1 vm1Var : list) {
                kotlin.jvm.internal.o.d(vm1Var);
                arrayList.add(new dk2.y4(vm1Var));
            }
            priorityBlockingQueue.addAll(arrayList);
            java.util.LinkedList list2 = ym1Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getButton_animation_infos(...)");
            boolean z17 = !kotlin.jvm.internal.o.b(y4Var, ((mm2.c1) qeVar.business(mm2.c1.class)).f328837l4.peek());
            com.tencent.mm.plugin.finder.live.util.y.o(qeVar, kotlinx.coroutines.q1.f310570c, null, new df2.ge(list2, qeVar, null), 2, null);
            kotlinx.coroutines.r2 r2Var = qeVar.f231159n;
            if (((r2Var == null || ((kotlinx.coroutines.a) r2Var).a()) ? false : true) || qeVar.f231159n == null) {
                qeVar.e7();
            } else if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needRestartJob, ");
                kotlinx.coroutines.f1 f1Var = qeVar.f231160o;
                sb6.append(f1Var != null ? java.lang.Integer.valueOf(f1Var.hashCode()) : null);
                java.lang.String sb7 = sb6.toString();
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("LiveButtonChangeController", sb7, null);
                kotlinx.coroutines.f1 f1Var2 = qeVar.f231160o;
                if (f1Var2 != null) {
                    kotlinx.coroutines.p2.a(f1Var2, null, 1, null);
                }
            }
        }
        if (!kotlin.jvm.internal.o.b(ym1Var.getString(2), ((mm2.c1) qeVar.business(mm2.c1.class)).f328849n4)) {
            ((mm2.c1) qeVar.business(mm2.c1.class)).f328849n4 = ym1Var.getString(2);
            com.tencent.mm.plugin.finder.live.plugin.g b76 = qeVar.b7();
            if ((b76 == null || b76.x1()) ? false : true) {
                qeVar.d7();
            }
        }
        if (!kotlin.jvm.internal.o.b(ym1Var.getString(4), ((mm2.c1) qeVar.business(mm2.c1.class)).f328855o4)) {
            ((mm2.c1) qeVar.business(mm2.c1.class)).f328855o4 = ym1Var.getString(4);
            com.tencent.mm.plugin.finder.live.plugin.g b77 = qeVar.b7();
            if (b77 != null && b77.x1()) {
                qeVar.d7();
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.g b78 = qeVar.b7();
        boolean y17 = b78 != null ? b78.y1() : false;
        if (!kotlin.jvm.internal.o.b(ym1Var.getString(5), ((mm2.c1) qeVar.business(mm2.c1.class)).f328863p4) || y17 != qeVar.f231158m) {
            ((mm2.c1) qeVar.business(mm2.c1.class)).f328863p4 = ym1Var.getString(5);
            qeVar.f231158m = y17;
            if (y17) {
                qeVar.d7();
            }
        }
        if (ym1Var.getList(0).size() > 0) {
            java.util.LinkedList list3 = ym1Var.getList(0);
            kotlin.jvm.internal.o.f(list3, "getButton_infos(...)");
            qeVar.Z6(list3);
        }
        if (ym1Var.getList(6).size() > 0) {
            java.util.LinkedList list4 = ym1Var.getList(6);
            kotlin.jvm.internal.o.f(list4, "getGlobal_button_infos(...)");
            java.util.Iterator it = list4.iterator();
            boolean z18 = false;
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) dk2.ef.f233410y.get(java.lang.Integer.valueOf(((r45.xm1) it.next()).getInteger(0)));
                if (str == null || kotlin.jvm.internal.o.b(str, "")) {
                    z18 = true;
                }
            }
            if (z18) {
                com.tencent.mm.plugin.finder.live.util.y.o(qeVar, kotlinx.coroutines.q1.f310570c, null, new df2.je(list4, qeVar, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
