package ex0;

/* loaded from: classes5.dex */
public abstract class c extends ex0.f {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.ClipSegment f257119p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        super(clipSegment);
        kotlin.jvm.internal.o.g(clipSegment, "clipSegment");
        this.f257119p = clipSegment;
    }

    public final long A() {
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f257119p;
        clipSegment.getClass();
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        com.tencent.maas.model.time.MJTime g17 = D != null ? com.tencent.maas.moviecomposing.segments.ClipSegment.g1(clipSegment, D) : mJTime;
        kotlin.jvm.internal.o.f(g17, "getCreationTime(...)");
        if (!g17.isValid()) {
            clipSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D2 = clipSegment.D();
            if (D2 != null) {
                mJTime = com.tencent.maas.moviecomposing.segments.ClipSegment.M0(clipSegment, D2);
            }
            kotlin.jvm.internal.o.f(mJTime, "getModificationTime(...)");
            g17 = mJTime;
        }
        return !g17.isValid() ? java.lang.System.currentTimeMillis() : (long) g17.toMilliseconds();
    }

    public final com.tencent.maas.model.time.MJTimeRange B() {
        com.tencent.maas.model.time.MJTime startTime = l().getStartTime();
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f257119p;
        clipSegment.getClass();
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        com.tencent.maas.model.time.MJTime Q = D != null ? com.tencent.maas.moviecomposing.segments.ElementSegment.Q(clipSegment, D) : mJTime;
        kotlin.jvm.internal.o.f(Q, "getTransInDuration(...)");
        com.tencent.maas.model.time.MJTime sub = startTime.sub(Q);
        com.tencent.maas.model.time.MJTime endTime = l().getEndTime();
        clipSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = clipSegment.D();
        if (D2 != null) {
            mJTime = com.tencent.maas.moviecomposing.segments.ElementSegment.b0(clipSegment, D2);
        }
        kotlin.jvm.internal.o.f(mJTime, "getTransOutDuration(...)");
        com.tencent.maas.model.time.MJTimeRange fromStartEnd = com.tencent.maas.model.time.MJTimeRange.fromStartEnd(sub, endTime.add(mJTime));
        kotlin.jvm.internal.o.f(fromStartEnd, "fromStartEnd(...)");
        return fromStartEnd;
    }

    public final float C() {
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f257119p;
        clipSegment.getClass();
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        if (D != null) {
            valueOf = com.tencent.maas.moviecomposing.segments.ClipSegment.A0(clipSegment, D);
        }
        return valueOf.floatValue() / 2.0f;
    }

    public final boolean D() {
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f257119p;
        clipSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.ClipSegment.d1(clipSegment, D);
        }
        return bool.booleanValue();
    }

    public final void E(float f17) {
        float f18 = f17 * 2.0f;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = this.f257119p;
        clipSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
        if (D != null) {
            com.tencent.maas.moviecomposing.segments.ClipSegment.m1(clipSegment, f18, D);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(double r8) {
        /*
            r7 = this;
            com.tencent.maas.moviecomposing.segments.ClipSegment r0 = r7.f257119p
            com.tencent.maas.moviecomposing.Timeline r1 = r0.D()
            r2 = 0
            if (r1 == 0) goto L77
            com.tencent.maas.model.time.MJTime r1 = r1.f48416c
            if (r1 != 0) goto Le
            goto L77
        Le:
            ug.m r3 = r0.C()
            ug.m r4 = ug.m.ImageClip
            if (r3 != r4) goto L28
            com.tencent.maas.model.time.MJTimeRange r3 = r7.B()
            com.tencent.maas.model.time.MJTime r3 = r3.getDuration()
            double r3 = r3.toSeconds()
            double r3 = r3 / r8
            com.tencent.maas.model.time.MJTime r3 = com.tencent.maas.model.time.MJTime.fromSeconds(r3)
            goto L39
        L28:
            com.tencent.maas.model.time.MJTimeRange r3 = r0.x1()
            com.tencent.maas.model.time.MJTime r3 = r3.getDuration()
            double r3 = r3.toSeconds()
            double r3 = r3 / r8
            com.tencent.maas.model.time.MJTime r3 = com.tencent.maas.model.time.MJTime.fromSeconds(r3)
        L39:
            r0.getClass()
            com.tencent.maas.model.time.MJTime r4 = com.tencent.maas.model.time.MJTime.ZeroTime
            com.tencent.maas.moviecomposing.Timeline r5 = r0.D()
            if (r5 == 0) goto L49
            com.tencent.maas.model.time.MJTime r5 = com.tencent.maas.moviecomposing.segments.ElementSegment.Q(r0, r5)
            goto L4a
        L49:
            r5 = r4
        L4a:
            java.lang.String r6 = "getTransInDuration(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            com.tencent.maas.model.time.MJTime r3 = r3.sub(r5)
            r0.getClass()
            com.tencent.maas.moviecomposing.Timeline r5 = r0.D()
            if (r5 == 0) goto L60
            com.tencent.maas.model.time.MJTime r4 = com.tencent.maas.moviecomposing.segments.ElementSegment.b0(r0, r5)
        L60:
            java.lang.String r5 = "getTransOutDuration(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            com.tencent.maas.model.time.MJTime r3 = r3.sub(r4)
            boolean r4 = r3.bigThan(r1)
            if (r4 != 0) goto L75
            boolean r1 = r3.equalsTo(r1)
            if (r1 == 0) goto L77
        L75:
            r1 = 1
            goto L78
        L77:
            r1 = r2
        L78:
            if (r1 != 0) goto L7b
            return r2
        L7b:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            com.tencent.maas.moviecomposing.Timeline r2 = r0.D()
            if (r2 == 0) goto L87
            java.lang.Boolean r1 = com.tencent.maas.moviecomposing.segments.ClipSegment.D0(r0, r8, r2)
        L87:
            boolean r8 = r1.booleanValue()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.c.F(double):boolean");
    }
}
