package j0;

/* loaded from: classes14.dex */
public final class g3 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f296300a;

    public g3(j0.j3 j3Var) {
        this.f296300a = j3Var;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        j0.j3 j3Var = this.f296300a;
        j3Var.f296382d.f296288a.b(uVar.getLayoutDirection());
        if (j3Var.f296382d.f296288a.f296411i != null) {
            return (int) java.lang.Math.ceil(r1.b());
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        return p2.q.b(this.f296300a.f296382d.f296288a.a(p2.d.a(0, i17, 0, Integer.MAX_VALUE), uVar.getLayoutDirection(), null).f767c);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        return p2.q.b(this.f296300a.f296382d.f296288a.a(p2.d.a(0, i17, 0, Integer.MAX_VALUE), uVar.getLayoutDirection(), null).f767c);
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        jz5.l lVar;
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        j0.j3 j3Var = this.f296300a;
        a2.k1 a17 = j3Var.f296382d.f296288a.a(j17, measure.getLayoutDirection(), j3Var.f296382d.f296292e);
        if (!kotlin.jvm.internal.o.b(j3Var.f296382d.f296292e, a17)) {
            j3Var.f296382d.f296290c.invoke(a17);
            a2.k1 k1Var = j3Var.f296382d.f296292e;
            if (k1Var != null && !kotlin.jvm.internal.o.b(k1Var.f765a.f754a, a17.f765a.f754a)) {
                j3Var.getClass();
            }
        }
        j3Var.f296382d.f296292e = a17;
        int size = measurables.size();
        java.util.List list = a17.f770f;
        if (!(size >= list.size())) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            d1.g gVar = (d1.g) list.get(i17);
            if (gVar != null) {
                s1.r0 r0Var = (s1.r0) measurables.get(i17);
                float f17 = gVar.f225631c;
                float f18 = gVar.f225629a;
                float f19 = gVar.f225632d;
                lVar = new jz5.l(r0Var.m(p2.d.b(0, (int) java.lang.Math.floor(f17 - f18), 0, (int) java.lang.Math.floor(f19 - r8), 5, null)), new p2.m(p2.n.a(a06.d.b(f18), a06.d.b(gVar.f225630b))));
            } else {
                lVar = null;
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        long j18 = a17.f767c;
        return measure.W((int) (j18 >> 32), p2.q.b(j18), kz5.c1.k(new jz5.l(s1.d.f401999a, java.lang.Integer.valueOf(a06.d.b(a17.f768d))), new jz5.l(s1.d.f402000b, java.lang.Integer.valueOf(a06.d.b(a17.f769e)))), new j0.f3(arrayList));
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        j0.j3 j3Var = this.f296300a;
        j3Var.f296382d.f296288a.b(uVar.getLayoutDirection());
        if (j3Var.f296382d.f296288a.f296411i != null) {
            return (int) java.lang.Math.ceil(r1.c());
        }
        throw new java.lang.IllegalStateException("layoutIntrinsics must be called first");
    }
}
