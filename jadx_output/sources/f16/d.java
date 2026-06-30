package f16;

/* loaded from: classes16.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f16.e f258713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f16.e eVar, i26.o oVar) {
        super(1);
        this.f258713d = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if ((r3 instanceof f26.y0) == true) goto L13;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            f16.a r13 = (f16.a) r13
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r13, r0)
            f16.e r0 = r12.f258713d
            r1 = r0
            f16.c1 r1 = (f16.c1) r1
            boolean r1 = r1.f258712e
            r2 = 0
            i26.i r3 = r13.f258695a
            if (r1 == 0) goto L4c
            if (r3 == 0) goto L47
            boolean r1 = r3 instanceof f26.o0
            if (r1 == 0) goto L1f
            boolean r1 = r3 instanceof f26.y0
            r4 = 1
            if (r1 != r4) goto L47
            goto L48
        L1f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "ClassicTypeSystemContext couldn't handle: "
            r13.<init>(r0)
            r13.append(r3)
            java.lang.String r0 = ", "
            r13.append(r0)
            java.lang.Class r0 = r3.getClass()
            f06.d r0 = kotlin.jvm.internal.i0.a(r0)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L47:
            r4 = 0
        L48:
            if (r4 == 0) goto L4c
            goto Lca
        L4c:
            if (r3 == 0) goto Lca
            g26.w r1 = g26.w.f268018a
            i26.m r4 = r1.S(r3)
            if (r4 == 0) goto Lca
            java.util.List r4 = g26.b.q(r1, r4)
            java.util.List r3 = g26.b.n(r1, r3)
            java.util.Iterator r5 = r4.iterator()
            java.util.Iterator r6 = r3.iterator()
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r4 = kz5.d0.q(r4, r8)
            int r3 = kz5.d0.q(r3, r8)
            int r3 = java.lang.Math.min(r4, r3)
            r7.<init>(r3)
        L79:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto Lc9
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto Lc9
            java.lang.Object r3 = r5.next()
            java.lang.Object r4 = r6.next()
            i26.l r4 = (i26.l) r4
            i26.n r3 = (i26.n) r3
            boolean r8 = g26.b.Q(r1, r4)
            x06.l0 r9 = r13.f258696b
            if (r8 == 0) goto L9f
            f16.a r4 = new f16.a
            r4.<init>(r2, r9, r3)
            goto Lc5
        L9f:
            i26.i r4 = g26.b.u(r1, r4)
            f16.a r8 = new f16.a
            r0.getClass()
            r10 = r0
            f16.c1 r10 = (f16.c1) r10
            a16.l r10 = r10.f258710c
            a16.d r10 = r10.f649a
            x06.e r10 = r10.f631q
            java.lang.String r11 = "<this>"
            kotlin.jvm.internal.o.g(r4, r11)
            r11 = r4
            f26.o0 r11 = (f26.o0) r11
            p06.k r11 = r11.getAnnotations()
            x06.l0 r9 = r10.b(r9, r11)
            r8.<init>(r4, r9, r3)
            r4 = r8
        Lc5:
            r7.add(r4)
            goto L79
        Lc9:
            r2 = r7
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f16.d.invoke(java.lang.Object):java.lang.Object");
    }
}
