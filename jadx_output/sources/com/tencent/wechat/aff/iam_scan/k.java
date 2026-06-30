package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.k f217078p = new com.tencent.wechat.aff.iam_scan.k();

    /* renamed from: d, reason: collision with root package name */
    public long f217079d;

    /* renamed from: e, reason: collision with root package name */
    public long f217080e;

    /* renamed from: f, reason: collision with root package name */
    public long f217081f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.o f217082g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.z0 f217083h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.m f217084i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.m f217085m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.l f217086n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f217087o = new boolean[9];

    public com.tencent.wechat.aff.iam_scan.l b() {
        return this.f217087o[8] ? this.f217086n : new com.tencent.wechat.aff.iam_scan.l();
    }

    public com.tencent.wechat.aff.iam_scan.z0 c() {
        return this.f217087o[5] ? this.f217083h : new com.tencent.wechat.aff.iam_scan.z0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.k)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.k kVar = (com.tencent.wechat.aff.iam_scan.k) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217079d), java.lang.Long.valueOf(kVar.f217079d)) && n51.f.a(java.lang.Long.valueOf(this.f217080e), java.lang.Long.valueOf(kVar.f217080e)) && n51.f.a(java.lang.Long.valueOf(this.f217081f), java.lang.Long.valueOf(kVar.f217081f)) && n51.f.a(this.f217082g, kVar.f217082g) && n51.f.a(this.f217083h, kVar.f217083h) && n51.f.a(this.f217084i, kVar.f217084i) && n51.f.a(this.f217085m, kVar.f217085m) && n51.f.a(this.f217086n, kVar.f217086n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217087o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217079d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f217080e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f217081f);
            }
            com.tencent.wechat.aff.iam_scan.o oVar = this.f217082g;
            if (oVar != null && zArr[4]) {
                fVar.e(4, oVar.f217113d);
            }
            com.tencent.wechat.aff.iam_scan.z0 z0Var = this.f217083h;
            if (z0Var != null && zArr[5]) {
                fVar.i(5, z0Var.computeSize());
                this.f217083h.writeFields(fVar);
            }
            com.tencent.wechat.aff.iam_scan.m mVar = this.f217084i;
            if (mVar != null && zArr[6]) {
                fVar.i(6, mVar.computeSize());
                this.f217084i.writeFields(fVar);
            }
            com.tencent.wechat.aff.iam_scan.m mVar2 = this.f217085m;
            if (mVar2 != null && zArr[7]) {
                fVar.i(7, mVar2.computeSize());
                this.f217085m.writeFields(fVar);
            }
            com.tencent.wechat.aff.iam_scan.l lVar = this.f217086n;
            if (lVar != null && zArr[8]) {
                fVar.i(8, lVar.computeSize());
                this.f217086n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f217079d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f217080e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f217081f);
            }
            com.tencent.wechat.aff.iam_scan.o oVar2 = this.f217082g;
            if (oVar2 != null && zArr[4]) {
                h17 += b36.f.e(4, oVar2.f217113d);
            }
            com.tencent.wechat.aff.iam_scan.z0 z0Var2 = this.f217083h;
            if (z0Var2 != null && zArr[5]) {
                h17 += b36.f.i(5, z0Var2.computeSize());
            }
            com.tencent.wechat.aff.iam_scan.m mVar3 = this.f217084i;
            if (mVar3 != null && zArr[6]) {
                h17 += b36.f.i(6, mVar3.computeSize());
            }
            com.tencent.wechat.aff.iam_scan.m mVar4 = this.f217085m;
            if (mVar4 != null && zArr[7]) {
                h17 += b36.f.i(7, mVar4.computeSize());
            }
            com.tencent.wechat.aff.iam_scan.l lVar2 = this.f217086n;
            return (lVar2 == null || !zArr[8]) ? h17 : h17 + b36.f.i(8, lVar2.computeSize());
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
                this.f217079d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217080e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217081f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                this.f217082g = g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? g17 != 5 ? null : com.tencent.wechat.aff.iam_scan.o.GOODS_STATUS_INIT_FAILED : com.tencent.wechat.aff.iam_scan.o.GOODS_STATUS_FAILED : com.tencent.wechat.aff.iam_scan.o.GOODS_STATUS_SUCCESS : com.tencent.wechat.aff.iam_scan.o.GOODS_STATUS_PROCESSING : com.tencent.wechat.aff.iam_scan.o.GOODS_STATUS_NOT_HANDLED;
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.iam_scan.z0 z0Var3 = new com.tencent.wechat.aff.iam_scan.z0();
                    if (bArr != null && bArr.length > 0) {
                        z0Var3.parseFrom(bArr);
                    }
                    this.f217083h = z0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.iam_scan.m mVar5 = new com.tencent.wechat.aff.iam_scan.m();
                    if (bArr2 != null && bArr2.length > 0) {
                        mVar5.parseFrom(bArr2);
                    }
                    this.f217084i = mVar5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.aff.iam_scan.m mVar6 = new com.tencent.wechat.aff.iam_scan.m();
                    if (bArr3 != null && bArr3.length > 0) {
                        mVar6.parseFrom(bArr3);
                    }
                    this.f217085m = mVar6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.tencent.wechat.aff.iam_scan.l lVar3 = new com.tencent.wechat.aff.iam_scan.l();
                    if (bArr4 != null && bArr4.length > 0) {
                        lVar3.parseFrom(bArr4);
                    }
                    this.f217086n = lVar3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.k) super.parseFrom(bArr);
    }
}
