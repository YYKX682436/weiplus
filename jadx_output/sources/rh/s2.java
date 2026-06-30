package rh;

/* loaded from: classes12.dex */
public abstract class s2 extends rh.z2 {

    /* renamed from: b, reason: collision with root package name */
    public static final rh.s2 f395505b = new rh.r2(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f395506a;

    public s2(java.lang.Object obj) {
        this.f395506a = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.lang.String.valueOf(this.f395506a).equals(java.lang.String.valueOf(((rh.s2) obj).f395506a));
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f395506a);
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(this.f395506a);
    }
}
