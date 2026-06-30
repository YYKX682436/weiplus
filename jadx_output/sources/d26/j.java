package d26;

/* loaded from: classes16.dex */
public final class j extends f26.b {

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f226012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f226013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d26.x xVar) {
        super(xVar.f226060r.f17515a.f17483a);
        this.f226013d = xVar;
        this.f226012c = ((e26.u) xVar.f226060r.f17515a.f17483a).b(new d26.i(xVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable] */
    @Override // f26.l
    public java.util.Collection c() {
        java.lang.String h17;
        n16.c b17;
        d26.x xVar = this.f226013d;
        i16.o oVar = xVar.f226053h;
        k16.k typeTable = xVar.f226060r.f17518d;
        kotlin.jvm.internal.o.g(oVar, "<this>");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        java.util.List list = oVar.f287646n;
        boolean z17 = !list.isEmpty();
        ?? r37 = list;
        if (!z17) {
            r37 = 0;
        }
        if (r37 == 0) {
            java.util.List<java.lang.Integer> list2 = oVar.f287647o;
            kotlin.jvm.internal.o.f(list2, "getSupertypeIdList(...)");
            r37 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (java.lang.Integer num : list2) {
                kotlin.jvm.internal.o.d(num);
                r37.add(typeTable.a(num.intValue()));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(r37, 10));
        java.util.Iterator it = r37.iterator();
        while (it.hasNext()) {
            arrayList.add(xVar.f226060r.f17522h.g((i16.l1) it.next()));
        }
        java.util.List t07 = kz5.n0.t0(arrayList, xVar.f226060r.f17515a.f17496n.e(xVar));
        java.util.ArrayList<o06.z0> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = t07.iterator();
        while (it6.hasNext()) {
            o06.j i17 = ((f26.o0) it6.next()).w0().i();
            o06.z0 z0Var = i17 instanceof o06.z0 ? (o06.z0) i17 : null;
            if (z0Var != null) {
                arrayList2.add(z0Var);
            }
        }
        if (!arrayList2.isEmpty()) {
            b26.c0 c0Var = xVar.f226060r.f17515a.f17490h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (o06.z0 z0Var2 : arrayList2) {
                n16.b f17 = v16.f.f(z0Var2);
                if (f17 == null || (b17 = f17.b()) == null || (h17 = b17.b()) == null) {
                    h17 = z0Var2.getName().h();
                }
                arrayList3.add(h17);
            }
            c0Var.b(xVar, arrayList3);
        }
        return kz5.n0.S0(t07);
    }

    @Override // f26.l
    public o06.c2 e() {
        return o06.b2.f341928a;
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        return (java.util.List) ((e26.o) this.f226012c).invoke();
    }

    @Override // f26.b, f26.c2
    public o06.j i() {
        return this.f226013d;
    }

    @Override // f26.c2
    public boolean j() {
        return true;
    }

    @Override // f26.b
    /* renamed from: l */
    public o06.g i() {
        return this.f226013d;
    }

    public java.lang.String toString() {
        java.lang.String str = this.f226013d.getName().f334169d;
        kotlin.jvm.internal.o.f(str, "toString(...)");
        return str;
    }
}
