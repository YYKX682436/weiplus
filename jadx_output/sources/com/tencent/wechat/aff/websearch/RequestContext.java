package com.tencent.wechat.aff.websearch;

/* loaded from: classes10.dex */
public class RequestContext extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.websearch.RequestContext DEFAULT_INSTANCE = new com.tencent.wechat.aff.websearch.RequestContext();
    private boolean force_remote;
    private final boolean[] hasSetFields = new boolean[3];
    private com.tencent.wechat.aff.websearch.PreRequestContext pre_request_context;

    public static com.tencent.wechat.aff.websearch.RequestContext create() {
        return new com.tencent.wechat.aff.websearch.RequestContext();
    }

    public static com.tencent.wechat.aff.websearch.RequestContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.websearch.RequestContext newBuilder() {
        return new com.tencent.wechat.aff.websearch.RequestContext();
    }

    public com.tencent.wechat.aff.websearch.RequestContext build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.websearch.RequestContext)) {
            return false;
        }
        com.tencent.wechat.aff.websearch.RequestContext requestContext = (com.tencent.wechat.aff.websearch.RequestContext) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.force_remote), java.lang.Boolean.valueOf(requestContext.force_remote)) && n51.f.a(this.pre_request_context, requestContext.pre_request_context);
    }

    public boolean getForceRemote() {
        return this.force_remote;
    }

    public com.tencent.wechat.aff.websearch.PreRequestContext getPreRequestContext() {
        return this.hasSetFields[2] ? this.pre_request_context : com.tencent.wechat.aff.websearch.PreRequestContext.create();
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasForceRemote() {
        return hasFieldNumber(1);
    }

    public boolean hasPreRequestContext() {
        return hasFieldNumber(2);
    }

    public com.tencent.wechat.aff.websearch.RequestContext mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.websearch.RequestContext();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.a(1, this.force_remote);
            }
            com.tencent.wechat.aff.websearch.PreRequestContext preRequestContext = this.pre_request_context;
            if (preRequestContext != null && this.hasSetFields[2]) {
                fVar.i(2, preRequestContext.computeSize());
                this.pre_request_context.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.hasSetFields[1] ? 0 + b36.f.a(1, this.force_remote) : 0;
            com.tencent.wechat.aff.websearch.PreRequestContext preRequestContext2 = this.pre_request_context;
            return (preRequestContext2 == null || !this.hasSetFields[2]) ? a17 : a17 + b36.f.i(2, preRequestContext2.computeSize());
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
            this.force_remote = aVar2.c(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.websearch.PreRequestContext preRequestContext3 = new com.tencent.wechat.aff.websearch.PreRequestContext();
            if (bArr != null && bArr.length > 0) {
                preRequestContext3.parseFrom(bArr);
            }
            this.pre_request_context = preRequestContext3;
        }
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.wechat.aff.websearch.RequestContext setForceRemote(boolean z17) {
        this.force_remote = z17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.websearch.RequestContext setPreRequestContext(com.tencent.wechat.aff.websearch.PreRequestContext preRequestContext) {
        this.pre_request_context = preRequestContext;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.websearch.RequestContext mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.websearch.RequestContext parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.websearch.RequestContext) super.parseFrom(bArr);
    }
}
