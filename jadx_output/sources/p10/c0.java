package p10;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f350932a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f350933b;

    /* renamed from: c, reason: collision with root package name */
    public final p10.y f350934c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f350935d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f350936e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f350937f;

    public c0(android.app.Activity activity, com.tencent.mm.sdk.platformtools.n3 handler, p10.y callbacks) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(callbacks, "callbacks");
        this.f350932a = activity;
        this.f350933b = handler;
        this.f350934c = callbacks;
        this.f350937f = new p10.z(this);
    }

    public final void a() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        java.lang.Runnable runnable = this.f350937f;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f350933b;
        n3Var.removeCallbacks(runnable);
        java.lang.Runnable runnable2 = this.f350936e;
        if (runnable2 != null) {
            n3Var.removeCallbacks(runnable2);
        }
        java.lang.ref.WeakReference weakReference = this.f350935d;
        if (weakReference == null || (u3Var = (com.tencent.mm.ui.widget.dialog.u3) weakReference.get()) == null) {
            return;
        }
        u3Var.dismiss();
    }
}
