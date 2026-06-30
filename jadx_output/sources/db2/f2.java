package db2;

/* loaded from: classes.dex */
public final class f2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(java.lang.String query, java.lang.String requestId, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var, int i18, int i19) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        r45.gh2 gh2Var = new r45.gh2();
        gh2Var.set(1, db2.t4.f228171a.a(11576));
        gh2Var.set(2, query);
        gh2Var.set(3, gVar);
        gh2Var.set(5, java.lang.Integer.valueOf(i17));
        gh2Var.set(4, requestId);
        gh2Var.set(7, java.lang.Integer.valueOf(i19));
        gh2Var.set(6, java.lang.Integer.valueOf(i18));
        r45.hh2 hh2Var = new r45.hh2();
        hh2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) hh2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = gh2Var;
        lVar.f70665b = hh2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermixsearch";
        lVar.f70667d = 11576;
        p(lVar.a());
    }
}
