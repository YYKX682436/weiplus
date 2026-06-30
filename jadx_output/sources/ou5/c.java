package ou5;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349052a;

    /* renamed from: b, reason: collision with root package name */
    public final long f349053b;

    /* renamed from: c, reason: collision with root package name */
    public final long f349054c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f349055d;

    /* renamed from: e, reason: collision with root package name */
    public long f349056e;

    /* renamed from: f, reason: collision with root package name */
    public final float f349057f;

    public c(java.lang.String str, long j17, long j18, java.lang.String str2) {
        this.f349052a = str;
        this.f349053b = j17;
        this.f349054c = j18;
        this.f349055d = str2;
        this.f349057f = j18 > 1 ? (((float) j17) * 1.0f) / ((float) j18) : 1.0f;
        this.f349056e = java.lang.System.currentTimeMillis();
    }

    public boolean equals(java.lang.Object obj) {
        return this.f349052a.equals(obj);
    }

    public int hashCode() {
        return this.f349052a.hashCode();
    }

    public java.lang.String toString() {
        return this.f349052a + " " + this.f349053b + " " + this.f349054c;
    }
}
