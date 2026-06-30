package d0;

/* loaded from: classes14.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0.z1 f225244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f225245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f225246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(d0.z1 z1Var, s1.x0 x0Var, s1.o1 o1Var) {
        super(1);
        this.f225244d = z1Var;
        this.f225245e = x0Var;
        this.f225246f = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        d0.z1 z1Var = this.f225244d;
        long j17 = ((p2.m) z1Var.f225249d.invoke(this.f225245e)).f351390a;
        if (z1Var.f225250e) {
            s1.n1.f(layout, this.f225246f, (int) (j17 >> 32), p2.m.b(j17), 0.0f, null, 12, null);
        } else {
            s1.n1.h(layout, this.f225246f, (int) (j17 >> 32), p2.m.b(j17), 0.0f, null, 12, null);
        }
        return jz5.f0.f302826a;
    }
}
