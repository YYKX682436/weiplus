package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class IlinkC2CCronetTaskResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CCronetTaskResult DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CCronetTaskResult();
    private final boolean[] hasSetFields = new boolean[7];
    private com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile performance_;
    private boolean socket_reused;
    private int status_code;
    private com.tencent.mm.protobuf.g status_text;
    private boolean use_http2;
    private boolean use_quic;

    public static com.tencent.wechat.aff.IlinkC2CCronetTaskResult create() {
        return new com.tencent.wechat.aff.IlinkC2CCronetTaskResult();
    }

    public static com.tencent.wechat.aff.IlinkC2CCronetTaskResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CCronetTaskResult newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CCronetTaskResult();
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CCronetTaskResult)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CCronetTaskResult ilinkC2CCronetTaskResult = (com.tencent.wechat.aff.IlinkC2CCronetTaskResult) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.use_quic), java.lang.Boolean.valueOf(ilinkC2CCronetTaskResult.use_quic)) && n51.f.a(java.lang.Boolean.valueOf(this.use_http2), java.lang.Boolean.valueOf(ilinkC2CCronetTaskResult.use_http2)) && n51.f.a(java.lang.Boolean.valueOf(this.socket_reused), java.lang.Boolean.valueOf(ilinkC2CCronetTaskResult.socket_reused)) && n51.f.a(java.lang.Integer.valueOf(this.status_code), java.lang.Integer.valueOf(ilinkC2CCronetTaskResult.status_code)) && n51.f.a(this.status_text, ilinkC2CCronetTaskResult.status_text) && n51.f.a(this.performance_, ilinkC2CCronetTaskResult.performance_);
    }

    public com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile getPerformance_() {
        return this.hasSetFields[6] ? this.performance_ : com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile.create();
    }

    public boolean getSocketReused() {
        return this.socket_reused;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public com.tencent.mm.protobuf.g getStatusText() {
        return this.hasSetFields[5] ? this.status_text : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean getUseHttp2() {
        return this.use_http2;
    }

    public boolean getUseQuic() {
        return this.use_quic;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasPerformance_() {
        return hasFieldNumber(6);
    }

    public boolean hasSocketReused() {
        return hasFieldNumber(3);
    }

    public boolean hasStatusCode() {
        return hasFieldNumber(4);
    }

    public boolean hasStatusText() {
        return hasFieldNumber(5);
    }

    public boolean hasUseHttp2() {
        return hasFieldNumber(2);
    }

    public boolean hasUseQuic() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CCronetTaskResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.a(1, this.use_quic);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.use_http2);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.socket_reused);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.status_code);
            }
            com.tencent.mm.protobuf.g gVar = this.status_text;
            if (gVar != null && this.hasSetFields[5]) {
                fVar.b(5, gVar);
            }
            com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile ilinkC2CWebPageNeedProfile = this.performance_;
            if (ilinkC2CWebPageNeedProfile != null && this.hasSetFields[6]) {
                fVar.i(6, ilinkC2CWebPageNeedProfile.computeSize());
                this.performance_.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.hasSetFields[1] ? 0 + b36.f.a(1, this.use_quic) : 0;
            if (this.hasSetFields[2]) {
                a17 += b36.f.a(2, this.use_http2);
            }
            if (this.hasSetFields[3]) {
                a17 += b36.f.a(3, this.socket_reused);
            }
            if (this.hasSetFields[4]) {
                a17 += b36.f.e(4, this.status_code);
            }
            com.tencent.mm.protobuf.g gVar2 = this.status_text;
            if (gVar2 != null && this.hasSetFields[5]) {
                a17 += b36.f.b(5, gVar2);
            }
            com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile ilinkC2CWebPageNeedProfile2 = this.performance_;
            return (ilinkC2CWebPageNeedProfile2 == null || !this.hasSetFields[6]) ? a17 : a17 + b36.f.i(6, ilinkC2CWebPageNeedProfile2.computeSize());
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
                this.use_quic = aVar2.c(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.use_http2 = aVar2.c(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.socket_reused = aVar2.c(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.status_code = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.status_text = aVar2.d(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile ilinkC2CWebPageNeedProfile3 = new com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile();
                    if (bArr != null && bArr.length > 0) {
                        ilinkC2CWebPageNeedProfile3.parseFrom(bArr);
                    }
                    this.performance_ = ilinkC2CWebPageNeedProfile3;
                }
                this.hasSetFields[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult setPerformance_(com.tencent.wechat.aff.IlinkC2CWebPageNeedProfile ilinkC2CWebPageNeedProfile) {
        this.performance_ = ilinkC2CWebPageNeedProfile;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult setSocketReused(boolean z17) {
        this.socket_reused = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult setStatusCode(int i17) {
        this.status_code = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult setStatusText(com.tencent.mm.protobuf.g gVar) {
        this.status_text = gVar;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult setUseHttp2(boolean z17) {
        this.use_http2 = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult setUseQuic(boolean z17) {
        this.use_quic = z17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CCronetTaskResult parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CCronetTaskResult) super.parseFrom(bArr);
    }
}
