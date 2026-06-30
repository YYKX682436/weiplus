package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class IconConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.IconConfig DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.IconConfig();

    /* renamed from: id, reason: collision with root package name */
    public int f217402id = 0;
    public int positionFlag = 0;

    public static com.tencent.wechat.aff.newlife.IconConfig create() {
        return new com.tencent.wechat.aff.newlife.IconConfig();
    }

    public static com.tencent.wechat.aff.newlife.IconConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.IconConfig newBuilder() {
        return new com.tencent.wechat.aff.newlife.IconConfig();
    }

    public com.tencent.wechat.aff.newlife.IconConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.IconConfig)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.IconConfig iconConfig = (com.tencent.wechat.aff.newlife.IconConfig) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217402id), java.lang.Integer.valueOf(iconConfig.f217402id)) && n51.f.a(java.lang.Integer.valueOf(this.positionFlag), java.lang.Integer.valueOf(iconConfig.positionFlag));
    }

    public int getId() {
        return this.f217402id;
    }

    public int getPositionFlag() {
        return this.positionFlag;
    }

    public com.tencent.wechat.aff.newlife.IconConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.IconConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f217402id);
            fVar.e(2, this.positionFlag);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f217402id) + 0 + b36.f.e(2, this.positionFlag);
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
            this.f217402id = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.positionFlag = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.IconConfig setId(int i17) {
        this.f217402id = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.IconConfig setPositionFlag(int i17) {
        this.positionFlag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.IconConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.IconConfig parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.IconConfig) super.parseFrom(bArr);
    }
}
