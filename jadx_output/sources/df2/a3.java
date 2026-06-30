package df2;

/* loaded from: classes3.dex */
public final class a3 {

    /* renamed from: k, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f229660k = new android.view.animation.PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f229661a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f229662b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f229663c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f229664d;

    /* renamed from: e, reason: collision with root package name */
    public int f229665e;

    /* renamed from: f, reason: collision with root package name */
    public int f229666f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f229667g;

    /* renamed from: h, reason: collision with root package name */
    public int f229668h;

    /* renamed from: i, reason: collision with root package name */
    public final float f229669i;

    /* renamed from: j, reason: collision with root package name */
    public final df2.z2 f229670j;

    public a3(android.view.View micCenterView, android.view.View view, android.view.ViewGroup wrapperView, java.util.List exclusiveViews) {
        kotlin.jvm.internal.o.g(micCenterView, "micCenterView");
        kotlin.jvm.internal.o.g(wrapperView, "wrapperView");
        kotlin.jvm.internal.o.g(exclusiveViews, "exclusiveViews");
        this.f229661a = micCenterView;
        this.f229662b = view;
        this.f229663c = wrapperView;
        this.f229664d = exclusiveViews;
        this.f229669i = micCenterView.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        this.f229670j = new df2.z2(this);
    }

    public final void a(float f17) {
        if (this.f229665e <= 0) {
            return;
        }
        int i17 = (int) (this.f229666f + ((r0 - r1) * f17));
        android.view.ViewGroup viewGroup = this.f229663c;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams.height != i17) {
            layoutParams.height = i17;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public final void b() {
        this.f229668h++;
        android.animation.ValueAnimator valueAnimator = this.f229667g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f229667g = null;
        android.view.View view = this.f229661a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f229661a.setClipToOutline(false);
        for (android.view.View view2 : this.f229664d) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/FinderLiveMicCenterFadingAnimator", "cancel", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final void c(float f17, float f18, yz5.a aVar) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(f229660k);
        ofFloat.addUpdateListener(new df2.x2(this));
        ofFloat.addListener(new df2.y2(aVar));
        ofFloat.start();
        this.f229667g = ofFloat;
    }
}
