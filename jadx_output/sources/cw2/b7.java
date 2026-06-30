package cw2;

/* loaded from: classes15.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223603e;

    public b7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, java.lang.String str) {
        this.f223602d = finderThumbPlayerProxy;
        this.f223603e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223602d;
        if (finderThumbPlayerProxy.isViewFocused) {
            finderThumbPlayerProxy.setBuffering(true);
            zy2.ub videoViewCallback = this.f223602d.getVideoViewCallback();
            if (videoViewCallback != null) {
                videoViewCallback.N5("", this.f223603e, java.lang.Boolean.valueOf(this.f223602d.isSeeking));
            }
            if (this.f223603e != null) {
                ((ku5.t0) ku5.t0.f312615d).k(new cw2.a7(this.f223603e), 20L);
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).ek().f464684a.a();
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f223602d;
            finderThumbPlayerProxy2.H = null;
            cw2.d0 playerBufferController = finderThumbPlayerProxy2.getPlayerBufferController();
            if (playerBufferController != null) {
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cw2.d0.f223626n;
                atomicInteger.incrementAndGet();
                com.tencent.mars.xlog.Log.i("FinderBufCtr", "onBufferingStart bufferCount:" + atomicInteger.get());
                playerBufferController.a(playerBufferController.f223634h, "onBufferingStart");
            }
        }
    }
}
