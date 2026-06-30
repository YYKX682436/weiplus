package r45;

/* loaded from: classes2.dex */
public class i95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376844d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376845e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376846f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376847g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376848h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376849i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376850m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376851n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i95)) {
            return false;
        }
        r45.i95 i95Var = (r45.i95) fVar;
        return n51.f.a(this.f376844d, i95Var.f376844d) && n51.f.a(this.f376845e, i95Var.f376845e) && n51.f.a(this.f376846f, i95Var.f376846f) && n51.f.a(this.f376847g, i95Var.f376847g) && n51.f.a(this.f376848h, i95Var.f376848h) && n51.f.a(this.f376849i, i95Var.f376849i) && n51.f.a(this.f376850m, i95Var.f376850m) && n51.f.a(this.f376851n, i95Var.f376851n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f376844d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f376845e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f376846f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f376847g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f376848h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f376849i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f376850m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f376851n;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f376844d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f376845e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f376846f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f376847g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f376848h;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f376849i;
            if (str14 != null) {
                j17 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f376850m;
            if (str15 != null) {
                j17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f376851n;
            return str16 != null ? j17 + b36.f.j(9, str16) : j17;
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
        r45.i95 i95Var = (r45.i95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i95Var.f376844d = aVar2.k(intValue);
                return 0;
            case 2:
                i95Var.f376845e = aVar2.k(intValue);
                return 0;
            case 3:
                i95Var.f376846f = aVar2.k(intValue);
                return 0;
            case 4:
                i95Var.f376847g = aVar2.k(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                i95Var.f376848h = aVar2.k(intValue);
                return 0;
            case 7:
                i95Var.f376849i = aVar2.k(intValue);
                return 0;
            case 8:
                i95Var.f376850m = aVar2.k(intValue);
                return 0;
            case 9:
                i95Var.f376851n = aVar2.k(intValue);
                return 0;
        }
    }
}
