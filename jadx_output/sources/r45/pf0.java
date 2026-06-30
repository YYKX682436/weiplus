package r45;

/* loaded from: classes8.dex */
public class pf0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382993d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382994e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382995f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382996g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382997h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382998i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382999m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383000n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383001o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pf0)) {
            return false;
        }
        r45.pf0 pf0Var = (r45.pf0) fVar;
        return n51.f.a(this.f382993d, pf0Var.f382993d) && n51.f.a(this.f382994e, pf0Var.f382994e) && n51.f.a(this.f382995f, pf0Var.f382995f) && n51.f.a(this.f382996g, pf0Var.f382996g) && n51.f.a(this.f382997h, pf0Var.f382997h) && n51.f.a(this.f382998i, pf0Var.f382998i) && n51.f.a(this.f382999m, pf0Var.f382999m) && n51.f.a(this.f383000n, pf0Var.f383000n) && n51.f.a(this.f383001o, pf0Var.f383001o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382993d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382994e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382995f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382996g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f382997h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f382998i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f382999m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            java.lang.String str8 = this.f383000n;
            if (str8 != null) {
                fVar.j(8, str8);
            }
            java.lang.String str9 = this.f383001o;
            if (str9 != null) {
                fVar.j(9, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f382993d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f382994e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f382995f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f382996g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f382997h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f382998i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f382999m;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f383000n;
            if (str17 != null) {
                j17 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f383001o;
            return str18 != null ? j17 + b36.f.j(9, str18) : j17;
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
        r45.pf0 pf0Var = (r45.pf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pf0Var.f382993d = aVar2.k(intValue);
                return 0;
            case 2:
                pf0Var.f382994e = aVar2.k(intValue);
                return 0;
            case 3:
                pf0Var.f382995f = aVar2.k(intValue);
                return 0;
            case 4:
                pf0Var.f382996g = aVar2.k(intValue);
                return 0;
            case 5:
                pf0Var.f382997h = aVar2.k(intValue);
                return 0;
            case 6:
                pf0Var.f382998i = aVar2.k(intValue);
                return 0;
            case 7:
                pf0Var.f382999m = aVar2.k(intValue);
                return 0;
            case 8:
                pf0Var.f383000n = aVar2.k(intValue);
                return 0;
            case 9:
                pf0Var.f383001o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
