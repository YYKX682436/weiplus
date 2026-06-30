package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkC2CQuicForceHost extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CQuicForceHost DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CQuicForceHost();
    private final boolean[] hasSetFields = new boolean[3];
    private com.tencent.mm.protobuf.g host;
    private int port;

    public static com.tencent.wechat.aff.IlinkC2CQuicForceHost create() {
        return new com.tencent.wechat.aff.IlinkC2CQuicForceHost();
    }

    public static com.tencent.wechat.aff.IlinkC2CQuicForceHost getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CQuicForceHost newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CQuicForceHost();
    }

    public com.tencent.wechat.aff.IlinkC2CQuicForceHost build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CQuicForceHost)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CQuicForceHost ilinkC2CQuicForceHost = (com.tencent.wechat.aff.IlinkC2CQuicForceHost) fVar;
        return n51.f.a(this.host, ilinkC2CQuicForceHost.host) && n51.f.a(java.lang.Integer.valueOf(this.port), java.lang.Integer.valueOf(ilinkC2CQuicForceHost.port));
    }

    public com.tencent.mm.protobuf.g getHost() {
        return this.hasSetFields[1] ? this.host : com.tencent.mm.protobuf.g.f192155b;
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

    public boolean hasPort() {
        return hasFieldNumber(2);
    }

    public com.tencent.wechat.aff.IlinkC2CQuicForceHost mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CQuicForceHost();
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
            if (this.hasSetFields[2]) {
                fVar.e(2, this.port);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.host;
            if (gVar2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            return this.hasSetFields[2] ? i18 + b36.f.e(2, this.port) : i18;
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
        if (intValue != 2) {
            return -1;
        }
        this.port = aVar2.g(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicForceHost setHost(com.tencent.mm.protobuf.g gVar) {
        this.host = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicForceHost setPort(int i17) {
        this.port = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicForceHost mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CQuicForceHost parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CQuicForceHost) super.parseFrom(bArr);
    }
}
