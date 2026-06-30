package v0;

/* loaded from: classes14.dex */
public final class b implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f432191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f432192b;

    public b(androidx.lifecycle.g0 g0Var, androidx.lifecycle.k0 k0Var) {
        this.f432191a = g0Var;
        this.f432192b = k0Var;
    }

    @Override // n0.a2
    public void dispose() {
        this.f432191a.removeObserver(this.f432192b);
    }
}
