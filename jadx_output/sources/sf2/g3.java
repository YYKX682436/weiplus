package sf2;

/* loaded from: classes5.dex */
public final class g3 extends sf2.i3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f407150a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f407151b;

    public g3(int i17, java.lang.String str) {
        super(null);
        this.f407150a = i17;
        this.f407151b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf2.g3)) {
            return false;
        }
        sf2.g3 g3Var = (sf2.g3) obj;
        return this.f407150a == g3Var.f407150a && kotlin.jvm.internal.o.b(this.f407151b, g3Var.f407151b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f407150a) * 31;
        java.lang.String str = this.f407151b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "Error(errCode=" + this.f407150a + ", errMsg=" + this.f407151b + ')';
    }
}
