package h4;

/* loaded from: classes14.dex */
public final class i extends h4.k0 {

    /* renamed from: e, reason: collision with root package name */
    public final h4.a f278663e;

    /* renamed from: f, reason: collision with root package name */
    public h4.g0 f278664f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f278665g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.z f278666h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f278667i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h4.r f278668j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h4.r rVar) {
        super(rVar.f278687b);
        this.f278668j = rVar;
        int i17 = rVar.f278688c;
        this.f278663e = i17 > 0 ? new h4.b(i17) : new h4.a0();
        this.f278667i = new java.util.ArrayList();
    }

    public final void c() {
        if (this.f278664f == null) {
            h4.r rVar = this.f278668j;
            h4.g0 g0Var = new h4.g0(rVar.f278687b, rVar.f278692g, new h4.h(this));
            this.f278664f = g0Var;
            this.f278665g = false;
            kotlinx.coroutines.l.d(g0Var.f278657b, null, null, new h4.f0(g0Var, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(h4.j r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.i.d(h4.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(h4.k r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof h4.d
            if (r0 == 0) goto L13
            r0 = r8
            h4.d r0 = (h4.d) r0
            int r1 = r0.f278636e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278636e = r1
            goto L18
        L13:
            h4.d r0 = new h4.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f278635d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f278636e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f278638g
            h4.i r7 = (h4.i) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.ResultKt.throwOnFailure(r8)
            h4.j r8 = new h4.j
            u26.y0 r7 = r7.f278676a
            r2 = 2
            r4 = 0
            r5 = 0
            r8.<init>(r7, r5, r2, r4)
            r0.f278638g = r6
            r0.f278636e = r3
            java.lang.Object r7 = r6.d(r8, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r7 = r6
        L4c:
            r7.c()
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.i.e(h4.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(h4.n r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof h4.e
            if (r0 == 0) goto L13
            r0 = r9
            h4.e r0 = (h4.e) r0
            int r1 = r0.f278641e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278641e = r1
            goto L18
        L13:
            h4.e r0 = new h4.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f278640d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f278641e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L46
            if (r2 == r3) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.f278644h
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.f278643g
            h4.n r2 = (h4.n) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.f278644h
            h4.n r8 = (h4.n) r8
            java.lang.Object r2 = r0.f278643g
            h4.i r2 = (h4.i) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5d
        L46:
            kotlin.ResultKt.throwOnFailure(r9)
            h4.r r9 = r7.f278668j
            yz5.p r9 = r9.f278690e
            java.lang.Object r2 = r8.f278683a
            r0.f278643g = r7
            r0.f278644h = r8
            r0.f278641e = r3
            java.lang.Object r9 = r9.invoke(r2, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r2 = r7
        L5d:
            h4.a r9 = r2.f278663e
            r9.a(r8)
            r2.f278665g = r3
            h4.a r9 = r2.f278663e
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L70
            kotlinx.coroutines.z r9 = r8.f278684b
            r2.f278666h = r9
        L70:
            java.util.List r9 = r2.f278667i
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
            r2 = r8
            r8 = r9
        L7a:
            boolean r9 = r8.hasNext()
            jz5.f0 r5 = jz5.f0.f302826a
            if (r9 == 0) goto L9e
            java.lang.Object r9 = r8.next()
            h4.j r9 = (h4.j) r9
            r0.f278643g = r2
            r0.f278644h = r8
            r0.f278641e = r4
            r9.f278671b = r3
            u26.y0 r9 = r9.f278670a
            java.lang.Object r9 = r9.t(r2, r0)
            pz5.a r6 = pz5.a.f359186d
            if (r9 != r6) goto L9b
            r5 = r9
        L9b:
            if (r5 != r1) goto L7a
            return r1
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.i.f(h4.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(u26.y0 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof h4.f
            if (r0 == 0) goto L13
            r0 = r11
            h4.f r0 = (h4.f) r0
            int r1 = r0.f278648e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278648e = r1
            goto L18
        L13:
            h4.f r0 = new h4.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f278647d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f278648e
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L95
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.List r11 = r9.f278667i
            r2 = r11
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
            r6 = r5
        L40:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L69
            java.lang.Object r7 = r2.next()
            h4.j r7 = (h4.j) r7
            r7.getClass()
            java.lang.String r8 = "channel"
            kotlin.jvm.internal.o.g(r10, r8)
            u26.y0 r7 = r7.f278670a
            if (r7 != r10) goto L5a
            r7 = r4
            goto L5b
        L5a:
            r7 = r5
        L5b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L66
            goto L6a
        L66:
            int r6 = r6 + 1
            goto L40
        L69:
            r6 = -1
        L6a:
            if (r6 < 0) goto L95
            r10 = r11
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.remove(r6)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            boolean r10 = r11.isEmpty()
            if (r10 == 0) goto L95
            h4.r r10 = r9.f278668j
            boolean r10 = r10.f278691f
            if (r10 != 0) goto L95
            h4.g0 r10 = r9.f278664f
            if (r10 == 0) goto L95
            r0.f278648e = r4
            kotlinx.coroutines.r2 r10 = r10.f278656a
            java.lang.Object r10 = kotlinx.coroutines.v2.d(r10, r0)
            pz5.a r11 = pz5.a.f359186d
            if (r10 != r11) goto L91
            goto L92
        L91:
            r10 = r3
        L92:
            if (r10 != r1) goto L95
            return r1
        L95:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.i.g(u26.y0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(h4.q r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.i.h(h4.q, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
