package r45;

/* loaded from: classes9.dex */
public class ok3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382319d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382320e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f382321f;

    /* renamed from: g, reason: collision with root package name */
    public int f382322g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f382323h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382324i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382325m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382326n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382327o;

    /* renamed from: p, reason: collision with root package name */
    public int f382328p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f382329q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ok3)) {
            return false;
        }
        r45.ok3 ok3Var = (r45.ok3) fVar;
        return n51.f.a(this.BaseResponse, ok3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382319d), java.lang.Integer.valueOf(ok3Var.f382319d)) && n51.f.a(this.f382320e, ok3Var.f382320e) && n51.f.a(java.lang.Integer.valueOf(this.f382321f), java.lang.Integer.valueOf(ok3Var.f382321f)) && n51.f.a(java.lang.Integer.valueOf(this.f382322g), java.lang.Integer.valueOf(ok3Var.f382322g)) && n51.f.a(this.f382323h, ok3Var.f382323h) && n51.f.a(this.f382324i, ok3Var.f382324i) && n51.f.a(this.f382325m, ok3Var.f382325m) && n51.f.a(this.f382326n, ok3Var.f382326n) && n51.f.a(this.f382327o, ok3Var.f382327o) && n51.f.a(java.lang.Integer.valueOf(this.f382328p), java.lang.Integer.valueOf(ok3Var.f382328p)) && n51.f.a(this.f382329q, ok3Var.f382329q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382320e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f382319d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f382321f);
            fVar.e(5, this.f382322g);
            r45.cu5 cu5Var = this.f382323h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f382323h.writeFields(fVar);
            }
            java.lang.String str = this.f382324i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f382325m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f382326n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f382327o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f382328p);
            java.lang.String str5 = this.f382329q;
            if (str5 == null) {
                return 0;
            }
            fVar.j(12, str5);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382319d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f382321f) + b36.f.e(5, this.f382322g);
            r45.cu5 cu5Var2 = this.f382323h;
            if (cu5Var2 != null) {
                i18 += b36.f.i(6, cu5Var2.computeSize());
            }
            java.lang.String str6 = this.f382324i;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f382325m;
            if (str7 != null) {
                i18 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f382326n;
            if (str8 != null) {
                i18 += b36.f.j(9, str8);
            }
            java.lang.String str9 = this.f382327o;
            if (str9 != null) {
                i18 += b36.f.j(10, str9);
            }
            int e17 = i18 + b36.f.e(11, this.f382328p);
            java.lang.String str10 = this.f382329q;
            return str10 != null ? e17 + b36.f.j(12, str10) : e17;
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
        r45.ok3 ok3Var = (r45.ok3) objArr[1];
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
                    ok3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ok3Var.f382319d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.d35 d35Var = new r45.d35();
                    if (bArr3 != null && bArr3.length > 0) {
                        d35Var.parseFrom(bArr3);
                    }
                    ok3Var.f382320e.add(d35Var);
                }
                return 0;
            case 4:
                ok3Var.f382321f = aVar2.g(intValue);
                return 0;
            case 5:
                ok3Var.f382322g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    ok3Var.f382323h = cu5Var3;
                }
                return 0;
            case 7:
                ok3Var.f382324i = aVar2.k(intValue);
                return 0;
            case 8:
                ok3Var.f382325m = aVar2.k(intValue);
                return 0;
            case 9:
                ok3Var.f382326n = aVar2.k(intValue);
                return 0;
            case 10:
                ok3Var.f382327o = aVar2.k(intValue);
                return 0;
            case 11:
                ok3Var.f382328p = aVar2.g(intValue);
                return 0;
            case 12:
                ok3Var.f382329q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
