package pm0;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f356780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f356781e;

    public l(androidx.lifecycle.g0 g0Var, androidx.lifecycle.k0 k0Var) {
        this.f356780d = g0Var;
        this.f356781e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object value = this.f356780d.getValue();
        if (value != null) {
            this.f356781e.onChanged(value);
        }
    }
}
