package r45;

/* loaded from: classes4.dex */
public class d86 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372226d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372227e;

    /* renamed from: f, reason: collision with root package name */
    public int f372228f;

    /* renamed from: g, reason: collision with root package name */
    public int f372229g;

    /* renamed from: h, reason: collision with root package name */
    public int f372230h;

    /* renamed from: i, reason: collision with root package name */
    public int f372231i;

    /* renamed from: m, reason: collision with root package name */
    public int f372232m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372233n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372234o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f372235p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f372236q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f372237r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f372238s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f372239t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f372240u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d86)) {
            return false;
        }
        r45.d86 d86Var = (r45.d86) fVar;
        return n51.f.a(this.f372226d, d86Var.f372226d) && n51.f.a(this.f372227e, d86Var.f372227e) && n51.f.a(java.lang.Integer.valueOf(this.f372228f), java.lang.Integer.valueOf(d86Var.f372228f)) && n51.f.a(java.lang.Integer.valueOf(this.f372229g), java.lang.Integer.valueOf(d86Var.f372229g)) && n51.f.a(java.lang.Integer.valueOf(this.f372230h), java.lang.Integer.valueOf(d86Var.f372230h)) && n51.f.a(java.lang.Integer.valueOf(this.f372231i), java.lang.Integer.valueOf(d86Var.f372231i)) && n51.f.a(java.lang.Integer.valueOf(this.f372232m), java.lang.Integer.valueOf(d86Var.f372232m)) && n51.f.a(this.f372233n, d86Var.f372233n) && n51.f.a(this.f372234o, d86Var.f372234o) && n51.f.a(this.f372235p, d86Var.f372235p) && n51.f.a(this.f372236q, d86Var.f372236q) && n51.f.a(this.f372237r, d86Var.f372237r) && n51.f.a(this.f372238s, d86Var.f372238s) && n51.f.a(this.f372239t, d86Var.f372239t) && n51.f.a(this.f372240u, d86Var.f372240u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372226d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372227e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372228f);
            fVar.e(4, this.f372229g);
            fVar.e(5, this.f372230h);
            fVar.e(6, this.f372231i);
            fVar.e(7, this.f372232m);
            java.lang.String str3 = this.f372233n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f372234o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f372235p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f372236q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f372237r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f372238s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            java.lang.String str9 = this.f372239t;
            if (str9 != null) {
                fVar.j(14, str9);
            }
            java.lang.String str10 = this.f372240u;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f372226d;
            int j17 = str11 != null ? b36.f.j(1, str11) + 0 : 0;
            java.lang.String str12 = this.f372227e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            int e17 = j17 + b36.f.e(3, this.f372228f) + b36.f.e(4, this.f372229g) + b36.f.e(5, this.f372230h) + b36.f.e(6, this.f372231i) + b36.f.e(7, this.f372232m);
            java.lang.String str13 = this.f372233n;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f372234o;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f372235p;
            if (str15 != null) {
                e17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f372236q;
            if (str16 != null) {
                e17 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f372237r;
            if (str17 != null) {
                e17 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f372238s;
            if (str18 != null) {
                e17 += b36.f.j(13, str18);
            }
            java.lang.String str19 = this.f372239t;
            if (str19 != null) {
                e17 += b36.f.j(14, str19);
            }
            java.lang.String str20 = this.f372240u;
            return str20 != null ? e17 + b36.f.j(15, str20) : e17;
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
        r45.d86 d86Var = (r45.d86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d86Var.f372226d = aVar2.k(intValue);
                return 0;
            case 2:
                d86Var.f372227e = aVar2.k(intValue);
                return 0;
            case 3:
                d86Var.f372228f = aVar2.g(intValue);
                return 0;
            case 4:
                d86Var.f372229g = aVar2.g(intValue);
                return 0;
            case 5:
                d86Var.f372230h = aVar2.g(intValue);
                return 0;
            case 6:
                d86Var.f372231i = aVar2.g(intValue);
                return 0;
            case 7:
                d86Var.f372232m = aVar2.g(intValue);
                return 0;
            case 8:
                d86Var.f372233n = aVar2.k(intValue);
                return 0;
            case 9:
                d86Var.f372234o = aVar2.k(intValue);
                return 0;
            case 10:
                d86Var.f372235p = aVar2.k(intValue);
                return 0;
            case 11:
                d86Var.f372236q = aVar2.k(intValue);
                return 0;
            case 12:
                d86Var.f372237r = aVar2.k(intValue);
                return 0;
            case 13:
                d86Var.f372238s = aVar2.k(intValue);
                return 0;
            case 14:
                d86Var.f372239t = aVar2.k(intValue);
                return 0;
            case 15:
                d86Var.f372240u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
