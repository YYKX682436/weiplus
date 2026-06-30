package z;

/* loaded from: classes13.dex */
public final class p1 implements z.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f468781a;

    /* renamed from: b, reason: collision with root package name */
    public final float f468782b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f468783c;

    public p1(float f17, float f18, java.lang.Object obj) {
        this.f468781a = f17;
        this.f468782b = f18;
        this.f468783c = obj;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        kotlin.jvm.internal.o.g(converter, "converter");
        java.lang.Object obj = this.f468783c;
        return new z.d4(this.f468781a, this.f468782b, obj == null ? null : (z.w) ((z.x2) converter).f468873a.invoke(obj));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof z.p1)) {
            return false;
        }
        z.p1 p1Var = (z.p1) obj;
        if (p1Var.f468781a == this.f468781a) {
            return ((p1Var.f468782b > this.f468782b ? 1 : (p1Var.f468782b == this.f468782b ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(p1Var.f468783c, this.f468783c);
        }
        return false;
    }

    public int hashCode() {
        java.lang.Object obj = this.f468783c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + java.lang.Float.hashCode(this.f468781a)) * 31) + java.lang.Float.hashCode(this.f468782b);
    }

    public /* synthetic */ p1(float f17, float f18, java.lang.Object obj, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? 1.0f : f17, (i17 & 2) != 0 ? 1500.0f : f18, (i17 & 4) != 0 ? null : obj);
    }
}
