package r95;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f393453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f393454b;

    public d(int i17, int i18) {
        this.f393453a = i17;
        this.f393454b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof r95.d) {
                r95.d dVar = (r95.d) obj;
                if (this.f393453a == dVar.f393453a) {
                    if (this.f393454b == dVar.f393454b) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f393453a * 31) + this.f393454b;
    }

    public java.lang.String toString() {
        return "Size(width=" + this.f393453a + ", height=" + this.f393454b + ')';
    }
}
