package uj3;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.g f428261d;

    public f(uj3.g gVar) {
        this.f428261d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withStartAction;
        uj3.g gVar = this.f428261d;
        if (gVar.f428275h) {
            return;
        }
        android.view.View view = gVar.f428270c;
        if (view != null) {
            view.clearAnimation();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = gVar.f428269b;
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        android.view.View view2 = gVar.f428270c;
        if (view2 == null || (animate = view2.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(100L)) == null || (withStartAction = duration.withStartAction(new uj3.e(gVar))) == null) {
            return;
        }
        withStartAction.start();
    }
}
