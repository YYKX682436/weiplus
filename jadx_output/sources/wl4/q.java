package wl4;

/* loaded from: classes11.dex */
public final class q extends tl4.e {

    /* renamed from: k, reason: collision with root package name */
    public final bw5.eq0 f447098k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.unit_rc.WeakPtr weakPtr, rl4.c config, bw5.eq0 appId) {
        super(weakPtr);
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f447098k = appId;
    }

    @Override // tl4.e, android.support.v4.media.session.v
    public void d() {
        super.d();
    }

    @Override // tl4.e, android.support.v4.media.session.v
    public void e() {
        super.e();
    }

    @Override // android.support.v4.media.session.v
    public void g(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo:" + j17);
        d75.b.g(new wl4.n(this, j17));
    }

    @Override // android.support.v4.media.session.v
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext");
        d75.b.g(new wl4.o(this));
    }

    @Override // android.support.v4.media.session.v
    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious");
        d75.b.g(new wl4.p(this));
    }

    @Override // tl4.e
    public bw5.eq0 m() {
        return this.f447098k;
    }
}
