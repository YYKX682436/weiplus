package r45;

/* loaded from: classes7.dex */
public class ug4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.pg4 f387347d;

    /* renamed from: e, reason: collision with root package name */
    public int f387348e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387349f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f387350g;

    /* renamed from: h, reason: collision with root package name */
    public long f387351h;

    /* renamed from: i, reason: collision with root package name */
    public long f387352i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387353m;

    /* renamed from: n, reason: collision with root package name */
    public int f387354n;

    /* renamed from: o, reason: collision with root package name */
    public float f387355o;

    /* renamed from: p, reason: collision with root package name */
    public float f387356p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f387357q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f387358r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public int f387359s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f387360t;

    /* renamed from: u, reason: collision with root package name */
    public int f387361u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f387362v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ug4)) {
            return false;
        }
        r45.ug4 ug4Var = (r45.ug4) fVar;
        return n51.f.a(this.f387347d, ug4Var.f387347d) && n51.f.a(java.lang.Integer.valueOf(this.f387348e), java.lang.Integer.valueOf(ug4Var.f387348e)) && n51.f.a(this.f387349f, ug4Var.f387349f) && n51.f.a(java.lang.Boolean.valueOf(this.f387350g), java.lang.Boolean.valueOf(ug4Var.f387350g)) && n51.f.a(java.lang.Long.valueOf(this.f387351h), java.lang.Long.valueOf(ug4Var.f387351h)) && n51.f.a(java.lang.Long.valueOf(this.f387352i), java.lang.Long.valueOf(ug4Var.f387352i)) && n51.f.a(this.f387353m, ug4Var.f387353m) && n51.f.a(java.lang.Integer.valueOf(this.f387354n), java.lang.Integer.valueOf(ug4Var.f387354n)) && n51.f.a(java.lang.Float.valueOf(this.f387355o), java.lang.Float.valueOf(ug4Var.f387355o)) && n51.f.a(java.lang.Float.valueOf(this.f387356p), java.lang.Float.valueOf(ug4Var.f387356p)) && n51.f.a(this.f387357q, ug4Var.f387357q) && n51.f.a(this.f387358r, ug4Var.f387358r) && n51.f.a(java.lang.Integer.valueOf(this.f387359s), java.lang.Integer.valueOf(ug4Var.f387359s)) && n51.f.a(this.f387360t, ug4Var.f387360t) && n51.f.a(java.lang.Integer.valueOf(this.f387361u), java.lang.Integer.valueOf(ug4Var.f387361u)) && n51.f.a(this.f387362v, ug4Var.f387362v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387358r;
        java.util.LinkedList linkedList2 = this.f387357q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.pg4 pg4Var = this.f387347d;
            if (pg4Var != null) {
                fVar.i(1, pg4Var.computeSize());
                this.f387347d.writeFields(fVar);
            }
            fVar.e(2, this.f387348e);
            java.lang.String str = this.f387349f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(7, this.f387350g);
            fVar.h(4, this.f387351h);
            fVar.h(5, this.f387352i);
            java.lang.String str2 = this.f387353m;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(101, this.f387354n);
            fVar.d(102, this.f387355o);
            fVar.d(103, this.f387356p);
            fVar.g(105, 1, linkedList2);
            fVar.g(111, 8, linkedList);
            fVar.e(112, this.f387359s);
            java.lang.String str3 = this.f387360t;
            if (str3 != null) {
                fVar.j(115, str3);
            }
            fVar.e(116, this.f387361u);
            java.lang.String str4 = this.f387362v;
            if (str4 != null) {
                fVar.j(201, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.pg4 pg4Var2 = this.f387347d;
            int i18 = (pg4Var2 != null ? b36.f.i(1, pg4Var2.computeSize()) + 0 : 0) + b36.f.e(2, this.f387348e);
            java.lang.String str5 = this.f387349f;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int a17 = i18 + b36.f.a(7, this.f387350g) + b36.f.h(4, this.f387351h) + b36.f.h(5, this.f387352i);
            java.lang.String str6 = this.f387353m;
            if (str6 != null) {
                a17 += b36.f.j(6, str6);
            }
            int e17 = a17 + b36.f.e(101, this.f387354n) + b36.f.d(102, this.f387355o) + b36.f.d(103, this.f387356p) + b36.f.g(105, 1, linkedList2) + b36.f.g(111, 8, linkedList) + b36.f.e(112, this.f387359s);
            java.lang.String str7 = this.f387360t;
            if (str7 != null) {
                e17 += b36.f.j(115, str7);
            }
            int e18 = e17 + b36.f.e(116, this.f387361u);
            java.lang.String str8 = this.f387362v;
            return str8 != null ? e18 + b36.f.j(201, str8) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.ug4 ug4Var = (r45.ug4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 105) {
            ug4Var.f387357q.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 201) {
            ug4Var.f387362v = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 111) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.uw3 uw3Var = new r45.uw3();
                if (bArr2 != null && bArr2.length > 0) {
                    uw3Var.parseFrom(bArr2);
                }
                ug4Var.f387358r.add(uw3Var);
            }
            return 0;
        }
        if (intValue == 112) {
            ug4Var.f387359s = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 115) {
            ug4Var.f387360t = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 116) {
            ug4Var.f387361u = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.pg4 pg4Var3 = new r45.pg4();
                    if (bArr3 != null && bArr3.length > 0) {
                        pg4Var3.parseFrom(bArr3);
                    }
                    ug4Var.f387347d = pg4Var3;
                }
                return 0;
            case 2:
                ug4Var.f387348e = aVar2.g(intValue);
                return 0;
            case 3:
                ug4Var.f387349f = aVar2.k(intValue);
                return 0;
            case 4:
                ug4Var.f387351h = aVar2.i(intValue);
                return 0;
            case 5:
                ug4Var.f387352i = aVar2.i(intValue);
                return 0;
            case 6:
                ug4Var.f387353m = aVar2.k(intValue);
                return 0;
            case 7:
                ug4Var.f387350g = aVar2.c(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 101:
                        ug4Var.f387354n = aVar2.g(intValue);
                        return 0;
                    case 102:
                        ug4Var.f387355o = aVar2.f(intValue);
                        return 0;
                    case 103:
                        ug4Var.f387356p = aVar2.f(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
