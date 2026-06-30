package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class NewLifeMentionInfoList extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeMentionInfoList DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeMentionInfoList();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.NewLifeMention> mentionList = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.newlife.NewLifeMentionInfoList create() {
        return new com.tencent.wechat.aff.newlife.NewLifeMentionInfoList();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeMentionInfoList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeMentionInfoList newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeMentionInfoList();
    }

    public com.tencent.wechat.aff.newlife.NewLifeMentionInfoList addAllElementMentionList(java.util.Collection<com.tencent.wechat.aff.newlife.NewLifeMention> collection) {
        this.mentionList.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMentionInfoList addElementMentionList(com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention) {
        this.mentionList.add(newLifeMention);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMentionInfoList build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.NewLifeMentionInfoList) && n51.f.a(this.mentionList, ((com.tencent.wechat.aff.newlife.NewLifeMentionInfoList) fVar).mentionList);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.NewLifeMention> getMentionList() {
        return this.mentionList;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMentionInfoList mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeMentionInfoList();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.mentionList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.mentionList) + 0;
        }
        if (i17 == 2) {
            this.mentionList.clear();
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
            com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention = new com.tencent.wechat.aff.newlife.NewLifeMention();
            if (bArr != null && bArr.length > 0) {
                newLifeMention.parseFrom(bArr);
            }
            this.mentionList.add(newLifeMention);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMentionInfoList setMentionList(java.util.LinkedList<com.tencent.wechat.aff.newlife.NewLifeMention> linkedList) {
        this.mentionList = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMentionInfoList mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeMentionInfoList parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeMentionInfoList) super.parseFrom(bArr);
    }
}
