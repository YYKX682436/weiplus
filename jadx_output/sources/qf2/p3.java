package qf2;

/* loaded from: classes.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f362538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(qf2.q3 q3Var, int i17) {
        super(0);
        this.f362537d = q3Var;
        this.f362538e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qf2.q3 q3Var = this.f362537d;
        lj2.o0 o0Var = q3Var.f362548m;
        if (o0Var != null) {
            o0Var.a(this.f362538e, 2);
        }
        lj2.o0 o0Var2 = q3Var.f362548m;
        if (o0Var2 != null) {
            o0Var2.b();
        }
        return jz5.f0.f302826a;
    }
}
