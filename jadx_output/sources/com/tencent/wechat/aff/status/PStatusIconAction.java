package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class PStatusIconAction extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusIconAction DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusIconAction();
    public java.lang.String url = "";
    public long extOption = 0;
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> iconDescriptions = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> clusterDescriptions = new java.util.LinkedList<>();
    public int beginTime = 0;
    public int endTime = 0;
    public java.lang.String groupId = "";
    public int order = 0;
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> otherClusterDescriptions = new java.util.LinkedList<>();
    public java.lang.String bigIconUrl = "";
    public java.lang.String unreadTextColor = "";
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> cluster_with_me_descriptions = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> cluster_only_me_descriptions = new java.util.LinkedList<>();

    public static com.tencent.wechat.aff.status.PStatusIconAction create() {
        return new com.tencent.wechat.aff.status.PStatusIconAction();
    }

    public static com.tencent.wechat.aff.status.PStatusIconAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusIconAction newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusIconAction();
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addAllElementClusterDescriptions(java.util.Collection<com.tencent.wechat.aff.status.PStatusI18n> collection) {
        this.clusterDescriptions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addAllElementClusterOnlyMeDescriptions(java.util.Collection<com.tencent.wechat.aff.status.PStatusI18n> collection) {
        this.cluster_only_me_descriptions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addAllElementClusterWithMeDescriptions(java.util.Collection<com.tencent.wechat.aff.status.PStatusI18n> collection) {
        this.cluster_with_me_descriptions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addAllElementCluster_only_me_descriptions(java.util.Collection<com.tencent.wechat.aff.status.PStatusI18n> collection) {
        this.cluster_only_me_descriptions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addAllElementCluster_with_me_descriptions(java.util.Collection<com.tencent.wechat.aff.status.PStatusI18n> collection) {
        this.cluster_with_me_descriptions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addAllElementIconDescriptions(java.util.Collection<com.tencent.wechat.aff.status.PStatusI18n> collection) {
        this.iconDescriptions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addAllElementOtherClusterDescriptions(java.util.Collection<com.tencent.wechat.aff.status.PStatusI18n> collection) {
        this.otherClusterDescriptions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addElementClusterDescriptions(com.tencent.wechat.aff.status.PStatusI18n pStatusI18n) {
        this.clusterDescriptions.add(pStatusI18n);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addElementClusterOnlyMeDescriptions(com.tencent.wechat.aff.status.PStatusI18n pStatusI18n) {
        this.cluster_only_me_descriptions.add(pStatusI18n);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addElementClusterWithMeDescriptions(com.tencent.wechat.aff.status.PStatusI18n pStatusI18n) {
        this.cluster_with_me_descriptions.add(pStatusI18n);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addElementCluster_only_me_descriptions(com.tencent.wechat.aff.status.PStatusI18n pStatusI18n) {
        this.cluster_only_me_descriptions.add(pStatusI18n);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addElementCluster_with_me_descriptions(com.tencent.wechat.aff.status.PStatusI18n pStatusI18n) {
        this.cluster_with_me_descriptions.add(pStatusI18n);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addElementIconDescriptions(com.tencent.wechat.aff.status.PStatusI18n pStatusI18n) {
        this.iconDescriptions.add(pStatusI18n);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction addElementOtherClusterDescriptions(com.tencent.wechat.aff.status.PStatusI18n pStatusI18n) {
        this.otherClusterDescriptions.add(pStatusI18n);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusIconAction)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusIconAction pStatusIconAction = (com.tencent.wechat.aff.status.PStatusIconAction) fVar;
        return n51.f.a(this.url, pStatusIconAction.url) && n51.f.a(java.lang.Long.valueOf(this.extOption), java.lang.Long.valueOf(pStatusIconAction.extOption)) && n51.f.a(this.iconDescriptions, pStatusIconAction.iconDescriptions) && n51.f.a(this.clusterDescriptions, pStatusIconAction.clusterDescriptions) && n51.f.a(java.lang.Integer.valueOf(this.beginTime), java.lang.Integer.valueOf(pStatusIconAction.beginTime)) && n51.f.a(java.lang.Integer.valueOf(this.endTime), java.lang.Integer.valueOf(pStatusIconAction.endTime)) && n51.f.a(this.groupId, pStatusIconAction.groupId) && n51.f.a(java.lang.Integer.valueOf(this.order), java.lang.Integer.valueOf(pStatusIconAction.order)) && n51.f.a(this.otherClusterDescriptions, pStatusIconAction.otherClusterDescriptions) && n51.f.a(this.bigIconUrl, pStatusIconAction.bigIconUrl) && n51.f.a(this.unreadTextColor, pStatusIconAction.unreadTextColor) && n51.f.a(this.cluster_with_me_descriptions, pStatusIconAction.cluster_with_me_descriptions) && n51.f.a(this.cluster_only_me_descriptions, pStatusIconAction.cluster_only_me_descriptions);
    }

    public int getBeginTime() {
        return this.beginTime;
    }

    public java.lang.String getBigIconUrl() {
        return this.bigIconUrl;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> getClusterDescriptions() {
        return this.clusterDescriptions;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> getClusterOnlyMeDescriptions() {
        return this.cluster_only_me_descriptions;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> getClusterWithMeDescriptions() {
        return this.cluster_with_me_descriptions;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> getCluster_only_me_descriptions() {
        return this.cluster_only_me_descriptions;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> getCluster_with_me_descriptions() {
        return this.cluster_with_me_descriptions;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public long getExtOption() {
        return this.extOption;
    }

    public java.lang.String getGroupId() {
        return this.groupId;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> getIconDescriptions() {
        return this.iconDescriptions;
    }

    public int getOrder() {
        return this.order;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> getOtherClusterDescriptions() {
        return this.otherClusterDescriptions;
    }

    public java.lang.String getUnreadTextColor() {
        return this.unreadTextColor;
    }

    public java.lang.String getUrl() {
        return this.url;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusIconAction();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.url;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.extOption);
            fVar.g(3, 8, this.iconDescriptions);
            fVar.g(4, 8, this.clusterDescriptions);
            fVar.e(5, this.beginTime);
            fVar.e(6, this.endTime);
            java.lang.String str2 = this.groupId;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.order);
            fVar.g(9, 8, this.otherClusterDescriptions);
            java.lang.String str3 = this.bigIconUrl;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.unreadTextColor;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.g(13, 8, this.cluster_with_me_descriptions);
            fVar.g(14, 8, this.cluster_only_me_descriptions);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.url;
            int j17 = (str5 != null ? b36.f.j(1, str5) + 0 : 0) + b36.f.h(2, this.extOption) + b36.f.g(3, 8, this.iconDescriptions) + b36.f.g(4, 8, this.clusterDescriptions) + b36.f.e(5, this.beginTime) + b36.f.e(6, this.endTime);
            java.lang.String str6 = this.groupId;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            int e17 = j17 + b36.f.e(8, this.order) + b36.f.g(9, 8, this.otherClusterDescriptions);
            java.lang.String str7 = this.bigIconUrl;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            java.lang.String str8 = this.unreadTextColor;
            if (str8 != null) {
                e17 += b36.f.j(11, str8);
            }
            return e17 + b36.f.g(13, 8, this.cluster_with_me_descriptions) + b36.f.g(14, 8, this.cluster_only_me_descriptions);
        }
        if (i17 == 2) {
            this.iconDescriptions.clear();
            this.clusterDescriptions.clear();
            this.otherClusterDescriptions.clear();
            this.cluster_with_me_descriptions.clear();
            this.cluster_only_me_descriptions.clear();
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
                this.url = aVar2.k(intValue);
                return 0;
            case 2:
                this.extOption = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.status.PStatusI18n pStatusI18n = new com.tencent.wechat.aff.status.PStatusI18n();
                    if (bArr != null && bArr.length > 0) {
                        pStatusI18n.parseFrom(bArr);
                    }
                    this.iconDescriptions.add(pStatusI18n);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.aff.status.PStatusI18n pStatusI18n2 = new com.tencent.wechat.aff.status.PStatusI18n();
                    if (bArr2 != null && bArr2.length > 0) {
                        pStatusI18n2.parseFrom(bArr2);
                    }
                    this.clusterDescriptions.add(pStatusI18n2);
                }
                return 0;
            case 5:
                this.beginTime = aVar2.g(intValue);
                return 0;
            case 6:
                this.endTime = aVar2.g(intValue);
                return 0;
            case 7:
                this.groupId = aVar2.k(intValue);
                return 0;
            case 8:
                this.order = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.wechat.aff.status.PStatusI18n pStatusI18n3 = new com.tencent.wechat.aff.status.PStatusI18n();
                    if (bArr3 != null && bArr3.length > 0) {
                        pStatusI18n3.parseFrom(bArr3);
                    }
                    this.otherClusterDescriptions.add(pStatusI18n3);
                }
                return 0;
            case 10:
                this.bigIconUrl = aVar2.k(intValue);
                return 0;
            case 11:
                this.unreadTextColor = aVar2.k(intValue);
                return 0;
            case 12:
            default:
                return -1;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    com.tencent.wechat.aff.status.PStatusI18n pStatusI18n4 = new com.tencent.wechat.aff.status.PStatusI18n();
                    if (bArr4 != null && bArr4.length > 0) {
                        pStatusI18n4.parseFrom(bArr4);
                    }
                    this.cluster_with_me_descriptions.add(pStatusI18n4);
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    com.tencent.wechat.aff.status.PStatusI18n pStatusI18n5 = new com.tencent.wechat.aff.status.PStatusI18n();
                    if (bArr5 != null && bArr5.length > 0) {
                        pStatusI18n5.parseFrom(bArr5);
                    }
                    this.cluster_only_me_descriptions.add(pStatusI18n5);
                }
                return 0;
        }
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setBeginTime(int i17) {
        this.beginTime = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setBigIconUrl(java.lang.String str) {
        this.bigIconUrl = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setClusterDescriptions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> linkedList) {
        this.clusterDescriptions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setClusterOnlyMeDescriptions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> linkedList) {
        this.cluster_only_me_descriptions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setClusterWithMeDescriptions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> linkedList) {
        this.cluster_with_me_descriptions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setCluster_only_me_descriptions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> linkedList) {
        this.cluster_only_me_descriptions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setCluster_with_me_descriptions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> linkedList) {
        this.cluster_with_me_descriptions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setEndTime(int i17) {
        this.endTime = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setExtOption(long j17) {
        this.extOption = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setGroupId(java.lang.String str) {
        this.groupId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setIconDescriptions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> linkedList) {
        this.iconDescriptions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setOrder(int i17) {
        this.order = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setOtherClusterDescriptions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusI18n> linkedList) {
        this.otherClusterDescriptions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setUnreadTextColor(java.lang.String str) {
        this.unreadTextColor = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction setUrl(java.lang.String str) {
        this.url = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusIconAction mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusIconAction parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusIconAction) super.parseFrom(bArr);
    }
}
