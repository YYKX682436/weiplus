package i06;

/* loaded from: classes15.dex */
public final class p extends i06.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Constructor f286716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.reflect.Constructor constructor) {
        super(null);
        kotlin.jvm.internal.o.g(constructor, "constructor");
        this.f286716a = constructor;
    }

    @Override // i06.t
    public java.lang.String a() {
        java.lang.Class<?>[] parameterTypes = this.f286716a.getParameterTypes();
        kotlin.jvm.internal.o.f(parameterTypes, "getParameterTypes(...)");
        return kz5.z.d0(parameterTypes, "", "<init>(", ")V", 0, null, i06.o.f286709d, 24, null);
    }
}
