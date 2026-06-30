package qb2;

/* loaded from: classes8.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public qb2.c1 f361178d = qb2.c1.f361184g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f361179e;

    public b1(qb2.r1 r1Var) {
        this.f361179e = r1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        if (gm0.j1.a()) {
            qb2.r1 r1Var = this.f361179e;
            r1Var.f361289j = false;
            com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", "[pendingTask] dispatch delay task. size=" + r1Var.f361284e.size());
            java.util.LinkedList<qb2.z0> linkedList = new java.util.LinkedList(r1Var.f361284e);
            r1Var.f361284e.clear();
            qb2.u1.f361300a.a(1);
            r1Var.getClass();
            java.util.ArrayList<qb2.z0> arrayList = new java.util.ArrayList();
            for (qb2.z0 z0Var : linkedList) {
                java.lang.String str2 = (java.lang.String) z0Var.f361319b.get(".sysmsg.content.task_id");
                if (str2 == null) {
                    str2 = "";
                }
                java.util.Map map = z0Var.f361319b;
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.content.action_type"), 0);
                if (D1 == 3) {
                    kz5.h0.B(arrayList, new qb2.p1(str2));
                    arrayList.add(z0Var);
                } else if (D1 == 2) {
                    boolean B = kz5.h0.B(arrayList, new qb2.q1(str2));
                    qb2.z0 z0Var2 = new qb2.z0(z0Var.f361318a, new java.util.HashMap(map), z0Var.f361320c, z0Var.f361321d);
                    if (B) {
                        z0Var2.f361319b.put(".sysmsg.content.action_type", java.lang.String.valueOf(1));
                        arrayList.add(z0Var2);
                    }
                    arrayList.add(z0Var);
                } else if (D1 == 1) {
                    arrayList.add(z0Var);
                }
            }
            for (qb2.z0 z0Var3 : arrayList) {
                qb2.c1 c1Var = this.f361178d;
                if (c1Var == qb2.c1.f361182e && z0Var3.f361321d == 1) {
                    str = "1";
                } else {
                    qb2.c1 c1Var2 = qb2.c1.f361183f;
                    str = (c1Var == c1Var2 && z0Var3.f361321d == 1) ? "2" : (c1Var == qb2.c1.f361181d && z0Var3.f361321d == 1) ? "3" : (c1Var == c1Var2 && z0Var3.f361321d == 2) ? "5" : "0";
                }
                r1Var.k(z0Var3.f361318a, z0Var3.f361319b, z0Var3.f361320c, str);
            }
        }
    }
}
