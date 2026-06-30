package qg5;

/* loaded from: classes8.dex */
public final class i implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg5.p f363012d;

    public i(qg5.p pVar) {
        this.f363012d = pVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.storage.z3 z3Var;
        ct.k3 k3Var = (ct.k3) ((jz5.n) this.f363012d.f363125g).getValue();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f363012d.b());
        qg5.e3 e3Var = (qg5.e3) k3Var;
        if (valueOf == null) {
            e3Var.getClass();
            return;
        }
        e3Var.getClass();
        qg5.r rVar = (qg5.r) ((qg5.l0) ((ct.q2) i95.n0.c(ct.q2.class))).f363058t.get();
        java.util.List list = rVar == null ? kz5.p0.f313996d : rVar.f363152c;
        qg5.r rVar2 = (qg5.r) ((qg5.l0) ((ct.q2) i95.n0.c(ct.q2.class))).f363058t.get();
        if (rVar2 == null || (z3Var = rVar2.f363151b) == null) {
            z3Var = new com.tencent.mm.storage.z3();
        }
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.d(d17);
        java.util.Map mj6 = e3Var.mj(d17, "journey_analyze");
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("share_type", 8);
        qg5.l0 l0Var = (qg5.l0) ((ct.q2) i95.n0.c(ct.q2.class));
        synchronized (l0Var.f363060v) {
            if (l0Var.f363061w == null) {
                qg5.r rVar3 = (qg5.r) l0Var.f363058t.get();
                java.lang.Iterable iterable = rVar3 == null ? kz5.p0.f313996d : rVar3.f363152c;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.f9 f9Var = ((c01.ob) it.next()).f37373a;
                    if (f9Var != null) {
                        arrayList.add(f9Var);
                    }
                }
                l0Var.f363061w = kz5.n0.g0(arrayList, "#", null, null, 0, null, tb5.h0.f417053d, 30, null);
            }
        }
        java.lang.String str = l0Var.f363061w;
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("selected_msg_list", str);
        lVarArr[2] = new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(list.size()));
        java.util.Map m17 = kz5.c1.m(mj6, kz5.c1.k(lVarArr));
        e3Var.sj("journey_analyze", m17);
        e3Var.rj("journey_analyze", kz5.b1.e(new jz5.l("yuanbao_msg_analytics_view_type", valueOf.booleanValue() ? "2" : "1")));
        ((cy1.a) e3Var.ij()).Hj("multi_select_record_preview", "view_exp", kz5.c1.m(m17, kz5.b1.e(new jz5.l("yuanbao_msg_analytics_view_type", java.lang.Integer.valueOf(valueOf.booleanValue() ? 2 : 1)))), 35480);
    }
}
