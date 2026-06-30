package r45;

/* loaded from: classes9.dex */
public class aj extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370029d;

    /* renamed from: e, reason: collision with root package name */
    public int f370030e;

    /* renamed from: f, reason: collision with root package name */
    public int f370031f;

    /* renamed from: g, reason: collision with root package name */
    public long f370032g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.GoodsObject f370033h;

    /* renamed from: i, reason: collision with root package name */
    public int f370034i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cj f370035m;

    /* renamed from: n, reason: collision with root package name */
    public r45.vi f370036n;

    /* renamed from: o, reason: collision with root package name */
    public long f370037o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f370038p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f370039q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370040r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f370041s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f370042t;

    /* renamed from: u, reason: collision with root package name */
    public int f370043u;

    /* renamed from: v, reason: collision with root package name */
    public int f370044v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f370045w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f370046x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aj)) {
            return false;
        }
        r45.aj ajVar = (r45.aj) fVar;
        return n51.f.a(this.BaseRequest, ajVar.BaseRequest) && n51.f.a(this.f370029d, ajVar.f370029d) && n51.f.a(java.lang.Integer.valueOf(this.f370030e), java.lang.Integer.valueOf(ajVar.f370030e)) && n51.f.a(java.lang.Integer.valueOf(this.f370031f), java.lang.Integer.valueOf(ajVar.f370031f)) && n51.f.a(java.lang.Long.valueOf(this.f370032g), java.lang.Long.valueOf(ajVar.f370032g)) && n51.f.a(this.f370033h, ajVar.f370033h) && n51.f.a(java.lang.Integer.valueOf(this.f370034i), java.lang.Integer.valueOf(ajVar.f370034i)) && n51.f.a(this.f370035m, ajVar.f370035m) && n51.f.a(this.f370036n, ajVar.f370036n) && n51.f.a(java.lang.Long.valueOf(this.f370037o), java.lang.Long.valueOf(ajVar.f370037o)) && n51.f.a(this.f370038p, ajVar.f370038p) && n51.f.a(this.f370039q, ajVar.f370039q) && n51.f.a(this.f370040r, ajVar.f370040r) && n51.f.a(this.f370041s, ajVar.f370041s) && n51.f.a(this.f370042t, ajVar.f370042t) && n51.f.a(java.lang.Integer.valueOf(this.f370043u), java.lang.Integer.valueOf(ajVar.f370043u)) && n51.f.a(java.lang.Integer.valueOf(this.f370044v), java.lang.Integer.valueOf(ajVar.f370044v)) && n51.f.a(this.f370045w, ajVar.f370045w) && n51.f.a(this.f370046x, ajVar.f370046x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370045w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f370029d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(11, this.f370030e);
            fVar.e(12, this.f370031f);
            fVar.h(18, this.f370032g);
            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject = this.f370033h;
            if (goodsObject != null) {
                fVar.i(21, goodsObject.computeSize());
                this.f370033h.writeFields(fVar);
            }
            fVar.e(22, this.f370034i);
            r45.cj cjVar = this.f370035m;
            if (cjVar != null) {
                fVar.i(23, cjVar.computeSize());
                this.f370035m.writeFields(fVar);
            }
            r45.vi viVar = this.f370036n;
            if (viVar != null) {
                fVar.i(26, viVar.computeSize());
                this.f370036n.writeFields(fVar);
            }
            fVar.h(27, this.f370037o);
            java.lang.String str = this.f370038p;
            if (str != null) {
                fVar.j(28, str);
            }
            java.lang.String str2 = this.f370039q;
            if (str2 != null) {
                fVar.j(29, str2);
            }
            java.lang.String str3 = this.f370040r;
            if (str3 != null) {
                fVar.j(30, str3);
            }
            java.lang.String str4 = this.f370041s;
            if (str4 != null) {
                fVar.j(31, str4);
            }
            java.lang.String str5 = this.f370042t;
            if (str5 != null) {
                fVar.j(32, str5);
            }
            fVar.e(33, this.f370043u);
            fVar.e(34, this.f370044v);
            fVar.g(35, 8, linkedList);
            java.lang.String str6 = this.f370046x;
            if (str6 != null) {
                fVar.j(37, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f370029d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            int e17 = i18 + b36.f.e(11, this.f370030e) + b36.f.e(12, this.f370031f) + b36.f.h(18, this.f370032g);
            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject2 = this.f370033h;
            if (goodsObject2 != null) {
                e17 += b36.f.i(21, goodsObject2.computeSize());
            }
            int e18 = e17 + b36.f.e(22, this.f370034i);
            r45.cj cjVar2 = this.f370035m;
            if (cjVar2 != null) {
                e18 += b36.f.i(23, cjVar2.computeSize());
            }
            r45.vi viVar2 = this.f370036n;
            if (viVar2 != null) {
                e18 += b36.f.i(26, viVar2.computeSize());
            }
            int h17 = e18 + b36.f.h(27, this.f370037o);
            java.lang.String str7 = this.f370038p;
            if (str7 != null) {
                h17 += b36.f.j(28, str7);
            }
            java.lang.String str8 = this.f370039q;
            if (str8 != null) {
                h17 += b36.f.j(29, str8);
            }
            java.lang.String str9 = this.f370040r;
            if (str9 != null) {
                h17 += b36.f.j(30, str9);
            }
            java.lang.String str10 = this.f370041s;
            if (str10 != null) {
                h17 += b36.f.j(31, str10);
            }
            java.lang.String str11 = this.f370042t;
            if (str11 != null) {
                h17 += b36.f.j(32, str11);
            }
            int e19 = h17 + b36.f.e(33, this.f370043u) + b36.f.e(34, this.f370044v) + b36.f.g(35, 8, linkedList);
            java.lang.String str12 = this.f370046x;
            return str12 != null ? e19 + b36.f.j(37, str12) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.aj ajVar = (r45.aj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                ajVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ajVar.f370029d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 11) {
            ajVar.f370030e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 12) {
            ajVar.f370031f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 18) {
            ajVar.f370032g = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 37) {
            ajVar.f370046x = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 21:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.GoodsObject goodsObject3 = new com.tencent.mm.protocal.protobuf.GoodsObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        goodsObject3.parseFrom(bArr3);
                    }
                    ajVar.f370033h = goodsObject3;
                }
                return 0;
            case 22:
                ajVar.f370034i = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cj cjVar3 = new r45.cj();
                    if (bArr4 != null && bArr4.length > 0) {
                        cjVar3.parseFrom(bArr4);
                    }
                    ajVar.f370035m = cjVar3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 26:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr5 = (byte[]) j27.get(i29);
                            r45.vi viVar3 = new r45.vi();
                            if (bArr5 != null && bArr5.length > 0) {
                                viVar3.parseFrom(bArr5);
                            }
                            ajVar.f370036n = viVar3;
                        }
                        return 0;
                    case 27:
                        ajVar.f370037o = aVar2.i(intValue);
                        return 0;
                    case 28:
                        ajVar.f370038p = aVar2.k(intValue);
                        return 0;
                    case 29:
                        ajVar.f370039q = aVar2.k(intValue);
                        return 0;
                    case 30:
                        ajVar.f370040r = aVar2.k(intValue);
                        return 0;
                    case 31:
                        ajVar.f370041s = aVar2.k(intValue);
                        return 0;
                    case 32:
                        ajVar.f370042t = aVar2.k(intValue);
                        return 0;
                    case 33:
                        ajVar.f370043u = aVar2.g(intValue);
                        return 0;
                    case 34:
                        ajVar.f370044v = aVar2.g(intValue);
                        return 0;
                    case 35:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr6 = (byte[]) j28.get(i37);
                            r45.si siVar = new r45.si();
                            if (bArr6 != null && bArr6.length > 0) {
                                siVar.parseFrom(bArr6);
                            }
                            ajVar.f370045w.add(siVar);
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
