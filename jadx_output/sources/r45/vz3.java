package r45;

/* loaded from: classes2.dex */
public class vz3 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public int f388699d;

    /* renamed from: e, reason: collision with root package name */
    public int f388700e;

    /* renamed from: f, reason: collision with root package name */
    public int f388701f;

    /* renamed from: g, reason: collision with root package name */
    public int f388702g;

    /* renamed from: h, reason: collision with root package name */
    public int f388703h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388704i;

    /* renamed from: m, reason: collision with root package name */
    public int f388705m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388706n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f388707o;

    /* renamed from: p, reason: collision with root package name */
    public int f388708p;

    /* renamed from: q, reason: collision with root package name */
    public int f388709q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f388710r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388711s;

    /* renamed from: t, reason: collision with root package name */
    public int f388712t;

    /* renamed from: u, reason: collision with root package name */
    public int f388713u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f388714v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f388715w;

    /* renamed from: x, reason: collision with root package name */
    public int f388716x;

    /* renamed from: y, reason: collision with root package name */
    public int f388717y;

    /* renamed from: z, reason: collision with root package name */
    public int f388718z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vz3)) {
            return false;
        }
        r45.vz3 vz3Var = (r45.vz3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388699d), java.lang.Integer.valueOf(vz3Var.f388699d)) && n51.f.a(java.lang.Integer.valueOf(this.f388700e), java.lang.Integer.valueOf(vz3Var.f388700e)) && n51.f.a(java.lang.Integer.valueOf(this.f388701f), java.lang.Integer.valueOf(vz3Var.f388701f)) && n51.f.a(java.lang.Integer.valueOf(this.f388702g), java.lang.Integer.valueOf(vz3Var.f388702g)) && n51.f.a(java.lang.Integer.valueOf(this.f388703h), java.lang.Integer.valueOf(vz3Var.f388703h)) && n51.f.a(this.f388704i, vz3Var.f388704i) && n51.f.a(java.lang.Integer.valueOf(this.f388705m), java.lang.Integer.valueOf(vz3Var.f388705m)) && n51.f.a(this.f388706n, vz3Var.f388706n) && n51.f.a(java.lang.Boolean.valueOf(this.f388707o), java.lang.Boolean.valueOf(vz3Var.f388707o)) && n51.f.a(java.lang.Integer.valueOf(this.f388708p), java.lang.Integer.valueOf(vz3Var.f388708p)) && n51.f.a(java.lang.Integer.valueOf(this.f388709q), java.lang.Integer.valueOf(vz3Var.f388709q)) && n51.f.a(java.lang.Boolean.valueOf(this.f388710r), java.lang.Boolean.valueOf(vz3Var.f388710r)) && n51.f.a(this.f388711s, vz3Var.f388711s) && n51.f.a(java.lang.Integer.valueOf(this.f388712t), java.lang.Integer.valueOf(vz3Var.f388712t)) && n51.f.a(java.lang.Integer.valueOf(this.f388713u), java.lang.Integer.valueOf(vz3Var.f388713u)) && n51.f.a(java.lang.Boolean.valueOf(this.f388714v), java.lang.Boolean.valueOf(vz3Var.f388714v)) && n51.f.a(java.lang.Boolean.valueOf(this.f388715w), java.lang.Boolean.valueOf(vz3Var.f388715w)) && n51.f.a(java.lang.Integer.valueOf(this.f388716x), java.lang.Integer.valueOf(vz3Var.f388716x)) && n51.f.a(java.lang.Integer.valueOf(this.f388717y), java.lang.Integer.valueOf(vz3Var.f388717y)) && n51.f.a(java.lang.Integer.valueOf(this.f388718z), java.lang.Integer.valueOf(vz3Var.f388718z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(vz3Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(vz3Var.B));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388699d);
            fVar.e(3, this.f388700e);
            fVar.e(4, this.f388701f);
            fVar.e(5, this.f388702g);
            fVar.e(6, this.f388703h);
            java.lang.String str = this.f388704i;
            if (str != null) {
                fVar.j(8, str);
            }
            fVar.e(9, this.f388705m);
            java.lang.String str2 = this.f388706n;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.a(11, this.f388707o);
            fVar.e(12, this.f388708p);
            fVar.e(13, this.f388709q);
            fVar.a(14, this.f388710r);
            com.tencent.mm.protobuf.g gVar = this.f388711s;
            if (gVar != null) {
                fVar.b(15, gVar);
            }
            fVar.e(16, this.f388712t);
            fVar.e(17, this.f388713u);
            fVar.a(18, this.f388714v);
            fVar.a(19, this.f388715w);
            fVar.e(20, this.f388716x);
            fVar.e(21, this.f388717y);
            fVar.e(22, this.f388718z);
            fVar.e(23, this.A);
            fVar.e(24, this.B);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388699d) + 0 + b36.f.e(3, this.f388700e) + b36.f.e(4, this.f388701f) + b36.f.e(5, this.f388702g) + b36.f.e(6, this.f388703h);
            java.lang.String str3 = this.f388704i;
            if (str3 != null) {
                e17 += b36.f.j(8, str3);
            }
            int e18 = e17 + b36.f.e(9, this.f388705m);
            java.lang.String str4 = this.f388706n;
            if (str4 != null) {
                e18 += b36.f.j(10, str4);
            }
            int a17 = e18 + b36.f.a(11, this.f388707o) + b36.f.e(12, this.f388708p) + b36.f.e(13, this.f388709q) + b36.f.a(14, this.f388710r);
            com.tencent.mm.protobuf.g gVar2 = this.f388711s;
            if (gVar2 != null) {
                a17 += b36.f.b(15, gVar2);
            }
            return a17 + b36.f.e(16, this.f388712t) + b36.f.e(17, this.f388713u) + b36.f.a(18, this.f388714v) + b36.f.a(19, this.f388715w) + b36.f.e(20, this.f388716x) + b36.f.e(21, this.f388717y) + b36.f.e(22, this.f388718z) + b36.f.e(23, this.A) + b36.f.e(24, this.B);
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
        r45.vz3 vz3Var = (r45.vz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vz3Var.f388699d = aVar2.g(intValue);
                return 0;
            case 2:
            case 7:
            default:
                return -1;
            case 3:
                vz3Var.f388700e = aVar2.g(intValue);
                return 0;
            case 4:
                vz3Var.f388701f = aVar2.g(intValue);
                return 0;
            case 5:
                vz3Var.f388702g = aVar2.g(intValue);
                return 0;
            case 6:
                vz3Var.f388703h = aVar2.g(intValue);
                return 0;
            case 8:
                vz3Var.f388704i = aVar2.k(intValue);
                return 0;
            case 9:
                vz3Var.f388705m = aVar2.g(intValue);
                return 0;
            case 10:
                vz3Var.f388706n = aVar2.k(intValue);
                return 0;
            case 11:
                vz3Var.f388707o = aVar2.c(intValue);
                return 0;
            case 12:
                vz3Var.f388708p = aVar2.g(intValue);
                return 0;
            case 13:
                vz3Var.f388709q = aVar2.g(intValue);
                return 0;
            case 14:
                vz3Var.f388710r = aVar2.c(intValue);
                return 0;
            case 15:
                vz3Var.f388711s = aVar2.d(intValue);
                return 0;
            case 16:
                vz3Var.f388712t = aVar2.g(intValue);
                return 0;
            case 17:
                vz3Var.f388713u = aVar2.g(intValue);
                return 0;
            case 18:
                vz3Var.f388714v = aVar2.c(intValue);
                return 0;
            case 19:
                vz3Var.f388715w = aVar2.c(intValue);
                return 0;
            case 20:
                vz3Var.f388716x = aVar2.g(intValue);
                return 0;
            case 21:
                vz3Var.f388717y = aVar2.g(intValue);
                return 0;
            case 22:
                vz3Var.f388718z = aVar2.g(intValue);
                return 0;
            case 23:
                vz3Var.A = aVar2.g(intValue);
                return 0;
            case 24:
                vz3Var.B = aVar2.g(intValue);
                return 0;
        }
    }
}
