package vr4;

/* loaded from: classes9.dex */
public class b1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f439690d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f439691e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f439692f;

    /* renamed from: g, reason: collision with root package name */
    public int f439693g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f439694h;

    /* renamed from: i, reason: collision with root package name */
    public int f439695i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f439696m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f439697n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f439698o = "0";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f439699p = "0";

    /* renamed from: q, reason: collision with root package name */
    public int f439700q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f439701r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f439702s;

    /* renamed from: t, reason: collision with root package name */
    public int f439703t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f439704u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.b1)) {
            return false;
        }
        vr4.b1 b1Var = (vr4.b1) fVar;
        return n51.f.a(this.f439690d, b1Var.f439690d) && n51.f.a(this.f439691e, b1Var.f439691e) && n51.f.a(this.f439692f, b1Var.f439692f) && n51.f.a(java.lang.Integer.valueOf(this.f439693g), java.lang.Integer.valueOf(b1Var.f439693g)) && n51.f.a(this.f439694h, b1Var.f439694h) && n51.f.a(java.lang.Integer.valueOf(this.f439695i), java.lang.Integer.valueOf(b1Var.f439695i)) && n51.f.a(this.f439696m, b1Var.f439696m) && n51.f.a(this.f439697n, b1Var.f439697n) && n51.f.a(this.f439698o, b1Var.f439698o) && n51.f.a(this.f439699p, b1Var.f439699p) && n51.f.a(java.lang.Integer.valueOf(this.f439700q), java.lang.Integer.valueOf(b1Var.f439700q)) && n51.f.a(this.f439701r, b1Var.f439701r) && n51.f.a(this.f439702s, b1Var.f439702s) && n51.f.a(java.lang.Integer.valueOf(this.f439703t), java.lang.Integer.valueOf(b1Var.f439703t)) && n51.f.a(this.f439704u, b1Var.f439704u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f439690d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f439691e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f439692f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f439693g);
            java.lang.String str4 = this.f439694h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f439695i);
            java.lang.String str5 = this.f439696m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f439697n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f439698o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f439699p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f439700q);
            java.lang.String str9 = this.f439701r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f439702s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            fVar.e(14, this.f439703t);
            java.lang.String str11 = this.f439704u;
            if (str11 != null) {
                fVar.j(15, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f439690d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f439691e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f439692f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            int e17 = j17 + b36.f.e(4, this.f439693g);
            java.lang.String str15 = this.f439694h;
            if (str15 != null) {
                e17 += b36.f.j(5, str15);
            }
            int e18 = e17 + b36.f.e(6, this.f439695i);
            java.lang.String str16 = this.f439696m;
            if (str16 != null) {
                e18 += b36.f.j(7, str16);
            }
            java.lang.String str17 = this.f439697n;
            if (str17 != null) {
                e18 += b36.f.j(8, str17);
            }
            java.lang.String str18 = this.f439698o;
            if (str18 != null) {
                e18 += b36.f.j(9, str18);
            }
            java.lang.String str19 = this.f439699p;
            if (str19 != null) {
                e18 += b36.f.j(10, str19);
            }
            int e19 = e18 + b36.f.e(11, this.f439700q);
            java.lang.String str20 = this.f439701r;
            if (str20 != null) {
                e19 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f439702s;
            if (str21 != null) {
                e19 += b36.f.j(13, str21);
            }
            int e27 = e19 + b36.f.e(14, this.f439703t);
            java.lang.String str22 = this.f439704u;
            return str22 != null ? e27 + b36.f.j(15, str22) : e27;
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
        vr4.b1 b1Var = (vr4.b1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b1Var.f439690d = aVar2.k(intValue);
                return 0;
            case 2:
                b1Var.f439691e = aVar2.k(intValue);
                return 0;
            case 3:
                b1Var.f439692f = aVar2.k(intValue);
                return 0;
            case 4:
                b1Var.f439693g = aVar2.g(intValue);
                return 0;
            case 5:
                b1Var.f439694h = aVar2.k(intValue);
                return 0;
            case 6:
                b1Var.f439695i = aVar2.g(intValue);
                return 0;
            case 7:
                b1Var.f439696m = aVar2.k(intValue);
                return 0;
            case 8:
                b1Var.f439697n = aVar2.k(intValue);
                return 0;
            case 9:
                b1Var.f439698o = aVar2.k(intValue);
                return 0;
            case 10:
                b1Var.f439699p = aVar2.k(intValue);
                return 0;
            case 11:
                b1Var.f439700q = aVar2.g(intValue);
                return 0;
            case 12:
                b1Var.f439701r = aVar2.k(intValue);
                return 0;
            case 13:
                b1Var.f439702s = aVar2.k(intValue);
                return 0;
            case 14:
                b1Var.f439703t = aVar2.g(intValue);
                return 0;
            case 15:
                b1Var.f439704u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
