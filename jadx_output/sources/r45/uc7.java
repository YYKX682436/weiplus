package r45;

/* loaded from: classes7.dex */
public class uc7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387231d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387232e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387233f;

    /* renamed from: g, reason: collision with root package name */
    public int f387234g;

    /* renamed from: h, reason: collision with root package name */
    public int f387235h;

    /* renamed from: i, reason: collision with root package name */
    public int f387236i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387237m;

    /* renamed from: n, reason: collision with root package name */
    public int f387238n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387239o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387240p;

    /* renamed from: q, reason: collision with root package name */
    public int f387241q;

    /* renamed from: r, reason: collision with root package name */
    public int f387242r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f387243s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f387244t;

    /* renamed from: u, reason: collision with root package name */
    public int f387245u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f387246v;

    /* renamed from: w, reason: collision with root package name */
    public int f387247w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uc7)) {
            return false;
        }
        r45.uc7 uc7Var = (r45.uc7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387231d), java.lang.Integer.valueOf(uc7Var.f387231d)) && n51.f.a(this.f387232e, uc7Var.f387232e) && n51.f.a(this.f387233f, uc7Var.f387233f) && n51.f.a(java.lang.Integer.valueOf(this.f387234g), java.lang.Integer.valueOf(uc7Var.f387234g)) && n51.f.a(java.lang.Integer.valueOf(this.f387235h), java.lang.Integer.valueOf(uc7Var.f387235h)) && n51.f.a(java.lang.Integer.valueOf(this.f387236i), java.lang.Integer.valueOf(uc7Var.f387236i)) && n51.f.a(this.f387237m, uc7Var.f387237m) && n51.f.a(java.lang.Integer.valueOf(this.f387238n), java.lang.Integer.valueOf(uc7Var.f387238n)) && n51.f.a(this.f387239o, uc7Var.f387239o) && n51.f.a(this.f387240p, uc7Var.f387240p) && n51.f.a(java.lang.Integer.valueOf(this.f387241q), java.lang.Integer.valueOf(uc7Var.f387241q)) && n51.f.a(java.lang.Integer.valueOf(this.f387242r), java.lang.Integer.valueOf(uc7Var.f387242r)) && n51.f.a(this.f387243s, uc7Var.f387243s) && n51.f.a(this.f387244t, uc7Var.f387244t) && n51.f.a(java.lang.Integer.valueOf(this.f387245u), java.lang.Integer.valueOf(uc7Var.f387245u)) && n51.f.a(this.f387246v, uc7Var.f387246v) && n51.f.a(java.lang.Integer.valueOf(this.f387247w), java.lang.Integer.valueOf(uc7Var.f387247w));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387231d);
            java.lang.String str = this.f387232e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387233f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f387234g);
            fVar.e(5, this.f387235h);
            fVar.e(6, this.f387236i);
            java.lang.String str3 = this.f387237m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f387238n);
            java.lang.String str4 = this.f387239o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f387240p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f387241q);
            fVar.e(12, this.f387242r);
            java.lang.String str6 = this.f387243s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f387244t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f387245u);
            java.lang.String str8 = this.f387246v;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            fVar.e(17, this.f387247w);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387231d) + 0;
            java.lang.String str9 = this.f387232e;
            if (str9 != null) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f387233f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            int e18 = e17 + b36.f.e(4, this.f387234g) + b36.f.e(5, this.f387235h) + b36.f.e(6, this.f387236i);
            java.lang.String str11 = this.f387237m;
            if (str11 != null) {
                e18 += b36.f.j(7, str11);
            }
            int e19 = e18 + b36.f.e(8, this.f387238n);
            java.lang.String str12 = this.f387239o;
            if (str12 != null) {
                e19 += b36.f.j(9, str12);
            }
            java.lang.String str13 = this.f387240p;
            if (str13 != null) {
                e19 += b36.f.j(10, str13);
            }
            int e27 = e19 + b36.f.e(11, this.f387241q) + b36.f.e(12, this.f387242r);
            java.lang.String str14 = this.f387243s;
            if (str14 != null) {
                e27 += b36.f.j(13, str14);
            }
            java.lang.String str15 = this.f387244t;
            if (str15 != null) {
                e27 += b36.f.j(14, str15);
            }
            int e28 = e27 + b36.f.e(15, this.f387245u);
            java.lang.String str16 = this.f387246v;
            if (str16 != null) {
                e28 += b36.f.j(16, str16);
            }
            return e28 + b36.f.e(17, this.f387247w);
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
        r45.uc7 uc7Var = (r45.uc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uc7Var.f387231d = aVar2.g(intValue);
                return 0;
            case 2:
                uc7Var.f387232e = aVar2.k(intValue);
                return 0;
            case 3:
                uc7Var.f387233f = aVar2.k(intValue);
                return 0;
            case 4:
                uc7Var.f387234g = aVar2.g(intValue);
                return 0;
            case 5:
                uc7Var.f387235h = aVar2.g(intValue);
                return 0;
            case 6:
                uc7Var.f387236i = aVar2.g(intValue);
                return 0;
            case 7:
                uc7Var.f387237m = aVar2.k(intValue);
                return 0;
            case 8:
                uc7Var.f387238n = aVar2.g(intValue);
                return 0;
            case 9:
                uc7Var.f387239o = aVar2.k(intValue);
                return 0;
            case 10:
                uc7Var.f387240p = aVar2.k(intValue);
                return 0;
            case 11:
                uc7Var.f387241q = aVar2.g(intValue);
                return 0;
            case 12:
                uc7Var.f387242r = aVar2.g(intValue);
                return 0;
            case 13:
                uc7Var.f387243s = aVar2.k(intValue);
                return 0;
            case 14:
                uc7Var.f387244t = aVar2.k(intValue);
                return 0;
            case 15:
                uc7Var.f387245u = aVar2.g(intValue);
                return 0;
            case 16:
                uc7Var.f387246v = aVar2.k(intValue);
                return 0;
            case 17:
                uc7Var.f387247w = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
