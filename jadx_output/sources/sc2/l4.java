package sc2;

/* loaded from: classes2.dex */
public final class l4 extends sc2.k4 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.m4 f406047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(android.view.View view, sc2.m4 m4Var, long j17, int i17, java.lang.String str) {
        super(j17, i17, str);
        this.f406046g = view;
        this.f406047h = m4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f406046g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver$transformView$1$scaleYAnimator$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperLabelObserver$transformView$1$scaleYAnimator$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sc2.m4 m4Var = this.f406047h;
        m4Var.getClass();
        m4Var.H(19, xc2.k0.f453173y.a(this.f406016d, this.f406017e, this.f406018f));
        xc2.u0[] u0VarArr = xc2.u0.f453308d;
        com.tencent.mm.autogen.events.FinderJumperDescTopLeftStateEvent finderJumperDescTopLeftStateEvent = new com.tencent.mm.autogen.events.FinderJumperDescTopLeftStateEvent();
        long j17 = m4Var.f3145f;
        am.lb lbVar = finderJumperDescTopLeftStateEvent.f54281g;
        lbVar.f7234a = j17;
        lbVar.f7235b = 1;
        finderJumperDescTopLeftStateEvent.e();
        m4Var.A = false;
    }
}
