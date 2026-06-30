package j06;

/* loaded from: classes16.dex */
public final class b0 extends j06.i0 implements j06.i {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f297043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.reflect.Method method, java.lang.Object obj) {
        super(method, false, null, 4, null);
        kotlin.jvm.internal.o.g(method, "method");
        this.f297043f = obj;
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        return e(this.f297043f, args);
    }
}
