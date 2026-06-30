package df2;

/* loaded from: classes3.dex */
public final class yu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f231894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zu f231895e;

    public yu(com.tencent.mm.live.core.view.LiveVideoView liveVideoView, df2.zu zuVar) {
        this.f231894d = liveVideoView;
        this.f231895e = zuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetVideoLayout: animation end, scale=");
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = this.f231894d;
        sb6.append(liveVideoView.getScaleX());
        sb6.append('x');
        sb6.append(liveVideoView.getScaleY());
        sb6.append(", translationX=");
        sb6.append(liveVideoView.getTranslationX());
        com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", sb6.toString());
        df2.zu zuVar = this.f231895e;
        zuVar.f232000m = false;
        zuVar.f232001n = null;
        com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", "resetVideoLayout: restore dim amount to 0.5f");
    }
}
