package sc;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f405632a;

    public j(java.lang.Class clazz, java.lang.String name) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        kotlin.jvm.internal.o.g(name, "name");
        this.f405632a = jz5.h.b(new sc.i(clazz, name));
    }

    public final java.lang.Object a(java.lang.Object thisRef, f06.v property) {
        kotlin.jvm.internal.o.g(thisRef, "thisRef");
        kotlin.jvm.internal.o.g(property, "property");
        return ((java.lang.reflect.Field) ((jz5.n) this.f405632a).getValue()).get(thisRef);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String className, java.lang.String name) {
        this(java.lang.Class.forName(className), name);
        kotlin.jvm.internal.o.g(className, "className");
        kotlin.jvm.internal.o.g(name, "name");
    }
}
