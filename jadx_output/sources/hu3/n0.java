package hu3;

/* loaded from: classes5.dex */
public final class n0 implements yt3.r2, android.media.ImageReader.OnImageAvailableListener {
    public kotlinx.coroutines.r2 A;
    public kotlinx.coroutines.r2 B;
    public long C;
    public boolean D;
    public final jz5.g E;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f285160d;

    /* renamed from: e, reason: collision with root package name */
    public final zt3.a f285161e;

    /* renamed from: f, reason: collision with root package name */
    public pp0.p0 f285162f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f285163g;

    /* renamed from: h, reason: collision with root package name */
    public int f285164h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem f285165i;

    /* renamed from: m, reason: collision with root package name */
    public final bs0.h f285166m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f285167n;

    /* renamed from: o, reason: collision with root package name */
    public final hu3.t0 f285168o;

    /* renamed from: p, reason: collision with root package name */
    public android.media.ImageReader f285169p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.HandlerThread f285170q;

    /* renamed from: r, reason: collision with root package name */
    public final hu3.b f285171r;

    /* renamed from: s, reason: collision with root package name */
    public final hu3.w0 f285172s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.maas.camerafun.MJVideoFrame f285173t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f285174u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f285175v;

    /* renamed from: w, reason: collision with root package name */
    public hu3.s0 f285176w;

    /* renamed from: x, reason: collision with root package name */
    public final hu3.b f285177x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f285178y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f285179z;

