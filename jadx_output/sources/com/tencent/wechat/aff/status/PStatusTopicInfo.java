package com.tencent.wechat.aff.status;

/* loaded from: classes8.dex */
public class PStatusTopicInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusTopicInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusTopicInfo();
    public java.lang.String topicId = "";
    public java.lang.String iconId = "";
    public java.util.LinkedList<java.lang.String> topics = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> jumpInfos = new java.util.LinkedList<>();
    public java.lang.String verifyInfo = "";
    public java.lang.String title = "";
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusIconAction> iconActions = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpElement> jumpElements = new java.util.LinkedList<>();
    public com.tencent.wechat.aff.status.PStatusFooter footer = com.tencent.wechat.aff.status.PStatusFooter.getDefaultInstance();
    public java.lang.String clusterIdDeprecated = "";
    public com.tencent.wechat.aff.status.PStatusClusterPresent clusterPresentDeprecated = com.tencent.wechat.aff.status.PStatusClusterPresent.getDefaultInstance();
    public com.tencent.mm.protobuf.g deprecatedBuffer = com.tencent.mm.protobuf.g.f192155b;
    public int characterSetType = 0;
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusClusterPresent> clusterPresents = new java.util.LinkedList<>();
    public java.lang.String locale = "";

    public static com.tencent.wechat.aff.status.PStatusTopicInfo create() {
        return new com.tencent.wechat.aff.status.PStatusTopicInfo();
    }

    public static com.tencent.wechat.aff.status.PStatusTopicInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusTopicInfo newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusTopicInfo();
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addAllElementClusterPresents(java.util.Collection<com.tencent.wechat.aff.status.PStatusClusterPresent> collection) {
        this.clusterPresents.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addAllElementIconActions(java.util.Collection<com.tencent.wechat.aff.status.PStatusIconAction> collection) {
        this.iconActions.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addAllElementJumpElements(java.util.Collection<com.tencent.wechat.aff.status.PStatusJumpElement> collection) {
        this.jumpElements.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addAllElementJumpInfos(java.util.Collection<com.tencent.wechat.aff.status.PStatusJumpInfo> collection) {
        this.jumpInfos.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addAllElementTopics(java.util.Collection<java.lang.String> collection) {
        this.topics.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addElementClusterPresents(com.tencent.wechat.aff.status.PStatusClusterPresent pStatusClusterPresent) {
        this.clusterPresents.add(pStatusClusterPresent);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addElementIconActions(com.tencent.wechat.aff.status.PStatusIconAction pStatusIconAction) {
        this.iconActions.add(pStatusIconAction);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addElementJumpElements(com.tencent.wechat.aff.status.PStatusJumpElement pStatusJumpElement) {
        this.jumpElements.add(pStatusJumpElement);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addElementJumpInfos(com.tencent.wechat.aff.status.PStatusJumpInfo pStatusJumpInfo) {
        this.jumpInfos.add(pStatusJumpInfo);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo addElementTopics(java.lang.String str) {
        this.topics.add(str);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusTopicInfo)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusTopicInfo pStatusTopicInfo = (com.tencent.wechat.aff.status.PStatusTopicInfo) fVar;
        return n51.f.a(this.topicId, pStatusTopicInfo.topicId) && n51.f.a(this.iconId, pStatusTopicInfo.iconId) && n51.f.a(this.topics, pStatusTopicInfo.topics) && n51.f.a(this.jumpInfos, pStatusTopicInfo.jumpInfos) && n51.f.a(this.verifyInfo, pStatusTopicInfo.verifyInfo) && n51.f.a(this.title, pStatusTopicInfo.title) && n51.f.a(this.iconActions, pStatusTopicInfo.iconActions) && n51.f.a(this.jumpElements, pStatusTopicInfo.jumpElements) && n51.f.a(this.footer, pStatusTopicInfo.footer) && n51.f.a(this.clusterIdDeprecated, pStatusTopicInfo.clusterIdDeprecated) && n51.f.a(this.clusterPresentDeprecated, pStatusTopicInfo.clusterPresentDeprecated) && n51.f.a(this.deprecatedBuffer, pStatusTopicInfo.deprecatedBuffer) && n51.f.a(java.lang.Integer.valueOf(this.characterSetType), java.lang.Integer.valueOf(pStatusTopicInfo.characterSetType)) && n51.f.a(this.clusterPresents, pStatusTopicInfo.clusterPresents) && n51.f.a(this.locale, pStatusTopicInfo.locale);
    }

    public int getCharacterSetType() {
        return this.characterSetType;
    }

    public java.lang.String getClusterIdDeprecated() {
        return this.clusterIdDeprecated;
    }

    public com.tencent.wechat.aff.status.PStatusClusterPresent getClusterPresentDeprecated() {
        return this.clusterPresentDeprecated;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusClusterPresent> getClusterPresents() {
        return this.clusterPresents;
    }

    public com.tencent.mm.protobuf.g getDeprecatedBuffer() {
        return this.deprecatedBuffer;
    }

    public com.tencent.wechat.aff.status.PStatusFooter getFooter() {
        return this.footer;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusIconAction> getIconActions() {
        return this.iconActions;
    }

    public java.lang.String getIconId() {
        return this.iconId;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpElement> getJumpElements() {
        return this.jumpElements;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> getJumpInfos() {
        return this.jumpInfos;
    }

    public java.lang.String getLocale() {
        return this.locale;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getTopicId() {
        return this.topicId;
    }

    public java.util.LinkedList<java.lang.String> getTopics() {
        return this.topics;
    }

    public java.lang.String getVerifyInfo() {
        return this.verifyInfo;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusTopicInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.topicId;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.iconId;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.g(13, 1, this.topics);
            fVar.g(15, 8, this.jumpInfos);
            java.lang.String str3 = this.verifyInfo;
            if (str3 != null) {
                fVar.j(16, str3);
            }
            java.lang.String str4 = this.title;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            fVar.g(19, 8, this.iconActions);
            fVar.g(20, 8, this.jumpElements);
            com.tencent.wechat.aff.status.PStatusFooter pStatusFooter = this.footer;
            if (pStatusFooter != null) {
                fVar.i(22, pStatusFooter.computeSize());
                this.footer.writeFields(fVar);
            }
            java.lang.String str5 = this.clusterIdDeprecated;
            if (str5 != null) {
                fVar.j(23, str5);
            }
            com.tencent.wechat.aff.status.PStatusClusterPresent pStatusClusterPresent = this.clusterPresentDeprecated;
            if (pStatusClusterPresent != null) {
                fVar.i(24, pStatusClusterPresent.computeSize());
                this.clusterPresentDeprecated.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.deprecatedBuffer;
            if (gVar != null) {
                fVar.b(25, gVar);
            }
            fVar.e(26, this.characterSetType);
            fVar.g(27, 8, this.clusterPresents);
            java.lang.String str6 = this.locale;
            if (str6 != null) {
                fVar.j(28, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.topicId;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.iconId;
            if (str8 != null) {
                j17 += b36.f.j(10, str8);
            }
            int g17 = j17 + b36.f.g(13, 1, this.topics) + b36.f.g(15, 8, this.jumpInfos);
            java.lang.String str9 = this.verifyInfo;
            if (str9 != null) {
                g17 += b36.f.j(16, str9);
            }
            java.lang.String str10 = this.title;
            if (str10 != null) {
                g17 += b36.f.j(17, str10);
            }
            int g18 = g17 + b36.f.g(19, 8, this.iconActions) + b36.f.g(20, 8, this.jumpElements);
            com.tencent.wechat.aff.status.PStatusFooter pStatusFooter2 = this.footer;
            if (pStatusFooter2 != null) {
                g18 += b36.f.i(22, pStatusFooter2.computeSize());
            }
            java.lang.String str11 = this.clusterIdDeprecated;
            if (str11 != null) {
                g18 += b36.f.j(23, str11);
            }
            com.tencent.wechat.aff.status.PStatusClusterPresent pStatusClusterPresent2 = this.clusterPresentDeprecated;
            if (pStatusClusterPresent2 != null) {
                g18 += b36.f.i(24, pStatusClusterPresent2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.deprecatedBuffer;
            if (gVar2 != null) {
                g18 += b36.f.b(25, gVar2);
            }
            int e17 = g18 + b36.f.e(26, this.characterSetType) + b36.f.g(27, 8, this.clusterPresents);
            java.lang.String str12 = this.locale;
            return str12 != null ? e17 + b36.f.j(28, str12) : e17;
        }
        if (i17 == 2) {
            this.topics.clear();
            this.jumpInfos.clear();
            this.iconActions.clear();
            this.jumpElements.clear();
            this.clusterPresents.clear();
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
            this.topicId = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 10) {
            this.iconId = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 13) {
            this.topics.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 19) {
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
        }
        if (intValue == 20) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                com.tencent.wechat.aff.status.PStatusJumpElement pStatusJumpElement = new com.tencent.wechat.aff.status.PStatusJumpElement();
                if (bArr2 != null && bArr2.length > 0) {
                    pStatusJumpElement.parseFrom(bArr2);
                }
                this.jumpElements.add(pStatusJumpElement);
            }
            return 0;
        }
        switch (intValue) {
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.wechat.aff.status.PStatusJumpInfo pStatusJumpInfo = new com.tencent.wechat.aff.status.PStatusJumpInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        pStatusJumpInfo.parseFrom(bArr3);
                    }
                    this.jumpInfos.add(pStatusJumpInfo);
                }
                return 0;
            case 16:
                this.verifyInfo = aVar2.k(intValue);
                return 0;
            case 17:
                this.title = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 22:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size4 = j28.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            byte[] bArr4 = (byte[]) j28.get(i28);
                            com.tencent.wechat.aff.status.PStatusFooter pStatusFooter3 = new com.tencent.wechat.aff.status.PStatusFooter();
                            if (bArr4 != null && bArr4.length > 0) {
                                pStatusFooter3.parseFrom(bArr4);
                            }
                            this.footer = pStatusFooter3;
                        }
                        return 0;
                    case 23:
                        this.clusterIdDeprecated = aVar2.k(intValue);
                        return 0;
                    case 24:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size5 = j29.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            byte[] bArr5 = (byte[]) j29.get(i29);
                            com.tencent.wechat.aff.status.PStatusClusterPresent pStatusClusterPresent3 = new com.tencent.wechat.aff.status.PStatusClusterPresent();
                            if (bArr5 != null && bArr5.length > 0) {
                                pStatusClusterPresent3.parseFrom(bArr5);
                            }
                            this.clusterPresentDeprecated = pStatusClusterPresent3;
                        }
                        return 0;
                    case 25:
                        this.deprecatedBuffer = aVar2.d(intValue);
                        return 0;
                    case 26:
                        this.characterSetType = aVar2.g(intValue);
                        return 0;
                    case 27:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size6 = j37.size();
                        for (int i37 = 0; i37 < size6; i37++) {
                            byte[] bArr6 = (byte[]) j37.get(i37);
                            com.tencent.wechat.aff.status.PStatusClusterPresent pStatusClusterPresent4 = new com.tencent.wechat.aff.status.PStatusClusterPresent();
                            if (bArr6 != null && bArr6.length > 0) {
                                pStatusClusterPresent4.parseFrom(bArr6);
                            }
                            this.clusterPresents.add(pStatusClusterPresent4);
                        }
                        return 0;
                    case 28:
                        this.locale = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setCharacterSetType(int i17) {
        this.characterSetType = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setClusterIdDeprecated(java.lang.String str) {
        this.clusterIdDeprecated = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setClusterPresentDeprecated(com.tencent.wechat.aff.status.PStatusClusterPresent pStatusClusterPresent) {
        this.clusterPresentDeprecated = pStatusClusterPresent;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setClusterPresents(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusClusterPresent> linkedList) {
        this.clusterPresents = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setDeprecatedBuffer(com.tencent.mm.protobuf.g gVar) {
        this.deprecatedBuffer = gVar;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setFooter(com.tencent.wechat.aff.status.PStatusFooter pStatusFooter) {
        this.footer = pStatusFooter;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setIconActions(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusIconAction> linkedList) {
        this.iconActions = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setIconId(java.lang.String str) {
        this.iconId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setJumpElements(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpElement> linkedList) {
        this.jumpElements = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setJumpInfos(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusJumpInfo> linkedList) {
        this.jumpInfos = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setLocale(java.lang.String str) {
        this.locale = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setTopicId(java.lang.String str) {
        this.topicId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setTopics(java.util.LinkedList<java.lang.String> linkedList) {
        this.topics = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo setVerifyInfo(java.lang.String str) {
        this.verifyInfo = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusTopicInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusTopicInfo) super.parseFrom(bArr);
    }
}
