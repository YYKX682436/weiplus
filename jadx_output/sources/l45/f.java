package l45;

/* loaded from: classes10.dex */
public class f implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l45.n f316441a;

    public f(l45.n nVar) {
        this.f316441a = nVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        l45.n nVar = this.f316441a;
        android.view.View rubbishView = nVar.f316460a.getRubbishView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(rubbishView, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$5", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(rubbishView, "com/tencent/mm/presenter/DrawingPresenter$5", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nVar.f316460a.getRubbishView().post(new java.lang.Runnable() { // from class: l45.f$$a
            @Override // java.lang.Runnable
            public final void run() {
                l45.n nVar2 = l45.f.this.f316441a;
                if (nVar2.f316483x.m() == dl.a.EMOJI_AND_TEXT) {
                    dl.y yVar = (dl.y) nVar2.f316483x;
                    android.view.View rubbishView2 = nVar2.f316460a.getRubbishView();
                    yVar.f235155t.set(new android.graphics.Rect(rubbishView2.getLeft() + 25, rubbishView2.getTop() + 25, rubbishView2.getLeft() + rubbishView2.getWidth() + 25, rubbishView2.getTop() + rubbishView2.getHeight() + 25));
                }
            }
        });
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
