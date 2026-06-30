package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class s5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f218622d;

    /* renamed from: e, reason: collision with root package name */
    public double f218623e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218624f;

    /* renamed from: g, reason: collision with root package name */
    public int f218625g;

    /* renamed from: h, reason: collision with root package name */
    public int f218626h;

    /* renamed from: i, reason: collision with root package name */
    public int f218627i;

    /* renamed from: m, reason: collision with root package name */
    public int f218628m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f218629n = new boolean[8];

    static {
        new com.tencent.wechat.mm.biz.s5();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.s5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.s5 s5Var = (com.tencent.wechat.mm.biz.s5) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f218622d), java.lang.Double.valueOf(s5Var.f218622d)) && n51.f.a(java.lang.Double.valueOf(this.f218623e), java.lang.Double.valueOf(s5Var.f218623e)) && n51.f.a(this.f218624f, s5Var.f218624f) && n51.f.a(java.lang.Integer.valueOf(this.f218625g), java.lang.Integer.valueOf(s5Var.f218625g)) && n51.f.a(java.lang.Integer.valueOf(this.f218626h), java.lang.Integer.valueOf(s5Var.f218626h)) && n51.f.a(java.lang.Integer.valueOf(this.f218627i), java.lang.Integer.valueOf(s5Var.f218627i)) && n51.f.a(java.lang.Integer.valueOf(this.f218628m), java.lang.Integer.valueOf(s5Var.f218628m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.s5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218629n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f218622d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f218623e);
            }
            java.lang.String str = this.f218624f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f218625g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218626h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218627i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218628m);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f218622d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f218623e);
            }
            java.lang.String str2 = this.f218624f;
            if (str2 != null && zArr[3]) {
                c17 += b36.f.j(3, str2);
            }
            if (zArr[4]) {
                c17 += b36.f.e(4, this.f218625g);
            }
            if (zArr[5]) {
                c17 += b36.f.e(5, this.f218626h);
            }
            if (zArr[6]) {
                c17 += b36.f.e(6, this.f218627i);
            }
            return zArr[7] ? c17 + b36.f.e(7, this.f218628m) : c17;
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
                this.f218622d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218623e = aVar2.e(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218624f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218625g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218626h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218627i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218628m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.s5) super.parseFrom(bArr);
    }
}
