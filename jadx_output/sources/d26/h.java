package d26;

/* loaded from: classes16.dex */
public final class h extends d26.l0 {

    /* renamed from: g, reason: collision with root package name */
    public final g26.l f225995g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.x f225996h;

    /* renamed from: i, reason: collision with root package name */
    public final e26.x f225997i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d26.x f225998j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(d26.x r8, g26.l r9) {
        /*
            r7 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.o.g(r9, r0)
            r7.f225998j = r8
            b26.t r2 = r8.f226060r
            i16.o r0 = r8.f226053h
            java.util.List r3 = r0.f287655w
            java.lang.String r1 = "getFunctionList(...)"
            kotlin.jvm.internal.o.f(r3, r1)
            java.util.List r4 = r0.f287656x
            java.lang.String r1 = "getPropertyList(...)"
            kotlin.jvm.internal.o.f(r4, r1)
            java.util.List r5 = r0.f287657y
            java.lang.String r1 = "getTypeAliasList(...)"
            kotlin.jvm.internal.o.f(r5, r1)
            java.util.List r0 = r0.f287649q
            java.lang.String r1 = "getNestedClassNameList(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            b26.t r8 = r8.f226060r
            k16.g r8 = r8.f17516b
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 10
            int r6 = kz5.d0.q(r0, r6)
            r1.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L52
            java.lang.Object r6 = r0.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            n16.g r6 = b26.t0.b(r8, r6)
            r1.add(r6)
            goto L3a
        L52:
            d26.d r6 = new d26.d
            r6.<init>(r1)
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f225995g = r9
            b26.t r8 = r7.f226021b
            b26.q r8 = r8.f17515a
            e26.c0 r8 = r8.f17483a
            d26.e r9 = new d26.e
            r9.<init>(r7)
            e26.u r8 = (e26.u) r8
            e26.x r8 = r8.b(r9)
            r7.f225996h = r8
            b26.t r8 = r7.f226021b
            b26.q r8 = r8.f17515a
            e26.c0 r8 = r8.f17483a
            d26.g r9 = new d26.g
            r9.<init>(r7)
            e26.u r8 = (e26.u) r8
            e26.x r8 = r8.b(r9)
            r7.f225997i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d26.h.<init>(d26.x, g26.l):void");
    }

    @Override // d26.l0, y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        s(name, location);
        return super.b(name, location);
    }

    @Override // d26.l0, y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        s(name, location);
        return super.c(name, location);
    }

    @Override // d26.l0, y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        o06.g gVar;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        s(name, location);
        d26.n nVar = this.f225998j.f226064v;
        return (nVar == null || (gVar = (o06.g) ((e26.q) nVar.f226030b).invoke(name)) == null) ? super.e(name, location) : gVar;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return (java.util.Collection) ((e26.o) this.f225996h).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // d26.l0
    public void h(java.util.Collection result, yz5.l nameFilter) {
        ?? r17;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        d26.n nVar = this.f225998j.f226064v;
        if (nVar != null) {
            java.util.Set<n16.g> keySet = ((java.util.LinkedHashMap) nVar.f226029a).keySet();
            r17 = new java.util.ArrayList();
            for (n16.g name : keySet) {
                kotlin.jvm.internal.o.g(name, "name");
                o06.g gVar = (o06.g) ((e26.q) nVar.f226030b).invoke(name);
                if (gVar != null) {
                    r17.add(gVar);
                }
            }
        } else {
            r17 = 0;
        }
        if (r17 == 0) {
            r17 = kz5.p0.f313996d;
        }
        result.addAll(r17);
    }

    @Override // d26.l0
    public void j(n16.g name, java.util.List functions) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(functions, "functions");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.Collection) ((e26.o) this.f225997i).invoke()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((f26.o0) it.next()).V().b(name, w06.d.f441948f));
        }
        b26.t tVar = this.f226021b;
        functions.addAll(tVar.f17515a.f17496n.d(name, this.f225998j));
        ((g26.v) tVar.f17515a.f17499q).f268017e.h(name, arrayList, new java.util.ArrayList(functions), this.f225998j, new d26.f(functions));
    }

    @Override // d26.l0
    public void k(n16.g name, java.util.List descriptors) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(descriptors, "descriptors");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.Collection) ((e26.o) this.f225997i).invoke()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((f26.o0) it.next()).V().c(name, w06.d.f441948f));
        }
        ((g26.v) this.f226021b.f17515a.f17499q).f268017e.h(name, arrayList, new java.util.ArrayList(descriptors), this.f225998j, new d26.f(descriptors));
    }

    @Override // d26.l0
    public n16.b l(n16.g name) {
        kotlin.jvm.internal.o.g(name, "name");
        return this.f225998j.f226056n.d(name);
    }

    @Override // d26.l0
    public java.util.Set n() {
        java.util.List a17 = this.f225998j.f226062t.a();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            java.util.Set d17 = ((f26.o0) it.next()).V().d();
            if (d17 == null) {
                return null;
            }
            kz5.h0.u(linkedHashSet, d17);
        }
        return linkedHashSet;
    }

    @Override // d26.l0
    public java.util.Set o() {
        d26.x xVar = this.f225998j;
        java.util.List a17 = xVar.f226062t.a();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(linkedHashSet, ((f26.o0) it.next()).V().a());
        }
        linkedHashSet.addAll(this.f226021b.f17515a.f17496n.a(xVar));
        return linkedHashSet;
    }

    @Override // d26.l0
    public java.util.Set p() {
        java.util.List a17 = this.f225998j.f226062t.a();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(linkedHashSet, ((f26.o0) it.next()).V().g());
        }
        return linkedHashSet;
    }

    @Override // d26.l0
    public boolean r(o06.v1 function) {
        kotlin.jvm.internal.o.g(function, "function");
        return this.f226021b.f17515a.f17497o.c(this.f225998j, function);
    }

    public void s(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(this.f226021b.f17515a.f17491i, "<this>");
        d26.x scopeOwner = this.f225998j;
        kotlin.jvm.internal.o.g(scopeOwner, "scopeOwner");
    }
}
