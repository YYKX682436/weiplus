package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class SKBuiltinUint8_t extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.SKBuiltinUint8_t DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SKBuiltinUint8_t();
    public int uiVal = 0;

    public static com.tencent.wechat.aff.newlife.SKBuiltinUint8_t create() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinUint8_t();
    }

    public static com.tencent.wechat.aff.newlife.SKBuiltinUint8_t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.SKBuiltinUint8_t newBuilder() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinUint8_t();
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint8_t build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.SKBuiltinUint8_t) && n51.f.a(java.lang.Integer.valueOf(this.uiVal), java.lang.Integer.valueOf(((com.tencent.wechat.aff.newlife.SKBuiltinUint8_t) fVar).uiVal));
    }

    public int getUiVal() {
        return this.uiVal;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint8_t mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinUint8_t();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).e(1, this.uiVal);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.uiVal) + 0;
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
        this.uiVal = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint8_t setUiVal(int i17) {
        this.uiVal = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint8_t mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.SKBuiltinUint8_t parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.SKBuiltinUint8_t) super.parseFrom(bArr);
    }
}
