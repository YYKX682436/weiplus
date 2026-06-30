package gk2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f272470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gk2.e eVar) {
        super(0);
        this.f272470d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.b0 b0Var = this.f272470d.f272474h;
        if (b0Var.f11605c != androidx.lifecycle.n.INITIALIZED) {
            b0Var.i(androidx.lifecycle.n.DESTROYED);
        }
        return jz5.f0.f302826a;
    }
}
