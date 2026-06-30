package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class b3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f130208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130209d;

    public b3(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, jv2.i iVar, boolean z17, fp0.r rVar) {
        this.f130206a = q3Var;
        this.f130207b = iVar;
        this.f130208c = z17;
        this.f130209d = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        java.util.List list = (java.util.List) lVar.f302834e;
        jv2.i iVar = this.f130207b;
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130206a;
        if (intValue == -1) {
            com.tencent.mm.plugin.finder.uniComments.j2 j2Var = q3Var.f130374n;
            if (j2Var != null) {
                j2Var.a(iVar.f302223d.t0(), iVar.f302223d.field_localCommentId, true);
            }
            db5.t7.makeText(q3Var.f130367d, com.tencent.mm.R.string.f2d, 0).show();
        } else if (intValue == 0) {
            com.tencent.mm.plugin.finder.uniComments.q3.g(q3Var, list, iVar, this.f130208c);
        }
        this.f130209d.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
