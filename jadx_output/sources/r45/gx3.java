package r45;

/* loaded from: classes2.dex */
public class gx3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375597d;

    /* renamed from: e, reason: collision with root package name */
    public int f375598e;

    /* renamed from: f, reason: collision with root package name */
    public int f375599f;

    /* renamed from: g, reason: collision with root package name */
    public int f375600g;

    /* renamed from: h, reason: collision with root package name */
    public int f375601h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375602i;

    /* renamed from: m, reason: collision with root package name */
    public int f375603m;

    /* renamed from: n, reason: collision with root package name */
    public int f375604n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375605o;

    /* renamed from: p, reason: collision with root package name */
    public int f375606p;

    /* renamed from: q, reason: collision with root package name */
    public int f375607q;

    /* renamed from: r, reason: collision with root package name */
    public int f375608r;

    /* renamed from: s, reason: collision with root package name */
    public int f375609s;

    /* renamed from: t, reason: collision with root package name */
    public int f375610t;

    /* renamed from: u, reason: collision with root package name */
    public int f375611u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f375612v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f375613w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gx3)) {
            return false;
        }
        r45.gx3 gx3Var = (r45.gx3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375597d), java.lang.Integer.valueOf(gx3Var.f375597d)) && n51.f.a(java.lang.Integer.valueOf(this.f375598e), java.lang.Integer.valueOf(gx3Var.f375598e)) && n51.f.a(java.lang.Integer.valueOf(this.f375599f), java.lang.Integer.valueOf(gx3Var.f375599f)) && n51.f.a(java.lang.Integer.valueOf(this.f375600g), java.lang.Integer.valueOf(gx3Var.f375600g)) && n51.f.a(java.lang.Integer.valueOf(this.f375601h), java.lang.Integer.valueOf(gx3Var.f375601h)) && n51.f.a(this.f375602i, gx3Var.f375602i) && n51.f.a(java.lang.Integer.valueOf(this.f375603m), java.lang.Integer.valueOf(gx3Var.f375603m)) && n51.f.a(java.lang.Integer.valueOf(this.f375604n), java.lang.Integer.valueOf(gx3Var.f375604n)) && n51.f.a(this.f375605o, gx3Var.f375605o) && n51.f.a(java.lang.Integer.valueOf(this.f375606p), java.lang.Integer.valueOf(gx3Var.f375606p)) && n51.f.a(java.lang.Integer.valueOf(this.f375607q), java.lang.Integer.valueOf(gx3Var.f375607q)) && n51.f.a(java.lang.Integer.valueOf(this.f375608r), java.lang.Integer.valueOf(gx3Var.f375608r)) && n51.f.a(java.lang.Integer.valueOf(this.f375609s), java.lang.Integer.valueOf(gx3Var.f375609s)) && n51.f.a(java.lang.Integer.valueOf(this.f375610t), java.lang.Integer.valueOf(gx3Var.f375610t)) && n51.f.a(java.lang.Integer.valueOf(this.f375611u), java.lang.Integer.valueOf(gx3Var.f375611u)) && n51.f.a(this.f375612v, gx3Var.f375612v) && n51.f.a(this.f375613w, gx3Var.f375613w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375597d);
            fVar.e(2, this.f375598e);
            fVar.e(3, this.f375599f);
            fVar.e(4, this.f375600g);
            fVar.e(6, this.f375601h);
            java.lang.String str = this.f375602i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f375603m);
            fVar.e(9, this.f375604n);
            java.lang.String str2 = this.f375605o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.e(11, this.f375606p);
            fVar.e(12, this.f375607q);
            fVar.e(13, this.f375608r);
            fVar.e(14, this.f375609s);
            fVar.e(15, this.f375610t);
            fVar.e(16, this.f375611u);
            java.lang.String str3 = this.f375612v;
            if (str3 != null) {
                fVar.j(17, str3);
            }
            java.lang.String str4 = this.f375613w;
            if (str4 != null) {
                fVar.j(18, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375597d) + 0 + b36.f.e(2, this.f375598e) + b36.f.e(3, this.f375599f) + b36.f.e(4, this.f375600g) + b36.f.e(6, this.f375601h);
            java.lang.String str5 = this.f375602i;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            int e18 = e17 + b36.f.e(8, this.f375603m) + b36.f.e(9, this.f375604n);
            java.lang.String str6 = this.f375605o;
            if (str6 != null) {
                e18 += b36.f.j(10, str6);
            }
            int e19 = e18 + b36.f.e(11, this.f375606p) + b36.f.e(12, this.f375607q) + b36.f.e(13, this.f375608r) + b36.f.e(14, this.f375609s) + b36.f.e(15, this.f375610t) + b36.f.e(16, this.f375611u);
            java.lang.String str7 = this.f375612v;
            if (str7 != null) {
                e19 += b36.f.j(17, str7);
            }
            java.lang.String str8 = this.f375613w;
            return str8 != null ? e19 + b36.f.j(18, str8) : e19;
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
        r45.gx3 gx3Var = (r45.gx3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gx3Var.f375597d = aVar2.g(intValue);
                return 0;
            case 2:
                gx3Var.f375598e = aVar2.g(intValue);
                return 0;
            case 3:
                gx3Var.f375599f = aVar2.g(intValue);
                return 0;
            case 4:
                gx3Var.f375600g = aVar2.g(intValue);
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                gx3Var.f375601h = aVar2.g(intValue);
                return 0;
            case 7:
                gx3Var.f375602i = aVar2.k(intValue);
                return 0;
            case 8:
                gx3Var.f375603m = aVar2.g(intValue);
                return 0;
            case 9:
                gx3Var.f375604n = aVar2.g(intValue);
                return 0;
            case 10:
                gx3Var.f375605o = aVar2.k(intValue);
                return 0;
            case 11:
                gx3Var.f375606p = aVar2.g(intValue);
                return 0;
            case 12:
                gx3Var.f375607q = aVar2.g(intValue);
                return 0;
            case 13:
                gx3Var.f375608r = aVar2.g(intValue);
                return 0;
            case 14:
                gx3Var.f375609s = aVar2.g(intValue);
                return 0;
            case 15:
                gx3Var.f375610t = aVar2.g(intValue);
                return 0;
            case 16:
                gx3Var.f375611u = aVar2.g(intValue);
                return 0;
            case 17:
                gx3Var.f375612v = aVar2.k(intValue);
                return 0;
            case 18:
                gx3Var.f375613w = aVar2.k(intValue);
                return 0;
        }
    }
}
