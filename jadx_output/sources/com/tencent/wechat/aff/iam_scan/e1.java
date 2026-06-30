package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes4.dex */
public class e1 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.e1 f217001f = new com.tencent.wechat.aff.iam_scan.e1();

    /* renamed from: d, reason: collision with root package name */
    public float f217002d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217003e = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.e1)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.e1 e1Var = (com.tencent.wechat.aff.iam_scan.e1) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f217002d), java.lang.Float.valueOf(e1Var.f217002d)) && n51.f.a(java.lang.Boolean.valueOf(this.f217003e), java.lang.Boolean.valueOf(e1Var.f217003e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.e1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f217002d);
            fVar.a(2, this.f217003e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f217002d) + 0 + b36.f.a(2, this.f217003e);
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
            this.f217002d = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f217003e = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.e1) super.parseFrom(bArr);
    }
}
