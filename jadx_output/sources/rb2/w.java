package rb2;

/* loaded from: classes.dex */
public final class w implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f393804g;

    public w(android.view.View view, so2.y0 y0Var, java.lang.String str, int i17) {
        this.f393801d = view;
        this.f393802e = y0Var;
        this.f393803f = str;
        this.f393804g = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f393801d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$blinkView$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$blinkView$1", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f393802e.f410721y = false;
        com.tencent.mars.xlog.Log.i(this.f393803f, "blinkView cancel, gone " + this.f393804g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f393801d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$blinkView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$blinkView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f393802e.f410721y = false;
        com.tencent.mars.xlog.Log.i(this.f393803f, "blinkView end, gone " + this.f393804g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i(this.f393803f, "blinkView start, gone " + this.f393804g);
    }
}
