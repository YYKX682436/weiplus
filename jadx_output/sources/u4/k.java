package u4;

/* loaded from: classes13.dex */
public class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424506d;

    public k(androidx.transition.ChangeClipBounds changeClipBounds, android.view.View view) {
        this.f424506d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.w0.c(this.f424506d, null);
    }
}
