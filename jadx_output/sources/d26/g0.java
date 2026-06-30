package d26;

/* loaded from: classes16.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.i0 f225994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(d26.i0 i0Var) {
        super(1);
        this.f225994d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        b26.t tVar;
        i16.l1 a17;
        i16.l1 a18;
        n16.g it = (n16.g) obj;
        kotlin.jvm.internal.o.g(it, "it");
        d26.i0 i0Var = this.f225994d;
        byte[] bArr = (byte[]) ((java.util.LinkedHashMap) i0Var.f226005c).get(it);
        if (bArr != null) {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            d26.l0 l0Var = i0Var.f226011i;
            i16.o1 o1Var = (i16.o1) ((p16.d) i16.o1.f287671v).c(byteArrayInputStream, l0Var.f226021b.f17515a.f17498p);
            if (o1Var != null) {
                b26.s0 s0Var = l0Var.f226021b.f17523i;
                s0Var.getClass();
                java.util.List list = o1Var.f287681q;
                kotlin.jvm.internal.o.f(list, "getAnnotationList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    boolean hasNext = it6.hasNext();
                    tVar = s0Var.f17513a;
                    if (!hasNext) {
                        break;
                    }
                    i16.k kVar = (i16.k) it6.next();
                    kotlin.jvm.internal.o.d(kVar);
                    arrayList.add(s0Var.f17514b.a(kVar, tVar.f17516b));
                }
                d26.p0 p0Var = new d26.p0(tVar.f17515a.f17483a, tVar.f17517c, arrayList.isEmpty() ? p06.i.f350765a : new p06.l(arrayList), b26.t0.b(tVar.f17516b, o1Var.f287675h), b26.b1.a(b26.z0.f17549a, (i16.h2) k16.f.f303436d.c(o1Var.f287674g)), o1Var, tVar.f17516b, tVar.f17518d, tVar.f17519e, tVar.f17521g);
                b26.t tVar2 = s0Var.f17513a;
                java.util.List list2 = o1Var.f287676i;
                kotlin.jvm.internal.o.f(list2, "getTypeParameterList(...)");
                b26.j1 j1Var = b26.t.b(tVar2, p0Var, list2, null, null, null, null, 60, null).f17522h;
                java.util.List b17 = j1Var.b();
                k16.k typeTable = tVar.f17518d;
                kotlin.jvm.internal.o.g(typeTable, "typeTable");
                int i17 = o1Var.f287673f;
                if ((i17 & 4) == 4) {
                    a17 = o1Var.f287677m;
                    kotlin.jvm.internal.o.f(a17, "getUnderlyingType(...)");
                } else {
                    if (!((i17 & 8) == 8)) {
                        throw new java.lang.IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
                    }
                    a17 = typeTable.a(o1Var.f287678n);
                }
                f26.z0 d17 = j1Var.d(a17, false);
                int i18 = o1Var.f287673f;
                if ((i18 & 16) == 16) {
                    a18 = o1Var.f287679o;
                    kotlin.jvm.internal.o.f(a18, "getExpandedType(...)");
                } else {
                    if (!((i18 & 32) == 32)) {
                        throw new java.lang.IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
                    }
                    a18 = typeTable.a(o1Var.f287680p);
                }
                p0Var.w0(b17, d17, j1Var.d(a18, false));
                return p0Var;
            }
        }
        return null;
    }
}
