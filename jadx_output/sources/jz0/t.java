package jz0;

/* loaded from: classes5.dex */
public final class t implements com.tencent.maas.instamovie.MJMoviePlayer.OnPlaybackDidFinish {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f302622b;

    public t(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC, az0.a0 a0Var) {
        this.f302621a = maasFakeVideoPlayUIC;
        this.f302622b = a0Var;
    }

    @Override // com.tencent.maas.instamovie.MJMoviePlayer.OnPlaybackDidFinish
    public final void onFinished() {
        java.lang.String str = this.f302621a.f69818d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playbackDidFinishCallback: curState=");
        az0.a0 a0Var = this.f302622b;
        sb6.append(a0Var.f15309a.getCurrentState());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        kotlinx.coroutines.l.d(a0Var.f15310b, null, null, new az0.s(a0Var, null), 3, null);
    }
}
