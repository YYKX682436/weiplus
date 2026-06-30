package jy3;

/* loaded from: classes14.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f302506d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f302507e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f302508f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f302509g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f302510h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f302511i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f302512m;

    /* renamed from: n, reason: collision with root package name */
    public int f302513n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f302514o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f302515p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f302516q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f302517r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f302518s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f302519t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof jy3.f)) {
            return false;
        }
        jy3.f fVar2 = (jy3.f) fVar;
        return n51.f.a(this.f302506d, fVar2.f302506d) && n51.f.a(this.f302507e, fVar2.f302507e) && n51.f.a(this.f302508f, fVar2.f302508f) && n51.f.a(this.f302509g, fVar2.f302509g) && n51.f.a(this.f302510h, fVar2.f302510h) && n51.f.a(this.f302511i, fVar2.f302511i) && n51.f.a(this.f302512m, fVar2.f302512m) && n51.f.a(java.lang.Integer.valueOf(this.f302513n), java.lang.Integer.valueOf(fVar2.f302513n)) && n51.f.a(java.lang.Boolean.valueOf(this.f302514o), java.lang.Boolean.valueOf(fVar2.f302514o)) && n51.f.a(java.lang.Boolean.valueOf(this.f302515p), java.lang.Boolean.valueOf(fVar2.f302515p)) && n51.f.a(this.f302516q, fVar2.f302516q) && n51.f.a(this.f302517r, fVar2.f302517r) && n51.f.a(this.f302518s, fVar2.f302518s) && n51.f.a(this.f302519t, fVar2.f302519t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f302506d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f302507e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f302508f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f302509g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f302510h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f302511i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f302512m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f302513n);
            fVar.a(9, this.f302514o);
            fVar.a(10, this.f302515p);
            java.lang.String str8 = this.f302516q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f302517r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f302518s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f302519t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f302506d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f302507e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f302508f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f302509g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f302510h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f302511i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f302512m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            int e17 = j17 + b36.f.e(8, this.f302513n) + b36.f.a(9, this.f302514o) + b36.f.a(10, this.f302515p);
            java.lang.String str19 = this.f302516q;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f302517r;
            if (str20 != null) {
                e17 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f302518s;
            if (str21 != null) {
                e17 += b36.f.j(13, str21);
            }
            java.lang.String str22 = this.f302519t;
            return str22 != null ? e17 + b36.f.j(14, str22) : e17;
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
        jy3.f fVar2 = (jy3.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fVar2.f302506d = aVar2.k(intValue);
                return 0;
            case 2:
                fVar2.f302507e = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f302508f = aVar2.k(intValue);
                return 0;
            case 4:
                fVar2.f302509g = aVar2.k(intValue);
                return 0;
            case 5:
                fVar2.f302510h = aVar2.k(intValue);
                return 0;
            case 6:
                fVar2.f302511i = aVar2.k(intValue);
                return 0;
            case 7:
                fVar2.f302512m = aVar2.k(intValue);
                return 0;
            case 8:
                fVar2.f302513n = aVar2.g(intValue);
                return 0;
            case 9:
                fVar2.f302514o = aVar2.c(intValue);
                return 0;
            case 10:
                fVar2.f302515p = aVar2.c(intValue);
                return 0;
            case 11:
                fVar2.f302516q = aVar2.k(intValue);
                return 0;
            case 12:
                fVar2.f302517r = aVar2.k(intValue);
                return 0;
            case 13:
                fVar2.f302518s = aVar2.k(intValue);
                return 0;
            case 14:
                fVar2.f302519t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
