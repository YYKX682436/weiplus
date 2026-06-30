package db2;

/* loaded from: classes.dex */
public final class q4 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(java.lang.String query, int i17, java.lang.String requestId, java.util.LinkedList tags, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        kotlin.jvm.internal.o.g(tags, "tags");
        r45.nu2 nu2Var = new r45.nu2();
        nu2Var.set(1, db2.t4.f228171a.b(10834, qt2Var));
        nu2Var.set(2, query);
        nu2Var.set(3, gVar);
        nu2Var.set(4, java.lang.Integer.valueOf(i17));
        nu2Var.set(5, requestId);
        nu2Var.set(6, tags);
        r45.ou2 ou2Var = new r45.ou2();
        ou2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ou2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = nu2Var;
        lVar.f70665b = ou2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersearchinteraction";
        lVar.f70667d = 10834;
        p(lVar.a());
    }
}
