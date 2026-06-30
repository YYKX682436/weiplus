package j06;

/* loaded from: classes16.dex */
public abstract class a0 extends j06.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f297039e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a0(java.lang.reflect.Field r7, boolean r8, boolean r9, kotlin.jvm.internal.i r10) {
        /*
            r6 = this;
            java.lang.Class r2 = java.lang.Void.TYPE
            java.lang.String r10 = "TYPE"
            kotlin.jvm.internal.o.f(r2, r10)
            if (r9 == 0) goto Le
            java.lang.Class r9 = r7.getDeclaringClass()
            goto Lf
        Le:
            r9 = 0
        Lf:
            r3 = r9
            r9 = 1
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
            java.lang.reflect.Type r9 = r7.getGenericType()
            java.lang.String r10 = "getGenericType(...)"
            kotlin.jvm.internal.o.f(r9, r10)
            r10 = 0
            r4[r10] = r9
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f297039e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.a0.<init>(java.lang.reflect.Field, boolean, boolean, kotlin.jvm.internal.i):void");
    }

    @Override // j06.j0
    public void c(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        j06.j.a(this, args);
        if (this.f297039e && kz5.z.f0(args) == null) {
            throw new java.lang.IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        c(args);
        ((java.lang.reflect.Field) this.f297063a).set(this.f297065c != null ? kz5.z.L(args) : null, kz5.z.f0(args));
        return jz5.f0.f302826a;
    }
}
