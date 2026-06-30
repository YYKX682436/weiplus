package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkDeviceSessionInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkDeviceSessionInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkDeviceSessionInfo();
    private com.tencent.mm.protobuf.g autoauth_enc_key;
    private com.tencent.mm.protobuf.g client_random_key;
    private com.tencent.mm.protobuf.g cookie;
    private final boolean[] hasSetFields = new boolean[9];
    private com.tencent.mm.protobuf.g ilink_deviceid;
    private int ilink_productid;
    private com.tencent.mm.protobuf.g server_random_key;
    private com.tencent.mm.protobuf.g serverid;
    private long uin;

    public static com.tencent.wechat.aff.IlinkDeviceSessionInfo create() {
        return new com.tencent.wechat.aff.IlinkDeviceSessionInfo();
    }

    public static com.tencent.wechat.aff.IlinkDeviceSessionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkDeviceSessionInfo newBuilder() {
        return new com.tencent.wechat.aff.IlinkDeviceSessionInfo();
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkDeviceSessionInfo)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkDeviceSessionInfo ilinkDeviceSessionInfo = (com.tencent.wechat.aff.IlinkDeviceSessionInfo) fVar;
        return n51.f.a(this.client_random_key, ilinkDeviceSessionInfo.client_random_key) && n51.f.a(this.server_random_key, ilinkDeviceSessionInfo.server_random_key) && n51.f.a(this.autoauth_enc_key, ilinkDeviceSessionInfo.autoauth_enc_key) && n51.f.a(this.serverid, ilinkDeviceSessionInfo.serverid) && n51.f.a(this.cookie, ilinkDeviceSessionInfo.cookie) && n51.f.a(java.lang.Long.valueOf(this.uin), java.lang.Long.valueOf(ilinkDeviceSessionInfo.uin)) && n51.f.a(this.ilink_deviceid, ilinkDeviceSessionInfo.ilink_deviceid) && n51.f.a(java.lang.Integer.valueOf(this.ilink_productid), java.lang.Integer.valueOf(ilinkDeviceSessionInfo.ilink_productid));
    }

    public com.tencent.mm.protobuf.g getAutoauthEncKey() {
        return this.hasSetFields[3] ? this.autoauth_enc_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getClientRandomKey() {
        return this.hasSetFields[1] ? this.client_random_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getCookie() {
        return this.hasSetFields[5] ? this.cookie : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getIlinkDeviceid() {
        return this.hasSetFields[7] ? this.ilink_deviceid : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getIlinkProductid() {
        return this.ilink_productid;
    }

    public com.tencent.mm.protobuf.g getServerRandomKey() {
        return this.hasSetFields[2] ? this.server_random_key : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getServerid() {
        return this.hasSetFields[4] ? this.serverid : com.tencent.mm.protobuf.g.f192155b;
    }

    public long getUin() {
        return this.uin;
    }

    public boolean hasAutoauthEncKey() {
        return hasFieldNumber(3);
    }

    public boolean hasClientRandomKey() {
        return hasFieldNumber(1);
    }

    public boolean hasCookie() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIlinkDeviceid() {
        return hasFieldNumber(7);
    }

    public boolean hasIlinkProductid() {
        return hasFieldNumber(8);
    }

    public boolean hasServerRandomKey() {
        return hasFieldNumber(2);
    }

    public boolean hasServerid() {
        return hasFieldNumber(4);
    }

    public boolean hasUin() {
        return hasFieldNumber(6);
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkDeviceSessionInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.client_random_key;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.server_random_key;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.autoauth_enc_key;
            if (gVar3 != null && this.hasSetFields[3]) {
                fVar.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.serverid;
            if (gVar4 != null && this.hasSetFields[4]) {
                fVar.b(4, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.cookie;
            if (gVar5 != null && this.hasSetFields[5]) {
                fVar.b(5, gVar5);
            }
            if (this.hasSetFields[6]) {
                fVar.h(6, this.uin);
            }
            com.tencent.mm.protobuf.g gVar6 = this.ilink_deviceid;
            if (gVar6 != null && this.hasSetFields[7]) {
                fVar.b(7, gVar6);
            }
            if (this.hasSetFields[8]) {
                fVar.e(8, this.ilink_productid);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar7 = this.client_random_key;
            if (gVar7 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar7);
            }
            com.tencent.mm.protobuf.g gVar8 = this.server_random_key;
            if (gVar8 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar8);
            }
            com.tencent.mm.protobuf.g gVar9 = this.autoauth_enc_key;
            if (gVar9 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar9);
            }
            com.tencent.mm.protobuf.g gVar10 = this.serverid;
            if (gVar10 != null && this.hasSetFields[4]) {
                i18 += b36.f.b(4, gVar10);
            }
            com.tencent.mm.protobuf.g gVar11 = this.cookie;
            if (gVar11 != null && this.hasSetFields[5]) {
                i18 += b36.f.b(5, gVar11);
            }
            if (this.hasSetFields[6]) {
                i18 += b36.f.h(6, this.uin);
            }
            com.tencent.mm.protobuf.g gVar12 = this.ilink_deviceid;
            if (gVar12 != null && this.hasSetFields[7]) {
                i18 += b36.f.b(7, gVar12);
            }
            return this.hasSetFields[8] ? i18 + b36.f.e(8, this.ilink_productid) : i18;
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
                this.client_random_key = aVar2.d(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.server_random_key = aVar2.d(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.autoauth_enc_key = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.serverid = aVar2.d(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.cookie = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.uin = aVar2.i(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.ilink_deviceid = aVar2.d(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.ilink_productid = aVar2.g(intValue);
                this.hasSetFields[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setAutoauthEncKey(com.tencent.mm.protobuf.g gVar) {
        this.autoauth_enc_key = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setClientRandomKey(com.tencent.mm.protobuf.g gVar) {
        this.client_random_key = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setCookie(com.tencent.mm.protobuf.g gVar) {
        this.cookie = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setIlinkDeviceid(com.tencent.mm.protobuf.g gVar) {
        this.ilink_deviceid = gVar;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setIlinkProductid(int i17) {
        this.ilink_productid = i17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setServerRandomKey(com.tencent.mm.protobuf.g gVar) {
        this.server_random_key = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setServerid(com.tencent.mm.protobuf.g gVar) {
        this.serverid = gVar;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo setUin(long j17) {
        this.uin = j17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkDeviceSessionInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkDeviceSessionInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkDeviceSessionInfo) super.parseFrom(bArr);
    }
}
