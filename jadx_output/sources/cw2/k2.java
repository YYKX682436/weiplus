package cw2;

/* loaded from: classes2.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223801d;

    public k2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223801d = finderFullSeekBarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f223801d;
        finderFullSeekBarLayout.t("onStopTrackingTouch");
        finderFullSeekBarLayout.setPendingExitMode(false);
        finderFullSeekBarLayout.H();
    }
}
