package r45;

/* loaded from: classes4.dex */
public class ke6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f378629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378630e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378631f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378632g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378633h;

    /* renamed from: i, reason: collision with root package name */
    public int f378634i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378635m;

    /* renamed from: n, reason: collision with root package name */
    public int f378636n;

    /* renamed from: o, reason: collision with root package name */
    public int f378637o;

    /* renamed from: p, reason: collision with root package name */
    public int f378638p;

    /* renamed from: q, reason: collision with root package name */
    public int f378639q;

    /* renamed from: r, reason: collision with root package name */
    public int f378640r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f378641s;

    /* renamed from: t, reason: collision with root package name */
    public int f378642t;

    /* renamed from: u, reason: collision with root package name */
    public int f378643u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ke6)) {
            return false;
        }
        r45.ke6 ke6Var = (r45.ke6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f378629d), java.lang.Long.valueOf(ke6Var.f378629d)) && n51.f.a(this.f378630e, ke6Var.f378630e) && n51.f.a(this.f378631f, ke6Var.f378631f) && n51.f.a(this.f378632g, ke6Var.f378632g) && n51.f.a(this.f378633h, ke6Var.f378633h) && n51.f.a(java.lang.Integer.valueOf(this.f378634i), java.lang.Integer.valueOf(ke6Var.f378634i)) && n51.f.a(this.f378635m, ke6Var.f378635m) && n51.f.a(java.lang.Integer.valueOf(this.f378636n), java.lang.Integer.valueOf(ke6Var.f378636n)) && n51.f.a(java.lang.Integer.valueOf(this.f378637o), java.lang.Integer.valueOf(ke6Var.f378637o)) && n51.f.a(java.lang.Integer.valueOf(this.f378638p), java.lang.Integer.valueOf(ke6Var.f378638p)) && n51.f.a(java.lang.Integer.valueOf(this.f378639q), java.lang.Integer.valueOf(ke6Var.f378639q)) && n51.f.a(java.lang.Integer.valueOf(this.f378640r), java.lang.Integer.valueOf(ke6Var.f378640r)) && n51.f.a(this.f378641s, ke6Var.f378641s) && n51.f.a(java.lang.Integer.valueOf(this.f378642t), java.lang.Integer.valueOf(ke6Var.f378642t)) && n51.f.a(java.lang.Integer.valueOf(this.f378643u), java.lang.Integer.valueOf(ke6Var.f378643u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f378629d);
            java.lang.String str = this.f378630e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378631f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f378632g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f378633h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f378634i);
            java.lang.String str5 = this.f378635m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f378636n);
            fVar.e(9, this.f378637o);
            fVar.e(10, this.f378638p);
            fVar.e(11, this.f378639q);
            fVar.e(12, this.f378640r);
            java.lang.String str6 = this.f378641s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f378642t);
            fVar.e(15, this.f378643u);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f378629d) + 0;
            java.lang.String str7 = this.f378630e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f378631f;
            if (str8 != null) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f378632g;
            if (str9 != null) {
                h17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f378633h;
            if (str10 != null) {
                h17 += b36.f.j(5, str10);
            }
            int e17 = h17 + b36.f.e(6, this.f378634i);
            java.lang.String str11 = this.f378635m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f378636n) + b36.f.e(9, this.f378637o) + b36.f.e(10, this.f378638p) + b36.f.e(11, this.f378639q) + b36.f.e(12, this.f378640r);
            java.lang.String str12 = this.f378641s;
            if (str12 != null) {
                e18 += b36.f.j(13, str12);
            }
            return e18 + b36.f.e(14, this.f378642t) + b36.f.e(15, this.f378643u);
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
        r45.ke6 ke6Var = (r45.ke6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ke6Var.f378629d = aVar2.i(intValue);
                return 0;
            case 2:
                ke6Var.f378630e = aVar2.k(intValue);
                return 0;
            case 3:
                ke6Var.f378631f = aVar2.k(intValue);
                return 0;
            case 4:
                ke6Var.f378632g = aVar2.k(intValue);
                return 0;
            case 5:
                ke6Var.f378633h = aVar2.k(intValue);
                return 0;
            case 6:
                ke6Var.f378634i = aVar2.g(intValue);
                return 0;
            case 7:
                ke6Var.f378635m = aVar2.k(intValue);
                return 0;
            case 8:
                ke6Var.f378636n = aVar2.g(intValue);
                return 0;
            case 9:
                ke6Var.f378637o = aVar2.g(intValue);
                return 0;
            case 10:
                ke6Var.f378638p = aVar2.g(intValue);
                return 0;
            case 11:
                ke6Var.f378639q = aVar2.g(intValue);
                return 0;
            case 12:
                ke6Var.f378640r = aVar2.g(intValue);
                return 0;
            case 13:
                ke6Var.f378641s = aVar2.k(intValue);
                return 0;
            case 14:
                ke6Var.f378642t = aVar2.g(intValue);
                return 0;
            case 15:
                ke6Var.f378643u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
