package rt1;

/* loaded from: classes7.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f399400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt1.f f399401e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(rt1.p1 p1Var, qt1.f fVar) {
        super(0);
        this.f399400d = p1Var;
        this.f399401e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rt1.b1 b1Var = this.f399400d.f399473b;
        if (b1Var != null) {
            b1Var.c(this.f399401e);
        }
        return jz5.f0.f302826a;
    }
}
