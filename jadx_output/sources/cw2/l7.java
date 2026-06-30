package cw2;

/* loaded from: classes15.dex */
public final class l7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, java.lang.String str) {
        super(0);
        this.f223844d = finderThumbPlayerProxy;
        this.f223845e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130641g2;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223844d;
        finderThumbPlayerProxy.getClass();
        finderThumbPlayerProxy.getPlayer().release();
        com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class);
        java.lang.String finderVideoProxyHashcode = java.lang.String.valueOf(finderThumbPlayerProxy.hashCode());
        finderVideoRecycler.getClass();
        kotlin.jvm.internal.o.g(finderVideoProxyHashcode, "finderVideoProxyHashcode");
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = finderVideoRecycler.f133687w;
        concurrentSkipListSet.remove(finderVideoProxyHashcode);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryQuitHandlerThread proxy:");
        sb6.append(finderVideoProxyHashcode);
        sb6.append(" threadId:");
        android.os.HandlerThread handlerThread = finderVideoRecycler.f133686v;
        sb6.append(handlerThread != null ? java.lang.Integer.valueOf(handlerThread.getThreadId()) : null);
        sb6.append(" count：");
        sb6.append(concurrentSkipListSet.size());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", sb6.toString());
        if (concurrentSkipListSet.size() == 0) {
            android.os.HandlerThread handlerThread2 = finderVideoRecycler.f133686v;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            finderVideoRecycler.f133686v = null;
        }
        finderThumbPlayerProxy.q(11);
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), this.f223845e + " onReleaseInternal releaseInternal  FinderThumbPlayerProxy " + finderThumbPlayerProxy.hashCode() + ' ' + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        return jz5.f0.f302826a;
    }
}
