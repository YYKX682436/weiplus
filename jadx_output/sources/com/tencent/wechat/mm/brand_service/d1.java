package com.tencent.wechat.mm.brand_service;

/* loaded from: classes2.dex */
public class d1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.r f218878d;

    static {
        new com.tencent.wechat.mm.brand_service.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.d1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.d1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.mm.brand_service.d1) && n51.f.a(this.f218878d, ((com.tencent.wechat.mm.brand_service.d1) fVar).f218878d);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.brand_service.r rVar = this.f218878d;
            if (rVar != null) {
                fVar.i(1, rVar.computeSize());
                this.f218878d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.brand_service.r rVar2 = this.f218878d;
            if (rVar2 != null) {
                return 0 + b36.f.i(1, rVar2.computeSize());
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
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.brand_service.r rVar3 = new com.tencent.wechat.mm.brand_service.r();
            if (bArr != null && bArr.length > 0) {
                rVar3.parseFrom(bArr);
            }
            this.f218878d = rVar3;
        }
        return 0;
    }
}
