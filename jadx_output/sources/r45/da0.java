package r45;

/* loaded from: classes8.dex */
public class da0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372262e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372263f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d64 f372264g;

    /* renamed from: h, reason: collision with root package name */
    public int f372265h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f372266i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372267m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372268n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.da0)) {
            return false;
        }
        r45.da0 da0Var = (r45.da0) fVar;
        return n51.f.a(this.BaseRequest, da0Var.BaseRequest) && n51.f.a(this.f372261d, da0Var.f372261d) && n51.f.a(this.f372262e, da0Var.f372262e) && n51.f.a(this.f372263f, da0Var.f372263f) && n51.f.a(this.f372264g, da0Var.f372264g) && n51.f.a(java.lang.Integer.valueOf(this.f372265h), java.lang.Integer.valueOf(da0Var.f372265h)) && n51.f.a(this.f372266i, da0Var.f372266i) && n51.f.a(this.f372267m, da0Var.f372267m) && n51.f.a(this.f372268n, da0Var.f372268n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f372261d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f372262e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f372263f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.d64 d64Var = this.f372264g;
            if (d64Var != null) {
                fVar.i(5, d64Var.computeSize());
                this.f372264g.writeFields(fVar);
            }
            fVar.e(6, this.f372265h);
            fVar.g(7, 8, this.f372266i);
            java.lang.String str4 = this.f372267m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f372268n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f372261d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f372262e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f372263f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            r45.d64 d64Var2 = this.f372264g;
            if (d64Var2 != null) {
                i18 += b36.f.i(5, d64Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f372265h) + b36.f.g(7, 8, this.f372266i);
            java.lang.String str9 = this.f372267m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f372268n;
            return str10 != null ? e17 + b36.f.j(9, str10) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f372266i.clear();
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
        r45.da0 da0Var = (r45.da0) objArr[1];
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
                    da0Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                da0Var.f372261d = aVar2.k(intValue);
                return 0;
            case 3:
                da0Var.f372262e = aVar2.k(intValue);
                return 0;
            case 4:
                da0Var.f372263f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.d64 d64Var3 = new r45.d64();
                    if (bArr3 != null && bArr3.length > 0) {
                        d64Var3.parseFrom(bArr3);
                    }
                    da0Var.f372264g = d64Var3;
                }
                return 0;
            case 6:
                da0Var.f372265h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    da0Var.f372266i.add(du5Var);
                }
                return 0;
            case 8:
                da0Var.f372267m = aVar2.k(intValue);
                return 0;
            case 9:
                da0Var.f372268n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
