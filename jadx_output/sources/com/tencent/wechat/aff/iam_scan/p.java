package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f217114d;

    /* renamed from: e, reason: collision with root package name */
    public float f217115e;

    /* renamed from: f, reason: collision with root package name */
    public float f217116f;

    /* renamed from: g, reason: collision with root package name */
    public float f217117g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f217118h = new boolean[5];

    static {
        new com.tencent.wechat.aff.iam_scan.p();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.p)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.p pVar = (com.tencent.wechat.aff.iam_scan.p) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f217114d), java.lang.Float.valueOf(pVar.f217114d)) && n51.f.a(java.lang.Float.valueOf(this.f217115e), java.lang.Float.valueOf(pVar.f217115e)) && n51.f.a(java.lang.Float.valueOf(this.f217116f), java.lang.Float.valueOf(pVar.f217116f)) && n51.f.a(java.lang.Float.valueOf(this.f217117g), java.lang.Float.valueOf(pVar.f217117g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.p();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217118h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f217114d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f217115e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f217116f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f217117g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f217114d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f217115e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f217116f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f217117g) : d17;
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
        if (intValue == 1) {
            this.f217114d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217115e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f217116f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f217117g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.p) super.parseFrom(bArr);
    }
}
