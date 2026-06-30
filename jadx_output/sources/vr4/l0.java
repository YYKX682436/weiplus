package vr4;

/* loaded from: classes9.dex */
public class l0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f439773d;

    /* renamed from: e, reason: collision with root package name */
    public double f439774e;

    /* renamed from: f, reason: collision with root package name */
    public double f439775f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f439776g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f439777h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public double f439778i;

    /* renamed from: m, reason: collision with root package name */
    public double f439779m;

    /* renamed from: n, reason: collision with root package name */
    public int f439780n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f439781o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f439782p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f439783q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.l0)) {
            return false;
        }
        vr4.l0 l0Var = (vr4.l0) fVar;
        return n51.f.a(this.f439773d, l0Var.f439773d) && n51.f.a(java.lang.Double.valueOf(this.f439774e), java.lang.Double.valueOf(l0Var.f439774e)) && n51.f.a(java.lang.Double.valueOf(this.f439775f), java.lang.Double.valueOf(l0Var.f439775f)) && n51.f.a(this.f439776g, l0Var.f439776g) && n51.f.a(this.f439777h, l0Var.f439777h) && n51.f.a(java.lang.Double.valueOf(this.f439778i), java.lang.Double.valueOf(l0Var.f439778i)) && n51.f.a(java.lang.Double.valueOf(this.f439779m), java.lang.Double.valueOf(l0Var.f439779m)) && n51.f.a(java.lang.Integer.valueOf(this.f439780n), java.lang.Integer.valueOf(l0Var.f439780n)) && n51.f.a(this.f439781o, l0Var.f439781o) && n51.f.a(this.f439782p, l0Var.f439782p) && n51.f.a(this.f439783q, l0Var.f439783q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f439777h;
        java.util.LinkedList linkedList2 = this.f439776g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f439773d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.c(2, this.f439774e);
            fVar.c(3, this.f439775f);
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            fVar.c(6, this.f439778i);
            fVar.c(7, this.f439779m);
            fVar.e(8, this.f439780n);
            java.lang.String str2 = this.f439781o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f439782p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            com.tencent.mm.protobuf.g gVar = this.f439783q;
            if (gVar == null) {
                return 0;
            }
            fVar.b(11, gVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f439773d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.c(2, this.f439774e) + b36.f.c(3, this.f439775f) + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList) + b36.f.c(6, this.f439778i) + b36.f.c(7, this.f439779m) + b36.f.e(8, this.f439780n);
            java.lang.String str5 = this.f439781o;
            if (str5 != null) {
                j17 += b36.f.j(9, str5);
            }
            java.lang.String str6 = this.f439782p;
            if (str6 != null) {
                j17 += b36.f.j(10, str6);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f439783q;
            return gVar2 != null ? j17 + b36.f.b(11, gVar2) : j17;
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
        vr4.l0 l0Var = (vr4.l0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l0Var.f439773d = aVar2.k(intValue);
                return 0;
            case 2:
                l0Var.f439774e = aVar2.e(intValue);
                return 0;
            case 3:
                l0Var.f439775f = aVar2.e(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    vr4.j jVar = new vr4.j();
                    if (bArr2 != null && bArr2.length > 0) {
                        jVar.parseFrom(bArr2);
                    }
                    l0Var.f439776g.add(jVar);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    vr4.i1 i1Var = new vr4.i1();
                    if (bArr3 != null && bArr3.length > 0) {
                        i1Var.parseFrom(bArr3);
                    }
                    l0Var.f439777h.add(i1Var);
                }
                return 0;
            case 6:
                l0Var.f439778i = aVar2.e(intValue);
                return 0;
            case 7:
                l0Var.f439779m = aVar2.e(intValue);
                return 0;
            case 8:
                l0Var.f439780n = aVar2.g(intValue);
                return 0;
            case 9:
                l0Var.f439781o = aVar2.k(intValue);
                return 0;
            case 10:
                l0Var.f439782p = aVar2.k(intValue);
                return 0;
            case 11:
                l0Var.f439783q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
