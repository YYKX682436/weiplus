package n81;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f335614a;

    /* renamed from: b, reason: collision with root package name */
    public final long f335615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f335616c;

    public e(java.lang.String appId, long j17, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f335614a = appId;
        this.f335615b = j17;
        this.f335616c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n81.e)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f335614a, ((n81.e) obj).f335614a);
    }

    public int hashCode() {
        return this.f335614a.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandInfo(appId=" + this.f335614a + ", lastLaunchTime=" + this.f335615b + ", serviceType=" + this.f335616c + ')';
    }
}
