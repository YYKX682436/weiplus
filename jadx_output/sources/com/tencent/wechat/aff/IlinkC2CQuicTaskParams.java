package com.tencent.wechat.aff;

/* loaded from: classes8.dex */
public class IlinkC2CQuicTaskParams extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.IlinkC2CQuicTaskParams DEFAULT_INSTANCE = new com.tencent.wechat.aff.IlinkC2CQuicTaskParams();
    private com.tencent.wechat.aff.IlinkC2CHostIPHint host_map_hint;
    private java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CQuicHostMap> quic_host_map = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CQuicForceHost> force_quic_host = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[4];

    public static com.tencent.wechat.aff.IlinkC2CQuicTaskParams create() {
        return new com.tencent.wechat.aff.IlinkC2CQuicTaskParams();
    }

    public static com.tencent.wechat.aff.IlinkC2CQuicTaskParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.IlinkC2CQuicTaskParams newBuilder() {
        return new com.tencent.wechat.aff.IlinkC2CQuicTaskParams();
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams addAllElementForceQuicHost(java.util.Collection<com.tencent.wechat.aff.IlinkC2CQuicForceHost> collection) {
        this.force_quic_host.addAll(collection);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams addAllElementQuicHostMap(java.util.Collection<com.tencent.wechat.aff.IlinkC2CQuicHostMap> collection) {
        this.quic_host_map.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams addElementForceQuicHost(com.tencent.wechat.aff.IlinkC2CQuicForceHost ilinkC2CQuicForceHost) {
        this.force_quic_host.add(ilinkC2CQuicForceHost);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams addElementQuicHostMap(com.tencent.wechat.aff.IlinkC2CQuicHostMap ilinkC2CQuicHostMap) {
        this.quic_host_map.add(ilinkC2CQuicHostMap);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.IlinkC2CQuicTaskParams)) {
            return false;
        }
        com.tencent.wechat.aff.IlinkC2CQuicTaskParams ilinkC2CQuicTaskParams = (com.tencent.wechat.aff.IlinkC2CQuicTaskParams) fVar;
        return n51.f.a(this.quic_host_map, ilinkC2CQuicTaskParams.quic_host_map) && n51.f.a(this.force_quic_host, ilinkC2CQuicTaskParams.force_quic_host) && n51.f.a(this.host_map_hint, ilinkC2CQuicTaskParams.host_map_hint);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CQuicForceHost> getForceQuicHost() {
        return this.force_quic_host;
    }

    public com.tencent.wechat.aff.IlinkC2CHostIPHint getHostMapHint() {
        return this.hasSetFields[3] ? this.host_map_hint : com.tencent.wechat.aff.IlinkC2CHostIPHint.create();
    }

    public java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CQuicHostMap> getQuicHostMap() {
        return this.quic_host_map;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasForceQuicHost() {
        return hasFieldNumber(2);
    }

    public boolean hasHostMapHint() {
        return hasFieldNumber(3);
    }

    public boolean hasQuicHostMap() {
        return hasFieldNumber(1);
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.IlinkC2CQuicTaskParams();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.quic_host_map);
            fVar.g(2, 8, this.force_quic_host);
            com.tencent.wechat.aff.IlinkC2CHostIPHint ilinkC2CHostIPHint = this.host_map_hint;
            if (ilinkC2CHostIPHint != null && this.hasSetFields[3]) {
                fVar.i(3, ilinkC2CHostIPHint.computeSize());
                this.host_map_hint.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.quic_host_map) + 0 + b36.f.g(2, 8, this.force_quic_host);
            com.tencent.wechat.aff.IlinkC2CHostIPHint ilinkC2CHostIPHint2 = this.host_map_hint;
            return (ilinkC2CHostIPHint2 == null || !this.hasSetFields[3]) ? g17 : g17 + b36.f.i(3, ilinkC2CHostIPHint2.computeSize());
        }
        if (i17 == 2) {
            this.quic_host_map.clear();
            this.force_quic_host.clear();
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
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.IlinkC2CQuicHostMap ilinkC2CQuicHostMap = new com.tencent.wechat.aff.IlinkC2CQuicHostMap();
                if (bArr != null && bArr.length > 0) {
                    ilinkC2CQuicHostMap.parseFrom(bArr);
                }
                this.quic_host_map.add(ilinkC2CQuicHostMap);
            }
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.aff.IlinkC2CQuicForceHost ilinkC2CQuicForceHost = new com.tencent.wechat.aff.IlinkC2CQuicForceHost();
                if (bArr2 != null && bArr2.length > 0) {
                    ilinkC2CQuicForceHost.parseFrom(bArr2);
                }
                this.force_quic_host.add(ilinkC2CQuicForceHost);
            }
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.tencent.wechat.aff.IlinkC2CHostIPHint ilinkC2CHostIPHint3 = new com.tencent.wechat.aff.IlinkC2CHostIPHint();
            if (bArr3 != null && bArr3.length > 0) {
                ilinkC2CHostIPHint3.parseFrom(bArr3);
            }
            this.host_map_hint = ilinkC2CHostIPHint3;
        }
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams setForceQuicHost(java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CQuicForceHost> linkedList) {
        this.force_quic_host = linkedList;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams setHostMapHint(com.tencent.wechat.aff.IlinkC2CHostIPHint ilinkC2CHostIPHint) {
        this.host_map_hint = ilinkC2CHostIPHint;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams setQuicHostMap(java.util.LinkedList<com.tencent.wechat.aff.IlinkC2CQuicHostMap> linkedList) {
        this.quic_host_map = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.IlinkC2CQuicTaskParams parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.IlinkC2CQuicTaskParams) super.parseFrom(bArr);
    }
}
