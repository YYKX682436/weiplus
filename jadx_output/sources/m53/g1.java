package m53;

/* loaded from: classes8.dex */
public class g1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323692d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323693e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323694f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323695g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323696h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323697i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323698m;

    /* renamed from: n, reason: collision with root package name */
    public int f323699n;

    /* renamed from: o, reason: collision with root package name */
    public int f323700o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f323701p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g1)) {
            return false;
        }
        m53.g1 g1Var = (m53.g1) fVar;
        return n51.f.a(this.f323692d, g1Var.f323692d) && n51.f.a(this.f323693e, g1Var.f323693e) && n51.f.a(this.f323694f, g1Var.f323694f) && n51.f.a(java.lang.Boolean.valueOf(this.f323695g), java.lang.Boolean.valueOf(g1Var.f323695g)) && n51.f.a(java.lang.Boolean.valueOf(this.f323696h), java.lang.Boolean.valueOf(g1Var.f323696h)) && n51.f.a(this.f323697i, g1Var.f323697i) && n51.f.a(this.f323698m, g1Var.f323698m) && n51.f.a(java.lang.Integer.valueOf(this.f323699n), java.lang.Integer.valueOf(g1Var.f323699n)) && n51.f.a(java.lang.Integer.valueOf(this.f323700o), java.lang.Integer.valueOf(g1Var.f323700o)) && n51.f.a(this.f323701p, g1Var.f323701p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323692d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323693e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323694f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f323695g);
            fVar.a(5, this.f323696h);
            java.lang.String str4 = this.f323697i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f323698m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f323699n);
            fVar.e(9, this.f323700o);
            java.lang.String str6 = this.f323701p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f323692d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f323693e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f323694f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int a17 = j17 + b36.f.a(4, this.f323695g) + b36.f.a(5, this.f323696h);
            java.lang.String str10 = this.f323697i;
            if (str10 != null) {
                a17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f323698m;
            if (str11 != null) {
                a17 += b36.f.j(7, str11);
            }
            int e17 = a17 + b36.f.e(8, this.f323699n) + b36.f.e(9, this.f323700o);
            java.lang.String str12 = this.f323701p;
            return str12 != null ? e17 + b36.f.j(10, str12) : e17;
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
        m53.g1 g1Var = (m53.g1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g1Var.f323692d = aVar2.k(intValue);
                return 0;
            case 2:
                g1Var.f323693e = aVar2.k(intValue);
                return 0;
            case 3:
                g1Var.f323694f = aVar2.k(intValue);
                return 0;
            case 4:
                g1Var.f323695g = aVar2.c(intValue);
                return 0;
            case 5:
                g1Var.f323696h = aVar2.c(intValue);
                return 0;
            case 6:
                g1Var.f323697i = aVar2.k(intValue);
                return 0;
            case 7:
                g1Var.f323698m = aVar2.k(intValue);
                return 0;
            case 8:
                g1Var.f323699n = aVar2.g(intValue);
                return 0;
            case 9:
                g1Var.f323700o = aVar2.g(intValue);
                return 0;
            case 10:
                g1Var.f323701p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
