package r45;

/* loaded from: classes8.dex */
public class nl4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381485d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381486e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381487f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381488g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381489h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381490i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381491m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nl4)) {
            return false;
        }
        r45.nl4 nl4Var = (r45.nl4) fVar;
        return n51.f.a(this.f381485d, nl4Var.f381485d) && n51.f.a(this.f381486e, nl4Var.f381486e) && n51.f.a(this.f381487f, nl4Var.f381487f) && n51.f.a(this.f381488g, nl4Var.f381488g) && n51.f.a(this.f381489h, nl4Var.f381489h) && n51.f.a(this.f381490i, nl4Var.f381490i) && n51.f.a(this.f381491m, nl4Var.f381491m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381485d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381486e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f381487f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f381488g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f381489h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f381490i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f381491m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f381485d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f381486e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f381487f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f381488g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f381489h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f381490i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f381491m;
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
        r45.nl4 nl4Var = (r45.nl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nl4Var.f381485d = aVar2.k(intValue);
                return 0;
            case 2:
                nl4Var.f381486e = aVar2.k(intValue);
                return 0;
            case 3:
                nl4Var.f381487f = aVar2.k(intValue);
                return 0;
            case 4:
                nl4Var.f381488g = aVar2.k(intValue);
                return 0;
            case 5:
                nl4Var.f381489h = aVar2.k(intValue);
                return 0;
            case 6:
                nl4Var.f381490i = aVar2.k(intValue);
                return 0;
            case 7:
                nl4Var.f381491m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
