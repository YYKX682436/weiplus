package fv2;

/* loaded from: classes10.dex */
public final class b extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final jv2.i f266972m;

    public b(java.lang.String userName, java.lang.String entity_id, long j17, jv2.i rootComment, boolean z17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        kotlin.jvm.internal.o.g(rootComment, "rootComment");
        this.f266972m = rootComment;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.y03 y03Var = new r45.y03();
        y03Var.f390681q = userName;
        y03Var.f390673f = entity_id;
        y03Var.f390671d = db2.t4.f228171a.a(6953);
        y03Var.f390675h = j17;
        y03Var.f390682r = rootComment.f302223d.u0().getLastBuffer();
        y03Var.f390678n = z17 ? 2 : 1;
        lVar.f70664a = y03Var;
        lVar.f70665b = new r45.z03();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderunigetcomment";
        lVar.f70667d = 6953;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.z03 z03Var = (r45.z03) fVar;
        if (i17 == 0 && i18 == 0 && z03Var != null) {
            jv2.c cVar = this.f266972m.f302223d;
            cVar.u0().setLastBuffer(z03Var.f391569h);
            cVar.u0().setContinueFlag(z03Var.f391568g);
            cVar.u0().setUpContinueFlag(z03Var.f391567f);
        }
    }
}
