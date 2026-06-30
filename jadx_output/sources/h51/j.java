package h51;

/* loaded from: classes12.dex */
public class j implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f279034d;

    /* renamed from: e, reason: collision with root package name */
    public final long f279035e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f279036f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f279037g;

    public j(long j17, long j18, java.lang.Object obj) {
        this.f279034d = j17;
        this.f279035e = j18;
        this.f279036f = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17 = ((h51.j) obj).f279034d;
        long j18 = this.f279034d;
        if (j18 < j17) {
            return -1;
        }
        return j18 > j17 ? 1 : 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h51.j.class != obj.getClass()) {
            return false;
        }
        h51.j jVar = (h51.j) obj;
        if (this.f279035e != jVar.f279035e) {
            return false;
        }
        java.lang.Object obj2 = jVar.f279036f;
        java.lang.Object obj3 = this.f279036f;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return this.f279034d == jVar.f279034d;
    }

    public int hashCode() {
        long j17 = this.f279035e;
        int i17 = (((int) (j17 ^ (j17 >>> 32))) + 31) * 31;
        java.lang.Object obj = this.f279036f;
        int hashCode = (i17 + (obj == null ? 0 : obj.hashCode())) * 31;
        long j18 = this.f279034d;
        return hashCode + ((int) ((j18 >>> 32) ^ j18));
    }

    public java.lang.String toString() {
        return "offset " + this.f279034d + ", length " + this.f279035e + ", metadata " + this.f279036f + ", isDeflateCompressed " + this.f279037g;
    }

    public j(long j17, long j18, java.lang.Object obj, boolean z17) {
        this.f279034d = j17;
        this.f279035e = j18;
        this.f279036f = obj;
        this.f279037g = z17;
    }
}
