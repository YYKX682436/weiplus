package lf4;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lf4.b0 b0Var, int i17) {
        super(0);
        this.f318448d = b0Var;
        this.f318449e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf4.b0 b0Var = this.f318448d;
        java.util.List list = b0Var.f318361n;
        int i17 = this.f318449e;
        list.remove(i17);
        ((sf4.a1) b0Var.f318355e).a(i17);
        return jz5.f0.f302826a;
    }
}
