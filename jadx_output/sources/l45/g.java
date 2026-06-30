package l45;

/* loaded from: classes10.dex */
public class g implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f316443a;

    public g(l45.n nVar) {
        this.f316443a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f316443a;
        android.view.View rubbishView = nVar.f316460a.getRubbishView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(rubbishView, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(rubbishView, "com/tencent/mm/presenter/DrawingPresenter$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l45.m mVar = nVar.f316479t;
        if (mVar != null) {
            mVar.c(java.lang.Boolean.FALSE);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
