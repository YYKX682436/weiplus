package pq3;

/* loaded from: classes12.dex */
public final class j implements qq3.l {

    /* renamed from: a, reason: collision with root package name */
    public qq3.i f357636a;

    /* renamed from: b, reason: collision with root package name */
    public long f357637b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f357639d;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$onlineVideoListener$1 f357644i;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f357638c = kotlinx.coroutines.sync.l.a(false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    public long f357640e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f357641f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f357642g = jz5.h.b(pq3.i.f357635d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f357643h = jz5.h.b(pq3.e.f357619d);

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$onlineVideoListener$1] */
    public j() {
        final fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        this.f357644i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnlineVideoEvent>(nVar) { // from class: com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$onlineVideoListener$1
            {
                this.__eventId = -2133747774;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent) {
                boolean z17;
                char c17;
                com.tencent.mm.autogen.events.OnlineVideoEvent event = onlineVideoEvent;
                kotlin.jvm.internal.o.g(event, "event");
                char c18 = 2;
                pq3.j jVar = pq3.j.this;
                boolean z18 = false;
                for (qq3.i iVar : kz5.c0.i(jVar.f357636a, jVar.f().f357677c)) {
                    if (iVar != null) {
                        if (iVar instanceof qq3.k) {
                            am.hn hnVar = event.f54588g;
                            if (hnVar.f6844a == 6) {
                                qq3.k kVar = (qq3.k) iVar;
                                java.lang.String mediaId = hnVar.f6846c;
                                kotlin.jvm.internal.o.f(mediaId, "mediaId");
                                if (kotlin.jvm.internal.o.b(mediaId, kVar.f365965i)) {
                                    bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
                                    long j17 = kVar.f365961f;
                                    sq3.a aVar = kVar.f365960e;
                                    java.lang.String w07 = aVar.w0();
                                    kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
                                    ((kq3.e) sVar).Bi(3L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.getCreateTime());
                                    com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoMsgTask", "c2c pre download video task find in storage, msgSvrId:" + kVar.f365961f);
                                    c17 = 2;
                                    z17 = false;
                                    qq3.i.e(kVar, 1, 0, 2, null);
                                    c18 = c17;
                                    z18 = z17;
                                }
                            }
                        }
                        z17 = z18;
                        c17 = c18;
                        c18 = c17;
                        z18 = z17;
                    }
                }
                return z18;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(pq3.j r4, kotlin.coroutines.Continuation r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof pq3.a
            if (r0 == 0) goto L16
            r0 = r5
            pq3.a r0 = (pq3.a) r0
            int r1 = r0.f357604g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f357604g = r1
            goto L1b
        L16:
            pq3.a r0 = new pq3.a
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f357602e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f357604g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f357601d
            pq3.j r4 = (pq3.j) r4
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4c
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r5)
            qq3.i r5 = r4.f357636a
            if (r5 == 0) goto L41
            r2 = 6
            r5.a(r2)
        L41:
            r0.f357601d = r4
            r0.f357604g = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L4c
            goto L63
        L4c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "cancel now pre download task, task:"
            r5.<init>(r0)
            qq3.i r4 = r4.f357636a
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MicroMsg.C2CMsgPreDownloader"
            com.tencent.mars.xlog.Log.i(r5, r4)
            jz5.f0 r1 = jz5.f0.f302826a
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.j.a(pq3.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r6.b(null, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x0051, B:14:0x0059, B:19:0x0056), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(pq3.j r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof pq3.c
            if (r0 == 0) goto L16
            r0 = r6
            pq3.c r0 = (pq3.c) r0
            int r1 = r0.f357614h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f357614h = r1
            goto L1b
        L16:
            pq3.c r0 = new pq3.c
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f357612f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f357614h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r5 = r0.f357611e
            kotlinx.coroutines.sync.d r5 = (kotlinx.coroutines.sync.d) r5
            java.lang.Object r0 = r0.f357610d
            pq3.j r0 = (pq3.j) r0
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            r5 = r0
            goto L51
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.sync.d r6 = r5.f357638c
            r0.f357610d = r5
            r0.f357611e = r6
            r0.f357614h = r4
            kotlinx.coroutines.sync.k r6 = (kotlinx.coroutines.sync.k) r6
            java.lang.Object r0 = r6.b(r3, r0)
            if (r0 != r1) goto L51
            goto L62
        L51:
            boolean r0 = r5.f357639d     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L56
            goto L59
        L56:
            r5.f357639d = r4     // Catch: java.lang.Throwable -> L63
            r4 = 0
        L59:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L63
            kotlinx.coroutines.sync.k r6 = (kotlinx.coroutines.sync.k) r6
            r6.d(r3)
        L62:
            return r1
        L63:
            r5 = move-exception
            kotlinx.coroutines.sync.k r6 = (kotlinx.coroutines.sync.k) r6
            r6.d(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.j.b(pq3.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.sync.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pq3.j r5, qq3.i r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof pq3.f
            if (r0 == 0) goto L16
            r0 = r7
            pq3.f r0 = (pq3.f) r0
            int r1 = r0.f357625i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f357625i = r1
            goto L1b
        L16:
            pq3.f r0 = new pq3.f
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f357623g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f357625i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r5 = r0.f357622f
            kotlinx.coroutines.sync.d r5 = (kotlinx.coroutines.sync.d) r5
            java.lang.Object r6 = r0.f357621e
            qq3.i r6 = (qq3.i) r6
            java.lang.Object r0 = r0.f357620d
            pq3.j r0 = (pq3.j) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r5
            r5 = r0
            goto L57
        L39:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.sync.d r7 = r5.f357638c
            r0.f357620d = r5
            r0.f357621e = r6
            r0.f357622f = r7
            r0.f357625i = r4
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            java.lang.Object r0 = r7.b(r3, r0)
            if (r0 != r1) goto L57
            goto L60
        L57:
            r5.f357636a = r6     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            r7.d(r3)
            jz5.f0 r1 = jz5.f0.f302826a
        L60:
            return r1
        L61:
            r5 = move-exception
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            r7.d(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.j.c(pq3.j, qq3.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(long j17, int i17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CMsgPreDownloader", "c2c pre download: try cancel msgId:" + j17 + ", msgType:" + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j18);
        sb6.append('_');
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        nVar.A.b7(sb7, 5);
        qq3.i iVar = this.f357636a;
        if (iVar != null) {
            sq3.a aVar = iVar.f365960e;
            if (aVar.getMsgId() == j17 && aVar.D0() == i17) {
                qq3.a.b(iVar, 0, 1, null);
            }
        }
        pq3.q f17 = f();
        com.tencent.mm.sdk.coroutines.LifecycleScope scope = (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f357643h).getValue();
        f17.getClass();
        kotlin.jvm.internal.o.g(scope, "scope");
        qq3.i iVar2 = f17.f357677c;
        if (iVar2 != null && kotlin.jvm.internal.o.b(iVar2.f365960e.A0(), sb7)) {
            qq3.a.b(iVar2, 0, 1, null);
        }
        v65.i.b(scope, null, new pq3.l(f17, sb7, null), 1, null);
        this.f357640e = j17;
        this.f357641f = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof pq3.b
            if (r0 == 0) goto L13
            r0 = r6
            pq3.b r0 = (pq3.b) r0
            int r1 = r0.f357609h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f357609h = r1
            goto L18
        L13:
            pq3.b r0 = new pq3.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f357607f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f357609h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r1 = r0.f357606e
            kotlinx.coroutines.sync.d r1 = (kotlinx.coroutines.sync.d) r1
            java.lang.Object r0 = r0.f357605d
            pq3.j r0 = (pq3.j) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.sync.d r6 = r5.f357638c
            r0.f357605d = r5
            r0.f357606e = r6
            r0.f357609h = r3
            kotlinx.coroutines.sync.k r6 = (kotlinx.coroutines.sync.k) r6
            java.lang.Object r0 = r6.b(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            r6 = 0
            r0.f357639d = r6     // Catch: java.lang.Throwable -> L5b
            r0.f357636a = r4     // Catch: java.lang.Throwable -> L5b
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            r1.d(r4)
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        L5b:
            r6 = move-exception
            kotlinx.coroutines.sync.k r1 = (kotlinx.coroutines.sync.k) r1
            r1.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.j.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final pq3.q f() {
        return (pq3.q) ((jz5.n) this.f357642g).getValue();
    }

    public final void g() {
        boolean isWifi;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        if (!isWifi) {
            com.tencent.mars.xlog.Log.w("MicroMsg.C2CMsgPreDownloader", "pre download now task find start, is not wifi");
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        sq3.b bVar = nVar.A;
        bVar.getClass();
        long c17 = c01.id.c() - 300000;
        p75.d dVar = dm.n1.C;
        p75.m0 n17 = dVar.n(java.lang.Long.valueOf(c17));
        p75.d dVar2 = dm.n1.f238605y;
        p75.y yVar = (p75.y) n17.c(dVar2.k(kz5.c0.i(1, 2)));
        yVar.f(dm.n1.B.i(1));
        yVar.f(dm.n1.A.q(0));
        java.util.List i17 = kz5.c0.i(dVar2.u(), dVar.v());
        p75.i0 i18 = dm.n1.f238601u.i();
        i18.f352656c = "MicroMsg.C2CPreDownloadStorage";
        i18.f352657d = yVar;
        i18.f352659f = i17;
        sq3.a aVar = (sq3.a) i18.a().o(bVar.f193147g.Q4(), sq3.a.class);
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CMsgPreDownloader", "pre download test, item status:" + aVar.I0() + ", svrId" + aVar.A0());
            java.lang.String A0 = aVar.A0();
            kotlin.jvm.internal.o.f(A0, "getMsgItemId(...)");
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f357643h).getValue(), null, new pq3.g(A0, this, null), 1, null);
        }
    }

    public final void h(boolean z17) {
        long[] queryAvailableQuota;
        java.lang.Long T;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try start pre download, quota:");
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
        sb6.append((cdnManager == null || (queryAvailableQuota = cdnManager.queryAvailableQuota()) == null || (T = kz5.z.T(queryAvailableQuota, 0)) == null) ? 0L : T.longValue());
        sb6.append(", downloadingTask:");
        qq3.i iVar = this.f357636a;
        sb6.append(iVar != null ? java.lang.Long.valueOf(iVar.f365961f) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CMsgPreDownloader", sb6.toString());
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f357643h).getValue(), null, new pq3.h(this, z17, null), 1, null);
    }
}
