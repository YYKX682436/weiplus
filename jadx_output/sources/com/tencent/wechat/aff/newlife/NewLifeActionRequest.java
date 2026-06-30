package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public class NewLifeActionRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeActionRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeActionRequest();
    public java.lang.String cmdId = "";
    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto proto = com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto.getDefaultInstance();

    public static com.tencent.wechat.aff.newlife.NewLifeActionRequest create() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionRequest();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeActionRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeActionRequest newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionRequest();
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeActionRequest)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeActionRequest newLifeActionRequest = (com.tencent.wechat.aff.newlife.NewLifeActionRequest) fVar;
        return n51.f.a(this.cmdId, newLifeActionRequest.cmdId) && n51.f.a(this.proto, newLifeActionRequest.proto);
    }

    public java.lang.String getCmdId() {
        return this.cmdId;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto getProto() {
        return this.proto;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.cmdId;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newLifeActionPlatformProto = this.proto;
            if (newLifeActionPlatformProto != null) {
                fVar.i(2, newLifeActionPlatformProto.computeSize());
                this.proto.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.cmdId;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newLifeActionPlatformProto2 = this.proto;
            return newLifeActionPlatformProto2 != null ? j17 + b36.f.i(2, newLifeActionPlatformProto2.computeSize()) : j17;
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
            this.cmdId = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newLifeActionPlatformProto3 = new com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto();
            if (bArr != null && bArr.length > 0) {
                newLifeActionPlatformProto3.parseFrom(bArr);
            }
            this.proto = newLifeActionPlatformProto3;
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionRequest setCmdId(java.lang.String str) {
        this.cmdId = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionRequest setProto(com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newLifeActionPlatformProto) {
        this.proto = newLifeActionPlatformProto;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeActionRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeActionRequest) super.parseFrom(bArr);
    }
}
