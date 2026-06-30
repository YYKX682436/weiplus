package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218931d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218932e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218933f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218934g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218935h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218936i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218937m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f218938n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218939o = "";

    /* renamed from: p, reason: collision with root package name */
    public int f218940p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218941q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218942r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f218943s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f218944t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f218945u = 0;

    static {
        new com.tencent.wechat.mm.brand_service.h();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.h parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.h) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.h)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.h hVar = (com.tencent.wechat.mm.brand_service.h) fVar;
        return n51.f.a(this.f218931d, hVar.f218931d) && n51.f.a(this.f218932e, hVar.f218932e) && n51.f.a(this.f218933f, hVar.f218933f) && n51.f.a(this.f218934g, hVar.f218934g) && n51.f.a(this.f218935h, hVar.f218935h) && n51.f.a(this.f218936i, hVar.f218936i) && n51.f.a(this.f218937m, hVar.f218937m) && n51.f.a(java.lang.Integer.valueOf(this.f218938n), java.lang.Integer.valueOf(hVar.f218938n)) && n51.f.a(this.f218939o, hVar.f218939o) && n51.f.a(java.lang.Integer.valueOf(this.f218940p), java.lang.Integer.valueOf(hVar.f218940p)) && n51.f.a(this.f218941q, hVar.f218941q) && n51.f.a(this.f218942r, hVar.f218942r) && n51.f.a(this.f218943s, hVar.f218943s) && n51.f.a(java.lang.Integer.valueOf(this.f218944t), java.lang.Integer.valueOf(hVar.f218944t)) && n51.f.a(java.lang.Integer.valueOf(this.f218945u), java.lang.Integer.valueOf(hVar.f218945u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218931d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218932e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218933f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f218934g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f218935h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f218936i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f218937m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f218938n);
            java.lang.String str8 = this.f218939o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f218940p);
            java.lang.String str9 = this.f218941q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f218942r;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f218943s;
            if (str11 != null) {
                fVar.j(13, str11);
            }
            fVar.e(14, this.f218944t);
            fVar.e(15, this.f218945u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f218931d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f218932e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f218933f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f218934g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f218935h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f218936i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f218937m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            int e17 = j17 + b36.f.e(8, this.f218938n);
            java.lang.String str19 = this.f218939o;
            if (str19 != null) {
                e17 += b36.f.j(9, str19);
            }
            int e18 = e17 + b36.f.e(10, this.f218940p);
            java.lang.String str20 = this.f218941q;
            if (str20 != null) {
                e18 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f218942r;
            if (str21 != null) {
                e18 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f218943s;
            if (str22 != null) {
                e18 += b36.f.j(13, str22);
            }
            return e18 + b36.f.e(14, this.f218944t) + b36.f.e(15, this.f218945u);
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
                this.f218931d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f218932e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f218933f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f218934g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f218935h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f218936i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f218937m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f218938n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f218939o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f218940p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f218941q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f218942r = aVar2.k(intValue);
                return 0;
            case 13:
                this.f218943s = aVar2.k(intValue);
                return 0;
            case 14:
                this.f218944t = aVar2.g(intValue);
                return 0;
            case 15:
                this.f218945u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
