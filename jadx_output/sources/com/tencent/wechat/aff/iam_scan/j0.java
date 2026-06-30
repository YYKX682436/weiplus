package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class j0 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.j0 f217075f = new com.tencent.wechat.aff.iam_scan.j0();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.k0 f217076d = com.tencent.wechat.aff.iam_scan.k0.FrameCacheReplaced;

    /* renamed from: e, reason: collision with root package name */
    public long f217077e = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.j0)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.j0 j0Var = (com.tencent.wechat.aff.iam_scan.j0) fVar;
        return n51.f.a(this.f217076d, j0Var.f217076d) && n51.f.a(java.lang.Long.valueOf(this.f217077e), java.lang.Long.valueOf(j0Var.f217077e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.j0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.iam_scan.k0 k0Var = this.f217076d;
            if (k0Var != null) {
                fVar.e(1, k0Var.f217091d);
            }
            fVar.h(2, this.f217077e);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.iam_scan.k0 k0Var2 = this.f217076d;
            return (k0Var2 != null ? 0 + b36.f.e(1, k0Var2.f217091d) : 0) + b36.f.h(2, this.f217077e);
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
            int g17 = aVar2.g(intValue);
            this.f217076d = g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.aff.iam_scan.k0.FrameCacheConsumed : com.tencent.wechat.aff.iam_scan.k0.FrameCacheReplaced;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f217077e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.j0) super.parseFrom(bArr);
    }
}
