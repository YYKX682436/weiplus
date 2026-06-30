package pm0;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f356784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f356785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f356786f;

    public n(androidx.lifecycle.g0 g0Var, androidx.lifecycle.y yVar, androidx.lifecycle.k0 k0Var) {
        this.f356784d = g0Var;
        this.f356785e = yVar;
        this.f356786f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object value = this.f356784d.getValue();
        if (value == null || !this.f356785e.mo133getLifecycle().b().a(androidx.lifecycle.n.STARTED)) {
            return;
        }
        this.f356786f.onChanged(value);
    }
}
