package dz0;

/* loaded from: classes5.dex */
public final class g1 implements com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244852a;

    public g1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC) {
        this.f244852a = maasSdkUIC;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.OnMediaTimeChange
    public final void onMediaTimeChange(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, long j17) {
        this.f244852a.f69800x = mJTime;
    }
}
