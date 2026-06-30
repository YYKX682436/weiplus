package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class g1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218916d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218917e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218918f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218919g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218920h;

    /* renamed from: i, reason: collision with root package name */
    public int f218921i;

    /* renamed from: m, reason: collision with root package name */
    public int f218922m;

    /* renamed from: n, reason: collision with root package name */
    public int f218923n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218924o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218925p;

    /* renamed from: q, reason: collision with root package name */
    public int f218926q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218927r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f218928s;

    /* renamed from: t, reason: collision with root package name */
    public long f218929t;

    /* renamed from: u, reason: collision with root package name */
    public int f218930u;

    static {
        new com.tencent.wechat.mm.brand_service.g1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.g1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.g1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.g1)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.g1 g1Var = (com.tencent.wechat.mm.brand_service.g1) fVar;
        return n51.f.a(this.f218916d, g1Var.f218916d) && n51.f.a(this.f218917e, g1Var.f218917e) && n51.f.a(this.f218918f, g1Var.f218918f) && n51.f.a(this.f218919g, g1Var.f218919g) && n51.f.a(this.f218920h, g1Var.f218920h) && n51.f.a(java.lang.Integer.valueOf(this.f218921i), java.lang.Integer.valueOf(g1Var.f218921i)) && n51.f.a(java.lang.Integer.valueOf(this.f218922m), java.lang.Integer.valueOf(g1Var.f218922m)) && n51.f.a(java.lang.Integer.valueOf(this.f218923n), java.lang.Integer.valueOf(g1Var.f218923n)) && n51.f.a(this.f218924o, g1Var.f218924o) && n51.f.a(this.f218925p, g1Var.f218925p) && n51.f.a(java.lang.Integer.valueOf(this.f218926q), java.lang.Integer.valueOf(g1Var.f218926q)) && n51.f.a(this.f218927r, g1Var.f218927r) && n51.f.a(this.f218928s, g1Var.f218928s) && n51.f.a(java.lang.Long.valueOf(this.f218929t), java.lang.Long.valueOf(g1Var.f218929t)) && n51.f.a(java.lang.Integer.valueOf(this.f218930u), java.lang.Integer.valueOf(g1Var.f218930u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.g1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218916d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218917e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218918f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f218919g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f218920h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f218921i);
            fVar.e(7, this.f218922m);
            fVar.e(8, this.f218923n);
            java.lang.String str6 = this.f218924o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f218925p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            fVar.e(11, this.f218926q);
            java.lang.String str8 = this.f218927r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f218928s;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            fVar.h(14, this.f218929t);
            fVar.e(15, this.f218930u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f218916d;
            int j17 = str10 != null ? b36.f.j(1, str10) + 0 : 0;
            java.lang.String str11 = this.f218917e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f218918f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f218919g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f218920h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            int e17 = j17 + b36.f.e(6, this.f218921i) + b36.f.e(7, this.f218922m) + b36.f.e(8, this.f218923n);
            java.lang.String str15 = this.f218924o;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f218925p;
            if (str16 != null) {
                e17 += b36.f.j(10, str16);
            }
            int e18 = e17 + b36.f.e(11, this.f218926q);
            java.lang.String str17 = this.f218927r;
            if (str17 != null) {
                e18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f218928s;
            if (str18 != null) {
                e18 += b36.f.j(13, str18);
            }
            return e18 + b36.f.h(14, this.f218929t) + b36.f.e(15, this.f218930u);
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
                this.f218916d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f218917e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f218918f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f218919g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f218920h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f218921i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f218922m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f218923n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f218924o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f218925p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f218926q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f218927r = aVar2.k(intValue);
                return 0;
            case 13:
                this.f218928s = aVar2.k(intValue);
                return 0;
            case 14:
                this.f218929t = aVar2.i(intValue);
                return 0;
            case 15:
                this.f218930u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
