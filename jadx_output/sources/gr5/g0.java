package gr5;

/* loaded from: classes13.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f274927a;

    /* renamed from: b, reason: collision with root package name */
    public final float f274928b;

    /* renamed from: c, reason: collision with root package name */
    public final float f274929c;

    public g0(float f17, float f18, float f19) {
        this.f274927a = f17;
        this.f274928b = f18;
        this.f274929c = f19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.g0)) {
            return false;
        }
        gr5.g0 g0Var = (gr5.g0) obj;
        return java.lang.Float.compare(this.f274927a, g0Var.f274927a) == 0 && java.lang.Float.compare(this.f274928b, g0Var.f274928b) == 0 && java.lang.Float.compare(this.f274929c, g0Var.f274929c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f274927a) * 31) + java.lang.Float.hashCode(this.f274928b)) * 31) + java.lang.Float.hashCode(this.f274929c);
    }

    public java.lang.String toString() {
        return "Result(minScale=" + zq5.b.c(this.f274927a, 2) + ", mediumScale=" + zq5.b.c(this.f274928b, 2) + ", maxScale=" + zq5.b.c(this.f274929c, 2) + ')';
    }
}
