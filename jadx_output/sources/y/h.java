package y;

/* loaded from: classes14.dex */
public final class h implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final y.s f458355a;

    public h(y.s scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f458355a = scope;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        java.lang.Integer num = (java.lang.Integer) q26.h0.q(q26.h0.o(kz5.n0.J(measurables), new y.g(i17)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        java.lang.Integer num = (java.lang.Integer) q26.h0.q(q26.h0.o(kz5.n0.J(measurables), new y.c(i17)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        java.lang.Integer num = (java.lang.Integer) q26.h0.q(q26.h0.o(kz5.n0.J(measurables), new y.f(i17)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v22 */
    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(measurables, 10));
        java.util.Iterator it = measurables.iterator();
        while (it.hasNext()) {
            arrayList.add(((s1.r0) it.next()).m(j17));
        }
        s1.o1 o1Var = null;
        int i17 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i18 = ((s1.o1) obj).f402050d;
            int h17 = kz5.c0.h(arrayList);
            if (1 <= h17) {
                int i19 = 1;
                while (true) {
                    java.lang.Object obj2 = arrayList.get(i19);
                    int i27 = ((s1.o1) obj2).f402050d;
                    if (i18 < i27) {
                        obj = obj2;
                        i18 = i27;
                    }
                    if (i19 == h17) {
                        break;
                    }
                    i19++;
                }
            }
        }
        s1.o1 o1Var2 = (s1.o1) obj;
        int i28 = o1Var2 != null ? o1Var2.f402050d : 0;
        if (!arrayList.isEmpty()) {
            ?? r112 = arrayList.get(0);
            int i29 = ((s1.o1) r112).f402051e;
            int h18 = kz5.c0.h(arrayList);
            boolean z17 = r112;
            if (1 <= h18) {
                while (true) {
                    java.lang.Object obj3 = arrayList.get(i17);
                    int i37 = ((s1.o1) obj3).f402051e;
                    r112 = z17;
                    if (i29 < i37) {
                        r112 = obj3;
                        i29 = i37;
                    }
                    if (i17 == h18) {
                        break;
                    }
                    i17++;
                    z17 = r112;
                }
            }
            o1Var = r112;
        }
        s1.o1 o1Var3 = o1Var;
        int i38 = o1Var3 != null ? o1Var3.f402051e : 0;
        ((n0.q4) this.f458355a.f458438a).setValue(new p2.q(p2.r.a(i28, i38)));
        return s1.v0.b(measure, i28, i38, null, new y.e(arrayList), 4, null);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        java.lang.Integer num = (java.lang.Integer) q26.h0.q(q26.h0.o(kz5.n0.J(measurables), new y.d(i17)));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
