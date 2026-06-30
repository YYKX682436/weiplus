package com.tencent.wechat.aff.websearch;

/* loaded from: classes10.dex */
public class PreRequestContext extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.websearch.PreRequestContext DEFAULT_INSTANCE = new com.tencent.wechat.aff.websearch.PreRequestContext();
    private int cache_timeout;
    private final boolean[] hasSetFields = new boolean[5];
    private boolean is_infer_request;
    private boolean is_pre_request;
    private boolean need_cache;

    public static com.tencent.wechat.aff.websearch.PreRequestContext create() {
        return new com.tencent.wechat.aff.websearch.PreRequestContext();
    }

    public static com.tencent.wechat.aff.websearch.PreRequestContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.websearch.PreRequestContext newBuilder() {
        return new com.tencent.wechat.aff.websearch.PreRequestContext();
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.websearch.PreRequestContext)) {
            return false;
        }
        com.tencent.wechat.aff.websearch.PreRequestContext preRequestContext = (com.tencent.wechat.aff.websearch.PreRequestContext) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.is_pre_request), java.lang.Boolean.valueOf(preRequestContext.is_pre_request)) && n51.f.a(java.lang.Boolean.valueOf(this.need_cache), java.lang.Boolean.valueOf(preRequestContext.need_cache)) && n51.f.a(java.lang.Integer.valueOf(this.cache_timeout), java.lang.Integer.valueOf(preRequestContext.cache_timeout)) && n51.f.a(java.lang.Boolean.valueOf(this.is_infer_request), java.lang.Boolean.valueOf(preRequestContext.is_infer_request));
    }

    public int getCacheTimeout() {
        return this.cache_timeout;
    }

    public boolean getIsInferRequest() {
        return this.is_infer_request;
    }

    public boolean getIsPreRequest() {
        return this.is_pre_request;
    }

    public boolean getNeedCache() {
        return this.need_cache;
    }

    public boolean hasCacheTimeout() {
        return hasFieldNumber(3);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIsInferRequest() {
        return hasFieldNumber(4);
    }

    public boolean hasIsPreRequest() {
        return hasFieldNumber(1);
    }

    public boolean hasNeedCache() {
        return hasFieldNumber(2);
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.websearch.PreRequestContext();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.a(1, this.is_pre_request);
            }
            if (this.hasSetFields[2]) {
                fVar.a(2, this.need_cache);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.cache_timeout);
            }
            if (this.hasSetFields[4]) {
                fVar.a(4, this.is_infer_request);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.hasSetFields[1] ? 0 + b36.f.a(1, this.is_pre_request) : 0;
            if (this.hasSetFields[2]) {
                a17 += b36.f.a(2, this.need_cache);
            }
            if (this.hasSetFields[3]) {
                a17 += b36.f.e(3, this.cache_timeout);
            }
            return this.hasSetFields[4] ? a17 + b36.f.a(4, this.is_infer_request) : a17;
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
            this.is_pre_request = aVar2.c(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.need_cache = aVar2.c(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.cache_timeout = aVar2.g(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.is_infer_request = aVar2.c(intValue);
        this.hasSetFields[4] = true;
        return 0;
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext setCacheTimeout(int i17) {
        this.cache_timeout = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext setIsInferRequest(boolean z17) {
        this.is_infer_request = z17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext setIsPreRequest(boolean z17) {
        this.is_pre_request = z17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext setNeedCache(boolean z17) {
        this.need_cache = z17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.websearch.PreRequestContext parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.websearch.PreRequestContext) super.parseFrom(bArr);
    }
}
