package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class WebSearchRequestSyncConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig();
    public boolean hasEntranceReddot = false;
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> waitWebSearchCtrlInfoList = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig create() {
        return new com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig();
    }

    public static com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig newBuilder() {
        return new com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig();
    }

    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig addAllElementWaitWebSearchCtrlInfoList(java.util.Collection<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> collection) {
        this.waitWebSearchCtrlInfoList.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig addElementWaitWebSearchCtrlInfoList(com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo finderRedDotCtrlInfo) {
        this.waitWebSearchCtrlInfoList.add(finderRedDotCtrlInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig webSearchRequestSyncConfig = (com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.hasEntranceReddot), java.lang.Boolean.valueOf(webSearchRequestSyncConfig.hasEntranceReddot)) && n51.f.a(this.waitWebSearchCtrlInfoList, webSearchRequestSyncConfig.waitWebSearchCtrlInfoList);
    }

    public boolean getHasEntranceReddot() {
        return this.hasEntranceReddot;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> getWaitWebSearchCtrlInfoList() {
        return this.waitWebSearchCtrlInfoList;
    }

    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.hasEntranceReddot);
            fVar.g(2, 8, this.waitWebSearchCtrlInfoList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.hasEntranceReddot) + 0 + b36.f.g(2, 8, this.waitWebSearchCtrlInfoList);
        }
        if (i17 == 2) {
            this.waitWebSearchCtrlInfoList.clear();
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
            this.hasEntranceReddot = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
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
            this.waitWebSearchCtrlInfoList.add(finderRedDotCtrlInfo);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig setHasEntranceReddot(boolean z17) {
        this.hasEntranceReddot = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig setWaitWebSearchCtrlInfoList(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderRedDotCtrlInfo> linkedList) {
        this.waitWebSearchCtrlInfoList = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig) super.parseFrom(bArr);
    }
}
