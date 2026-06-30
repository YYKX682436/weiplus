package rq3;

@j95.b
/* loaded from: classes12.dex */
public final class k extends jm0.o implements cc0.l {
    public final void Zi(long j17, java.lang.String str, int i17) {
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
        if (n17 == null || n17.getMsgId() <= 0 || oq3.k.f347394a.c(i17, n17.Q0()) == 0) {
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        nVar.B.d(j17, i17, n17.I0());
    }

    public java.lang.String aj(long j17, java.lang.String str, int i17) {
        if (!jm0.g.class.isAssignableFrom(rq3.m.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(rq3.m.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.String T6 = ((rq3.m) ((jm0.g) a17)).T6(i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(T6)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PreloadMediaMoveFSC", "get root path error");
            return "";
        }
        if (!com.tencent.mm.vfs.w6.j(T6)) {
            com.tencent.mm.vfs.w6.u(T6);
        }
        if (str == null || r26.n0.N(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PreloadMediaMoveFSC", "talker is null");
            return T6 + j17;
        }
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String str2 = T6 + kk.k.g(bytes);
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.u(str2);
        }
        return str2 + '/' + j17;
    }

    public final boolean bj(long j17, java.lang.String str, int i17) {
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
        if (n17.getMsgId() <= 0 || oq3.k.f347394a.c(i17, n17.Q0()) == 0) {
            return false;
        }
        ((fq3.n) i95.n0.c(fq3.n.class)).aj();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(n17.I0());
        sb6.append('_');
        sb6.append(i17);
        java.lang.String msgItemId = sb6.toString();
        kotlin.jvm.internal.o.g(msgItemId, "msgItemId");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        sq3.a Y6 = nVar.A.Y6(msgItemId);
        if (Y6 != null) {
            return Y6.I0() == 2 || (Y6.I0() == 1 && Y6.J0() != Y6.z0()) || (Y6.I0() == 4 && Y6.J0() != Y6.z0());
        }
        return false;
    }

    public void cj(long j17, java.lang.String str) {
        ((rq3.m) jm0.g.f300266e.a(this, rq3.m.class)).getClass();
    }

    public void fj(java.lang.String str, long j17, int i17) {
        if (!jm0.g.class.isAssignableFrom(rq3.m.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(rq3.m.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
    }
}
