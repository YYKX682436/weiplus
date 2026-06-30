package x51;

/* loaded from: classes12.dex */
public final class p1 {
    public p1(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, boolean] */
    public final boolean a(java.lang.String expt) {
        kotlin.jvm.internal.o.g(expt, "expt");
        boolean z17 = true;
        ?? r07 = (((fz.l) ((cp.f) i95.n0.c(cp.f.class))).f267277e || mm.o.a()) ? 1 : 0;
        if (j62.e.g().i(expt, r07, false, false) != 1) {
            int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if (!((i17 == 788529167 || i17 == 788529166) || z65.c.a())) {
                z17 = false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetThreadWorker", "enableThreadPool: " + z17 + ", expt=" + expt + ", def=" + ((boolean) r07));
        return z17;
    }
}
