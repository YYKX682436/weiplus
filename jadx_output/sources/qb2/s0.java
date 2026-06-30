package qb2;

/* loaded from: classes11.dex */
public final class s0 extends et1.a implements et1.n {
    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
        kotlin.jvm.internal.o.d(r1Var);
        java.lang.String str = r1Var.f442127b;
        return (str != null ? r26.i0.n(str, "@findermsg", false) : false) || o(r1Var);
    }

    @Override // et1.a
    public boolean o(w11.r1 params) {
        kotlin.jvm.internal.o.g(params, "params");
        if (!(params instanceof m11.m1)) {
            return false;
        }
        java.lang.String str = params.f442141p;
        java.lang.String str2 = com.tencent.mm.storage.v3.f196273a;
        return str != null && str.endsWith("findermsg");
    }

    @Override // et1.a
    public int r() {
        return 1;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        return com.tencent.mm.plugin.finder.service.m4.f126148a.f(sessionId);
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        return com.tencent.mm.plugin.finder.service.m4.f126148a.h(sessionId);
    }
}
