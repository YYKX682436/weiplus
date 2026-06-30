package rn2;

/* loaded from: classes10.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f397839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(rn2.c1 c1Var, kotlin.jvm.internal.c0 c0Var, java.lang.String str) {
        super(0);
        this.f397838d = c1Var;
        this.f397839e = c0Var;
        this.f397840f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rn2.c1 c1Var = this.f397838d;
        c1Var.g(c1Var.f397668h, false);
        boolean z17 = this.f397839e.f310112d;
        java.lang.String str = this.f397840f;
        if (z17) {
            zd2.d.f471600a.e(str, false, 2142, "gift not found in pool");
        } else {
            zd2.d.f471600a.e(str, true, 0, null);
        }
        return jz5.f0.f302826a;
    }
}
