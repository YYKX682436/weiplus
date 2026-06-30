package ex0;

/* loaded from: classes5.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.Segment f257167a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f257168b;

    /* renamed from: c, reason: collision with root package name */
    public final ug.m f257169c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f257170d;

    /* renamed from: e, reason: collision with root package name */
    public ax0.b f257171e;

    public r(com.tencent.maas.moviecomposing.segments.Segment segment) {
        kotlin.jvm.internal.o.g(segment, "segment");
        this.f257167a = segment;
        com.tencent.maas.base.MJID mjid = segment.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        this.f257168b = mjid;
        ug.m C = segment.C();
        kotlin.jvm.internal.o.f(C, "getSegmentType(...)");
        this.f257169c = C;
        com.tencent.maas.moviecomposing.Timeline D = segment.D();
        if (D != null) {
            com.tencent.maas.moviecomposing.segments.Segment.o(segment, D);
        }
        this.f257170d = segment.x();
        this.f257171e = ax0.b.f14964d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex0.r)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f257167a, ((ex0.r) obj).f257167a);
    }

    public void g() {
    }

    public void h() {
    }

    public int hashCode() {
        return this.f257167a.hashCode();
    }

    public com.tencent.maas.model.time.MJTime i() {
        com.tencent.maas.model.time.MJTime w17 = this.f257167a.w();
        kotlin.jvm.internal.o.f(w17, "getDuration(...)");
        return w17;
    }

    public com.tencent.maas.model.time.MJTime j() {
        com.tencent.maas.model.time.MJTime z17 = this.f257167a.z();
        kotlin.jvm.internal.o.f(z17, "getPresentationDuration(...)");
        return z17;
    }

    public com.tencent.maas.model.time.MJTime k() {
        com.tencent.maas.model.time.MJTime A = this.f257167a.A();
        kotlin.jvm.internal.o.f(A, "getPresentationStartTime(...)");
        return A;
    }

    public com.tencent.maas.model.time.MJTimeRange l() {
        com.tencent.maas.model.time.MJTimeRange B = this.f257167a.B();
        kotlin.jvm.internal.o.f(B, "getPresentationTimeRange(...)");
        return B;
    }

    public com.tencent.maas.model.time.MJTimeRange m() {
        com.tencent.maas.moviecomposing.segments.Segment segment = this.f257167a;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = segment instanceof com.tencent.maas.moviecomposing.segments.ClipSegment ? (com.tencent.maas.moviecomposing.segments.ClipSegment) segment : null;
        if (clipSegment != null) {
            return clipSegment.x1();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(com.tencent.maas.model.time.MJTime r7) {
        /*
            r6 = this;
            java.lang.String r0 = "time"
            kotlin.jvm.internal.o.g(r7, r0)
            ug.m r0 = r6.f257169c
            int r0 = r0.ordinal()
            r1 = 0
            switch(r0) {
                case 2: goto L10;
                case 3: goto L10;
                case 4: goto L10;
                case 5: goto L4d;
                case 6: goto Lf;
                case 7: goto L4d;
                case 8: goto L4d;
                case 9: goto L4d;
                case 10: goto L4d;
                case 11: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L4d
        L10:
            com.tencent.maas.moviecomposing.segments.Segment r0 = r6.f257167a
            boolean r2 = r0 instanceof com.tencent.maas.moviecomposing.segments.ElementSegment
            if (r2 == 0) goto L19
            com.tencent.maas.moviecomposing.segments.ElementSegment r0 = (com.tencent.maas.moviecomposing.segments.ElementSegment) r0
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L4d
            com.tencent.maas.model.time.MJTime r2 = r0.A()
            com.tencent.maas.model.time.MJTime r2 = r7.sub(r2)
            com.tencent.maas.model.time.MJTime r3 = r0.f48524c
            int r2 = r2.compare(r3)
            r4 = 1
            if (r2 < 0) goto L49
            com.tencent.maas.model.time.MJTimeRange r2 = com.tencent.maas.model.time.MJTimeRange.ZeroTimeRange
            com.tencent.maas.moviecomposing.Timeline r5 = r0.D()
            if (r5 == 0) goto L39
            com.tencent.maas.model.time.MJTimeRange r2 = com.tencent.maas.moviecomposing.segments.ElementSegment.V(r0, r5)
        L39:
            com.tencent.maas.model.time.MJTime r0 = r2.getEndTime()
            com.tencent.maas.model.time.MJTime r7 = r0.sub(r7)
            int r7 = r7.compare(r3)
            if (r7 < 0) goto L49
            r7 = r4
            goto L4a
        L49:
            r7 = r1
        L4a:
            if (r7 != r4) goto L4d
            r1 = r4
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.r.n(com.tencent.maas.model.time.MJTime):boolean");
    }

    public boolean o() {
        return ou0.b0.a(this.f257167a);
    }

    public boolean p() {
        switch (this.f257169c.ordinal()) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            case 6:
            default:
                return false;
        }
    }

    public void q(cx0.b mutationEntry) {
        kotlin.jvm.internal.o.g(mutationEntry, "mutationEntry");
        com.tencent.maas.moviecomposing.segments.Segment segment = this.f257167a;
        segment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = segment.D();
        if (D != null) {
            com.tencent.maas.moviecomposing.segments.Segment.o(segment, D);
        }
    }

    public java.lang.String toString() {
        return "<SegmentViewModel " + this.f257167a + ' ' + this.f257171e.name() + '>';
    }
}
