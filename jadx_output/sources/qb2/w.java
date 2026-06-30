package qb2;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f361302d;

    public w(java.util.List list) {
        this.f361302d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        java.util.List<qb2.t> list = this.f361302d;
        java.util.ArrayList<r45.lz0> arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (qb2.t tVar : list) {
            r45.lz0 lz0Var = new r45.lz0();
            lz0Var.set(0, tVar.field_talker);
            lz0Var.set(1, tVar.field_sessionId);
            arrayList.add(lz0Var);
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127788k9).getValue()).r()).booleanValue()) {
            new db2.p4(new java.util.LinkedList(arrayList)).l();
            return;
        }
        for (r45.lz0 lz0Var2 : arrayList) {
            if (com.tencent.mm.storage.z3.V3(lz0Var2.getString(0))) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                string = com.tencent.mm.plugin.finder.service.m4.f126148a.h(lz0Var2.getString(0));
            } else {
                string = lz0Var2.getString(0);
            }
            zy2.dc fj6 = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).fj(string);
            if (!(fj6 instanceof ya2.b2)) {
                fj6 = null;
            }
            ya2.b2 b2Var = fj6 != null ? (ya2.b2) fj6 : null;
            if (b2Var != null) {
                r45.zl1 zl1Var = new r45.zl1();
                zl1Var.set(0, new java.util.LinkedList());
                java.util.LinkedList list2 = zl1Var.getList(0);
                r45.yl1 yl1Var = new r45.yl1();
                yl1Var.set(0, 2);
                yl1Var.set(2, 1);
                list2.add(yl1Var);
                java.util.LinkedList list3 = zl1Var.getList(0);
                r45.yl1 yl1Var2 = new r45.yl1();
                yl1Var2.set(0, 4);
                yl1Var2.set(2, 1);
                yl1Var2.set(4, "测试");
                list3.add(yl1Var2);
                b2Var.field_badgeInfoList = zl1Var;
                b2Var.field_rewardTotalAmountInWecoin = 2000L;
                b2Var.field_interactionCount = 12L;
                ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).oj(b2Var);
            }
        }
    }
}
