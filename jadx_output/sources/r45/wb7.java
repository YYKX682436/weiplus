package r45;

/* loaded from: classes7.dex */
public class wb7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f389047d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389048e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389049f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389050g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389051h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389052i;

    /* renamed from: m, reason: collision with root package name */
    public int f389053m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f389054n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389055o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f389056p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wb7)) {
            return false;
        }
        r45.wb7 wb7Var = (r45.wb7) fVar;
        return n51.f.a(this.BaseRequest, wb7Var.BaseRequest) && n51.f.a(this.f389047d, wb7Var.f389047d) && n51.f.a(this.f389048e, wb7Var.f389048e) && n51.f.a(this.f389049f, wb7Var.f389049f) && n51.f.a(this.f389050g, wb7Var.f389050g) && n51.f.a(this.f389051h, wb7Var.f389051h) && n51.f.a(this.f389052i, wb7Var.f389052i) && n51.f.a(java.lang.Integer.valueOf(this.f389053m), java.lang.Integer.valueOf(wb7Var.f389053m)) && n51.f.a(this.f389054n, wb7Var.f389054n) && n51.f.a(this.f389055o, wb7Var.f389055o) && n51.f.a(this.f389056p, wb7Var.f389056p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389047d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f389048e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f389049f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f389050g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f389051h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f389052i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f389053m);
            java.lang.String str6 = this.f389054n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f389055o;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f389056p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str9 = this.f389048e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f389049f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f389050g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f389051h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f389052i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            int e17 = i18 + b36.f.e(8, this.f389053m);
            java.lang.String str14 = this.f389054n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f389055o;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f389056p;
            return str16 != null ? e17 + b36.f.j(11, str16) : e17;
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
        r45.wb7 wb7Var = (r45.wb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    wb7Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vb7 vb7Var = new r45.vb7();
                    if (bArr3 != null && bArr3.length > 0) {
                        vb7Var.parseFrom(bArr3);
                    }
                    wb7Var.f389047d.add(vb7Var);
                }
                return 0;
            case 3:
                wb7Var.f389048e = aVar2.k(intValue);
                return 0;
            case 4:
                wb7Var.f389049f = aVar2.k(intValue);
                return 0;
            case 5:
                wb7Var.f389050g = aVar2.k(intValue);
                return 0;
            case 6:
                wb7Var.f389051h = aVar2.k(intValue);
                return 0;
            case 7:
                wb7Var.f389052i = aVar2.k(intValue);
                return 0;
            case 8:
                wb7Var.f389053m = aVar2.g(intValue);
                return 0;
            case 9:
                wb7Var.f389054n = aVar2.k(intValue);
                return 0;
            case 10:
                wb7Var.f389055o = aVar2.k(intValue);
                return 0;
            case 11:
                wb7Var.f389056p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
