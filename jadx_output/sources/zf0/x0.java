package zf0;

/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f472589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f472590b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f472591c;

    public x0(int i17, boolean z17, boolean z18) {
        this.f472589a = i17;
        this.f472590b = z17;
        this.f472591c = z18;
    }

    public final boolean a() {
        return this.f472590b;
    }

    public final boolean b() {
        return this.f472591c;
    }

    public final int c() {
        return this.f472589a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf0.x0)) {
            return false;
        }
        zf0.x0 x0Var = (zf0.x0) obj;
        return this.f472589a == x0Var.f472589a && this.f472590b == x0Var.f472590b && this.f472591c == x0Var.f472591c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f472589a) * 31) + java.lang.Boolean.hashCode(this.f472590b)) * 31) + java.lang.Boolean.hashCode(this.f472591c);
    }

    public java.lang.String toString() {
        return "CompressStrategy(step=" + this.f472589a + ", forceSoftDecode=" + this.f472590b + ", forceSoftEncode=" + this.f472591c + ')';
    }
}
