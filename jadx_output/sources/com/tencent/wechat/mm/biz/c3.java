package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class c3 extends com.tencent.mm.protobuf.f {
    static {
        new com.tencent.wechat.mm.biz.c3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.c3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.c3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.c3)) {
            return false;
        }
        return true;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.c3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 0;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                ((java.lang.Integer) objArr[2]).intValue();
            }
            return -1;
        }
        c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
        for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
            if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.b();
            }
        }
        return 0;
    }
}
