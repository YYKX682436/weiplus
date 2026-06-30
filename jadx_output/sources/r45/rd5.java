package r45;

/* loaded from: classes7.dex */
public class rd5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384741d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384742e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384743f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384744g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f384745h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384746i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384747m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384748n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f384749o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f384750p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384751q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rd5)) {
            return false;
        }
        r45.rd5 rd5Var = (r45.rd5) fVar;
        return n51.f.a(this.f384741d, rd5Var.f384741d) && n51.f.a(this.f384742e, rd5Var.f384742e) && n51.f.a(this.f384743f, rd5Var.f384743f) && n51.f.a(this.f384744g, rd5Var.f384744g) && n51.f.a(java.lang.Boolean.valueOf(this.f384745h), java.lang.Boolean.valueOf(rd5Var.f384745h)) && n51.f.a(this.f384746i, rd5Var.f384746i) && n51.f.a(this.f384747m, rd5Var.f384747m) && n51.f.a(this.f384748n, rd5Var.f384748n) && n51.f.a(java.lang.Boolean.valueOf(this.f384749o), java.lang.Boolean.valueOf(rd5Var.f384749o)) && n51.f.a(this.f384750p, rd5Var.f384750p) && n51.f.a(this.f384751q, rd5Var.f384751q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384741d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384742e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f384743f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f384744g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.a(5, this.f384745h);
            java.lang.String str5 = this.f384746i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f384747m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f384748n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.a(9, this.f384749o);
            java.lang.String str8 = this.f384750p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f384751q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f384741d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f384742e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f384743f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f384744g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            int a17 = j17 + b36.f.a(5, this.f384745h);
            java.lang.String str14 = this.f384746i;
            if (str14 != null) {
                a17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f384747m;
            if (str15 != null) {
                a17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f384748n;
            if (str16 != null) {
                a17 += b36.f.j(8, str16);
            }
            int a18 = a17 + b36.f.a(9, this.f384749o);
            java.lang.String str17 = this.f384750p;
            if (str17 != null) {
                a18 += b36.f.j(10, str17);
            }
            java.lang.String str18 = this.f384751q;
            return str18 != null ? a18 + b36.f.j(11, str18) : a18;
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
        r45.rd5 rd5Var = (r45.rd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rd5Var.f384741d = aVar2.k(intValue);
                return 0;
            case 2:
                rd5Var.f384742e = aVar2.k(intValue);
                return 0;
            case 3:
                rd5Var.f384743f = aVar2.k(intValue);
                return 0;
            case 4:
                rd5Var.f384744g = aVar2.k(intValue);
                return 0;
            case 5:
                rd5Var.f384745h = aVar2.c(intValue);
                return 0;
            case 6:
                rd5Var.f384746i = aVar2.k(intValue);
                return 0;
            case 7:
                rd5Var.f384747m = aVar2.k(intValue);
                return 0;
            case 8:
                rd5Var.f384748n = aVar2.k(intValue);
                return 0;
            case 9:
                rd5Var.f384749o = aVar2.c(intValue);
                return 0;
            case 10:
                rd5Var.f384750p = aVar2.k(intValue);
                return 0;
            case 11:
                rd5Var.f384751q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
