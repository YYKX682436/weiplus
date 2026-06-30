package ug;

/* loaded from: classes5.dex */
public final /* synthetic */ class e$$g implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ElementSegment f427375a;

    public /* synthetic */ e$$g(com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment) {
        this.f427375a = elementSegment;
    }

    @Override // r.a
    public final java.lang.Object apply(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.Timeline timeline = (com.tencent.maas.moviecomposing.Timeline) obj;
        com.tencent.maas.moviecomposing.segments.ElementSegment elementSegment = this.f427375a;
        com.tencent.maas.model.time.MJTime w17 = elementSegment.w();
        com.tencent.maas.model.time.MJTime mJTime = com.tencent.maas.model.time.MJTime.ZeroTime;
        com.tencent.maas.moviecomposing.Timeline D = elementSegment.D();
        com.tencent.maas.model.time.MJTime sub = w17.sub(D != null ? com.tencent.maas.moviecomposing.segments.ElementSegment.T(elementSegment, D) : mJTime);
        com.tencent.maas.model.time.MJTime mJTime2 = elementSegment.f48524c;
        com.tencent.maas.model.time.MJTime add = sub.add(mJTime2);
        if (!timeline.t(add)) {
            return add;
        }
        com.tencent.maas.model.time.MJTime w18 = elementSegment.w();
        com.tencent.maas.moviecomposing.Timeline D2 = elementSegment.D();
        if (D2 != null) {
            mJTime = com.tencent.maas.moviecomposing.segments.ElementSegment.T(elementSegment, D2);
        }
        return w18.sub(timeline.a(mJTime)).add(mJTime2);
    }
}
