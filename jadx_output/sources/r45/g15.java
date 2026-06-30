package r45;

/* loaded from: classes8.dex */
public class g15 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f374804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374806f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374807g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f374808h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374809i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374810m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374811n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374812o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f374813p;

    /* renamed from: q, reason: collision with root package name */
    public int f374814q;

    /* renamed from: r, reason: collision with root package name */
    public int f374815r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f374816s;

    /* renamed from: t, reason: collision with root package name */
    public int f374817t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f374818u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f374819v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f374820w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f374821x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g15)) {
            return false;
        }
        r45.g15 g15Var = (r45.g15) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f374804d), java.lang.Boolean.valueOf(g15Var.f374804d)) && n51.f.a(this.f374805e, g15Var.f374805e) && n51.f.a(this.f374806f, g15Var.f374806f) && n51.f.a(this.f374807g, g15Var.f374807g) && n51.f.a(java.lang.Boolean.valueOf(this.f374808h), java.lang.Boolean.valueOf(g15Var.f374808h)) && n51.f.a(this.f374809i, g15Var.f374809i) && n51.f.a(this.f374810m, g15Var.f374810m) && n51.f.a(this.f374811n, g15Var.f374811n) && n51.f.a(this.f374812o, g15Var.f374812o) && n51.f.a(this.f374813p, g15Var.f374813p) && n51.f.a(java.lang.Integer.valueOf(this.f374814q), java.lang.Integer.valueOf(g15Var.f374814q)) && n51.f.a(java.lang.Integer.valueOf(this.f374815r), java.lang.Integer.valueOf(g15Var.f374815r)) && n51.f.a(this.f374816s, g15Var.f374816s) && n51.f.a(java.lang.Integer.valueOf(this.f374817t), java.lang.Integer.valueOf(g15Var.f374817t)) && n51.f.a(this.f374818u, g15Var.f374818u) && n51.f.a(this.f374819v, g15Var.f374819v) && n51.f.a(this.f374820w, g15Var.f374820w) && n51.f.a(this.f374821x, g15Var.f374821x);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f374804d);
            java.lang.String str = this.f374805e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374806f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f374807g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f374808h);
            java.lang.String str4 = this.f374809i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f374810m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f374811n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f374812o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f374813p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f374814q);
            fVar.e(12, this.f374815r);
            java.lang.String str9 = this.f374816s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            fVar.e(14, this.f374817t);
            java.lang.String str10 = this.f374818u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f374819v;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            java.lang.String str12 = this.f374820w;
            if (str12 != null) {
                fVar.j(17, str12);
            }
            java.lang.String str13 = this.f374821x;
            if (str13 != null) {
                fVar.j(18, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f374804d) + 0;
            java.lang.String str14 = this.f374805e;
            if (str14 != null) {
                a17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f374806f;
            if (str15 != null) {
                a17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f374807g;
            if (str16 != null) {
                a17 += b36.f.j(4, str16);
            }
            int a18 = a17 + b36.f.a(5, this.f374808h);
            java.lang.String str17 = this.f374809i;
            if (str17 != null) {
                a18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f374810m;
            if (str18 != null) {
                a18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f374811n;
            if (str19 != null) {
                a18 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f374812o;
            if (str20 != null) {
                a18 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f374813p;
            if (str21 != null) {
                a18 += b36.f.j(10, str21);
            }
            int e17 = a18 + b36.f.e(11, this.f374814q) + b36.f.e(12, this.f374815r);
            java.lang.String str22 = this.f374816s;
            if (str22 != null) {
                e17 += b36.f.j(13, str22);
            }
            int e18 = e17 + b36.f.e(14, this.f374817t);
            java.lang.String str23 = this.f374818u;
            if (str23 != null) {
                e18 += b36.f.j(15, str23);
            }
            java.lang.String str24 = this.f374819v;
            if (str24 != null) {
                e18 += b36.f.j(16, str24);
            }
            java.lang.String str25 = this.f374820w;
            if (str25 != null) {
                e18 += b36.f.j(17, str25);
            }
            java.lang.String str26 = this.f374821x;
            return str26 != null ? e18 + b36.f.j(18, str26) : e18;
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
        r45.g15 g15Var = (r45.g15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g15Var.f374804d = aVar2.c(intValue);
                return 0;
            case 2:
                g15Var.f374805e = aVar2.k(intValue);
                return 0;
            case 3:
                g15Var.f374806f = aVar2.k(intValue);
                return 0;
            case 4:
                g15Var.f374807g = aVar2.k(intValue);
                return 0;
            case 5:
                g15Var.f374808h = aVar2.c(intValue);
                return 0;
            case 6:
                g15Var.f374809i = aVar2.k(intValue);
                return 0;
            case 7:
                g15Var.f374810m = aVar2.k(intValue);
                return 0;
            case 8:
                g15Var.f374811n = aVar2.k(intValue);
                return 0;
            case 9:
                g15Var.f374812o = aVar2.k(intValue);
                return 0;
            case 10:
                g15Var.f374813p = aVar2.k(intValue);
                return 0;
            case 11:
                g15Var.f374814q = aVar2.g(intValue);
                return 0;
            case 12:
                g15Var.f374815r = aVar2.g(intValue);
                return 0;
            case 13:
                g15Var.f374816s = aVar2.k(intValue);
                return 0;
            case 14:
                g15Var.f374817t = aVar2.g(intValue);
                return 0;
            case 15:
                g15Var.f374818u = aVar2.k(intValue);
                return 0;
            case 16:
                g15Var.f374819v = aVar2.k(intValue);
                return 0;
            case 17:
                g15Var.f374820w = aVar2.k(intValue);
                return 0;
            case 18:
                g15Var.f374821x = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
