package z;

/* loaded from: classes13.dex */
public final class v2 implements z.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f468860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f468861b;

    /* renamed from: c, reason: collision with root package name */
    public final z.h0 f468862c;

    public v2(int i17, int i18, z.h0 easing) {
        kotlin.jvm.internal.o.g(easing, "easing");
        this.f468860a = i17;
        this.f468861b = i18;
        this.f468862c = easing;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        kotlin.jvm.internal.o.g(converter, "converter");
        return new z.e4(this.f468860a, this.f468861b, this.f468862c);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof z.v2)) {
            return false;
        }
        z.v2 v2Var = (z.v2) obj;
        return v2Var.f468860a == this.f468860a && v2Var.f468861b == this.f468861b && kotlin.jvm.internal.o.b(v2Var.f468862c, this.f468862c);
    }

    public int hashCode() {
        return (((this.f468860a * 31) + this.f468862c.hashCode()) * 31) + this.f468861b;
    }

    @Override // z.g0, z.p
    public z.x3 a(z.w2 converter) {
        kotlin.jvm.internal.o.g(converter, "converter");
        return new z.e4(this.f468860a, this.f468861b, this.f468862c);
    }

    public /* synthetic */ v2(int i17, int i18, z.h0 h0Var, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? 300 : i17, (i19 & 2) != 0 ? 0 : i18, (i19 & 4) != 0 ? z.j0.f468704a : h0Var);
    }
}
