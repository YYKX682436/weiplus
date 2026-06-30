package zr0;

/* loaded from: classes14.dex */
public final class p implements nr0.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f475164d;

    /* renamed from: e, reason: collision with root package name */
    public final xr0.k f475165e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f475166f;

    /* renamed from: g, reason: collision with root package name */
    public os0.f f475167g;

    /* renamed from: h, reason: collision with root package name */
    public os0.a f475168h;

    /* renamed from: i, reason: collision with root package name */
    public os0.a f475169i;

    /* renamed from: m, reason: collision with root package name */
    public nr0.c f475170m;

    /* renamed from: n, reason: collision with root package name */
    public is0.c f475171n;

    /* renamed from: o, reason: collision with root package name */
    public is0.c f475172o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f475173p;

    /* renamed from: q, reason: collision with root package name */
    public long f475174q;

    /* renamed from: r, reason: collision with root package name */
    public long f475175r;

    /* renamed from: s, reason: collision with root package name */
    public long f475176s;

    public p(int i17, xr0.k sizeParameter) {
        kotlin.jvm.internal.o.g(sizeParameter, "sizeParameter");
        this.f475164d = i17;
        this.f475165e = sizeParameter;
        this.f475173p = qr0.a.f366055a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(is0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zr0.d
            if (r0 == 0) goto L13
            r0 = r6
            zr0.d r0 = (zr0.d) r0
            int r1 = r0.f475119g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475119g = r1
            goto L18
        L13:
            zr0.d r0 = new zr0.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f475117e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475119g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f475116d
            zr0.p r5 = (zr0.p) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
            zr0.e r6 = new zr0.e
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f475116d = r4
            r0.f475119g = r3
            java.lang.Object r6 = r4.m(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r5 = r4
        L48:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            long r2 = r5.f475175r
            long r2 = r2 + r0
            r5.f475175r = r2
            is0.c r5 = r5.f475171n
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.i(is0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zr0.f
            if (r0 == 0) goto L13
            r0 = r6
            zr0.f r0 = (zr0.f) r0
            int r1 = r0.f475127g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475127g = r1
            goto L18
        L13:
            zr0.f r0 = new zr0.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f475125e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475127g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.f475124d
            zr0.p r0 = (zr0.p) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L69
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.Camera.CameraRenderPipeline"
            java.lang.String r2 = "release"
            com.tencent.mars.xlog.Log.i(r6, r2)
            os0.f r6 = r5.f475167g
            if (r6 == 0) goto L45
            r6.n()
        L45:
            r5.f475167g = r4
            os0.a r6 = r5.f475168h
            if (r6 == 0) goto L4e
            r6.n()
        L4e:
            r5.f475168h = r4
            os0.a r6 = r5.f475169i
            if (r6 == 0) goto L57
            r6.n()
        L57:
            r5.f475169i = r4
            nr0.c r6 = r5.f475170m
            if (r6 == 0) goto L68
            r0.f475124d = r5
            r0.f475127g = r3
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            r0 = r5
        L69:
            is0.c r6 = r0.f475172o
            if (r6 == 0) goto L70
            r6.close()
        L70:
            r0.f475172o = r4
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(is0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zr0.g
            if (r0 == 0) goto L13
            r0 = r9
            zr0.g r0 = (zr0.g) r0
            int r1 = r0.f475132h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475132h = r1
            goto L18
        L13:
            zr0.g r0 = new zr0.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f475130f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475132h
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.throwOnFailure(r9)
            goto L88
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f475129e
            zr0.p r8 = (zr0.p) r8
            java.lang.Object r2 = r0.f475128d
            zr0.p r2 = (zr0.p) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L74
        L43:
            java.lang.Object r8 = r0.f475128d
            zr0.p r8 = (zr0.p) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5a
        L4b:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.f475128d = r7
            r0.f475132h = r6
            java.lang.Object r9 = r7.n(r8, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r8 = r7
        L5a:
            is0.c r9 = (is0.c) r9
            if (r9 != 0) goto L66
            java.lang.String r8 = "MicroMsg.Camera.CameraRenderPipeline"
            java.lang.String r9 = "renderFormat return null"
            com.tencent.mars.xlog.Log.i(r8, r9)
            return r3
        L66:
            r0.f475128d = r8
            r0.f475129e = r8
            r0.f475132h = r5
            java.lang.Object r9 = r8.i(r9, r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            r2 = r8
        L74:
            is0.c r9 = (is0.c) r9
            r8.f475171n = r9
            is0.c r8 = r2.f475171n
            r9 = 0
            r0.f475128d = r9
            r0.f475129e = r9
            r0.f475132h = r4
            java.lang.Object r8 = r2.o(r8, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.k(is0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(byte[] r8, int r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof zr0.h
            if (r0 == 0) goto L13
            r0 = r11
            zr0.h r0 = (zr0.h) r0
            int r1 = r0.f475137h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475137h = r1
            goto L18
        L13:
            zr0.h r0 = new zr0.h
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f475135f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475137h
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L88
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.f475134e
            zr0.p r8 = (zr0.p) r8
            java.lang.Object r9 = r0.f475133d
            zr0.p r9 = (zr0.p) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L74
        L43:
            java.lang.Object r8 = r0.f475133d
            zr0.p r8 = (zr0.p) r8
            kotlin.ResultKt.throwOnFailure(r11)
            goto L5a
        L4b:
            kotlin.ResultKt.throwOnFailure(r11)
            r0.f475133d = r7
            r0.f475137h = r6
            java.lang.Object r11 = r7.p(r8, r9, r10, r0)
            if (r11 != r1) goto L59
            return r1
        L59:
            r8 = r7
        L5a:
            is0.c r11 = (is0.c) r11
            if (r11 != 0) goto L66
            java.lang.String r8 = "MicroMsg.Camera.CameraRenderPipeline"
            java.lang.String r9 = "renderFormat return null"
            com.tencent.mars.xlog.Log.i(r8, r9)
            return r3
        L66:
            r0.f475133d = r8
            r0.f475134e = r8
            r0.f475137h = r5
            java.lang.Object r11 = r8.i(r11, r0)
            if (r11 != r1) goto L73
            return r1
        L73:
            r9 = r8
        L74:
            is0.c r11 = (is0.c) r11
            r8.f475171n = r11
            is0.c r8 = r9.f475171n
            r10 = 0
            r0.f475133d = r10
            r0.f475134e = r10
            r0.f475137h = r4
            java.lang.Object r8 = r9.o(r8, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.l(byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(yz5.l r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof zr0.i
            if (r0 == 0) goto L13
            r0 = r8
            zr0.i r0 = (zr0.i) r0
            int r1 = r0.f475142h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475142h = r1
            goto L18
        L13:
            zr0.i r0 = new zr0.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f475140f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475142h
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.f475139e
            java.lang.Object r7 = r0.f475138d
            zr0.p r7 = (zr0.p) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.throwOnFailure(r8)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f475138d = r6
            r0.f475139e = r4
            r0.f475142h = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            r7 = r6
            r1 = r4
        L4b:
            boolean r7 = r7.f475173p
            if (r7 == 0) goto L52
            android.opengl.GLES20.glFinish()
        L52:
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.m(yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(is0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zr0.j
            if (r0 == 0) goto L13
            r0 = r7
            zr0.j r0 = (zr0.j) r0
            int r1 = r0.f475147h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475147h = r1
            goto L18
        L13:
            zr0.j r0 = new zr0.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f475145f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475147h
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f475144e
            is0.c r6 = (is0.c) r6
            java.lang.Object r0 = r0.f475143d
            zr0.p r0 = (zr0.p) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L51
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            if (r6 != 0) goto L3e
            return r7
        L3e:
            zr0.k r2 = new zr0.k
            r2.<init>(r5, r6, r7)
            r0.f475143d = r5
            r0.f475144e = r6
            r0.f475147h = r3
            java.lang.Object r7 = r5.m(r2, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            java.lang.Number r7 = (java.lang.Number) r7
            long r1 = r7.longValue()
            long r3 = r0.f475174q
            long r3 = r3 + r1
            r0.f475174q = r3
            os0.a r7 = r0.f475168h
            if (r7 == 0) goto L66
            is0.c r7 = r7.f348000i
            if (r7 != 0) goto L65
            goto L66
        L65:
            r6 = r7
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.n(is0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(is0.c r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zr0.l
            if (r0 == 0) goto L13
            r0 = r10
            zr0.l r0 = (zr0.l) r0
            int r1 = r0.f475153g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475153g = r1
            goto L18
        L13:
            zr0.l r0 = new zr0.l
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f475151e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475153g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r9 = r0.f475150d
            zr0.p r9 = (zr0.p) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L4d
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.ResultKt.throwOnFailure(r10)
            if (r9 != 0) goto L3b
            return r3
        L3b:
            zr0.m r10 = new zr0.m
            r2 = 0
            r10.<init>(r8, r9, r2)
            r0.f475150d = r8
            r0.f475153g = r4
            java.lang.Object r10 = r8.m(r10, r0)
            if (r10 != r1) goto L4c
            return r1
        L4c:
            r9 = r8
        L4d:
            java.lang.Number r10 = (java.lang.Number) r10
            long r0 = r10.longValue()
            long r4 = r9.f475176s
            long r4 = r4 + r0
            r9.f475176s = r4
            as0.a r10 = as0.a.f13425a
            long r0 = r9.f475174q
            long r6 = r9.f475175r
            int r9 = r9.f475164d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r9 = r10.a(r9)
            if (r9 == 0) goto L6c
            r9.f55568q = r0
            r9.f55569r = r6
            r9.f55570s = r4
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.o(is0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(byte[] r11, int r12, int r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof zr0.n
            if (r0 == 0) goto L13
            r0 = r14
            zr0.n r0 = (zr0.n) r0
            int r1 = r0.f475159g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f475159g = r1
            goto L18
        L13:
            zr0.n r0 = new zr0.n
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f475157e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f475159g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r11 = r0.f475156d
            zr0.p r11 = (zr0.p) r11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L4d
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            kotlin.ResultKt.throwOnFailure(r14)
            zr0.o r14 = new zr0.o
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f475156d = r10
            r0.f475159g = r3
            java.lang.Object r14 = r10.m(r14, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            r11 = r10
        L4d:
            java.lang.Number r14 = (java.lang.Number) r14
            long r12 = r14.longValue()
            long r0 = r11.f475174q
            long r0 = r0 + r12
            r11.f475174q = r0
            os0.f r11 = r11.f475167g
            if (r11 == 0) goto L5f
            is0.c r11 = r11.f348000i
            goto L60
        L5f:
            r11 = 0
        L60:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zr0.p.p(byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nr0.b0
    public void setCustomRender(nr0.c cVar) {
        this.f475170m = cVar;
    }
}
