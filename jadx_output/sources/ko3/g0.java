package ko3;

/* loaded from: classes11.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f309961a;

    static {
        long nanoTime = java.lang.System.nanoTime();
        try {
            boolean a17 = com.tencent.mm.normsg.WCProbe$Info.a();
            f309961a = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", java.lang.Boolean.valueOf(a17), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NormalMsgSource.DADH", th6, "unexpected exception.", new java.lang.Object[0]);
                f309961a = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", false, java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", java.lang.Boolean.valueOf(f309961a), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
                throw th7;
            }
        }
    }
}
