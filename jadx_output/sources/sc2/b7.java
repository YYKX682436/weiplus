package sc2;

/* loaded from: classes2.dex */
public final class b7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.t0 f405793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(in5.s0 s0Var, xc2.t0 t0Var) {
        super(1);
        this.f405792d = s0Var;
        this.f405793e = t0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        observer.p(this.f405792d, this.f405793e);
        return jz5.f0.f302826a;
    }
}
