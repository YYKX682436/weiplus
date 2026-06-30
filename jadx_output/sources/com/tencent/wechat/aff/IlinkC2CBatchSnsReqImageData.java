package com.tencent.wechat.aff;

/* loaded from: classes15.dex */
public class IlinkC2CBatchSnsReqImageData extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData();
    private long decryptKey;
    private com.tencent.mm.protobuf.g fileKey;
    private final boolean[] hasSetFields = new boolean[8];
    private com.tencent.mm.protobuf.g imageCachePath;
    private int picIndex;
    private boolean retry;
    private long totalFileSize;
    private com.tencent.mm.protobuf.g url;

    public static com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData create() {
        return new com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData();
    }

    public static com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData();
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData ilinkC2CBatchSnsReqImageData = (com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData) fVar;
        return n51.f.a(this.url, ilinkC2CBatchSnsReqImageData.url) && n51.f.a(java.lang.Integer.valueOf(this.picIndex), java.lang.Integer.valueOf(ilinkC2CBatchSnsReqImageData.picIndex)) && n51.f.a(this.imageCachePath, ilinkC2CBatchSnsReqImageData.imageCachePath) && n51.f.a(java.lang.Long.valueOf(this.decryptKey), java.lang.Long.valueOf(ilinkC2CBatchSnsReqImageData.decryptKey)) && n51.f.a(java.lang.Long.valueOf(this.totalFileSize), java.lang.Long.valueOf(ilinkC2CBatchSnsReqImageData.totalFileSize)) && n51.f.a(this.fileKey, ilinkC2CBatchSnsReqImageData.fileKey) && n51.f.a(java.lang.Boolean.valueOf(this.retry), java.lang.Boolean.valueOf(ilinkC2CBatchSnsReqImageData.retry));
    }

    public long getDecryptKey() {
        return this.decryptKey;
    }

    public com.tencent.mm.protobuf.g getFileKey() {
        return this.hasSetFields[6] ? this.fileKey : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mm.protobuf.g getImageCachePath() {
        return this.hasSetFields[3] ? this.imageCachePath : com.tencent.mm.protobuf.g.f192155b;
    }

    public int getPicIndex() {
        return this.picIndex;
    }

    public boolean getRetry() {
        return this.retry;
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public com.tencent.mm.protobuf.g getUrl() {
        return this.hasSetFields[1] ? this.url : com.tencent.mm.protobuf.g.f192155b;
    }

    public boolean hasDecryptKey() {
        return hasFieldNumber(4);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFileKey() {
        return hasFieldNumber(6);
    }

    public boolean hasImageCachePath() {
        return hasFieldNumber(3);
    }

    public boolean hasPicIndex() {
        return hasFieldNumber(2);
    }

    public boolean hasRetry() {
        return hasFieldNumber(7);
    }

    public boolean hasTotalFileSize() {
        return hasFieldNumber(5);
    }

    public boolean hasUrl() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.url;
            if (gVar != null && this.hasSetFields[1]) {
                fVar.b(1, gVar);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.picIndex);
            }
            com.tencent.mm.protobuf.g gVar2 = this.imageCachePath;
            if (gVar2 != null && this.hasSetFields[3]) {
                fVar.b(3, gVar2);
            }
            if (this.hasSetFields[4]) {
                fVar.h(4, this.decryptKey);
            }
            if (this.hasSetFields[5]) {
                fVar.h(5, this.totalFileSize);
            }
            com.tencent.mm.protobuf.g gVar3 = this.fileKey;
            if (gVar3 != null && this.hasSetFields[6]) {
                fVar.b(6, gVar3);
            }
            if (this.hasSetFields[7]) {
                fVar.a(7, this.retry);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.url;
            if (gVar4 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.b(1, gVar4);
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.picIndex);
            }
            com.tencent.mm.protobuf.g gVar5 = this.imageCachePath;
            if (gVar5 != null && this.hasSetFields[3]) {
                i18 += b36.f.b(3, gVar5);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.h(4, this.decryptKey);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.h(5, this.totalFileSize);
            }
            com.tencent.mm.protobuf.g gVar6 = this.fileKey;
            if (gVar6 != null && this.hasSetFields[6]) {
                i18 += b36.f.b(6, gVar6);
            }
            return this.hasSetFields[7] ? i18 + b36.f.a(7, this.retry) : i18;
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
                this.url = aVar2.d(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.picIndex = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.imageCachePath = aVar2.d(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.decryptKey = aVar2.i(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.totalFileSize = aVar2.i(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.fileKey = aVar2.d(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.retry = aVar2.c(intValue);
                this.hasSetFields[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData setDecryptKey(long j17) {
        this.decryptKey = j17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData setFileKey(com.tencent.mm.protobuf.g gVar) {
        this.fileKey = gVar;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData setImageCachePath(com.tencent.mm.protobuf.g gVar) {
        this.imageCachePath = gVar;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData setPicIndex(int i17) {
        this.picIndex = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData setRetry(boolean z17) {
        this.retry = z17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData setTotalFileSize(long j17) {
        this.totalFileSize = j17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData setUrl(com.tencent.mm.protobuf.g gVar) {
        this.url = gVar;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CBatchSnsReqImageData) super.parseFrom(bArr);
    }
}
