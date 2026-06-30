package tz0;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f423202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(n0.v2 v2Var, float f17) {
        super(3);
        this.f423202d = v2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        s1.x0 layout = (s1.x0) obj;
        s1.r0 measurable = (s1.r0) obj2;
        long j17 = ((p2.c) obj3).f351377a;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        this.f423202d.setValue(java.lang.Integer.valueOf(m17.f402050d));
        return s1.v0.b(layout, m17.f402050d, m17.f402051e, null, new tz0.m(m17), 4, null);
    }
}
