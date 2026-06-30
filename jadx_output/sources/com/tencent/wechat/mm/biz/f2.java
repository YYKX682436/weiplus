package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class f2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218025d;

    /* renamed from: e, reason: collision with root package name */
    public int f218026e;

    /* renamed from: f, reason: collision with root package name */
    public int f218027f;

    /* renamed from: g, reason: collision with root package name */
    public int f218028g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218029h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f218030i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218031m;

    /* renamed from: n, reason: collision with root package name */
    public float f218032n;

    /* renamed from: o, reason: collision with root package name */
    public float f218033o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f218034p;

    /* renamed from: q, reason: collision with root package name */
    public int f218035q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218036r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f218037s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f218038t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f218039u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f218040v = new boolean[16];

    static {
        new com.tencent.wechat.mm.biz.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.f2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.f2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.f2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.f2 f2Var = (com.tencent.wechat.mm.biz.f2) fVar;
        return n51.f.a(this.f218025d, f2Var.f218025d) && n51.f.a(java.lang.Integer.valueOf(this.f218026e), java.lang.Integer.valueOf(f2Var.f218026e)) && n51.f.a(java.lang.Integer.valueOf(this.f218027f), java.lang.Integer.valueOf(f2Var.f218027f)) && n51.f.a(java.lang.Integer.valueOf(this.f218028g), java.lang.Integer.valueOf(f2Var.f218028g)) && n51.f.a(this.f218029h, f2Var.f218029h) && n51.f.a(java.lang.Boolean.valueOf(this.f218030i), java.lang.Boolean.valueOf(f2Var.f218030i)) && n51.f.a(this.f218031m, f2Var.f218031m) && n51.f.a(java.lang.Float.valueOf(this.f218032n), java.lang.Float.valueOf(f2Var.f218032n)) && n51.f.a(java.lang.Float.valueOf(this.f218033o), java.lang.Float.valueOf(f2Var.f218033o)) && n51.f.a(java.lang.Boolean.valueOf(this.f218034p), java.lang.Boolean.valueOf(f2Var.f218034p)) && n51.f.a(java.lang.Integer.valueOf(this.f218035q), java.lang.Integer.valueOf(f2Var.f218035q)) && n51.f.a(this.f218036r, f2Var.f218036r) && n51.f.a(this.f218037s, f2Var.f218037s) && n51.f.a(this.f218038t, f2Var.f218038t) && n51.f.a(this.f218039u, f2Var.f218039u);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f218040v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218025d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218026e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218027f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218028g);
            }
            java.lang.String str2 = this.f218029h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.a(6, this.f218030i);
            }
            java.lang.String str3 = this.f218031m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.d(8, this.f218032n);
            }
            if (zArr[9]) {
                fVar.d(9, this.f218033o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f218034p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f218035q);
            }
            java.lang.String str4 = this.f218036r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f218037s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f218038t;
            if (str6 != null && zArr[14]) {
                fVar.j(14, str6);
            }
            java.lang.String str7 = this.f218039u;
            if (str7 != null && zArr[15]) {
                fVar.j(15, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f218025d;
            if (str8 != null && zArr[1]) {
                i18 = b36.f.j(1, str8) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f218026e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f218027f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f218028g);
            }
            java.lang.String str9 = this.f218029h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f218030i);
            }
            java.lang.String str10 = this.f218031m;
            if (str10 != null && zArr[7]) {
                i18 += b36.f.j(7, str10);
            }
            if (zArr[8]) {
                i18 += b36.f.d(8, this.f218032n);
            }
            if (zArr[9]) {
                i18 += b36.f.d(9, this.f218033o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f218034p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f218035q);
            }
            java.lang.String str11 = this.f218036r;
            if (str11 != null && zArr[12]) {
                i18 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f218037s;
            if (str12 != null && zArr[13]) {
                i18 += b36.f.j(13, str12);
            }
            java.lang.String str13 = this.f218038t;
            if (str13 != null && zArr[14]) {
                i18 += b36.f.j(14, str13);
            }
            java.lang.String str14 = this.f218039u;
            return (str14 == null || !zArr[15]) ? i18 : i18 + b36.f.j(15, str14);
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
                this.f218025d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218026e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218027f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218028g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218029h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218030i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218031m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218032n = aVar2.f(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218033o = aVar2.f(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218034p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218035q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f218036r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218037s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f218038t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f218039u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
