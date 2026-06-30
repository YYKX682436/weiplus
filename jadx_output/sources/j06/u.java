package j06;

/* loaded from: classes16.dex */
public abstract class u extends j06.j0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(java.lang.reflect.Field r7, boolean r8, kotlin.jvm.internal.i r9) {
        /*
            r6 = this;
            java.lang.reflect.Type r2 = r7.getGenericType()
            java.lang.String r9 = "getGenericType(...)"
            kotlin.jvm.internal.o.f(r2, r9)
            if (r8 == 0) goto L10
            java.lang.Class r8 = r7.getDeclaringClass()
            goto L11
        L10:
            r8 = 0
        L11:
            r3 = r8
            r8 = 0
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.u.<init>(java.lang.reflect.Field, boolean, kotlin.jvm.internal.i):void");
    }

    @Override // j06.k
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        c(args);
        return ((java.lang.reflect.Field) this.f297063a).get(this.f297065c != null ? kz5.z.L(args) : null);
    }
}
