package df2;

/* loaded from: classes3.dex */
public final class vu implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f231630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zu f231631e;

    public vu(com.tencent.mm.live.core.view.LiveVideoView liveVideoView, df2.zu zuVar) {
        this.f231630d = liveVideoView;
        this.f231631e = zuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adjustVideoLayoutToRemainingSize: animation end, scale=");
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = this.f231630d;
        sb6.append(liveVideoView.getScaleX());
        sb6.append('x');
        sb6.append(liveVideoView.getScaleY());
        sb6.append(", translationX=");
        sb6.append(liveVideoView.getTranslationX());
        com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", sb6.toString());
        this.f231631e.f232000m = true;
        com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", "adjustVideoLayoutToRemainingSize: set dim amount to 0f");
    }
}
