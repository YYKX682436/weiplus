package sc2;

/* loaded from: classes2.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.s4 f406147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406149g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(xc2.p0 p0Var, sc2.s4 s4Var, in5.s0 s0Var, android.view.View view) {
        super(0);
        this.f406146d = p0Var;
        this.f406147e = s4Var;
        this.f406148f = s0Var;
        this.f406149g = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xc2.l lVar = xc2.l.f453196e;
        xc2.p0 p0Var = this.f406146d;
        p0Var.f453241d0 = lVar;
        this.f406147e.r(this.f406148f, this.f406149g, p0Var);
        return jz5.f0.f302826a;
    }
}
