package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hj0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jj0 f112818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gm1 f112819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var, r45.gm1 gm1Var) {
        super(0);
        this.f112818d = jj0Var;
        this.f112819e = gm1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list = this.f112819e.getList(1);
        r45.d22 d22Var = list != null ? (r45.d22) kz5.n0.Z(list) : null;
        com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var = this.f112818d;
        jj0Var.f113123v = d22Var;
        jj0Var.v1(d22Var != null && dk2.q.b(d22Var));
        r45.d22 d22Var2 = jj0Var.f113123v;
        if (d22Var2 != null && dk2.q.f(d22Var2)) {
            qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
            r45.d22 d22Var3 = jj0Var.f113123v;
            java.lang.String string = d22Var3 != null ? d22Var3.getString(9) : null;
            if (string == null) {
                string = "";
            }
            ((ef0.l4) i9Var).wi(string, true, false, new com.tencent.mm.plugin.finder.live.plugin.gj0(jj0Var));
        } else {
            bl2.k kVar = jj0Var.f113124w;
            if (kVar != null) {
                kVar.f21717h = jj0Var.f113123v;
                kVar.z();
            }
        }
        return jz5.f0.f302826a;
    }
}
