package com.tencent.wechat.aff.status;

/* loaded from: classes2.dex */
public class StatusGetSelfHistoryReq extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.StatusGetSelfHistoryReq DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.StatusGetSelfHistoryReq();
    public com.tencent.wechat.aff.status.BaseRequest BaseRequest = com.tencent.wechat.aff.status.BaseRequest.getDefaultInstance();
    public com.tencent.mm.protobuf.g context = com.tencent.mm.protobuf.g.f192155b;

    /* renamed from: op, reason: collision with root package name */
    public long f217520op = 0;
    public long start_key = 0;
    public long limit = 0;
    public java.util.LinkedList<java.lang.String> statusIds = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.status.StatusGetSelfHistoryReq create() {
        return new com.tencent.wechat.aff.status.StatusGetSelfHistoryReq();
    }

    public static com.tencent.wechat.aff.status.StatusGetSelfHistoryReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.StatusGetSelfHistoryReq newBuilder() {
        return new com.tencent.wechat.aff.status.StatusGetSelfHistoryReq();
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq addAllElementStatusIds(java.util.Collection<java.lang.String> collection) {
        this.statusIds.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq addElementStatusIds(java.lang.String str) {
        this.statusIds.add(str);
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.StatusGetSelfHistoryReq)) {
            return false;
        }
        com.tencent.wechat.aff.status.StatusGetSelfHistoryReq statusGetSelfHistoryReq = (com.tencent.wechat.aff.status.StatusGetSelfHistoryReq) fVar;
        return n51.f.a(this.BaseRequest, statusGetSelfHistoryReq.BaseRequest) && n51.f.a(this.context, statusGetSelfHistoryReq.context) && n51.f.a(java.lang.Long.valueOf(this.f217520op), java.lang.Long.valueOf(statusGetSelfHistoryReq.f217520op)) && n51.f.a(java.lang.Long.valueOf(this.start_key), java.lang.Long.valueOf(statusGetSelfHistoryReq.start_key)) && n51.f.a(java.lang.Long.valueOf(this.limit), java.lang.Long.valueOf(statusGetSelfHistoryReq.limit)) && n51.f.a(this.statusIds, statusGetSelfHistoryReq.statusIds);
    }

    public com.tencent.wechat.aff.status.BaseRequest getBaseRequest() {
        return this.BaseRequest;
    }

    public com.tencent.mm.protobuf.g getContext() {
        return this.context;
    }

    public long getLimit() {
        return this.limit;
    }

    public long getOp() {
        return this.f217520op;
    }

    public long getStartKey() {
        return this.start_key;
    }

    public long getStart_key() {
        return this.start_key;
    }

    public java.util.LinkedList<java.lang.String> getStatusIds() {
        return this.statusIds;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.StatusGetSelfHistoryReq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.status.BaseRequest baseRequest = this.BaseRequest;
            if (baseRequest != null) {
                fVar.i(1, baseRequest.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.context;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f217520op);
            fVar.h(4, this.start_key);
            fVar.h(5, this.limit);
            fVar.g(6, 1, this.statusIds);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.status.BaseRequest baseRequest2 = this.BaseRequest;
            int i18 = baseRequest2 != null ? 0 + b36.f.i(1, baseRequest2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.context;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.h(3, this.f217520op) + b36.f.h(4, this.start_key) + b36.f.h(5, this.limit) + b36.f.g(6, 1, this.statusIds);
        }
        if (i17 == 2) {
            this.statusIds.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.aff.status.BaseRequest baseRequest3 = new com.tencent.wechat.aff.status.BaseRequest();
                    if (bArr != null && bArr.length > 0) {
                        baseRequest3.parseFrom(bArr);
                    }
                    this.BaseRequest = baseRequest3;
                }
                return 0;
            case 2:
                this.context = aVar2.d(intValue);
                return 0;
            case 3:
                this.f217520op = aVar2.i(intValue);
                return 0;
            case 4:
                this.start_key = aVar2.i(intValue);
                return 0;
            case 5:
                this.limit = aVar2.i(intValue);
                return 0;
            case 6:
                this.statusIds.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq setBaseRequest(com.tencent.wechat.aff.status.BaseRequest baseRequest) {
        this.BaseRequest = baseRequest;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq setContext(com.tencent.mm.protobuf.g gVar) {
        this.context = gVar;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq setLimit(long j17) {
        this.limit = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq setOp(long j17) {
        this.f217520op = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq setStartKey(long j17) {
        this.start_key = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq setStart_key(long j17) {
        this.start_key = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq setStatusIds(java.util.LinkedList<java.lang.String> linkedList) {
        this.statusIds = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.StatusGetSelfHistoryReq parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.StatusGetSelfHistoryReq) super.parseFrom(bArr);
    }
}
