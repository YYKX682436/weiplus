package r45;

/* loaded from: classes4.dex */
public class hh4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376149d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f376150e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376151f;

    /* renamed from: g, reason: collision with root package name */
    public int f376152g;

    /* renamed from: h, reason: collision with root package name */
    public int f376153h;

    /* renamed from: i, reason: collision with root package name */
    public int f376154i;

    /* renamed from: m, reason: collision with root package name */
    public int f376155m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f376156n;

    /* renamed from: o, reason: collision with root package name */
    public int f376157o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f376158p;

    /* renamed from: q, reason: collision with root package name */
    public int f376159q;

    /* renamed from: r, reason: collision with root package name */
    public int f376160r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hh4)) {
            return false;
        }
        r45.hh4 hh4Var = (r45.hh4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376149d), java.lang.Integer.valueOf(hh4Var.f376149d)) && n51.f.a(java.lang.Integer.valueOf(this.f376150e), java.lang.Integer.valueOf(hh4Var.f376150e)) && n51.f.a(this.f376151f, hh4Var.f376151f) && n51.f.a(java.lang.Integer.valueOf(this.f376152g), java.lang.Integer.valueOf(hh4Var.f376152g)) && n51.f.a(java.lang.Integer.valueOf(this.f376153h), java.lang.Integer.valueOf(hh4Var.f376153h)) && n51.f.a(java.lang.Integer.valueOf(this.f376154i), java.lang.Integer.valueOf(hh4Var.f376154i)) && n51.f.a(java.lang.Integer.valueOf(this.f376155m), java.lang.Integer.valueOf(hh4Var.f376155m)) && n51.f.a(this.f376156n, hh4Var.f376156n) && n51.f.a(java.lang.Integer.valueOf(this.f376157o), java.lang.Integer.valueOf(hh4Var.f376157o)) && n51.f.a(this.f376158p, hh4Var.f376158p) && n51.f.a(java.lang.Integer.valueOf(this.f376159q), java.lang.Integer.valueOf(hh4Var.f376159q)) && n51.f.a(java.lang.Integer.valueOf(this.f376160r), java.lang.Integer.valueOf(hh4Var.f376160r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376149d);
            fVar.e(2, this.f376150e);
            java.lang.String str = this.f376151f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f376152g);
            fVar.e(5, this.f376153h);
            fVar.e(6, this.f376154i);
            fVar.e(7, this.f376155m);
            java.lang.String str2 = this.f376156n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.e(9, this.f376157o);
            java.lang.String str3 = this.f376158p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f376159q);
            fVar.e(12, this.f376160r);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376149d) + 0 + b36.f.e(2, this.f376150e);
            java.lang.String str4 = this.f376151f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            int e18 = e17 + b36.f.e(4, this.f376152g) + b36.f.e(5, this.f376153h) + b36.f.e(6, this.f376154i) + b36.f.e(7, this.f376155m);
            java.lang.String str5 = this.f376156n;
            if (str5 != null) {
                e18 += b36.f.j(8, str5);
            }
            int e19 = e18 + b36.f.e(9, this.f376157o);
            java.lang.String str6 = this.f376158p;
            if (str6 != null) {
                e19 += b36.f.j(10, str6);
            }
            return e19 + b36.f.e(11, this.f376159q) + b36.f.e(12, this.f376160r);
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
        r45.hh4 hh4Var = (r45.hh4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hh4Var.f376149d = aVar2.g(intValue);
                return 0;
            case 2:
                hh4Var.f376150e = aVar2.g(intValue);
                return 0;
            case 3:
                hh4Var.f376151f = aVar2.k(intValue);
                return 0;
            case 4:
                hh4Var.f376152g = aVar2.g(intValue);
                return 0;
            case 5:
                hh4Var.f376153h = aVar2.g(intValue);
                return 0;
            case 6:
                hh4Var.f376154i = aVar2.g(intValue);
                return 0;
            case 7:
                hh4Var.f376155m = aVar2.g(intValue);
                return 0;
            case 8:
                hh4Var.f376156n = aVar2.k(intValue);
                return 0;
            case 9:
                hh4Var.f376157o = aVar2.g(intValue);
                return 0;
            case 10:
                hh4Var.f376158p = aVar2.k(intValue);
                return 0;
            case 11:
                hh4Var.f376159q = aVar2.g(intValue);
                return 0;
            case 12:
                hh4Var.f376160r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
