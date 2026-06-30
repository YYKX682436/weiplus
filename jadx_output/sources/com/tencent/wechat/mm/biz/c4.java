package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class c4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217938d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217939e;

    /* renamed from: f, reason: collision with root package name */
    public int f217940f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217941g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217942h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f217943i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f217944m;

    /* renamed from: n, reason: collision with root package name */
    public int f217945n;

    /* renamed from: o, reason: collision with root package name */
    public int f217946o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.a4 f217947p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.b4 f217948q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f217949r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f217950s = new boolean[13];

    static {
        new com.tencent.wechat.mm.biz.c4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.c4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.c4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.c4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.c4 c4Var = (com.tencent.wechat.mm.biz.c4) fVar;
        return n51.f.a(this.f217938d, c4Var.f217938d) && n51.f.a(this.f217939e, c4Var.f217939e) && n51.f.a(java.lang.Integer.valueOf(this.f217940f), java.lang.Integer.valueOf(c4Var.f217940f)) && n51.f.a(this.f217941g, c4Var.f217941g) && n51.f.a(this.f217942h, c4Var.f217942h) && n51.f.a(this.f217943i, c4Var.f217943i) && n51.f.a(this.f217944m, c4Var.f217944m) && n51.f.a(java.lang.Integer.valueOf(this.f217945n), java.lang.Integer.valueOf(c4Var.f217945n)) && n51.f.a(java.lang.Integer.valueOf(this.f217946o), java.lang.Integer.valueOf(c4Var.f217946o)) && n51.f.a(this.f217947p, c4Var.f217947p) && n51.f.a(this.f217948q, c4Var.f217948q) && n51.f.a(this.f217949r, c4Var.f217949r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.c4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217950s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217938d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217939e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f217940f);
            }
            java.lang.String str3 = this.f217941g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f217942h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f217943i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f217944m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217945n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f217946o);
            }
            com.tencent.wechat.mm.biz.a4 a4Var = this.f217947p;
            if (a4Var != null && zArr[10]) {
                fVar.i(10, a4Var.computeSize());
                this.f217947p.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.b4 b4Var = this.f217948q;
            if (b4Var != null && zArr[11]) {
                fVar.i(11, b4Var.computeSize());
                this.f217948q.writeFields(fVar);
            }
            java.lang.String str7 = this.f217949r;
            if (str7 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str7);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f217938d;
            int j17 = (str8 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str8);
            java.lang.String str9 = this.f217939e;
            if (str9 != null && zArr[2]) {
                j17 += b36.f.j(2, str9);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f217940f);
            }
            java.lang.String str10 = this.f217941g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f217942h;
            if (str11 != null && zArr[5]) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f217943i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f217944m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f217945n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f217946o);
            }
            com.tencent.wechat.mm.biz.a4 a4Var2 = this.f217947p;
            if (a4Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, a4Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.b4 b4Var2 = this.f217948q;
            if (b4Var2 != null && zArr[11]) {
                j17 += b36.f.i(11, b4Var2.computeSize());
            }
            java.lang.String str14 = this.f217949r;
            return (str14 == null || !zArr[12]) ? j17 : j17 + b36.f.j(12, str14);
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
                this.f217938d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217939e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217940f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217941g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217942h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217943i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217944m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217945n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217946o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.biz.a4 a4Var3 = new com.tencent.wechat.mm.biz.a4();
                    if (bArr != null && bArr.length > 0) {
                        a4Var3.parseFrom(bArr);
                    }
                    this.f217947p = a4Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.mm.biz.b4 b4Var3 = new com.tencent.wechat.mm.biz.b4();
                    if (bArr2 != null && bArr2.length > 0) {
                        b4Var3.parseFrom(bArr2);
                    }
                    this.f217948q = b4Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f217949r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