    public n0(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        this.f285160d = parent;
        this.f285161e = kitContext;
        this.f285163g = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f285164h = 1;
        bs0.j jVar = kitContext.f475577e;
        this.f285166m = jVar instanceof bs0.h ? (bs0.h) jVar : null;
        this.f285168o = new hu3.t0(null, null, 0, 0, 0, 31, null);
        int i17 = pu5.i.f358473b;
        this.f285170q = pu5.f.a("ProfessionalRecordTemplate-Use", -2);
        this.f285171r = new hu3.b();
        this.f285172s = new hu3.w0(0, 0, 0, 0, 15, null);
        this.f285174u = jz5.h.b(new hu3.j0(this));
        this.f285177x = new hu3.b();
        this.E = jz5.h.b(new hu3.v(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hu3.n0 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.n0.a(hu3.n0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final android.view.ViewGroup b(hu3.n0 n0Var) {
        java.lang.Object value = ((jz5.n) n0Var.f285174u).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(hu3.n0 r9, int r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.n0.c(hu3.n0, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hu3.c
            if (r0 == 0) goto L13
            r0 = r6
            hu3.c r0 = (hu3.c) r0
            int r1 = r0.f285095g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f285095g = r1
            goto L18
        L13:
            hu3.c r0 = new hu3.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f285093e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f285095g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f285092d
            hu3.n0 r0 = (hu3.n0) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L56
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.r2 r6 = r5.A
            if (r6 == 0) goto L43
            boolean r6 = r6.a()
            if (r6 != r4) goto L43
            r6 = r4
            goto L44
        L43:
            r6 = r3
        L44:
            if (r6 == 0) goto L55
            kotlinx.coroutines.r2 r6 = r5.A
            if (r6 == 0) goto L55
            r0.f285092d = r5
            r0.f285095g = r4
            java.lang.Object r6 = r6.C(r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            r0 = r5
        L56:
            kotlinx.coroutines.r2 r6 = r0.A
            if (r6 == 0) goto L61
            boolean r6 = r6.isCancelled()
            if (r6 != r4) goto L61
            r3 = r4
        L61:
            if (r3 != 0) goto L6b
            kotlinx.coroutines.r2 r6 = r0.A
            if (r6 != 0) goto L68
            goto L6b
        L68:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L6b:
            kotlinx.coroutines.r2 r6 = r0.A
            r0 = 0
            if (r6 == 0) goto L75
            java.util.concurrent.CancellationException r6 = r6.x()
            goto L76
        L75:
            r6 = r0
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setup failed:"
            r1.<init>(r2)
            r1.append(r6)
            r2 = 32
            r1.append(r2)
            if (r6 == 0) goto L8c
            java.lang.Throwable r3 = r6.getCause()
            goto L8d
        L8c:
            r3 = r0
        L8d:
            r1.append(r3)
            r1.append(r2)
            if (r6 == 0) goto L99
            java.lang.String r0 = r6.getMessage()
        L99:
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            java.lang.String r0 = "MicroMsg.ProfessionalTemplateCorePlugin"
            com.tencent.mars.xlog.Log.e(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.n0.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object e(int i17, int i18, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new hu3.d(this, i17, i18, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.n0.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object g(kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new hu3.g(this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.n0.h(com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object i(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new hu3.e0(this, str, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.n0.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r36, kotlin.coroutines.Continuation r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r37
            boolean r2 = r1 instanceof hu3.i0
            if (r2 == 0) goto L17
            r2 = r1
            hu3.i0 r2 = (hu3.i0) r2
            int r3 = r2.f285139g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f285139g = r3
            goto L1c
        L17:
            hu3.i0 r2 = new hu3.i0
            r2.<init>(r0, r1)
        L1c:
            r10 = r2
            java.lang.Object r1 = r10.f285137e
            pz5.a r2 = pz5.a.f359186d
            int r3 = r10.f285139g
            r13 = -2
            r14 = 0
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r2 = r10.f285136d
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r15 = r2
            goto L63
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            com.tencent.maas.camerafun.MJVideoFrame r1 = r0.f285173t
            if (r1 != 0) goto L48
            hu3.v0 r1 = new hu3.v0
            r1.<init>(r13, r14)
            return r1
        L48:
            pp0.p0 r3 = r0.f285162f
            if (r3 == 0) goto L66
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 60
            r12 = 0
            r15 = r36
            r10.f285136d = r15
            r10.f285139g = r4
            r4 = r1
            r5 = r36
            java.lang.Object r1 = pp0.p0.i0(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto L63
            return r2
        L63:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L69
        L66:
            r15 = r36
            r1 = r14
        L69:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "takePicture >> "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.ProfessionalTemplateCorePlugin"
            com.tencent.mars.xlog.Log.i(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.o.b(r1, r2)
            if (r1 == 0) goto Lbc
            java.lang.String r1 = "input"
            kotlin.jvm.internal.o.g(r15, r1)
            ct0.b r1 = new ct0.b
            r16 = r1
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 65019(0xfdfb, float:9.1111E-41)
            r34 = 0
            r26 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            hu3.v0 r2 = new hu3.v0
            r3 = 0
            r2.<init>(r3, r1)
            goto Lc1
        Lbc:
            hu3.v0 r2 = new hu3.v0
            r2.<init>(r13, r14)
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.n0.k(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object m(boolean z17, android.view.Surface surface, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new hu3.l0(z17, surface, this, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    public final void n() {
        com.tencent.mm.modelcontrol.VideoTransPara pj6;
        zt3.c cVar;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) this.f285161e.f475579g.get(7);
        android.os.Bundle bundle = (j0Var == null || (cVar = (zt3.c) j0Var.getValue()) == null) ? null : cVar.f475589c;
        int i17 = bundle != null ? bundle.getInt("PARAM_1_INT") : 3;
        float f17 = i17 != 2 ? i17 != 3 ? 1.0f : 0.5625f : 0.75f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "updateOutputSize >> scale: " + f17);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f285167n;
        if (recordConfigProvider == null || (pj6 = recordConfigProvider.f155676n) == null) {
            pj6 = d11.s.fj().pj();
        }
        int i18 = pj6.f71191d;
        hu3.t0 t0Var = this.f285168o;
        if (i18 <= 540) {
            rg.c cVar2 = rg.c.DIMENSION_LEVEL_540;
            t0Var.getClass();
            t0Var.f285199a = cVar2;
            xr0.j jVar = t0Var.f285200b;
            jVar.f456173a = com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH;
            jVar.f456174b = (int) (com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH / f17);
            return;
        }
        if (i18 <= 720) {
            rg.c cVar3 = rg.c.DIMENSION_LEVEL_720;
            t0Var.getClass();
            t0Var.f285199a = cVar3;
            xr0.j jVar2 = t0Var.f285200b;
            jVar2.f456173a = com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH;
            jVar2.f456174b = (int) (com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH / f17);
            return;
        }
        rg.c cVar4 = rg.c.DIMENSION_LEVEL_1080;
        t0Var.getClass();
        t0Var.f285199a = cVar4;
        xr0.j jVar3 = t0Var.f285200b;
        jVar3.f456173a = 1080;
        jVar3.f456174b = (int) (1080 / f17);
    }

    @Override // yt3.r2
    public void onAttach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "onAttach");
        if (this.f285164h == 1 && this.f285165i == null) {
            return;
        }
        kotlinx.coroutines.l.d(this.f285163g, null, null, new hu3.w(this, null), 3, null);
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "onDetach");
        kotlinx.coroutines.l.d(this.f285163g, null, null, new hu3.x(this, null), 3, null);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(android.media.ImageReader imageReader) {
        hu3.b bVar = this.f285171r;
        hu3.w0 w0Var = this.f285172s;
        java.lang.System.currentTimeMillis();
        android.media.Image acquireNextImage = imageReader != null ? imageReader.acquireNextImage() : null;
        if (acquireNextImage != null) {
            acquireNextImage.getTimestamp();
        }
        if (acquireNextImage != null) {
            try {
                try {
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProfessionalTemplateCorePlugin", e17, "onImageAvailable error", new java.lang.Object[0]);
                }
                if (acquireNextImage.getPlanes() != null) {
                    android.media.Image.Plane plane = acquireNextImage.getPlanes()[0];
                    java.nio.ByteBuffer buffer = plane.getBuffer();
                    buffer.position(0);
                    bVar.a(acquireNextImage.getWidth() * acquireNextImage.getHeight() * plane.getPixelStride());
                    int rowStride = plane.getRowStride();
                    int pixelStride = plane.getPixelStride();
                    java.util.ArrayList arrayList = bVar.f285088a;
                    int i17 = bVar.f285089b;
                    bVar.f285089b = i17 + 1;
                    java.lang.Object obj = arrayList.get(i17 % arrayList.size());
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
                    byteBuffer.clear();
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.nativeBufferCopy(buffer, byteBuffer, acquireNextImage.getWidth() * pixelStride, acquireNextImage.getHeight(), rowStride - (acquireNextImage.getWidth() * pixelStride));
                    com.tencent.maas.camerafun.MJVideoFrame mJVideoFrame = new com.tencent.maas.camerafun.MJVideoFrame(acquireNextImage.getWidth(), acquireNextImage.getHeight(), acquireNextImage.getWidth() * plane.getPixelStride(), acquireNextImage.getPlanes()[0].getPixelStride(), byteBuffer, 0, acquireNextImage.getTimestamp());
                    this.f285173t = mJVideoFrame;
                    w0Var.f285213a = acquireNextImage.getWidth();
                    w0Var.f285214b = acquireNextImage.getHeight();
                    w0Var.f285215c = acquireNextImage.getWidth() * plane.getPixelStride();
                    w0Var.f285216d = acquireNextImage.getPlanes()[0].getPixelStride();
                    pp0.p0 p0Var = this.f285162f;
                    if (p0Var != null) {
                        p0Var.d0(mJVideoFrame);
                    }
                    acquireNextImage.close();
                    java.lang.System.currentTimeMillis();
                    return;
                }
            } finally {
                acquireNextImage.close();
            }
        }
        if (acquireNextImage != null) {
        }
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "onPause");
        kotlinx.coroutines.l.d(this.f285163g, null, null, new hu3.y(this, null), 3, null);
    }

    @Override // yt3.r2
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "onResume");
        kotlinx.coroutines.l.d(this.f285163g, null, null, new hu3.z(this, null), 3, null);
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "release");
        ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
        az0.i5 i5Var = az0.i5.f15557a;
        az0.i5.f15573q = null;
        kotlinx.coroutines.l.d(this.f285163g, null, null, new hu3.b0(this, null), 3, null);
        kotlinx.coroutines.r2 r2Var = this.A;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f285170q.quitSafely();
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f285167n = configProvider;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = configProvider.f155676n;
        if (videoTransPara == null) {
            videoTransPara = d11.s.fj().pj();
        }
        int i17 = videoTransPara.f71193f;
        hu3.t0 t0Var = this.f285168o;
        t0Var.f285202d = videoTransPara.f71198n;
        t0Var.f285201c = videoTransPara.f71194g / i17;
        t0Var.f285203e = videoTransPara.f71197m * i17;
        n();
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "outputInfo:" + this.f285168o);
        ou3.j jVar = ou3.j.f348958a;
        ((ku5.t0) ku5.t0.f312615d).q(ou3.i.f348957d);
        this.f285161e.Q6(12, new hu3.h(this));
        this.f285161e.Q6(13, new hu3.i(this));
        this.f285161e.R6(new hu3.t(this));
    }
}
