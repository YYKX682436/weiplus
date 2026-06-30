package x06;

/* loaded from: classes15.dex */
public final class j extends x06.g1 {

    /* renamed from: m, reason: collision with root package name */
    public static final x06.j f451264m = new x06.j();

    /* JADX WARN: Multi-variable type inference failed */
    public static final o06.n0 a(o06.n0 functionDescriptor) {
        kotlin.jvm.internal.o.g(functionDescriptor, "functionDescriptor");
        x06.j jVar = f451264m;
        n16.g name = ((r06.v) functionDescriptor).getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        if (jVar.b(name)) {
            return (o06.n0) v16.f.b(functionDescriptor, false, x06.h.f451254d, 1, null);
        }
        return null;
    }

    public final boolean b(n16.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<this>");
        return x06.g1.f451247f.contains(gVar);
    }
}
