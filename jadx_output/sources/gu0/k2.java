package gu0;

/* loaded from: classes5.dex */
public final class k2 {
    public java.util.List A;
    public java.util.List B;
    public eu0.q C;
    public r45.mi0 D;
    public r45.ab4 E;

    /* renamed from: a, reason: collision with root package name */
    public final eu0.b f275725a;

    /* renamed from: b, reason: collision with root package name */
    public final gu0.n2 f275726b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f275727c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f275728d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f275729e;

    /* renamed from: f, reason: collision with root package name */
    public gu0.a0 f275730f;

    /* renamed from: g, reason: collision with root package name */
    public gu0.z f275731g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f275732h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f275733i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f275734j;

    /* renamed from: k, reason: collision with root package name */
    public org.json.JSONObject f275735k;

    /* renamed from: l, reason: collision with root package name */
    public final oz5.l f275736l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.Timeline f275737m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.PlaybackSession f275738n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.ExportSession f275739o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.maas.camstudio.MJCamResourceManager f275740p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f275741q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f275742r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.SurfaceView f275743s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f275744t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f275745u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f275746v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f275747w;

    /* renamed from: x, reason: collision with root package name */
    public final iu0.d f275748x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f275749y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f275750z;

    public k2(eu0.b params, gu0.n2 liteAppBridge, yz5.l sendResult) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(liteAppBridge, "liteAppBridge");
        kotlin.jvm.internal.o.g(sendResult, "sendResult");
        this.f275725a = params;
        this.f275726b = liteAppBridge;
        this.f275727c = sendResult;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f275728d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f275736l = ((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c.J(1));
        this.f275741q = com.tencent.maas.model.time.MJTime.ZeroTime;
        this.f275748x = new iu0.d();
    }

