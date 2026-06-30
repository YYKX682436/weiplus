package j06;

/* loaded from: classes16.dex */
public final class g0 extends j06.i0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.reflect.Method method) {
        super(method, true, null, 4, null);
        kotlin.jvm.internal.o.g(method, "method");
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        d(kz5.z.O(args));
        return e(null, args.length <= 1 ? new java.lang.Object[0] : kz5.v.s(args, 1, args.length));
    }
}
