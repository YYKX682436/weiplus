package com.tencent.wechat.aff.favorites;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216813e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216814f;

    /* renamed from: g, reason: collision with root package name */
    public long f216815g;

    /* renamed from: h, reason: collision with root package name */
    public int f216816h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216817i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216818m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216819n;

    /* renamed from: o, reason: collision with root package name */
    public long f216820o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f216821p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f216822q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f216823r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f216824s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f216825t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f216826u = new boolean[15];

    static {
        new com.tencent.wechat.aff.favorites.k();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.favorites.k parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.k) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.k)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.k kVar = (com.tencent.wechat.aff.favorites.k) fVar;
        return n51.f.a(this.f216812d, kVar.f216812d) && n51.f.a(this.f216813e, kVar.f216813e) && n51.f.a(this.f216814f, kVar.f216814f) && n51.f.a(java.lang.Long.valueOf(this.f216815g), java.lang.Long.valueOf(kVar.f216815g)) && n51.f.a(java.lang.Integer.valueOf(this.f216816h), java.lang.Integer.valueOf(kVar.f216816h)) && n51.f.a(this.f216817i, kVar.f216817i) && n51.f.a(this.f216818m, kVar.f216818m) && n51.f.a(this.f216819n, kVar.f216819n) && n51.f.a(java.lang.Long.valueOf(this.f216820o), java.lang.Long.valueOf(kVar.f216820o)) && n51.f.a(this.f216821p, kVar.f216821p) && n51.f.a(this.f216822q, kVar.f216822q) && n51.f.a(this.f216823r, kVar.f216823r) && n51.f.a(this.f216824s, kVar.f216824s) && n51.f.a(java.lang.Boolean.valueOf(this.f216825t), java.lang.Boolean.valueOf(kVar.f216825t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216826u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216812d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216813e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f216814f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f216815g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f216816h);
            }
            java.lang.String str4 = this.f216817i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f216818m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f216819n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.h(9, this.f216820o);
            }
            java.lang.String str7 = this.f216821p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f216822q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f216823r;
            if (str9 != null && zArr[12]) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f216824s;
            if (str10 != null && zArr[13]) {
                fVar.j(13, str10);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.a(14, this.f216825t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f216812d;
            int j17 = (str11 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str11);
            java.lang.String str12 = this.f216813e;
            if (str12 != null && zArr[2]) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f216814f;
            if (str13 != null && zArr[3]) {
                j17 += b36.f.j(3, str13);
            }
            if (zArr[4]) {
                j17 += b36.f.h(4, this.f216815g);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f216816h);
            }
            java.lang.String str14 = this.f216817i;
            if (str14 != null && zArr[6]) {
                j17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f216818m;
            if (str15 != null && zArr[7]) {
                j17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f216819n;
            if (str16 != null && zArr[8]) {
                j17 += b36.f.j(8, str16);
            }
            if (zArr[9]) {
                j17 += b36.f.h(9, this.f216820o);
            }
            java.lang.String str17 = this.f216821p;
            if (str17 != null && zArr[10]) {
                j17 += b36.f.j(10, str17);
            }
            java.lang.String str18 = this.f216822q;
            if (str18 != null && zArr[11]) {
                j17 += b36.f.j(11, str18);
            }
            java.lang.String str19 = this.f216823r;
            if (str19 != null && zArr[12]) {
                j17 += b36.f.j(12, str19);
            }
            java.lang.String str20 = this.f216824s;
            if (str20 != null && zArr[13]) {
                j17 += b36.f.j(13, str20);
            }
            return zArr[14] ? j17 + b36.f.a(14, this.f216825t) : j17;
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
                this.f216812d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216813e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216814f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216815g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216816h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216817i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216818m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216819n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216820o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216821p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f216822q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f216823r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f216824s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f216825t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
