package r45;

/* loaded from: classes2.dex */
public class es4 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373702e;

    /* renamed from: f, reason: collision with root package name */
    public int f373703f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373704g;

    /* renamed from: h, reason: collision with root package name */
    public r45.sq2 f373705h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373706i;

    /* renamed from: o, reason: collision with root package name */
    public r45.l42 f373709o;

    /* renamed from: p, reason: collision with root package name */
    public r45.bx2 f373710p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f373712r;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f373701d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f373707m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f373708n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f373711q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.es4)) {
            return false;
        }
        r45.es4 es4Var = (r45.es4) fVar;
        return n51.f.a(this.BaseResponse, es4Var.BaseResponse) && n51.f.a(this.f373701d, es4Var.f373701d) && n51.f.a(this.f373702e, es4Var.f373702e) && n51.f.a(java.lang.Integer.valueOf(this.f373703f), java.lang.Integer.valueOf(es4Var.f373703f)) && n51.f.a(this.f373704g, es4Var.f373704g) && n51.f.a(this.f373705h, es4Var.f373705h) && n51.f.a(this.f373706i, es4Var.f373706i) && n51.f.a(this.f373707m, es4Var.f373707m) && n51.f.a(this.f373708n, es4Var.f373708n) && n51.f.a(this.f373709o, es4Var.f373709o) && n51.f.a(this.f373710p, es4Var.f373710p) && n51.f.a(this.f373711q, es4Var.f373711q) && n51.f.a(this.f373712r, es4Var.f373712r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373711q;
        java.util.LinkedList linkedList2 = this.f373708n;
        java.util.LinkedList linkedList3 = this.f373707m;
        java.util.LinkedList linkedList4 = this.f373701d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList4);
            com.tencent.mm.protobuf.g gVar = this.f373702e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f373703f);
            com.tencent.mm.protobuf.g gVar2 = this.f373704g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            r45.sq2 sq2Var = this.f373705h;
            if (sq2Var != null) {
                fVar.i(6, sq2Var.computeSize());
                this.f373705h.writeFields(fVar);
            }
            java.lang.String str = this.f373706i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.g(8, 8, linkedList3);
            fVar.g(9, 8, linkedList2);
            r45.l42 l42Var = this.f373709o;
            if (l42Var != null) {
                fVar.i(10, l42Var.computeSize());
                this.f373709o.writeFields(fVar);
            }
            r45.bx2 bx2Var = this.f373710p;
            if (bx2Var != null) {
                fVar.i(11, bx2Var.computeSize());
                this.f373710p.writeFields(fVar);
            }
            fVar.g(12, 7, linkedList);
            java.lang.String str2 = this.f373712r;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(2, 8, linkedList4);
            com.tencent.mm.protobuf.g gVar3 = this.f373702e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f373703f);
            com.tencent.mm.protobuf.g gVar4 = this.f373704g;
            if (gVar4 != null) {
                e17 += b36.f.b(5, gVar4);
            }
            r45.sq2 sq2Var2 = this.f373705h;
            if (sq2Var2 != null) {
                e17 += b36.f.i(6, sq2Var2.computeSize());
            }
            java.lang.String str3 = this.f373706i;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList3) + b36.f.g(9, 8, linkedList2);
            r45.l42 l42Var2 = this.f373709o;
            if (l42Var2 != null) {
                g17 += b36.f.i(10, l42Var2.computeSize());
            }
            r45.bx2 bx2Var2 = this.f373710p;
            if (bx2Var2 != null) {
                g17 += b36.f.i(11, bx2Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(12, 7, linkedList);
            java.lang.String str4 = this.f373712r;
            return str4 != null ? g18 + b36.f.j(100, str4) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
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
        r45.es4 es4Var = (r45.es4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            es4Var.f373712r = aVar2.k(intValue);
            return 0;
        }
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
                    es4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderObject.parseFrom(bArr3);
                    }
                    es4Var.f373701d.add(finderObject);
                }
                return 0;
            case 3:
                es4Var.f373702e = aVar2.d(intValue);
                return 0;
            case 4:
                es4Var.f373703f = aVar2.g(intValue);
                return 0;
            case 5:
                es4Var.f373704g = aVar2.d(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.sq2 sq2Var3 = new r45.sq2();
                    if (bArr4 != null && bArr4.length > 0) {
                        sq2Var3.parseFrom(bArr4);
                    }
                    es4Var.f373705h = sq2Var3;
                }
                return 0;
            case 7:
                es4Var.f373706i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ww2 ww2Var = new r45.ww2();
                    if (bArr5 != null && bArr5.length > 0) {
                        ww2Var.parseFrom(bArr5);
                    }
                    es4Var.f373707m.add(ww2Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.rx2 rx2Var = new r45.rx2();
                    if (bArr6 != null && bArr6.length > 0) {
                        rx2Var.parseFrom(bArr6);
                    }
                    es4Var.f373708n.add(rx2Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.l42 l42Var3 = new r45.l42();
                    if (bArr7 != null && bArr7.length > 0) {
                        l42Var3.parseFrom(bArr7);
                    }
                    es4Var.f373709o = l42Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.bx2 bx2Var3 = new r45.bx2();
                    if (bArr8 != null && bArr8.length > 0) {
                        bx2Var3.parseFrom(bArr8);
                    }
                    es4Var.f373710p = bx2Var3;
                }
                return 0;
            case 12:
                es4Var.f373711q.add(java.lang.Boolean.valueOf(aVar2.c(intValue)));
                return 0;
            default:
                return -1;
        }
    }
}
