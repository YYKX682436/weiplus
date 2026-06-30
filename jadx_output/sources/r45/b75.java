package r45;

/* loaded from: classes2.dex */
public class b75 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370605e;

    /* renamed from: f, reason: collision with root package name */
    public int f370606f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370607g;

    /* renamed from: h, reason: collision with root package name */
    public int f370608h;

    /* renamed from: i, reason: collision with root package name */
    public long f370609i;

    /* renamed from: m, reason: collision with root package name */
    public int f370610m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370611n;

    /* renamed from: o, reason: collision with root package name */
    public int f370612o;

    /* renamed from: p, reason: collision with root package name */
    public int f370613p;

    /* renamed from: q, reason: collision with root package name */
    public long f370614q;

    /* renamed from: r, reason: collision with root package name */
    public int f370615r;

    /* renamed from: s, reason: collision with root package name */
    public long f370616s;

    /* renamed from: t, reason: collision with root package name */
    public long f370617t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f370618u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b75)) {
            return false;
        }
        r45.b75 b75Var = (r45.b75) fVar;
        return n51.f.a(this.f370604d, b75Var.f370604d) && n51.f.a(this.f370605e, b75Var.f370605e) && n51.f.a(java.lang.Integer.valueOf(this.f370606f), java.lang.Integer.valueOf(b75Var.f370606f)) && n51.f.a(this.f370607g, b75Var.f370607g) && n51.f.a(java.lang.Integer.valueOf(this.f370608h), java.lang.Integer.valueOf(b75Var.f370608h)) && n51.f.a(java.lang.Long.valueOf(this.f370609i), java.lang.Long.valueOf(b75Var.f370609i)) && n51.f.a(java.lang.Integer.valueOf(this.f370610m), java.lang.Integer.valueOf(b75Var.f370610m)) && n51.f.a(this.f370611n, b75Var.f370611n) && n51.f.a(java.lang.Integer.valueOf(this.f370612o), java.lang.Integer.valueOf(b75Var.f370612o)) && n51.f.a(java.lang.Integer.valueOf(this.f370613p), java.lang.Integer.valueOf(b75Var.f370613p)) && n51.f.a(java.lang.Long.valueOf(this.f370614q), java.lang.Long.valueOf(b75Var.f370614q)) && n51.f.a(java.lang.Integer.valueOf(this.f370615r), java.lang.Integer.valueOf(b75Var.f370615r)) && n51.f.a(java.lang.Long.valueOf(this.f370616s), java.lang.Long.valueOf(b75Var.f370616s)) && n51.f.a(java.lang.Long.valueOf(this.f370617t), java.lang.Long.valueOf(b75Var.f370617t)) && n51.f.a(this.f370618u, b75Var.f370618u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370604d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370605e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f370606f);
            java.lang.String str3 = this.f370607g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f370608h);
            fVar.h(6, this.f370609i);
            fVar.e(7, this.f370610m);
            java.lang.String str4 = this.f370611n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f370612o);
            fVar.e(10, this.f370613p);
            fVar.h(11, this.f370614q);
            fVar.e(12, this.f370615r);
            fVar.h(13, this.f370616s);
            fVar.h(14, this.f370617t);
            java.lang.String str5 = this.f370618u;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f370604d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f370605e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f370606f);
            java.lang.String str8 = this.f370607g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            int e18 = e17 + b36.f.e(5, this.f370608h) + b36.f.h(6, this.f370609i) + b36.f.e(7, this.f370610m);
            java.lang.String str9 = this.f370611n;
            if (str9 != null) {
                e18 += b36.f.j(8, str9);
            }
            int e19 = e18 + b36.f.e(9, this.f370612o) + b36.f.e(10, this.f370613p) + b36.f.h(11, this.f370614q) + b36.f.e(12, this.f370615r) + b36.f.h(13, this.f370616s) + b36.f.h(14, this.f370617t);
            java.lang.String str10 = this.f370618u;
            return str10 != null ? e19 + b36.f.j(15, str10) : e19;
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
        r45.b75 b75Var = (r45.b75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b75Var.f370604d = aVar2.k(intValue);
                return 0;
            case 2:
                b75Var.f370605e = aVar2.k(intValue);
                return 0;
            case 3:
                b75Var.f370606f = aVar2.g(intValue);
                return 0;
            case 4:
                b75Var.f370607g = aVar2.k(intValue);
                return 0;
            case 5:
                b75Var.f370608h = aVar2.g(intValue);
                return 0;
            case 6:
                b75Var.f370609i = aVar2.i(intValue);
                return 0;
            case 7:
                b75Var.f370610m = aVar2.g(intValue);
                return 0;
            case 8:
                b75Var.f370611n = aVar2.k(intValue);
                return 0;
            case 9:
                b75Var.f370612o = aVar2.g(intValue);
                return 0;
            case 10:
                b75Var.f370613p = aVar2.g(intValue);
                return 0;
            case 11:
                b75Var.f370614q = aVar2.i(intValue);
                return 0;
            case 12:
                b75Var.f370615r = aVar2.g(intValue);
                return 0;
            case 13:
                b75Var.f370616s = aVar2.i(intValue);
                return 0;
            case 14:
                b75Var.f370617t = aVar2.i(intValue);
                return 0;
            case 15:
                b75Var.f370618u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
