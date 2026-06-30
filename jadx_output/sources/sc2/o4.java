package sc2;

/* loaded from: classes2.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.s4 f406121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406123g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(xc2.p0 p0Var, sc2.s4 s4Var, in5.s0 s0Var, android.view.View view) {
        super(1);
        this.f406120d = p0Var;
        this.f406121e = s4Var;
        this.f406122f = s0Var;
        this.f406123g = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        xc2.p0 p0Var = this.f406120d;
        p0Var.K = booleanValue;
        p0Var.f453241d0 = xc2.l.f453195d;
        this.f406121e.r(this.f406122f, this.f406123g, p0Var);
        return jz5.f0.f302826a;
    }
}
