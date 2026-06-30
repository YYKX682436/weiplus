package n91;

/* loaded from: classes7.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n91.c0 f335899d;

    public w(n91.c0 c0Var) {
        this.f335899d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n91.c0 c0Var = this.f335899d;
        com.tencent.mm.plugin.appbrand.ui.AppBrandCircleProgressView appBrandCircleProgressView = c0Var.f335869m;
        if (appBrandCircleProgressView != null) {
            appBrandCircleProgressView.e();
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = c0Var.f335862f;
        kotlin.jvm.internal.o.d(constraintLayout);
        constraintLayout.animate().setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(1000L).alpha(0.0f).setListener(new n91.v(c0Var)).start();
    }
}
