package r45;

/* loaded from: classes9.dex */
public class d35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372035e;

    /* renamed from: f, reason: collision with root package name */
    public double f372036f;

    /* renamed from: g, reason: collision with root package name */
    public double f372037g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372038h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372039i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372040m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372041n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372042o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f372043p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f372044q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f372045r;

    /* renamed from: s, reason: collision with root package name */
    public float f372046s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f372047t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f372048u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f372049v;

    /* renamed from: w, reason: collision with root package name */
    public int f372050w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d35)) {
            return false;
        }
        r45.d35 d35Var = (r45.d35) fVar;
        return n51.f.a(this.f372034d, d35Var.f372034d) && n51.f.a(this.f372035e, d35Var.f372035e) && n51.f.a(java.lang.Double.valueOf(this.f372036f), java.lang.Double.valueOf(d35Var.f372036f)) && n51.f.a(java.lang.Double.valueOf(this.f372037g), java.lang.Double.valueOf(d35Var.f372037g)) && n51.f.a(this.f372038h, d35Var.f372038h) && n51.f.a(this.f372039i, d35Var.f372039i) && n51.f.a(this.f372040m, d35Var.f372040m) && n51.f.a(this.f372041n, d35Var.f372041n) && n51.f.a(this.f372042o, d35Var.f372042o) && n51.f.a(this.f372043p, d35Var.f372043p) && n51.f.a(this.f372044q, d35Var.f372044q) && n51.f.a(this.f372045r, d35Var.f372045r) && n51.f.a(java.lang.Float.valueOf(this.f372046s), java.lang.Float.valueOf(d35Var.f372046s)) && n51.f.a(this.f372047t, d35Var.f372047t) && n51.f.a(this.f372048u, d35Var.f372048u) && n51.f.a(this.f372049v, d35Var.f372049v) && n51.f.a(java.lang.Integer.valueOf(this.f372050w), java.lang.Integer.valueOf(d35Var.f372050w));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372034d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372035e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f372036f);
            fVar.c(4, this.f372037g);
            java.lang.String str3 = this.f372038h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f372039i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f372040m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f372041n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f372042o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f372043p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f372044q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f372045r;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            fVar.d(13, this.f372046s);
            java.lang.String str11 = this.f372047t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            java.lang.String str12 = this.f372048u;
            if (str12 != null) {
                fVar.j(15, str12);
            }
            java.lang.String str13 = this.f372049v;
            if (str13 != null) {
                fVar.j(16, str13);
            }
            fVar.e(17, this.f372050w);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f372034d;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.f372035e;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            int c17 = j17 + b36.f.c(3, this.f372036f) + b36.f.c(4, this.f372037g);
            java.lang.String str16 = this.f372038h;
            if (str16 != null) {
                c17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f372039i;
            if (str17 != null) {
                c17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f372040m;
            if (str18 != null) {
                c17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f372041n;
            if (str19 != null) {
                c17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f372042o;
            if (str20 != null) {
                c17 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f372043p;
            if (str21 != null) {
                c17 += b36.f.j(10, str21);
            }
            java.lang.String str22 = this.f372044q;
            if (str22 != null) {
                c17 += b36.f.j(11, str22);
            }
            java.lang.String str23 = this.f372045r;
            if (str23 != null) {
                c17 += b36.f.j(12, str23);
            }
            int d17 = c17 + b36.f.d(13, this.f372046s);
            java.lang.String str24 = this.f372047t;
            if (str24 != null) {
                d17 += b36.f.j(14, str24);
            }
            java.lang.String str25 = this.f372048u;
            if (str25 != null) {
                d17 += b36.f.j(15, str25);
            }
            java.lang.String str26 = this.f372049v;
            if (str26 != null) {
                d17 += b36.f.j(16, str26);
            }
            return d17 + b36.f.e(17, this.f372050w);
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
        r45.d35 d35Var = (r45.d35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d35Var.f372034d = aVar2.k(intValue);
                return 0;
            case 2:
                d35Var.f372035e = aVar2.k(intValue);
                return 0;
            case 3:
                d35Var.f372036f = aVar2.e(intValue);
                return 0;
            case 4:
                d35Var.f372037g = aVar2.e(intValue);
                return 0;
            case 5:
                d35Var.f372038h = aVar2.k(intValue);
                return 0;
            case 6:
                d35Var.f372039i = aVar2.k(intValue);
                return 0;
            case 7:
                d35Var.f372040m = aVar2.k(intValue);
                return 0;
            case 8:
                d35Var.f372041n = aVar2.k(intValue);
                return 0;
            case 9:
                d35Var.f372042o = aVar2.k(intValue);
                return 0;
            case 10:
                d35Var.f372043p = aVar2.k(intValue);
                return 0;
            case 11:
                d35Var.f372044q = aVar2.k(intValue);
                return 0;
            case 12:
                d35Var.f372045r = aVar2.k(intValue);
                return 0;
            case 13:
                d35Var.f372046s = aVar2.f(intValue);
                return 0;
            case 14:
                d35Var.f372047t = aVar2.k(intValue);
                return 0;
            case 15:
                d35Var.f372048u = aVar2.k(intValue);
                return 0;
            case 16:
                d35Var.f372049v = aVar2.k(intValue);
                return 0;
            case 17:
                d35Var.f372050w = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
