package lk5;

/* loaded from: classes14.dex */
public final class n0 implements android.view.WindowInsetsController {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lk5.p0 f319054a;

    public n0(lk5.p0 p0Var) {
        this.f319054a = p0Var;
    }

    @Override // android.view.WindowInsetsController
    public void addOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // android.view.WindowInsetsController
    public void controlWindowInsetsAnimation(int i17, long j17, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, android.view.WindowInsetsAnimationControlListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // android.view.WindowInsetsController
    public int getSystemBarsAppearance() {
        android.view.WindowInsetsController insetsController = this.f319054a.f319058a.getWindow().getInsetsController();
        if (insetsController != null) {
            return insetsController.getSystemBarsAppearance();
        }
        return 0;
    }

    @Override // android.view.WindowInsetsController
    public int getSystemBarsBehavior() {
        android.view.WindowInsetsController insetsController = this.f319054a.f319058a.getWindow().getInsetsController();
        if (insetsController != null) {
            return insetsController.getSystemBarsBehavior();
        }
        return 1;
    }

    @Override // android.view.WindowInsetsController
    public void hide(int i17) {
    }

    @Override // android.view.WindowInsetsController
    public void removeOnControllableInsetsChangedListener(android.view.WindowInsetsController.OnControllableInsetsChangedListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    @Override // android.view.WindowInsetsController
    public void setSystemBarsAppearance(int i17, int i18) {
    }

    @Override // android.view.WindowInsetsController
    public void setSystemBarsBehavior(int i17) {
    }

    @Override // android.view.WindowInsetsController
    public void show(int i17) {
    }
}
