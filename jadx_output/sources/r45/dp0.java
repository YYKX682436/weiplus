package r45;

/* loaded from: classes9.dex */
public class dp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372634d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372635e;

    /* renamed from: f, reason: collision with root package name */
    public int f372636f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372637g;

    /* renamed from: h, reason: collision with root package name */
    public int f372638h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372639i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372640m;

    /* renamed from: n, reason: collision with root package name */
    public int f372641n;

    /* renamed from: o, reason: collision with root package name */
    public int f372642o;

    /* renamed from: p, reason: collision with root package name */
    public int f372643p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f372644q;

    /* renamed from: r, reason: collision with root package name */
    public int f372645r;

    /* renamed from: s, reason: collision with root package name */
    public int f372646s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dp0)) {
            return false;
        }
        r45.dp0 dp0Var = (r45.dp0) fVar;
        return n51.f.a(this.f372634d, dp0Var.f372634d) && n51.f.a(this.f372635e, dp0Var.f372635e) && n51.f.a(java.lang.Integer.valueOf(this.f372636f), java.lang.Integer.valueOf(dp0Var.f372636f)) && n51.f.a(this.f372637g, dp0Var.f372637g) && n51.f.a(java.lang.Integer.valueOf(this.f372638h), java.lang.Integer.valueOf(dp0Var.f372638h)) && n51.f.a(this.f372639i, dp0Var.f372639i) && n51.f.a(this.f372640m, dp0Var.f372640m) && n51.f.a(java.lang.Integer.valueOf(this.f372641n), java.lang.Integer.valueOf(dp0Var.f372641n)) && n51.f.a(java.lang.Integer.valueOf(this.f372642o), java.lang.Integer.valueOf(dp0Var.f372642o)) && n51.f.a(java.lang.Integer.valueOf(this.f372643p), java.lang.Integer.valueOf(dp0Var.f372643p)) && n51.f.a(this.f372644q, dp0Var.f372644q) && n51.f.a(java.lang.Integer.valueOf(this.f372645r), java.lang.Integer.valueOf(dp0Var.f372645r)) && n51.f.a(java.lang.Integer.valueOf(this.f372646s), java.lang.Integer.valueOf(dp0Var.f372646s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372634d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372635e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f372636f);
            java.lang.String str3 = this.f372637g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f372638h);
            java.lang.String str4 = this.f372639i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f372640m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f372641n);
            fVar.e(9, this.f372642o);
            fVar.e(10, this.f372643p);
            java.lang.String str6 = this.f372644q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f372645r);
            fVar.e(13, this.f372646s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f372634d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f372635e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f372636f);
            java.lang.String str9 = this.f372637g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            int e18 = e17 + b36.f.e(5, this.f372638h);
            java.lang.String str10 = this.f372639i;
            if (str10 != null) {
                e18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f372640m;
            if (str11 != null) {
                e18 += b36.f.j(7, str11);
            }
            int e19 = e18 + b36.f.e(8, this.f372641n) + b36.f.e(9, this.f372642o) + b36.f.e(10, this.f372643p);
            java.lang.String str12 = this.f372644q;
            if (str12 != null) {
                e19 += b36.f.j(11, str12);
            }
            return e19 + b36.f.e(12, this.f372645r) + b36.f.e(13, this.f372646s);
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
        r45.dp0 dp0Var = (r45.dp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dp0Var.f372634d = aVar2.k(intValue);
                return 0;
            case 2:
                dp0Var.f372635e = aVar2.k(intValue);
                return 0;
            case 3:
                dp0Var.f372636f = aVar2.g(intValue);
                return 0;
            case 4:
                dp0Var.f372637g = aVar2.k(intValue);
                return 0;
            case 5:
                dp0Var.f372638h = aVar2.g(intValue);
                return 0;
            case 6:
                dp0Var.f372639i = aVar2.k(intValue);
                return 0;
            case 7:
                dp0Var.f372640m = aVar2.k(intValue);
                return 0;
            case 8:
                dp0Var.f372641n = aVar2.g(intValue);
                return 0;
            case 9:
                dp0Var.f372642o = aVar2.g(intValue);
                return 0;
            case 10:
                dp0Var.f372643p = aVar2.g(intValue);
                return 0;
            case 11:
                dp0Var.f372644q = aVar2.k(intValue);
                return 0;
            case 12:
                dp0Var.f372645r = aVar2.g(intValue);
                return 0;
            case 13:
                dp0Var.f372646s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
