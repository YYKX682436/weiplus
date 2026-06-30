package dx1;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f244487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f244488g;

    public e(java.lang.String str, java.lang.String str2, yz5.a aVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        this.f244485d = str;
        this.f244486e = str2;
        this.f244487f = aVar;
        this.f244488g = concurrentHashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f244485d;
        java.lang.String str2 = this.f244486e;
        try {
            dx1.g.f244489a.i(str, str2, this.f244487f.invoke());
        } catch (java.lang.Exception e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" report job sessionId:");
            sb6.append(str);
            sb6.append(", key:");
            sb6.append(str2);
            sb6.append(", job:");
            int i17 = kotlinx.coroutines.r2.O0;
            sb6.append(kotlinx.coroutines.q2.f310571d);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StaticKvStat", e17, sb6.toString(), new java.lang.Object[0]);
        }
        this.f244488g.remove(str2);
    }
}
