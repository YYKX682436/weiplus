package cw2;

/* loaded from: classes2.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223671d;

    public e2(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223671d = finderFullSeekBarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f223671d;
        finderFullSeekBarLayout.t("onStopTrackingTouch");
        finderFullSeekBarLayout.setPendingExitMode(false);
        finderFullSeekBarLayout.H();
    }
}
