package ws2;

/* loaded from: classes15.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f449169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449170e;

    public y1(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, java.lang.String str) {
        this.f449169d = finderLiveThumbPlayerProxy;
        this.f449170e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449169d;
        if (finderLiveThumbPlayerProxy.isViewFocused) {
            finderLiveThumbPlayerProxy.f124900s = true;
            com.tencent.mm.pluginsdk.ui.b1 videoViewCallback = finderLiveThumbPlayerProxy.getVideoViewCallback();
            if (videoViewCallback != null) {
                videoViewCallback.N5("", this.f449170e, java.lang.Boolean.FALSE);
            }
        }
    }
}
