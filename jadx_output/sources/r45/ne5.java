package r45;

/* loaded from: classes9.dex */
public class ne5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381312d;

    /* renamed from: e, reason: collision with root package name */
    public long f381313e;

    /* renamed from: f, reason: collision with root package name */
    public int f381314f;

    /* renamed from: h, reason: collision with root package name */
    public int f381316h;

    /* renamed from: i, reason: collision with root package name */
    public int f381317i;

    /* renamed from: m, reason: collision with root package name */
    public int f381318m;

    /* renamed from: n, reason: collision with root package name */
    public long f381319n;

    /* renamed from: o, reason: collision with root package name */
    public int f381320o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381321p;

    /* renamed from: q, reason: collision with root package name */
    public int f381322q;

    /* renamed from: r, reason: collision with root package name */
    public int f381323r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381324s;

    /* renamed from: t, reason: collision with root package name */
    public int f381325t;

    /* renamed from: v, reason: collision with root package name */
    public int f381327v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f381328w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381329x;

    /* renamed from: y, reason: collision with root package name */
    public int f381330y;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f381315g = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f381326u = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ne5)) {
            return false;
        }
        r45.ne5 ne5Var = (r45.ne5) fVar;
        return n51.f.a(this.BaseResponse, ne5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381312d), java.lang.Integer.valueOf(ne5Var.f381312d)) && n51.f.a(java.lang.Long.valueOf(this.f381313e), java.lang.Long.valueOf(ne5Var.f381313e)) && n51.f.a(java.lang.Integer.valueOf(this.f381314f), java.lang.Integer.valueOf(ne5Var.f381314f)) && n51.f.a(this.f381315g, ne5Var.f381315g) && n51.f.a(java.lang.Integer.valueOf(this.f381316h), java.lang.Integer.valueOf(ne5Var.f381316h)) && n51.f.a(java.lang.Integer.valueOf(this.f381317i), java.lang.Integer.valueOf(ne5Var.f381317i)) && n51.f.a(java.lang.Integer.valueOf(this.f381318m), java.lang.Integer.valueOf(ne5Var.f381318m)) && n51.f.a(java.lang.Long.valueOf(this.f381319n), java.lang.Long.valueOf(ne5Var.f381319n)) && n51.f.a(java.lang.Integer.valueOf(this.f381320o), java.lang.Integer.valueOf(ne5Var.f381320o)) && n51.f.a(this.f381321p, ne5Var.f381321p) && n51.f.a(java.lang.Integer.valueOf(this.f381322q), java.lang.Integer.valueOf(ne5Var.f381322q)) && n51.f.a(java.lang.Integer.valueOf(this.f381323r), java.lang.Integer.valueOf(ne5Var.f381323r)) && n51.f.a(this.f381324s, ne5Var.f381324s) && n51.f.a(java.lang.Integer.valueOf(this.f381325t), java.lang.Integer.valueOf(ne5Var.f381325t)) && n51.f.a(this.f381326u, ne5Var.f381326u) && n51.f.a(java.lang.Integer.valueOf(this.f381327v), java.lang.Integer.valueOf(ne5Var.f381327v)) && n51.f.a(this.f381328w, ne5Var.f381328w) && n51.f.a(this.f381329x, ne5Var.f381329x) && n51.f.a(java.lang.Integer.valueOf(this.f381330y), java.lang.Integer.valueOf(ne5Var.f381330y));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381326u;
        java.util.LinkedList linkedList2 = this.f381315g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f381312d);
            fVar.h(3, this.f381313e);
            fVar.e(4, this.f381314f);
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f381316h);
            fVar.e(7, this.f381317i);
            fVar.e(8, this.f381318m);
            fVar.h(9, this.f381319n);
            fVar.e(10, this.f381320o);
            com.tencent.mm.protobuf.g gVar = this.f381321p;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            fVar.e(12, this.f381322q);
            fVar.e(13, this.f381323r);
            java.lang.String str = this.f381324s;
            if (str != null) {
                fVar.j(14, str);
            }
            fVar.e(15, this.f381325t);
            fVar.g(16, 8, linkedList);
            fVar.e(17, this.f381327v);
            java.lang.String str2 = this.f381328w;
            if (str2 != null) {
                fVar.j(18, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f381329x;
            if (gVar2 != null) {
                fVar.b(19, gVar2);
            }
            fVar.e(20, this.f381330y);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f381312d) + b36.f.h(3, this.f381313e) + b36.f.e(4, this.f381314f) + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f381316h) + b36.f.e(7, this.f381317i) + b36.f.e(8, this.f381318m) + b36.f.h(9, this.f381319n) + b36.f.e(10, this.f381320o);
            com.tencent.mm.protobuf.g gVar3 = this.f381321p;
            if (gVar3 != null) {
                i18 += b36.f.b(11, gVar3);
            }
            int e17 = i18 + b36.f.e(12, this.f381322q) + b36.f.e(13, this.f381323r);
            java.lang.String str3 = this.f381324s;
            if (str3 != null) {
                e17 += b36.f.j(14, str3);
            }
            int e18 = e17 + b36.f.e(15, this.f381325t) + b36.f.g(16, 8, linkedList) + b36.f.e(17, this.f381327v);
            java.lang.String str4 = this.f381328w;
            if (str4 != null) {
                e18 += b36.f.j(18, str4);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f381329x;
            if (gVar4 != null) {
                e18 += b36.f.b(19, gVar4);
            }
            return e18 + b36.f.e(20, this.f381330y);
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
        r45.ne5 ne5Var = (r45.ne5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    ne5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ne5Var.f381312d = aVar2.g(intValue);
                return 0;
            case 3:
                ne5Var.f381313e = aVar2.i(intValue);
                return 0;
            case 4:
                ne5Var.f381314f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.fe5 fe5Var = new r45.fe5();
                    if (bArr3 != null && bArr3.length > 0) {
                        fe5Var.parseFrom(bArr3);
                    }
                    ne5Var.f381315g.add(fe5Var);
                }
                return 0;
            case 6:
                ne5Var.f381316h = aVar2.g(intValue);
                return 0;
            case 7:
                ne5Var.f381317i = aVar2.g(intValue);
                return 0;
            case 8:
                ne5Var.f381318m = aVar2.g(intValue);
                return 0;
            case 9:
                ne5Var.f381319n = aVar2.i(intValue);
                return 0;
            case 10:
                ne5Var.f381320o = aVar2.g(intValue);
                return 0;
            case 11:
                ne5Var.f381321p = aVar2.d(intValue);
                return 0;
            case 12:
                ne5Var.f381322q = aVar2.g(intValue);
                return 0;
            case 13:
                ne5Var.f381323r = aVar2.g(intValue);
                return 0;
            case 14:
                ne5Var.f381324s = aVar2.k(intValue);
                return 0;
            case 15:
                ne5Var.f381325t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.fe5 fe5Var2 = new r45.fe5();
                    if (bArr4 != null && bArr4.length > 0) {
                        fe5Var2.parseFrom(bArr4);
                    }
                    ne5Var.f381326u.add(fe5Var2);
                }
                return 0;
            case 17:
                ne5Var.f381327v = aVar2.g(intValue);
                return 0;
            case 18:
                ne5Var.f381328w = aVar2.k(intValue);
                return 0;
            case 19:
                ne5Var.f381329x = aVar2.d(intValue);
                return 0;
            case 20:
                ne5Var.f381330y = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
