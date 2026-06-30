package r45;

/* loaded from: classes8.dex */
public class gv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f375536d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375537e;

    /* renamed from: f, reason: collision with root package name */
    public int f375538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375539g;

    /* renamed from: h, reason: collision with root package name */
    public int f375540h;

    /* renamed from: i, reason: collision with root package name */
    public int f375541i;

    /* renamed from: m, reason: collision with root package name */
    public int f375542m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375543n;

    /* renamed from: o, reason: collision with root package name */
    public int f375544o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f375545p;

    /* renamed from: q, reason: collision with root package name */
    public int f375546q;

    /* renamed from: r, reason: collision with root package name */
    public int f375547r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f375548s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gv)) {
            return false;
        }
        r45.gv gvVar = (r45.gv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f375536d), java.lang.Integer.valueOf(gvVar.f375536d)) && n51.f.a(this.f375537e, gvVar.f375537e) && n51.f.a(java.lang.Integer.valueOf(this.f375538f), java.lang.Integer.valueOf(gvVar.f375538f)) && n51.f.a(this.f375539g, gvVar.f375539g) && n51.f.a(java.lang.Integer.valueOf(this.f375540h), java.lang.Integer.valueOf(gvVar.f375540h)) && n51.f.a(java.lang.Integer.valueOf(this.f375541i), java.lang.Integer.valueOf(gvVar.f375541i)) && n51.f.a(java.lang.Integer.valueOf(this.f375542m), java.lang.Integer.valueOf(gvVar.f375542m)) && n51.f.a(this.f375543n, gvVar.f375543n) && n51.f.a(java.lang.Integer.valueOf(this.f375544o), java.lang.Integer.valueOf(gvVar.f375544o)) && n51.f.a(this.f375545p, gvVar.f375545p) && n51.f.a(java.lang.Integer.valueOf(this.f375546q), java.lang.Integer.valueOf(gvVar.f375546q)) && n51.f.a(java.lang.Integer.valueOf(this.f375547r), java.lang.Integer.valueOf(gvVar.f375547r)) && n51.f.a(this.f375548s, gvVar.f375548s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f375536d);
            java.lang.String str = this.f375537e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375538f);
            java.lang.String str2 = this.f375539g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f375540h);
            fVar.e(6, this.f375541i);
            fVar.e(7, this.f375542m);
            java.lang.String str3 = this.f375543n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(10, this.f375544o);
            java.lang.String str4 = this.f375545p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.e(12, this.f375546q);
            fVar.e(13, this.f375547r);
            java.lang.String str5 = this.f375548s;
            if (str5 == null) {
                return 0;
            }
            fVar.j(14, str5);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f375536d) + 0;
            java.lang.String str6 = this.f375537e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            int e18 = e17 + b36.f.e(3, this.f375538f);
            java.lang.String str7 = this.f375539g;
            if (str7 != null) {
                e18 += b36.f.j(4, str7);
            }
            int e19 = e18 + b36.f.e(5, this.f375540h) + b36.f.e(6, this.f375541i) + b36.f.e(7, this.f375542m);
            java.lang.String str8 = this.f375543n;
            if (str8 != null) {
                e19 += b36.f.j(8, str8);
            }
            int e27 = e19 + b36.f.e(10, this.f375544o);
            java.lang.String str9 = this.f375545p;
            if (str9 != null) {
                e27 += b36.f.j(11, str9);
            }
            int e28 = e27 + b36.f.e(12, this.f375546q) + b36.f.e(13, this.f375547r);
            java.lang.String str10 = this.f375548s;
            return str10 != null ? e28 + b36.f.j(14, str10) : e28;
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
        r45.gv gvVar = (r45.gv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                gvVar.f375536d = aVar2.g(intValue);
                return 0;
            case 2:
                gvVar.f375537e = aVar2.k(intValue);
                return 0;
            case 3:
                gvVar.f375538f = aVar2.g(intValue);
                return 0;
            case 4:
                gvVar.f375539g = aVar2.k(intValue);
                return 0;
            case 5:
                gvVar.f375540h = aVar2.g(intValue);
                return 0;
            case 6:
                gvVar.f375541i = aVar2.g(intValue);
                return 0;
            case 7:
                gvVar.f375542m = aVar2.g(intValue);
                return 0;
            case 8:
                gvVar.f375543n = aVar2.k(intValue);
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                gvVar.f375544o = aVar2.g(intValue);
                return 0;
            case 11:
                gvVar.f375545p = aVar2.k(intValue);
                return 0;
            case 12:
                gvVar.f375546q = aVar2.g(intValue);
                return 0;
            case 13:
                gvVar.f375547r = aVar2.g(intValue);
                return 0;
            case 14:
                gvVar.f375548s = aVar2.k(intValue);
                return 0;
        }
    }
}
