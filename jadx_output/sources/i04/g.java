package i04;

/* loaded from: classes8.dex */
public final class g implements j04.f {

    /* renamed from: a, reason: collision with root package name */
    public long f286543a = java.lang.System.currentTimeMillis();

    @Override // j04.f
    public void a(java.lang.String sessionId, long j17, long j18) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        long j19 = j18 - this.f286543a;
        this.f286543a = j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.MTimer", "sessionID: %s, interval:%d date:%s, distanceTime:%d", sessionId, java.lang.Long.valueOf(j19 / 3600000), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j18 - j17));
    }
}
