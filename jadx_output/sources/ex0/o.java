package ex0;

/* loaded from: classes5.dex */
public final class o extends ex0.c {

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.MusicSegment f257154q;

    /* renamed from: r, reason: collision with root package name */
    public yt0.d f257155r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f257156s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTimeRange f257157t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment) {
        super(musicSegment);
        kotlin.jvm.internal.o.g(musicSegment, "musicSegment");
        this.f257154q = musicSegment;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ex0.n
            if (r0 == 0) goto L13
            r0 = r11
            ex0.n r0 = (ex0.n) r0
            int r1 = r0.f257153h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257153h = r1
            goto L18
        L13:
            ex0.n r0 = new ex0.n
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f257151f
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f257153h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r1 = r0.f257150e
            com.tencent.maas.model.time.MJTimeRange r1 = (com.tencent.maas.model.time.MJTimeRange) r1
            java.lang.Object r0 = r0.f257149d
            ex0.o r0 = (ex0.o) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L67
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L38:
            kotlin.ResultKt.throwOnFailure(r11)
            com.tencent.maas.model.time.MJTimeRange r11 = r10.H()
            yt0.d r2 = r10.f257155r
            if (r2 == 0) goto L6e
            com.tencent.maas.model.time.MJTime r5 = r11.getDuration()
            java.lang.String r6 = "getDuration(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            r0.f257149d = r10
            r0.f257150e = r11
            r0.f257153h = r4
            du0.s1 r2 = (du0.s1) r2
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310570c
            du0.r1 r7 = new du0.r1
            com.tencent.maas.moviecomposing.segments.MusicSegment r8 = r10.f257154q
            r7.<init>(r2, r8, r5, r3)
            java.lang.Object r0 = kotlinx.coroutines.l.g(r6, r7, r0)
            if (r0 != r1) goto L64
            return r1
        L64:
            r1 = r11
            r11 = r0
            r0 = r10
        L67:
            float[] r11 = (float[]) r11
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
            goto L70
        L6e:
            r1 = r10
            r0 = r3
        L70:
            r1.f257157t = r11
            if (r0 == 0) goto L7c
            r11 = 1060554932(0x3f36c8b4, float:0.714)
            r2 = 0
            float[] r3 = by0.w.a(r0, r2, r11, r4, r3)
        L7c:
            r1.f257156s = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.o.G(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.maas.model.time.MJTimeRange H() {
        com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = this.f257154q;
        return new com.tencent.maas.model.time.MJTimeRange(com.tencent.maas.model.time.MJTime.ZeroTime, musicSegment.i0().add(musicSegment.z()).add(com.tencent.maas.model.time.MJTime.fromSeconds(120.0d)));
    }

    public final boolean I(java.lang.String styleID) {
        kotlin.jvm.internal.o.g(styleID, "styleID");
        com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = this.f257154q;
        musicSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = musicSegment.D();
        java.lang.String H1 = D != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.H1(musicSegment, D) : "";
        musicSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = musicSegment.D();
        java.lang.String A1 = D2 != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.A1(musicSegment, D2) : "";
        musicSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D3 = musicSegment.D();
        boolean booleanValue = (D3 != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.J1(musicSegment, styleID, D3) : bool).booleanValue();
        musicSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D4 = musicSegment.D();
        boolean booleanValue2 = (D4 != null ? com.tencent.maas.moviecomposing.segments.MusicSegment.L1(musicSegment, A1, D4) : bool).booleanValue();
        musicSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D5 = musicSegment.D();
        if (D5 != null) {
            bool = com.tencent.maas.moviecomposing.segments.MusicSegment.B1(musicSegment, H1, D5);
        }
        return booleanValue && booleanValue2 && bool.booleanValue();
    }

    @Override // ex0.f
    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.88f);
    }

    @Override // ex0.f
    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.82f);
    }

    @Override // ex0.f
    public com.tencent.maas.model.time.MJTime x(com.tencent.maas.model.time.MJTime duration) {
        kotlin.jvm.internal.o.g(duration, "duration");
        com.tencent.maas.model.time.MJTime p07 = this.f257154q.p0();
        kotlin.jvm.internal.o.f(p07, "getTotalDurationIncludingExpandable(...)");
        if (duration.bigThan(p07)) {
            duration = p07;
        }
        return super.x(duration);
    }
}
