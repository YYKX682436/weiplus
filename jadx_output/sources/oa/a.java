package oa;

/* loaded from: classes5.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout f343758d;

    public a(com.google.android.material.tabs.TabLayout tabLayout) {
        this.f343758d = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f343758d.scrollTo(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
