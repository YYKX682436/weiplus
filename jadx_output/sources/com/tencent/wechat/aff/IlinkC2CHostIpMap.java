package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkC2CHostIpMap extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CHostIpMap DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CHostIpMap();
    private final boolean[] hasSetFields = new boolean[4];
    private com.tencent.mm.protobuf.g host;

    /* renamed from: ip, reason: collision with root package name */
    private com.tencent.mm.protobuf.g f215723ip;
    private int port;

    public static com.tencent.wechat.aff.IlinkC2CHostIpMap create() {
        return new com.tencent.wechat.aff.IlinkC2CHostIpMap();
    }

    public static com.tencent.wechat.aff.IlinkC2CHostIpMap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CHostIpMap newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CHostIpMap();
    }

    public com.tencent.wechat.aff.IlinkC2CHostIpMap build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CHostIpMap)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CHostIpMap ilinkC2CHostIpMap = (com.tencent.wechat.aff.IlinkC2CHostIpMap) fVar;
        return n51.f.a(this.host, ilinkC2CHostIpMap.host) && n51.f.a(this.f215723ip, ilinkC2CHostIpMap.f215723ip) && n51.f.a(java.lang.Integer.valueOf(this.port), java.lang.Integer.valueOf(ilinkC2CHostIpMap.port));
    }

    public com.tencent.mm.protobuf.g getHost() {
        return this.hasSetFields[1] ? this.host : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getIp() {
        return this.hasSetFields[2] ? this.f215723ip : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getPort() {
        return this.port;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHost() {
        return hasFieldNumber(1);
    }

    public boolean hasIp() {
        return hasFieldNumber(2);
    }

    public boolean hasPort() {
        return hasFieldNumber(3);
    }

    public com.tencent.wechat.aff.IlinkC2CHostIpMap mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CHostIpMap();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.host;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f215723ip;
            if (gVar2 != null && this.hasSetFields[2]) {
                fVar.b(2, gVar2);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.port);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.host;
            if (gVar3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f215723ip;
            if (gVar4 != null && this.hasSetFields[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            return this.hasSetFields[3] ? i18 + b36.f.e(3, this.port) : i18;
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
            this.host = aVar2.d(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f215723ip = aVar2.d(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.port = aVar2.g(intValue);
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIpMap setHost(com.tencent.mm.protobuf.g gVar) {
        this.host = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIpMap setIp(com.tencent.mm.protobuf.g gVar) {
        this.f215723ip = gVar;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIpMap setPort(int i17) {
        this.port = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIpMap mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CHostIpMap parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CHostIpMap) super.parseFrom(bArr);
    }
}
