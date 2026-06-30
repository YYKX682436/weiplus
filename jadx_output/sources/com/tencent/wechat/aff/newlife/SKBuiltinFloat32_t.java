package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class SKBuiltinFloat32_t extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t();
    public float fVal = 0.0f;

    public static com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t create() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t();
    }

    public static com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t newBuilder() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t();
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t) && n51.f.a(java.lang.Float.valueOf(this.fVal), java.lang.Float.valueOf(((com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t) fVar).fVal));
    }

    public float getFVal() {
        return this.fVal;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).d(1, this.fVal);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.fVal) + 0;
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
        this.fVal = aVar2.f(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t setFVal(float f17) {
        this.fVal = f17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.SKBuiltinFloat32_t) super.parseFrom(bArr);
    }
}
