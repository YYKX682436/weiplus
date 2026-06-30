package com.tencent.wechat.aff;

/* loaded from: classes4.dex */
public class IlinkBypassMsgList extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkBypassMsgList DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkBypassMsgList();
    private java.util.LinkedList<com.tencent.wechat.aff.IlinkBypassMsgItem> msgitems = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.wechat.aff.IlinkBypassMsgList create() {
        return new com.tencent.wechat.aff.IlinkBypassMsgList();
    }

    public static com.tencent.wechat.aff.IlinkBypassMsgList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkBypassMsgList newBuilder() {
        return new com.tencent.wechat.aff.IlinkBypassMsgList();
    }

    public com.tencent.wechat.aff.IlinkBypassMsgList addAllElementMsgitems(java.util.Collection<com.tencent.wechat.aff.IlinkBypassMsgItem> collection) {
        this.msgitems.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkBypassMsgList addElementMsgitems(com.tencent.wechat.aff.IlinkBypassMsgItem ilinkBypassMsgItem) {
        this.msgitems.add(ilinkBypassMsgItem);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkBypassMsgList build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.IlinkBypassMsgList) && n51.f.a(this.msgitems, ((com.tencent.wechat.aff.IlinkBypassMsgList) fVar).msgitems);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.IlinkBypassMsgItem> getMsgitems() {
        return this.msgitems;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasMsgitems() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.IlinkBypassMsgList mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkBypassMsgList();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.msgitems);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.msgitems) + 0;
        }
        if (i17 == 2) {
            this.msgitems.clear();
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
            com.tencent.wechat.aff.IlinkBypassMsgItem ilinkBypassMsgItem = new com.tencent.wechat.aff.IlinkBypassMsgItem();
            if (bArr != null && bArr.length > 0) {
                ilinkBypassMsgItem.parseFrom(bArr);
            }
            this.msgitems.add(ilinkBypassMsgItem);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkBypassMsgList setMsgitems(java.util.LinkedList<com.tencent.wechat.aff.IlinkBypassMsgItem> linkedList) {
        this.msgitems = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkBypassMsgList mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkBypassMsgList parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkBypassMsgList) super.parseFrom(bArr);
    }
}
