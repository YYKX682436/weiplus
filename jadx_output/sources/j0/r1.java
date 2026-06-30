package j0;

/* loaded from: classes14.dex */
public final class r1 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0.r1 f296539a = new j0.r1();

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.d(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.a(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.c(this, uVar, list, i17);
    }

    @Override // s1.t0
    public final s1.u0 d(s1.x0 Layout, java.util.List children, long j17) {
        kotlin.jvm.internal.o.g(Layout, "$this$Layout");
        kotlin.jvm.internal.o.g(children, "children");
        java.util.ArrayList arrayList = new java.util.ArrayList(children.size());
        int size = children.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(((s1.r0) children.get(i17)).m(j17));
        }
        return s1.v0.b(Layout, p2.c.h(j17), p2.c.g(j17), null, new j0.q1(arrayList), 4, null);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.b(this, uVar, list, i17);
    }
}
