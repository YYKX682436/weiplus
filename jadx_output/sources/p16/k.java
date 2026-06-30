package p16;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f351316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351317b;

    public k(java.lang.Object obj, int i17) {
        this.f351316a = obj;
        this.f351317b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p16.k)) {
            return false;
        }
        p16.k kVar = (p16.k) obj;
        return this.f351316a == kVar.f351316a && this.f351317b == kVar.f351317b;
    }

    public int hashCode() {
        return (java.lang.System.identityHashCode(this.f351316a) * 65535) + this.f351317b;
    }
}
