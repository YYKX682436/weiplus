package ym5;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.ViewAnimHelper$ViewInfo f463204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f463206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f463207h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.AnimationLayout f463208i;

    public b(com.tencent.mm.view.AnimationLayout animationLayout, android.view.View view, com.tencent.mm.view.ViewAnimHelper$ViewInfo viewAnimHelper$ViewInfo, android.view.View view2, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f463208i = animationLayout;
        this.f463203d = view;
        this.f463204e = viewAnimHelper$ViewInfo;
        this.f463205f = view2;
        this.f463206g = animatorListener;
        this.f463207h = animatorUpdateListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f463203d;
        com.tencent.mm.view.AnimationLayout animationLayout = this.f463208i;
        android.graphics.Rect rect = ym5.u6.b(animationLayout, view).f213513d;
        com.tencent.mm.view.ViewAnimHelper$ViewInfo viewAnimHelper$ViewInfo = this.f463204e;
        float width = (rect.width() * 1.0f) / viewAnimHelper$ViewInfo.f213513d.width();
        float height = (rect.height() * 1.0f) / viewAnimHelper$ViewInfo.f213513d.height();
        float f17 = width > height ? width : 1.0f;
        float f18 = height > width ? height : 1.0f;
        ym5.u6.a(animationLayout, this.f463205f, viewAnimHelper$ViewInfo, this.f463206g, (f17 > 1.0f || f18 > 1.0f) ? new ym5.a(this, f17, width, height, f18) : null);
    }
}
