package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class i5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218192d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218193e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218194f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218195g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218196h;

    /* renamed from: i, reason: collision with root package name */
    public int f218197i;

    /* renamed from: m, reason: collision with root package name */
    public int f218198m;

    /* renamed from: n, reason: collision with root package name */
    public int f218199n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218200o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218201p;

    /* renamed from: q, reason: collision with root package name */
    public int f218202q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218203r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f218204s;

    /* renamed from: t, reason: collision with root package name */
    public long f218205t;

    /* renamed from: u, reason: collision with root package name */
    public int f218206u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f218207v = new boolean[16];

    static {
        new com.tencent.wechat.mm.biz.i5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.i5 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.i5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.i5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.i5 i5Var = (com.tencent.wechat.mm.biz.i5) fVar;
        return n51.f.a(this.f218192d, i5Var.f218192d) && n51.f.a(this.f218193e, i5Var.f218193e) && n51.f.a(this.f218194f, i5Var.f218194f) && n51.f.a(this.f218195g, i5Var.f218195g) && n51.f.a(this.f218196h, i5Var.f218196h) && n51.f.a(java.lang.Integer.valueOf(this.f218197i), java.lang.Integer.valueOf(i5Var.f218197i)) && n51.f.a(java.lang.Integer.valueOf(this.f218198m), java.lang.Integer.valueOf(i5Var.f218198m)) && n51.f.a(java.lang.Integer.valueOf(this.f218199n), java.lang.Integer.valueOf(i5Var.f218199n)) && n51.f.a(this.f218200o, i5Var.f218200o) && n51.f.a(this.f218201p, i5Var.f218201p) && n51.f.a(java.lang.Integer.valueOf(this.f218202q), java.lang.Integer.valueOf(i5Var.f218202q)) && n51.f.a(this.f218203r, i5Var.f218203r) && n51.f.a(this.f218204s, i5Var.f218204s) && n51.f.a(java.lang.Long.valueOf(this.f218205t), java.lang.Long.valueOf(i5Var.f218205t)) && n51.f.a(java.lang.Integer.valueOf(this.f218206u), java.lang.Integer.valueOf(i5Var.f218206u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.i5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f218207v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218192d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218193e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218194f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f218195g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f218196h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218197i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218198m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f218199n);
            }
            java.lang.String str6 = this.f218200o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f218201p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            if (zArr[11]) {
                fVar.e(11, this.f218202q);
            }
            java.lang.String str8 = this.f218203r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            java.lang.String str9 = this.f218204s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            if (zArr[14]) {
                fVar.h(14, this.f218205t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f218206u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f218192d;
            if (str10 != null && zArr[1]) {
                i18 = b36.f.j(1, str10) + 0;
            }
            java.lang.String str11 = this.f218193e;
            if (str11 != null && zArr[2]) {
                i18 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f218194f;
            if (str12 != null && zArr[3]) {
                i18 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f218195g;
            if (str13 != null && zArr[4]) {
                i18 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f218196h;
            if (str14 != null && zArr[5]) {
                i18 += b36.f.j(5, str14);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f218197i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f218198m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f218199n);
            }
            java.lang.String str15 = this.f218200o;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f218201p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f218202q);
            }
            java.lang.String str17 = this.f218203r;
            if (str17 != null && zArr[12]) {
                i18 += b36.f.j(12, str17);
            }
            java.lang.String str18 = this.f218204s;
            if (str18 != null && zArr[13]) {
                i18 += b36.f.j(13, str18);
            }
            if (zArr[14]) {
                i18 += b36.f.h(14, this.f218205t);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f218206u) : i18;
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
                this.f218192d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218193e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218194f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218195g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218196h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218197i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218198m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218199n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218200o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218201p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218202q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218203r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218204s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f218205t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f218206u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
