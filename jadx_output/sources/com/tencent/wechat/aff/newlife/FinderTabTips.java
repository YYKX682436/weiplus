package com.tencent.wechat.aff.newlife;

/* loaded from: classes2.dex */
public class FinderTabTips extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderTabTips DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTabTips();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsInfo> tab_tips_info = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.FinderTabTips create() {
        return new com.tencent.wechat.aff.newlife.FinderTabTips();
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTips getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderTabTips newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderTabTips();
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips addAllElementTabTipsInfo(java.util.Collection<com.tencent.wechat.aff.newlife.FinderTabTipsInfo> collection) {
        this.tab_tips_info.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips addAllElementTab_tips_info(java.util.Collection<com.tencent.wechat.aff.newlife.FinderTabTipsInfo> collection) {
        this.tab_tips_info.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips addElementTabTipsInfo(com.tencent.wechat.aff.newlife.FinderTabTipsInfo finderTabTipsInfo) {
        this.tab_tips_info.add(finderTabTipsInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips addElementTab_tips_info(com.tencent.wechat.aff.newlife.FinderTabTipsInfo finderTabTipsInfo) {
        this.tab_tips_info.add(finderTabTipsInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.FinderTabTips) && n51.f.a(this.tab_tips_info, ((com.tencent.wechat.aff.newlife.FinderTabTips) fVar).tab_tips_info);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsInfo> getTabTipsInfo() {
        return this.tab_tips_info;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsInfo> getTab_tips_info() {
        return this.tab_tips_info;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderTabTips();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.tab_tips_info);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.tab_tips_info) + 0;
        }
        if (i17 == 2) {
            this.tab_tips_info.clear();
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.newlife.FinderTabTipsInfo finderTabTipsInfo = new com.tencent.wechat.aff.newlife.FinderTabTipsInfo();
            if (bArr != null && bArr.length > 0) {
                finderTabTipsInfo.parseFrom(bArr);
            }
            this.tab_tips_info.add(finderTabTipsInfo);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips setTabTipsInfo(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsInfo> linkedList) {
        this.tab_tips_info = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips setTab_tips_info(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderTabTipsInfo> linkedList) {
        this.tab_tips_info = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTabTips mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderTabTips parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderTabTips) super.parseFrom(bArr);
    }
}
