package r45;

/* loaded from: classes9.dex */
public class an0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370129e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370130f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370131g;

    /* renamed from: h, reason: collision with root package name */
    public int f370132h;

    /* renamed from: i, reason: collision with root package name */
    public int f370133i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370134m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f370135n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f370136o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f370137p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f370138q;

    /* renamed from: r, reason: collision with root package name */
    public int f370139r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f370140s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f370141t;

    static {
        new r45.an0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.an0 parseFrom(byte[] bArr) {
        return (r45.an0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.an0)) {
            return false;
        }
        r45.an0 an0Var = (r45.an0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370128d), java.lang.Integer.valueOf(an0Var.f370128d)) && n51.f.a(this.f370129e, an0Var.f370129e) && n51.f.a(this.f370130f, an0Var.f370130f) && n51.f.a(this.f370131g, an0Var.f370131g) && n51.f.a(java.lang.Integer.valueOf(this.f370132h), java.lang.Integer.valueOf(an0Var.f370132h)) && n51.f.a(java.lang.Integer.valueOf(this.f370133i), java.lang.Integer.valueOf(an0Var.f370133i)) && n51.f.a(this.f370134m, an0Var.f370134m) && n51.f.a(this.f370135n, an0Var.f370135n) && n51.f.a(this.f370136o, an0Var.f370136o) && n51.f.a(this.f370137p, an0Var.f370137p) && n51.f.a(this.f370138q, an0Var.f370138q) && n51.f.a(java.lang.Integer.valueOf(this.f370139r), java.lang.Integer.valueOf(an0Var.f370139r)) && n51.f.a(this.f370140s, an0Var.f370140s) && n51.f.a(java.lang.Boolean.valueOf(this.f370141t), java.lang.Boolean.valueOf(an0Var.f370141t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.an0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370128d);
            java.lang.String str = this.f370129e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370130f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f370131g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f370132h);
            fVar.e(6, this.f370133i);
            java.lang.String str4 = this.f370134m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f370135n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f370136o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f370137p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f370138q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            fVar.e(12, this.f370139r);
            java.lang.String str9 = this.f370140s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            fVar.a(14, this.f370141t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370128d) + 0;
            java.lang.String str10 = this.f370129e;
            if (str10 != null) {
                e17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f370130f;
            if (str11 != null) {
                e17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f370131g;
            if (str12 != null) {
                e17 += b36.f.j(4, str12);
            }
            int e18 = e17 + b36.f.e(5, this.f370132h) + b36.f.e(6, this.f370133i);
            java.lang.String str13 = this.f370134m;
            if (str13 != null) {
                e18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f370135n;
            if (str14 != null) {
                e18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f370136o;
            if (str15 != null) {
                e18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f370137p;
            if (str16 != null) {
                e18 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f370138q;
            if (str17 != null) {
                e18 += b36.f.j(11, str17);
            }
            int e19 = e18 + b36.f.e(12, this.f370139r);
            java.lang.String str18 = this.f370140s;
            if (str18 != null) {
                e19 += b36.f.j(13, str18);
            }
            return e19 + b36.f.a(14, this.f370141t);
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
                this.f370128d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f370129e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f370130f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f370131g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f370132h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f370133i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f370134m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f370135n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f370136o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f370137p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f370138q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f370139r = aVar2.g(intValue);
                return 0;
            case 13:
                this.f370140s = aVar2.k(intValue);
                return 0;
            case 14:
                this.f370141t = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
