package hw;

/* loaded from: classes7.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.j1 f285387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(hw.j1 j1Var) {
        super(0);
        this.f285387d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hw.j1 j1Var = this.f285387d;
        hw.j1.wi(j1Var);
        ((dq0.c0) ((dq0.i) i95.n0.c(dq0.i.class))).Ai("MagicEcsTimeline", j1Var.Ai());
        return (dq0.i) i95.n0.c(dq0.i.class);
    }
}
