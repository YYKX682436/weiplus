package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class PStatusJumpInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusJumpInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusJumpInfo();
    public java.lang.String jumpType = "";
    public java.lang.String busiId = "";
    public java.lang.String busiBuf = "";
    public java.lang.String keyBusiBuf = "";

    public static com.tencent.wechat.aff.status.PStatusJumpInfo create() {
        return new com.tencent.wechat.aff.status.PStatusJumpInfo();
    }

    public static com.tencent.wechat.aff.status.PStatusJumpInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusJumpInfo newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusJumpInfo();
    }

    public com.tencent.wechat.aff.status.PStatusJumpInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusJumpInfo)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusJumpInfo pStatusJumpInfo = (com.tencent.wechat.aff.status.PStatusJumpInfo) fVar;
        return n51.f.a(this.jumpType, pStatusJumpInfo.jumpType) && n51.f.a(this.busiId, pStatusJumpInfo.busiId) && n51.f.a(this.busiBuf, pStatusJumpInfo.busiBuf) && n51.f.a(this.keyBusiBuf, pStatusJumpInfo.keyBusiBuf);
    }

    public java.lang.String getBusiBuf() {
        return this.busiBuf;
    }

    public java.lang.String getBusiId() {
        return this.busiId;
    }

    public java.lang.String getJumpType() {
        return this.jumpType;
    }

    public java.lang.String getKeyBusiBuf() {
        return this.keyBusiBuf;
    }

    public com.tencent.wechat.aff.status.PStatusJumpInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusJumpInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.jumpType;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.busiId;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.busiBuf;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.keyBusiBuf;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.jumpType;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.busiId;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.busiBuf;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.keyBusiBuf;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
            this.jumpType = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.busiId = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.busiBuf = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.keyBusiBuf = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.status.PStatusJumpInfo setBusiBuf(java.lang.String str) {
        this.busiBuf = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpInfo setBusiId(java.lang.String str) {
        this.busiId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpInfo setJumpType(java.lang.String str) {
        this.jumpType = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpInfo setKeyBusiBuf(java.lang.String str) {
        this.keyBusiBuf = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusJumpInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusJumpInfo) super.parseFrom(bArr);
    }
}
