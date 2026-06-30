package cw2;

/* loaded from: classes2.dex */
public final class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223807d;

    public k8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223807d = finderVideoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223807d;
        finderVideoLayout.getRetryBtn().animate().cancel();
        cw2.ca seekBarLayout = finderVideoLayout.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.setVisibility(0);
        }
        android.view.View retryBtn = finderVideoLayout.getRetryBtn();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(retryBtn, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        retryBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(retryBtn, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$dismissRetryBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (finderVideoLayout.Q) {
            finderVideoLayout.a0(false);
        }
    }
}
