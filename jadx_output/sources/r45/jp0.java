package r45;

/* loaded from: classes4.dex */
public class jp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377998d;

    /* renamed from: e, reason: collision with root package name */
    public int f377999e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378000f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378001g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378002h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378003i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378004m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378005n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jp0)) {
            return false;
        }
        r45.jp0 jp0Var = (r45.jp0) fVar;
        return n51.f.a(this.f377998d, jp0Var.f377998d) && n51.f.a(java.lang.Integer.valueOf(this.f377999e), java.lang.Integer.valueOf(jp0Var.f377999e)) && n51.f.a(this.f378000f, jp0Var.f378000f) && n51.f.a(this.f378001g, jp0Var.f378001g) && n51.f.a(this.f378002h, jp0Var.f378002h) && n51.f.a(this.f378003i, jp0Var.f378003i) && n51.f.a(this.f378004m, jp0Var.f378004m) && n51.f.a(this.f378005n, jp0Var.f378005n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377998d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377999e);
            java.lang.String str2 = this.f378000f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378001g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f378002h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f378003i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f378004m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f378005n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f377998d;
            int j17 = (str8 != null ? 0 + b36.f.j(1, str8) : 0) + b36.f.e(2, this.f377999e);
            java.lang.String str9 = this.f378000f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f378001g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f378002h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f378003i;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f378004m;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f378005n;
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
        r45.jp0 jp0Var = (r45.jp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jp0Var.f377998d = aVar2.k(intValue);
                return 0;
            case 2:
                jp0Var.f377999e = aVar2.g(intValue);
                return 0;
            case 3:
                jp0Var.f378000f = aVar2.k(intValue);
                return 0;
            case 4:
                jp0Var.f378001g = aVar2.k(intValue);
                return 0;
            case 5:
                jp0Var.f378002h = aVar2.k(intValue);
                return 0;
            case 6:
                jp0Var.f378003i = aVar2.k(intValue);
                return 0;
            case 7:
                jp0Var.f378004m = aVar2.k(intValue);
                return 0;
            case 8:
                jp0Var.f378005n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
