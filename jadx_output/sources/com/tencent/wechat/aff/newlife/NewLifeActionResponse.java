package com.tencent.wechat.aff.newlife;

/* loaded from: classes15.dex */
public class NewLifeActionResponse extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeActionResponse DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeActionResponse();
    public java.lang.String cmdId = "";
    public int errCode = 0;
    public java.lang.String errMsg = "";
    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto proto = com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto.getDefaultInstance();

    public static com.tencent.wechat.aff.newlife.NewLifeActionResponse create() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionResponse();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeActionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeActionResponse newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionResponse();
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionResponse build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeActionResponse)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeActionResponse newLifeActionResponse = (com.tencent.wechat.aff.newlife.NewLifeActionResponse) fVar;
        return n51.f.a(this.cmdId, newLifeActionResponse.cmdId) && n51.f.a(java.lang.Integer.valueOf(this.errCode), java.lang.Integer.valueOf(newLifeActionResponse.errCode)) && n51.f.a(this.errMsg, newLifeActionResponse.errMsg) && n51.f.a(this.proto, newLifeActionResponse.proto);
    }

    public java.lang.String getCmdId() {
        return this.cmdId;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto getProto() {
        return this.proto;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionResponse mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeActionResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.cmdId;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.errCode);
            java.lang.String str2 = this.errMsg;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newLifeActionPlatformProto = this.proto;
            if (newLifeActionPlatformProto != null) {
                fVar.i(4, newLifeActionPlatformProto.computeSize());
                this.proto.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.cmdId;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.errCode);
            java.lang.String str4 = this.errMsg;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newLifeActionPlatformProto2 = this.proto;
            return newLifeActionPlatformProto2 != null ? j17 + b36.f.i(4, newLifeActionPlatformProto2.computeSize()) : j17;
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
        if (intValue == 2) {
            this.errCode = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.errMsg = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
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

    public com.tencent.wechat.aff.newlife.NewLifeActionResponse setCmdId(java.lang.String str) {
        this.cmdId = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionResponse setErrCode(int i17) {
        this.errCode = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionResponse setErrMsg(java.lang.String str) {
        this.errMsg = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionResponse setProto(com.tencent.wechat.aff.newlife.NewLifeActionPlatformProto newLifeActionPlatformProto) {
        this.proto = newLifeActionPlatformProto;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeActionResponse mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeActionResponse parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeActionResponse) super.parseFrom(bArr);
    }
}
