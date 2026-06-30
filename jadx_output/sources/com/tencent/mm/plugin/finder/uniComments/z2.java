package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var) {
        super(1);
        this.f130470d = q3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData before lastBuffer ");
        if (this.f130470d.f130375o == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f130470d.f130375o;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        fv2.a aVar = new fv2.a();
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130470d;
        iv2.b bVar = q3Var.f130371h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        java.lang.String app_name = bVar.f295125a;
        java.lang.String entity_id = bVar.f295126b;
        com.tencent.mm.protobuf.g gVar2 = q3Var.f130375o;
        kotlin.jvm.internal.o.g(app_name, "app_name");
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.y03 y03Var = new r45.y03();
        y03Var.f390672e = app_name;
        y03Var.f390673f = entity_id;
        y03Var.f390671d = db2.t4.f228171a.a(6953);
        y03Var.f390678n = 2;
        y03Var.f390682r = gVar2;
        lVar.f70664a = y03Var;
        lVar.f70665b = new r45.z03();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderunigetcomment";
        lVar.f70667d = 6953;
        aVar.p(lVar.a());
        aVar.l().q(new com.tencent.mm.plugin.finder.uniComments.x2(this.f130470d)).h(new com.tencent.mm.plugin.finder.uniComments.y2(this.f130470d, task)).f(this.f130470d);
        return jz5.f0.f302826a;
    }
}
