package g10;

/* loaded from: classes5.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267542d;

    public p(java.lang.String str) {
        this.f267542d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f267542d;
        try {
            java.lang.String o17 = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).Di(), "mbpkgs"), str + ".wspkg").o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            if (com.tencent.mm.vfs.w6.j(o17)) {
                com.tencent.mm.vfs.w6.h(o17);
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: deleted debug pkg: ".concat(o17));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "hy: debug pkg not found, skip delete: ".concat(o17));
            }
            m45.b.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193072b + ":appbrand1");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicEcsNirvanaFeatureService", e17, "hy: failed to delete debug pkg for bizName: " + str, new java.lang.Object[0]);
        }
    }
}
