package cr0;

/* loaded from: classes12.dex */
public final class s3 implements pf0.s {
    @Override // pf0.s
    public void a(int i17, java.util.Map traffic, long j17) {
        kotlin.jvm.internal.o.g(traffic, "traffic");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkTracker", "onCollectTraffic: type=" + i17 + ", size=" + traffic.size() + ", millis=" + j17);
        for (java.util.Map.Entry entry : traffic.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            int L = r26.n0.L(str, "-", 0, false, 6, null);
            if (L > 0) {
                java.lang.String substring = str.substring(0, L);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                java.lang.String substring2 = str.substring(L + 1);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                cr0.w3.f221800a.a().lock(new cr0.r3(i17, substring2, substring, str2));
            }
        }
        if (!traffic.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTraffic: totalRx=");
            java.util.Iterator<T> it = cr0.w3.f221800a.a().getAccRxStats().values().iterator();
            long j18 = 0;
            long j19 = 0;
            while (it.hasNext()) {
                j19 += kz5.n0.J0(((java.util.Map) it.next()).values());
            }
            long j27 = 1024;
            sb6.append(j19 / j27);
            sb6.append("KB, totalTx=");
            java.util.Iterator<T> it6 = cr0.w3.f221800a.a().getAccTxStats().values().iterator();
            while (it6.hasNext()) {
                j18 += kz5.n0.J0(((java.util.Map) it6.next()).values());
            }
            sb6.append(j18 / j27);
            sb6.append("KB");
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkTracker", sb6.toString());
        }
    }
}
