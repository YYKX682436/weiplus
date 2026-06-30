package db2;

/* loaded from: classes2.dex */
public final class j0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j17, java.lang.String str, java.lang.String objectNonceId, int i17, int i18, r45.qt2 qt2Var, java.lang.Boolean bool, java.util.List list) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.c31 c31Var = new r45.c31();
        c31Var.set(1, java.lang.Long.valueOf(j17));
        c31Var.set(4, objectNonceId);
        c31Var.set(2, java.lang.Integer.valueOf(i17));
        c31Var.set(3, java.lang.Integer.valueOf(i18));
        c31Var.set(5, db2.t4.f228171a.b(3912, qt2Var));
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                c31Var.getList(9).add((r45.qw4) it.next());
            }
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            c31Var.set(7, 2);
        }
        int integer = qt2Var != null ? qt2Var.getInteger(5) : 0;
        c31Var.set(6, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, integer));
        db2.t4.f228171a.h((r45.kv0) c31Var.getCustom(5), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(integer), java.lang.Long.valueOf(j17), str)));
        lVar.f70664a = c31Var;
        r45.d31 d31Var = new r45.d31();
        d31Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d31Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = d31Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderfeedback";
        lVar.f70667d = 3912;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderFeedBack", "[CgiFinderFeedBack] feedId=" + j17 + " feedbackType=" + i17 + " subType=" + i18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d31 resp = (r45.d31) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
    }
}
