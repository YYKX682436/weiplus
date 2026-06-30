package j06;

/* loaded from: classes16.dex */
public final class f0 extends j06.i0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.reflect.Method method) {
        super(method, false, null, 6, null);
        kotlin.jvm.internal.o.g(method, "method");
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        return e(args[0], args.length <= 1 ? new java.lang.Object[0] : kz5.v.s(args, 1, args.length));
    }
}
