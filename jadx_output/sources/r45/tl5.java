package r45;

/* loaded from: classes4.dex */
public class tl5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f386552d;

    /* renamed from: e, reason: collision with root package name */
    public float f386553e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386554f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386555g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386556h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386557i;

    /* renamed from: m, reason: collision with root package name */
    public int f386558m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386559n;

    /* renamed from: o, reason: collision with root package name */
    public int f386560o;

    /* renamed from: p, reason: collision with root package name */
    public int f386561p;

    /* renamed from: q, reason: collision with root package name */
    public int f386562q;

    /* renamed from: r, reason: collision with root package name */
    public float f386563r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386564s;

    /* renamed from: t, reason: collision with root package name */
    public int f386565t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f386566u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f386567v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tl5)) {
            return false;
        }
        r45.tl5 tl5Var = (r45.tl5) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f386552d), java.lang.Float.valueOf(tl5Var.f386552d)) && n51.f.a(java.lang.Float.valueOf(this.f386553e), java.lang.Float.valueOf(tl5Var.f386553e)) && n51.f.a(this.f386554f, tl5Var.f386554f) && n51.f.a(this.f386555g, tl5Var.f386555g) && n51.f.a(this.f386556h, tl5Var.f386556h) && n51.f.a(this.f386557i, tl5Var.f386557i) && n51.f.a(java.lang.Integer.valueOf(this.f386558m), java.lang.Integer.valueOf(tl5Var.f386558m)) && n51.f.a(this.f386559n, tl5Var.f386559n) && n51.f.a(java.lang.Integer.valueOf(this.f386560o), java.lang.Integer.valueOf(tl5Var.f386560o)) && n51.f.a(java.lang.Integer.valueOf(this.f386561p), java.lang.Integer.valueOf(tl5Var.f386561p)) && n51.f.a(java.lang.Integer.valueOf(this.f386562q), java.lang.Integer.valueOf(tl5Var.f386562q)) && n51.f.a(java.lang.Float.valueOf(this.f386563r), java.lang.Float.valueOf(tl5Var.f386563r)) && n51.f.a(this.f386564s, tl5Var.f386564s) && n51.f.a(java.lang.Integer.valueOf(this.f386565t), java.lang.Integer.valueOf(tl5Var.f386565t)) && n51.f.a(this.f386566u, tl5Var.f386566u) && n51.f.a(this.f386567v, tl5Var.f386567v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f386552d);
            fVar.d(2, this.f386553e);
            java.lang.String str = this.f386554f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f386555g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f386556h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f386557i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f386558m);
            java.lang.String str5 = this.f386559n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f386560o);
            fVar.e(10, this.f386561p);
            fVar.e(11, this.f386562q);
            fVar.d(12, this.f386563r);
            com.tencent.mm.protobuf.g gVar = this.f386564s;
            if (gVar != null) {
                fVar.b(13, gVar);
            }
            fVar.e(14, this.f386565t);
            java.lang.String str6 = this.f386566u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f386567v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f386552d) + 0 + b36.f.d(2, this.f386553e);
            java.lang.String str8 = this.f386554f;
            if (str8 != null) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f386555g;
            if (str9 != null) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f386556h;
            if (str10 != null) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f386557i;
            if (str11 != null) {
                d17 += b36.f.j(6, str11);
            }
            int e17 = d17 + b36.f.e(7, this.f386558m);
            java.lang.String str12 = this.f386559n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            int e18 = e17 + b36.f.e(9, this.f386560o) + b36.f.e(10, this.f386561p) + b36.f.e(11, this.f386562q) + b36.f.d(12, this.f386563r);
            com.tencent.mm.protobuf.g gVar2 = this.f386564s;
            if (gVar2 != null) {
                e18 += b36.f.b(13, gVar2);
            }
            int e19 = e18 + b36.f.e(14, this.f386565t);
            java.lang.String str13 = this.f386566u;
            if (str13 != null) {
                e19 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f386567v;
            return str14 != null ? e19 + b36.f.j(16, str14) : e19;
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
        r45.tl5 tl5Var = (r45.tl5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tl5Var.f386552d = aVar2.f(intValue);
                return 0;
            case 2:
                tl5Var.f386553e = aVar2.f(intValue);
                return 0;
            case 3:
                tl5Var.f386554f = aVar2.k(intValue);
                return 0;
            case 4:
                tl5Var.f386555g = aVar2.k(intValue);
                return 0;
            case 5:
                tl5Var.f386556h = aVar2.k(intValue);
                return 0;
            case 6:
                tl5Var.f386557i = aVar2.k(intValue);
                return 0;
            case 7:
                tl5Var.f386558m = aVar2.g(intValue);
                return 0;
            case 8:
                tl5Var.f386559n = aVar2.k(intValue);
                return 0;
            case 9:
                tl5Var.f386560o = aVar2.g(intValue);
                return 0;
            case 10:
                tl5Var.f386561p = aVar2.g(intValue);
                return 0;
            case 11:
                tl5Var.f386562q = aVar2.g(intValue);
                return 0;
            case 12:
                tl5Var.f386563r = aVar2.f(intValue);
                return 0;
            case 13:
                tl5Var.f386564s = aVar2.d(intValue);
                return 0;
            case 14:
                tl5Var.f386565t = aVar2.g(intValue);
                return 0;
            case 15:
                tl5Var.f386566u = aVar2.k(intValue);
                return 0;
            case 16:
                tl5Var.f386567v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
