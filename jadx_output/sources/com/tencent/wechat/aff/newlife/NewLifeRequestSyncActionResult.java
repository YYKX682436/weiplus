package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class NewLifeRequestSyncActionResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult();
    public long lastPrefetchTime = 0;
    public boolean isPrefetchFreqLimit = false;
    public boolean hasNewLifeEntranceReddot = false;
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> waitNewLifeCtrlInfoList = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult create() {
        return new com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult();
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult addAllElementWaitNewLifeCtrlInfoList(java.util.Collection<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> collection) {
        this.waitNewLifeCtrlInfoList.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult addElementWaitNewLifeCtrlInfoList(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.waitNewLifeCtrlInfoList.add(finderRedDotCtrlInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult newLifeRequestSyncActionResult = (com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.lastPrefetchTime), java.lang.Long.valueOf(newLifeRequestSyncActionResult.lastPrefetchTime)) && n51.f.a(java.lang.Boolean.valueOf(this.isPrefetchFreqLimit), java.lang.Boolean.valueOf(newLifeRequestSyncActionResult.isPrefetchFreqLimit)) && n51.f.a(java.lang.Boolean.valueOf(this.hasNewLifeEntranceReddot), java.lang.Boolean.valueOf(newLifeRequestSyncActionResult.hasNewLifeEntranceReddot)) && n51.f.a(this.waitNewLifeCtrlInfoList, newLifeRequestSyncActionResult.waitNewLifeCtrlInfoList);
    }

    public boolean getHasNewLifeEntranceReddot() {
        return this.hasNewLifeEntranceReddot;
    }

    public boolean getIsPrefetchFreqLimit() {
        return this.isPrefetchFreqLimit;
    }

    public long getLastPrefetchTime() {
        return this.lastPrefetchTime;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> getWaitNewLifeCtrlInfoList() {
        return this.waitNewLifeCtrlInfoList;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.lastPrefetchTime);
            fVar.a(2, this.isPrefetchFreqLimit);
            fVar.a(3, this.hasNewLifeEntranceReddot);
            fVar.g(4, 8, this.waitNewLifeCtrlInfoList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.lastPrefetchTime) + 0 + b36.f.a(2, this.isPrefetchFreqLimit) + b36.f.a(3, this.hasNewLifeEntranceReddot) + b36.f.g(4, 8, this.waitNewLifeCtrlInfoList);
        }
        if (i17 == 2) {
            this.waitNewLifeCtrlInfoList.clear();
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
            this.lastPrefetchTime = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.isPrefetchFreqLimit = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.hasNewLifeEntranceReddot = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo = new com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo();
            if (bArr != null && bArr.length > 0) {
                finderRedDotCtrlInfo.parseFrom(bArr);
            }
            this.waitNewLifeCtrlInfoList.add(finderRedDotCtrlInfo);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult setHasNewLifeEntranceReddot(boolean z17) {
        this.hasNewLifeEntranceReddot = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult setIsPrefetchFreqLimit(boolean z17) {
        this.isPrefetchFreqLimit = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult setLastPrefetchTime(long j17) {
        this.lastPrefetchTime = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult setWaitNewLifeCtrlInfoList(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> linkedList) {
        this.waitNewLifeCtrlInfoList = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult) super.parseFrom(bArr);
    }
}
