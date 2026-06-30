package cw2;

/* loaded from: classes11.dex */
public final class p5 extends cw2.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Surface f223927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f223928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f223929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(android.view.Surface surface, int i17, int i18) {
        super(null);
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f223927a = surface;
        this.f223928b = i17;
        this.f223929c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.p5)) {
            return false;
        }
        cw2.p5 p5Var = (cw2.p5) obj;
        return kotlin.jvm.internal.o.b(this.f223927a, p5Var.f223927a) && this.f223928b == p5Var.f223928b && this.f223929c == p5Var.f223929c;
    }

    public int hashCode() {
        return (((this.f223927a.hashCode() * 31) + java.lang.Integer.hashCode(this.f223928b)) * 31) + java.lang.Integer.hashCode(this.f223929c);
    }

    public java.lang.String toString() {
        return "Recreate(surface=" + this.f223927a + ", width=" + this.f223928b + ", height=" + this.f223929c + ')';
    }
}
