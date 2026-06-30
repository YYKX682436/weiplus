package gx0;

/* loaded from: classes5.dex */
public final class de implements com.tencent.maas.moviecomposing.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276342a;

    public de(gx0.bf bfVar) {
        this.f276342a = bfVar;
    }

    @Override // com.tencent.maas.moviecomposing.t
    public final void onMediaTimeChange(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, long j17) {
        mJTime.toMilliseconds();
        this.f276342a.f276259z.postValue(new ou0.g(j17, mJTime));
    }
}
