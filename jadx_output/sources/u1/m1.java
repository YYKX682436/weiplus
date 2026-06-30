package u1;

/* loaded from: classes14.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.n1 f423625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f423626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f423627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f423628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(u1.n1 n1Var, long j17, float f17, yz5.l lVar) {
        super(0);
        this.f423625d = n1Var;
        this.f423626e = j17;
        this.f423627f = f17;
        this.f423628g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17 = this.f423627f;
        long j17 = this.f423626e;
        s1.m1 m1Var = s1.n1.f402041a;
        yz5.l lVar = this.f423628g;
        u1.n1 n1Var = this.f423625d;
        if (lVar == null) {
            m1Var.c(n1Var.f423640i, j17, f17);
        } else {
            m1Var.i(n1Var.f423640i, j17, f17, lVar);
        }
        return jz5.f0.f302826a;
    }
}
