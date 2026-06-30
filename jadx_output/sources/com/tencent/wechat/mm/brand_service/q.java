package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219148d;

    /* renamed from: e, reason: collision with root package name */
    public int f219149e;

    static {
        new com.tencent.wechat.mm.brand_service.q();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.q parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.q) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.q)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.q qVar = (com.tencent.wechat.mm.brand_service.q) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219148d), java.lang.Integer.valueOf(qVar.f219148d)) && n51.f.a(java.lang.Integer.valueOf(this.f219149e), java.lang.Integer.valueOf(qVar.f219149e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.q();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f219148d);
            fVar.e(2, this.f219149e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f219148d) + 0 + b36.f.e(2, this.f219149e);
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
            this.f219148d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f219149e = aVar2.g(intValue);
        return 0;
    }
}
