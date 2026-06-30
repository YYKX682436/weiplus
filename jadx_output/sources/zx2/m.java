package zx2;

/* loaded from: classes15.dex */
public class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477059d;

    public m(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout) {
        this.f477059d = finderTabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f477059d.scrollTo(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
