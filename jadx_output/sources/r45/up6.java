package r45;

/* loaded from: classes9.dex */
public class up6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387553d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387554e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387555f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387556g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387557h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387558i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387559m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.up6)) {
            return false;
        }
        r45.up6 up6Var = (r45.up6) fVar;
        return n51.f.a(this.f387553d, up6Var.f387553d) && n51.f.a(this.f387554e, up6Var.f387554e) && n51.f.a(this.f387555f, up6Var.f387555f) && n51.f.a(this.f387556g, up6Var.f387556g) && n51.f.a(this.f387557h, up6Var.f387557h) && n51.f.a(this.f387558i, up6Var.f387558i) && n51.f.a(this.f387559m, up6Var.f387559m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387553d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387554e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387555f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f387556g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f387557h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f387558i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f387559m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f387553d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f387554e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f387555f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f387556g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f387557h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f387558i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f387559m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.up6 up6Var = (r45.up6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                up6Var.f387553d = aVar2.k(intValue);
                return 0;
            case 2:
                up6Var.f387554e = aVar2.k(intValue);
                return 0;
            case 3:
                up6Var.f387555f = aVar2.k(intValue);
                return 0;
            case 4:
                up6Var.f387556g = aVar2.k(intValue);
                return 0;
            case 5:
                up6Var.f387557h = aVar2.k(intValue);
                return 0;
            case 6:
                up6Var.f387558i = aVar2.k(intValue);
                return 0;
            case 7:
                up6Var.f387559m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
