package jz0;

/* loaded from: classes5.dex */
public final class q implements com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302615a;

    public q(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC) {
        this.f302615a = maasFakeVideoPlayUIC;
    }

    @Override // com.tencent.maas.instamovie.MJMoviePlayer.OnMediaTimeChange
    public final void onMediaTimeChange(com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTimeRange mJTimeRange, long j17) {
        this.f302615a.f69828q = mJTime;
    }
}
