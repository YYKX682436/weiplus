package rt1;

/* loaded from: classes7.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f399454e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(rt1.p1 p1Var, boolean z17) {
        super(0);
        this.f399453d = p1Var;
        this.f399454e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rt1.b1 b1Var = this.f399453d.f399473b;
        if (b1Var != null) {
            b1Var.e(this.f399454e ? rt1.a1.f399385e : rt1.a1.f399384d);
        }
        return jz5.f0.f302826a;
    }
}
