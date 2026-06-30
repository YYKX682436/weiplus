package r45;

/* loaded from: classes9.dex */
public class lh5 extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public long f379486f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379487g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379489i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379490m;

    /* renamed from: n, reason: collision with root package name */
    public r45.b16 f379491n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f379492o;

    /* renamed from: p, reason: collision with root package name */
    public r45.q f379493p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f379494q;

    /* renamed from: d, reason: collision with root package name */
    public int f379484d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379485e = "请求不成功，请稍候再试";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f379488h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lh5)) {
            return false;
        }
        r45.lh5 lh5Var = (r45.lh5) fVar;
        return n51.f.a(this.BaseResponse, lh5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379484d), java.lang.Integer.valueOf(lh5Var.f379484d)) && n51.f.a(this.f379485e, lh5Var.f379485e) && n51.f.a(java.lang.Long.valueOf(this.f379486f), java.lang.Long.valueOf(lh5Var.f379486f)) && n51.f.a(this.f379487g, lh5Var.f379487g) && n51.f.a(this.f379488h, lh5Var.f379488h) && n51.f.a(this.f379489i, lh5Var.f379489i) && n51.f.a(this.f379490m, lh5Var.f379490m) && n51.f.a(this.f379491n, lh5Var.f379491n) && n51.f.a(this.f379492o, lh5Var.f379492o) && n51.f.a(this.f379493p, lh5Var.f379493p) && n51.f.a(this.f379494q, lh5Var.f379494q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379488h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f379484d);
            java.lang.String str = this.f379485e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f379486f);
            java.lang.String str2 = this.f379487g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str3 = this.f379489i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f379490m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            r45.b16 b16Var = this.f379491n;
            if (b16Var != null) {
                fVar.i(9, b16Var.computeSize());
                this.f379491n.writeFields(fVar);
            }
            java.lang.String str5 = this.f379492o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            r45.q qVar = this.f379493p;
            if (qVar != null) {
                fVar.i(11, qVar.computeSize());
                this.f379493p.writeFields(fVar);
            }
            r45.tw4 tw4Var = this.f379494q;
            if (tw4Var == null) {
                return 0;
            }
            fVar.i(12, tw4Var.computeSize());
            this.f379494q.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379484d);
            java.lang.String str6 = this.f379485e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int h17 = i18 + b36.f.h(4, this.f379486f);
            java.lang.String str7 = this.f379487g;
            if (str7 != null) {
                h17 += b36.f.j(5, str7);
            }
            int g17 = h17 + b36.f.g(6, 8, linkedList);
            java.lang.String str8 = this.f379489i;
            if (str8 != null) {
                g17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f379490m;
            if (str9 != null) {
                g17 += b36.f.j(8, str9);
            }
            r45.b16 b16Var2 = this.f379491n;
            if (b16Var2 != null) {
                g17 += b36.f.i(9, b16Var2.computeSize());
            }
            java.lang.String str10 = this.f379492o;
            if (str10 != null) {
                g17 += b36.f.j(10, str10);
            }
            r45.q qVar2 = this.f379493p;
            if (qVar2 != null) {
                g17 += b36.f.i(11, qVar2.computeSize());
            }
            r45.tw4 tw4Var2 = this.f379494q;
            return tw4Var2 != null ? g17 + b36.f.i(12, tw4Var2.computeSize()) : g17;
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
        r45.lh5 lh5Var = (r45.lh5) objArr[1];
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
                    lh5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                lh5Var.f379484d = aVar2.g(intValue);
                return 0;
            case 3:
                lh5Var.f379485e = aVar2.k(intValue);
                return 0;
            case 4:
                lh5Var.f379486f = aVar2.i(intValue);
                return 0;
            case 5:
                lh5Var.f379487g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.o oVar = new r45.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar.parseFrom(bArr3);
                    }
                    lh5Var.f379488h.add(oVar);
                }
                return 0;
            case 7:
                lh5Var.f379489i = aVar2.k(intValue);
                return 0;
            case 8:
                lh5Var.f379490m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.b16 b16Var3 = new r45.b16();
                    if (bArr4 != null && bArr4.length > 0) {
                        b16Var3.parseFrom(bArr4);
                    }
                    lh5Var.f379491n = b16Var3;
                }
                return 0;
            case 10:
                lh5Var.f379492o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.q qVar3 = new r45.q();
                    if (bArr5 != null && bArr5.length > 0) {
                        qVar3.parseFrom(bArr5);
                    }
                    lh5Var.f379493p = qVar3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr6 != null && bArr6.length > 0) {
                        tw4Var3.parseFrom(bArr6);
                    }
                    lh5Var.f379494q = tw4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
