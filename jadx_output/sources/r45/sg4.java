package r45;

/* loaded from: classes2.dex */
public class sg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385694d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385695e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385696f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385697g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385698h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385699i;

    /* renamed from: m, reason: collision with root package name */
    public int f385700m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385701n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f385702o;

    /* renamed from: p, reason: collision with root package name */
    public int f385703p;

    /* renamed from: q, reason: collision with root package name */
    public int f385704q;

    /* renamed from: r, reason: collision with root package name */
    public int f385705r;

    /* renamed from: s, reason: collision with root package name */
    public int f385706s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f385707t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sg4)) {
            return false;
        }
        r45.sg4 sg4Var = (r45.sg4) fVar;
        return n51.f.a(this.f385694d, sg4Var.f385694d) && n51.f.a(this.f385695e, sg4Var.f385695e) && n51.f.a(this.f385696f, sg4Var.f385696f) && n51.f.a(this.f385697g, sg4Var.f385697g) && n51.f.a(this.f385698h, sg4Var.f385698h) && n51.f.a(this.f385699i, sg4Var.f385699i) && n51.f.a(java.lang.Integer.valueOf(this.f385700m), java.lang.Integer.valueOf(sg4Var.f385700m)) && n51.f.a(this.f385701n, sg4Var.f385701n) && n51.f.a(java.lang.Boolean.valueOf(this.f385702o), java.lang.Boolean.valueOf(sg4Var.f385702o)) && n51.f.a(java.lang.Integer.valueOf(this.f385703p), java.lang.Integer.valueOf(sg4Var.f385703p)) && n51.f.a(java.lang.Integer.valueOf(this.f385704q), java.lang.Integer.valueOf(sg4Var.f385704q)) && n51.f.a(java.lang.Integer.valueOf(this.f385705r), java.lang.Integer.valueOf(sg4Var.f385705r)) && n51.f.a(java.lang.Integer.valueOf(this.f385706s), java.lang.Integer.valueOf(sg4Var.f385706s)) && n51.f.a(java.lang.Boolean.valueOf(this.f385707t), java.lang.Boolean.valueOf(sg4Var.f385707t));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385694d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385695e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385696f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385697g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f385698h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f385699i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f385700m);
            java.lang.String str7 = this.f385701n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.a(10, this.f385702o);
            fVar.e(11, this.f385703p);
            fVar.e(12, this.f385704q);
            fVar.e(13, this.f385705r);
            fVar.e(14, this.f385706s);
            fVar.a(15, this.f385707t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f385694d;
            int j17 = str8 != null ? b36.f.j(1, str8) + 0 : 0;
            java.lang.String str9 = this.f385695e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f385696f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f385697g;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f385698h;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f385699i;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            int e17 = j17 + b36.f.e(8, this.f385700m);
            java.lang.String str14 = this.f385701n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            return e17 + b36.f.a(10, this.f385702o) + b36.f.e(11, this.f385703p) + b36.f.e(12, this.f385704q) + b36.f.e(13, this.f385705r) + b36.f.e(14, this.f385706s) + b36.f.a(15, this.f385707t);
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
        r45.sg4 sg4Var = (r45.sg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sg4Var.f385694d = aVar2.k(intValue);
                return 0;
            case 2:
                sg4Var.f385695e = aVar2.k(intValue);
                return 0;
            case 3:
                sg4Var.f385696f = aVar2.k(intValue);
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                sg4Var.f385697g = aVar2.k(intValue);
                return 0;
            case 6:
                sg4Var.f385698h = aVar2.k(intValue);
                return 0;
            case 7:
                sg4Var.f385699i = aVar2.k(intValue);
                return 0;
            case 8:
                sg4Var.f385700m = aVar2.g(intValue);
                return 0;
            case 9:
                sg4Var.f385701n = aVar2.k(intValue);
                return 0;
            case 10:
                sg4Var.f385702o = aVar2.c(intValue);
                return 0;
            case 11:
                sg4Var.f385703p = aVar2.g(intValue);
                return 0;
            case 12:
                sg4Var.f385704q = aVar2.g(intValue);
                return 0;
            case 13:
                sg4Var.f385705r = aVar2.g(intValue);
                return 0;
            case 14:
                sg4Var.f385706s = aVar2.g(intValue);
                return 0;
            case 15:
                sg4Var.f385707t = aVar2.c(intValue);
                return 0;
        }
    }
}
