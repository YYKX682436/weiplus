package j0;

/* loaded from: classes14.dex */
public final /* synthetic */ class f4 extends kotlin.jvm.internal.m implements yz5.l {
    public f4(java.lang.Object obj) {
        super(1, obj, j0.e4.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (kotlin.jvm.internal.o.b(r12.f302932g, r6.f267693a) == false) goto L32;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            n1.b r12 = (n1.b) r12
            android.view.KeyEvent r12 = r12.f334029a
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.Object r0 = r11.receiver
            j0.e4 r0 = (j0.e4) r0
            r0.getClass()
            int r1 = r12.getAction()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L20
            int r1 = r12.getUnicodeChar()
            if (r1 == 0) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = r2
        L21:
            r4 = 0
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r5 = r12.getUnicodeChar()
            java.lang.StringBuilder r1 = r1.appendCodePoint(r5)
            java.lang.String r5 = "appendCodePointX"
            kotlin.jvm.internal.o.f(r1, r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "StringBuilder().appendCo…              .toString()"
            kotlin.jvm.internal.o.f(r1, r5)
            g2.a r5 = new g2.a
            r5.<init>(r1, r3)
            goto L46
        L45:
            r5 = r4
        L46:
            k0.i1 r1 = r0.f296277f
            boolean r6 = r0.f296275d
            if (r5 == 0) goto L59
            if (r6 == 0) goto Lbf
            java.util.List r12 = kz5.b0.c(r5)
            r0.a(r12)
            r1.f302925a = r4
            r2 = r3
            goto Lbf
        L59:
            int r4 = n1.c.b(r12)
            r5 = 2
            if (r4 != r5) goto L62
            r4 = r3
            goto L63
        L62:
            r4 = r2
        L63:
            if (r4 != 0) goto L66
            goto Lbf
        L66:
            j0.a2 r4 = r0.f296280i
            j0.z1 r12 = r4.a(r12)
            if (r12 == 0) goto Lbf
            boolean r4 = r12.f296694d
            if (r4 == 0) goto L75
            if (r6 != 0) goto L75
            goto Lbf
        L75:
            kotlin.jvm.internal.c0 r2 = new kotlin.jvm.internal.c0
            r2.<init>()
            r2.f310112d = r3
            j0.d4 r4 = new j0.d4
            r4.<init>(r12, r0, r2)
            k0.p0 r12 = new k0.p0
            j0.c5 r5 = r0.f296272a
            j0.d5 r5 = r5.f296239g
            g2.e0 r6 = r0.f296274c
            g2.v r7 = r0.f296278g
            r12.<init>(r6, r7, r5, r1)
            r4.invoke(r12)
            long r4 = r12.f302931f
            long r7 = r6.f267694b
            boolean r1 = a2.m1.a(r4, r7)
            if (r1 == 0) goto La5
            a2.d r1 = r6.f267693a
            a2.d r4 = r12.f302932g
            boolean r1 = kotlin.jvm.internal.o.b(r4, r1)
            if (r1 != 0) goto Lb7
        La5:
            g2.e0 r4 = r12.f302955h
            a2.d r5 = r12.f302932g
            long r6 = r12.f302931f
            r8 = 0
            r9 = 4
            r10 = 0
            g2.e0 r12 = g2.e0.a(r4, r5, r6, r8, r9, r10)
            yz5.l r1 = r0.f296281j
            r1.invoke(r12)
        Lb7:
            j0.h5 r12 = r0.f296279h
            if (r12 == 0) goto Lbd
            r12.f296324f = r3
        Lbd:
            boolean r2 = r2.f310112d
        Lbf:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.f4.invoke(java.lang.Object):java.lang.Object");
    }
}
