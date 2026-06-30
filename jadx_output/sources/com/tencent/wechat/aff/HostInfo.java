package com.tencent.wechat.aff;

/* loaded from: classes4.dex */
public class HostInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.HostInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.HostInfo();
    private java.lang.String origin;
    private java.lang.String substitute;
    private java.util.LinkedList<com.tencent.wechat.aff.IPInfo> ip_list = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[4];

    public static com.tencent.wechat.aff.HostInfo create() {
        return new com.tencent.wechat.aff.HostInfo();
    }

    public static com.tencent.wechat.aff.HostInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.HostInfo newBuilder() {
        return new com.tencent.wechat.aff.HostInfo();
    }

    public com.tencent.wechat.aff.HostInfo addAllElementIpList(java.util.Collection<com.tencent.wechat.aff.IPInfo> collection) {
        this.ip_list.addAll(collection);
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.HostInfo addElementIpList(com.tencent.wechat.aff.IPInfo iPInfo) {
        this.ip_list.add(iPInfo);
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.HostInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.HostInfo)) {
            return false;
        }
        com.tencent.wechat.aff.HostInfo hostInfo = (com.tencent.wechat.aff.HostInfo) fVar;
        return n51.f.a(this.origin, hostInfo.origin) && n51.f.a(this.substitute, hostInfo.substitute) && n51.f.a(this.ip_list, hostInfo.ip_list);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.IPInfo> getIpList() {
        return this.ip_list;
    }

    public java.lang.String getOrigin() {
        return this.hasSetFields[1] ? this.origin : "";
    }

    public java.lang.String getSubstitute() {
        return this.hasSetFields[2] ? this.substitute : "";
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasIpList() {
        return hasFieldNumber(3);
    }

    public boolean hasOrigin() {
        return hasFieldNumber(1);
    }

    public boolean hasSubstitute() {
        return hasFieldNumber(2);
    }

    public com.tencent.wechat.aff.HostInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.HostInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.origin;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.substitute;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.ip_list);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.origin;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.substitute;
            if (str4 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str4);
            }
            return i18 + b36.f.g(3, 8, this.ip_list);
        }
        if (i17 == 2) {
            this.ip_list.clear();
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
            this.origin = aVar2.k(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.substitute = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.IPInfo iPInfo = new com.tencent.wechat.aff.IPInfo();
            if (bArr != null && bArr.length > 0) {
                iPInfo.parseFrom(bArr);
            }
            this.ip_list.add(iPInfo);
        }
        this.hasSetFields[3] = true;
        return 0;
    }

    public com.tencent.wechat.aff.HostInfo setIpList(java.util.LinkedList<com.tencent.wechat.aff.IPInfo> linkedList) {
        this.ip_list = linkedList;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.wechat.aff.HostInfo setOrigin(java.lang.String str) {
        this.origin = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.HostInfo setSubstitute(java.lang.String str) {
        this.substitute = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.HostInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.HostInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.HostInfo) super.parseFrom(bArr);
    }
}
