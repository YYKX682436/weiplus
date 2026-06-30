package d26;

/* loaded from: classes16.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f226052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d26.x xVar) {
        super(0);
        this.f226052d = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        i26.j jVar;
        ?? r57;
        d26.x xVar = this.f226052d;
        if (!xVar.isInline() && !xVar.k0()) {
            return null;
        }
        b26.t tVar = xVar.f226060r;
        k16.g nameResolver = tVar.f17516b;
        d26.q qVar = new d26.q(tVar.f17522h);
        d26.r rVar = new d26.r(xVar);
        i16.o oVar = xVar.f226053h;
        kotlin.jvm.internal.o.g(oVar, "<this>");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        k16.k typeTable = tVar.f17518d;
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        if (oVar.F.size() > 0) {
            java.util.List<java.lang.Integer> list = oVar.F;
            kotlin.jvm.internal.o.f(list, "getMultiFieldValueClassUnderlyingNameList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.lang.Integer num : list) {
                kotlin.jvm.internal.o.d(num);
                arrayList.add(b26.t0.b(nameResolver, num.intValue()));
            }
            jz5.l lVar = new jz5.l(java.lang.Integer.valueOf(oVar.I.size()), java.lang.Integer.valueOf(oVar.H.size()));
            if (kotlin.jvm.internal.o.b(lVar, new jz5.l(java.lang.Integer.valueOf(arrayList.size()), 0))) {
                java.util.List<java.lang.Integer> list2 = oVar.I;
                kotlin.jvm.internal.o.f(list2, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                r57 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (java.lang.Integer num2 : list2) {
                    kotlin.jvm.internal.o.d(num2);
                    r57.add(typeTable.a(num2.intValue()));
                }
            } else {
                if (!kotlin.jvm.internal.o.b(lVar, new jz5.l(0, java.lang.Integer.valueOf(arrayList.size())))) {
                    throw new java.lang.IllegalStateException(("class " + b26.t0.b(nameResolver, oVar.f287643h) + " has illegal multi-field value class representation").toString());
                }
                r57 = oVar.H;
            }
            kotlin.jvm.internal.o.d(r57);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(r57, 10));
            java.util.Iterator it = r57.iterator();
            while (it.hasNext()) {
                arrayList2.add(qVar.invoke(it.next()));
            }
            obj = new o06.w0(kz5.n0.a1(arrayList, arrayList2));
        } else if ((oVar.f287641f & 8) == 8) {
            n16.g b17 = b26.t0.b(nameResolver, oVar.C);
            int i17 = oVar.f287641f;
            i16.l1 a17 = (i17 & 16) == 16 ? oVar.D : (i17 & 32) == 32 ? typeTable.a(oVar.E) : null;
            if ((a17 == null || (jVar = (i26.j) qVar.invoke(a17)) == null) && (jVar = (i26.j) rVar.invoke(b17)) == null) {
                throw new java.lang.IllegalStateException(("cannot determine underlying type for value class " + b26.t0.b(nameResolver, oVar.f287643h) + " with property " + b17).toString());
            }
            obj = new o06.o0(b17, jVar);
        } else {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        if (xVar.f226054i.a(1, 5, 1)) {
            return null;
        }
        o06.p s17 = xVar.s();
        if (s17 == null) {
            throw new java.lang.IllegalStateException(("Inline class has no primary constructor: " + xVar).toString());
        }
        java.util.List W = ((r06.j0) s17).W();
        kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
        n16.g name = ((r06.v) ((o06.l2) kz5.n0.X(W))).getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        f26.z0 v07 = xVar.v0(name);
        if (v07 != null) {
            return new o06.o0(name, v07);
        }
        throw new java.lang.IllegalStateException(("Value class has no underlying property: " + xVar).toString());
    }
}
