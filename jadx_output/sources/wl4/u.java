package wl4;

/* loaded from: classes11.dex */
public final class u extends tl4.e {
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
        if (!l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo call too much, just return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSeekTo:" + j17);
        d75.b.g(new wl4.r(this, j17));
    }

    @Override // android.support.v4.media.session.v
    public void h() {
        if (!l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext call too much, just return");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToNext");
            d75.b.g(new wl4.s(this));
        }
    }

    @Override // android.support.v4.media.session.v
    public void i() {
        if (!l()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious call too much, just return");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingRadioChannelMediaSessionCallBack", "onSkipToPrevious");
            d75.b.g(new wl4.t(this));
        }
    }

    @Override // tl4.e, android.support.v4.media.session.v
    public void j() {
        super.j();
    }

    @Override // tl4.e
    public bw5.eq0 m() {
        return bw5.eq0.TingMusic;
    }
}
