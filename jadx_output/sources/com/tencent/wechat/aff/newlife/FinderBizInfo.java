package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderBizInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderBizInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderBizInfo();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo> info = new java.util.LinkedList<>();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMiniAppInfo> miniapps = new java.util.LinkedList<>();

    /* loaded from: classes4.dex */
    public static class BizAuthInfo extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo();
        public int auth_icon_type = 0;
        public java.lang.String auth_icon_url = "";

        public static com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo create() {
            return new com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo();
        }

        public static com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo newBuilder() {
            return new com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo();
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo bizAuthInfo = (com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.auth_icon_type), java.lang.Integer.valueOf(bizAuthInfo.auth_icon_type)) && n51.f.a(this.auth_icon_url, bizAuthInfo.auth_icon_url);
        }

        public int getAuthIconType() {
            return this.auth_icon_type;
        }

        public java.lang.String getAuthIconUrl() {
            return this.auth_icon_url;
        }

        public int getAuth_icon_type() {
            return this.auth_icon_type;
        }

        public java.lang.String getAuth_icon_url() {
            return this.auth_icon_url;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.auth_icon_type);
                java.lang.String str = this.auth_icon_url;
                if (str != null) {
                    fVar.j(2, str);
                }
                return 0;
            }
            if (i17 == 1) {
                int e17 = b36.f.e(1, this.auth_icon_type) + 0;
                java.lang.String str2 = this.auth_icon_url;
                return str2 != null ? e17 + b36.f.j(2, str2) : e17;
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
                this.auth_icon_type = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 2) {
                return -1;
            }
            this.auth_icon_url = aVar2.k(intValue);
            return 0;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo setAuthIconType(int i17) {
            this.auth_icon_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo setAuthIconUrl(java.lang.String str) {
            this.auth_icon_url = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo setAuth_icon_type(int i17) {
            this.auth_icon_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo setAuth_icon_url(java.lang.String str) {
            this.auth_icon_url = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes4.dex */
    public static class BizInfo extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo();
        public java.lang.String biz_username = "";
        public java.lang.String biz_nickname = "";
        public java.lang.String head_img_url = "";
        public int biz_uin = 0;
        public int friend_follow_count = 0;
        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo auth_info = com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo.getDefaultInstance();

        public static com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo create() {
            return new com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo();
        }

        public static com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo newBuilder() {
            return new com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo();
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo bizInfo = (com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo) fVar;
            return n51.f.a(this.biz_username, bizInfo.biz_username) && n51.f.a(this.biz_nickname, bizInfo.biz_nickname) && n51.f.a(this.head_img_url, bizInfo.head_img_url) && n51.f.a(java.lang.Integer.valueOf(this.biz_uin), java.lang.Integer.valueOf(bizInfo.biz_uin)) && n51.f.a(java.lang.Integer.valueOf(this.friend_follow_count), java.lang.Integer.valueOf(bizInfo.friend_follow_count)) && n51.f.a(this.auth_info, bizInfo.auth_info);
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo getAuthInfo() {
            return this.auth_info;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo getAuth_info() {
            return this.auth_info;
        }

        public java.lang.String getBizNickname() {
            return this.biz_nickname;
        }

        public int getBizUin() {
            return this.biz_uin;
        }

        public java.lang.String getBizUsername() {
            return this.biz_username;
        }

        public java.lang.String getBiz_nickname() {
            return this.biz_nickname;
        }

        public int getBiz_uin() {
            return this.biz_uin;
        }

        public java.lang.String getBiz_username() {
            return this.biz_username;
        }

        public int getFriendFollowCount() {
            return this.friend_follow_count;
        }

        public int getFriend_follow_count() {
            return this.friend_follow_count;
        }

        public java.lang.String getHeadImgUrl() {
            return this.head_img_url;
        }

        public java.lang.String getHead_img_url() {
            return this.head_img_url;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                java.lang.String str = this.biz_username;
                if (str != null) {
                    fVar.j(1, str);
                }
                java.lang.String str2 = this.biz_nickname;
                if (str2 != null) {
                    fVar.j(2, str2);
                }
                java.lang.String str3 = this.head_img_url;
                if (str3 != null) {
                    fVar.j(3, str3);
                }
                fVar.e(4, this.biz_uin);
                fVar.e(5, this.friend_follow_count);
                com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo bizAuthInfo = this.auth_info;
                if (bizAuthInfo != null) {
                    fVar.i(6, bizAuthInfo.computeSize());
                    this.auth_info.writeFields(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                java.lang.String str4 = this.biz_username;
                int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
                java.lang.String str5 = this.biz_nickname;
                if (str5 != null) {
                    j17 += b36.f.j(2, str5);
                }
                java.lang.String str6 = this.head_img_url;
                if (str6 != null) {
                    j17 += b36.f.j(3, str6);
                }
                int e17 = j17 + b36.f.e(4, this.biz_uin) + b36.f.e(5, this.friend_follow_count);
                com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo bizAuthInfo2 = this.auth_info;
                return bizAuthInfo2 != null ? e17 + b36.f.i(6, bizAuthInfo2.computeSize()) : e17;
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
            switch (intValue) {
                case 1:
                    this.biz_username = aVar2.k(intValue);
                    return 0;
                case 2:
                    this.biz_nickname = aVar2.k(intValue);
                    return 0;
                case 3:
                    this.head_img_url = aVar2.k(intValue);
                    return 0;
                case 4:
                    this.biz_uin = aVar2.g(intValue);
                    return 0;
                case 5:
                    this.friend_follow_count = aVar2.g(intValue);
                    return 0;
                case 6:
                    java.util.LinkedList j18 = aVar2.j(intValue);
                    int size = j18.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        byte[] bArr = (byte[]) j18.get(i18);
                        com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo bizAuthInfo3 = new com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo();
                        if (bArr != null && bArr.length > 0) {
                            bizAuthInfo3.parseFrom(bArr);
                        }
                        this.auth_info = bizAuthInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setAuthInfo(com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo bizAuthInfo) {
            this.auth_info = bizAuthInfo;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setAuth_info(com.tencent.wechat.aff.newlife.FinderBizInfo.BizAuthInfo bizAuthInfo) {
            this.auth_info = bizAuthInfo;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setBizNickname(java.lang.String str) {
            this.biz_nickname = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setBizUin(int i17) {
            this.biz_uin = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setBizUsername(java.lang.String str) {
            this.biz_username = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setBiz_nickname(java.lang.String str) {
            this.biz_nickname = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setBiz_uin(int i17) {
            this.biz_uin = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setBiz_username(java.lang.String str) {
            this.biz_username = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setFriendFollowCount(int i17) {
            this.friend_follow_count = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setFriend_follow_count(int i17) {
            this.friend_follow_count = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setHeadImgUrl(java.lang.String str) {
            this.head_img_url = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo setHead_img_url(java.lang.String str) {
            this.head_img_url = str;
            return this;
        }

        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.FinderBizInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderBizInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderBizInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderBizInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderBizInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo addAllElementInfo(java.util.Collection<com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo> collection) {
        this.info.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo addAllElementMiniapps(java.util.Collection<com.tencent.wechat.aff.newlife.FinderMiniAppInfo> collection) {
        this.miniapps.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo addElementInfo(com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo bizInfo) {
        this.info.add(bizInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo addElementMiniapps(com.tencent.wechat.aff.newlife.FinderMiniAppInfo finderMiniAppInfo) {
        this.miniapps.add(finderMiniAppInfo);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderBizInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderBizInfo finderBizInfo = (com.tencent.wechat.aff.newlife.FinderBizInfo) fVar;
        return n51.f.a(this.info, finderBizInfo.info) && n51.f.a(this.miniapps, finderBizInfo.miniapps);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo> getInfo() {
        return this.info;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMiniAppInfo> getMiniapps() {
        return this.miniapps;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderBizInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.info);
            fVar.g(2, 8, this.miniapps);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.info) + 0 + b36.f.g(2, 8, this.miniapps);
        }
        if (i17 == 2) {
            this.info.clear();
            this.miniapps.clear();
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
                com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo bizInfo = new com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo();
                if (bArr != null && bArr.length > 0) {
                    bizInfo.parseFrom(bArr);
                }
                this.info.add(bizInfo);
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.newlife.FinderMiniAppInfo finderMiniAppInfo = new com.tencent.wechat.aff.newlife.FinderMiniAppInfo();
            if (bArr2 != null && bArr2.length > 0) {
                finderMiniAppInfo.parseFrom(bArr2);
            }
            this.miniapps.add(finderMiniAppInfo);
        }
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo setInfo(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderBizInfo.BizInfo> linkedList) {
        this.info = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo setMiniapps(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderMiniAppInfo> linkedList) {
        this.miniapps = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderBizInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderBizInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderBizInfo) super.parseFrom(bArr);
    }
}
