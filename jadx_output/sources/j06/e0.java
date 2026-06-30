package j06;

/* loaded from: classes16.dex */
public final class e0 extends j06.i0 implements j06.i {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f297058f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(java.lang.reflect.Method r4, java.lang.Object[] r5) {
        /*
            r3 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "boundReceiverComponents"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
            java.lang.String r1 = "getGenericParameterTypes(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            int r1 = r5.length
            java.util.List r0 = kz5.z.H(r0, r1)
            r1 = 0
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            r2 = 0
            r3.<init>(r4, r1, r0, r2)
            r3.f297058f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.e0.<init>(java.lang.reflect.Method, java.lang.Object[]):void");
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0(2);
        l0Var.b(this.f297058f);
        l0Var.b(args);
        return e(null, l0Var.d(new java.lang.Object[l0Var.c()]));
    }
}
