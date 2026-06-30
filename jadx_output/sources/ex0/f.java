package ex0;

/* loaded from: classes5.dex */
public abstract class f extends ex0.r {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.ElementSegment f257130f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f257131g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f257132h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257133i;

    /* renamed from: j, reason: collision with root package name */
    public ax0.a f257134j;

    /* renamed from: k, reason: collision with root package name */
    public ax0.d f257135k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTimeRange f257136l;

    /* renamed from: m, reason: collision with root package name */
    public ax0.c f257137m;

    /* renamed from: n, reason: collision with root package name */
    public float f257138n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f257139o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment) {
        super(elementSegment);
        kotlin.jvm.internal.o.g(elementSegment, "elementSegment");
        this.f257130f = elementSegment;
        com.tencent.maas.model.time.MJTime ZeroTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        this.f257131g = ZeroTime;
        kotlin.jvm.internal.o.f(ZeroTime, "ZeroTime");
        this.f257132h = ZeroTime;
        this.f257134j = ax0.a.f14960d;
        this.f257135k = ax0.d.f14971d;
        com.tencent.maas.model.time.MJTimeRange InvalidTimeRange = com.tencent.maas.model.time.MJTimeRange.InvalidTimeRange;
        kotlin.jvm.internal.o.f(InvalidTimeRange, "InvalidTimeRange");
        this.f257136l = InvalidTimeRange;
        this.f257137m = ax0.c.f14967d;
        this.f257138n = 0.3f;
    }

    @Override // ex0.r
    public final void g() {
        int ordinal = this.f257169c.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 10) {
            com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = this.f257130f;
            if (elementSegment.j0()) {
                ug.m C = elementSegment.C();
                if (C == ug.m.MovieClip || C == ug.m.Music) {
                    elementSegment.s0(elementSegment.w().add(elementSegment.i0()));
                } else if (C == ug.m.ImageClip) {
                    elementSegment.s0(elementSegment.f48525d);
                }
            }
        }
    }

    @Override // ex0.r
    public final void h() {
        int ordinal = this.f257169c.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 10) {
            com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = this.f257130f;
            if (elementSegment.k0()) {
                ug.m C = elementSegment.C();
                if (C != ug.m.MovieClip && C != ug.m.Music) {
                    if (C == ug.m.ImageClip) {
                        elementSegment.r0(elementSegment.f48525d);
                    }
                } else {
                    com.tencent.maas.model.time.MJTime w17 = elementSegment.w();
                    com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
                    com.tencent.maas.moviecomposing.Timeline D = elementSegment.D();
                    if (D != null) {
                        mJTime = com.tencent.maas.moviecomposing.segments.ElementSegment.X(elementSegment, D);
                    }
                    elementSegment.r0(w17.add(mJTime));
                }
            }
        }
    }

    public final boolean r(android.graphics.PointF pointF) {
        kotlin.jvm.internal.o.g(pointF, "pointF");
        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = this.f257130f;
        if (!elementSegment.q0()) {
            return false;
        }
        com.tencent.maas.moviecomposing.Timeline D = elementSegment.D();
        if (D == null) {
            return true;
        }
        com.tencent.maas.moviecomposing.segments.ElementSegment.Z(elementSegment, pointF, D);
        return true;
    }

    public final boolean s(float f17) {
        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = this.f257130f;
        if (!elementSegment.q0()) {
            return false;
        }
        com.tencent.maas.moviecomposing.Timeline D = elementSegment.D();
        if (D == null) {
            return true;
        }
        com.tencent.maas.moviecomposing.segments.ElementSegment.J(elementSegment, f17, D);
        return true;
    }

    public final void t(android.graphics.PointF layerScale) {
        kotlin.jvm.internal.o.g(layerScale, "layerScale");
        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = this.f257130f;
        if (elementSegment.q0()) {
            elementSegment.t0(layerScale);
        }
    }

    public final boolean u(float f17, boolean z17, boolean z18) {
        int ordinal = this.f257134j.ordinal();
        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = this.f257130f;
        if (ordinal == 1) {
            return (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) < 0 ? elementSegment.j0() && !z17 : elementSegment.z().sub(elementSegment.f48524c).bigThan(com.tencent.maas.model.time.MJTime.ZeroTime);
        }
        if (ordinal != 2) {
            return false;
        }
        return (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) > 0 ? elementSegment.k0() && !z18 : elementSegment.z().sub(elementSegment.f48524c).bigThan(com.tencent.maas.model.time.MJTime.ZeroTime);
    }

    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.5f);
    }

    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.5f);
    }

    public com.tencent.maas.model.time.MJTime x(com.tencent.maas.model.time.MJTime duration) {
        kotlin.jvm.internal.o.g(duration, "duration");
        com.tencent.maas.model.time.MJTime max = com.tencent.maas.model.time.MJTime.max(com.tencent.maas.model.time.MJTime.ZeroTime, duration);
        kotlin.jvm.internal.o.f(max, "max(...)");
        return max;
    }

    public final boolean y(com.tencent.maas.model.time.MJTime duration) {
        kotlin.jvm.internal.o.g(duration, "duration");
        if (duration.equalsTo(i())) {
            return false;
        }
        com.tencent.maas.model.time.MJTime i17 = i();
        this.f257130f.r0(duration);
        com.tencent.maas.model.time.MJTime i18 = i();
        duration.toSeconds();
        i17.toSeconds();
        i18.toSeconds();
        l().getEndTime().toSeconds();
        return !i17.equalsTo(i18);
    }

    public final boolean z(com.tencent.maas.model.time.MJTime duration) {
        kotlin.jvm.internal.o.g(duration, "duration");
        if (duration.equalsTo(i())) {
            return false;
        }
        com.tencent.maas.model.time.MJTime i17 = i();
        this.f257130f.s0(duration);
        com.tencent.maas.model.time.MJTime i18 = i();
        java.util.Objects.toString(this.f257169c);
        duration.toSeconds();
        i17.toSeconds();
        i18.toSeconds();
        k().toSeconds();
        return !i17.equalsTo(i18);
    }
}
