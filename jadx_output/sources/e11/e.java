package e11;

/* loaded from: classes15.dex */
public class e implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final long f246381d;

    /* renamed from: e, reason: collision with root package name */
    public final long f246382e;

    /* renamed from: f, reason: collision with root package name */
    public final int f246383f;

    /* renamed from: g, reason: collision with root package name */
    public final long f246384g;

    public e(long j17, long j18, int i17, long j19) {
        this.f246381d = 0L;
        this.f246382e = 0L;
        this.f246383f = 0;
        this.f246381d = j17;
        this.f246382e = j18;
        this.f246383f = i17;
        this.f246384g = j19;
    }

    public java.lang.String toString() {
        return java.lang.String.format("serverTime:%s,time:%s,type:%s,recvTime:%s", e11.b.c(this.f246381d), e11.b.c(this.f246382e), java.lang.Integer.valueOf(this.f246383f), java.lang.Long.valueOf(this.f246384g));
    }
}
