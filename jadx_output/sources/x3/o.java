package x3;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f451585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f451586b;

    public o(int i17, int i18) {
        this.f451585a = i17;
        this.f451586b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x3.o.class != obj.getClass()) {
            return false;
        }
        x3.o oVar = (x3.o) obj;
        return this.f451586b == oVar.f451586b && this.f451585a == oVar.f451585a;
    }

    public int hashCode() {
        return (this.f451585a * 31) + this.f451586b;
    }

    public java.lang.String toString() {
        return "[" + this.f451585a + ", " + this.f451586b + "]";
    }
}
