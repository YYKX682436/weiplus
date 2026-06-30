package mz;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mars.cdn.CronetLogic.CronetDnsCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final mz.b f332863a = new mz.b();

    @Override // com.tencent.mars.cdn.CronetLogic.CronetDnsCallback
    public final java.lang.String[] dns(java.lang.String str) {
        java.lang.String[] strArr;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (str == null || str.length() == 0) {
            strArr = new java.lang.String[0];
        } else {
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            java.lang.String PROCESS_PUSH = com.tencent.mm.sdk.platformtools.w9.f193054b;
            kotlin.jvm.internal.o.f(PROCESS_PUSH, "PROCESS_PUSH");
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.ipcinvoker.f.a(PROCESS_PUSH, new com.tencent.mm.ipc.GetSimpleDnsRequest(str, 2000, true, 0, false), new jk0.c(), new mz.a(atomicReference, countDownLatch));
            try {
                countDownLatch.await(10L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CronetSetupSplashPreloadService", "SimpleDnsCallback, await ipc result get exception:" + e17);
            }
            strArr = (java.lang.String[]) atomicReference.get();
            if (strArr == null) {
                strArr = new java.lang.String[0];
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SimpleDnsCallback complete, ");
        sb6.append(str);
        sb6.append(" -> ");
        java.lang.String arrays = java.util.Arrays.toString(strArr);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", cost:");
        sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        sb6.append("ms");
        com.tencent.mars.xlog.Log.i("MicroMsg.CronetSetupSplashPreloadService", sb6.toString());
        return strArr;
    }
}
