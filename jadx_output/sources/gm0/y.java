package gm0;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final gm0.w f273287a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.modelbase.r1 f273288b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f273289c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.s0 f273290d = new gm0.o(this);

    public y(com.tencent.mm.modelbase.h2 h2Var, gm0.w wVar) {
        if (com.tencent.mm.modelbase.r1.f70762y == null) {
            com.tencent.mm.modelbase.r1.f70762y = new com.tencent.mm.modelbase.r1(h2Var);
        }
        com.tencent.mm.modelbase.r1 r1Var = com.tencent.mm.modelbase.r1.f70762y;
        this.f273288b = r1Var;
        r1Var.f70765e = gm0.j1.e();
        com.tencent.mm.modelbase.z2.f70847b = new gm0.n(this);
        this.f273287a = wVar;
    }

    public void a(com.tencent.mm.network.s0 s0Var) {
        synchronized (this.f273289c) {
            this.f273289c.add(s0Var);
        }
    }

    public com.tencent.mm.modelbase.r1 b() {
        return this.f273288b;
    }

    public byte[] c(int i17) {
        com.tencent.mm.modelbase.r1 r1Var = this.f273288b;
        if (r1Var != null) {
            try {
                com.tencent.mm.network.s sVar = r1Var.f70764d;
                if (sVar != null && sVar.G() != null) {
                    return r1Var.f70764d.G().r(i17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MMKernel.CoreNetwork", "get session key error, %s", e17.getMessage());
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MMKernel.CoreNetwork", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return null;
    }

    public void d(com.tencent.mm.network.s0 s0Var) {
        synchronized (this.f273289c) {
            this.f273289c.remove(s0Var);
        }
    }

    public void e() {
        this.f273288b.g(new c01.ra(new gm0.p(this), "reset accinfo"));
    }
}
