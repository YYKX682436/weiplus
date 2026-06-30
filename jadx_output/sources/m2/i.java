package m2;

/* loaded from: classes13.dex */
public final class i implements o4.g {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f322920d;

    /* renamed from: e, reason: collision with root package name */
    public final o4.f f322921e;

    public i() {
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0(this, false);
        this.f322920d = b0Var;
        o4.f fVar = new o4.f(this, null);
        fVar.a(new android.os.Bundle());
        this.f322921e = fVar;
        b0Var.i(androidx.lifecycle.n.RESUMED);
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f322920d;
    }

    @Override // o4.g
    public o4.b getSavedStateRegistry() {
        return this.f322921e.f342809b;
    }
}
