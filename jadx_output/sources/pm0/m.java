package pm0;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f356782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k0 f356783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.lifecycle.g0 g0Var, androidx.lifecycle.k0 k0Var) {
        super(0);
        this.f356782d = g0Var;
        this.f356783e = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f356782d.observeForever(this.f356783e);
        ((ku5.t0) ku5.t0.f312615d).B(new pm0.l(this.f356782d, this.f356783e));
        return jz5.f0.f302826a;
    }
}
