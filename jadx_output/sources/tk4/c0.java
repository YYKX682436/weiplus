package tk4;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewManager f419963a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f419964b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.Animator f419965c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f419966d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419967e;

    /* renamed from: f, reason: collision with root package name */
    public int f419968f;

    /* renamed from: g, reason: collision with root package name */
    public int f419969g;

    /* renamed from: h, reason: collision with root package name */
    public float f419970h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.GestureDetector.SimpleOnGestureListener f419971i = new tk4.s(this);

    public final void a(boolean z17) {
        android.view.View view = this.f419964b;
        if (view != null) {
            if (z17) {
                android.view.ViewManager viewManager = this.f419963a;
                if (viewManager != null) {
                    viewManager.removeView(view);
                }
                this.f419963a = null;
                return;
            }
            android.animation.Animator animator = this.f419965c;
            if (animator != null) {
                animator.cancel();
            }
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f419968f);
            ofInt.addUpdateListener(new tk4.o(this));
            ofInt.addListener(new tk4.p(view, this));
            ofInt.setDuration(400L);
            ofInt.start();
            this.f419965c = ofInt;
        }
    }
}
