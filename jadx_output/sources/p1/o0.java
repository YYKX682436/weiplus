package p1;

/* loaded from: classes14.dex */
public final class o0 implements p1.c, p2.f, kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f350859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.q0 f350860e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.q f350861f;

    /* renamed from: g, reason: collision with root package name */
    public p1.n f350862g;

    /* renamed from: h, reason: collision with root package name */
    public final oz5.l f350863h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1.q0 f350864i;

    public o0(p1.q0 q0Var, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        this.f350864i = q0Var;
        this.f350859d = completion;
        this.f350860e = q0Var;
        this.f350862g = p1.n.Main;
        this.f350863h = oz5.m.f350329d;
    }

    @Override // p2.f
    public int G(float f17) {
        return this.f350860e.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.f350860e.H(j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return this.f350860e.R(f17);
    }

    public java.lang.Object b(p1.n nVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        this.f350862g = nVar;
        this.f350861f = rVar;
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public long c() {
        p1.q0 q0Var = this.f350864i;
        long t17 = q0Var.t(q0Var.f350866f.e());
        s1.z zVar = q0Var.f350925d;
        long j17 = zVar != null ? ((u1.c1) zVar).f402052f : 0L;
        return d1.l.a(java.lang.Math.max(0.0f, d1.k.d(t17) - ((int) (j17 >> 32))) / 2.0f, java.lang.Math.max(0.0f, d1.k.b(t17) - p2.q.b(j17)) / 2.0f);
    }

    @Override // p2.f
    public long e(long j17) {
        return this.f350860e.e(j17);
    }

    public final void g(p1.l event, p1.n pass) {
        kotlinx.coroutines.q qVar;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(pass, "pass");
        if (pass != this.f350862g || (qVar = this.f350861f) == null) {
            return;
        }
        this.f350861f = null;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(event));
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return this.f350863h;
    }

    @Override // p2.f
    public float getDensity() {
        return this.f350860e.getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.f350860e.getFontScale();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.r2] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r14v0, types: [yz5.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(long r12, yz5.p r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof p1.l0
            if (r0 == 0) goto L13
            r0 = r15
            p1.l0 r0 = (p1.l0) r0
            int r1 = r0.f350848g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f350848g = r1
            goto L18
        L13:
            p1.l0 r0 = new p1.l0
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.f350846e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f350848g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r12 = r0.f350845d
            kotlinx.coroutines.r2 r12 = (kotlinx.coroutines.r2) r12
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L2c
            goto L71
        L2c:
            r13 = move-exception
            goto L75
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            kotlin.ResultKt.throwOnFailure(r15)
            r5 = 0
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 > 0) goto L55
            kotlinx.coroutines.q r15 = r11.f350861f
            if (r15 == 0) goto L55
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            p1.o r2 = new p1.o
            r2.<init>(r12)
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m521constructorimpl(r2)
            r15.resumeWith(r2)
        L55:
            p1.q0 r15 = r11.f350864i
            kotlinx.coroutines.y0 r5 = r15.f350873p
            r6 = 0
            r7 = 0
            p1.m0 r8 = new p1.m0
            r8.<init>(r12, r11, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.r2 r12 = kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            r0.f350845d = r12     // Catch: java.lang.Throwable -> L2c
            r0.f350848g = r3     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r15 = r14.invoke(r11, r0)     // Catch: java.lang.Throwable -> L2c
            if (r15 != r1) goto L71
            return r1
        L71:
            kotlinx.coroutines.p2.a(r12, r4, r3, r4)
            return r15
        L75:
            kotlinx.coroutines.p2.a(r12, r4, r3, r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.i(long, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(long r5, yz5.p r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p1.n0
            if (r0 == 0) goto L13
            r0 = r8
            p1.n0 r0 = (p1.n0) r0
            int r1 = r0.f350858f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f350858f = r1
            goto L18
        L13:
            p1.n0 r0 = new p1.n0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f350856d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f350858f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: p1.o -> L3b
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.f350858f = r3     // Catch: p1.o -> L3b
            java.lang.Object r8 = r4.i(r5, r7, r0)     // Catch: p1.o -> L3b
            if (r8 != r1) goto L3c
            return r1
        L3b:
            r8 = 0
        L3c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.j(long, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p2.f
    public float n(int i17) {
        return this.f350860e.n(i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return this.f350860e.o(f17);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        p1.q0 q0Var = this.f350864i;
        synchronized (q0Var.f350869i) {
            q0Var.f350869i.k(this);
        }
        this.f350859d.resumeWith(obj);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.f350860e.t(j17);
    }

    @Override // p2.f
    public long z(float f17) {
        return this.f350860e.z(f17);
    }
}
