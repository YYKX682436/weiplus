package mn0;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f329764a = jz5.h.b(mn0.j0.f329762d);

    /* renamed from: b, reason: collision with root package name */
    public long f329765b;

    /* renamed from: c, reason: collision with root package name */
    public long f329766c;

    /* renamed from: d, reason: collision with root package name */
    public long f329767d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f329768e;

    public final void a(java.lang.String step, long j17) {
        kotlin.jvm.internal.o.g(step, "step");
        b().add(new jz5.l(step, java.lang.Long.valueOf(j17)));
    }

    public final java.util.ArrayList b() {
        return (java.util.ArrayList) ((jz5.n) this.f329764a).getValue();
    }

    public java.lang.String toString() {
        if (b().isEmpty()) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PlayStep:");
        for (jz5.l lVar : b()) {
            sb6.append("(" + ((java.lang.String) lVar.f302833d) + ',' + ((java.lang.Number) lVar.f302834e).longValue() + ')');
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
