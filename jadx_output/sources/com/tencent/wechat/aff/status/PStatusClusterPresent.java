package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class PStatusClusterPresent extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusClusterPresent DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusClusterPresent();
    public java.lang.String iconId = "";
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusIconAction> iconActions = new java.util.LinkedList<>();
    public int character_set_type = 0;
    public java.lang.String cluster_id = "";
    public java.lang.String cluster_present_type = "";
    public int cluster_present_version = 0;

    public static com.tencent.wechat.aff.status.PStatusClusterPresent create() {
        return new com.tencent.wechat.aff.status.PStatusClusterPresent();
    }

    public static com.tencent.wechat.aff.status.PStatusClusterPresent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusClusterPresent newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusClusterPresent();
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent addAllElementIconActions(java.util.Collection<com.tencent.wechat.aff.status.PStatusIconAction> collection) {
        this.iconActions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent addElementIconActions(com.tencent.wechat.aff.status.PStatusIconAction pStatusIconAction) {
        this.iconActions.add(pStatusIconAction);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusClusterPresent)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusClusterPresent pStatusClusterPresent = (com.tencent.wechat.aff.status.PStatusClusterPresent) fVar;
        return n51.f.a(this.iconId, pStatusClusterPresent.iconId) && n51.f.a(this.iconActions, pStatusClusterPresent.iconActions) && n51.f.a(java.lang.Integer.valueOf(this.character_set_type), java.lang.Integer.valueOf(pStatusClusterPresent.character_set_type)) && n51.f.a(this.cluster_id, pStatusClusterPresent.cluster_id) && n51.f.a(this.cluster_present_type, pStatusClusterPresent.cluster_present_type) && n51.f.a(java.lang.Integer.valueOf(this.cluster_present_version), java.lang.Integer.valueOf(pStatusClusterPresent.cluster_present_version));
    }

    public int getCharacterSetType() {
        return this.character_set_type;
    }

    public int getCharacter_set_type() {
        return this.character_set_type;
    }

    public java.lang.String getClusterId() {
        return this.cluster_id;
    }

    public java.lang.String getClusterPresentType() {
        return this.cluster_present_type;
    }

    public int getClusterPresentVersion() {
        return this.cluster_present_version;
    }

    public java.lang.String getCluster_id() {
        return this.cluster_id;
    }

    public java.lang.String getCluster_present_type() {
        return this.cluster_present_type;
    }

    public int getCluster_present_version() {
        return this.cluster_present_version;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusIconAction> getIconActions() {
        return this.iconActions;
    }

    public java.lang.String getIconId() {
        return this.iconId;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusClusterPresent();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.iconId;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.iconActions);
            fVar.e(3, this.character_set_type);
            java.lang.String str2 = this.cluster_id;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.cluster_present_type;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.cluster_present_version);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.iconId;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, this.iconActions) + b36.f.e(3, this.character_set_type);
            java.lang.String str5 = this.cluster_id;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.cluster_present_type;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.e(6, this.cluster_present_version);
        }
        if (i17 == 2) {
            this.iconActions.clear();
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
        switch (intValue) {
            case 1:
                this.iconId = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.status.PStatusIconAction pStatusIconAction = new com.tencent.wechat.aff.status.PStatusIconAction();
                    if (bArr != null && bArr.length > 0) {
                        pStatusIconAction.parseFrom(bArr);
                    }
                    this.iconActions.add(pStatusIconAction);
                }
                return 0;
            case 3:
                this.character_set_type = aVar2.g(intValue);
                return 0;
            case 4:
                this.cluster_id = aVar2.k(intValue);
                return 0;
            case 5:
                this.cluster_present_type = aVar2.k(intValue);
                return 0;
            case 6:
                this.cluster_present_version = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setCharacterSetType(int i17) {
        this.character_set_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setCharacter_set_type(int i17) {
        this.character_set_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setClusterId(java.lang.String str) {
        this.cluster_id = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setClusterPresentType(java.lang.String str) {
        this.cluster_present_type = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setClusterPresentVersion(int i17) {
        this.cluster_present_version = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setCluster_id(java.lang.String str) {
        this.cluster_id = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setCluster_present_type(java.lang.String str) {
        this.cluster_present_type = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setCluster_present_version(int i17) {
        this.cluster_present_version = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setIconActions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusIconAction> linkedList) {
        this.iconActions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent setIconId(java.lang.String str) {
        this.iconId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusClusterPresent parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusClusterPresent) super.parseFrom(bArr);
    }
}
