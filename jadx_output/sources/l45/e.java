package l45;

/* loaded from: classes10.dex */
public class e implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f316440a;

    public e(l45.n nVar) {
        this.f316440a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f316440a;
        ((android.widget.EditText) nVar.f316460a.getTextEditView().findViewById(com.tencent.mm.R.id.o4a)).setText("");
        android.view.View textEditView = nVar.f316460a.getTextEditView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textEditView, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textEditView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(textEditView, "com/tencent/mm/presenter/DrawingPresenter$4", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f316440a.f316460a.getSelectedFeatureListener().c(false);
    }
}
