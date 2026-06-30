package pm0;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f356787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f356788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f356789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.lifecycle.g0 g0Var, androidx.lifecycle.y yVar, androidx.lifecycle.k0 k0Var) {
        super(0);
        this.f356787d = g0Var;
        this.f356788e = yVar;
        this.f356789f = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f356787d.observe(this.f356788e, this.f356789f);
        ((ku5.t0) ku5.t0.f312615d).B(new pm0.n(this.f356787d, this.f356788e, this.f356789f));
        return jz5.f0.f302826a;
    }
}
