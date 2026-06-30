package u4;

/* loaded from: classes13.dex */
public class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f424481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f424482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f424483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f424484g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f424485h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f424486i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f424487m;

    public h(androidx.transition.ChangeBounds changeBounds, android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19, int i27) {
        this.f424482e = view;
        this.f424483f = rect;
        this.f424484g = i17;
        this.f424485h = i18;
        this.f424486i = i19;
        this.f424487m = i27;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f424481d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f424481d) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        android.view.View view = this.f424482e;
        n3.w0.c(view, this.f424483f);
        u4.w1.b(view, this.f424484g, this.f424485h, this.f424486i, this.f424487m);
    }
}
