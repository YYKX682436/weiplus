package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class d1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f216985d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216986e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216987f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f216988g = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.u0 f216989h = new com.tencent.wechat.aff.iam_scan.u0();

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.c1 f216990i = com.tencent.wechat.aff.iam_scan.c1.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.r f216991m = com.tencent.wechat.aff.iam_scan.r.NONE;

    /* renamed from: n, reason: collision with root package name */
    public boolean f216992n = false;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.f1 f216993o = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.a1 f216994p = new com.tencent.wechat.aff.iam_scan.a1();

    static {
        new com.tencent.wechat.aff.iam_scan.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.d1)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.d1 d1Var = (com.tencent.wechat.aff.iam_scan.d1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f216985d), java.lang.Long.valueOf(d1Var.f216985d)) && n51.f.a(this.f216986e, d1Var.f216986e) && n51.f.a(this.f216987f, d1Var.f216987f) && n51.f.a(java.lang.Long.valueOf(this.f216988g), java.lang.Long.valueOf(d1Var.f216988g)) && n51.f.a(this.f216989h, d1Var.f216989h) && n51.f.a(this.f216990i, d1Var.f216990i) && n51.f.a(this.f216991m, d1Var.f216991m) && n51.f.a(java.lang.Boolean.valueOf(this.f216992n), java.lang.Boolean.valueOf(d1Var.f216992n)) && n51.f.a(this.f216993o, d1Var.f216993o) && n51.f.a(this.f216994p, d1Var.f216994p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f216985d);
            java.lang.String str = this.f216986e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f216987f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f216988g);
            com.tencent.wechat.aff.iam_scan.u0 u0Var = this.f216989h;
            if (u0Var != null) {
                fVar.i(5, u0Var.computeSize());
                this.f216989h.writeFields(fVar);
            }
            com.tencent.wechat.aff.iam_scan.c1 c1Var = this.f216990i;
            if (c1Var != null) {
                fVar.e(6, c1Var.f216982d);
            }
            com.tencent.wechat.aff.iam_scan.r rVar = this.f216991m;
            if (rVar != null) {
                fVar.e(7, rVar.f217126d);
            }
            fVar.a(8, this.f216992n);
            com.tencent.wechat.aff.iam_scan.f1 f1Var = this.f216993o;
            if (f1Var != null) {
                fVar.e(9, f1Var.f217013d);
            }
            com.tencent.wechat.aff.iam_scan.a1 a1Var = this.f216994p;
            if (a1Var != null) {
                fVar.i(10, a1Var.computeSize());
                this.f216994p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f216985d) + 0;
            java.lang.String str3 = this.f216986e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f216987f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            int h18 = h17 + b36.f.h(4, this.f216988g);
            com.tencent.wechat.aff.iam_scan.u0 u0Var2 = this.f216989h;
            if (u0Var2 != null) {
                h18 += b36.f.i(5, u0Var2.computeSize());
            }
            com.tencent.wechat.aff.iam_scan.c1 c1Var2 = this.f216990i;
            if (c1Var2 != null) {
                h18 += b36.f.e(6, c1Var2.f216982d);
            }
            com.tencent.wechat.aff.iam_scan.r rVar2 = this.f216991m;
            if (rVar2 != null) {
                h18 += b36.f.e(7, rVar2.f217126d);
            }
            int a17 = h18 + b36.f.a(8, this.f216992n);
            com.tencent.wechat.aff.iam_scan.f1 f1Var2 = this.f216993o;
            if (f1Var2 != null) {
                a17 += b36.f.e(9, f1Var2.f217013d);
            }
            com.tencent.wechat.aff.iam_scan.a1 a1Var2 = this.f216994p;
            return a1Var2 != null ? a17 + b36.f.i(10, a1Var2.computeSize()) : a17;
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
        com.tencent.wechat.aff.iam_scan.c1 c1Var3 = null;
        com.tencent.wechat.aff.iam_scan.f1 f1Var3 = null;
        com.tencent.wechat.aff.iam_scan.r rVar3 = null;
        switch (intValue) {
            case 1:
                this.f216985d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f216986e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f216987f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f216988g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.iam_scan.u0 u0Var3 = new com.tencent.wechat.aff.iam_scan.u0();
                    if (bArr != null && bArr.length > 0) {
                        u0Var3.parseFrom(bArr);
                    }
                    this.f216989h = u0Var3;
                }
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    c1Var3 = com.tencent.wechat.aff.iam_scan.c1.UNKNOWN;
                } else if (g17 == 1) {
                    c1Var3 = com.tencent.wechat.aff.iam_scan.c1.SCAN;
                } else if (g17 == 2) {
                    c1Var3 = com.tencent.wechat.aff.iam_scan.c1.SCAN_MERGE;
                } else if (g17 == 3) {
                    c1Var3 = com.tencent.wechat.aff.iam_scan.c1.SCAN_GALLERY;
                } else if (g17 == 4) {
                    c1Var3 = com.tencent.wechat.aff.iam_scan.c1.LONG_PRESS_IMAGE;
                }
                this.f216990i = c1Var3;
                return 0;
            case 7:
                int g18 = aVar2.g(intValue);
                if (g18 == -1) {
                    rVar3 = com.tencent.wechat.aff.iam_scan.r.NONE;
                } else if (g18 == 1) {
                    rVar3 = com.tencent.wechat.aff.iam_scan.r.SUCCESS;
                } else if (g18 == 2) {
                    rVar3 = com.tencent.wechat.aff.iam_scan.r.NOT_SUPPORT;
                }
                this.f216991m = rVar3;
                return 0;
            case 8:
                this.f216992n = aVar2.c(intValue);
                return 0;
            case 9:
                switch (aVar2.g(intValue)) {
                    case 1:
                        f1Var3 = com.tencent.wechat.aff.iam_scan.f1.DEFAULT;
                        break;
                    case 2:
                        f1Var3 = com.tencent.wechat.aff.iam_scan.f1.DECODE_SUCCESS;
                        break;
                    case 3:
                        f1Var3 = com.tencent.wechat.aff.iam_scan.f1.SWITCH_TRANSLATE_TAB;
                        break;
                    case 4:
                        f1Var3 = com.tencent.wechat.aff.iam_scan.f1.SWITCH_GOODS_TAB;
                        break;
                    case 5:
                        f1Var3 = com.tencent.wechat.aff.iam_scan.f1.CLICK_GALLERY;
                        break;
                    case 6:
                        f1Var3 = com.tencent.wechat.aff.iam_scan.f1.CLICK_MY_QRCODE;
                        break;
                    case 7:
                        f1Var3 = com.tencent.wechat.aff.iam_scan.f1.SHOW_PRODUCT_RESULT;
                        break;
                }
                this.f216993o = f1Var3;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.iam_scan.a1 a1Var3 = new com.tencent.wechat.aff.iam_scan.a1();
                    if (bArr2 != null && bArr2.length > 0) {
                        a1Var3.parseFrom(bArr2);
                    }
                    this.f216994p = a1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.d1) super.parseFrom(bArr);
    }
}
