package l0;

/* loaded from: classes14.dex */
public final class i1 implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f314248a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f314249b;

    /* renamed from: c, reason: collision with root package name */
    public final float f314250c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.d2 f314251d;

    public i1(yz5.l onLabelMeasured, boolean z17, float f17, d0.d2 paddingValues) {
        kotlin.jvm.internal.o.g(onLabelMeasured, "onLabelMeasured");
        kotlin.jvm.internal.o.g(paddingValues, "paddingValues");
        this.f314248a = onLabelMeasured;
        this.f314249b = z17;
        this.f314250c = f17;
        this.f314251d = paddingValues;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        return g(measurables, i17, l0.h1.f314217d);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        return f(uVar, measurables, i17, l0.d1.f314122d);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        return f(uVar, measurables, i17, l0.g1.f314209d);
    }

    @Override // s1.t0
    public s1.u0 d(s1.x0 measure, java.util.List measurables, long j17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        int G = measure.G(((d0.e2) this.f314251d).f225111d);
        long a17 = p2.c.a(j17, 0, 0, 0, 0, 10, null);
        java.util.Iterator it = measurables.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(s1.c0.a((s1.r0) obj), "Leading")) {
                break;
            }
        }
        s1.r0 r0Var = (s1.r0) obj;
        s1.o1 m17 = r0Var != null ? r0Var.m(a17) : null;
        int e17 = l0.h4.e(m17) + 0;
        java.util.Iterator it6 = measurables.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (kotlin.jvm.internal.o.b(s1.c0.a((s1.r0) obj2), "Trailing")) {
                break;
            }
        }
        s1.r0 r0Var2 = (s1.r0) obj2;
        s1.o1 m18 = r0Var2 != null ? r0Var2.m(p2.d.f(a17, -e17, 0)) : null;
        int i17 = -(e17 + l0.h4.e(m18));
        int i18 = -G;
        long f17 = p2.d.f(a17, i17, i18);
        java.util.Iterator it7 = measurables.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it7.next();
            if (kotlin.jvm.internal.o.b(s1.c0.a((s1.r0) obj3), "Label")) {
                break;
            }
        }
        s1.r0 r0Var3 = (s1.r0) obj3;
        s1.o1 m19 = r0Var3 != null ? r0Var3.m(f17) : null;
        if (m19 != null) {
            this.f314248a.invoke(new d1.k(d1.l.a(m19.f402050d, m19.f402051e)));
        }
        long a18 = p2.c.a(p2.d.f(j17, i17, i18 - java.lang.Math.max(l0.h4.d(m19) / 2, G)), 0, 0, 0, 0, 11, null);
        java.util.Iterator it8 = measurables.iterator();
        while (it8.hasNext()) {
            s1.r0 r0Var4 = (s1.r0) it8.next();
            if (kotlin.jvm.internal.o.b(s1.c0.a(r0Var4), "TextField")) {
                s1.o1 m27 = r0Var4.m(a18);
                long a19 = p2.c.a(a18, 0, 0, 0, 0, 14, null);
                java.util.Iterator it9 = measurables.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it9.next();
                    if (kotlin.jvm.internal.o.b(s1.c0.a((s1.r0) obj4), "Hint")) {
                        break;
                    }
                }
                s1.r0 r0Var5 = (s1.r0) obj4;
                s1.o1 m28 = r0Var5 != null ? r0Var5.m(a19) : null;
                int max = java.lang.Math.max(l0.h4.e(m17) + java.lang.Math.max(m27.f402050d, java.lang.Math.max(l0.h4.e(m19), l0.h4.e(m28))) + l0.h4.e(m18), p2.c.j(j17));
                int c17 = l0.c1.c(l0.h4.d(m17), l0.h4.d(m18), m27.f402051e, l0.h4.d(m19), l0.h4.d(m28), j17, measure.getDensity(), this.f314251d);
                java.util.Iterator it10 = measurables.iterator();
                while (it10.hasNext()) {
                    s1.r0 r0Var6 = (s1.r0) it10.next();
                    if (kotlin.jvm.internal.o.b(s1.c0.a(r0Var6), "border")) {
                        return s1.v0.b(measure, max, c17, null, new l0.f1(c17, max, m17, m18, m27, m19, m28, r0Var6.m(p2.d.a(max != Integer.MAX_VALUE ? max : 0, max, c17 != Integer.MAX_VALUE ? c17 : 0, c17)), this, measure), 4, null);
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List measurables, int i17) {
        kotlin.jvm.internal.o.g(uVar, "<this>");
        kotlin.jvm.internal.o.g(measurables, "measurables");
        return g(measurables, i17, l0.e1.f314154d);
    }

    public final int f(s1.u uVar, java.util.List list, int i17, yz5.p pVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        for (java.lang.Object obj5 : list) {
            if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj5), "TextField")) {
                int intValue = ((java.lang.Number) pVar.invoke(obj5, java.lang.Integer.valueOf(i17))).intValue();
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj2), "Label")) {
                        break;
                    }
                }
                s1.t tVar = (s1.t) obj2;
                int intValue2 = tVar != null ? ((java.lang.Number) pVar.invoke(tVar, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj3), "Trailing")) {
                        break;
                    }
                }
                s1.t tVar2 = (s1.t) obj3;
                int intValue3 = tVar2 != null ? ((java.lang.Number) pVar.invoke(tVar2, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it7.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj4), "Leading")) {
                        break;
                    }
                }
                s1.t tVar3 = (s1.t) obj4;
                int intValue4 = tVar3 != null ? ((java.lang.Number) pVar.invoke(tVar3, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it8.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                s1.t tVar4 = (s1.t) obj;
                return l0.c1.c(intValue4, intValue3, intValue, intValue2, tVar4 != null ? ((java.lang.Number) pVar.invoke(tVar4, java.lang.Integer.valueOf(i17))).intValue() : 0, l0.h4.f314224a, uVar.getDensity(), this.f314251d);
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int g(java.util.List list, int i17, yz5.p pVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        for (java.lang.Object obj5 : list) {
            if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj5), "TextField")) {
                int intValue = ((java.lang.Number) pVar.invoke(obj5, java.lang.Integer.valueOf(i17))).intValue();
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj2), "Label")) {
                        break;
                    }
                }
                s1.t tVar = (s1.t) obj2;
                int intValue2 = tVar != null ? ((java.lang.Number) pVar.invoke(tVar, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj3), "Trailing")) {
                        break;
                    }
                }
                s1.t tVar2 = (s1.t) obj3;
                int intValue3 = tVar2 != null ? ((java.lang.Number) pVar.invoke(tVar2, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it7 = list.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it7.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) obj4), "Leading")) {
                        break;
                    }
                }
                s1.t tVar3 = (s1.t) obj4;
                int intValue4 = tVar3 != null ? ((java.lang.Number) pVar.invoke(tVar3, java.lang.Integer.valueOf(i17))).intValue() : 0;
                java.util.Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it8.next();
                    if (kotlin.jvm.internal.o.b(l0.h4.c((s1.t) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                s1.t tVar4 = (s1.t) obj;
                return java.lang.Math.max(intValue4 + java.lang.Math.max(intValue, java.lang.Math.max(intValue2, tVar4 != null ? ((java.lang.Number) pVar.invoke(tVar4, java.lang.Integer.valueOf(i17))).intValue() : 0)) + intValue3, p2.c.j(l0.h4.f314224a));
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
