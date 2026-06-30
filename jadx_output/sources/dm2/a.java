package dm2;

/* loaded from: classes3.dex */
public final class a implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView f241664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView f241665b;

    public a(com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView finderLiveLogoGroupView, com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoItemView finderLiveLogoItemView) {
        this.f241664a = finderLiveLogoGroupView;
        this.f241665b = finderLiveLogoItemView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#render animatorOut onAnimationEnd");
        this.f241664a.f116310f.removeView(this.f241665b);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
