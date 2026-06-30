package y1;

/* loaded from: classes14.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final y1.n f458795a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f458796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f458797c;

    /* renamed from: d, reason: collision with root package name */
    public y1.y f458798d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.l f458799e;

    /* renamed from: f, reason: collision with root package name */
    public final int f458800f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.w f458801g;

    public y(y1.n outerSemanticsEntity, boolean z17) {
        kotlin.jvm.internal.o.g(outerSemanticsEntity, "outerSemanticsEntity");
        this.f458795a = outerSemanticsEntity;
        this.f458796b = z17;
        this.f458799e = outerSemanticsEntity.c();
        this.f458800f = ((y1.q) ((y1.o) outerSemanticsEntity.f423655e)).f458786d;
        this.f458801g = outerSemanticsEntity.f423654d.f423554h;
    }

    public static java.util.List b(y1.y yVar, java.util.List list, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = new java.util.ArrayList();
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        yVar.getClass();
        java.util.List k17 = yVar.k(z17, false);
        int size = k17.size();
        for (int i18 = 0; i18 < size; i18++) {
            y1.y yVar2 = (y1.y) k17.get(i18);
            if (yVar2.i()) {
                list.add(yVar2);
            } else if (!yVar2.f458799e.f458768f) {
                b(yVar2, list, false, 2, null);
            }
        }
        return list;
    }

    public final y1.y a(y1.i iVar, yz5.l lVar) {
        y1.y yVar = new y1.y(new y1.n(new u1.w(true).I, new y1.q(this.f458800f + (iVar != null ? 1000000000 : 2000000000), false, false, lVar)), false);
        yVar.f458797c = true;
        yVar.f458798d = this;
        return yVar;
    }

    public final u1.c1 c() {
        boolean z17 = this.f458799e.f458767e;
        y1.n nVar = this.f458795a;
        if (!z17) {
            return nVar.f423654d;
        }
        y1.n c17 = y1.z.c(this.f458801g);
        if (c17 != null) {
            nVar = c17;
        }
        return nVar.f423654d;
    }

    public final d1.g d() {
        return !this.f458801g.x() ? d1.g.f225628e : s1.a0.b(c());
    }

    public final java.util.List e(boolean z17, boolean z18, boolean z19) {
        return (z18 || !this.f458799e.f458768f) ? i() ? b(this, null, z17, 1, null) : k(z17, z19) : kz5.p0.f313996d;
    }

    public final y1.l f() {
        boolean i17 = i();
        y1.l lVar = this.f458799e;
        if (!i17) {
            return lVar;
        }
        lVar.getClass();
        y1.l lVar2 = new y1.l();
        lVar2.f458767e = lVar.f458767e;
        lVar2.f458768f = lVar.f458768f;
        lVar2.f458766d.putAll(lVar.f458766d);
        j(lVar2);
        return lVar2;
    }

    public final y1.y g() {
        y1.y yVar = this.f458798d;
        if (yVar != null) {
            return yVar;
        }
        u1.w wVar = this.f458801g;
        boolean z17 = this.f458796b;
        u1.w a17 = z17 ? y1.z.a(wVar, y1.w.f458793d) : null;
        if (a17 == null) {
            a17 = y1.z.a(wVar, y1.x.f458794d);
        }
        y1.n d17 = a17 != null ? y1.z.d(a17) : null;
        if (d17 == null) {
            return null;
        }
        return new y1.y(d17, z17);
    }

    public final java.util.List h() {
        return e(false, false, true);
    }

    public final boolean i() {
        return this.f458796b && this.f458799e.f458767e;
    }

    public final void j(y1.l lVar) {
        if (this.f458799e.f458768f) {
            return;
        }
        java.util.List k17 = k(false, false);
        int size = k17.size();
        for (int i17 = 0; i17 < size; i17++) {
            y1.y yVar = (y1.y) k17.get(i17);
            if (!yVar.i()) {
                lVar.getClass();
                y1.l child = yVar.f458799e;
                kotlin.jvm.internal.o.g(child, "child");
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) child.f458766d).entrySet()) {
                    y1.o0 o0Var = (y1.o0) entry.getKey();
                    java.lang.Object value = entry.getValue();
                    java.util.Map map = lVar.f458766d;
                    java.lang.Object invoke = o0Var.f458784b.invoke(((java.util.LinkedHashMap) map).get(o0Var), value);
                    if (invoke != null) {
                        map.put(o0Var, invoke);
                    }
                }
                yVar.j(lVar);
            }
        }
    }

    public final java.util.List k(boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        if (this.f458797c) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        u1.w wVar = this.f458801g;
        if (z17) {
            arrayList = new java.util.ArrayList();
            y1.q0.b(wVar, arrayList);
        } else {
            arrayList = new java.util.ArrayList();
            y1.z.b(wVar, arrayList);
        }
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList2.add(new y1.y((y1.n) arrayList.get(i17), this.f458796b));
        }
        if (z18) {
            y1.o0 o0Var = y1.i0.f458734p;
            y1.l lVar = this.f458799e;
            y1.i iVar = (y1.i) y1.m.a(lVar, o0Var);
            if (iVar != null && lVar.f458767e && (!arrayList2.isEmpty())) {
                arrayList2.add(a(iVar, new y1.u(iVar)));
            }
            y1.o0 o0Var2 = y1.i0.f458719a;
            if (lVar.d(o0Var2) && (!arrayList2.isEmpty()) && lVar.f458767e) {
                java.util.List list = (java.util.List) y1.m.a(lVar, o0Var2);
                java.lang.String str = list != null ? (java.lang.String) kz5.n0.Z(list) : null;
                if (str != null) {
                    arrayList2.add(0, a(null, new y1.v(str)));
                }
            }
        }
        return arrayList2;
    }
}
