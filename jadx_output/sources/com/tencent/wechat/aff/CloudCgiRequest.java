package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class CloudCgiRequest extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.CloudCgiRequest DEFAULT_INSTANCE = new com.tencent.wechat.aff.CloudCgiRequest();
    private com.tencent.wechat.aff.CloudCgiType cgi_type;
    private int cloud_taskid;
    private final boolean[] hasSetFields = new boolean[6];
    private boolean long_polling;
    private com.tencent.mm.protobuf.g request_body;
    private int timeout_ms;

    public static com.tencent.wechat.aff.CloudCgiRequest create() {
        return new com.tencent.wechat.aff.CloudCgiRequest();
    }

    public static com.tencent.wechat.aff.CloudCgiRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.CloudCgiRequest newBuilder() {
        return new com.tencent.wechat.aff.CloudCgiRequest();
    }

    public com.tencent.wechat.aff.CloudCgiRequest build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.CloudCgiRequest)) {
            return false;
        }
        com.tencent.wechat.aff.CloudCgiRequest cloudCgiRequest = (com.tencent.wechat.aff.CloudCgiRequest) fVar;
        return n51.f.a(this.cgi_type, cloudCgiRequest.cgi_type) && n51.f.a(java.lang.Integer.valueOf(this.cloud_taskid), java.lang.Integer.valueOf(cloudCgiRequest.cloud_taskid)) && n51.f.a(this.request_body, cloudCgiRequest.request_body) && n51.f.a(java.lang.Integer.valueOf(this.timeout_ms), java.lang.Integer.valueOf(cloudCgiRequest.timeout_ms)) && n51.f.a(java.lang.Boolean.valueOf(this.long_polling), java.lang.Boolean.valueOf(cloudCgiRequest.long_polling));
    }

    public com.tencent.wechat.aff.CloudCgiType getCgiType() {
        return this.hasSetFields[1] ? this.cgi_type : com.tencent.wechat.aff.CloudCgiType.kAuthRequest;
    }

    public int getCloudTaskid() {
        return this.cloud_taskid;
    }

    public boolean getLongPolling() {
        return this.long_polling;
    }

    public com.tencent.mm.protobuf.g getRequestBody() {
        return this.hasSetFields[3] ? this.request_body : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getTimeoutMs() {
        return this.timeout_ms;
    }

    public boolean hasCgiType() {
        return hasFieldNumber(1);
    }

    public boolean hasCloudTaskid() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLongPolling() {
        return hasFieldNumber(5);
    }

    public boolean hasRequestBody() {
        return hasFieldNumber(3);
    }

    public boolean hasTimeoutMs() {
        return hasFieldNumber(4);
    }

    public com.tencent.wechat.aff.CloudCgiRequest mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.CloudCgiRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.CloudCgiType cloudCgiType = this.cgi_type;
            if (cloudCgiType != null && this.hasSetFields[1]) {
                fVar.e(1, cloudCgiType.value);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.cloud_taskid);
            }
            com.tencent.mm.protobuf.g gVar = this.request_body;
            if (gVar != null && this.hasSetFields[3]) {
                fVar.b(3, gVar);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.timeout_ms);
            }
            if (this.hasSetFields[5]) {
                fVar.a(5, this.long_polling);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.CloudCgiType cloudCgiType2 = this.cgi_type;
            if (cloudCgiType2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.e(1, cloudCgiType2.value);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.cloud_taskid);
            }
            com.tencent.mm.protobuf.g gVar2 = this.request_body;
            if (gVar2 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.timeout_ms);
            }
            return this.hasSetFields[5] ? i18 + b36.f.a(5, this.long_polling) : i18;
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
            this.cgi_type = com.tencent.wechat.aff.CloudCgiType.forNumber(aVar2.g(intValue));
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.cloud_taskid = aVar2.g(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.request_body = aVar2.d(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.timeout_ms = aVar2.g(intValue);
            this.hasSetFields[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.long_polling = aVar2.c(intValue);
        this.hasSetFields[5] = true;
        return 0;
    }

    public com.tencent.wechat.aff.CloudCgiRequest setCgiType(com.tencent.wechat.aff.CloudCgiType cloudCgiType) {
        this.cgi_type = cloudCgiType;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.CloudCgiRequest setCloudTaskid(int i17) {
        this.cloud_taskid = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.CloudCgiRequest setLongPolling(boolean z17) {
        this.long_polling = z17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.CloudCgiRequest setRequestBody(com.tencent.mm.protobuf.g gVar) {
        this.request_body = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.CloudCgiRequest setTimeoutMs(int i17) {
        this.timeout_ms = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.CloudCgiRequest mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.CloudCgiRequest parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.CloudCgiRequest) super.parseFrom(bArr);
    }
}
