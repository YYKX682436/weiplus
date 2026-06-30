package f0;

/* loaded from: classes14.dex */
public final class b implements f0.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f258006a;

    public b(int i17) {
        this.f258006a = i17;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof f0.b) {
            if (this.f258006a == ((f0.b) obj).f258006a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return -this.f258006a;
    }
}
