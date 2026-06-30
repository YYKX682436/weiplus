package r45;

/* loaded from: classes14.dex */
public class z70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f391758d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391759e;

    /* renamed from: f, reason: collision with root package name */
    public int f391760f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f391761g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f391762h;

    /* renamed from: i, reason: collision with root package name */
    public int f391763i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391764m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f391765n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f391766o;

    /* renamed from: p, reason: collision with root package name */
    public int f391767p;

    /* renamed from: q, reason: collision with root package name */
    public int f391768q;

    /* renamed from: r, reason: collision with root package name */
    public int f391769r;

    /* renamed from: s, reason: collision with root package name */
    public int f391770s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f391771t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f391772u;

    /* renamed from: v, reason: collision with root package name */
    public long f391773v;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z70)) {
            return false;
        }
        r45.z70 z70Var = (r45.z70) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f391758d), java.lang.Long.valueOf(z70Var.f391758d)) && n51.f.a(this.f391759e, z70Var.f391759e) && n51.f.a(java.lang.Integer.valueOf(this.f391760f), java.lang.Integer.valueOf(z70Var.f391760f)) && n51.f.a(java.lang.Boolean.valueOf(this.f391761g), java.lang.Boolean.valueOf(z70Var.f391761g)) && n51.f.a(java.lang.Boolean.valueOf(this.f391762h), java.lang.Boolean.valueOf(z70Var.f391762h)) && n51.f.a(java.lang.Integer.valueOf(this.f391763i), java.lang.Integer.valueOf(z70Var.f391763i)) && n51.f.a(this.f391764m, z70Var.f391764m) && n51.f.a(this.f391765n, z70Var.f391765n) && n51.f.a(this.f391766o, z70Var.f391766o) && n51.f.a(java.lang.Integer.valueOf(this.f391767p), java.lang.Integer.valueOf(z70Var.f391767p)) && n51.f.a(java.lang.Integer.valueOf(this.f391768q), java.lang.Integer.valueOf(z70Var.f391768q)) && n51.f.a(java.lang.Integer.valueOf(this.f391769r), java.lang.Integer.valueOf(z70Var.f391769r)) && n51.f.a(java.lang.Integer.valueOf(this.f391770s), java.lang.Integer.valueOf(z70Var.f391770s)) && n51.f.a(this.f391771t, z70Var.f391771t) && n51.f.a(this.f391772u, z70Var.f391772u) && n51.f.a(java.lang.Long.valueOf(this.f391773v), java.lang.Long.valueOf(z70Var.f391773v));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f391758d);
            java.lang.String str = this.f391759e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391760f);
            fVar.a(4, this.f391761g);
            fVar.a(5, this.f391762h);
            fVar.e(6, this.f391763i);
            java.lang.String str2 = this.f391764m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f391765n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f391766o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f391767p);
            fVar.e(11, this.f391768q);
            fVar.e(12, this.f391769r);
            fVar.e(13, this.f391770s);
            java.lang.String str5 = this.f391771t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f391772u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            fVar.h(16, this.f391773v);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f391758d) + 0;
            java.lang.String str7 = this.f391759e;
            if (str7 != null) {
                h17 += b36.f.j(2, str7);
            }
            int e17 = h17 + b36.f.e(3, this.f391760f) + b36.f.a(4, this.f391761g) + b36.f.a(5, this.f391762h) + b36.f.e(6, this.f391763i);
            java.lang.String str8 = this.f391764m;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f391765n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f391766o;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f391767p) + b36.f.e(11, this.f391768q) + b36.f.e(12, this.f391769r) + b36.f.e(13, this.f391770s);
            java.lang.String str11 = this.f391771t;
            if (str11 != null) {
                e18 += b36.f.j(14, str11);
            }
            java.lang.String str12 = this.f391772u;
            if (str12 != null) {
                e18 += b36.f.j(15, str12);
            }
            return e18 + b36.f.h(16, this.f391773v);
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
        r45.z70 z70Var = (r45.z70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                z70Var.f391758d = aVar2.i(intValue);
                return 0;
            case 2:
                z70Var.f391759e = aVar2.k(intValue);
                return 0;
            case 3:
                z70Var.f391760f = aVar2.g(intValue);
                return 0;
            case 4:
                z70Var.f391761g = aVar2.c(intValue);
                return 0;
            case 5:
                z70Var.f391762h = aVar2.c(intValue);
                return 0;
            case 6:
                z70Var.f391763i = aVar2.g(intValue);
                return 0;
            case 7:
                z70Var.f391764m = aVar2.k(intValue);
                return 0;
            case 8:
                z70Var.f391765n = aVar2.k(intValue);
                return 0;
            case 9:
                z70Var.f391766o = aVar2.k(intValue);
                return 0;
            case 10:
                z70Var.f391767p = aVar2.g(intValue);
                return 0;
            case 11:
                z70Var.f391768q = aVar2.g(intValue);
                return 0;
            case 12:
                z70Var.f391769r = aVar2.g(intValue);
                return 0;
            case 13:
                z70Var.f391770s = aVar2.g(intValue);
                return 0;
            case 14:
                z70Var.f391771t = aVar2.k(intValue);
                return 0;
            case 15:
                z70Var.f391772u = aVar2.k(intValue);
                return 0;
            case 16:
                z70Var.f391773v = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
