package yo;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.platformtools.d8 {
    public e(yo.f fVar, long j17, java.lang.String str) {
        super(j17, str);
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        while (true) {
            java.lang.String W = com.tencent.mm.sdk.platformtools.t8.W(com.tencent.mm.sdk.platformtools.x2.f193071a, android.os.Process.myPid());
            if (W != null) {
                return W;
            }
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProfileFactoryImpl", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
