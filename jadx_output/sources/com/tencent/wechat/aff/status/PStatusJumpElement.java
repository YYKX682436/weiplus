package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class PStatusJumpElement extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusJumpElement DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusJumpElement();
    public int elementType = 0;
    public java.lang.String elementKey = "";
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> jumpInfos = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.status.PStatusJumpElement create() {
        return new com.tencent.wechat.aff.status.PStatusJumpElement();
    }

    public static com.tencent.wechat.aff.status.PStatusJumpElement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusJumpElement newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusJumpElement();
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement addAllElementJumpInfos(java.util.Collection<com.tencent.wechat.aff.status.PStatusJumpInfo> collection) {
        this.jumpInfos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement addElementJumpInfos(com.tencent.wechat.aff.status.PStatusJumpInfo pStatusJumpInfo) {
        this.jumpInfos.add(pStatusJumpInfo);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusJumpElement)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusJumpElement pStatusJumpElement = (com.tencent.wechat.aff.status.PStatusJumpElement) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.elementType), java.lang.Integer.valueOf(pStatusJumpElement.elementType)) && n51.f.a(this.elementKey, pStatusJumpElement.elementKey) && n51.f.a(this.jumpInfos, pStatusJumpElement.jumpInfos);
    }

    public java.lang.String getElementKey() {
        return this.elementKey;
    }

    public int getElementType() {
        return this.elementType;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> getJumpInfos() {
        return this.jumpInfos;
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusJumpElement();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.elementType);
            java.lang.String str = this.elementKey;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.jumpInfos);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.elementType) + 0;
            java.lang.String str2 = this.elementKey;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.g(3, 8, this.jumpInfos);
        }
        if (i17 == 2) {
            this.jumpInfos.clear();
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
            this.elementType = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.elementKey = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.aff.status.PStatusJumpInfo pStatusJumpInfo = new com.tencent.wechat.aff.status.PStatusJumpInfo();
            if (bArr != null && bArr.length > 0) {
                pStatusJumpInfo.parseFrom(bArr);
            }
            this.jumpInfos.add(pStatusJumpInfo);
        }
        return 0;
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement setElementKey(java.lang.String str) {
        this.elementKey = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement setElementType(int i17) {
        this.elementType = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement setJumpInfos(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> linkedList) {
        this.jumpInfos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusJumpElement mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusJumpElement parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusJumpElement) super.parseFrom(bArr);
    }
}
