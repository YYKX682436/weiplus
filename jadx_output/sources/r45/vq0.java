package r45;

/* loaded from: classes9.dex */
public class vq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f388433d;

    /* renamed from: e, reason: collision with root package name */
    public long f388434e;

    /* renamed from: f, reason: collision with root package name */
    public long f388435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388436g;

    /* renamed from: h, reason: collision with root package name */
    public long f388437h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388438i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388439m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388440n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f388441o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f388442p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388443q;

    /* renamed from: r, reason: collision with root package name */
    public int f388444r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f388445s;

    /* renamed from: t, reason: collision with root package name */
    public int f388446t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f388447u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vq0)) {
            return false;
        }
        r45.vq0 vq0Var = (r45.vq0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f388433d), java.lang.Long.valueOf(vq0Var.f388433d)) && n51.f.a(java.lang.Long.valueOf(this.f388434e), java.lang.Long.valueOf(vq0Var.f388434e)) && n51.f.a(java.lang.Long.valueOf(this.f388435f), java.lang.Long.valueOf(vq0Var.f388435f)) && n51.f.a(this.f388436g, vq0Var.f388436g) && n51.f.a(java.lang.Long.valueOf(this.f388437h), java.lang.Long.valueOf(vq0Var.f388437h)) && n51.f.a(this.f388438i, vq0Var.f388438i) && n51.f.a(this.f388439m, vq0Var.f388439m) && n51.f.a(this.f388440n, vq0Var.f388440n) && n51.f.a(this.f388441o, vq0Var.f388441o) && n51.f.a(this.f388442p, vq0Var.f388442p) && n51.f.a(this.f388443q, vq0Var.f388443q) && n51.f.a(java.lang.Integer.valueOf(this.f388444r), java.lang.Integer.valueOf(vq0Var.f388444r)) && n51.f.a(this.f388445s, vq0Var.f388445s) && n51.f.a(java.lang.Integer.valueOf(this.f388446t), java.lang.Integer.valueOf(vq0Var.f388446t)) && n51.f.a(this.f388447u, vq0Var.f388447u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f388433d);
            fVar.h(2, this.f388434e);
            fVar.h(3, this.f388435f);
            java.lang.String str = this.f388436g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f388437h);
            java.lang.String str2 = this.f388438i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f388439m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f388440n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f388441o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f388442p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f388443q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.f388444r);
            java.lang.String str8 = this.f388445s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.e(14, this.f388446t);
            java.lang.String str9 = this.f388447u;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f388433d) + 0 + b36.f.h(2, this.f388434e) + b36.f.h(3, this.f388435f);
            java.lang.String str10 = this.f388436g;
            if (str10 != null) {
                h17 += b36.f.j(4, str10);
            }
            int h18 = h17 + b36.f.h(5, this.f388437h);
            java.lang.String str11 = this.f388438i;
            if (str11 != null) {
                h18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f388439m;
            if (str12 != null) {
                h18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f388440n;
            if (str13 != null) {
                h18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f388441o;
            if (str14 != null) {
                h18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f388442p;
            if (str15 != null) {
                h18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f388443q;
            if (str16 != null) {
                h18 += b36.f.j(11, str16);
            }
            int e17 = h18 + b36.f.e(12, this.f388444r);
            java.lang.String str17 = this.f388445s;
            if (str17 != null) {
                e17 += b36.f.j(13, str17);
            }
            int e18 = e17 + b36.f.e(14, this.f388446t);
            java.lang.String str18 = this.f388447u;
            return str18 != null ? e18 + b36.f.j(15, str18) : e18;
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
        r45.vq0 vq0Var = (r45.vq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vq0Var.f388433d = aVar2.i(intValue);
                return 0;
            case 2:
                vq0Var.f388434e = aVar2.i(intValue);
                return 0;
            case 3:
                vq0Var.f388435f = aVar2.i(intValue);
                return 0;
            case 4:
                vq0Var.f388436g = aVar2.k(intValue);
                return 0;
            case 5:
                vq0Var.f388437h = aVar2.i(intValue);
                return 0;
            case 6:
                vq0Var.f388438i = aVar2.k(intValue);
                return 0;
            case 7:
                vq0Var.f388439m = aVar2.k(intValue);
                return 0;
            case 8:
                vq0Var.f388440n = aVar2.k(intValue);
                return 0;
            case 9:
                vq0Var.f388441o = aVar2.k(intValue);
                return 0;
            case 10:
                vq0Var.f388442p = aVar2.k(intValue);
                return 0;
            case 11:
                vq0Var.f388443q = aVar2.k(intValue);
                return 0;
            case 12:
                vq0Var.f388444r = aVar2.g(intValue);
                return 0;
            case 13:
                vq0Var.f388445s = aVar2.k(intValue);
                return 0;
            case 14:
                vq0Var.f388446t = aVar2.g(intValue);
                return 0;
            case 15:
                vq0Var.f388447u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
