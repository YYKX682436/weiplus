package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f130216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(jv2.i iVar, com.tencent.mm.plugin.finder.uniComments.q3 q3Var, boolean z17) {
        super(1);
        this.f130214d = iVar;
        this.f130215e = q3Var;
        this.f130216f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments before lastBuffer ");
        jv2.i iVar = this.f130214d;
        if (iVar.f302223d.u0().getLastBuffer() == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g lastBuffer = iVar.f302223d.u0().getLastBuffer();
            b17 = com.tencent.mm.sdk.platformtools.w2.b(lastBuffer != null ? lastBuffer.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130215e;
        iv2.b bVar = q3Var.f130371h;
        if (bVar != null) {
            new fv2.b(bVar.f295129e, bVar.f295126b, iVar.getItemId(), this.f130214d, this.f130216f).l().q(new com.tencent.mm.plugin.finder.uniComments.a3(iVar, q3Var)).h(new com.tencent.mm.plugin.finder.uniComments.b3(q3Var, iVar, this.f130216f, task)).f(q3Var);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }
}
