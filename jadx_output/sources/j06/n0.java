package j06;

/* loaded from: classes16.dex */
public abstract class n0 implements j06.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f297070a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f297071b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Type f297072c;

    public n0(java.lang.reflect.Method method, java.util.List list, kotlin.jvm.internal.i iVar) {
        this.f297070a = method;
        this.f297071b = list;
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.o.f(returnType, "getReturnType(...)");
        this.f297072c = returnType;
    }

    @Override // j06.k
    public final java.util.List a() {
        return this.f297071b;
    }

    @Override // j06.k
    public /* bridge */ /* synthetic */ java.lang.reflect.Member b() {
        return null;
    }

    @Override // j06.k
    public final java.lang.reflect.Type getReturnType() {
        return this.f297072c;
    }
}
