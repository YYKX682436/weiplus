package ww1;

/* loaded from: classes15.dex */
public class g2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f450195d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f450196e;

    /* renamed from: f, reason: collision with root package name */
    public double f450197f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f450198g;

    /* renamed from: h, reason: collision with root package name */
    public int f450199h;

    /* renamed from: i, reason: collision with root package name */
    public int f450200i;

    /* renamed from: m, reason: collision with root package name */
    public int f450201m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f450202n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f450203o;

    /* renamed from: p, reason: collision with root package name */
    public int f450204p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f450205q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f450206r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ww1.g2)) {
            return false;
        }
        ww1.g2 g2Var = (ww1.g2) fVar;
        return n51.f.a(this.f450195d, g2Var.f450195d) && n51.f.a(this.f450196e, g2Var.f450196e) && n51.f.a(java.lang.Double.valueOf(this.f450197f), java.lang.Double.valueOf(g2Var.f450197f)) && n51.f.a(this.f450198g, g2Var.f450198g) && n51.f.a(java.lang.Integer.valueOf(this.f450199h), java.lang.Integer.valueOf(g2Var.f450199h)) && n51.f.a(java.lang.Integer.valueOf(this.f450200i), java.lang.Integer.valueOf(g2Var.f450200i)) && n51.f.a(java.lang.Integer.valueOf(this.f450201m), java.lang.Integer.valueOf(g2Var.f450201m)) && n51.f.a(this.f450202n, g2Var.f450202n) && n51.f.a(this.f450203o, g2Var.f450203o) && n51.f.a(java.lang.Integer.valueOf(this.f450204p), java.lang.Integer.valueOf(g2Var.f450204p)) && n51.f.a(this.f450205q, g2Var.f450205q) && n51.f.a(this.f450206r, g2Var.f450206r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f450195d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f450196e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f450197f);
            java.lang.String str3 = this.f450198g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f450199h);
            fVar.e(6, this.f450200i);
            fVar.e(7, this.f450201m);
            java.lang.String str4 = this.f450202n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f450203o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f450204p);
            java.lang.String str6 = this.f450205q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f450206r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f450195d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f450196e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int c17 = j17 + b36.f.c(3, this.f450197f);
            java.lang.String str10 = this.f450198g;
            if (str10 != null) {
                c17 += b36.f.j(4, str10);
            }
            int e17 = c17 + b36.f.e(5, this.f450199h) + b36.f.e(6, this.f450200i) + b36.f.e(7, this.f450201m);
            java.lang.String str11 = this.f450202n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f450203o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            int e18 = e17 + b36.f.e(10, this.f450204p);
            java.lang.String str13 = this.f450205q;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f450206r;
            return str14 != null ? e18 + b36.f.j(12, str14) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ww1.g2 g2Var = (ww1.g2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g2Var.f450195d = aVar2.k(intValue);
                return 0;
            case 2:
                g2Var.f450196e = aVar2.k(intValue);
                return 0;
            case 3:
                g2Var.f450197f = aVar2.e(intValue);
                return 0;
            case 4:
                g2Var.f450198g = aVar2.k(intValue);
                return 0;
            case 5:
                g2Var.f450199h = aVar2.g(intValue);
                return 0;
            case 6:
                g2Var.f450200i = aVar2.g(intValue);
                return 0;
            case 7:
                g2Var.f450201m = aVar2.g(intValue);
                return 0;
            case 8:
                g2Var.f450202n = aVar2.k(intValue);
                return 0;
            case 9:
                g2Var.f450203o = aVar2.k(intValue);
                return 0;
            case 10:
                g2Var.f450204p = aVar2.g(intValue);
                return 0;
            case 11:
                g2Var.f450205q = aVar2.k(intValue);
                return 0;
            case 12:
                g2Var.f450206r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
