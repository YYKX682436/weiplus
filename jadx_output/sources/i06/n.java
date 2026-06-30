package i06;

/* loaded from: classes15.dex */
public final class n extends i06.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f286697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.Class jClass) {
        super(null);
        kotlin.jvm.internal.o.g(jClass, "jClass");
        java.lang.reflect.Method[] declaredMethods = jClass.getDeclaredMethods();
        kotlin.jvm.internal.o.f(declaredMethods, "getDeclaredMethods(...)");
        this.f286697a = kz5.z.q0(declaredMethods, new i06.m());
    }

    @Override // i06.t
    public java.lang.String a() {
        return kz5.n0.g0(this.f286697a, "", "<init>(", ")V", 0, null, i06.l.f286688d, 24, null);
    }
}
