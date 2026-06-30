package xn2;

/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f455577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i17, xn2.f1 f1Var) {
        super(0);
        this.f455577d = i17;
        this.f455578e = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f455577d == 0) {
            xn2.f1 f1Var = this.f455578e;
            f1Var.f455495g = true;
            if (f1Var.f455494f) {
                f1Var.g().setVisibility(0);
            }
        }
        return jz5.f0.f302826a;
    }
}
