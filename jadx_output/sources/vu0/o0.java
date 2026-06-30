package vu0;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440128a;

    /* renamed from: b, reason: collision with root package name */
    public final pp0.s0 f440129b;

    /* renamed from: c, reason: collision with root package name */
    public final vu0.y f440130c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f440131d;

    /* renamed from: e, reason: collision with root package name */
    public final wu0.f f440132e;

    /* renamed from: f, reason: collision with root package name */
    public final wu0.d f440133f;

    /* renamed from: g, reason: collision with root package name */
    public final vu0.g0 f440134g;

    /* renamed from: h, reason: collision with root package name */
    public yu0.m f440135h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f440136i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f440137j;

    public o0(java.lang.String finderUserName, pp0.s0 s0Var, vu0.y requestListener) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(requestListener, "requestListener");
        this.f440128a = finderUserName;
        this.f440129b = s0Var;
        this.f440130c = requestListener;
        this.f440131d = jz5.h.b(vu0.a0.f440051d);
        this.f440132e = new wu0.f();
        this.f440133f = new wu0.d(new vu0.n0(this));
        this.f440134g = new vu0.g0(this);
        this.f440137j = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x069e  */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r25v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r5v39, types: [float] */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vu0.o0 r35, com.tencent.maas.moviecomposing.segments.ClipSegment r36, kotlin.coroutines.Continuation r37) {
        /*
            Method dump skipped, instructions count: 1899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.o0.a(vu0.o0, com.tencent.maas.moviecomposing.segments.ClipSegment, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(java.util.List allClipSegment) {
        kotlin.jvm.internal.o.g(allClipSegment, "allClipSegment");
        this.f440133f.f449655b.clear();
        vu0.y yVar = this.f440130c;
        yVar.b();
        this.f440132e.f449660a.clear();
        pp0.s0 s0Var = this.f440129b;
        if (s0Var == null) {
            com.tencent.mars.xlog.Log.e("VideoSubtitleService", "automaticSubtitles: mjAudioTaskManager == null");
            yVar.a();
            return;
        }
        boolean hj6 = ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).hj();
        vu0.g0 g0Var = this.f440134g;
        this.f440135h = hj6 ? new yu0.m(new su0.r(this.f440128a, g0Var)) : new yu0.m(new su0.a0(s0Var, g0Var));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = allClipSegment.iterator();
        while (true) {
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = null;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment2 = (com.tencent.maas.moviecomposing.segments.ClipSegment) it.next();
            clipSegment2.getClass();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.tencent.maas.moviecomposing.Timeline D = clipSegment2.D();
            if ((D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.K0(clipSegment2, D) : bool).booleanValue()) {
                com.tencent.maas.moviecomposing.Timeline D2 = clipSegment2.D();
                if (D2 != null) {
                    bool = com.tencent.maas.moviecomposing.segments.ClipSegment.V0(clipSegment2, D2);
                }
                if (bool.booleanValue()) {
                    java.lang.String s17 = clipSegment2.s1();
                    if (!(s17 == null || s17.length() == 0)) {
                        com.tencent.maas.model.time.MJTimeRange B = clipSegment2.B();
                        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
                        if (B.isValid()) {
                            clipSegment = clipSegment2;
                        }
                    }
                }
            }
            if (clipSegment != null) {
                arrayList.add(clipSegment);
            }
        }
        if (!arrayList.isEmpty()) {
            this.f440136i = kotlinx.coroutines.l.d(this.f440137j, null, null, new vu0.c0(arrayList, this, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.e("VideoSubtitleService", "automaticSubtitles: videoClipSegments isEmpty");
            yVar.c(null);
        }
    }

    public final void c() {
        this.f440132e.f449660a.clear();
        wu0.d dVar = this.f440133f;
        dVar.f449656c.removeCallbacksAndMessages(null);
        dVar.f449655b.clear();
        yu0.m mVar = this.f440135h;
        if (mVar != null) {
            mVar.b();
        }
        this.f440135h = null;
        kotlinx.coroutines.r2 r2Var = this.f440136i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f440136i = null;
    }
}
