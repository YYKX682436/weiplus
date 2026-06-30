package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes8.dex */
public class y0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f217183d;

    /* renamed from: e, reason: collision with root package name */
    public float f217184e;

    /* renamed from: f, reason: collision with root package name */
    public float f217185f;

    /* renamed from: g, reason: collision with root package name */
    public float f217186g;

    /* renamed from: h, reason: collision with root package name */
    public float f217187h;

    /* renamed from: i, reason: collision with root package name */
    public int f217188i;

    /* renamed from: m, reason: collision with root package name */
    public int f217189m;

    /* renamed from: n, reason: collision with root package name */
    public int f217190n;

    /* renamed from: o, reason: collision with root package name */
    public int f217191o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f217192p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f217193q = new boolean[11];

    static {
        new com.tencent.wechat.aff.iam_scan.y0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.y0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.y0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.y0)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.y0 y0Var = (com.tencent.wechat.aff.iam_scan.y0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f217183d), java.lang.Float.valueOf(y0Var.f217183d)) && n51.f.a(java.lang.Float.valueOf(this.f217184e), java.lang.Float.valueOf(y0Var.f217184e)) && n51.f.a(java.lang.Float.valueOf(this.f217185f), java.lang.Float.valueOf(y0Var.f217185f)) && n51.f.a(java.lang.Float.valueOf(this.f217186g), java.lang.Float.valueOf(y0Var.f217186g)) && n51.f.a(java.lang.Float.valueOf(this.f217187h), java.lang.Float.valueOf(y0Var.f217187h)) && n51.f.a(java.lang.Integer.valueOf(this.f217188i), java.lang.Integer.valueOf(y0Var.f217188i)) && n51.f.a(java.lang.Integer.valueOf(this.f217189m), java.lang.Integer.valueOf(y0Var.f217189m)) && n51.f.a(java.lang.Integer.valueOf(this.f217190n), java.lang.Integer.valueOf(y0Var.f217190n)) && n51.f.a(java.lang.Integer.valueOf(this.f217191o), java.lang.Integer.valueOf(y0Var.f217191o)) && n51.f.a(java.lang.Boolean.valueOf(this.f217192p), java.lang.Boolean.valueOf(y0Var.f217192p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.y0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217193q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f217183d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f217184e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f217185f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f217186g);
            }
            if (zArr[5]) {
                fVar.d(5, this.f217187h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f217188i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f217189m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217190n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f217191o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f217192p);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f217183d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f217184e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f217185f);
            }
            if (zArr[4]) {
                d17 += b36.f.d(4, this.f217186g);
            }
            if (zArr[5]) {
                d17 += b36.f.d(5, this.f217187h);
            }
            if (zArr[6]) {
                d17 += b36.f.e(6, this.f217188i);
            }
            if (zArr[7]) {
                d17 += b36.f.e(7, this.f217189m);
            }
            if (zArr[8]) {
                d17 += b36.f.e(8, this.f217190n);
            }
            if (zArr[9]) {
                d17 += b36.f.e(9, this.f217191o);
            }
            return zArr[10] ? d17 + b36.f.a(10, this.f217192p) : d17;
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
                this.f217183d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217184e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217185f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217186g = aVar2.f(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217187h = aVar2.f(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217188i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217189m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217190n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f217191o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f217192p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
