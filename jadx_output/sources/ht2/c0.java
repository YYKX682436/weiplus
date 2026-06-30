package ht2;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f284814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.widget.TextView textView) {
        super(1);
        this.f284814d = textView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.animation.Animator it = (android.animation.Animator) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = this.f284814d;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null && (animate = textView.animate()) != null && (alpha = animate.alpha(1.0f)) != null) {
            alpha.start();
        }
        return jz5.f0.f302826a;
    }
}
