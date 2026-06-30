package r45;

/* loaded from: classes7.dex */
public class zb5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f391882d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391883e;

    /* renamed from: f, reason: collision with root package name */
    public int f391884f;

    /* renamed from: g, reason: collision with root package name */
    public int f391885g;

    /* renamed from: h, reason: collision with root package name */
    public int f391886h;

    /* renamed from: i, reason: collision with root package name */
    public int f391887i;

    /* renamed from: m, reason: collision with root package name */
    public int f391888m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391889n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f391890o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f391891p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f391892q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f391893r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f391894s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f391895t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f391896u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zb5)) {
            return false;
        }
        r45.zb5 zb5Var = (r45.zb5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f391882d), java.lang.Integer.valueOf(zb5Var.f391882d)) && n51.f.a(this.f391883e, zb5Var.f391883e) && n51.f.a(java.lang.Integer.valueOf(this.f391884f), java.lang.Integer.valueOf(zb5Var.f391884f)) && n51.f.a(java.lang.Integer.valueOf(this.f391885g), java.lang.Integer.valueOf(zb5Var.f391885g)) && n51.f.a(java.lang.Integer.valueOf(this.f391886h), java.lang.Integer.valueOf(zb5Var.f391886h)) && n51.f.a(java.lang.Integer.valueOf(this.f391887i), java.lang.Integer.valueOf(zb5Var.f391887i)) && n51.f.a(java.lang.Integer.valueOf(this.f391888m), java.lang.Integer.valueOf(zb5Var.f391888m)) && n51.f.a(this.f391889n, zb5Var.f391889n) && n51.f.a(java.lang.Boolean.valueOf(this.f391890o), java.lang.Boolean.valueOf(zb5Var.f391890o)) && n51.f.a(java.lang.Boolean.valueOf(this.f391891p), java.lang.Boolean.valueOf(zb5Var.f391891p)) && n51.f.a(java.lang.Boolean.valueOf(this.f391892q), java.lang.Boolean.valueOf(zb5Var.f391892q)) && n51.f.a(java.lang.Boolean.valueOf(this.f391893r), java.lang.Boolean.valueOf(zb5Var.f391893r)) && n51.f.a(java.lang.Boolean.valueOf(this.f391894s), java.lang.Boolean.valueOf(zb5Var.f391894s)) && n51.f.a(java.lang.Boolean.valueOf(this.f391895t), java.lang.Boolean.valueOf(zb5Var.f391895t)) && n51.f.a(java.lang.Boolean.valueOf(this.f391896u), java.lang.Boolean.valueOf(zb5Var.f391896u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f391882d);
            java.lang.String str = this.f391883e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391884f);
            fVar.e(4, this.f391885g);
            fVar.e(5, this.f391886h);
            fVar.e(6, this.f391887i);
            fVar.e(7, this.f391888m);
            java.lang.String str2 = this.f391889n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.a(9, this.f391890o);
            fVar.a(10, this.f391891p);
            fVar.a(11, this.f391892q);
            fVar.a(12, this.f391893r);
            fVar.a(13, this.f391894s);
            fVar.a(14, this.f391895t);
            fVar.a(15, this.f391896u);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f391882d) + 0;
            java.lang.String str3 = this.f391883e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f391884f) + b36.f.e(4, this.f391885g) + b36.f.e(5, this.f391886h) + b36.f.e(6, this.f391887i) + b36.f.e(7, this.f391888m);
            java.lang.String str4 = this.f391889n;
            if (str4 != null) {
                e18 += b36.f.j(8, str4);
            }
            return e18 + b36.f.a(9, this.f391890o) + b36.f.a(10, this.f391891p) + b36.f.a(11, this.f391892q) + b36.f.a(12, this.f391893r) + b36.f.a(13, this.f391894s) + b36.f.a(14, this.f391895t) + b36.f.a(15, this.f391896u);
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
        r45.zb5 zb5Var = (r45.zb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zb5Var.f391882d = aVar2.g(intValue);
                return 0;
            case 2:
                zb5Var.f391883e = aVar2.k(intValue);
                return 0;
            case 3:
                zb5Var.f391884f = aVar2.g(intValue);
                return 0;
            case 4:
                zb5Var.f391885g = aVar2.g(intValue);
                return 0;
            case 5:
                zb5Var.f391886h = aVar2.g(intValue);
                return 0;
            case 6:
                zb5Var.f391887i = aVar2.g(intValue);
                return 0;
            case 7:
                zb5Var.f391888m = aVar2.g(intValue);
                return 0;
            case 8:
                zb5Var.f391889n = aVar2.k(intValue);
                return 0;
            case 9:
                zb5Var.f391890o = aVar2.c(intValue);
                return 0;
            case 10:
                zb5Var.f391891p = aVar2.c(intValue);
                return 0;
            case 11:
                zb5Var.f391892q = aVar2.c(intValue);
                return 0;
            case 12:
                zb5Var.f391893r = aVar2.c(intValue);
                return 0;
            case 13:
                zb5Var.f391894s = aVar2.c(intValue);
                return 0;
            case 14:
                zb5Var.f391895t = aVar2.c(intValue);
                return 0;
            case 15:
                zb5Var.f391896u = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
