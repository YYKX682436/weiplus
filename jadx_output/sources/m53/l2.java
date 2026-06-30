package m53;

/* loaded from: classes8.dex */
public class l2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323867d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323868e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323869f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323870g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323871h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f323872i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323873m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f323874n;

    /* renamed from: o, reason: collision with root package name */
    public double f323875o;

    /* renamed from: p, reason: collision with root package name */
    public int f323876p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f323877q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f323878r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f323879s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.l2)) {
            return false;
        }
        m53.l2 l2Var = (m53.l2) fVar;
        return n51.f.a(this.f323867d, l2Var.f323867d) && n51.f.a(this.f323868e, l2Var.f323868e) && n51.f.a(this.f323869f, l2Var.f323869f) && n51.f.a(java.lang.Boolean.valueOf(this.f323870g), java.lang.Boolean.valueOf(l2Var.f323870g)) && n51.f.a(java.lang.Boolean.valueOf(this.f323871h), java.lang.Boolean.valueOf(l2Var.f323871h)) && n51.f.a(java.lang.Boolean.valueOf(this.f323872i), java.lang.Boolean.valueOf(l2Var.f323872i)) && n51.f.a(this.f323873m, l2Var.f323873m) && n51.f.a(java.lang.Boolean.valueOf(this.f323874n), java.lang.Boolean.valueOf(l2Var.f323874n)) && n51.f.a(java.lang.Double.valueOf(this.f323875o), java.lang.Double.valueOf(l2Var.f323875o)) && n51.f.a(java.lang.Integer.valueOf(this.f323876p), java.lang.Integer.valueOf(l2Var.f323876p)) && n51.f.a(java.lang.Boolean.valueOf(this.f323877q), java.lang.Boolean.valueOf(l2Var.f323877q)) && n51.f.a(this.f323878r, l2Var.f323878r) && n51.f.a(java.lang.Boolean.valueOf(this.f323879s), java.lang.Boolean.valueOf(l2Var.f323879s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323867d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323868e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323869f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f323870g);
            fVar.a(5, this.f323871h);
            fVar.a(6, this.f323872i);
            java.lang.String str4 = this.f323873m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.a(8, this.f323874n);
            fVar.c(9, this.f323875o);
            fVar.e(10, this.f323876p);
            fVar.a(11, this.f323877q);
            java.lang.String str5 = this.f323878r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.a(13, this.f323879s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f323867d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f323868e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f323869f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int a17 = j17 + b36.f.a(4, this.f323870g) + b36.f.a(5, this.f323871h) + b36.f.a(6, this.f323872i);
            java.lang.String str9 = this.f323873m;
            if (str9 != null) {
                a17 += b36.f.j(7, str9);
            }
            int a18 = a17 + b36.f.a(8, this.f323874n) + b36.f.c(9, this.f323875o) + b36.f.e(10, this.f323876p) + b36.f.a(11, this.f323877q);
            java.lang.String str10 = this.f323878r;
            if (str10 != null) {
                a18 += b36.f.j(12, str10);
            }
            return a18 + b36.f.a(13, this.f323879s);
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
        m53.l2 l2Var = (m53.l2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l2Var.f323867d = aVar2.k(intValue);
                return 0;
            case 2:
                l2Var.f323868e = aVar2.k(intValue);
                return 0;
            case 3:
                l2Var.f323869f = aVar2.k(intValue);
                return 0;
            case 4:
                l2Var.f323870g = aVar2.c(intValue);
                return 0;
            case 5:
                l2Var.f323871h = aVar2.c(intValue);
                return 0;
            case 6:
                l2Var.f323872i = aVar2.c(intValue);
                return 0;
            case 7:
                l2Var.f323873m = aVar2.k(intValue);
                return 0;
            case 8:
                l2Var.f323874n = aVar2.c(intValue);
                return 0;
            case 9:
                l2Var.f323875o = aVar2.e(intValue);
                return 0;
            case 10:
                l2Var.f323876p = aVar2.g(intValue);
                return 0;
            case 11:
                l2Var.f323877q = aVar2.c(intValue);
                return 0;
            case 12:
                l2Var.f323878r = aVar2.k(intValue);
                return 0;
            case 13:
                l2Var.f323879s = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
