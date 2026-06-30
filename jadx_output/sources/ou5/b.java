package ou5;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349042a;

    /* renamed from: b, reason: collision with root package name */
    public float f349043b;

    /* renamed from: c, reason: collision with root package name */
    public float f349044c;

    /* renamed from: d, reason: collision with root package name */
    public long f349045d;

    /* renamed from: e, reason: collision with root package name */
    public long f349046e;

    /* renamed from: f, reason: collision with root package name */
    public float f349047f;

    /* renamed from: g, reason: collision with root package name */
    public float f349048g;

    /* renamed from: h, reason: collision with root package name */
    public float f349049h;

    /* renamed from: i, reason: collision with root package name */
    public float f349050i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f349051j;

    public b(java.lang.String str) {
        this.f349043b = 0.0f;
        this.f349044c = 0.0f;
        this.f349045d = 0L;
        this.f349046e = 0L;
        this.f349047f = 0.0f;
        this.f349048g = 0.0f;
        this.f349049h = 1.0f;
        this.f349050i = 0.0f;
        this.f349051j = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f349042a = str;
    }

    public boolean a() {
        return this.f349045d >= 5000 || this.f349044c >= 0.5f;
    }

    public java.lang.String toString() {
        return this.f349042a + " " + this.f349044c + " " + a() + " " + this.f349051j.size();
    }

    public b(java.lang.String str, float f17, long j17) {
        this.f349043b = 0.0f;
        this.f349044c = 0.0f;
        this.f349045d = 0L;
        this.f349046e = 0L;
        this.f349047f = 0.0f;
        this.f349048g = 0.0f;
        this.f349049h = 1.0f;
        this.f349050i = 0.0f;
        this.f349051j = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f349042a = str;
        this.f349044c = f17;
        this.f349045d = j17;
    }
}
