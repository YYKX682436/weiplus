package eq1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public volatile kotlinx.coroutines.r2 f255866a;

    /* renamed from: b, reason: collision with root package name */
    public volatile kotlin.Result f255867b;

    /* renamed from: c, reason: collision with root package name */
    public volatile yz5.l f255868c;

    /* renamed from: e, reason: collision with root package name */
    public long f255870e;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f255869d = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    /* renamed from: f, reason: collision with root package name */
    public final eq1.m f255871f = new eq1.m(this);

    public final void a() {
        try {
            kotlinx.coroutines.r2 r2Var = this.f255866a;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.z0.e(this.f255869d, null, 1, null);
            this.f255868c = null;
            this.f255867b = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterBizGetPOIHelper", "release failed: " + e17.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof eq1.n
            if (r0 == 0) goto L13
            r0 = r13
            eq1.n r0 = (eq1.n) r0
            int r1 = r0.f255836g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255836g = r1
            goto L18
        L13:
            eq1.n r0 = new eq1.n
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f255834e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f255836g
            java.lang.String r3 = "FlutterBizGetPOIHelper"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r12 = r0.f255833d
            eq1.u r12 = (eq1.u) r12
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L2d
            goto L68
        L2d:
            r12 = move-exception
            goto L83
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.String r13 = "requestPOI"
            com.tencent.mars.xlog.Log.i(r3, r13)
            kotlinx.coroutines.r2 r13 = r11.f255866a
            r2 = 0
            if (r13 == 0) goto L47
            kotlinx.coroutines.p2.a(r13, r2, r4, r2)
        L47:
            kotlinx.coroutines.y0 r5 = r11.f255869d
            r6 = 0
            r7 = 0
            eq1.r r8 = new eq1.r
            r8.<init>(r11, r12, r2)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.r2 r12 = kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            r11.f255866a = r12
            kotlinx.coroutines.r2 r12 = r11.f255866a     // Catch: java.lang.Exception -> L2d
            if (r12 == 0) goto L67
            r0.f255833d = r11     // Catch: java.lang.Exception -> L2d
            r0.f255836g = r4     // Catch: java.lang.Exception -> L2d
            java.lang.Object r12 = r12.C(r0)     // Catch: java.lang.Exception -> L2d
            if (r12 != r1) goto L67
            return r1
        L67:
            r12 = r11
        L68:
            kotlin.Result r12 = r12.f255867b
            if (r12 == 0) goto L71
            java.lang.Object r12 = r12.getValue()
            goto L82
        L71:
            kotlin.Result$Companion r12 = kotlin.Result.INSTANCE
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "No Location"
            r12.<init>(r13)
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m521constructorimpl(r12)
        L82:
            return r12
        L83:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "requestLocationJob join failed: "
            r13.<init>(r0)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.mars.xlog.Log.e(r3, r12)
            kotlin.Result$Companion r12 = kotlin.Result.INSTANCE
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Location request failed"
            r12.<init>(r13)
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m521constructorimpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.u.b(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof eq1.s
            if (r0 == 0) goto L13
            r0 = r5
            eq1.s r0 = (eq1.s) r0
            int r1 = r0.f255861g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255861g = r1
            goto L18
        L13:
            eq1.s r0 = new eq1.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f255859e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f255861g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f255858d
            eq1.u r0 = (eq1.u) r0
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.getValue()
            goto L68
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Result r5 = r4.f255867b
            if (r5 == 0) goto L5c
            kotlin.Result r5 = r4.f255867b
            r2 = 0
            if (r5 == 0) goto L50
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.Result.m528isSuccessimpl(r5)
            if (r5 != r3) goto L50
            r2 = r3
        L50:
            if (r2 == 0) goto L5c
            kotlin.Result r5 = r4.f255867b
            kotlin.jvm.internal.o.d(r5)
            java.lang.Object r5 = r5.getValue()
            return r5
        L5c:
            r0.f255858d = r4
            r0.f255861g = r3
            java.lang.Object r5 = r4.b(r3, r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            r0 = r4
        L68:
            kotlin.Result r1 = kotlin.Result.m520boximpl(r5)
            r0.f255867b = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.u.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof eq1.t
            if (r0 == 0) goto L13
            r0 = r11
            eq1.t r0 = (eq1.t) r0
            int r1 = r0.f255865g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255865g = r1
            goto L18
        L13:
            eq1.t r0 = new eq1.t
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f255863e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f255865g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.f255862d
            eq1.u r0 = (eq1.u) r0
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            goto L6d
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L39:
            kotlin.ResultKt.throwOnFailure(r11)
            long r4 = java.lang.System.currentTimeMillis()
            kotlin.Result r11 = r10.f255867b
            long r6 = r10.f255870e
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L60
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L60
            if (r11 == 0) goto L60
            java.lang.String r0 = "FlutterBizGetPOIHelper"
            java.lang.String r1 = "requestPOIWithFrequencyLimited, time not reach"
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.Object r11 = r11.getValue()
            return r11
        L60:
            r0.f255862d = r10
            r0.f255865g = r3
            r11 = 0
            java.lang.Object r11 = r10.b(r11, r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            r0 = r10
        L6d:
            long r1 = java.lang.System.currentTimeMillis()
            r0.f255870e = r1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.u.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
