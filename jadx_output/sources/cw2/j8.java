package cw2;

/* loaded from: classes2.dex */
public final class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223789d;

    public j8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223789d = finderVideoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View loading;
        android.view.View loading2;
        android.view.View loading3;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout;
        yz5.l onCustomLoadingStatusChange;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223789d;
        com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar longVideoSeekBar = finderVideoLayout.getLongVideoSeekBar();
        if (longVideoSeekBar != null && (onCustomLoadingStatusChange = longVideoSeekBar.getOnCustomLoadingStatusChange()) != null) {
            onCustomLoadingStatusChange.invoke(java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mars.xlog.Log.i(finderVideoLayout.getFTPPTag(), "[dismissLoading] " + finderVideoLayout.d0());
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout newSeekBarLayout = finderVideoLayout.getNewSeekBarLayout();
        if (newSeekBarLayout != null) {
            android.animation.AnimatorSet animatorSet = newSeekBarLayout.C;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            newSeekBarLayout.C = null;
            android.view.View loadingView = newSeekBarLayout.getLoadingView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (newSeekBarLayout.getSeeker().getVisibility() != 0 && (finderFullSeekBarLayout = newSeekBarLayout.fullSeekBarLayout) != null && finderFullSeekBarLayout.hasHighlightInfo) {
                finderFullSeekBarLayout.H();
            }
        }
        loading = finderVideoLayout.getLoading();
        loading.animate().cancel();
        loading2 = finderVideoLayout.getLoading();
        if (loading2.getVisibility() != 8) {
            loading3 = finderVideoLayout.getLoading();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(loading3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loading3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(loading3, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
