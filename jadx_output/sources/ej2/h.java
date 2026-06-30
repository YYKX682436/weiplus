package ej2;

/* loaded from: classes.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f253296d;

    public h(android.widget.TextView textView) {
        this.f253296d = textView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f253296d.setVisibility(0);
    }
}
