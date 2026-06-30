package r45;

/* loaded from: classes8.dex */
public class z14 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391597d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391598e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391599f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391600g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f391601h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391602i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391603m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391604n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391605o;

    /* renamed from: p, reason: collision with root package name */
    public int f391606p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z14)) {
            return false;
        }
        r45.z14 z14Var = (r45.z14) fVar;
        return n51.f.a(this.BaseRequest, z14Var.BaseRequest) && n51.f.a(this.f391597d, z14Var.f391597d) && n51.f.a(this.f391598e, z14Var.f391598e) && n51.f.a(this.f391599f, z14Var.f391599f) && n51.f.a(this.f391600g, z14Var.f391600g) && n51.f.a(this.f391601h, z14Var.f391601h) && n51.f.a(this.f391602i, z14Var.f391602i) && n51.f.a(this.f391603m, z14Var.f391603m) && n51.f.a(this.f391604n, z14Var.f391604n) && n51.f.a(this.f391605o, z14Var.f391605o) && n51.f.a(java.lang.Integer.valueOf(this.f391606p), java.lang.Integer.valueOf(z14Var.f391606p));
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
            java.lang.String str = this.f391597d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391598e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f391599f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f391600g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f391601h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f391602i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f391603m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f391604n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            java.lang.String str8 = this.f391605o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(12, this.f391606p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str9 = this.f391597d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f391598e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f391599f;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f391600g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f391601h;
            if (str13 != null) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f391602i;
            if (str14 != null) {
                i18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f391603m;
            if (str15 != null) {
                i18 += b36.f.j(8, str15);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f391604n;
            if (gVar2 != null) {
                i18 += b36.f.b(9, gVar2);
            }
            java.lang.String str16 = this.f391605o;
            if (str16 != null) {
                i18 += b36.f.j(10, str16);
            }
            return i18 + b36.f.e(12, this.f391606p);
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
        r45.z14 z14Var = (r45.z14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    z14Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                z14Var.f391597d = aVar2.k(intValue);
                return 0;
            case 3:
                z14Var.f391598e = aVar2.k(intValue);
                return 0;
            case 4:
                z14Var.f391599f = aVar2.k(intValue);
                return 0;
            case 5:
                z14Var.f391600g = aVar2.k(intValue);
                return 0;
            case 6:
                z14Var.f391601h = aVar2.k(intValue);
                return 0;
            case 7:
                z14Var.f391602i = aVar2.k(intValue);
                return 0;
            case 8:
                z14Var.f391603m = aVar2.k(intValue);
                return 0;
            case 9:
                z14Var.f391604n = aVar2.d(intValue);
                return 0;
            case 10:
                z14Var.f391605o = aVar2.k(intValue);
                return 0;
            case 11:
            default:
                return -1;
            case 12:
                z14Var.f391606p = aVar2.g(intValue);
                return 0;
        }
    }
}
