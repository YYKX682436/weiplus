package com.tencent.wechat.aff.status;

/* loaded from: classes2.dex */
public class BaseRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.BaseRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.BaseRequest();
    public int ClientVersion;
    public com.tencent.mm.protobuf.g DeviceID;
    public com.tencent.mm.protobuf.g DeviceType;
    public int Scene;
    public com.tencent.mm.protobuf.g SessionKey;
    public int Uin;

    public BaseRequest() {
        com.tencent.mm.protobuf.g gVar = com.tencent.mm.protobuf.g.f192155b;
        this.SessionKey = gVar;
        this.Uin = 0;
        this.DeviceID = gVar;
        this.ClientVersion = 0;
        this.DeviceType = gVar;
        this.Scene = 0;
    }

    public static com.tencent.wechat.aff.status.BaseRequest create() {
        return new com.tencent.wechat.aff.status.BaseRequest();
    }

    public static com.tencent.wechat.aff.status.BaseRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.BaseRequest newBuilder() {
        return new com.tencent.wechat.aff.status.BaseRequest();
    }

    public com.tencent.wechat.aff.status.BaseRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.BaseRequest)) {
            return false;
        }
        com.tencent.wechat.aff.status.BaseRequest baseRequest = (com.tencent.wechat.aff.status.BaseRequest) fVar;
        return n51.f.a(this.SessionKey, baseRequest.SessionKey) && n51.f.a(java.lang.Integer.valueOf(this.Uin), java.lang.Integer.valueOf(baseRequest.Uin)) && n51.f.a(this.DeviceID, baseRequest.DeviceID) && n51.f.a(java.lang.Integer.valueOf(this.ClientVersion), java.lang.Integer.valueOf(baseRequest.ClientVersion)) && n51.f.a(this.DeviceType, baseRequest.DeviceType) && n51.f.a(java.lang.Integer.valueOf(this.Scene), java.lang.Integer.valueOf(baseRequest.Scene));
    }

    public int getClientVersion() {
        return this.ClientVersion;
    }

    public com.tencent.mm.protobuf.g getDeviceID() {
        return this.DeviceID;
    }

    public com.tencent.mm.protobuf.g getDeviceType() {
        return this.DeviceType;
    }

    public int getScene() {
        return this.Scene;
    }

    public com.tencent.mm.protobuf.g getSessionKey() {
        return this.SessionKey;
    }

    public int getUin() {
        return this.Uin;
    }

    public com.tencent.wechat.aff.status.BaseRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.BaseRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.SessionKey;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.Uin);
            com.tencent.mm.protobuf.g gVar2 = this.DeviceID;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.ClientVersion);
            com.tencent.mm.protobuf.g gVar3 = this.DeviceType;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.e(6, this.Scene);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.SessionKey;
            int b17 = (gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0) + b36.f.e(2, this.Uin);
            com.tencent.mm.protobuf.g gVar5 = this.DeviceID;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            int e17 = b17 + b36.f.e(4, this.ClientVersion);
            com.tencent.mm.protobuf.g gVar6 = this.DeviceType;
            if (gVar6 != null) {
                e17 += b36.f.b(5, gVar6);
            }
            return e17 + b36.f.e(6, this.Scene);
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
        switch (intValue) {
            case 1:
                this.SessionKey = aVar2.d(intValue);
                return 0;
            case 2:
                this.Uin = aVar2.g(intValue);
                return 0;
            case 3:
                this.DeviceID = aVar2.d(intValue);
                return 0;
            case 4:
                this.ClientVersion = aVar2.g(intValue);
                return 0;
            case 5:
                this.DeviceType = aVar2.d(intValue);
                return 0;
            case 6:
                this.Scene = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.status.BaseRequest setClientVersion(int i17) {
        this.ClientVersion = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.BaseRequest setDeviceID(com.tencent.mm.protobuf.g gVar) {
        this.DeviceID = gVar;
        return this;
    }

    public com.tencent.wechat.aff.status.BaseRequest setDeviceType(com.tencent.mm.protobuf.g gVar) {
        this.DeviceType = gVar;
        return this;
    }

    public com.tencent.wechat.aff.status.BaseRequest setScene(int i17) {
        this.Scene = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.BaseRequest setSessionKey(com.tencent.mm.protobuf.g gVar) {
        this.SessionKey = gVar;
        return this;
    }

    public com.tencent.wechat.aff.status.BaseRequest setUin(int i17) {
        this.Uin = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.BaseRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.BaseRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.BaseRequest) super.parseFrom(bArr);
    }
}
