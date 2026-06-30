package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderAdBaseRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderAdBaseRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderAdBaseRequest();
    public java.lang.String device_info = "";
    public java.lang.String user_agent = "";
    public int connect_type = 0;
    public int carrier = 0;
    public int support_flag = 0;

    public static com.tencent.wechat.aff.newlife.FinderAdBaseRequest create() {
        return new com.tencent.wechat.aff.newlife.FinderAdBaseRequest();
    }

    public static com.tencent.wechat.aff.newlife.FinderAdBaseRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderAdBaseRequest newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderAdBaseRequest();
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderAdBaseRequest)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderAdBaseRequest finderAdBaseRequest = (com.tencent.wechat.aff.newlife.FinderAdBaseRequest) fVar;
        return n51.f.a(this.device_info, finderAdBaseRequest.device_info) && n51.f.a(this.user_agent, finderAdBaseRequest.user_agent) && n51.f.a(java.lang.Integer.valueOf(this.connect_type), java.lang.Integer.valueOf(finderAdBaseRequest.connect_type)) && n51.f.a(java.lang.Integer.valueOf(this.carrier), java.lang.Integer.valueOf(finderAdBaseRequest.carrier)) && n51.f.a(java.lang.Integer.valueOf(this.support_flag), java.lang.Integer.valueOf(finderAdBaseRequest.support_flag));
    }

    public int getCarrier() {
        return this.carrier;
    }

    public int getConnectType() {
        return this.connect_type;
    }

    public int getConnect_type() {
        return this.connect_type;
    }

    public java.lang.String getDeviceInfo() {
        return this.device_info;
    }

    public java.lang.String getDevice_info() {
        return this.device_info;
    }

    public int getSupportFlag() {
        return this.support_flag;
    }

    public int getSupport_flag() {
        return this.support_flag;
    }

    public java.lang.String getUserAgent() {
        return this.user_agent;
    }

    public java.lang.String getUser_agent() {
        return this.user_agent;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderAdBaseRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.device_info;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.user_agent;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.connect_type);
            fVar.e(4, this.carrier);
            fVar.e(5, this.support_flag);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.device_info;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.user_agent;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.connect_type) + b36.f.e(4, this.carrier) + b36.f.e(5, this.support_flag);
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
            this.device_info = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.user_agent = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.connect_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.carrier = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.support_flag = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setCarrier(int i17) {
        this.carrier = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setConnectType(int i17) {
        this.connect_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setConnect_type(int i17) {
        this.connect_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setDeviceInfo(java.lang.String str) {
        this.device_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setDevice_info(java.lang.String str) {
        this.device_info = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setSupportFlag(int i17) {
        this.support_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setSupport_flag(int i17) {
        this.support_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setUserAgent(java.lang.String str) {
        this.user_agent = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest setUser_agent(java.lang.String str) {
        this.user_agent = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderAdBaseRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderAdBaseRequest) super.parseFrom(bArr);
    }
}
