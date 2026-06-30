package ix0;

/* loaded from: classes5.dex */
public final class g implements pv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.Segment f295305a;

    /* renamed from: b, reason: collision with root package name */
    public final pv0.y f295306b;

    /* renamed from: c, reason: collision with root package name */
    public final gx0.kh f295307c;

    /* renamed from: d, reason: collision with root package name */
    public final gx0.bf f295308d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f295309e;

    /* renamed from: f, reason: collision with root package name */
    public final ix0.a f295310f;

    /* JADX WARN: Multi-variable type inference failed */
    public g(com.tencent.maas.moviecomposing.segments.Segment originSegment, pv0.y timbrePanelUIC, gx0.kh timelineUIC, gx0.bf playbackControlUIC, kotlinx.coroutines.y0 mainScope) {
        kotlin.jvm.internal.o.g(originSegment, "originSegment");
        kotlin.jvm.internal.o.g(timbrePanelUIC, "timbrePanelUIC");
        kotlin.jvm.internal.o.g(timelineUIC, "timelineUIC");
        kotlin.jvm.internal.o.g(playbackControlUIC, "playbackControlUIC");
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        this.f295305a = originSegment;
        this.f295306b = timbrePanelUIC;
        this.f295307c = timelineUIC;
        this.f295308d = playbackControlUIC;
        this.f295309e = mainScope;
        this.f295310f = new ix0.a(this, (ug.n) originSegment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object h(ix0.g gVar, com.tencent.maas.moviecomposing.segments.Segment segment, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        gVar.getClass();
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "applyAdjustableSpeech: roleFilePath " + str3 + " roleID " + str + " roleFilePath " + str3);
        kotlin.jvm.internal.o.e(segment, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.TextToSpeechAdjustable");
        ug.n nVar = (ug.n) segment;
        nVar.k(str, str2);
        java.lang.String e17 = nVar.e();
        kotlin.jvm.internal.o.f(e17, "getAudioFilePath(...)");
        if (e17.length() == 0) {
            nVar.i(str3);
        } else {
            nVar.h(str3);
        }
        java.lang.Object d76 = gx0.bf.d7(gVar.f295308d, null, null, false, continuation, 7, null);
        return d76 == pz5.a.f359186d ? d76 : jz5.f0.f302826a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0077 -> B:10:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0086 -> B:11:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0088 -> B:12:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(ix0.g r7, dw0.c r8, java.util.List r9, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof ix0.f
            if (r0 == 0) goto L16
            r0 = r10
            ix0.f r0 = (ix0.f) r0
            int r1 = r0.f295304m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f295304m = r1
            goto L1b
        L16:
            ix0.f r0 = new ix0.f
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f295302h
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f295304m
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r7 = r0.f295301g
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.f295300f
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r0.f295299e
            dw0.c r9 = (dw0.c) r9
            java.lang.Object r2 = r0.f295298d
            ix0.g r2 = (ix0.g) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L79
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L42:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L52:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            com.tencent.maas.moviecomposing.segments.Segment r2 = (com.tencent.maas.moviecomposing.segments.Segment) r2
            boolean r4 = r9.b()
            if (r4 == 0) goto L7c
            r0.f295298d = r8
            r0.f295299e = r9
            r0.f295300f = r10
            r0.f295301g = r7
            r0.f295304m = r3
            java.lang.String r4 = "onTimbreAudition"
            java.lang.Object r2 = r8.j(r2, r4, r0)
            if (r2 != r1) goto L77
            goto L99
        L77:
            r2 = r8
            r8 = r10
        L79:
            r10 = r8
            r8 = r2
            goto L8f
        L7c:
            com.tencent.maas.base.MJID r4 = r2.f48532a
            com.tencent.maas.moviecomposing.segments.Segment r5 = r8.f295305a
            com.tencent.maas.base.MJID r5 = r5.f48532a
            boolean r4 = kotlin.jvm.internal.o.b(r4, r5)
            if (r4 != 0) goto L8f
            com.tencent.maas.material.MJMaterialInfo r4 = r9.f244086a
            yu0.t r2 = ru0.a.f(r2, r4)
            goto L90
        L8f:
            r2 = 0
        L90:
            if (r2 == 0) goto L52
            r10.add(r2)
            goto L52
        L96:
            r1 = r10
            java.util.List r1 = (java.util.List) r1
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ix0.g.i(ix0.g, dw0.c, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pv0.a
    public void a(com.tencent.maas.base.MJID segmentID, java.lang.String roleID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "onError: segmentID " + segmentID + " roleID " + roleID);
    }

    @Override // pv0.a
    public void b(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "onSubmitted: segmentID " + segmentID);
    }

    @Override // pv0.a
    public void c(dw0.c timbreInfo) {
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "onPreSelect: ");
    }

    @Override // pv0.a
    public void d(dw0.c timbreInfo) {
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.maas.moviecomposing.segments.Segment segment = timbreInfo.f244087b;
        com.tencent.maas.moviecomposing.segments.Segment k17 = k(segment != null ? segment.f48532a : null);
        if (k17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            k17 = null;
        }
        if (k17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "onTimbreAudition: ");
        kotlinx.coroutines.l.d(this.f295309e, null, null, new ix0.e(timbreInfo, this, k17, null), 3, null);
    }

    @Override // pv0.a
    public void e(ru0.e roleResult) {
        com.tencent.mm.vfs.r6 r6Var;
        kotlin.jvm.internal.o.g(roleResult, "roleResult");
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "onRoleResult: roleResult " + roleResult);
        com.tencent.maas.moviecomposing.segments.Segment k17 = k(roleResult.f399662a);
        if (k17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            k17 = null;
        }
        com.tencent.maas.moviecomposing.segments.Segment segment = k17;
        if (segment == null || (r6Var = roleResult.f399665d) == null) {
            return;
        }
        kotlinx.coroutines.l.d(this.f295309e, null, null, new ix0.d(this, segment, roleResult, r6Var, null), 3, null);
    }

    @Override // pv0.a
    public boolean f(dw0.c timbreInfo) {
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.maas.moviecomposing.segments.Segment segment = null;
        com.tencent.maas.moviecomposing.segments.Segment segment2 = timbreInfo.f244087b;
        com.tencent.maas.moviecomposing.segments.Segment k17 = k(segment2 != null ? segment2.f48532a : null);
        if (k17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            segment = k17;
        }
        boolean z17 = true;
        if (segment == null) {
            return true;
        }
        int ordinal = segment.C().ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                java.util.List d76 = this.f295307c.d7();
                kotlinx.coroutines.l.d(this.f295309e, null, null, new ix0.b(this, timbreInfo, d76, segment, null), 3, null);
                if (d76.size() > 1 && !timbreInfo.b()) {
                    z17 = false;
                }
            } else if (ordinal != 7) {
                com.tencent.mars.xlog.Log.e("ElementSegmentTextReadL", "onApplyTimbre:  why segmentType " + segment.C());
            }
        }
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "onApplyTimbre: segmentType " + segment.C() + " result " + z17);
        return z17;
    }

    @Override // pv0.a
    public void g(dw0.c timbreInfo) {
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.maas.moviecomposing.segments.Segment segment = timbreInfo.f244087b;
        com.tencent.maas.moviecomposing.segments.Segment k17 = k(segment != null ? segment.f48532a : null);
        if (k17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            k17 = null;
        }
        if (k17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "onCancelTimbre: segmentType " + k17.C());
        ug.m C = k17.C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        pv0.y yVar = this.f295306b;
        yVar.getClass();
        pv0.g gVar = (pv0.g) yVar.f358564r.get(C);
        if (gVar != null) {
            ((vu0.s) ((jz5.n) gVar.f358523d).getValue()).a();
        }
        kotlinx.coroutines.l.d(this.f295309e, null, null, new ix0.c(this, k17, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object j(com.tencent.maas.moviecomposing.segments.Segment segment, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.o.e(segment, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.TextToSpeechAdjustable");
        ug.n nVar = (ug.n) segment;
        com.tencent.mars.xlog.Log.i("ElementSegmentTextReadL", "clearSpeech: tag " + str);
        nVar.d();
        nVar.f();
        java.lang.Object d76 = gx0.bf.d7(this.f295308d, null, null, false, continuation, 7, null);
        return d76 == pz5.a.f359186d ? d76 : jz5.f0.f302826a;
    }

    public final com.tencent.maas.moviecomposing.segments.Segment k(com.tencent.maas.base.MJID mjid) {
        if (mjid == null) {
            return null;
        }
        com.tencent.maas.moviecomposing.segments.Segment b76 = this.f295307c.b7(mjid);
        if (b76 instanceof ug.n) {
            return b76;
        }
        return null;
    }
}
