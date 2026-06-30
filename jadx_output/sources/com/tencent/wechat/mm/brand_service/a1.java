package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class a1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.t0 f218849d;

    static {
        new com.tencent.wechat.mm.brand_service.a1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.a1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.a1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.mm.brand_service.a1) && n51.f.a(this.f218849d, ((com.tencent.wechat.mm.brand_service.a1) fVar).f218849d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.a1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.brand_service.t0 t0Var = this.f218849d;
            if (t0Var != null) {
                fVar.e(1, t0Var.f219191d);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.brand_service.t0 t0Var2 = this.f218849d;
            if (t0Var2 != null) {
                return 0 + b36.f.e(1, t0Var2.f219191d);
            }
            return 0;
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
        if (intValue != 1) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f218849d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.tencent.wechat.mm.brand_service.t0.TAB_TYPE_MACHINE : com.tencent.wechat.mm.brand_service.t0.TAB_TYPE_RECOMMEND : com.tencent.wechat.mm.brand_service.t0.TAB_TYPE_FOLLOW : com.tencent.wechat.mm.brand_service.t0.TAB_TYPE_NONE;
        return 0;
    }
}
