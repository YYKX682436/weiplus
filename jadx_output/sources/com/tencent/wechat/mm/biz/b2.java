package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class b2 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217905e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217906f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.g2 f217908h;

    /* renamed from: i, reason: collision with root package name */
    public int f217909i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.b5 f217910m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.d2 f217911n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.w3 f217912o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.e2 f217913p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.p1 f217914q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f217915r;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f217904d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f217907g = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f217916s = new boolean[13];

    static {
        new com.tencent.wechat.mm.biz.b2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.b2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.b2 b2Var = (com.tencent.wechat.mm.biz.b2) fVar;
        return n51.f.a(this.f217904d, b2Var.f217904d) && n51.f.a(this.f217905e, b2Var.f217905e) && n51.f.a(this.f217906f, b2Var.f217906f) && n51.f.a(this.f217907g, b2Var.f217907g) && n51.f.a(this.f217908h, b2Var.f217908h) && n51.f.a(java.lang.Integer.valueOf(this.f217909i), java.lang.Integer.valueOf(b2Var.f217909i)) && n51.f.a(this.f217910m, b2Var.f217910m) && n51.f.a(this.f217911n, b2Var.f217911n) && n51.f.a(this.f217912o, b2Var.f217912o) && n51.f.a(this.f217913p, b2Var.f217913p) && n51.f.a(this.f217914q, b2Var.f217914q) && n51.f.a(this.f217915r, b2Var.f217915r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.b2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217916s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f217904d);
            java.lang.String str = this.f217905e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f217906f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f217907g);
            com.tencent.wechat.mm.biz.g2 g2Var = this.f217908h;
            if (g2Var != null && zArr[5]) {
                fVar.i(5, g2Var.computeSize());
                this.f217908h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f217909i);
            }
            com.tencent.wechat.mm.biz.b5 b5Var = this.f217910m;
            if (b5Var != null && zArr[7]) {
                fVar.e(7, b5Var.f217927d);
            }
            com.tencent.wechat.mm.biz.d2 d2Var = this.f217911n;
            if (d2Var != null && zArr[8]) {
                fVar.i(8, d2Var.computeSize());
                this.f217911n.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.w3 w3Var = this.f217912o;
            if (w3Var != null && zArr[9]) {
                fVar.i(9, w3Var.computeSize());
                this.f217912o.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.e2 e2Var = this.f217913p;
            if (e2Var != null && zArr[10]) {
                fVar.i(10, e2Var.computeSize());
                this.f217913p.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.p1 p1Var = this.f217914q;
            if (p1Var != null && zArr[11]) {
                fVar.i(11, p1Var.computeSize());
                this.f217914q.writeFields(fVar);
            }
            java.lang.String str3 = this.f217915r;
            if (str3 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str3);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f217904d) + 0;
            java.lang.String str4 = this.f217905e;
            if (str4 != null && zArr[2]) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f217906f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            int g18 = g17 + b36.f.g(4, 1, this.f217907g);
            com.tencent.wechat.mm.biz.g2 g2Var2 = this.f217908h;
            if (g2Var2 != null && zArr[5]) {
                g18 += b36.f.i(5, g2Var2.computeSize());
            }
            if (zArr[6]) {
                g18 += b36.f.e(6, this.f217909i);
            }
            com.tencent.wechat.mm.biz.b5 b5Var2 = this.f217910m;
            if (b5Var2 != null && zArr[7]) {
                g18 += b36.f.e(7, b5Var2.f217927d);
            }
            com.tencent.wechat.mm.biz.d2 d2Var2 = this.f217911n;
            if (d2Var2 != null && zArr[8]) {
                g18 += b36.f.i(8, d2Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.w3 w3Var2 = this.f217912o;
            if (w3Var2 != null && zArr[9]) {
                g18 += b36.f.i(9, w3Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.e2 e2Var2 = this.f217913p;
            if (e2Var2 != null && zArr[10]) {
                g18 += b36.f.i(10, e2Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.p1 p1Var2 = this.f217914q;
            if (p1Var2 != null && zArr[11]) {
                g18 += b36.f.i(11, p1Var2.computeSize());
            }
            java.lang.String str6 = this.f217915r;
            return (str6 == null || !zArr[12]) ? g18 : g18 + b36.f.j(12, str6);
        }
        if (i17 == 2) {
            this.f217904d.clear();
            this.f217907g.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.biz.f2 f2Var = new com.tencent.wechat.mm.biz.f2();
                    if (bArr != null && bArr.length > 0) {
                        f2Var.parseFrom(bArr);
                    }
                    this.f217904d.add(f2Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f217905e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217906f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217907g.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.mm.biz.g2 g2Var3 = new com.tencent.wechat.mm.biz.g2();
                    if (bArr2 != null && bArr2.length > 0) {
                        g2Var3.parseFrom(bArr2);
                    }
                    this.f217908h = g2Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f217909i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                int g19 = aVar2.g(intValue);
                this.f217910m = g19 != 0 ? g19 != 1 ? g19 != 2 ? null : com.tencent.wechat.mm.biz.b5.PUBLISH_BIZ_TYPE_PHOTO : com.tencent.wechat.mm.biz.b5.PUBLISH_BIZ_TYPE_SUBSCRIBE : com.tencent.wechat.mm.biz.b5.PUBLISH_BIZ_TYPE_DEFAULT;
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.mm.biz.d2 d2Var3 = new com.tencent.wechat.mm.biz.d2();
                    if (bArr3 != null && bArr3.length > 0) {
                        d2Var3.parseFrom(bArr3);
                    }
                    this.f217911n = d2Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.tencent.wechat.mm.biz.w3 w3Var3 = new com.tencent.wechat.mm.biz.w3();
                    if (bArr4 != null && bArr4.length > 0) {
                        w3Var3.parseFrom(bArr4);
                    }
                    this.f217912o = w3Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    com.tencent.wechat.mm.biz.e2 e2Var3 = new com.tencent.wechat.mm.biz.e2();
                    if (bArr5 != null && bArr5.length > 0) {
                        e2Var3.parseFrom(bArr5);
                    }
                    this.f217913p = e2Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    com.tencent.wechat.mm.biz.p1 p1Var3 = new com.tencent.wechat.mm.biz.p1();
                    if (bArr6 != null && bArr6.length > 0) {
                        p1Var3.parseFrom(bArr6);
                    }
                    this.f217914q = p1Var3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f217915r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.b2) super.parseFrom(bArr);
    }
}
