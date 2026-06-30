package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class v4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218708d;

    /* renamed from: e, reason: collision with root package name */
    public int f218709e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218710f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218711g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218712h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218713i;

    /* renamed from: m, reason: collision with root package name */
    public int f218714m;

    /* renamed from: n, reason: collision with root package name */
    public int f218715n;

    /* renamed from: o, reason: collision with root package name */
    public int f218716o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218717p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f218718q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218719r;

    /* renamed from: s, reason: collision with root package name */
    public int f218720s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f218721t = new boolean[14];

    static {
        new com.tencent.wechat.mm.biz.v4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.v4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.v4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.v4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.v4 v4Var = (com.tencent.wechat.mm.biz.v4) fVar;
        return n51.f.a(this.f218708d, v4Var.f218708d) && n51.f.a(java.lang.Integer.valueOf(this.f218709e), java.lang.Integer.valueOf(v4Var.f218709e)) && n51.f.a(this.f218710f, v4Var.f218710f) && n51.f.a(this.f218711g, v4Var.f218711g) && n51.f.a(this.f218712h, v4Var.f218712h) && n51.f.a(this.f218713i, v4Var.f218713i) && n51.f.a(java.lang.Integer.valueOf(this.f218714m), java.lang.Integer.valueOf(v4Var.f218714m)) && n51.f.a(java.lang.Integer.valueOf(this.f218715n), java.lang.Integer.valueOf(v4Var.f218715n)) && n51.f.a(java.lang.Integer.valueOf(this.f218716o), java.lang.Integer.valueOf(v4Var.f218716o)) && n51.f.a(this.f218717p, v4Var.f218717p) && n51.f.a(this.f218718q, v4Var.f218718q) && n51.f.a(this.f218719r, v4Var.f218719r) && n51.f.a(java.lang.Integer.valueOf(this.f218720s), java.lang.Integer.valueOf(v4Var.f218720s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.v4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218721t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218708d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218709e);
            }
            java.lang.String str2 = this.f218710f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f218711g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f218712h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f218713i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218714m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f218715n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f218716o);
            }
            java.lang.String str6 = this.f218717p;
            if (str6 != null && zArr[10]) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f218718q;
            if (str7 != null && zArr[11]) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f218719r;
            if (str8 != null && zArr[12]) {
                fVar.j(12, str8);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f218720s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f218708d;
            int j17 = (str9 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str9);
            if (zArr[2]) {
                j17 += b36.f.e(2, this.f218709e);
            }
            java.lang.String str10 = this.f218710f;
            if (str10 != null && zArr[3]) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f218711g;
            if (str11 != null && zArr[4]) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f218712h;
            if (str12 != null && zArr[5]) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f218713i;
            if (str13 != null && zArr[6]) {
                j17 += b36.f.j(6, str13);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f218714m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f218715n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f218716o);
            }
            java.lang.String str14 = this.f218717p;
            if (str14 != null && zArr[10]) {
                j17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f218718q;
            if (str15 != null && zArr[11]) {
                j17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f218719r;
            if (str16 != null && zArr[12]) {
                j17 += b36.f.j(12, str16);
            }
            return zArr[13] ? j17 + b36.f.e(13, this.f218720s) : j17;
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
                this.f218708d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218709e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218710f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218711g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218712h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218713i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218714m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218715n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218716o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218717p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218718q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218719r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218720s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
