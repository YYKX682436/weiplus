package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.j f217064q = new com.tencent.wechat.aff.iam_scan.j();

    /* renamed from: d, reason: collision with root package name */
    public long f217065d;

    /* renamed from: e, reason: collision with root package name */
    public long f217066e;

    /* renamed from: f, reason: collision with root package name */
    public long f217067f;

    /* renamed from: g, reason: collision with root package name */
    public long f217068g;

    /* renamed from: h, reason: collision with root package name */
    public int f217069h;

    /* renamed from: i, reason: collision with root package name */
    public int f217070i;

    /* renamed from: m, reason: collision with root package name */
    public int f217071m;

    /* renamed from: n, reason: collision with root package name */
    public int f217072n;

    /* renamed from: o, reason: collision with root package name */
    public int f217073o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f217074p = new boolean[11];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.j)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.j jVar = (com.tencent.wechat.aff.iam_scan.j) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217065d), java.lang.Long.valueOf(jVar.f217065d)) && n51.f.a(java.lang.Long.valueOf(this.f217066e), java.lang.Long.valueOf(jVar.f217066e)) && n51.f.a(java.lang.Long.valueOf(this.f217067f), java.lang.Long.valueOf(jVar.f217067f)) && n51.f.a(java.lang.Long.valueOf(this.f217068g), java.lang.Long.valueOf(jVar.f217068g)) && n51.f.a(java.lang.Integer.valueOf(this.f217069h), java.lang.Integer.valueOf(jVar.f217069h)) && n51.f.a(java.lang.Integer.valueOf(this.f217070i), java.lang.Integer.valueOf(jVar.f217070i)) && n51.f.a(java.lang.Integer.valueOf(this.f217071m), java.lang.Integer.valueOf(jVar.f217071m)) && n51.f.a(java.lang.Integer.valueOf(this.f217072n), java.lang.Integer.valueOf(jVar.f217072n)) && n51.f.a(java.lang.Integer.valueOf(this.f217073o), java.lang.Integer.valueOf(jVar.f217073o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.j();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217074p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217065d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f217066e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f217067f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f217068g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f217069h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f217070i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f217071m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f217072n);
            }
            if (zArr[10]) {
                fVar.e(10, this.f217073o);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f217065d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f217066e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f217067f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f217068g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f217069h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f217070i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f217071m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f217072n);
            }
            return zArr[10] ? h17 + b36.f.e(10, this.f217073o) : h17;
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
                this.f217065d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217066e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217067f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217068g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217069h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217070i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f217071m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f217072n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f217073o = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.j) super.parseFrom(bArr);
    }
}
