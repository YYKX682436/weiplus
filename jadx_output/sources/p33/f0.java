package p33;

/* loaded from: classes8.dex */
public class f0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351561e;

    /* renamed from: f, reason: collision with root package name */
    public int f351562f;

    /* renamed from: g, reason: collision with root package name */
    public int f351563g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f351564h;

    /* renamed from: i, reason: collision with root package name */
    public int f351565i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f351566m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f351567n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f351568o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f351569p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f351570q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f351571r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f351572s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f351573t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f351574u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f351575v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.f0)) {
            return false;
        }
        p33.f0 f0Var = (p33.f0) fVar;
        return n51.f.a(this.f351560d, f0Var.f351560d) && n51.f.a(this.f351561e, f0Var.f351561e) && n51.f.a(java.lang.Integer.valueOf(this.f351562f), java.lang.Integer.valueOf(f0Var.f351562f)) && n51.f.a(java.lang.Integer.valueOf(this.f351563g), java.lang.Integer.valueOf(f0Var.f351563g)) && n51.f.a(this.f351564h, f0Var.f351564h) && n51.f.a(java.lang.Integer.valueOf(this.f351565i), java.lang.Integer.valueOf(f0Var.f351565i)) && n51.f.a(this.f351566m, f0Var.f351566m) && n51.f.a(this.f351567n, f0Var.f351567n) && n51.f.a(this.f351568o, f0Var.f351568o) && n51.f.a(this.f351569p, f0Var.f351569p) && n51.f.a(this.f351570q, f0Var.f351570q) && n51.f.a(this.f351571r, f0Var.f351571r) && n51.f.a(this.f351572s, f0Var.f351572s) && n51.f.a(this.f351573t, f0Var.f351573t) && n51.f.a(this.f351574u, f0Var.f351574u) && n51.f.a(this.f351575v, f0Var.f351575v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f351560d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f351561e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f351562f);
            fVar.e(4, this.f351563g);
            java.lang.String str3 = this.f351564h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f351565i);
            java.lang.String str4 = this.f351566m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f351567n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f351568o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f351569p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f351570q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f351571r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f351572s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f351573t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            java.lang.String str12 = this.f351574u;
            if (str12 != null) {
                fVar.j(15, str12);
            }
            java.lang.String str13 = this.f351575v;
            if (str13 != null) {
                fVar.j(16, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f351560d;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.f351561e;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            int e17 = j17 + b36.f.e(3, this.f351562f) + b36.f.e(4, this.f351563g);
            java.lang.String str16 = this.f351564h;
            if (str16 != null) {
                e17 += b36.f.j(5, str16);
            }
            int e18 = e17 + b36.f.e(6, this.f351565i);
            java.lang.String str17 = this.f351566m;
            if (str17 != null) {
                e18 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f351567n;
            if (str18 != null) {
                e18 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f351568o;
            if (str19 != null) {
                e18 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f351569p;
            if (str20 != null) {
                e18 += b36.f.j(10, str20);
            }
            java.lang.String str21 = this.f351570q;
            if (str21 != null) {
                e18 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f351571r;
            if (str22 != null) {
                e18 += b36.f.j(12, str22);
            }
            java.lang.String str23 = this.f351572s;
            if (str23 != null) {
                e18 += b36.f.j(13, str23);
            }
            java.lang.String str24 = this.f351573t;
            if (str24 != null) {
                e18 += b36.f.j(14, str24);
            }
            java.lang.String str25 = this.f351574u;
            if (str25 != null) {
                e18 += b36.f.j(15, str25);
            }
            java.lang.String str26 = this.f351575v;
            return str26 != null ? e18 + b36.f.j(16, str26) : e18;
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
        p33.f0 f0Var = (p33.f0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f0Var.f351560d = aVar2.k(intValue);
                return 0;
            case 2:
                f0Var.f351561e = aVar2.k(intValue);
                return 0;
            case 3:
                f0Var.f351562f = aVar2.g(intValue);
                return 0;
            case 4:
                f0Var.f351563g = aVar2.g(intValue);
                return 0;
            case 5:
                f0Var.f351564h = aVar2.k(intValue);
                return 0;
            case 6:
                f0Var.f351565i = aVar2.g(intValue);
                return 0;
            case 7:
                f0Var.f351566m = aVar2.k(intValue);
                return 0;
            case 8:
                f0Var.f351567n = aVar2.k(intValue);
                return 0;
            case 9:
                f0Var.f351568o = aVar2.k(intValue);
                return 0;
            case 10:
                f0Var.f351569p = aVar2.k(intValue);
                return 0;
            case 11:
                f0Var.f351570q = aVar2.k(intValue);
                return 0;
            case 12:
                f0Var.f351571r = aVar2.k(intValue);
                return 0;
            case 13:
                f0Var.f351572s = aVar2.k(intValue);
                return 0;
            case 14:
                f0Var.f351573t = aVar2.k(intValue);
                return 0;
            case 15:
                f0Var.f351574u = aVar2.k(intValue);
                return 0;
            case 16:
                f0Var.f351575v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
