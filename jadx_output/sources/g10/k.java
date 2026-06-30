package g10;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f267530e;

    public k(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        this.f267529d = str;
        this.f267530e = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f267529d;
        try {
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Di(), "mbpkgs");
            com.tencent.mm.vfs.w6.u(r6Var.o());
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, str + ".wspkg");
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(this.f267530e.o());
            try {
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(r6Var2.o(), false);
                try {
                    kotlin.jvm.internal.o.d(E);
                    kotlin.jvm.internal.o.d(K);
                    vz5.a.b(E, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(E, null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: copied debug pkg to " + r6Var2.o() + ", length: " + com.tencent.mm.vfs.w6.k(r6Var2.o()));
                    pm0.v.X(g10.j.f267528d);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicEcsNirvanaFeatureService", e17, "hy: failed to copy debug pkg for bizName: " + str, new java.lang.Object[0]);
        }
    }
}
