package sc3;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sc3.k1 k1Var) {
        super(0);
        this.f406454d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc3.k1 k1Var = this.f406454d;
        java.lang.String bizName = k1Var.D;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        com.tencent.magicbrush.MagicBrush h17 = k1Var.G0("MB.".concat(r26.p0.E0(r26.n0.W(bizName, "Magic"), 10)), k1Var.M0(), new sc3.h(k1Var), k1Var).h();
        kotlin.jvm.internal.o.d(h17);
        k1Var.s1(h17, "MagicBrush");
        k1Var.f406488t = h17;
        return jz5.f0.f302826a;
    }
}
