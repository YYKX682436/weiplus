package nu0;

/* loaded from: classes5.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f339955e;

    public h3(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        this.f339954d = b4Var;
        this.f339955e = continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.clipworks.displaysys.DSRenderView dSRenderView;
        nu0.b4 b4Var = this.f339954d;
        java.lang.ref.WeakReference weakReference = b4Var.f339890y;
        if (weakReference != null && (dSRenderView = (io.clipworks.displaysys.DSRenderView) weakReference.get()) != null) {
            android.view.ViewParent parent = dSRenderView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(dSRenderView);
            }
        }
        b4Var.f339890y = null;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f339955e.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
