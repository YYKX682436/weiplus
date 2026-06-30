package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public class NewLifeActionPlatformProto extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto();
    public com.tencent.mm.protobuf.g byteArray = com.tencent.mm.protobuf.g.f192155b;

    public static com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto create() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto();
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto) && n51.f.a(this.byteArray, ((com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto) fVar).byteArray);
    }

    public com.tencent.mm.protobuf.g getByteArray() {
        return this.byteArray;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.byteArray;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.byteArray;
            if (gVar2 != null) {
                return 0 + b36.f.b(1, gVar2);
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
        this.byteArray = aVar2.d(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto setByteArray(com.tencent.mm.protobuf.g gVar) {
        this.byteArray = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto) super.parseFrom(bArr);
    }
}
