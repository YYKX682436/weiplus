package s1;

/* loaded from: classes14.dex */
public final class n0 extends u1.d0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.q0 f402039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f402040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s1.q0 q0Var, yz5.p pVar, java.lang.String str) {
        super(str);
        this.f402039b = q0Var;
        this.f402040c = pVar;
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        s1.q0 q0Var = this.f402039b;
        s1.l0 l0Var = q0Var.f402067g;
        p2.s layoutDirection = measure.getLayoutDirection();
        l0Var.getClass();
        kotlin.jvm.internal.o.g(layoutDirection, "<set-?>");
        l0Var.f402031d = layoutDirection;
        q0Var.f402067g.f402032e = measure.getDensity();
        q0Var.f402067g.f402033f = measure.getFontScale();
        q0Var.f402064d = 0;
        return new s1.m0((s1.u0) this.f402040c.invoke(q0Var.f402067g, new p2.c(j17)), q0Var, q0Var.f402064d);
    }
}
