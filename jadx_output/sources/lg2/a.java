package lg2;

/* loaded from: classes10.dex */
public abstract class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f318556d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f318557e;

    /* renamed from: f, reason: collision with root package name */
    public final int f318558f;

    /* renamed from: g, reason: collision with root package name */
    public final int f318559g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f318560h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f318561i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f318562m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f318563n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.AnimatorSet f318564o;

    public a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f318556d = context;
        this.f318557e = "Finder." + r();
        qg2.d dVar = qg2.d.f362793a;
        this.f318558f = dVar.g();
        this.f318559g = dVar.f();
    }

    public void j(jg2.b builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        android.graphics.Rect q17 = q();
        android.graphics.Rect s17 = s();
        float width = (s17.width() * 1.0f) / q17.width();
        float height = (s17.height() * 1.0f) / q17.height();
        float centerX = s17.centerX() - q17.centerX();
        float centerY = s17.centerY() - q17.centerY();
        com.tencent.mars.xlog.Log.i(this.f318557e, "setTransitionAnimator sourceRect: " + q17 + "  targetRect: " + s17 + " scaleRatioX: " + width + "  scaleRatioY: " + height + "  translationX: " + centerX + "  translationY: " + centerY + ' ');
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f318563n, "scaleX", 1.0f, width);
        kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
        builder.a(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f318563n, "scaleY", 1.0f, height);
        kotlin.jvm.internal.o.f(ofFloat2, "ofFloat(...)");
        builder.a(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f318563n, "translationX", 0.0f, centerX);
        kotlin.jvm.internal.o.f(ofFloat3, "ofFloat(...)");
        builder.a(ofFloat3);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f318563n, "translationY", 0.0f, centerY);
        kotlin.jvm.internal.o.f(ofFloat4, "ofFloat(...)");
        builder.a(ofFloat4);
    }

    public abstract void k();

    public void l() {
        this.f318560h = n();
        this.f318561i = m();
        java.lang.String str = "targetRect = " + s();
        java.lang.String str2 = this.f318557e;
        com.tencent.mars.xlog.Log.i(str2, str);
        com.tencent.mars.xlog.Log.i(str2, "sourceRect = " + q());
        this.f318563n = o();
        k();
    }

    public abstract android.graphics.Rect m();

    public abstract android.graphics.Rect n();

    public abstract android.view.View o();

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i(this.f318557e, "onAnimationEnd");
        yz5.a aVar = this.f318562m;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f318562m = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    public abstract void p();

    public android.graphics.Rect q() {
        android.graphics.Rect rect = this.f318561i;
        if (rect != null) {
            return rect;
        }
        kotlin.jvm.internal.o.o("sourceRect");
        throw null;
    }

    public abstract java.lang.String r();

    public android.graphics.Rect s() {
        android.graphics.Rect rect = this.f318560h;
        if (rect != null) {
            return rect;
        }
        kotlin.jvm.internal.o.o("targetRect");
        throw null;
    }

    public long t() {
        return 240L;
    }

    public void u(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        this.f318562m = onAnimationEndCallback;
        jg2.b bVar = new jg2.b();
        j(bVar);
        java.util.ArrayList animatorList = bVar.f299647a;
        kotlin.jvm.internal.o.g(animatorList, "animatorList");
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(t());
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet.playTogether(animatorList);
        this.f318564o = animatorSet;
        animatorSet.addListener(this);
        animatorSet.start();
    }
}
