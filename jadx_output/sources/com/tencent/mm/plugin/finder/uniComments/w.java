package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.uniComments.o0 o0Var) {
        super(1);
        this.f130439d = o0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData before lastBuffer ");
        if (this.f130439d.f130333r == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f130439d.f130333r;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        fv2.c cVar = new fv2.c();
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130439d;
        iv2.a aVar = o0Var.f130328m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String userName = aVar.f295119b;
        java.lang.String entity_id = aVar.f295118a;
        com.tencent.mm.protobuf.g gVar2 = o0Var.f130333r;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.y03 y03Var = new r45.y03();
        y03Var.f390673f = entity_id;
        y03Var.f390678n = 2;
        y03Var.f390682r = gVar2;
        y03Var.f390681q = userName;
        lVar.f70664a = y03Var;
        lVar.f70665b = new r45.z03();
        lVar.f70666c = "/cgi-bin/micromsg-bin/statusgetcommentlist";
        lVar.f70667d = 7865;
        cVar.p(lVar.a());
        cVar.l().q(new com.tencent.mm.plugin.finder.uniComments.u(this.f130439d)).h(new com.tencent.mm.plugin.finder.uniComments.v(this.f130439d, task)).f(this.f130439d);
        return jz5.f0.f302826a;
    }
}
