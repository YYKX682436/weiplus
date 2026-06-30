package cw2;

/* loaded from: classes2.dex */
public final class z8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224147d;

    public z8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f224147d = finderVideoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224147d;
        finderVideoLayout.getRetryBtn().animate().cancel();
        android.view.View retryBtn = finderVideoLayout.getRetryBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(retryBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        retryBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(retryBtn, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cw2.ca seekBarLayout = finderVideoLayout.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.setVisibility(8);
        }
        finderVideoLayout.x();
    }
}
