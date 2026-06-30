package gd2;

/* loaded from: classes3.dex */
public final class r implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f270556d;

    public r(gd2.x xVar, gd2.x xVar2) {
        this.f270556d = xVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.widget.ImageView imageView = this.f270556d.f270573j;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.widget.ImageView imageView = this.f270556d.f270573j;
        if (imageView != null) {
            imageView.setAlpha(0.0f);
        } else {
            kotlin.jvm.internal.o.o("scanLine");
            throw null;
        }
    }
}
