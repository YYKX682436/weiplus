package ky;

/* loaded from: classes14.dex */
public final class b0 extends ky.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f313333a;

    /* renamed from: b, reason: collision with root package name */
    public final float f313334b;

    public b0(float f17, float f18) {
        super(null);
        this.f313333a = f17;
        this.f313334b = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky.b0)) {
            return false;
        }
        ky.b0 b0Var = (ky.b0) obj;
        return java.lang.Float.compare(this.f313333a, b0Var.f313333a) == 0 && java.lang.Float.compare(this.f313334b, b0Var.f313334b) == 0;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f313333a) * 31) + java.lang.Float.hashCode(this.f313334b);
    }

    public java.lang.String toString() {
        return "PressCancel(offsetX=" + this.f313333a + ", offsetY=" + this.f313334b + ')';
    }
}
