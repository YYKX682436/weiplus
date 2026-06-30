package r45;

/* loaded from: classes9.dex */
public class ud3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387255d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387256e;

    /* renamed from: f, reason: collision with root package name */
    public int f387257f;

    /* renamed from: g, reason: collision with root package name */
    public int f387258g;

    /* renamed from: h, reason: collision with root package name */
    public r45.au f387259h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f387260i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387261m;

    /* renamed from: n, reason: collision with root package name */
    public int f387262n;

    /* renamed from: o, reason: collision with root package name */
    public int f387263o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ru f387264p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud3)) {
            return false;
        }
        r45.ud3 ud3Var = (r45.ud3) fVar;
        return n51.f.a(this.BaseResponse, ud3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387255d), java.lang.Integer.valueOf(ud3Var.f387255d)) && n51.f.a(this.f387256e, ud3Var.f387256e) && n51.f.a(java.lang.Integer.valueOf(this.f387257f), java.lang.Integer.valueOf(ud3Var.f387257f)) && n51.f.a(java.lang.Integer.valueOf(this.f387258g), java.lang.Integer.valueOf(ud3Var.f387258g)) && n51.f.a(this.f387259h, ud3Var.f387259h) && n51.f.a(this.f387260i, ud3Var.f387260i) && n51.f.a(this.f387261m, ud3Var.f387261m) && n51.f.a(java.lang.Integer.valueOf(this.f387262n), java.lang.Integer.valueOf(ud3Var.f387262n)) && n51.f.a(java.lang.Integer.valueOf(this.f387263o), java.lang.Integer.valueOf(ud3Var.f387263o)) && n51.f.a(this.f387264p, ud3Var.f387264p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387255d);
            java.lang.String str = this.f387256e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f387257f);
            fVar.e(5, this.f387258g);
            r45.au auVar = this.f387259h;
            if (auVar != null) {
                fVar.i(6, auVar.computeSize());
                this.f387259h.writeFields(fVar);
            }
            r45.iu iuVar = this.f387260i;
            if (iuVar != null) {
                fVar.i(7, iuVar.computeSize());
                this.f387260i.writeFields(fVar);
            }
            java.lang.String str2 = this.f387261m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f387262n);
            fVar.e(10, this.f387263o);
            r45.ru ruVar = this.f387264p;
            if (ruVar != null) {
                fVar.i(11, ruVar.computeSize());
                this.f387264p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387255d);
            java.lang.String str3 = this.f387256e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f387257f) + b36.f.e(5, this.f387258g);
            r45.au auVar2 = this.f387259h;
            if (auVar2 != null) {
                e17 += b36.f.i(6, auVar2.computeSize());
            }
            r45.iu iuVar2 = this.f387260i;
            if (iuVar2 != null) {
                e17 += b36.f.i(7, iuVar2.computeSize());
            }
            java.lang.String str4 = this.f387261m;
            if (str4 != null) {
                e17 += b36.f.j(8, str4);
            }
            int e18 = e17 + b36.f.e(9, this.f387262n) + b36.f.e(10, this.f387263o);
            r45.ru ruVar2 = this.f387264p;
            return ruVar2 != null ? e18 + b36.f.i(11, ruVar2.computeSize()) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ud3 ud3Var = (r45.ud3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    ud3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ud3Var.f387255d = aVar2.g(intValue);
                return 0;
            case 3:
                ud3Var.f387256e = aVar2.k(intValue);
                return 0;
            case 4:
                ud3Var.f387257f = aVar2.g(intValue);
                return 0;
            case 5:
                ud3Var.f387258g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.au auVar3 = new r45.au();
                    if (bArr2 != null && bArr2.length > 0) {
                        auVar3.parseFrom(bArr2);
                    }
                    ud3Var.f387259h = auVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr3 != null && bArr3.length > 0) {
                        iuVar3.parseFrom(bArr3);
                    }
                    ud3Var.f387260i = iuVar3;
                }
                return 0;
            case 8:
                ud3Var.f387261m = aVar2.k(intValue);
                return 0;
            case 9:
                ud3Var.f387262n = aVar2.g(intValue);
                return 0;
            case 10:
                ud3Var.f387263o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ru ruVar3 = new r45.ru();
                    if (bArr4 != null && bArr4.length > 0) {
                        ruVar3.parseFrom(bArr4);
                    }
                    ud3Var.f387264p = ruVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
