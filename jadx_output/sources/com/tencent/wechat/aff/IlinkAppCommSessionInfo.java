package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkAppCommSessionInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkAppCommSessionInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkAppCommSessionInfo();
    private com.tencent.wechat.aff.IlinkAppAuthFlag auth_flag;
    private com.tencent.mm.protobuf.g autoauth_enc_key;
    private com.tencent.mm.protobuf.g client_session_key;
    private final boolean[] hasSetFields = new boolean[7];
    private com.tencent.mm.protobuf.g server_session_key;
    private com.tencent.mm.protobuf.g serverid;
    private long uin;

    public static com.tencent.wechat.aff.IlinkAppCommSessionInfo create() {
        return new com.tencent.wechat.aff.IlinkAppCommSessionInfo();
    }

    public static com.tencent.wechat.aff.IlinkAppCommSessionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkAppCommSessionInfo newBuilder() {
        return new com.tencent.wechat.aff.IlinkAppCommSessionInfo();
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkAppCommSessionInfo)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkAppCommSessionInfo ilinkAppCommSessionInfo = (com.tencent.wechat.aff.IlinkAppCommSessionInfo) fVar;
        return n51.f.a(this.client_session_key, ilinkAppCommSessionInfo.client_session_key) && n51.f.a(this.server_session_key, ilinkAppCommSessionInfo.server_session_key) && n51.f.a(this.autoauth_enc_key, ilinkAppCommSessionInfo.autoauth_enc_key) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(ilinkAppCommSessionInfo.uin)) && n51.f.a(this.serverid, ilinkAppCommSessionInfo.serverid) && n51.f.a(this.auth_flag, ilinkAppCommSessionInfo.auth_flag);
    }

    public com.tencent.wechat.aff.IlinkAppAuthFlag getAuthFlag() {
        return this.hasSetFields[6] ? this.auth_flag : com.tencent.wechat.aff.IlinkAppAuthFlag.kIlinkAppNoSessionEncrypt;
    }

    public com.tencent.mm.protobuf.g getAutoauthEncKey() {
        return this.hasSetFields[3] ? this.autoauth_enc_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getClientSessionKey() {
        return this.hasSetFields[1] ? this.client_session_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getServerSessionKey() {
        return this.hasSetFields[2] ? this.server_session_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getServerid() {
        return this.hasSetFields[5] ? this.serverid : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getUin() {
        return this.uin;
    }

    public boolean hasAuthFlag() {
        return hasFieldNumber(6);
    }

    public boolean hasAutoauthEncKey() {
        return hasFieldNumber(3);
    }

    public boolean hasClientSessionKey() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasServerSessionKey() {
        return hasFieldNumber(2);
    }

    public boolean hasServerid() {
        return hasFieldNumber(5);
    }

    public boolean hasUin() {
        return hasFieldNumber(4);
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkAppCommSessionInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.client_session_key;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.server_session_key;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.autoauth_enc_key;
            if (gVar3 != null && this.hasSetFields[3]) {
                fVar.b(3, gVar3);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.uin);
            }
            com.tencent.mm.protobuf.g gVar4 = this.serverid;
            if (gVar4 != null && this.hasSetFields[5]) {
                fVar.b(5, gVar4);
            }
            com.tencent.wechat.aff.IlinkAppAuthFlag ilinkAppAuthFlag = this.auth_flag;
            if (ilinkAppAuthFlag != null && this.hasSetFields[6]) {
                fVar.e(6, ilinkAppAuthFlag.value);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar5 = this.client_session_key;
            if (gVar5 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.server_session_key;
            if (gVar6 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar6);
            }
            com.tencent.mm.protobuf.g gVar7 = this.autoauth_enc_key;
            if (gVar7 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar7);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.h(4, this.uin);
            }
            com.tencent.mm.protobuf.g gVar8 = this.serverid;
            if (gVar8 != null && this.hasSetFields[5]) {
                i18 += b36.f.b(5, gVar8);
            }
            com.tencent.wechat.aff.IlinkAppAuthFlag ilinkAppAuthFlag2 = this.auth_flag;
            return (ilinkAppAuthFlag2 == null || !this.hasSetFields[6]) ? i18 : i18 + b36.f.e(6, ilinkAppAuthFlag2.value);
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
                this.client_session_key = aVar2.d(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.server_session_key = aVar2.d(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.autoauth_enc_key = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.uin = aVar2.i(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.serverid = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.auth_flag = com.tencent.wechat.aff.IlinkAppAuthFlag.forNumber(aVar2.g(intValue));
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo setAuthFlag(com.tencent.wechat.aff.IlinkAppAuthFlag ilinkAppAuthFlag) {
        this.auth_flag = ilinkAppAuthFlag;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo setAutoauthEncKey(com.tencent.mm.protobuf.g gVar) {
        this.autoauth_enc_key = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo setClientSessionKey(com.tencent.mm.protobuf.g gVar) {
        this.client_session_key = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo setServerSessionKey(com.tencent.mm.protobuf.g gVar) {
        this.server_session_key = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo setServerid(com.tencent.mm.protobuf.g gVar) {
        this.serverid = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo setUin(long j17) {
        this.uin = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppCommSessionInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkAppCommSessionInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkAppCommSessionInfo) super.parseFrom(bArr);
    }
}
