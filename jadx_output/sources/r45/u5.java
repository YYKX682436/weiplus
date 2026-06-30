package r45;

/* loaded from: classes8.dex */
public class u5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387029d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387030e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387031f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387032g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387033h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387034i;

    /* renamed from: m, reason: collision with root package name */
    public int f387035m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387036n;

    /* renamed from: o, reason: collision with root package name */
    public int f387037o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f387038p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f387039q;

    /* renamed from: r, reason: collision with root package name */
    public r45.r5 f387040r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f387041s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f387042t;

    /* renamed from: u, reason: collision with root package name */
    public long f387043u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f387044v;

    static {
        new r45.u5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.u5 parseFrom(byte[] bArr) {
        return (r45.u5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u5)) {
            return false;
        }
        r45.u5 u5Var = (r45.u5) fVar;
        return n51.f.a(this.f387029d, u5Var.f387029d) && n51.f.a(this.f387030e, u5Var.f387030e) && n51.f.a(this.f387031f, u5Var.f387031f) && n51.f.a(this.f387032g, u5Var.f387032g) && n51.f.a(this.f387033h, u5Var.f387033h) && n51.f.a(this.f387034i, u5Var.f387034i) && n51.f.a(java.lang.Integer.valueOf(this.f387035m), java.lang.Integer.valueOf(u5Var.f387035m)) && n51.f.a(this.f387036n, u5Var.f387036n) && n51.f.a(java.lang.Integer.valueOf(this.f387037o), java.lang.Integer.valueOf(u5Var.f387037o)) && n51.f.a(this.f387038p, u5Var.f387038p) && n51.f.a(this.f387039q, u5Var.f387039q) && n51.f.a(this.f387040r, u5Var.f387040r) && n51.f.a(this.f387041s, u5Var.f387041s) && n51.f.a(this.f387042t, u5Var.f387042t) && n51.f.a(java.lang.Long.valueOf(this.f387043u), java.lang.Long.valueOf(u5Var.f387043u)) && n51.f.a(this.f387044v, u5Var.f387044v);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.u5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387029d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387030e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387031f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f387032g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f387033h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f387034i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f387035m);
            java.lang.String str7 = this.f387036n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f387037o);
            java.lang.String str8 = this.f387038p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f387039q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            r45.r5 r5Var = this.f387040r;
            if (r5Var != null) {
                fVar.i(12, r5Var.computeSize());
                this.f387040r.writeFields(fVar);
            }
            java.lang.String str10 = this.f387041s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f387042t;
            if (str11 != null) {
                fVar.j(900, str11);
            }
            fVar.h(901, this.f387043u);
            java.lang.String str12 = this.f387044v;
            if (str12 != null) {
                fVar.j(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str13 = this.f387029d;
            int j17 = str13 != null ? b36.f.j(1, str13) + 0 : 0;
            java.lang.String str14 = this.f387030e;
            if (str14 != null) {
                j17 += b36.f.j(2, str14);
            }
            java.lang.String str15 = this.f387031f;
            if (str15 != null) {
                j17 += b36.f.j(3, str15);
            }
            java.lang.String str16 = this.f387032g;
            if (str16 != null) {
                j17 += b36.f.j(4, str16);
            }
            java.lang.String str17 = this.f387033h;
            if (str17 != null) {
                j17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f387034i;
            if (str18 != null) {
                j17 += b36.f.j(6, str18);
            }
            int e17 = j17 + b36.f.e(7, this.f387035m);
            java.lang.String str19 = this.f387036n;
            if (str19 != null) {
                e17 += b36.f.j(8, str19);
            }
            int e18 = e17 + b36.f.e(9, this.f387037o);
            java.lang.String str20 = this.f387038p;
            if (str20 != null) {
                e18 += b36.f.j(10, str20);
            }
            java.lang.String str21 = this.f387039q;
            if (str21 != null) {
                e18 += b36.f.j(11, str21);
            }
            r45.r5 r5Var2 = this.f387040r;
            if (r5Var2 != null) {
                e18 += b36.f.i(12, r5Var2.computeSize());
            }
            java.lang.String str22 = this.f387041s;
            if (str22 != null) {
                e18 += b36.f.j(13, str22);
            }
            java.lang.String str23 = this.f387042t;
            if (str23 != null) {
                e18 += b36.f.j(900, str23);
            }
            int h17 = e18 + b36.f.h(901, this.f387043u);
            java.lang.String str24 = this.f387044v;
            return str24 != null ? h17 + b36.f.j(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, str24) : h17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f387029d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f387030e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f387031f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f387032g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f387033h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f387034i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f387035m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f387036n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f387037o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f387038p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f387039q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.r5 r5Var3 = new r45.r5();
                    if (bArr != null && bArr.length > 0) {
                        r5Var3.parseFrom(bArr);
                    }
                    this.f387040r = r5Var3;
                }
                return 0;
            case 13:
                this.f387041s = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 900:
                        this.f387042t = aVar2.k(intValue);
                        return 0;
                    case 901:
                        this.f387043u = aVar2.i(intValue);
                        return 0;
                    case com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX /* 902 */:
                        this.f387044v = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
