package r45;

/* loaded from: classes4.dex */
public class ed4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f373311d;

    /* renamed from: e, reason: collision with root package name */
    public float f373312e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373313f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373314g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373315h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373316i;

    /* renamed from: m, reason: collision with root package name */
    public int f373317m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373318n;

    /* renamed from: o, reason: collision with root package name */
    public int f373319o;

    /* renamed from: p, reason: collision with root package name */
    public int f373320p;

    /* renamed from: q, reason: collision with root package name */
    public int f373321q;

    /* renamed from: r, reason: collision with root package name */
    public float f373322r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f373323s;

    /* renamed from: t, reason: collision with root package name */
    public int f373324t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f373325u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f373326v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ed4)) {
            return false;
        }
        r45.ed4 ed4Var = (r45.ed4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f373311d), java.lang.Float.valueOf(ed4Var.f373311d)) && n51.f.a(java.lang.Float.valueOf(this.f373312e), java.lang.Float.valueOf(ed4Var.f373312e)) && n51.f.a(this.f373313f, ed4Var.f373313f) && n51.f.a(this.f373314g, ed4Var.f373314g) && n51.f.a(this.f373315h, ed4Var.f373315h) && n51.f.a(this.f373316i, ed4Var.f373316i) && n51.f.a(java.lang.Integer.valueOf(this.f373317m), java.lang.Integer.valueOf(ed4Var.f373317m)) && n51.f.a(this.f373318n, ed4Var.f373318n) && n51.f.a(java.lang.Integer.valueOf(this.f373319o), java.lang.Integer.valueOf(ed4Var.f373319o)) && n51.f.a(java.lang.Integer.valueOf(this.f373320p), java.lang.Integer.valueOf(ed4Var.f373320p)) && n51.f.a(java.lang.Integer.valueOf(this.f373321q), java.lang.Integer.valueOf(ed4Var.f373321q)) && n51.f.a(java.lang.Float.valueOf(this.f373322r), java.lang.Float.valueOf(ed4Var.f373322r)) && n51.f.a(this.f373323s, ed4Var.f373323s) && n51.f.a(java.lang.Integer.valueOf(this.f373324t), java.lang.Integer.valueOf(ed4Var.f373324t)) && n51.f.a(this.f373325u, ed4Var.f373325u) && n51.f.a(this.f373326v, ed4Var.f373326v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f373311d);
            fVar.d(2, this.f373312e);
            java.lang.String str = this.f373313f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f373314g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373315h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f373316i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f373317m);
            java.lang.String str5 = this.f373318n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f373319o);
            fVar.e(10, this.f373320p);
            fVar.e(11, this.f373321q);
            fVar.d(12, this.f373322r);
            com.tencent.mm.protobuf.g gVar = this.f373323s;
            if (gVar != null) {
                fVar.b(13, gVar);
            }
            fVar.e(14, this.f373324t);
            java.lang.String str6 = this.f373325u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f373326v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = b36.f.d(1, this.f373311d) + 0 + b36.f.d(2, this.f373312e);
            java.lang.String str8 = this.f373313f;
            if (str8 != null) {
                d17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f373314g;
            if (str9 != null) {
                d17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f373315h;
            if (str10 != null) {
                d17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f373316i;
            if (str11 != null) {
                d17 += b36.f.j(6, str11);
            }
            int e17 = d17 + b36.f.e(7, this.f373317m);
            java.lang.String str12 = this.f373318n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            int e18 = e17 + b36.f.e(9, this.f373319o) + b36.f.e(10, this.f373320p) + b36.f.e(11, this.f373321q) + b36.f.d(12, this.f373322r);
            com.tencent.mm.protobuf.g gVar2 = this.f373323s;
            if (gVar2 != null) {
                e18 += b36.f.b(13, gVar2);
            }
            int e19 = e18 + b36.f.e(14, this.f373324t);
            java.lang.String str13 = this.f373325u;
            if (str13 != null) {
                e19 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f373326v;
            return str14 != null ? e19 + b36.f.j(16, str14) : e19;
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
        r45.ed4 ed4Var = (r45.ed4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ed4Var.f373311d = aVar2.f(intValue);
                return 0;
            case 2:
                ed4Var.f373312e = aVar2.f(intValue);
                return 0;
            case 3:
                ed4Var.f373313f = aVar2.k(intValue);
                return 0;
            case 4:
                ed4Var.f373314g = aVar2.k(intValue);
                return 0;
            case 5:
                ed4Var.f373315h = aVar2.k(intValue);
                return 0;
            case 6:
                ed4Var.f373316i = aVar2.k(intValue);
                return 0;
            case 7:
                ed4Var.f373317m = aVar2.g(intValue);
                return 0;
            case 8:
                ed4Var.f373318n = aVar2.k(intValue);
                return 0;
            case 9:
                ed4Var.f373319o = aVar2.g(intValue);
                return 0;
            case 10:
                ed4Var.f373320p = aVar2.g(intValue);
                return 0;
            case 11:
                ed4Var.f373321q = aVar2.g(intValue);
                return 0;
            case 12:
                ed4Var.f373322r = aVar2.f(intValue);
                return 0;
            case 13:
                ed4Var.f373323s = aVar2.d(intValue);
                return 0;
            case 14:
                ed4Var.f373324t = aVar2.g(intValue);
                return 0;
            case 15:
                ed4Var.f373325u = aVar2.k(intValue);
                return 0;
            case 16:
                ed4Var.f373326v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
