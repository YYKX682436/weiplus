package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class y implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f130457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f130458d;

    public y(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, jv2.d dVar, boolean z17, fp0.r rVar) {
        this.f130455a = o0Var;
        this.f130456b = dVar;
        this.f130457c = z17;
        this.f130458d = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        java.util.List list = (java.util.List) lVar.f302834e;
        jv2.d dVar = this.f130456b;
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130455a;
        if (intValue == -1) {
            com.tencent.mm.plugin.finder.uniComments.g gVar = o0Var.f130331p;
            if (gVar != null) {
                gVar.a(dVar.f302207d.t0(), dVar.f302207d.field_localCommentId, true);
            }
            db5.t7.makeText(o0Var.f130322d, com.tencent.mm.R.string.f2d, 0).show();
        } else if (intValue == 0) {
            com.tencent.mm.plugin.finder.uniComments.o0.b(o0Var, list, dVar, this.f130457c);
        }
        this.f130458d.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
