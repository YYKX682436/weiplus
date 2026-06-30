package g16;

/* loaded from: classes15.dex */
public final class r0 implements o06.x1 {

    /* renamed from: b, reason: collision with root package name */
    public final b16.i0 f267654b;

    public r0(b16.i0 packageFragment) {
        kotlin.jvm.internal.o.g(packageFragment, "packageFragment");
        this.f267654b = packageFragment;
    }

    @Override // o06.x1
    public o06.z1 b() {
        return o06.z1.f342013a;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        b16.i0 i0Var = this.f267654b;
        sb6.append(i0Var);
        sb6.append(": ");
        sb6.append(((java.util.Map) e26.b0.a(i0Var.f17188o, i0Var, b16.i0.f17185s[0])).keySet());
        return sb6.toString();
    }
}
