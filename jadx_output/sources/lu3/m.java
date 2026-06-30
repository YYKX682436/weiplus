package lu3;

/* loaded from: classes10.dex */
public final class m extends zr0.c {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f321417m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f321418n;

    /* renamed from: o, reason: collision with root package name */
    public ht0.s f321419o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f321420p;

    /* renamed from: q, reason: collision with root package name */
    public android.opengl.EGLContext f321421q;

    /* renamed from: r, reason: collision with root package name */
    public int f321422r;

    /* renamed from: s, reason: collision with root package name */
    public int f321423s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f321424t;

    /* renamed from: u, reason: collision with root package name */
    public final long f321425u;

    /* renamed from: v, reason: collision with root package name */
    public long f321426v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f321427w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f321428x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        super(false, 1, null);
        z17 = (i17 & 1) != 0 ? false : z17;
        this.f321417m = z17;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_camerakit_record_glfence, false);
        this.f321418n = fj6;
        this.f321425u = 1500L;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", "enableGlFence:" + fj6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // nr0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof lu3.c
            if (r0 == 0) goto L13
            r0 = r6
            lu3.c r0 = (lu3.c) r0
            int r1 = r0.f321390g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f321390g = r1
            goto L18
        L13:
            lu3.c r0 = new lu3.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f321388e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f321390g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f321387d
            lu3.m r0 = (lu3.m) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L58
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.CameraKitRecorder"
            java.lang.String r2 = "create"
            com.tencent.mars.xlog.Log.i(r6, r2)
            r0.f321387d = r5
            r0.f321390g = r4
            boolean r6 = r5.f475110d
            if (r6 == 0) goto L54
            android.opengl.EGLContext r6 = android.opengl.EGL14.eglGetCurrentContext()
            zr0.a r0 = new zr0.a
            r0.<init>(r5, r6)
            r6 = 0
            r5.c(r6, r0)
        L54:
            if (r3 != r1) goto L57
            return r1
        L57:
            r0 = r5
        L58:
            android.opengl.EGLContext r6 = android.opengl.EGL14.eglGetCurrentContext()
            r0.f321421q = r6
            lu3.d r6 = new lu3.d
            r6.<init>(r0)
            kotlinx.coroutines.r2 r6 = r0.c(r4, r6)
            r0.f321427w = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if ((r2 == null && r1.f294395e == r2.K) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // nr0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(is0.c r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.d(is0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e(boolean z17, lu3.a aVar) {
        ht0.s sVar;
        java.lang.String str;
        android.os.Bundle bundle;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara;
        if (this.f321420p == null || this.f321421q == null) {
            return;
        }
        if (!this.f321428x || z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", "create recorder");
            ht0.s sVar2 = this.f321419o;
            if (sVar2 != null) {
                sVar2.cancel();
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f321420p;
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = (com.tencent.mm.modelcontrol.VideoTransPara) ((recordConfigProvider == null || (videoTransPara = recordConfigProvider.f155676n) == null) ? null : videoTransPara.clone());
            if (videoTransPara2 != null) {
                int i17 = videoTransPara2.f71194g;
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f321420p;
                int i18 = 2;
                if (recordConfigProvider2 != null && (bundle = recordConfigProvider2.M) != null) {
                    i18 = bundle.getInt("key_record_bitrate_ratio", 2);
                }
                videoTransPara2.f71194g = i17 * i18;
                ht0.s sVar3 = new ht0.s(videoTransPara2, new lu3.b(), this.f321421q, -1);
                this.f321419o = sVar3;
                sVar3.G = this.f321424t;
                sVar3.k(0);
                ht0.s sVar4 = this.f321419o;
                if (sVar4 != null) {
                    if (this.f321417m) {
                        str = dw3.h.d(dw3.h.f244211a, null, null, 3, null);
                    } else {
                        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.f321420p;
                        str = recordConfigProvider3 != null ? recordConfigProvider3.A : null;
                    }
                    sVar4.f284755c = str;
                }
                if (!dw3.h.f244211a.f() && (sVar = this.f321419o) != null) {
                    com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider4 = this.f321420p;
                    sVar.f284772t = recordConfigProvider4 != null ? recordConfigProvider4.C : null;
                }
            }
            this.f321428x = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void f(lu3.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", "reset");
        boolean z17 = false;
        this.f321422r = 0;
        this.f321423s = 0;
        ht0.s sVar = this.f321419o;
        if (sVar != null && sVar.f284778z) {
            z17 = true;
        }
        if (!z17) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        if (sVar != null) {
            sVar.cancel();
        }
        ht0.s sVar2 = this.f321419o;
        if (sVar2 != null) {
            sVar2.clear();
        }
        this.f321419o = null;
        synchronized (this.f475115i) {
            this.f475111e.clear();
        }
        this.f321427w = c(true, new lu3.i(this, aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // nr0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lu3.e
            if (r0 == 0) goto L13
            r0 = r7
            lu3.e r0 = (lu3.e) r0
            int r1 = r0.f321395g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f321395g = r1
            goto L18
        L13:
            lu3.e r0 = new lu3.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f321393e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f321395g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            java.lang.Object r0 = r0.f321392d
            lu3.m r0 = (lu3.m) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L56
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = "MicroMsg.CameraKitRecorder"
            java.lang.String r2 = "release"
            com.tencent.mars.xlog.Log.i(r7, r2)
            r0.f321392d = r6
            r0.f321395g = r5
            kotlinx.coroutines.y0 r7 = r6.f475113g
            if (r7 == 0) goto L4b
            kotlinx.coroutines.z0.c(r7, r4)
        L4b:
            android.os.HandlerThread r7 = r6.f475112f
            if (r7 == 0) goto L52
            r7.quitSafely()
        L52:
            if (r3 != r1) goto L55
            return r1
        L55:
            r0 = r6
        L56:
            r0.f321421q = r4
            r7 = 0
            r0.f321422r = r7
            r0.f321423s = r7
            ht0.s r1 = r0.f321419o
            if (r1 == 0) goto L64
            r1.cancel()
        L64:
            ht0.s r1 = r0.f321419o
            if (r1 == 0) goto L6b
            r1.clear()
        L6b:
            r0.f321428x = r7
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", "setMute " + z17);
        this.f321424t = z17;
        ht0.s sVar = this.f321419o;
        if (sVar != null) {
            sVar.G = z17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof lu3.j
            if (r0 == 0) goto L13
            r0 = r10
            lu3.j r0 = (lu3.j) r0
            int r1 = r0.f321412i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f321412i = r1
            goto L18
        L13:
            lu3.j r0 = new lu3.j
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f321410g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f321412i
            java.lang.String r3 = "MicroMsg.CameraKitRecorder"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 != r5) goto L35
            boolean r8 = r0.f321409f
            int r9 = r0.f321408e
            java.lang.Object r0 = r0.f321407d
            lu3.m r0 = (lu3.m) r0
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L6d
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.r2 r10 = r7.f321427w
            if (r10 == 0) goto L4e
            kotlinx.coroutines.a r10 = (kotlinx.coroutines.a) r10
            boolean r10 = r10.a()
            if (r10 != r5) goto L4e
            r10 = r5
            goto L4f
        L4e:
            r10 = r4
        L4f:
            if (r10 == 0) goto L6c
            java.lang.String r10 = "startRecord >> but initRecorderJob is no finish, go to join it"
            com.tencent.mars.xlog.Log.w(r3, r10)
            kotlinx.coroutines.r2 r10 = r7.f321427w
            if (r10 == 0) goto L6c
            r0.f321407d = r7
            r0.f321408e = r8
            r0.f321409f = r9
            r0.f321412i = r5
            kotlinx.coroutines.c3 r10 = (kotlinx.coroutines.c3) r10
            java.lang.Object r10 = r10.C(r0)
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r0 = r7
        L6d:
            long r1 = java.lang.System.currentTimeMillis()
            r0.f321426v = r1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "startRecord >> "
            r10.<init>(r1)
            r10.append(r8)
            java.lang.String r1 = ", "
            r10.append(r1)
            r10.append(r9)
            r10.append(r1)
            long r1 = r0.f321426v
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.tencent.mars.xlog.Log.i(r3, r10)
            ht0.s r10 = r0.f321419o
            if (r10 != 0) goto L9e
            java.lang.String r10 = "mediaRecorder is null!!!, record has some problem"
            com.tencent.mars.xlog.Log.w(r3, r10)
        L9e:
            ht0.s r10 = r0.f321419o
            if (r10 == 0) goto La9
            int r8 = r10.y(r4, r9, r8)
            qz5.b.d(r8)
        La9:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lu3.m.i(int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final java.lang.Object j(boolean z17, kotlin.coroutines.Continuation continuation) {
        jz5.f0 f0Var;
        ht0.s sVar;
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", "stopRecord >> startTime >> " + this.f321426v);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f321426v;
        if (currentTimeMillis - j17 <= this.f321425u || j17 == 0) {
            this.f321426v = 0L;
            f(null);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(new java.lang.Integer(-4), null)));
        } else {
            this.f321426v = 0L;
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (z17 && (sVar = this.f321419o) != null) {
                sVar.D = new lu3.k(nVar);
            }
            ht0.s sVar2 = this.f321419o;
            if (sVar2 != null) {
                sVar2.g(new lu3.l(this, currentTimeMillis2, nVar));
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                nVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(new java.lang.Integer(-1), null)));
            }
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }
}
