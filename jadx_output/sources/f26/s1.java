package f26;

/* loaded from: classes14.dex */
public abstract class s1 {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f26.r1 a(f26.r1 r7, p06.k r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "newAnnotations"
            kotlin.jvm.internal.o.g(r8, r0)
            p06.k r0 = f26.p.a(r7)
            if (r0 != r8) goto L11
            return r7
        L11:
            b06.c r0 = f26.p.f259205b
            f06.v[] r1 = f26.p.f259204a
            r2 = 0
            r1 = r1[r2]
            l26.a0 r0 = (l26.a0) r0
            java.lang.Object r0 = r0.b(r7, r1)
            f26.o r0 = (f26.o) r0
            r1 = 1
            if (r0 == 0) goto L65
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L2a
            goto L59
        L2a:
            l26.d r3 = r7.f315227d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L35:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r3.next()
            r6 = r5
            f26.o1 r6 = (f26.o1) r6
            boolean r6 = kotlin.jvm.internal.o.b(r6, r0)
            r6 = r6 ^ r1
            if (r6 == 0) goto L35
            r4.add(r5)
            goto L35
        L4d:
            int r0 = r4.size()
            l26.d r3 = r7.f315227d
            int r3 = r3.d()
            if (r0 != r3) goto L5b
        L59:
            r0 = r7
            goto L61
        L5b:
            f26.q1 r0 = f26.r1.f259214e
            f26.r1 r0 = r0.b(r4)
        L61:
            if (r0 != 0) goto L64
            goto L65
        L64:
            r7 = r0
        L65:
            java.util.Iterator r0 = r8.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L76
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L76
            return r7
        L76:
            f26.o r0 = new f26.o
            r0.<init>(r8)
            java.lang.Class<f26.o> r8 = f26.o.class
            f06.d r8 = kotlin.jvm.internal.i0.a(r8)
            f26.q1 r3 = f26.r1.f259214e
            r3.getClass()
            java.lang.String r4 = "kClass"
            kotlin.jvm.internal.o.g(r8, r4)
            java.lang.String r8 = r8.d()
            kotlin.jvm.internal.o.d(r8)
            int r8 = r3.a(r8)
            l26.d r4 = r7.f315227d
            java.lang.Object r8 = r4.get(r8)
            if (r8 == 0) goto L9f
            r2 = r1
        L9f:
            if (r2 == 0) goto La2
            goto Lbe
        La2:
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto Lb2
            f26.r1 r7 = new f26.r1
            java.util.List r8 = kz5.b0.c(r0)
            r7.<init>(r8)
            goto Lbe
        Lb2:
            java.util.List r7 = kz5.n0.S0(r7)
            java.util.List r7 = kz5.n0.u0(r7, r0)
            f26.r1 r7 = r3.b(r7)
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f26.s1.a(f26.r1, p06.k):f26.r1");
    }

    public static final f26.r1 b(p06.k kVar) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        if (!kVar.isEmpty()) {
            return f26.r1.f259214e.b(kz5.b0.c(new f26.o(kVar)));
        }
        f26.r1.f259214e.getClass();
        return f26.r1.f259215f;
    }
}
