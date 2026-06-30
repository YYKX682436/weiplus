package r45;

/* loaded from: classes15.dex */
public class d5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372118d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372119e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372120f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372121g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372122h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372123i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372124m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d5)) {
            return false;
        }
        r45.d5 d5Var = (r45.d5) fVar;
        return n51.f.a(this.f372118d, d5Var.f372118d) && n51.f.a(this.f372119e, d5Var.f372119e) && n51.f.a(this.f372120f, d5Var.f372120f) && n51.f.a(this.f372121g, d5Var.f372121g) && n51.f.a(this.f372122h, d5Var.f372122h) && n51.f.a(this.f372123i, d5Var.f372123i) && n51.f.a(this.f372124m, d5Var.f372124m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372118d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372119e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372120f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f372121g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f372122h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f372123i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f372124m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f372118d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f372119e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f372120f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f372121g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f372122h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f372123i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f372124m;
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
        r45.d5 d5Var = (r45.d5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d5Var.f372118d = aVar2.k(intValue);
                return 0;
            case 2:
                d5Var.f372119e = aVar2.k(intValue);
                return 0;
            case 3:
                d5Var.f372120f = aVar2.k(intValue);
                return 0;
            case 4:
                d5Var.f372121g = aVar2.k(intValue);
                return 0;
            case 5:
                d5Var.f372122h = aVar2.k(intValue);
                return 0;
            case 6:
                d5Var.f372123i = aVar2.k(intValue);
                return 0;
            case 7:
                d5Var.f372124m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
