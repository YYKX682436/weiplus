package u4;

/* loaded from: classes13.dex */
public class w extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f424568d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f424569e = false;

    public w(android.view.View view) {
        this.f424568d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f424568d;
        u4.w1.c(view, 1.0f);
        if (this.f424569e) {
            view.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        android.view.View view = this.f424568d;
        if (n3.u0.h(view) && view.getLayerType() == 0) {
            this.f424569e = true;
            view.setLayerType(2, null);
        }
    }
}
