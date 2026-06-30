package r45;

/* loaded from: classes11.dex */
public class yd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390973d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390974e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f390975f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f390976g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390977h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390978i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390979m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f390980n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390981o;

    /* renamed from: p, reason: collision with root package name */
    public int f390982p;

    /* renamed from: q, reason: collision with root package name */
    public int f390983q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f390984r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f390985s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f390986t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yd)) {
            return false;
        }
        r45.yd ydVar = (r45.yd) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390973d), java.lang.Integer.valueOf(ydVar.f390973d)) && n51.f.a(this.f390974e, ydVar.f390974e) && n51.f.a(java.lang.Boolean.valueOf(this.f390975f), java.lang.Boolean.valueOf(ydVar.f390975f)) && n51.f.a(java.lang.Boolean.valueOf(this.f390976g), java.lang.Boolean.valueOf(ydVar.f390976g)) && n51.f.a(this.f390977h, ydVar.f390977h) && n51.f.a(this.f390978i, ydVar.f390978i) && n51.f.a(this.f390979m, ydVar.f390979m) && n51.f.a(this.f390980n, ydVar.f390980n) && n51.f.a(this.f390981o, ydVar.f390981o) && n51.f.a(java.lang.Integer.valueOf(this.f390982p), java.lang.Integer.valueOf(ydVar.f390982p)) && n51.f.a(java.lang.Integer.valueOf(this.f390983q), java.lang.Integer.valueOf(ydVar.f390983q)) && n51.f.a(this.f390984r, ydVar.f390984r) && n51.f.a(this.f390985s, ydVar.f390985s) && n51.f.a(this.f390986t, ydVar.f390986t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390973d);
            com.tencent.mm.protobuf.g gVar = this.f390974e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.a(3, this.f390975f);
            fVar.a(4, this.f390976g);
            java.lang.String str = this.f390977h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f390978i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f390979m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f390980n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f390981o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f390982p);
            fVar.e(11, this.f390983q);
            java.lang.String str6 = this.f390984r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f390985s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f390986t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390973d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f390974e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            int a17 = e17 + b36.f.a(3, this.f390975f) + b36.f.a(4, this.f390976g);
            java.lang.String str9 = this.f390977h;
            if (str9 != null) {
                a17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f390978i;
            if (str10 != null) {
                a17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f390979m;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f390980n;
            if (str12 != null) {
                a17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f390981o;
            if (str13 != null) {
                a17 += b36.f.j(9, str13);
            }
            int e18 = a17 + b36.f.e(10, this.f390982p) + b36.f.e(11, this.f390983q);
            java.lang.String str14 = this.f390984r;
            if (str14 != null) {
                e18 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f390985s;
            if (str15 != null) {
                e18 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f390986t;
            return str16 != null ? e18 + b36.f.j(14, str16) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.yd ydVar = (r45.yd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ydVar.f390973d = aVar2.g(intValue);
                return 0;
            case 2:
                ydVar.f390974e = aVar2.d(intValue);
                return 0;
            case 3:
                ydVar.f390975f = aVar2.c(intValue);
                return 0;
            case 4:
                ydVar.f390976g = aVar2.c(intValue);
                return 0;
            case 5:
                ydVar.f390977h = aVar2.k(intValue);
                return 0;
            case 6:
                ydVar.f390978i = aVar2.k(intValue);
                return 0;
            case 7:
                ydVar.f390979m = aVar2.k(intValue);
                return 0;
            case 8:
                ydVar.f390980n = aVar2.k(intValue);
                return 0;
            case 9:
                ydVar.f390981o = aVar2.k(intValue);
                return 0;
            case 10:
                ydVar.f390982p = aVar2.g(intValue);
                return 0;
            case 11:
                ydVar.f390983q = aVar2.g(intValue);
                return 0;
            case 12:
                ydVar.f390984r = aVar2.k(intValue);
                return 0;
            case 13:
                ydVar.f390985s = aVar2.k(intValue);
                return 0;
            case 14:
                ydVar.f390986t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
