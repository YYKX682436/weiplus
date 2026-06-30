package j06;

/* loaded from: classes16.dex */
public abstract class i0 extends j06.j0 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f297062e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ i0(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto Le
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            r2 = r2 ^ 1
        Le:
            r4 = r4 & 4
            if (r4 == 0) goto L1b
            java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
            java.lang.String r4 = "getGenericParameterTypes(...)"
            kotlin.jvm.internal.o.f(r3, r4)
        L1b:
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.i0.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.i):void");
    }

    public final java.lang.Object e(java.lang.Object obj, java.lang.Object[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        return this.f297062e ? jz5.f0.f302826a : ((java.lang.reflect.Method) this.f297063a).invoke(obj, java.util.Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9, kotlin.jvm.internal.i r10) {
        /*
            r6 = this;
            java.lang.reflect.Type r10 = r7.getGenericReturnType()
            java.lang.String r0 = "getGenericReturnType(...)"
            kotlin.jvm.internal.o.f(r10, r0)
            if (r8 == 0) goto L10
            java.lang.Class r8 = r7.getDeclaringClass()
            goto L11
        L10:
            r8 = 0
        L11:
            r3 = r8
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r10
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r7 = kotlin.jvm.internal.o.b(r10, r7)
            r6.f297062e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j06.i0.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], kotlin.jvm.internal.i):void");
    }
}
