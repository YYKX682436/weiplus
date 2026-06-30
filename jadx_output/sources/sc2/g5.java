package sc2;

/* loaded from: classes2.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f405910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        super(0);
        this.f405910d = valueAnimator;
        this.f405911e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object animatedValue = this.f405910d.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            android.view.View view = this.f405911e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$animateSetViewAlpha$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FinderBaseCarouseCardJumperObserver$animateSetViewAlpha$1$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f302826a;
    }
}
