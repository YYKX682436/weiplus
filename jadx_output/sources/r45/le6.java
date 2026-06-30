package r45;

/* loaded from: classes4.dex */
public class le6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f379383d;

    /* renamed from: e, reason: collision with root package name */
    public int f379384e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379385f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379386g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379387h;

    /* renamed from: i, reason: collision with root package name */
    public int f379388i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379389m;

    /* renamed from: n, reason: collision with root package name */
    public int f379390n;

    /* renamed from: o, reason: collision with root package name */
    public int f379391o;

    /* renamed from: p, reason: collision with root package name */
    public int f379392p;

    /* renamed from: q, reason: collision with root package name */
    public int f379393q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379394r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f379395s;

    /* renamed from: t, reason: collision with root package name */
    public int f379396t;

    /* renamed from: u, reason: collision with root package name */
    public int f379397u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.le6)) {
            return false;
        }
        r45.le6 le6Var = (r45.le6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f379383d), java.lang.Long.valueOf(le6Var.f379383d)) && n51.f.a(java.lang.Integer.valueOf(this.f379384e), java.lang.Integer.valueOf(le6Var.f379384e)) && n51.f.a(this.f379385f, le6Var.f379385f) && n51.f.a(this.f379386g, le6Var.f379386g) && n51.f.a(this.f379387h, le6Var.f379387h) && n51.f.a(java.lang.Integer.valueOf(this.f379388i), java.lang.Integer.valueOf(le6Var.f379388i)) && n51.f.a(this.f379389m, le6Var.f379389m) && n51.f.a(java.lang.Integer.valueOf(this.f379390n), java.lang.Integer.valueOf(le6Var.f379390n)) && n51.f.a(java.lang.Integer.valueOf(this.f379391o), java.lang.Integer.valueOf(le6Var.f379391o)) && n51.f.a(java.lang.Integer.valueOf(this.f379392p), java.lang.Integer.valueOf(le6Var.f379392p)) && n51.f.a(java.lang.Integer.valueOf(this.f379393q), java.lang.Integer.valueOf(le6Var.f379393q)) && n51.f.a(this.f379394r, le6Var.f379394r) && n51.f.a(this.f379395s, le6Var.f379395s) && n51.f.a(java.lang.Integer.valueOf(this.f379396t), java.lang.Integer.valueOf(le6Var.f379396t)) && n51.f.a(java.lang.Integer.valueOf(this.f379397u), java.lang.Integer.valueOf(le6Var.f379397u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f379383d);
            fVar.e(2, this.f379384e);
            java.lang.String str = this.f379385f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379386g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f379387h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f379388i);
            java.lang.String str4 = this.f379389m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f379390n);
            fVar.e(9, this.f379391o);
            fVar.e(10, this.f379392p);
            fVar.e(11, this.f379393q);
            java.lang.String str5 = this.f379394r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f379395s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f379396t);
            fVar.e(15, this.f379397u);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f379383d) + 0 + b36.f.e(2, this.f379384e);
            java.lang.String str7 = this.f379385f;
            if (str7 != null) {
                h17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f379386g;
            if (str8 != null) {
                h17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f379387h;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            int e17 = h17 + b36.f.e(6, this.f379388i);
            java.lang.String str10 = this.f379389m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f379390n) + b36.f.e(9, this.f379391o) + b36.f.e(10, this.f379392p) + b36.f.e(11, this.f379393q);
            java.lang.String str11 = this.f379394r;
            if (str11 != null) {
                e18 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f379395s;
            if (str12 != null) {
                e18 += b36.f.j(13, str12);
            }
            return e18 + b36.f.e(14, this.f379396t) + b36.f.e(15, this.f379397u);
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
        r45.le6 le6Var = (r45.le6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                le6Var.f379383d = aVar2.i(intValue);
                return 0;
            case 2:
                le6Var.f379384e = aVar2.g(intValue);
                return 0;
            case 3:
                le6Var.f379385f = aVar2.k(intValue);
                return 0;
            case 4:
                le6Var.f379386g = aVar2.k(intValue);
                return 0;
            case 5:
                le6Var.f379387h = aVar2.k(intValue);
                return 0;
            case 6:
                le6Var.f379388i = aVar2.g(intValue);
                return 0;
            case 7:
                le6Var.f379389m = aVar2.k(intValue);
                return 0;
            case 8:
                le6Var.f379390n = aVar2.g(intValue);
                return 0;
            case 9:
                le6Var.f379391o = aVar2.g(intValue);
                return 0;
            case 10:
                le6Var.f379392p = aVar2.g(intValue);
                return 0;
            case 11:
                le6Var.f379393q = aVar2.g(intValue);
                return 0;
            case 12:
                le6Var.f379394r = aVar2.k(intValue);
                return 0;
            case 13:
                le6Var.f379395s = aVar2.k(intValue);
                return 0;
            case 14:
                le6Var.f379396t = aVar2.g(intValue);
                return 0;
            case 15:
                le6Var.f379397u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
