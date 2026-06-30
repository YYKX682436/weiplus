package com.tencent.wechat.aff.status;

/* loaded from: classes2.dex */
public class StatusGetSelfHistoryResp extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.StatusGetSelfHistoryResp DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.StatusGetSelfHistoryResp();
    public com.tencent.wechat.aff.status.BaseResponse BaseResponse = com.tencent.wechat.aff.status.BaseResponse.getDefaultInstance();
    public java.util.LinkedList<com.tencent.wechat.aff.status.StatusHistory> histories = new java.util.LinkedList<>();
    public com.tencent.mm.protobuf.g context = com.tencent.mm.protobuf.g.f192155b;
    public boolean continue_flag = false;

    public static com.tencent.wechat.aff.status.StatusGetSelfHistoryResp create() {
        return new com.tencent.wechat.aff.status.StatusGetSelfHistoryResp();
    }

    public static com.tencent.wechat.aff.status.StatusGetSelfHistoryResp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.StatusGetSelfHistoryResp newBuilder() {
        return new com.tencent.wechat.aff.status.StatusGetSelfHistoryResp();
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp addAllElementHistories(java.util.Collection<com.tencent.wechat.aff.status.StatusHistory> collection) {
        this.histories.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp addElementHistories(com.tencent.wechat.aff.status.StatusHistory statusHistory) {
        this.histories.add(statusHistory);
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.StatusGetSelfHistoryResp)) {
            return false;
        }
        com.tencent.wechat.aff.status.StatusGetSelfHistoryResp statusGetSelfHistoryResp = (com.tencent.wechat.aff.status.StatusGetSelfHistoryResp) fVar;
        return n51.f.a(this.BaseResponse, statusGetSelfHistoryResp.BaseResponse) && n51.f.a(this.histories, statusGetSelfHistoryResp.histories) && n51.f.a(this.context, statusGetSelfHistoryResp.context) && n51.f.a(java.lang.Boolean.valueOf(this.continue_flag), java.lang.Boolean.valueOf(statusGetSelfHistoryResp.continue_flag));
    }

    public com.tencent.wechat.aff.status.BaseResponse getBaseResponse() {
        return this.BaseResponse;
    }

    public com.tencent.mm.protobuf.g getContext() {
        return this.context;
    }

    public boolean getContinueFlag() {
        return this.continue_flag;
    }

    public boolean getContinue_flag() {
        return this.continue_flag;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.StatusHistory> getHistories() {
        return this.histories;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.StatusGetSelfHistoryResp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.status.BaseResponse baseResponse = this.BaseResponse;
            if (baseResponse != null) {
                fVar.i(1, baseResponse.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, this.histories);
            com.tencent.mm.protobuf.g gVar = this.context;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.a(4, this.continue_flag);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.status.BaseResponse baseResponse2 = this.BaseResponse;
            int i18 = (baseResponse2 != null ? 0 + b36.f.i(1, baseResponse2.computeSize()) : 0) + b36.f.g(2, 8, this.histories);
            com.tencent.mm.protobuf.g gVar2 = this.context;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.a(4, this.continue_flag);
        }
        if (i17 == 2) {
            this.histories.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.aff.status.BaseResponse baseResponse3 = new com.tencent.wechat.aff.status.BaseResponse();
                if (bArr != null && bArr.length > 0) {
                    baseResponse3.parseFrom(bArr);
                }
                this.BaseResponse = baseResponse3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.context = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.continue_flag = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.aff.status.StatusHistory statusHistory = new com.tencent.wechat.aff.status.StatusHistory();
            if (bArr2 != null && bArr2.length > 0) {
                statusHistory.parseFrom(bArr2);
            }
            this.histories.add(statusHistory);
        }
        return 0;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp setBaseResponse(com.tencent.wechat.aff.status.BaseResponse baseResponse) {
        this.BaseResponse = baseResponse;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp setContext(com.tencent.mm.protobuf.g gVar) {
        this.context = gVar;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp setContinueFlag(boolean z17) {
        this.continue_flag = z17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp setContinue_flag(boolean z17) {
        this.continue_flag = z17;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp setHistories(java.util.LinkedList<com.tencent.wechat.aff.status.StatusHistory> linkedList) {
        this.histories = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.StatusGetSelfHistoryResp parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.StatusGetSelfHistoryResp) super.parseFrom(bArr);
    }
}
