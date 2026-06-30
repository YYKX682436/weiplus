package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class SKBuiltinUint64_t extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.SKBuiltinUint64_t DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SKBuiltinUint64_t();
    public long ullVal = 0;

    public static com.tencent.wechat.aff.newlife.SKBuiltinUint64_t create() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinUint64_t();
    }

    public static com.tencent.wechat.aff.newlife.SKBuiltinUint64_t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.SKBuiltinUint64_t newBuilder() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinUint64_t();
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint64_t build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.SKBuiltinUint64_t) && n51.f.a(java.lang.Long.valueOf(this.ullVal), java.lang.Long.valueOf(((com.tencent.wechat.aff.newlife.SKBuiltinUint64_t) fVar).ullVal));
    }

    public long getUllVal() {
        return this.ullVal;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint64_t mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinUint64_t();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).h(1, this.ullVal);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.ullVal) + 0;
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
        this.ullVal = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint64_t setUllVal(long j17) {
        this.ullVal = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinUint64_t mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.SKBuiltinUint64_t parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.SKBuiltinUint64_t) super.parseFrom(bArr);
    }
}
