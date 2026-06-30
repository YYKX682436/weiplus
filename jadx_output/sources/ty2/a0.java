package ty2;

/* loaded from: classes5.dex */
public final class a0 implements ty2.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f423056a;

    /* renamed from: b, reason: collision with root package name */
    public final float f423057b;

    public a0(int i17, float f17) {
        this.f423056a = i17;
        this.f423057b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.a0)) {
            return false;
        }
        ty2.a0 a0Var = (ty2.a0) obj;
        return this.f423056a == a0Var.f423056a && java.lang.Float.compare(this.f423057b, a0Var.f423057b) == 0;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f423056a) * 31) + java.lang.Float.hashCode(this.f423057b);
    }

    public java.lang.String toString() {
        return "Config(maxLineType=" + this.f423056a + ", lineSpacingExtraDp=" + this.f423057b + ')';
    }
}
