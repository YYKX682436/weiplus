package j0;

/* loaded from: classes14.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.v4 f296638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(j0.v4 v4Var) {
        super(3);
        this.f296638d = v4Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        s1.x0 layout = (s1.x0) obj;
        s1.r0 measurable = (s1.r0) obj2;
        long j17 = ((p2.c) obj3).f351377a;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        d0.a3.d(z0.p.f468921d, Float.NaN, Float.NaN);
        long j18 = this.f296638d.f296610f;
        s1.o1 m17 = measurable.m(p2.c.a(j17, e06.p.f((int) (j18 >> 32), p2.c.j(j17), p2.c.h(j17)), 0, e06.p.f(p2.q.b(j18), p2.c.i(j17), p2.c.g(j17)), 0, 10, null));
        return s1.v0.b(layout, m17.f402050d, m17.f402051e, null, new j0.w4(m17), 4, null);
    }
}
