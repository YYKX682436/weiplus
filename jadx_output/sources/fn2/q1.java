package fn2;

/* loaded from: classes10.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final sf2.d3 f264358a;

    /* renamed from: b, reason: collision with root package name */
    public r45.gx1 f264359b;

    /* renamed from: c, reason: collision with root package name */
    public r45.kx1 f264360c;

    /* renamed from: d, reason: collision with root package name */
    public r45.gx1 f264361d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kx1 f264362e;

    public q1(sf2.d3 controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f264358a = controller;
    }

    public static /* synthetic */ java.lang.Object b(fn2.q1 q1Var, com.tencent.mm.protobuf.g gVar, boolean z17, java.lang.Integer num, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            gVar = null;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            num = null;
        }
        return q1Var.a(gVar, z17, num, continuation);
    }

    public static /* synthetic */ java.lang.Object d(fn2.q1 q1Var, com.tencent.mm.protobuf.g gVar, boolean z17, java.lang.Integer num, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            gVar = null;
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            num = null;
        }
        return q1Var.c(gVar, z17, num, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.tencent.mm.protobuf.g r10, boolean r11, java.lang.Integer r12, kotlin.coroutines.Continuation r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof fn2.j1
            if (r0 == 0) goto L13
            r0 = r13
            fn2.j1 r0 = (fn2.j1) r0
            int r1 = r0.f264293h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264293h = r1
            goto L18
        L13:
            fn2.j1 r0 = new fn2.j1
            r0.<init>(r9, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.f264291f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f264293h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.throwOnFailure(r13)
            goto La5
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            java.lang.Object r10 = r6.f264290e
            fn2.q1 r10 = (fn2.q1) r10
            java.lang.Object r11 = r6.f264289d
            fn2.q1 r11 = (fn2.q1) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L76
        L40:
            kotlin.ResultKt.throwOnFailure(r13)
            r45.kx1 r13 = r9.f264360c
            java.lang.String r1 = "FinderLiveRequestedSongPlayListTabViewDataSource"
            if (r13 != 0) goto L4b
            if (r10 == 0) goto L4d
        L4b:
            if (r11 == 0) goto L81
        L4d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "Loading has sung list data, forceRefresh="
            r13.<init>(r2)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            com.tencent.mars.xlog.Log.i(r1, r11)
            sf2.d3 r1 = r9.f264358a
            r11 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            r6.f264289d = r9
            r6.f264290e = r9
            r6.f264293h = r3
            r2 = r10
            r3 = r11
            r5 = r12
            java.lang.Object r13 = sf2.d3.i7(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L74
            return r0
        L74:
            r10 = r9
            r11 = r10
        L76:
            r45.kx1 r13 = (r45.kx1) r13
            r10.f264360c = r13
            r45.kx1 r10 = r11.f264360c
            if (r10 == 0) goto Lac
            r45.ox1 r10 = r10.f379017g
            goto Lac
        L81:
            if (r10 == 0) goto La6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "Loading more has sung list data, pageDirection="
            r11.<init>(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r1, r11)
            sf2.d3 r1 = r9.f264358a
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            r6.f264293h = r2
            r2 = r10
            r5 = r12
            java.lang.Object r13 = sf2.d3.i7(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto La5
            return r0
        La5:
            return r13
        La6:
            java.lang.String r10 = "Using cached has sung list data"
            com.tencent.mars.xlog.Log.i(r1, r10)
            r11 = r9
        Lac:
            r45.kx1 r10 = r11.f264360c
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.q1.a(com.tencent.mm.protobuf.g, boolean, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.tencent.mm.protobuf.g r10, boolean r11, java.lang.Integer r12, kotlin.coroutines.Continuation r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof fn2.k1
            if (r0 == 0) goto L13
            r0 = r13
            fn2.k1 r0 = (fn2.k1) r0
            int r1 = r0.f264303h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264303h = r1
            goto L18
        L13:
            fn2.k1 r0 = new fn2.k1
            r0.<init>(r9, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.f264301f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f264303h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.ResultKt.throwOnFailure(r13)
            goto La5
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            java.lang.Object r10 = r6.f264300e
            fn2.q1 r10 = (fn2.q1) r10
            java.lang.Object r11 = r6.f264299d
            fn2.q1 r11 = (fn2.q1) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L76
        L40:
            kotlin.ResultKt.throwOnFailure(r13)
            r45.kx1 r13 = r9.f264362e
            java.lang.String r1 = "FinderLiveRequestedSongPlayListTabViewDataSource"
            if (r13 != 0) goto L4b
            if (r10 == 0) goto L4d
        L4b:
            if (r11 == 0) goto L81
        L4d:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "Loading my has sung list data, forceRefresh="
            r13.<init>(r2)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            com.tencent.mars.xlog.Log.i(r1, r11)
            sf2.d3 r1 = r9.f264358a
            r11 = 1
            r4 = 0
            r7 = 4
            r8 = 0
            r6.f264299d = r9
            r6.f264300e = r9
            r6.f264303h = r3
            r2 = r10
            r3 = r11
            r5 = r12
            java.lang.Object r13 = sf2.d3.i7(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L74
            return r0
        L74:
            r10 = r9
            r11 = r10
        L76:
            r45.kx1 r13 = (r45.kx1) r13
            r10.f264362e = r13
            r45.kx1 r10 = r11.f264362e
            if (r10 == 0) goto Lac
            r45.ox1 r10 = r10.f379017g
            goto Lac
        L81:
            if (r10 == 0) goto La6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "Loading more my has sung list data, pageDirection="
            r11.<init>(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r1, r11)
            sf2.d3 r1 = r9.f264358a
            r3 = 1
            r4 = 0
            r7 = 4
            r8 = 0
            r6.f264303h = r2
            r2 = r10
            r5 = r12
            java.lang.Object r13 = sf2.d3.i7(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto La5
            return r0
        La5:
            return r13
        La6:
            java.lang.String r10 = "Using cached my has sung list data"
            com.tencent.mars.xlog.Log.i(r1, r10)
            r11 = r9
        Lac:
            r45.kx1 r10 = r11.f264362e
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.q1.c(com.tencent.mm.protobuf.g, boolean, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof fn2.l1
            if (r0 == 0) goto L13
            r0 = r10
            fn2.l1 r0 = (fn2.l1) r0
            int r1 = r0.f264311h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264311h = r1
            goto L18
        L13:
            fn2.l1 r0 = new fn2.l1
            r0.<init>(r8, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f264309f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f264311h
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r9 = r5.f264308e
            fn2.q1 r9 = (fn2.q1) r9
            java.lang.Object r0 = r5.f264307d
            fn2.q1 r0 = (fn2.q1) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L73
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.gx1 r10 = r8.f264361d
            java.lang.String r1 = "FinderLiveRequestedSongPlayListTabViewDataSource"
            if (r10 == 0) goto L4b
            if (r9 == 0) goto L44
            goto L4b
        L44:
            java.lang.String r9 = "Using cached my to sing list data"
            com.tencent.mars.xlog.Log.i(r1, r9)
            r0 = r8
            goto L77
        L4b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "Loading my to sing list data, forceRefresh="
            r10.<init>(r3)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.mars.xlog.Log.i(r1, r9)
            sf2.d3 r1 = r8.f264358a
            r9 = 0
            r3 = 0
            r4 = 1
            r6 = 3
            r7 = 0
            r5.f264307d = r8
            r5.f264308e = r8
            r5.f264311h = r2
            r2 = r9
            java.lang.Object r10 = sf2.d3.l7(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L71
            return r0
        L71:
            r9 = r8
            r0 = r9
        L73:
            r45.gx1 r10 = (r45.gx1) r10
            r9.f264361d = r10
        L77:
            r45.gx1 r9 = r0.f264361d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.q1.e(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof fn2.m1
            if (r0 == 0) goto L13
            r0 = r10
            fn2.m1 r0 = (fn2.m1) r0
            int r1 = r0.f264331h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264331h = r1
            goto L18
        L13:
            fn2.m1 r0 = new fn2.m1
            r0.<init>(r8, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f264329f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f264331h
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r9 = r5.f264328e
            fn2.q1 r9 = (fn2.q1) r9
            java.lang.Object r0 = r5.f264327d
            fn2.q1 r0 = (fn2.q1) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L73
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.throwOnFailure(r10)
            r45.gx1 r10 = r8.f264359b
            java.lang.String r1 = "FinderLiveRequestedSongPlayListTabViewDataSource"
            if (r10 == 0) goto L4b
            if (r9 == 0) goto L44
            goto L4b
        L44:
            java.lang.String r9 = "Using cached to sing list data"
            com.tencent.mars.xlog.Log.i(r1, r9)
            r0 = r8
            goto L7d
        L4b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "Loading to sing list data, forceRefresh="
            r10.<init>(r3)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.mars.xlog.Log.i(r1, r9)
            sf2.d3 r1 = r8.f264358a
            r9 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r5.f264327d = r8
            r5.f264328e = r8
            r5.f264331h = r2
            r2 = r9
            java.lang.Object r10 = sf2.d3.l7(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L71
            return r0
        L71:
            r9 = r8
            r0 = r9
        L73:
            r45.gx1 r10 = (r45.gx1) r10
            r9.f264359b = r10
            r45.gx1 r9 = r0.f264359b
            if (r9 == 0) goto L7d
            r45.ox1 r9 = r9.f375596g
        L7d:
            r45.gx1 r9 = r0.f264359b
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.q1.f(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
