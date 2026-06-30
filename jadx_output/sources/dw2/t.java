package dw2;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager f244164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f244165e;

    public t(com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f244164d = finderMultiFlowVideoAutoPlayManager;
        this.f244165e = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager = this.f244164d;
        finderMultiFlowVideoAutoPlayManager.f130771u.setEmpty();
        finderMultiFlowVideoAutoPlayManager.f130761h.getGlobalVisibleRect(finderMultiFlowVideoAutoPlayManager.f130771u);
        this.f244165e.topMargin = (int) (finderMultiFlowVideoAutoPlayManager.f130771u.top + (finderMultiFlowVideoAutoPlayManager.f130761h.getHeight() * 0.3f));
    }
}
