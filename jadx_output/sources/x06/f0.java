package x06;

/* loaded from: classes15.dex */
public final class f0 implements r16.l {

    /* renamed from: a, reason: collision with root package name */
    public static final x06.e0 f451234a = new x06.e0(null);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (((java.util.ArrayList) x06.g1.f451252k).contains(r0) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, g16.w0.a(r2, false, false, 2, null)) != false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r16.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r16.k a(o06.b r9, o06.b r10, o06.g r11) {
        /*
            r8 = this;
            java.lang.String r0 = "superDescriptor"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "subDescriptor"
            kotlin.jvm.internal.o.g(r10, r0)
            boolean r0 = r9 instanceof o06.d
            r1 = 0
            if (r0 == 0) goto Lb3
            boolean r0 = r10 instanceof o06.n0
            if (r0 == 0) goto Lb3
            boolean r0 = l06.o.A(r10)
            if (r0 == 0) goto L1b
            goto Lb3
        L1b:
            x06.j r0 = x06.j.f451264m
            r2 = r10
            o06.n0 r2 = (o06.n0) r2
            r3 = r2
            r06.v r3 = (r06.v) r3
            n16.g r4 = r3.getName()
            java.lang.String r5 = "getName(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            boolean r0 = r0.b(r4)
            if (r0 != 0) goto L47
            x06.c1 r0 = x06.g1.f451242a
            n16.g r0 = r3.getName()
            kotlin.jvm.internal.o.f(r0, r5)
            java.util.List r3 = x06.g1.f451252k
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L47
            goto Lb3
        L47:
            r0 = r9
            o06.d r0 = (o06.d) r0
            o06.d r0 = x06.a1.c(r0)
            boolean r3 = r9 instanceof o06.n0
            r4 = 0
            if (r3 == 0) goto L57
            r5 = r9
            o06.n0 r5 = (o06.n0) r5
            goto L58
        L57:
            r5 = r4
        L58:
            r6 = 1
            if (r5 == 0) goto L67
            boolean r7 = r2.r0()
            boolean r5 = r5.r0()
            if (r7 != r5) goto L67
            r5 = r6
            goto L68
        L67:
            r5 = r1
        L68:
            r5 = r5 ^ r6
            if (r5 == 0) goto L74
            if (r0 == 0) goto Lb2
            boolean r5 = r2.r0()
            if (r5 != 0) goto L74
            goto Lb2
        L74:
            boolean r5 = r11 instanceof z06.c
            if (r5 == 0) goto Lb3
            o06.n0 r5 = r2.o0()
            if (r5 == 0) goto L7f
            goto Lb3
        L7f:
            if (r0 == 0) goto Lb3
            boolean r11 = x06.a1.d(r11, r0)
            if (r11 == 0) goto L88
            goto Lb3
        L88:
            boolean r11 = r0 instanceof o06.n0
            if (r11 == 0) goto Lb2
            if (r3 == 0) goto Lb2
            o06.n0 r0 = (o06.n0) r0
            o06.n0 r11 = x06.j.a(r0)
            if (r11 == 0) goto Lb2
            r11 = 2
            java.lang.String r0 = g16.w0.a(r2, r1, r1, r11, r4)
            r2 = r9
            o06.n0 r2 = (o06.n0) r2
            o06.n0 r2 = r2.a()
            java.lang.String r3 = "getOriginal(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            java.lang.String r11 = g16.w0.a(r2, r1, r1, r11, r4)
            boolean r11 = kotlin.jvm.internal.o.b(r0, r11)
            if (r11 == 0) goto Lb2
            goto Lb3
        Lb2:
            r1 = r6
        Lb3:
            r16.k r11 = r16.k.INCOMPATIBLE
            if (r1 == 0) goto Lb8
            return r11
        Lb8:
            x06.e0 r0 = x06.f0.f451234a
            boolean r9 = r0.a(r9, r10)
            if (r9 == 0) goto Lc1
            return r11
        Lc1:
            r16.k r9 = r16.k.UNKNOWN
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x06.f0.a(o06.b, o06.b, o06.g):r16.k");
    }

    @Override // r16.l
    public r16.j b() {
        return r16.j.CONFLICTS_ONLY;
    }
}
