package ym5;

/* loaded from: classes3.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.ViewAnimHelper$ViewInfo f463270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f463272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f463273h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.AnimationLayout f463274i;

    public f(com.tencent.mm.view.AnimationLayout animationLayout, android.view.View view, com.tencent.mm.view.ViewAnimHelper$ViewInfo viewAnimHelper$ViewInfo, android.view.View view2, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f463274i = animationLayout;
        this.f463269d = view;
        this.f463270e = viewAnimHelper$ViewInfo;
        this.f463271f = view2;
        this.f463272g = animatorListener;
        this.f463273h = animatorUpdateListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f463269d;
        com.tencent.mm.view.AnimationLayout animationLayout = this.f463274i;
        android.graphics.Rect rect = ym5.u6.b(animationLayout, view).f213513d;
        com.tencent.mm.view.ViewAnimHelper$ViewInfo viewAnimHelper$ViewInfo = this.f463270e;
        float width = (rect.width() * 1.0f) / viewAnimHelper$ViewInfo.f213513d.width();
        float height = (rect.height() * 1.0f) / viewAnimHelper$ViewInfo.f213513d.height();
        float f17 = width > height ? width : 1.0f;
        float f18 = height > width ? height : 1.0f;
        ym5.u6.a(animationLayout, this.f463271f, viewAnimHelper$ViewInfo, this.f463272g, (f17 > 1.0f || f18 > 1.0f) ? new ym5.e(this, f17, height, width, f18) : null);
    }
}
