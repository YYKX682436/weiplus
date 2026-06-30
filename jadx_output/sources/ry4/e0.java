package ry4;

/* loaded from: classes.dex */
public final class e0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f401619d;

    public e0(android.widget.CheckBox checkBox) {
        this.f401619d = checkBox;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        kotlin.jvm.internal.o.g(a17, "a");
        android.widget.CheckBox checkBox = this.f401619d;
        checkBox.setVisibility(8);
        checkBox.setTranslationX(0.0f);
    }
}
