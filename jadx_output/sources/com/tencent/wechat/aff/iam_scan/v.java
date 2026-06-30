package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f217143d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f217144e = 0.0f;

    static {
        new com.tencent.wechat.aff.iam_scan.v();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.v parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.v) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.v)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.v vVar = (com.tencent.wechat.aff.iam_scan.v) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f217143d), java.lang.Float.valueOf(vVar.f217143d)) && n51.f.a(java.lang.Float.valueOf(this.f217144e), java.lang.Float.valueOf(vVar.f217144e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.v();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f217143d);
            fVar.d(2, this.f217144e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f217143d) + 0 + b36.f.d(2, this.f217144e);
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
            this.f217143d = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f217144e = aVar2.f(intValue);
        return 0;
    }
}
