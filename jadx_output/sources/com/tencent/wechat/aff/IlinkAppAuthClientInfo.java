package com.tencent.wechat.aff;

/* loaded from: classes4.dex */
public class IlinkAppAuthClientInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkAppAuthClientInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkAppAuthClientInfo();
    private java.util.LinkedList<com.tencent.wechat.aff.HostInfo> host_list = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[2];

    public static com.tencent.wechat.aff.IlinkAppAuthClientInfo create() {
        return new com.tencent.wechat.aff.IlinkAppAuthClientInfo();
    }

    public static com.tencent.wechat.aff.IlinkAppAuthClientInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkAppAuthClientInfo newBuilder() {
        return new com.tencent.wechat.aff.IlinkAppAuthClientInfo();
    }

    public com.tencent.wechat.aff.IlinkAppAuthClientInfo addAllElementHostList(java.util.Collection<com.tencent.wechat.aff.HostInfo> collection) {
        this.host_list.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppAuthClientInfo addElementHostList(com.tencent.wechat.aff.HostInfo hostInfo) {
        this.host_list.add(hostInfo);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppAuthClientInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.aff.IlinkAppAuthClientInfo) && n51.f.a(this.host_list, ((com.tencent.wechat.aff.IlinkAppAuthClientInfo) fVar).host_list);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.HostInfo> getHostList() {
        return this.host_list;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasHostList() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.IlinkAppAuthClientInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkAppAuthClientInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.host_list);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.host_list) + 0;
        }
        if (i17 == 2) {
            this.host_list.clear();
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
            com.tencent.wechat.aff.HostInfo hostInfo = new com.tencent.wechat.aff.HostInfo();
            if (bArr != null && bArr.length > 0) {
                hostInfo.parseFrom(bArr);
            }
            this.host_list.add(hostInfo);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkAppAuthClientInfo setHostList(java.util.LinkedList<com.tencent.wechat.aff.HostInfo> linkedList) {
        this.host_list = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkAppAuthClientInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkAppAuthClientInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkAppAuthClientInfo) super.parseFrom(bArr);
    }
}
