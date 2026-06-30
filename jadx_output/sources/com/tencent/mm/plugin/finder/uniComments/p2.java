package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, jv2.i iVar, yz5.a aVar, yz5.a aVar2) {
        super(0);
        this.f130354d = q3Var;
        this.f130355e = iVar;
        this.f130356f = aVar;
        this.f130357g = aVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130354d;
        int i17 = q3Var.f130372i == 2 ? 2 : 3;
        fv2.g gVar = new fv2.g();
        iv2.b bVar = q3Var.f130371h;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        long itemId = this.f130355e.getItemId();
        java.lang.String app_name = bVar.f295125a;
        kotlin.jvm.internal.o.g(app_name, "app_name");
        java.lang.String entity_id = bVar.f295126b;
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.w03 w03Var = new r45.w03();
        w03Var.f388747f = app_name;
        w03Var.f388748g = entity_id;
        w03Var.f388745d = db2.t4.f228171a.a(6964);
        w03Var.f388754p = 2;
        w03Var.f388755q = i17;
        w03Var.f388750i = itemId;
        lVar.f70664a = w03Var;
        lVar.f70665b = new r45.b13();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderunicomment";
        lVar.f70667d = 6964;
        gVar.p(lVar.a());
        pq5.g l17 = gVar.l();
        l17.f(q3Var);
        l17.h(new com.tencent.mm.plugin.finder.uniComments.o2(this.f130356f, this.f130357g));
        return jz5.f0.f302826a;
    }
}
