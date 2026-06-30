package gx0;

/* loaded from: classes3.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f276982e;

    public t7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        this.f276981d = w8Var;
        this.f276982e = continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.clipworks.displaysys.DSRenderView dSRenderView;
        gx0.w8 w8Var = this.f276981d;
        java.lang.ref.WeakReference weakReference = w8Var.A;
        if (weakReference != null && (dSRenderView = (io.clipworks.displaysys.DSRenderView) weakReference.get()) != null) {
            android.view.ViewParent parent = dSRenderView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(dSRenderView);
            }
        }
        w8Var.A = null;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f276982e.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
