package r45;

/* loaded from: classes9.dex */
public class dd6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372329d;

    /* renamed from: e, reason: collision with root package name */
    public int f372330e;

    /* renamed from: f, reason: collision with root package name */
    public double f372331f;

    /* renamed from: g, reason: collision with root package name */
    public double f372332g;

    /* renamed from: h, reason: collision with root package name */
    public int f372333h;

    /* renamed from: i, reason: collision with root package name */
    public int f372334i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372335m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372336n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dd6)) {
            return false;
        }
        r45.dd6 dd6Var = (r45.dd6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372329d), java.lang.Integer.valueOf(dd6Var.f372329d)) && n51.f.a(java.lang.Integer.valueOf(this.f372330e), java.lang.Integer.valueOf(dd6Var.f372330e)) && n51.f.a(java.lang.Double.valueOf(this.f372331f), java.lang.Double.valueOf(dd6Var.f372331f)) && n51.f.a(java.lang.Double.valueOf(this.f372332g), java.lang.Double.valueOf(dd6Var.f372332g)) && n51.f.a(java.lang.Integer.valueOf(this.f372333h), java.lang.Integer.valueOf(dd6Var.f372333h)) && n51.f.a(java.lang.Integer.valueOf(this.f372334i), java.lang.Integer.valueOf(dd6Var.f372334i)) && n51.f.a(this.f372335m, dd6Var.f372335m) && n51.f.a(this.f372336n, dd6Var.f372336n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372329d);
            fVar.e(2, this.f372330e);
            fVar.c(3, this.f372331f);
            fVar.c(4, this.f372332g);
            fVar.e(5, this.f372333h);
            fVar.e(6, this.f372334i);
            java.lang.String str = this.f372335m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f372336n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372329d) + 0 + b36.f.e(2, this.f372330e) + b36.f.c(3, this.f372331f) + b36.f.c(4, this.f372332g) + b36.f.e(5, this.f372333h) + b36.f.e(6, this.f372334i);
            java.lang.String str3 = this.f372335m;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            java.lang.String str4 = this.f372336n;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
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
        r45.dd6 dd6Var = (r45.dd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dd6Var.f372329d = aVar2.g(intValue);
                return 0;
            case 2:
                dd6Var.f372330e = aVar2.g(intValue);
                return 0;
            case 3:
                dd6Var.f372331f = aVar2.e(intValue);
                return 0;
            case 4:
                dd6Var.f372332g = aVar2.e(intValue);
                return 0;
            case 5:
                dd6Var.f372333h = aVar2.g(intValue);
                return 0;
            case 6:
                dd6Var.f372334i = aVar2.g(intValue);
                return 0;
            case 7:
                dd6Var.f372335m = aVar2.k(intValue);
                return 0;
            case 8:
                dd6Var.f372336n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
