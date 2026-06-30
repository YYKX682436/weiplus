package dx0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final dx0.h f244457a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f244458b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.p0 f244459c;

    /* renamed from: d, reason: collision with root package name */
    public ex0.a0 f244460d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.Size f244461e;

    /* renamed from: f, reason: collision with root package name */
    public bx0.h f244462f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f244463g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f244464h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f244465i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f244466j;

    public n(dx0.h thumbnailProviderCallback, kotlinx.coroutines.p0 uiDispatcher, kotlinx.coroutines.p0 ioDispatcher, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 2) != 0) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            uiDispatcher = kotlinx.coroutines.internal.b0.f310484a;
        }
        ioDispatcher = (i17 & 4) != 0 ? kotlinx.coroutines.q1.f310570c : ioDispatcher;
        kotlin.jvm.internal.o.g(thumbnailProviderCallback, "thumbnailProviderCallback");
        kotlin.jvm.internal.o.g(uiDispatcher, "uiDispatcher");
        kotlin.jvm.internal.o.g(ioDispatcher, "ioDispatcher");
        this.f244457a = thumbnailProviderCallback;
        this.f244458b = uiDispatcher;
        this.f244459c = ioDispatcher;
        this.f244465i = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f244460d;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("timelineVM");
            throw null;
        }
        com.tencent.maas.moviecomposing.o0 p17 = a0Var.p(segmentID);
        if (p17 != null) {
            p17.a();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f244465i;
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            dx0.r rVar = (dx0.r) ((java.util.Map.Entry) it.next()).getKey();
            if (kotlin.jvm.internal.o.b(rVar.f244473a, segmentID)) {
                concurrentHashMap.remove(rVar);
            }
        }
    }

    public final android.util.Size b() {
        android.util.Size size = this.f244461e;
        if (size != null) {
            return size;
        }
        kotlin.jvm.internal.o.o("thumbnailSize");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(2:17|(2:19|(2:23|(6:25|(1:27)(1:48)|28|(1:30)|31|(1:33)(2:34|(4:41|(1:43)(1:47)|44|(1:46))(1:40)))(2:49|50))(1:22))(2:51|52))|11|12))|54|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.tencent.maas.base.MJID r13, boolean r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof dx0.j
            if (r0 == 0) goto L13
            r0 = r15
            dx0.j r0 = (dx0.j) r0
            int r1 = r0.f244445f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f244445f = r1
            goto L18
        L13:
            dx0.j r0 = new dx0.j
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f244443d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f244445f
            r3 = 1
            jz5.f0 r4 = jz5.f0.f302826a
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Exception -> L93
            goto L93
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            kotlin.ResultKt.throwOnFailure(r15)
            ex0.a0 r15 = r12.f244460d
            java.lang.String r2 = "timelineVM"
            r5 = 0
            if (r15 == 0) goto L98
            com.tencent.maas.moviecomposing.o0 r15 = r15.p(r13)
            if (r15 == 0) goto L45
            if (r14 != 0) goto L45
            return r4
        L45:
            ex0.a0 r15 = r12.f244460d
            if (r15 == 0) goto L94
            ex0.v r15 = r15.f257097g
            ex0.r r15 = r15.g(r13)
            if (r15 == 0) goto L54
            com.tencent.maas.moviecomposing.segments.Segment r15 = r15.f257167a
            goto L55
        L54:
            r15 = r5
        L55:
            boolean r2 = r15 instanceof com.tencent.maas.moviecomposing.segments.ClipSegment
            if (r2 == 0) goto L5c
            r5 = r15
            com.tencent.maas.moviecomposing.segments.ClipSegment r5 = (com.tencent.maas.moviecomposing.segments.ClipSegment) r5
        L5c:
            r10 = r5
            if (r10 != 0) goto L60
            return r4
        L60:
            ug.m r15 = r10.C()
            ug.m r2 = ug.m.ImageClip
            if (r15 == r2) goto L79
            ug.m r15 = r10.C()
            ug.m r2 = ug.m.MovieClip
            if (r15 == r2) goto L79
            ug.m r15 = r10.C()
            ug.m r2 = ug.m.VideoClip
            if (r15 == r2) goto L79
            return r4
        L79:
            kotlinx.coroutines.p0 r15 = r12.f244459c     // Catch: java.lang.Exception -> L93
            dx0.l r2 = new dx0.l     // Catch: java.lang.Exception -> L93
            if (r14 == 0) goto L81
            r9 = r3
            goto L83
        L81:
            r14 = 0
            r9 = r14
        L83:
            r11 = 0
            r6 = r2
            r7 = r12
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L93
            r0.f244445f = r3     // Catch: java.lang.Exception -> L93
            java.lang.Object r13 = kotlinx.coroutines.l.g(r15, r2, r0)     // Catch: java.lang.Exception -> L93
            if (r13 != r1) goto L93
            return r1
        L93:
            return r4
        L94:
            kotlin.jvm.internal.o.o(r2)
            throw r5
        L98:
            kotlin.jvm.internal.o.o(r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.n.c(com.tencent.maas.base.MJID, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        ex0.a0 a0Var = this.f244460d;
        if (a0Var != null) {
            a0Var.H.f(segmentID);
        } else {
            kotlin.jvm.internal.o.o("timelineVM");
            throw null;
        }
    }

    public final void e(com.tencent.maas.base.MJID segmentID, android.graphics.Rect screenVisibleRect) {
        com.tencent.maas.moviecomposing.m0 m0Var;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(screenVisibleRect, "screenVisibleRect");
        ex0.a0 a0Var = this.f244460d;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("timelineVM");
            throw null;
        }
        if (a0Var.h(segmentID)) {
            bx0.h hVar = this.f244462f;
            if (hVar == null) {
                kotlin.jvm.internal.o.o("timelineCalc");
                throw null;
            }
            android.graphics.Rect b17 = hVar.b(segmentID, false);
            ex0.a0 a0Var2 = this.f244460d;
            if (a0Var2 == null) {
                kotlin.jvm.internal.o.o("timelineVM");
                throw null;
            }
            com.tencent.maas.moviecomposing.o0 p17 = a0Var2.p(segmentID);
            if (p17 != null && b17.width() > 0) {
                int width = screenVisibleRect.width();
                int i17 = screenVisibleRect.left;
                int i18 = screenVisibleRect.right;
                int i19 = b17.left;
                while (i19 < b17.right) {
                    int width2 = b().getWidth() + i19;
                    double d17 = i19;
                    com.tencent.maas.moviecomposing.layout.OffsetRange offsetRange = new com.tencent.maas.moviecomposing.layout.OffsetRange(d17, width2 - d17);
                    com.tencent.maas.model.time.MJTimeRange f17 = f(segmentID, offsetRange);
                    dx0.r rVar = new dx0.r(segmentID, f17);
                    int i27 = i17 - width;
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f244465i;
                    if (width2 <= i27 || i19 >= i18 + width) {
                        if (concurrentHashMap.containsKey(rVar)) {
                            dx0.q qVar = (dx0.q) concurrentHashMap.get(rVar);
                            if (qVar == null || (m0Var = qVar.f244469a) == null) {
                                return;
                            }
                            if ((!m0Var.equals(com.tencent.maas.moviecomposing.m0.f48511b)) && !m0Var.equals(com.tencent.maas.moviecomposing.m0.f48512c)) {
                                m0Var.toString();
                                p17.b(m0Var);
                            }
                            concurrentHashMap.remove(rVar);
                        } else {
                            continue;
                        }
                    } else if (!concurrentHashMap.containsKey(rVar)) {
                        concurrentHashMap.put(rVar, new dx0.q(null, f17, null, null));
                        com.tencent.maas.moviecomposing.m0 d18 = p17.d(f17, new dx0.m(this, rVar, segmentID, offsetRange));
                        java.util.Objects.toString(d18);
                        segmentID.toString();
                        offsetRange.toString();
                        dx0.o.c(f17);
                        dx0.q qVar2 = (dx0.q) concurrentHashMap.get(rVar);
                        if (qVar2 != null) {
                            qVar2.f244469a = d18;
                        }
                    }
                    i19 = width2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.maas.model.time.MJTimeRange f(com.tencent.maas.base.MJID r11, com.tencent.maas.moviecomposing.layout.OffsetRange r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.n.f(com.tencent.maas.base.MJID, com.tencent.maas.moviecomposing.layout.OffsetRange):com.tencent.maas.model.time.MJTimeRange");
    }
}
