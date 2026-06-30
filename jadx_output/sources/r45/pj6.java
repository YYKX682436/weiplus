package r45;

/* loaded from: classes2.dex */
public class pj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383105d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383106e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383107f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383108g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383109h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383110i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383111m;

    /* renamed from: n, reason: collision with root package name */
    public int f383112n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383113o;

    /* renamed from: p, reason: collision with root package name */
    public int f383114p;

    /* renamed from: q, reason: collision with root package name */
    public int f383115q;

    /* renamed from: r, reason: collision with root package name */
    public int f383116r;

    /* renamed from: s, reason: collision with root package name */
    public int f383117s;

    /* renamed from: t, reason: collision with root package name */
    public long f383118t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f383119u;

    /* renamed from: v, reason: collision with root package name */
    public int f383120v;

    /* renamed from: w, reason: collision with root package name */
    public int f383121w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pj6)) {
            return false;
        }
        r45.pj6 pj6Var = (r45.pj6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383105d), java.lang.Integer.valueOf(pj6Var.f383105d)) && n51.f.a(this.f383106e, pj6Var.f383106e) && n51.f.a(this.f383107f, pj6Var.f383107f) && n51.f.a(this.f383108g, pj6Var.f383108g) && n51.f.a(this.f383109h, pj6Var.f383109h) && n51.f.a(this.f383110i, pj6Var.f383110i) && n51.f.a(this.f383111m, pj6Var.f383111m) && n51.f.a(java.lang.Integer.valueOf(this.f383112n), java.lang.Integer.valueOf(pj6Var.f383112n)) && n51.f.a(this.f383113o, pj6Var.f383113o) && n51.f.a(java.lang.Integer.valueOf(this.f383114p), java.lang.Integer.valueOf(pj6Var.f383114p)) && n51.f.a(java.lang.Integer.valueOf(this.f383115q), java.lang.Integer.valueOf(pj6Var.f383115q)) && n51.f.a(java.lang.Integer.valueOf(this.f383116r), java.lang.Integer.valueOf(pj6Var.f383116r)) && n51.f.a(java.lang.Integer.valueOf(this.f383117s), java.lang.Integer.valueOf(pj6Var.f383117s)) && n51.f.a(java.lang.Long.valueOf(this.f383118t), java.lang.Long.valueOf(pj6Var.f383118t)) && n51.f.a(this.f383119u, pj6Var.f383119u) && n51.f.a(java.lang.Integer.valueOf(this.f383120v), java.lang.Integer.valueOf(pj6Var.f383120v)) && n51.f.a(java.lang.Integer.valueOf(this.f383121w), java.lang.Integer.valueOf(pj6Var.f383121w));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383105d);
            java.lang.String str = this.f383106e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383107f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383108g;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f383109h;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f383110i;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f383111m;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f383112n);
            java.lang.String str7 = this.f383113o;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            fVar.e(16, this.f383114p);
            fVar.e(17, this.f383115q);
            fVar.e(18, this.f383116r);
            fVar.e(19, this.f383117s);
            fVar.h(20, this.f383118t);
            java.lang.String str8 = this.f383119u;
            if (str8 != null) {
                fVar.j(21, str8);
            }
            fVar.e(22, this.f383120v);
            fVar.e(23, this.f383121w);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383105d) + 0;
            java.lang.String str9 = this.f383106e;
            if (str9 != null) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f383107f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f383108g;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f383109h;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f383110i;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f383111m;
            if (str14 != null) {
                e17 += b36.f.j(10, str14);
            }
            int e18 = e17 + b36.f.e(11, this.f383112n);
            java.lang.String str15 = this.f383113o;
            if (str15 != null) {
                e18 += b36.f.j(15, str15);
            }
            int e19 = e18 + b36.f.e(16, this.f383114p) + b36.f.e(17, this.f383115q) + b36.f.e(18, this.f383116r) + b36.f.e(19, this.f383117s) + b36.f.h(20, this.f383118t);
            java.lang.String str16 = this.f383119u;
            if (str16 != null) {
                e19 += b36.f.j(21, str16);
            }
            return e19 + b36.f.e(22, this.f383120v) + b36.f.e(23, this.f383121w);
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
        r45.pj6 pj6Var = (r45.pj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pj6Var.f383105d = aVar2.g(intValue);
                return 0;
            case 2:
                pj6Var.f383106e = aVar2.k(intValue);
                return 0;
            case 3:
                pj6Var.f383107f = aVar2.k(intValue);
                return 0;
            case 4:
            case 5:
            case 7:
            case 12:
            case 13:
            case 14:
            default:
                return -1;
            case 6:
                pj6Var.f383108g = aVar2.k(intValue);
                return 0;
            case 8:
                pj6Var.f383109h = aVar2.k(intValue);
                return 0;
            case 9:
                pj6Var.f383110i = aVar2.k(intValue);
                return 0;
            case 10:
                pj6Var.f383111m = aVar2.k(intValue);
                return 0;
            case 11:
                pj6Var.f383112n = aVar2.g(intValue);
                return 0;
            case 15:
                pj6Var.f383113o = aVar2.k(intValue);
                return 0;
            case 16:
                pj6Var.f383114p = aVar2.g(intValue);
                return 0;
            case 17:
                pj6Var.f383115q = aVar2.g(intValue);
                return 0;
            case 18:
                pj6Var.f383116r = aVar2.g(intValue);
                return 0;
            case 19:
                pj6Var.f383117s = aVar2.g(intValue);
                return 0;
            case 20:
                pj6Var.f383118t = aVar2.i(intValue);
                return 0;
            case 21:
                pj6Var.f383119u = aVar2.k(intValue);
                return 0;
            case 22:
                pj6Var.f383120v = aVar2.g(intValue);
                return 0;
            case 23:
                pj6Var.f383121w = aVar2.g(intValue);
                return 0;
        }
    }
}
