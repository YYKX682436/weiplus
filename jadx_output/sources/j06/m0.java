package j06;

/* loaded from: classes16.dex */
public final class m0 extends j06.n0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.reflect.Method unboxMethod) {
        super(unboxMethod, kz5.b0.c(unboxMethod.getDeclaringClass()), null);
        kotlin.jvm.internal.o.g(unboxMethod, "unboxMethod");
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        java.lang.Object obj = args[0];
        java.lang.Object[] s17 = args.length <= 1 ? new java.lang.Object[0] : kz5.v.s(args, 1, args.length);
        return this.f297070a.invoke(obj, java.util.Arrays.copyOf(s17, s17.length));
    }
}
