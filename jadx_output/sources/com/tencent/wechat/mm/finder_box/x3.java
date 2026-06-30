package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class x3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219960d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219961e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219962f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219963g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219964h;

    /* renamed from: i, reason: collision with root package name */
    public int f219965i;

    /* renamed from: m, reason: collision with root package name */
    public int f219966m;

    /* renamed from: n, reason: collision with root package name */
    public int f219967n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f219968o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219969p;

    /* renamed from: q, reason: collision with root package name */
    public int f219970q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219971r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219972s;

    /* renamed from: t, reason: collision with root package name */
    public long f219973t;

    /* renamed from: u, reason: collision with root package name */
    public int f219974u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f219975v = new boolean[16];

    static {
        new com.tencent.wechat.mm.finder_box.x3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.x3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.x3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.x3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.x3 x3Var = (com.tencent.wechat.mm.finder_box.x3) fVar;
        return n51.f.a(this.f219960d, x3Var.f219960d) && n51.f.a(this.f219961e, x3Var.f219961e) && n51.f.a(this.f219962f, x3Var.f219962f) && n51.f.a(this.f219963g, x3Var.f219963g) && n51.f.a(this.f219964h, x3Var.f219964h) && n51.f.a(java.lang.Integer.valueOf(this.f219965i), java.lang.Integer.valueOf(x3Var.f219965i)) && n51.f.a(java.lang.Integer.valueOf(this.f219966m), java.lang.Integer.valueOf(x3Var.f219966m)) && n51.f.a(java.lang.Integer.valueOf(this.f219967n), java.lang.Integer.valueOf(x3Var.f219967n)) && n51.f.a(this.f219968o, x3Var.f219968o) && n51.f.a(this.f219969p, x3Var.f219969p) && n51.f.a(java.lang.Integer.valueOf(this.f219970q), java.lang.Integer.valueOf(x3Var.f219970q)) && n51.f.a(this.f219971r, x3Var.f219971r) && n51.f.a(this.f219972s, x3Var.f219972s) && n51.f.a(java.lang.Long.valueOf(this.f219973t), java.lang.Long.valueOf(x3Var.f219973t)) && n51.f.a(java.lang.Integer.valueOf(this.f219974u), java.lang.Integer.valueOf(x3Var.f219974u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.x3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f219975v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219960d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219961e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f219962f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f219963g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f219964h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219965i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f219966m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f219967n);
            }
            java.lang.String str6 = this.f219968o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f219969p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f219970q);
            }
            java.lang.String str8 = this.f219971r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f219972s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            if (zArr[14]) {
                fVar.h(14, this.f219973t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f219974u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f219960d;
            if (str10 != null && zArr[1]) {
                i18 = b36.f.j(1, str10) + 0;
            }
            java.lang.String str11 = this.f219961e;
            if (str11 != null && zArr[2]) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f219962f;
            if (str12 != null && zArr[3]) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f219963g;
            if (str13 != null && zArr[4]) {
                i18 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f219964h;
            if (str14 != null && zArr[5]) {
                i18 += b36.f.j(5, str14);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f219965i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f219966m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f219967n);
            }
            java.lang.String str15 = this.f219968o;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f219969p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f219970q);
            }
            java.lang.String str17 = this.f219971r;
            if (str17 != null && zArr[12]) {
                i18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f219972s;
            if (str18 != null && zArr[13]) {
                i18 += b36.f.j(13, str18);
            }
            if (zArr[14]) {
                i18 += b36.f.h(14, this.f219973t);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f219974u) : i18;
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
                this.f219960d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219961e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219962f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219963g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219964h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219965i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219966m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219967n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219968o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219969p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219970q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f219971r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f219972s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f219973t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f219974u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
