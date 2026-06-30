package cp2;

/* loaded from: classes2.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f220880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f220881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(boolean z17, cp2.v0 v0Var) {
        super(0);
        this.f220880d = z17;
        this.f220881e = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f220880d;
        cp2.v0 v0Var = this.f220881e;
        if (z17) {
            v0Var.Q();
        } else {
            v0Var.A();
        }
        return jz5.f0.f302826a;
    }
}
