package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f130467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jv2.d dVar, com.tencent.mm.plugin.finder.uniComments.o0 o0Var, boolean z17) {
        super(1);
        this.f130465d = dVar;
        this.f130466e = o0Var;
        this.f130467f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments before lastBuffer ");
        jv2.d dVar = this.f130465d;
        if (dVar.f302207d.u0().getLastBuffer() == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g lastBuffer = dVar.f302207d.u0().getLastBuffer();
            b17 = com.tencent.mm.sdk.platformtools.w2.b(lastBuffer != null ? lastBuffer.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130466e;
        iv2.a aVar = o0Var.f130328m;
        if (aVar != null) {
            new fv2.d(aVar.f295119b, aVar.f295118a, dVar.getItemId(), this.f130465d, this.f130467f).l().q(new com.tencent.mm.plugin.finder.uniComments.x(dVar, o0Var)).h(new com.tencent.mm.plugin.finder.uniComments.y(o0Var, dVar, this.f130467f, task)).f(o0Var);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }
}
