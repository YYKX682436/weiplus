package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f217104d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217105e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f217106f = new boolean[3];

    static {
        new com.tencent.wechat.aff.iam_scan.n();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.n)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.n nVar = (com.tencent.wechat.aff.iam_scan.n) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217104d), java.lang.Long.valueOf(nVar.f217104d)) && n51.f.a(java.lang.Boolean.valueOf(this.f217105e), java.lang.Boolean.valueOf(nVar.f217105e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.n();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217106f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f217104d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f217105e);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f217104d) : 0;
            return zArr[2] ? h17 + b36.f.a(2, this.f217105e) : h17;
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
            this.f217104d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f217105e = aVar2.c(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.n) super.parseFrom(bArr);
    }
}
