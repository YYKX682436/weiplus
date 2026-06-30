package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f130351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, jv2.d dVar, android.content.Context context) {
        super(0);
        this.f130349d = o0Var;
        this.f130350e = dVar;
        this.f130351f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130349d;
        android.app.Dialog dialog = o0Var.F;
        if (dialog != null) {
            dialog.dismiss();
        }
        jv2.d dVar = this.f130350e;
        if (dVar.f302207d.A0() != 0) {
            java.util.Iterator it = o0Var.f130326h.f130342a.iterator();
            while (it.hasNext()) {
                jv2.d dVar2 = (jv2.d) it.next();
                if (dVar2.f302207d.t0() == dVar.f302207d.A0()) {
                    dVar2.f302207d.u0().setExpandCommentCount(r7.v0() - 1);
                    if (dVar2.f302207d.v0() < 0) {
                        dVar2.f302207d.u0().setExpandCommentCount(0);
                    }
                    java.util.LinkedList w07 = dVar2.f302207d.w0();
                    if (w07 != null) {
                        pm0.v.d0(w07, new com.tencent.mm.plugin.finder.uniComments.o(dVar));
                    }
                }
            }
        }
        com.tencent.mm.plugin.finder.uniComments.g gVar = o0Var.f130331p;
        if (gVar != null) {
            gVar.a(dVar.f302207d.t0(), dVar.f302207d.field_localCommentId, false);
        }
        if (dVar.f302207d.A0() == 0) {
            iv2.a aVar = o0Var.f130328m;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (dVar.f302207d.v0() > 0) {
                int v07 = dVar.f302207d.v0();
                int i17 = aVar.f295121d;
                if (v07 <= i17) {
                    aVar.f295121d = i17 - dVar.f302207d.v0();
                }
            }
            aVar.f295121d--;
        }
        dVar.f302207d.t0();
        db5.t7.makeText(this.f130351f, com.tencent.mm.R.string.cst, 0).show();
        return jz5.f0.f302826a;
    }
}
