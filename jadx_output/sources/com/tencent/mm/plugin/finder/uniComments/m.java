package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, jv2.d dVar, yz5.a aVar, yz5.a aVar2) {
        super(0);
        this.f130299d = o0Var;
        this.f130300e = dVar;
        this.f130301f = aVar;
        this.f130302g = aVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130299d;
        int i17 = o0Var.f130329n == 2 ? 2 : 3;
        fv2.e eVar = new fv2.e();
        iv2.a aVar = o0Var.f130328m;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        long itemId = this.f130300e.getItemId();
        java.lang.String userName = aVar.f295119b;
        kotlin.jvm.internal.o.g(userName, "userName");
        java.lang.String entity_id = aVar.f295118a;
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.w03 w03Var = new r45.w03();
        w03Var.f388748g = entity_id;
        w03Var.f388760v = userName;
        w03Var.f388754p = 2;
        w03Var.f388755q = i17;
        w03Var.f388750i = itemId;
        w03Var.f388759u = c01.id.c();
        lVar.f70664a = w03Var;
        lVar.f70665b = new r45.b13();
        lVar.f70666c = "/cgi-bin/micromsg-bin/statuscomment";
        lVar.f70667d = 9704;
        eVar.p(lVar.a());
        pq5.g l17 = eVar.l();
        l17.f(o0Var);
        l17.h(new com.tencent.mm.plugin.finder.uniComments.l(this.f130301f, this.f130302g));
        return jz5.f0.f302826a;
    }
}
