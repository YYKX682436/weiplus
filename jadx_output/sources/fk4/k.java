package fk4;

/* loaded from: classes12.dex */
public final class k implements fk4.u {

    /* renamed from: z, reason: collision with root package name */
    public static final boolean f263612z = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_video_cdn_diff_enable, true);

    /* renamed from: a, reason: collision with root package name */
    public final fk4.p f263613a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f263614b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f263615c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.q f263616d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.q f263617e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f263618f;

    /* renamed from: g, reason: collision with root package name */
    public int f263619g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f263620h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f263621i;

    /* renamed from: j, reason: collision with root package name */
    public float f263622j;

    /* renamed from: k, reason: collision with root package name */
    public final d61.k f263623k;

    /* renamed from: l, reason: collision with root package name */
    public fk4.t f263624l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f263625m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f263626n;

    /* renamed from: o, reason: collision with root package name */
    public long f263627o;

    /* renamed from: p, reason: collision with root package name */
    public final long[] f263628p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f263629q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f263630r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f263631s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Long f263632t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f263633u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.q f263634v;

    /* renamed from: w, reason: collision with root package name */
    public final long f263635w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f263636x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$videoEventListener$1 f263637y;

    /* JADX WARN: Type inference failed for: r0v14, types: [com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$videoEventListener$1] */
    public k(fk4.p task) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f263613a = task;
        this.f263614b = "MicroMsg.CdnVideoResourceDownloader@" + hashCode();
        this.f263615c = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f263623k = new d61.k();
        this.f263625m = new java.util.HashSet();
        this.f263626n = new java.lang.Object();
        this.f263628p = new long[2];
        this.f263630r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f263631s = new java.util.concurrent.CopyOnWriteArraySet();
        this.f263633u = task.k();
        java.lang.Long c17 = task.c();
        this.f263635w = c17 != null ? c17.longValue() : 0L;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f263637y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnlineVideoEvent>(a0Var) { // from class: com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader$videoEventListener$1
            {
                this.__eventId = -2133747774;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent) {
                com.tencent.mm.autogen.events.OnlineVideoEvent event = onlineVideoEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54588g.f6846c;
                if (str != null && kotlin.jvm.internal.o.b(str, fk4.k.this.f())) {
                    int i17 = event.f54588g.f6845b;
                    if (i17 == 0 || i17 == -21006) {
                        com.tencent.mars.xlog.Log.i(fk4.k.this.f263614b, "onEvent: opcode=" + event.f54588g.f6844a + ", mediaId=" + event.f54588g.f6846c + ", length=" + event.f54588g.f6848e);
                        am.hn hnVar = event.f54588g;
                        switch (hnVar.f6844a) {
                            case 1:
                                com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = new com.tencent.mars.cdn.CdnManager.VideoInfo();
                                am.hn hnVar2 = event.f54588g;
                                videoInfo.svrFlag = hnVar2.f6851h;
                                videoInfo.oriVideoFormat = hnVar2.f6853j;
                                videoInfo.videoFormat = hnVar2.f6852i;
                                videoInfo.videoPath = hnVar2.f6855l;
                                videoInfo.requestFlag = hnVar2.f6854k;
                                fk4.k.this.j(hnVar2.f6847d, hnVar2.f6848e, videoInfo);
                                break;
                            case 2:
                                fk4.k kVar = fk4.k.this;
                                long j17 = hnVar.f6847d;
                                long j18 = hnVar.f6848e;
                                kVar.getClass();
                                try {
                                    kVar.f263627o = kVar.f263623k.d((int) j17, (int) j18) * 1000;
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.w(kVar.f263614b, "Unable to parse video time: " + e17.getMessage());
                                }
                                com.tencent.mars.xlog.Log.i(kVar.f263614b, "onDataAvailable: offset=" + j17 + ", length=" + j18 + ", videoTime=" + kVar.f263627o + ", mediaId=" + kVar.f());
                                kVar.f263630r.set(false);
                                if (kVar.f263621i && kVar.f263622j < 100.0f) {
                                    kVar.m();
                                }
                                fk4.t tVar = kVar.f263624l;
                                if (tVar != null) {
                                    tVar.b(kVar.f263613a.c(), j17, j18, kVar.f263613a.g());
                                    break;
                                }
                                break;
                            case 3:
                                fk4.k.this.f263632t = java.lang.Long.valueOf(hnVar.f6847d + hnVar.f6848e);
                                com.tencent.mars.xlog.Log.i(fk4.k.this.f263614b, "cdn download to end, cdn length = " + fk4.k.this.f263632t + ",continueDownload = " + fk4.k.this.f263621i + ",current download percent is " + fk4.k.this.f263622j);
                                fk4.k.this.f263630r.set(false);
                                break;
                            case 4:
                                long k17 = com.tencent.mm.vfs.w6.k(fk4.k.this.n());
                                if (k17 <= 0) {
                                    k17 = event.f54588g.f6848e;
                                }
                                com.tencent.mars.xlog.Log.i(fk4.k.this.f263614b, "download finish, xml length = " + fk4.k.this.f263613a.getLength() + ", actual size = " + k17);
                                fk4.k.a(fk4.k.this, event.f54588g.f6845b, k17);
                                break;
                            case 5:
                                fk4.k.this.k(hnVar.f6847d, hnVar.f6848e);
                                break;
                            case 6:
                                fk4.k kVar2 = fk4.k.this;
                                com.tencent.mars.xlog.Log.i(kVar2.f263614b, "onDuplicateFileFound, mediaId=" + kVar2.f());
                                kotlinx.coroutines.q qVar = kVar2.f263616d;
                                if (qVar != null) {
                                    ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
                                }
                                kVar2.f263616d = null;
                                kotlinx.coroutines.q qVar2 = kVar2.f263617e;
                                if (qVar2 != null) {
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    ((kotlinx.coroutines.r) qVar2).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                                }
                                kVar2.f263617e = null;
                                fk4.p pVar = kVar2.f263613a;
                                pVar.a();
                                java.util.Iterator it = kVar2.f263631s.iterator();
                                while (it.hasNext()) {
                                    ((ok4.a) it.next()).j();
                                }
                                fk4.t tVar2 = kVar2.f263624l;
                                if (tVar2 != null) {
                                    tVar2.c(pVar.c(), 0, pVar.g());
                                    break;
                                }
                                break;
                            case 7:
                                java.util.Iterator it6 = fk4.k.this.f263631s.iterator();
                                while (it6.hasNext()) {
                                    ((ok4.a) it6.next()).w(event.f54588g.f6849f);
                                }
                                fk4.k kVar3 = fk4.k.this;
                                fk4.t tVar3 = kVar3.f263624l;
                                if (tVar3 != null) {
                                    tVar3.g(kVar3.f263613a.c(), fk4.k.this.f263613a.g());
                                    break;
                                }
                                break;
                            default:
                                com.tencent.mars.xlog.Log.w(fk4.k.this.f263614b, "unknown event opcode " + event.f54588g.f6844a + ", mediaId=" + fk4.k.this.f());
                                break;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w(fk4.k.this.f263614b, "stream download online video error. retCode: " + event.f54588g.f6845b + ", mediaId=" + fk4.k.this.f());
                        fk4.k kVar4 = fk4.k.this;
                        am.hn hnVar3 = event.f54588g;
                        fk4.k.a(kVar4, hnVar3.f6845b, (long) hnVar3.f6848e);
                    }
                }
                return false;
            }
        };
    }

    public static final void a(fk4.k kVar, int i17, long j17) {
        java.lang.Throwable rVar;
        t21.v2 h17;
        java.lang.String str;
        java.lang.String str2;
        java.util.Map d17;
        java.lang.String str3 = kVar.f263614b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinish: ret=");
        sb6.append(i17);
        sb6.append(", mediaId=");
        sb6.append(kVar.f());
        sb6.append(", file length=");
        sb6.append(j17);
        sb6.append(",onVideoDownloadEnd call is ");
        sb6.append(kVar.f263634v != null);
        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
        kVar.f263618f = true;
        kVar.f263619g = i17;
        kVar.f263630r.set(false);
        kVar.f263613a.a();
        if (i17 == 0) {
            kVar.e();
        }
        yz5.q qVar = kVar.f263634v;
        if (qVar != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(kVar.f263635w);
            java.lang.String e17 = kVar.f263613a.e();
            if (e17 == null) {
                e17 = "";
            }
            qVar.invoke(valueOf, e17, java.lang.Boolean.valueOf(i17 == 0));
        }
        kVar.f263634v = null;
        if (i17 == 0) {
            java.lang.Long l17 = kVar.f263629q;
            if (l17 == null || j17 != l17.longValue()) {
                com.tencent.mars.xlog.Log.i(kVar.f263614b, "onFinish, svrLength != completeLength, svrLength = " + kVar.f263629q + " completeLength = " + j17 + ", fix svrLength");
                kVar.f263629q = java.lang.Long.valueOf(j17);
            }
            if (!kVar.f263620h) {
                java.util.Iterator it = kVar.f263631s.iterator();
                while (it.hasNext()) {
                    ((ok4.a) it.next()).m();
                }
                kotlinx.coroutines.q qVar2 = kVar.f263616d;
                if (qVar2 != null) {
                    ((kotlinx.coroutines.r) qVar2).resumeWith(kotlin.Result.m521constructorimpl(null));
                }
                kVar.f263616d = null;
            }
            kotlinx.coroutines.q qVar3 = kVar.f263617e;
            if (qVar3 != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar3).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(i17 == 0)));
            }
            kVar.f263617e = null;
            java.util.Iterator it6 = kVar.f263631s.iterator();
            while (it6.hasNext()) {
                ((ok4.a) it6.next()).c();
            }
            java.lang.String e18 = kVar.f263613a.e();
            if (e18 != null) {
                if (r26.i0.n(e18, ya.b.ORIGIN, false)) {
                    h17 = t21.d3.h(r26.n0.q0(e18, ya.b.ORIGIN, e18));
                    str = ".msg.videomsg.$cdnrawvideourl";
                    str2 = ".msg.videomsg.$cdnrawvideoaeskey";
                } else {
                    h17 = t21.d3.h(e18);
                    str = ".msg.videomsg.$cdnvideourl";
                    str2 = ".msg.videomsg.$aeskey";
                }
                java.lang.String g17 = h17 != null ? h17.g() : null;
                if (g17 != null && (d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "msg", null)) != null) {
                    t21.w2 Ui = t21.o2.Ui();
                    i95.m c17 = i95.n0.c(tg3.u0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    Ui.B(tg3.u0.e8((tg3.u0) c17, null, bm5.f0.f22571s, e18, false, 8, null), (java.lang.String) d17.get(str), (java.lang.String) d17.get(str2));
                }
            }
        } else {
            if (i17 == -5103087 || i17 == -5103059) {
                rVar = new fk4.r(i17);
            } else if (i17 == -10012 || i17 == -10011) {
                rVar = new fk4.s(i17);
            } else {
                rVar = new fk4.q(i17, "Unable to download file: code=" + i17);
            }
            if (!kVar.f263620h) {
                kotlinx.coroutines.q qVar4 = kVar.f263616d;
                if (qVar4 != null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    ((kotlinx.coroutines.r) qVar4).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(rVar)));
                }
                kVar.f263616d = null;
            }
            kotlinx.coroutines.q qVar5 = kVar.f263617e;
            if (qVar5 != null) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar5).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(rVar)));
            }
            kVar.f263617e = null;
            java.util.Iterator it7 = kVar.f263631s.iterator();
            while (it7.hasNext()) {
                ((ok4.a) it7.next()).n(i17);
            }
            kVar.f263613a.stop();
            fk4.t tVar = kVar.f263624l;
            if (tVar != null) {
                tVar.d(kVar.f263613a.c(), kVar.f263613a.g());
            }
        }
        fk4.t tVar2 = kVar.f263624l;
        if (tVar2 != null) {
            tVar2.c(kVar.f263613a.c(), i17, kVar.f263613a.g());
        }
    }

    public void b(ok4.a reporter) {
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f263631s.add(reporter);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof fk4.e
            if (r0 == 0) goto L13
            r0 = r5
            fk4.e r0 = (fk4.e) r0
            int r1 = r0.f263601g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263601g = r1
            goto L18
        L13:
            fk4.e r0 = new fk4.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f263599e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f263601g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f263598d
            fk4.k r0 = (fk4.k) r0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L67
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r5)
            boolean r5 = r4.f263618f
            if (r5 == 0) goto L45
            int r5 = r4.f263619g
            if (r5 != 0) goto L3f
            goto L40
        L3f:
            r3 = 0
        L40:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L45:
            r0.f263598d = r4
            r0.f263601g = r3
            kotlinx.coroutines.r r5 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r5.<init>(r0, r3)
            r5.k()
            r4.f263617e = r5
            fk4.f r0 = new fk4.f
            r0.<init>(r4)
            r5.m(r0)
            java.lang.Object r5 = r5.j()
            if (r5 != r1) goto L66
            return r1
        L66:
            r0 = r4
        L67:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1 = 0
            r0.f263617e = r1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fk4.k.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fk4.g
            if (r0 == 0) goto L13
            r0 = r6
            fk4.g r0 = (fk4.g) r0
            int r1 = r0.f263606g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263606g = r1
            goto L18
        L13:
            fk4.g r0 = new fk4.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f263604e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f263606g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f263603d
            fk4.k r0 = (fk4.k) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.f263620h
            if (r6 == 0) goto L3c
            return r3
        L3c:
            r0.f263603d = r5
            r0.f263606g = r4
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r6.<init>(r0, r4)
            r6.k()
            r5.f263616d = r6
            fk4.h r0 = new fk4.h
            r0.<init>(r5)
            r6.m(r0)
            java.lang.Object r6 = r6.j()
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
        L5e:
            com.tencent.mars.cdn.CdnManager$VideoInfo r6 = (com.tencent.mars.cdn.CdnManager.VideoInfo) r6
            r0.f263616d = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fk4.k.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        fk4.p pVar = this.f263613a;
        if (t21.u2.b(pVar.j())) {
            com.tencent.mars.xlog.Log.i(this.f263614b, "download finish and is hevc need complete " + pVar.e() + " , mediaId=" + f());
            if (t21.d3.I(pVar.e())) {
                java.util.Iterator it = this.f263631s.iterator();
                while (it.hasNext()) {
                    ((ok4.a) it.next()).u();
                }
            }
        }
    }

    public java.lang.String f() {
        return this.f263613a.i();
    }

    public long g() {
        java.lang.Long l17 = this.f263629q;
        return l17 != null ? l17.longValue() : this.f263613a.getLength();
    }

    public boolean h() {
        this.f263613a.a();
        return (this.f263618f && this.f263619g == 0) || this.f263613a.isFinished();
    }

    public boolean i() {
        return this.f263636x && !h() && this.f263613a.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r14) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r9.f263623k.a(r14, r10) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        r2 = r9.f263624l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        r2.e(r9.f263613a.c(), r10, r12, r9.f263613a.g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        r10 = r9.f263631s.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r10.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        ((ok4.a) r10.next()).o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        r10 = r9.f263631s.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r10.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        ((ok4.a) r10.next()).r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        t21.o2.Di().p(f(), 0, -1, 0);
        t21.d3.J(r9.f263613a.e(), 15);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void j(long r10, long r12, com.tencent.mars.cdn.CdnManager.VideoInfo r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk4.k.j(long, long, com.tencent.mars.cdn.CdnManager$VideoInfo):void");
    }

    public final void k(long j17, long j18) {
        java.lang.Long valueOf;
        boolean z17 = f263612z;
        fk4.p pVar = this.f263613a;
        if (z17) {
            valueOf = java.lang.Long.valueOf((java.lang.Math.abs(pVar.getLength() - j18) > 16 || pVar.getLength() >= j18) ? j18 : pVar.getLength());
        } else {
            valueOf = java.lang.Long.valueOf((pVar.getLength() <= 0 || pVar.getLength() == j18) ? j18 : pVar.getLength());
        }
        this.f263629q = valueOf;
        this.f263622j = (((float) j17) * 100.0f) / ((float) j18);
        com.tencent.mars.xlog.Log.i(this.f263614b, pVar.i() + " onProgress: " + j17 + " / " + j18 + " (" + this.f263622j + "%)");
        fk4.t tVar = this.f263624l;
        if (tVar != null) {
            tVar.a(pVar.c(), j17, j18, pVar.g());
        }
        java.util.Iterator it = this.f263631s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).d(j17);
        }
    }

    public final void l() {
        if (!this.f263636x) {
            com.tencent.mars.xlog.Log.w(this.f263614b, "downloader hasn't been started, ignore call");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f263614b, "pause downloader[" + this.f263635w + "] [" + f() + "]()");
        java.util.Iterator it = this.f263631s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).p();
        }
        java.lang.String f17 = f();
        if (f17 == null || f17.length() == 0) {
            return;
        }
        if (this.f263618f) {
            e();
        }
        if (this.f263622j >= this.f263613a.d() && !this.f263618f) {
            this.f263613a.l();
            java.util.Iterator it6 = this.f263631s.iterator();
            while (it6.hasNext()) {
                ((ok4.a) it6.next()).k();
            }
            com.tencent.mars.xlog.Log.i(this.f263614b, "start complete video, downloaded (" + this.f263622j + ") more than config (" + this.f263613a.d() + ").");
        }
        this.f263613a.stop();
    }

    public void m() {
        if (this.f263621i) {
            this.f263630r.set(false);
        }
        com.tencent.mars.xlog.Log.i(this.f263614b, "request all mediaId=" + f() + ",continueDownload is " + this.f263621i + ",current flag is " + this.f263630r.get());
        synchronized (this.f263626n) {
            this.f263625m.add("0_-1");
        }
        this.f263615c.post(new fk4.j(this));
    }

    public java.lang.String n() {
        return this.f263613a.j();
    }

    public boolean o() {
        java.lang.String str = "start(), mediaId=" + f();
        java.lang.String str2 = this.f263614b;
        com.tencent.mars.xlog.Log.i(str2, str);
        fk4.p pVar = this.f263613a;
        if (!pVar.start()) {
            com.tencent.mars.xlog.Log.w(str2, "task is not started successfully");
            return false;
        }
        this.f263636x = true;
        alive();
        com.tencent.mars.xlog.Log.i(str2, "Start download online video " + f() + '-' + pVar.e());
        java.util.Iterator it = this.f263631s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).b();
        }
        fk4.o b17 = pVar.b();
        if (b17 != null) {
            com.tencent.mars.xlog.Log.i(str2, "task is already in progress");
            long j17 = b17.f263651d;
            if (j17 > 0) {
                j(b17.f263650c, j17, null);
            }
            long j18 = b17.f263649b;
            if (j18 > 0) {
                k(b17.f263648a, j18);
            }
        }
        return true;
    }

    public void p() {
        if (!this.f263636x) {
            com.tencent.mars.xlog.Log.w(this.f263614b, "downloader hasn't been started, ignore call");
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f263614b, "stop downloader[" + this.f263635w + "] [" + f() + "]()");
        java.util.Iterator it = this.f263631s.iterator();
        while (it.hasNext()) {
            ((ok4.a) it.next()).p();
        }
        com.tencent.mars.xlog.Log.i(this.f263614b, "reset(), mediaId=" + f());
        synchronized (this.f263626n) {
            this.f263625m.clear();
        }
        if (com.tencent.mm.sdk.event.d.f192370d.b(this.f263637y)) {
            dead();
        }
        this.f263615c.removeCallbacksAndMessages(null);
        yz5.q qVar = this.f263634v;
        if (qVar != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f263635w);
            java.lang.String e17 = this.f263613a.e();
            if (e17 == null) {
                e17 = "";
            }
            qVar.invoke(valueOf, e17, java.lang.Boolean.FALSE);
        }
        this.f263634v = null;
        this.f263630r.set(false);
        kotlinx.coroutines.q qVar2 = this.f263616d;
        if (qVar2 != null) {
            kotlinx.coroutines.p.a(qVar2, null, 1, null);
        }
        this.f263616d = null;
        kotlinx.coroutines.q qVar3 = this.f263617e;
        if (qVar3 != null) {
            kotlinx.coroutines.p.a(qVar3, null, 1, null);
        }
        this.f263617e = null;
        this.f263621i = false;
        java.lang.String f17 = f();
        if (f17 == null || f17.length() == 0) {
            return;
        }
        if (this.f263618f) {
            e();
        }
        if (this.f263622j >= this.f263613a.d() && !this.f263618f) {
            this.f263613a.l();
            java.util.Iterator it6 = this.f263631s.iterator();
            while (it6.hasNext()) {
                ((ok4.a) it6.next()).k();
            }
            com.tencent.mars.xlog.Log.i(this.f263614b, "start complete video, downloaded (" + this.f263622j + ") more than config (" + this.f263613a.d() + ").");
        }
        this.f263613a.stop();
    }

    public java.lang.String toString() {
        return "CdnVideoResourceDownloader: mediaId=" + f() + ", savedPath=" + n() + ", moovReady=" + this.f263620h + ", finished=" + this.f263618f + ", totalLength=" + g() + ", started=" + this.f263636x + ", hashCode=" + hashCode();
    }
}
