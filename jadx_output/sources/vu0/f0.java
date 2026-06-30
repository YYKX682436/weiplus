package vu0;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ne4 f440086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r45.ne4 ne4Var) {
        super(1);
        this.f440086d = ne4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.me4 me4Var;
        java.util.LinkedList linkedList;
        ru0.h uniqueHexKey = (ru0.h) obj;
        kotlin.jvm.internal.o.g(uniqueHexKey, "uniqueHexKey");
        jz5.g gVar = ru0.m.f399689a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        r45.ne4 ne4Var = this.f440086d;
        if (ne4Var != null) {
            java.util.LinkedList linkedList2 = ne4Var.f381311e;
            if (!((linkedList2 == null || (me4Var = (r45.me4) kz5.n0.a0(linkedList2, 0)) == null || (linkedList = me4Var.f380412f) == null || !linkedList.isEmpty()) ? false : true)) {
                if (!ru0.m.a().m()) {
                    ru0.m.a().J();
                }
                com.tencent.mm.vfs.r6 r6Var = uniqueHexKey.f399675a;
                if (!r6Var.m()) {
                    r6Var.J();
                }
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(uniqueHexKey.f399676b, false, true);
                com.tencent.mm.vfs.z7 z7Var = r6Var.f213166d;
                if (l17 != null && !l17.isEmpty()) {
                    java.lang.String str = z7Var.f213279f;
                    z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, str + '/' + l17, z7Var.f213280g, z7Var.f213281h);
                }
                com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                jz5.f0 f0Var2 = null;
                com.tencent.mm.vfs.z2 m17 = b3Var.m(z7Var, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        byte[] D = pm0.v.D(ne4Var);
                        if (D != null) {
                            java.io.OutputStream I = com.tencent.mm.vfs.w6.I(z7Var, b3Var.m(z7Var, m17), false);
                            try {
                                I.write(D);
                                vz5.b.a(I, null);
                                f0Var2 = f0Var;
                            } finally {
                            }
                        }
                        kotlin.Result.m521constructorimpl(f0Var2);
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                }
            }
        }
        return f0Var;
    }
}
