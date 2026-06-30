package ve1;

/* loaded from: classes13.dex */
public class m extends java.util.concurrent.FutureTask implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public volatile long f436087d;

    public m(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        super(runnable, obj);
        this.f436087d = 0L;
        this.f436087d = j17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return java.lang.Long.valueOf(this.f436087d).compareTo(java.lang.Long.valueOf(((ve1.m) obj).f436087d));
    }
}
