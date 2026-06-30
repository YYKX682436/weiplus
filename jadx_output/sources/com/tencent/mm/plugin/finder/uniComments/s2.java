package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f130406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, jv2.i iVar, android.content.Context context) {
        super(0);
        this.f130404d = q3Var;
        this.f130405e = iVar;
        this.f130406f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130404d;
        android.app.Dialog dialog = q3Var.D;
        if (dialog != null) {
            dialog.dismiss();
        }
        jv2.i iVar = this.f130405e;
        if (iVar.f302223d.J0() != 0) {
            java.util.Iterator it = q3Var.f130369f.f130360a.iterator();
            while (it.hasNext()) {
                jv2.i iVar2 = (jv2.i) it.next();
                if (iVar2.f302223d.t0() == iVar.f302223d.J0()) {
                    iVar2.f302223d.u0().setExpandCommentCount(r7.y0() - 1);
                    if (iVar2.f302223d.y0() < 0) {
                        iVar2.f302223d.u0().setExpandCommentCount(0);
                    }
                    java.util.LinkedList A0 = iVar2.f302223d.A0();
                    if (A0 != null) {
                        pm0.v.d0(A0, new com.tencent.mm.plugin.finder.uniComments.r2(iVar));
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.uniComments.j2 j2Var = q3Var.f130374n;
        if (j2Var != null) {
            j2Var.a(iVar.f302223d.t0(), iVar.f302223d.field_localCommentId, false);
        }
        if (iVar.f302223d.J0() == 0) {
            iv2.b bVar = q3Var.f130371h;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (iVar.f302223d.y0() > 0) {
                int y07 = iVar.f302223d.y0();
                int i17 = bVar.f295127c;
                if (y07 <= i17) {
                    bVar.f295127c = i17 - iVar.f302223d.y0();
                }
            }
            bVar.f295127c--;
        }
        iVar.f302223d.t0();
        db5.t7.makeText(this.f130406f, com.tencent.mm.R.string.cst, 0).show();
        q3Var.z();
        return jz5.f0.f302826a;
    }
}
