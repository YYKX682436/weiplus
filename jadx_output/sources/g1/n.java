package g1;

/* loaded from: classes13.dex */
public final class n extends g1.j {

    /* renamed from: a, reason: collision with root package name */
    public final float f267513a;

    /* renamed from: b, reason: collision with root package name */
    public final float f267514b;

    /* renamed from: c, reason: collision with root package name */
    public final int f267515c;

    /* renamed from: d, reason: collision with root package name */
    public final int f267516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(float f17, float f18, int i17, int i18, e1.q0 q0Var, int i19, kotlin.jvm.internal.i iVar) {
        super(null);
        f17 = (i19 & 1) != 0 ? 0.0f : f17;
        f18 = (i19 & 2) != 0 ? 4.0f : f18;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        this.f267513a = f17;
        this.f267514b = f18;
        this.f267515c = i17;
        this.f267516d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.n)) {
            return false;
        }
        g1.n nVar = (g1.n) obj;
        if (!(this.f267513a == nVar.f267513a)) {
            return false;
        }
        if (!(this.f267514b == nVar.f267514b)) {
            return false;
        }
        if (!(this.f267515c == nVar.f267515c)) {
            return false;
        }
        if (!(this.f267516d == nVar.f267516d)) {
            return false;
        }
        nVar.getClass();
        return kotlin.jvm.internal.o.b(null, null);
    }

    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.f267513a) * 31) + java.lang.Float.hashCode(this.f267514b)) * 31) + java.lang.Integer.hashCode(this.f267515c)) * 31) + java.lang.Integer.hashCode(this.f267516d)) * 31) + 0;
    }

    public java.lang.String toString() {
        return "Stroke(width=" + this.f267513a + ", miter=" + this.f267514b + ", cap=" + ((java.lang.Object) e1.f1.a(this.f267515c)) + ", join=" + ((java.lang.Object) e1.g1.a(this.f267516d)) + ", pathEffect=null)";
    }
}
