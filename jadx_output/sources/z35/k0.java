package z35;

/* loaded from: classes4.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView f470016d;

    public k0(com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView) {
        this.f470016d = heroSeekBarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f470016d;
        android.view.View showInfoLayout = heroSeekBarView.getShowInfoLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(showInfoLayout, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$onUserOperate$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        showInfoLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(showInfoLayout, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$onUserOperate$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        heroSeekBarView.getHeroSeekBar().setVisibility(4);
        heroSeekBarView.j(heroSeekBarView.getCom.google.android.gms.common.internal.ImagesContract.LOCAL java.lang.String(), false);
        heroSeekBarView.setJumpSeekAnimation(true);
        z35.g0 visibleChangeListener = heroSeekBarView.getVisibleChangeListener();
        if (visibleChangeListener != null) {
            visibleChangeListener.a(false);
        }
    }
}
