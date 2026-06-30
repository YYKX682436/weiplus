package u1;

/* loaded from: classes14.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.c1 f423725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.u f423726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(u1.c1 c1Var, e1.u uVar) {
        super(0);
        this.f423725d = c1Var;
        this.f423726e = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        u1.c1 c1Var = this.f423725d;
        u1.o oVar = (u1.o) c1Var.f423568y[0];
        e1.u uVar = this.f423726e;
        if (oVar == null) {
            c1Var.y0(uVar);
        } else {
            oVar.c(uVar);
        }
        return jz5.f0.f302826a;
    }
}
