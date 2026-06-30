package r45;

/* loaded from: classes4.dex */
public class uf6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387333d;

    /* renamed from: e, reason: collision with root package name */
    public int f387334e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387335f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387336g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387337h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387338i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387339m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387340n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf6)) {
            return false;
        }
        r45.uf6 uf6Var = (r45.uf6) fVar;
        return n51.f.a(this.f387333d, uf6Var.f387333d) && n51.f.a(java.lang.Integer.valueOf(this.f387334e), java.lang.Integer.valueOf(uf6Var.f387334e)) && n51.f.a(this.f387335f, uf6Var.f387335f) && n51.f.a(this.f387336g, uf6Var.f387336g) && n51.f.a(this.f387337h, uf6Var.f387337h) && n51.f.a(this.f387338i, uf6Var.f387338i) && n51.f.a(this.f387339m, uf6Var.f387339m) && n51.f.a(this.f387340n, uf6Var.f387340n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387333d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f387334e);
            java.lang.String str2 = this.f387335f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387336g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f387337h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f387338i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f387339m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f387340n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f387333d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f387334e);
            java.lang.String str9 = this.f387335f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f387336g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f387337h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f387338i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f387339m;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f387340n;
            return str14 != null ? j17 + b36.f.j(8, str14) : j17;
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
        r45.uf6 uf6Var = (r45.uf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uf6Var.f387333d = aVar2.k(intValue);
                return 0;
            case 2:
                uf6Var.f387334e = aVar2.g(intValue);
                return 0;
            case 3:
                uf6Var.f387335f = aVar2.k(intValue);
                return 0;
            case 4:
                uf6Var.f387336g = aVar2.k(intValue);
                return 0;
            case 5:
                uf6Var.f387337h = aVar2.k(intValue);
                return 0;
            case 6:
                uf6Var.f387338i = aVar2.k(intValue);
                return 0;
            case 7:
                uf6Var.f387339m = aVar2.k(intValue);
                return 0;
            case 8:
                uf6Var.f387340n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
