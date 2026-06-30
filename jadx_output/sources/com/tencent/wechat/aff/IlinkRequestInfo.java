package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class IlinkRequestInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkRequestInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkRequestInfo();
    private com.tencent.mm.protobuf.g body;
    private com.tencent.wechat.aff.IlinkReqCGIType cgi_type;
    private int cmdid;
    private com.tencent.wechat.aff.IlinkContentType content_type;
    private com.tencent.wechat.aff.IlinkCryptoAlgo crypto_algo;
    private final boolean[] hasSetFields = new boolean[15];
    private boolean limit_flow;
    private boolean limit_frequency;
    private boolean long_polling;
    private int long_polling_timeout;
    private com.tencent.wechat.aff.IlinkNetType net_type;
    private boolean network_status_sensitive;
    private int retry_count;
    private int timeout_ms;
    private java.lang.String url;

    public static com.tencent.wechat.aff.IlinkRequestInfo create() {
        return new com.tencent.wechat.aff.IlinkRequestInfo();
    }

    public static com.tencent.wechat.aff.IlinkRequestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkRequestInfo newBuilder() {
        return new com.tencent.wechat.aff.IlinkRequestInfo();
    }

    public com.tencent.wechat.aff.IlinkRequestInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkRequestInfo)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkRequestInfo ilinkRequestInfo = (com.tencent.wechat.aff.IlinkRequestInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.cmdid), java.lang.Integer.valueOf(ilinkRequestInfo.cmdid)) && n51.f.a(this.url, ilinkRequestInfo.url) && n51.f.a(this.body, ilinkRequestInfo.body) && n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(ilinkRequestInfo.timeout_ms)) && n51.f.a(java.lang.Integer.valueOf(this.retry_count), java.lang.Integer.valueOf(ilinkRequestInfo.retry_count)) && n51.f.a(this.net_type, ilinkRequestInfo.net_type) && n51.f.a(this.crypto_algo, ilinkRequestInfo.crypto_algo) && n51.f.a(java.lang.Boolean.valueOf(this.limit_flow), java.lang.Boolean.valueOf(ilinkRequestInfo.limit_flow)) && n51.f.a(java.lang.Boolean.valueOf(this.limit_frequency), java.lang.Boolean.valueOf(ilinkRequestInfo.limit_frequency)) && n51.f.a(java.lang.Boolean.valueOf(this.long_polling), java.lang.Boolean.valueOf(ilinkRequestInfo.long_polling)) && n51.f.a(java.lang.Integer.valueOf(this.long_polling_timeout), java.lang.Integer.valueOf(ilinkRequestInfo.long_polling_timeout)) && n51.f.a(this.content_type, ilinkRequestInfo.content_type) && n51.f.a(java.lang.Boolean.valueOf(this.network_status_sensitive), java.lang.Boolean.valueOf(ilinkRequestInfo.network_status_sensitive)) && n51.f.a(this.cgi_type, ilinkRequestInfo.cgi_type);
    }

    public com.tencent.mm.protobuf.g getBody() {
        return this.hasSetFields[3] ? this.body : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.wechat.aff.IlinkReqCGIType getCgiType() {
        return this.hasSetFields[14] ? this.cgi_type : com.tencent.wechat.aff.IlinkReqCGIType.kIlinkCGITypeDirect;
    }

    public int getCmdid() {
        return this.cmdid;
    }

    public com.tencent.wechat.aff.IlinkContentType getContentType() {
        return this.hasSetFields[12] ? this.content_type : com.tencent.wechat.aff.IlinkContentType.kIlinkContentTypeDefault;
    }

    public com.tencent.wechat.aff.IlinkCryptoAlgo getCryptoAlgo() {
        return this.hasSetFields[7] ? this.crypto_algo : com.tencent.wechat.aff.IlinkCryptoAlgo.kIlinkNoCrypto;
    }

    public boolean getLimitFlow() {
        return this.limit_flow;
    }

    public boolean getLimitFrequency() {
        return this.limit_frequency;
    }

    public boolean getLongPolling() {
        return this.long_polling;
    }

    public int getLongPollingTimeout() {
        return this.long_polling_timeout;
    }

    public com.tencent.wechat.aff.IlinkNetType getNetType() {
        return this.hasSetFields[6] ? this.net_type : com.tencent.wechat.aff.IlinkNetType.kIlinkShortlink;
    }

    public boolean getNetworkStatusSensitive() {
        return this.network_status_sensitive;
    }

    public int getRetryCount() {
        return this.retry_count;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public java.lang.String getUrl() {
        return this.hasSetFields[2] ? this.url : "";
    }

    public boolean hasBody() {
        return hasFieldNumber(3);
    }

    public boolean hasCgiType() {
        return hasFieldNumber(14);
    }

    public boolean hasCmdid() {
        return hasFieldNumber(1);
    }

    public boolean hasContentType() {
        return hasFieldNumber(12);
    }

    public boolean hasCryptoAlgo() {
        return hasFieldNumber(7);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLimitFlow() {
        return hasFieldNumber(8);
    }

    public boolean hasLimitFrequency() {
        return hasFieldNumber(9);
    }

    public boolean hasLongPolling() {
        return hasFieldNumber(10);
    }

    public boolean hasLongPollingTimeout() {
        return hasFieldNumber(11);
    }

    public boolean hasNetType() {
        return hasFieldNumber(6);
    }

    public boolean hasNetworkStatusSensitive() {
        return hasFieldNumber(13);
    }

    public boolean hasRetryCount() {
        return hasFieldNumber(5);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(4);
    }

    public boolean hasUrl() {
        return hasFieldNumber(2);
    }

    public com.tencent.wechat.aff.IlinkRequestInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkRequestInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.cmdid);
            }
            java.lang.String str = this.url;
            if (str != null && this.hasSetFields[2]) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.body;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.timeout_ms);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.retry_count);
            }
            com.tencent.wechat.aff.IlinkNetType ilinkNetType = this.net_type;
            if (ilinkNetType != null && this.hasSetFields[6]) {
                fVar.e(6, ilinkNetType.value);
            }
            com.tencent.wechat.aff.IlinkCryptoAlgo ilinkCryptoAlgo = this.crypto_algo;
            if (ilinkCryptoAlgo != null && this.hasSetFields[7]) {
                fVar.e(7, ilinkCryptoAlgo.value);
            }
            if (this.hasSetFields[8]) {
                fVar.a(8, this.limit_flow);
            }
            if (this.hasSetFields[9]) {
                fVar.a(9, this.limit_frequency);
            }
            if (this.hasSetFields[10]) {
                fVar.a(10, this.long_polling);
            }
            if (this.hasSetFields[11]) {
                fVar.e(11, this.long_polling_timeout);
            }
            com.tencent.wechat.aff.IlinkContentType ilinkContentType = this.content_type;
            if (ilinkContentType != null && this.hasSetFields[12]) {
                fVar.e(12, ilinkContentType.value);
            }
            if (this.hasSetFields[13]) {
                fVar.a(13, this.network_status_sensitive);
            }
            com.tencent.wechat.aff.IlinkReqCGIType ilinkReqCGIType = this.cgi_type;
            if (ilinkReqCGIType == null || !this.hasSetFields[14]) {
                return 0;
            }
            fVar.e(14, ilinkReqCGIType.value);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.cmdid) : 0;
            java.lang.String str2 = this.url;
            if (str2 != null && this.hasSetFields[2]) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.body;
            if (gVar2 != null && this.hasSetFields[3]) {
                e17 += b36.f.b(3, gVar2);
            }
            if (this.hasSetFields[4]) {
                e17 += b36.f.e(4, this.timeout_ms);
            }
            if (this.hasSetFields[5]) {
                e17 += b36.f.e(5, this.retry_count);
            }
            com.tencent.wechat.aff.IlinkNetType ilinkNetType2 = this.net_type;
            if (ilinkNetType2 != null && this.hasSetFields[6]) {
                e17 += b36.f.e(6, ilinkNetType2.value);
            }
            com.tencent.wechat.aff.IlinkCryptoAlgo ilinkCryptoAlgo2 = this.crypto_algo;
            if (ilinkCryptoAlgo2 != null && this.hasSetFields[7]) {
                e17 += b36.f.e(7, ilinkCryptoAlgo2.value);
            }
            if (this.hasSetFields[8]) {
                e17 += b36.f.a(8, this.limit_flow);
            }
            if (this.hasSetFields[9]) {
                e17 += b36.f.a(9, this.limit_frequency);
            }
            if (this.hasSetFields[10]) {
                e17 += b36.f.a(10, this.long_polling);
            }
            if (this.hasSetFields[11]) {
                e17 += b36.f.e(11, this.long_polling_timeout);
            }
            com.tencent.wechat.aff.IlinkContentType ilinkContentType2 = this.content_type;
            if (ilinkContentType2 != null && this.hasSetFields[12]) {
                e17 += b36.f.e(12, ilinkContentType2.value);
            }
            if (this.hasSetFields[13]) {
                e17 += b36.f.a(13, this.network_status_sensitive);
            }
            com.tencent.wechat.aff.IlinkReqCGIType ilinkReqCGIType2 = this.cgi_type;
            return (ilinkReqCGIType2 == null || !this.hasSetFields[14]) ? e17 : e17 + b36.f.e(14, ilinkReqCGIType2.value);
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
                this.cmdid = aVar2.g(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.url = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.body = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.timeout_ms = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.retry_count = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.net_type = com.tencent.wechat.aff.IlinkNetType.forNumber(aVar2.g(intValue));
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.crypto_algo = com.tencent.wechat.aff.IlinkCryptoAlgo.forNumber(aVar2.g(intValue));
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.limit_flow = aVar2.c(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.limit_frequency = aVar2.c(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.long_polling = aVar2.c(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.long_polling_timeout = aVar2.g(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.content_type = com.tencent.wechat.aff.IlinkContentType.forNumber(aVar2.g(intValue));
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.network_status_sensitive = aVar2.c(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.cgi_type = com.tencent.wechat.aff.IlinkReqCGIType.forNumber(aVar2.g(intValue));
                this.hasSetFields[14] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setBody(com.tencent.mm.protobuf.g gVar) {
        this.body = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setCgiType(com.tencent.wechat.aff.IlinkReqCGIType ilinkReqCGIType) {
        this.cgi_type = ilinkReqCGIType;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setCmdid(int i17) {
        this.cmdid = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setContentType(com.tencent.wechat.aff.IlinkContentType ilinkContentType) {
        this.content_type = ilinkContentType;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setCryptoAlgo(com.tencent.wechat.aff.IlinkCryptoAlgo ilinkCryptoAlgo) {
        this.crypto_algo = ilinkCryptoAlgo;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setLimitFlow(boolean z17) {
        this.limit_flow = z17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setLimitFrequency(boolean z17) {
        this.limit_frequency = z17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setLongPolling(boolean z17) {
        this.long_polling = z17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setLongPollingTimeout(int i17) {
        this.long_polling_timeout = i17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setNetType(com.tencent.wechat.aff.IlinkNetType ilinkNetType) {
        this.net_type = ilinkNetType;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setNetworkStatusSensitive(boolean z17) {
        this.network_status_sensitive = z17;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setRetryCount(int i17) {
        this.retry_count = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo setUrl(java.lang.String str) {
        this.url = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkRequestInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkRequestInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkRequestInfo) super.parseFrom(bArr);
    }
}
