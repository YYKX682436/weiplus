package r20;

/* loaded from: classes2.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.view.EcsBarrageBoxView f368769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f368770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f368771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f368772g;

    public c(com.tencent.mm.feature.ecs.product.view.EcsBarrageBoxView ecsBarrageBoxView, android.view.View view, java.util.List list, float f17) {
        this.f368769d = ecsBarrageBoxView;
        this.f368770e = view;
        this.f368771f = list;
        this.f368772g = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        n3.t1 t1Var = new n3.t1(this.f368769d);
        int i17 = 0;
        while (t1Var.hasNext()) {
            java.lang.Object next = t1Var.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view = (android.view.View) next;
            java.lang.Float f17 = (java.lang.Float) kz5.n0.a0(this.f368771f, i17);
            view.setTranslationY((f17 != null ? f17.floatValue() : 0.0f) - (this.f368772g * floatValue));
            i17 = i18;
        }
        android.view.View view2 = this.f368770e;
        float f18 = 1 - floatValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/feature/ecs/product/view/EcsBarrageBoxView$loopNextMessage$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/feature/ecs/product/view/EcsBarrageBoxView$loopNextMessage$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