    public static final r45.mi0 a(gu0.k2 k2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = k2Var.f275744t;
        if (str3 == null) {
            str3 = k2Var.f275725a.f256707m;
        }
        byte[] bArr = gu0.l2.f275762b;
        r45.mi0 mi0Var = null;
        java.lang.String str4 = "";
        if (bArr != null) {
            if (!(!(bArr.length == 0))) {
                bArr = null;
            }
            if (bArr != null) {
                mi0Var = new r45.mi0();
                try {
                    mi0Var.parseFrom(bArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
        }
        r45.mi0 mi0Var2 = new r45.mi0();
        mi0Var2.f380534d = 2;
        if (str3 == null) {
            str3 = "";
        }
        mi0Var2.f380535e = str3;
        if (mi0Var == null || (str = mi0Var.f380536f) == null) {
            str = "";
        }
        mi0Var2.f380536f = str;
        mi0Var2.f380537g = mi0Var != null ? mi0Var.f380537g : 1;
        if (mi0Var != null && (str2 = mi0Var.f380538h) != null) {
            str4 = str2;
        }
        mi0Var2.f380538h = str4;
        com.tencent.mars.xlog.Log.i("MJCC.Session", "buildNewEffectEditInfoBytes: scene=" + mi0Var2.f380534d + ", parent=" + mi0Var2.f380535e + ", root=" + mi0Var2.f380536f + ", enable=" + mi0Var2.f380537g + ", wording=" + mi0Var2.f380538h);
        return mi0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r45.ab4 b(gu0.k2 r11) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.b(gu0.k2):r45.ab4");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(gu0.k2 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof gu0.h0
            if (r0 == 0) goto L16
            r0 = r6
            gu0.h0 r0 = (gu0.h0) r0
            int r1 = r0.f275689g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f275689g = r1
            goto L1b
        L16:
            gu0.h0 r0 = new gu0.h0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f275687e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275689g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L59
            goto L3b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.maas.moviecomposing.PlaybackSession r5 = r5.f275738n
            if (r5 != 0) goto L3d
        L3b:
            r1 = r3
            goto L58
        L3d:
            r0.f275686d = r5     // Catch: java.lang.Exception -> L59
            r0.f275689g = r4     // Catch: java.lang.Exception -> L59
            oz5.n r6 = new oz5.n     // Catch: java.lang.Exception -> L59
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)     // Catch: java.lang.Exception -> L59
            r6.<init>(r0)     // Catch: java.lang.Exception -> L59
            gu0.i0 r0 = new gu0.i0     // Catch: java.lang.Exception -> L59
            r0.<init>(r6)     // Catch: java.lang.Exception -> L59
            r5.close(r0)     // Catch: java.lang.Exception -> L59
            java.lang.Object r5 = r6.a()     // Catch: java.lang.Exception -> L59
            if (r5 != r1) goto L3b
        L58:
            return r1
        L59:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "closePlayback: close exception: "
            r6.<init>(r0)
            java.lang.String r0 = r5.getMessage()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "MJCC.Session"
            com.tencent.mars.xlog.Log.e(r0, r6)
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to close playBack: "
            r0.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.c(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(gu0.k2 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.d(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(gu0.k2 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.e(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(gu0.k2 r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof gu0.c1
            if (r0 == 0) goto L16
            r0 = r7
            gu0.c1 r0 = (gu0.c1) r0
            int r1 = r0.f275643h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f275643h = r1
            goto L1b
        L16:
            gu0.c1 r0 = new gu0.c1
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f275641f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275643h
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L5f
            goto L3b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r7)
            com.tencent.maas.moviecomposing.PlaybackSession r7 = r6.f275738n
            if (r7 != 0) goto L3d
        L3b:
            r1 = r3
            goto L5e
        L3d:
            r0.f275639d = r6     // Catch: java.lang.Exception -> L5f
            r0.f275640e = r7     // Catch: java.lang.Exception -> L5f
            r0.f275643h = r4     // Catch: java.lang.Exception -> L5f
            oz5.n r2 = new oz5.n     // Catch: java.lang.Exception -> L5f
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)     // Catch: java.lang.Exception -> L5f
            r2.<init>(r0)     // Catch: java.lang.Exception -> L5f
            com.tencent.maas.moviecomposing.Timeline r0 = r6.f275737m     // Catch: java.lang.Exception -> L5f
            com.tencent.maas.model.time.MJTime r4 = com.tencent.maas.model.time.MJTime.ZeroTime     // Catch: java.lang.Exception -> L5f
            gu0.d1 r5 = new gu0.d1     // Catch: java.lang.Exception -> L5f
            r5.<init>(r6, r2)     // Catch: java.lang.Exception -> L5f
            r7.openWithTimeline(r0, r4, r5)     // Catch: java.lang.Exception -> L5f
            java.lang.Object r6 = r2.a()     // Catch: java.lang.Exception -> L5f
            if (r6 != r1) goto L3b
        L5e:
            return r1
        L5f:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "openPlayback: open exception: "
            r7.<init>(r0)
            java.lang.String r0 = r6.getMessage()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MJCC.Session"
            com.tencent.mars.xlog.Log.e(r0, r7)
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to open playBack: "
            r0.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.f(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(gu0.k2 r19, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.g(gu0.k2, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(gu0.k2 r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.h(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(gu0.k2 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.i(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(gu0.k2 r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.j(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(gu0.k2 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof gu0.s1
            if (r0 == 0) goto L16
            r0 = r6
            gu0.s1 r0 = (gu0.s1) r0
            int r1 = r0.f275809h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f275809h = r1
            goto L1b
        L16:
            gu0.s1 r0 = new gu0.s1
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f275807f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275809h
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f275806e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f275805d
            gu0.k2 r0 = (gu0.k2) r0
            kotlin.ResultKt.throwOnFailure(r6)
            r1 = r5
            r5 = r0
            goto L70
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            kotlin.ResultKt.throwOnFailure(r6)
            eu0.b r6 = r5.f275725a
            java.lang.String r6 = r6.f256701g
            if (r6 == 0) goto L4e
            int r2 = r6.length()
            if (r2 != 0) goto L4c
            goto L4e
        L4c:
            r2 = 0
            goto L4f
        L4e:
            r2 = r3
        L4f:
            if (r2 != 0) goto L9a
            java.lang.String r2 = r5.s(r6)
            if (r2 != 0) goto L58
            goto L59
        L58:
            r6 = r2
        L59:
            r0.f275805d = r5
            r0.f275806e = r6
            r0.f275809h = r3
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310570c
            gu0.r1 r3 = new gu0.r1
            r4 = 0
            r3.<init>(r6, r4)
            java.lang.Object r0 = kotlinx.coroutines.l.g(r2, r3, r0)
            if (r0 != r1) goto L6e
            goto L91
        L6e:
            r1 = r6
            r6 = r0
        L70:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L92
            r5.f275744t = r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "resolveTemplateJson: templateId="
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = ", path="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MJCC.Session"
            com.tencent.mars.xlog.Log.i(r6, r5)
        L91:
            return r1
        L92:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "Failed to resolve templateId from JSON"
            r5.<init>(r6)
            throw r5
        L9a:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r6 = "templateJsonFilePath is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.k(gu0.k2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object l(gu0.k2 k2Var, java.lang.String zipPath, kotlin.coroutines.Continuation continuation) {
        k2Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        iu0.d dVar = k2Var.f275748x;
        gu0.i2 i2Var = new gu0.i2(rVar);
        dVar.getClass();
        kotlin.jvm.internal.o.g(zipPath, "zipPath");
        dVar.b();
        dVar.f294803b = 0;
        dVar.f294804c = false;
        dVar.c(zipPath, i2Var);
        rVar.m(new gu0.j2(k2Var));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(android.view.SurfaceView r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof gu0.f0
            if (r0 == 0) goto L13
            r0 = r12
            gu0.f0 r0 = (gu0.f0) r0
            int r1 = r0.f275670h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275670h = r1
            goto L18
        L13:
            gu0.f0 r0 = new gu0.f0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f275668f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275670h
            jz5.f0 r3 = jz5.f0.f302826a
            java.lang.String r4 = "MJCC.Session"
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L53
            if (r2 == r7) goto L43
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            kotlin.ResultKt.throwOnFailure(r12)
            goto L9a
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r0.f275666d
            gu0.k2 r11 = (gu0.k2) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L8f
        L43:
            java.lang.Object r11 = r0.f275667e
            android.view.SurfaceView r11 = (android.view.SurfaceView) r11
            java.lang.Object r2 = r0.f275666d
            gu0.k2 r2 = (gu0.k2) r2
            kotlin.ResultKt.throwOnFailure(r12)
            r9 = r12
            r12 = r11
            r11 = r2
            r2 = r9
            goto L6d
        L53:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = "bindSurfaceView"
            com.tencent.mars.xlog.Log.i(r4, r12)
            r10.f275743s = r11
            r0.f275666d = r10
            r0.f275667e = r11
            r0.f275670h = r7
            java.lang.Object r12 = r10.n(r0)
            if (r12 != r1) goto L6a
            return r1
        L6a:
            r2 = r12
            r12 = r11
            r11 = r10
        L6d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L7b
            java.lang.String r11 = "bindSurfaceView: MaaS SDK not ready, skip bindRenderView"
            com.tencent.mars.xlog.Log.e(r4, r11)
            return r3
        L7b:
            oz5.l r2 = r11.f275736l
            gu0.g0 r4 = new gu0.g0
            r4.<init>(r11, r12, r8)
            r0.f275666d = r11
            r0.f275667e = r8
            r0.f275670h = r6
            java.lang.Object r12 = kotlinx.coroutines.l.g(r2, r4, r0)
            if (r12 != r1) goto L8f
            return r1
        L8f:
            r0.f275666d = r8
            r0.f275670h = r5
            java.lang.Object r11 = r11.v(r0)
            if (r11 != r1) goto L9a
            return r1
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.m(android.view.SurfaceView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof gu0.l0
            if (r0 == 0) goto L13
            r0 = r12
            gu0.l0 r0 = (gu0.l0) r0
            int r1 = r0.f275755g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275755g = r1
            goto L18
        L13:
            gu0.l0 r0 = new gu0.l0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f275753e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275755g
            java.lang.String r3 = "MJCC.Session"
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f275752d
            pp0.q0 r0 = (pp0.q0) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto La4
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            java.lang.Object r2 = r0.f275752d
            pp0.q0 r2 = (pp0.q0) r2
            kotlin.ResultKt.throwOnFailure(r12)
            goto L87
        L43:
            java.lang.Object r2 = r0.f275752d
            pp0.q0 r2 = (pp0.q0) r2
            kotlin.ResultKt.throwOnFailure(r12)
            goto L6a
        L4b:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Class<pp0.q0> r12 = pp0.q0.class
            i95.m r12 = i95.n0.c(r12)
            r2 = r12
            pp0.q0 r2 = (pp0.q0) r2
            kotlinx.coroutines.p0 r12 = kotlinx.coroutines.q1.f310570c
            gu0.n0 r7 = new gu0.n0
            r8 = 0
            r7.<init>(r2, r8)
            r0.f275752d = r2
            r0.f275755g = r6
            java.lang.Object r12 = kotlinx.coroutines.l.g(r12, r7, r0)
            if (r12 != r1) goto L6a
            return r1
        L6a:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L7a
            java.lang.String r12 = "ensureMaasSdkReady: failed to load MaaS native library"
            com.tencent.mars.xlog.Log.e(r3, r12)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L7a:
            r0.f275752d = r2
            r0.f275755g = r5
            yy0.k8 r2 = (yy0.k8) r2
            java.lang.Object r12 = r2.wi(r0)
            if (r12 != r1) goto L87
            return r1
        L87:
            gu0.m0 r7 = gu0.m0.f275765d
            r12 = r2
            yy0.k8 r12 = (yy0.k8) r12
            r12.getClass()
            az0.i5 r5 = az0.i5.f15557a
            r8 = 0
            r9 = 4
            r10 = 0
            r6 = 1
            az0.i5.s(r5, r6, r7, r8, r9, r10)
            r0.f275752d = r12
            r0.f275755g = r4
            java.lang.Object r0 = r12.Ai(r0)
            if (r0 != r1) goto La3
            return r1
        La3:
            r0 = r12
        La4:
            yy0.k8 r0 = (yy0.k8) r0
            r0.getClass()
            az0.i5 r12 = az0.i5.f15557a
            boolean r12 = r12.t()
            if (r12 != 0) goto Lb6
            java.lang.String r0 = "ensureMaasSdkReady: MaasCore not initialized"
            com.tencent.mars.xlog.Log.e(r3, r0)
        Lb6:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof gu0.o0
            if (r0 == 0) goto L13
            r0 = r5
            gu0.o0 r0 = (gu0.o0) r0
            int r1 = r0.f275777g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275777g = r1
            goto L18
        L13:
            gu0.o0 r0 = new gu0.o0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f275775e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275777g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f275774d
            gu0.k2 r0 = (gu0.k2) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            com.tencent.maas.camstudio.MJCamResourceManager r5 = r4.f275740p
            if (r5 == 0) goto L3b
            return r5
        L3b:
            java.lang.Class<pp0.q0> r5 = pp0.q0.class
            i95.m r5 = i95.n0.c(r5)
            pp0.q0 r5 = (pp0.q0) r5
            r0.f275774d = r4
            r0.f275777g = r3
            yy0.k8 r5 = (yy0.k8) r5
            r5.getClass()
            az0.i5 r5 = az0.i5.f15557a
            az0.e3 r2 = new az0.e3
            r3 = 0
            r2.<init>(r3)
            java.lang.String r3 = "createCamResourceManager"
            java.lang.Object r5 = r5.y(r3, r2, r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            r0 = r4
        L5e:
            com.tencent.maas.camstudio.MJCamResourceManager r5 = (com.tencent.maas.camstudio.MJCamResourceManager) r5
            if (r5 == 0) goto L6c
            r0.f275740p = r5
            java.lang.String r0 = "MJCC.Session"
            java.lang.String r1 = "ensureOrCreateCamResourceManager: created new instance"
            com.tencent.mars.xlog.Log.i(r0, r1)
            return r5
        L6c:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r0 = "Failed to create CamResourceManager"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p(boolean z17, yz5.a aVar) {
        if (this.f275729e) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        this.f275729e = true;
        com.tencent.mars.xlog.Log.i("MJCC.Session", "finishWithCancel: isCancel=" + z17);
        this.f275748x.b();
        this.f275745u = null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isCancel", z17);
        q(true, jSONObject, aVar);
    }

    public final void q(boolean z17, org.json.JSONObject jSONObject, yz5.a aVar) {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a)), null, null, new gu0.o1(this, jSONObject, z17, aVar, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gu0.p1
            if (r0 == 0) goto L13
            r0 = r6
            gu0.p1 r0 = (gu0.p1) r0
            int r1 = r0.f275790g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275790g = r1
            goto L18
        L13:
            gu0.p1 r0 = new gu0.p1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f275788e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275790g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f275787d
            gu0.k2 r0 = (gu0.k2) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MJCC.Session"
            java.lang.String r2 = "releaseResources"
            com.tencent.mars.xlog.Log.i(r6, r2)
            oz5.l r6 = r5.f275736l
            gu0.q1 r2 = new gu0.q1
            r2.<init>(r5, r3)
            r0.f275787d = r5
            r0.f275790g = r4
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r0 = r5
        L51:
            r6 = 0
            r0.f275742r = r6
            r0.f275743s = r3
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.String s(java.lang.String str) {
        try {
            return ((eu0.e) this.f275726b).a("wxalite94c410838e79a4cecb3dcd66bc6054a3", str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJCC.Session", "resolveLocalIdToPath: failed to resolve localId=" + str + ", error=" + e17.getMessage());
            return null;
        }
    }

    public final void t() {
        com.tencent.mars.xlog.Log.i("MJCC.Session", "resumePlayback");
        if (this.f275742r) {
            kotlinx.coroutines.l.d(this.f275728d, null, null, new gu0.u1(this, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.u(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:16|17))(2:18|(2:27|(1:29))(1:26))|12|13))|32|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        com.tencent.mars.xlog.Log.e("MJCC.Session", "startPlaybackIfReady: failed: " + r13.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof gu0.b2
            if (r0 == 0) goto L13
            r0 = r13
            gu0.b2 r0 = (gu0.b2) r0
            int r1 = r0.f275636h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275636h = r1
            goto L18
        L13:
            gu0.b2 r0 = new gu0.b2
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f275634f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275636h
            java.lang.String r3 = "MJCC.Session"
            r4 = 1
            jz5.f0 r5 = jz5.f0.f302826a
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r1 = r0.f275633e
            com.tencent.maas.model.time.MJTimeRange r1 = (com.tencent.maas.model.time.MJTimeRange) r1
            java.lang.Object r0 = r0.f275632d
            com.tencent.maas.moviecomposing.PlaybackSession r0 = (com.tencent.maas.moviecomposing.PlaybackSession) r0
            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L33
            goto L80
        L33:
            r13 = move-exception
            goto L86
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3d:
            kotlin.ResultKt.throwOnFailure(r13)
            com.tencent.maas.moviecomposing.PlaybackSession r6 = r12.f275738n
            if (r6 != 0) goto L45
            return r5
        L45:
            com.tencent.maas.moviecomposing.Timeline r13 = r12.f275737m
            if (r13 != 0) goto L4a
            return r5
        L4a:
            boolean r2 = r12.f275742r
            if (r2 != 0) goto L4f
            return r5
        L4f:
            com.tencent.maas.model.time.MJTime r8 = com.tencent.maas.model.time.MJTime.ZeroTime     // Catch: java.lang.Exception -> L33
            com.tencent.maas.model.time.MJTime r13 = r13.l()     // Catch: java.lang.Exception -> L33
            com.tencent.maas.model.time.MJTimeRange r7 = com.tencent.maas.model.time.MJTimeRange.fromStartEnd(r8, r13)     // Catch: java.lang.Exception -> L33
            java.lang.String r13 = "fromStartEnd(...)"
            kotlin.jvm.internal.o.f(r7, r13)     // Catch: java.lang.Exception -> L33
            r0.f275632d = r6     // Catch: java.lang.Exception -> L33
            r0.f275633e = r7     // Catch: java.lang.Exception -> L33
            r0.f275636h = r4     // Catch: java.lang.Exception -> L33
            oz5.n r13 = new oz5.n     // Catch: java.lang.Exception -> L33
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)     // Catch: java.lang.Exception -> L33
            r13.<init>(r0)     // Catch: java.lang.Exception -> L33
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 1
            gu0.c2 r11 = new gu0.c2     // Catch: java.lang.Exception -> L33
            r11.<init>(r13)     // Catch: java.lang.Exception -> L33
            r6.startPlaying(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L33
            java.lang.Object r13 = r13.a()     // Catch: java.lang.Exception -> L33
            if (r13 != r1) goto L80
            return r1
        L80:
            java.lang.String r13 = "startPlaybackIfReady: playing"
            com.tencent.mars.xlog.Log.i(r3, r13)     // Catch: java.lang.Exception -> L33
            goto L9b
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "startPlaybackIfReady: failed: "
            r0.<init>(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.tencent.mars.xlog.Log.e(r3, r13)
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.v(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w() {
        com.tencent.mars.xlog.Log.i("MJCC.Session", "stopPlayback");
        kotlinx.coroutines.l.d(this.f275728d, null, null, new gu0.d2(this, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:16|17))(2:18|(1:20)(2:21|(1:23)))|12|13))|26|6|7|(0)(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002d, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        com.tencent.mars.xlog.Log.e("MJCC.Session", "stopPlaybackInternal: " + r6.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof gu0.e2
            if (r0 == 0) goto L13
            r0 = r6
            gu0.e2 r0 = (gu0.e2) r0
            int r1 = r0.f275664g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f275664g = r1
            goto L18
        L13:
            gu0.e2 r0 = new gu0.e2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f275662e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f275664g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f275661d
            com.tencent.maas.moviecomposing.PlaybackSession r0 = (com.tencent.maas.moviecomposing.PlaybackSession) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L2d
            goto L72
        L2d:
            r6 = move-exception
            goto L5b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.maas.moviecomposing.PlaybackSession r6 = r5.f275738n
            if (r6 != 0) goto L3f
            return r3
        L3f:
            r0.f275661d = r6     // Catch: java.lang.Exception -> L2d
            r0.f275664g = r4     // Catch: java.lang.Exception -> L2d
            oz5.n r2 = new oz5.n     // Catch: java.lang.Exception -> L2d
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)     // Catch: java.lang.Exception -> L2d
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2d
            gu0.f2 r0 = new gu0.f2     // Catch: java.lang.Exception -> L2d
            r0.<init>(r2)     // Catch: java.lang.Exception -> L2d
            r6.stopPlaying(r0)     // Catch: java.lang.Exception -> L2d
            java.lang.Object r6 = r2.a()     // Catch: java.lang.Exception -> L2d
            if (r6 != r1) goto L72
            return r1
        L5b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "stopPlaybackInternal: "
            r0.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MJCC.Session"
            com.tencent.mars.xlog.Log.e(r0, r6)
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.k2.x(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
