package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkC2CHostIPHint extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CHostIPHint DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CHostIPHint();
    private java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CHostIpMap> host_map = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.wechat.aff.IlinkC2CHostIPHint create() {
        return new com.tencent.wechat.aff.IlinkC2CHostIPHint();
    }

    public static com.tencent.wechat.aff.IlinkC2CHostIPHint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CHostIPHint newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CHostIPHint();
    }

    public com.tencent.wechat.aff.IlinkC2CHostIPHint addAllElementHostMap(java.util.Collection<com.tencent.wechat.aff.IlinkC2CHostIpMap> collection) {
        this.host_map.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIPHint addElementHostMap(com.tencent.wechat.aff.IlinkC2CHostIpMap ilinkC2CHostIpMap) {
        this.host_map.add(ilinkC2CHostIpMap);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIPHint build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.IlinkC2CHostIPHint) && n51.f.a(this.host_map, ((com.tencent.wechat.aff.IlinkC2CHostIPHint) fVar).host_map);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CHostIpMap> getHostMap() {
        return this.host_map;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHostMap() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.IlinkC2CHostIPHint mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CHostIPHint();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.host_map);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.host_map) + 0;
        }
        if (i17 == 2) {
            this.host_map.clear();
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
            com.tencent.wechat.aff.IlinkC2CHostIpMap ilinkC2CHostIpMap = new com.tencent.wechat.aff.IlinkC2CHostIpMap();
            if (bArr != null && bArr.length > 0) {
                ilinkC2CHostIpMap.parseFrom(bArr);
            }
            this.host_map.add(ilinkC2CHostIpMap);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIPHint setHostMap(java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CHostIpMap> linkedList) {
        this.host_map = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIPHint mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CHostIPHint parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CHostIPHint) super.parseFrom(bArr);
    }
}
