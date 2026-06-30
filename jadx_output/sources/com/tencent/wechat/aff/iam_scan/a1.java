package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes12.dex */
public class a1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f216947d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f216948e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f216949f = 0;

    static {
        new com.tencent.wechat.aff.iam_scan.a1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.a1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.a1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.a1)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.a1 a1Var = (com.tencent.wechat.aff.iam_scan.a1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216947d), java.lang.Integer.valueOf(a1Var.f216947d)) && n51.f.a(java.lang.Integer.valueOf(this.f216948e), java.lang.Integer.valueOf(a1Var.f216948e)) && n51.f.a(java.lang.Integer.valueOf(this.f216949f), java.lang.Integer.valueOf(a1Var.f216949f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.a1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f216947d);
            fVar.e(2, this.f216948e);
            fVar.e(3, this.f216949f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f216947d) + 0 + b36.f.e(2, this.f216948e) + b36.f.e(3, this.f216949f);
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
            this.f216947d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f216948e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f216949f = aVar2.g(intValue);
        return 0;
    }
}
