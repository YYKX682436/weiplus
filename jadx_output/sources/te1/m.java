package te1;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f417794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ re1.k f417795f;

    public m(te1.r rVar, java.lang.String str, long j17, re1.k kVar) {
        this.f417793d = str;
        this.f417794e = j17;
        this.f417795f = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            j17 = ve1.g.d(this.f417793d);
        } catch (java.lang.OutOfMemoryError unused) {
            ve1.g.p(5, "VideoProxy", "initCache, calculate cacheSize OOM usedSpace set to 0", null);
            j17 = 0;
        }
        long min = java.lang.Math.min(this.f417794e + j17, qe1.a.a().f362025j);
        this.f417795f.f394343d = min;
        ve1.g.p(4, "VideoProxy", "initCache, update cacheSize=" + min + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis), null);
    }
}
