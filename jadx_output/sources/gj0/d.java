package gj0;

/* loaded from: classes12.dex */
public final class d extends gj0.b {
    @Override // gj0.b
    public int b() {
        boolean z17;
        try {
            z17 = !com.tencent.mm.recovery.RecoveryInitializer.init(com.tencent.mm.sdk.platformtools.x2.f193071a);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecoveryFuse", th6, "recovery init fail", new java.lang.Object[0]);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        return z17 ? 1 : 0;
    }

    @Override // gj0.b
    public java.lang.String c() {
        return "recovery";
    }
}
