package com.tencent.wechat.mm.brand_service;

/* loaded from: classes9.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219213e;

    /* renamed from: f, reason: collision with root package name */
    public long f219214f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.w f219215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219216h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219217i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219218m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219219n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f219220o;

    /* renamed from: p, reason: collision with root package name */
    public int f219221p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f219222q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219223r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219224s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f219225t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f219226u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f219227v;

    static {
        new com.tencent.wechat.mm.brand_service.x();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.x parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.x) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.x)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.x xVar = (com.tencent.wechat.mm.brand_service.x) fVar;
        return n51.f.a(this.f219212d, xVar.f219212d) && n51.f.a(this.f219213e, xVar.f219213e) && n51.f.a(java.lang.Long.valueOf(this.f219214f), java.lang.Long.valueOf(xVar.f219214f)) && n51.f.a(this.f219215g, xVar.f219215g) && n51.f.a(this.f219216h, xVar.f219216h) && n51.f.a(this.f219217i, xVar.f219217i) && n51.f.a(this.f219218m, xVar.f219218m) && n51.f.a(this.f219219n, xVar.f219219n) && n51.f.a(this.f219220o, xVar.f219220o) && n51.f.a(java.lang.Integer.valueOf(this.f219221p), java.lang.Integer.valueOf(xVar.f219221p)) && n51.f.a(this.f219222q, xVar.f219222q) && n51.f.a(this.f219223r, xVar.f219223r) && n51.f.a(this.f219224s, xVar.f219224s) && n51.f.a(this.f219225t, xVar.f219225t) && n51.f.a(this.f219226u, xVar.f219226u) && n51.f.a(this.f219227v, xVar.f219227v);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.x();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219212d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219213e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f219214f);
            com.tencent.wechat.mm.brand_service.w wVar = this.f219215g;
            if (wVar != null) {
                fVar.e(4, wVar.f219209d);
            }
            java.lang.String str3 = this.f219216h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f219217i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f219218m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f219219n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f219220o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f219221p);
            java.lang.String str8 = this.f219222q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f219223r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f219224s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f219225t;
            if (str11 != null) {
                fVar.j(14, str11);
            }
            java.lang.String str12 = this.f219226u;
            if (str12 != null) {
                fVar.j(15, str12);
            }
            java.lang.String str13 = this.f219227v;
            if (str13 != null) {
                fVar.j(16, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f219212d;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.f219213e;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            int h17 = j17 + b36.f.h(3, this.f219214f);
            com.tencent.wechat.mm.brand_service.w wVar2 = this.f219215g;
            if (wVar2 != null) {
                h17 += b36.f.e(4, wVar2.f219209d);
            }
            java.lang.String str16 = this.f219216h;
            if (str16 != null) {
                h17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f219217i;
            if (str17 != null) {
                h17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f219218m;
            if (str18 != null) {
                h17 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f219219n;
            if (str19 != null) {
                h17 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f219220o;
            if (str20 != null) {
                h17 += b36.f.j(9, str20);
            }
            int e17 = h17 + b36.f.e(10, this.f219221p);
            java.lang.String str21 = this.f219222q;
            if (str21 != null) {
                e17 += b36.f.j(11, str21);
            }
            java.lang.String str22 = this.f219223r;
            if (str22 != null) {
                e17 += b36.f.j(12, str22);
            }
            java.lang.String str23 = this.f219224s;
            if (str23 != null) {
                e17 += b36.f.j(13, str23);
            }
            java.lang.String str24 = this.f219225t;
            if (str24 != null) {
                e17 += b36.f.j(14, str24);
            }
            java.lang.String str25 = this.f219226u;
            if (str25 != null) {
                e17 += b36.f.j(15, str25);
            }
            java.lang.String str26 = this.f219227v;
            return str26 != null ? e17 + b36.f.j(16, str26) : e17;
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
                this.f219212d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f219213e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f219214f = aVar2.i(intValue);
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                this.f219215g = g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.mm.brand_service.w.Click : com.tencent.wechat.mm.brand_service.w.Expose;
                return 0;
            case 5:
                this.f219216h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f219217i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f219218m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f219219n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f219220o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f219221p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f219222q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f219223r = aVar2.k(intValue);
                return 0;
            case 13:
                this.f219224s = aVar2.k(intValue);
                return 0;
            case 14:
                this.f219225t = aVar2.k(intValue);
                return 0;
            case 15:
                this.f219226u = aVar2.k(intValue);
                return 0;
            case 16:
                this.f219227v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
