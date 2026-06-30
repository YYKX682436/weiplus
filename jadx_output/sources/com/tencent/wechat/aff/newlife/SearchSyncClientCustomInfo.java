package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class SearchSyncClientCustomInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo();
    private java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo> liteapp_version_list = new java.util.LinkedList<>();
    private java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo> zhuge_personal_msg_info_list = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[3];

    /* loaded from: classes8.dex */
    public static class LiteAppVersionInfo extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo();
        private java.lang.String appid;
        private final boolean[] hasSetFields = new boolean[3];
        private java.lang.String version;

        public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo create() {
            return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo();
        }

        public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo newBuilder() {
            return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo();
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo liteAppVersionInfo = (com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo) fVar;
            return n51.f.a(this.appid, liteAppVersionInfo.appid) && n51.f.a(this.version, liteAppVersionInfo.version);
        }

        public java.lang.String getAppid() {
            return this.hasSetFields[1] ? this.appid : "";
        }

        public java.lang.String getVersion() {
            return this.hasSetFields[2] ? this.version : "";
        }

        public boolean hasAppid() {
            return hasFieldNumber(1);
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasVersion() {
            return hasFieldNumber(2);
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.appid;
                if (str != null && this.hasSetFields[1]) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.version;
                if (str2 != null && this.hasSetFields[2]) {
                    fVar.j(2, str2);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str3 = this.appid;
                if (str3 != null && this.hasSetFields[1]) {
                    i18 = 0 + b36.f.j(1, str3);
                }
                java.lang.String str4 = this.version;
                return (str4 == null || !this.hasSetFields[2]) ? i18 : i18 + b36.f.j(2, str4);
            }
            if (i17 == 2) {
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
                this.appid = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.version = aVar2.k(intValue);
            this.hasSetFields[2] = true;
            return 0;
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo setAppid(java.lang.String str) {
            this.appid = str;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo setVersion(java.lang.String str) {
            this.version = str;
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes8.dex */
    public static class ZhugePersonalMsgInfo extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo();
        private final boolean[] hasSetFields = new boolean[4];
        private boolean has_event;
        private int unread_count;
        private java.lang.String username;

        public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo create() {
            return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo();
        }

        public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo newBuilder() {
            return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo();
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo zhugePersonalMsgInfo = (com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo) fVar;
            return n51.f.a(this.username, zhugePersonalMsgInfo.username) && n51.f.a(java.lang.Integer.valueOf(this.unread_count), java.lang.Integer.valueOf(zhugePersonalMsgInfo.unread_count)) && n51.f.a(java.lang.Boolean.valueOf(this.has_event), java.lang.Boolean.valueOf(zhugePersonalMsgInfo.has_event));
        }

        public boolean getHasEvent() {
            return this.has_event;
        }

        public int getUnreadCount() {
            return this.unread_count;
        }

        public java.lang.String getUsername() {
            return this.hasSetFields[1] ? this.username : "";
        }

        public boolean hasFieldNumber(int i17) {
            return this.hasSetFields[i17];
        }

        public boolean hasHasEvent() {
            return hasFieldNumber(3);
        }

        public boolean hasUnreadCount() {
            return hasFieldNumber(2);
        }

        public boolean hasUsername() {
            return hasFieldNumber(1);
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            int i18 = 0;
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.username;
                if (str != null && this.hasSetFields[1]) {
                    fVar.j(1, str);
                }
                if (this.hasSetFields[2]) {
                    fVar.e(2, this.unread_count);
                }
                if (this.hasSetFields[3]) {
                    fVar.a(3, this.has_event);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str2 = this.username;
                if (str2 != null && this.hasSetFields[1]) {
                    i18 = 0 + b36.f.j(1, str2);
                }
                if (this.hasSetFields[2]) {
                    i18 += b36.f.e(2, this.unread_count);
                }
                return this.hasSetFields[3] ? i18 + b36.f.a(3, this.has_event) : i18;
            }
            if (i17 == 2) {
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
                this.username = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            }
            if (intValue == 2) {
                this.unread_count = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.has_event = aVar2.c(intValue);
            this.hasSetFields[3] = true;
            return 0;
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo setHasEvent(boolean z17) {
            this.has_event = z17;
            this.hasSetFields[3] = true;
            return this;
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo setUnreadCount(int i17) {
            this.unread_count = i17;
            this.hasSetFields[2] = true;
            return this;
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo setUsername(java.lang.String str) {
            this.username = str;
            this.hasSetFields[1] = true;
            return this;
        }

        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo create() {
        return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo();
    }

    public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo();
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo addAllElementLiteappVersionList(java.util.Collection<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo> collection) {
        this.liteapp_version_list.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo addAllElementZhugePersonalMsgInfoList(java.util.Collection<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo> collection) {
        this.zhuge_personal_msg_info_list.addAll(collection);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo addElementLiteappVersionList(com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo liteAppVersionInfo) {
        this.liteapp_version_list.add(liteAppVersionInfo);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo addElementZhugePersonalMsgInfoList(com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo zhugePersonalMsgInfo) {
        this.zhuge_personal_msg_info_list.add(zhugePersonalMsgInfo);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo searchSyncClientCustomInfo = (com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo) fVar;
        return n51.f.a(this.liteapp_version_list, searchSyncClientCustomInfo.liteapp_version_list) && n51.f.a(this.zhuge_personal_msg_info_list, searchSyncClientCustomInfo.zhuge_personal_msg_info_list);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo> getLiteappVersionList() {
        return this.liteapp_version_list;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo> getZhugePersonalMsgInfoList() {
        return this.zhuge_personal_msg_info_list;
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasLiteappVersionList() {
        return hasFieldNumber(1);
    }

    public boolean hasZhugePersonalMsgInfoList() {
        return hasFieldNumber(2);
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.liteapp_version_list);
            fVar.g(2, 8, this.zhuge_personal_msg_info_list);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.liteapp_version_list) + 0 + b36.f.g(2, 8, this.zhuge_personal_msg_info_list);
        }
        if (i17 == 2) {
            this.liteapp_version_list.clear();
            this.zhuge_personal_msg_info_list.clear();
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
                com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo liteAppVersionInfo = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo();
                if (bArr != null && bArr.length > 0) {
                    liteAppVersionInfo.parseFrom(bArr);
                }
                this.liteapp_version_list.add(liteAppVersionInfo);
            }
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo zhugePersonalMsgInfo = new com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo();
            if (bArr2 != null && bArr2.length > 0) {
                zhugePersonalMsgInfo.parseFrom(bArr2);
            }
            this.zhuge_personal_msg_info_list.add(zhugePersonalMsgInfo);
        }
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo setLiteappVersionList(java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.LiteAppVersionInfo> linkedList) {
        this.liteapp_version_list = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo setZhugePersonalMsgInfoList(java.util.LinkedList<com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo.ZhugePersonalMsgInfo> linkedList) {
        this.zhuge_personal_msg_info_list = linkedList;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.SearchSyncClientCustomInfo) super.parseFrom(bArr);
    }
}
