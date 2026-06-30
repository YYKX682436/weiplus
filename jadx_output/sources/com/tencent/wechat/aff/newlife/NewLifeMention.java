package com.tencent.wechat.aff.newlife;

/* loaded from: classes10.dex */
public class NewLifeMention extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.NewLifeMention DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeMention();
    public java.lang.String head_url = "";
    public java.lang.String nickname = "";
    public int mention_type = 0;
    public java.lang.String mention_content = "";
    public int createtime = 0;
    public java.lang.String thumb_url = "";
    public long mention_id = 0;
    public long ref_object_id = 0;
    public long ref_comment_id = 0;
    public int flag = 0;
    public int extflag = 0;
    public java.lang.String ref_content = "";
    public int media_type = 0;
    public java.lang.String description = "";
    public java.lang.String reply_nickname = "";
    public java.lang.String reply_username = "";
    public java.lang.String ref_object_nonce_id = "";
    public java.lang.String username = "";
    public com.tencent.wechat.aff.newlife.FinderMentionContact contact = com.tencent.wechat.aff.newlife.FinderMentionContact.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderMentionContact reply_contact = com.tencent.wechat.aff.newlife.FinderMentionContact.getDefaultInstance();
    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderContact> aggregated_contact_list = new java.util.LinkedList<>();
    public int aggregated_count = 0;
    public int follow_expire_time = 0;
    public java.lang.String client_msg_id = "";
    public long follow_id = 0;
    public int ref_object_type = 0;
    public long ref_video_object_id = 0;
    public java.lang.String ref_video_object_nonce_id = "";
    public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo like_info = com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderContact author_contact = com.tencent.wechat.aff.newlife.FinderContact.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser comment_mentioned_user = com.tencent.wechat.aff.newlife.FinderCommentMentionedUser.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo ext_info = com.tencent.wechat.aff.newlife.FinderMentionExtInfo.getDefaultInstance();
    public long svr_mention_id = 0;
    public int follow_flag = 0;
    public long ref_fav_id = 0;
    public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo thank_info = com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.getDefaultInstance();
    public java.lang.String thumb_url_token = "";
    public com.tencent.wechat.aff.newlife.FinderNotification notification = com.tencent.wechat.aff.newlife.FinderNotification.getDefaultInstance();

    /* loaded from: classes4.dex */
    public static class FinderMentionThankInfo extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo();
        public int interaction_type = 0;
        public int is_hot_like_icon = 0;
        public int is_flower_like_icon = 0;
        public int thank_icon_type = 0;
        public int has_redpackage = 0;
        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo redpackage_info = com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo.getDefaultInstance();

        /* loaded from: classes4.dex */
        public static class RedPackageInfo extends com.tencent.mm.protobuf.f {
            private static final com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo();
            public com.tencent.wechat.aff.newlife.FinderJumpInfo jump_info = com.tencent.wechat.aff.newlife.FinderJumpInfo.getDefaultInstance();

            public static com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo create() {
                return new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo();
            }

            public static com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo newBuilder() {
                return new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo();
            }

            public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo build() {
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
                return fVar != null && (fVar instanceof com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo) && n51.f.a(this.jump_info, ((com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo) fVar).jump_info);
            }

            public com.tencent.wechat.aff.newlife.FinderJumpInfo getJumpInfo() {
                return this.jump_info;
            }

            public com.tencent.wechat.aff.newlife.FinderJumpInfo getJump_info() {
                return this.jump_info;
            }

            public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
                parseFrom(fVar.getData());
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.mm.protobuf.f newInstance() {
                return new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo();
            }

            @Override // com.tencent.mm.protobuf.f
            public final int op(int i17, java.lang.Object... objArr) {
                if (i17 == 0) {
                    g36.f fVar = (g36.f) objArr[0];
                    com.tencent.wechat.aff.newlife.FinderJumpInfo finderJumpInfo = this.jump_info;
                    if (finderJumpInfo != null) {
                        fVar.i(1, finderJumpInfo.computeSize());
                        this.jump_info.writeFields(fVar);
                    }
                    return 0;
                }
                if (i17 == 1) {
                    com.tencent.wechat.aff.newlife.FinderJumpInfo finderJumpInfo2 = this.jump_info;
                    if (finderJumpInfo2 != null) {
                        return 0 + b36.f.i(1, finderJumpInfo2.computeSize());
                    }
                    return 0;
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
                if (intValue != 1) {
                    return -1;
                }
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.newlife.FinderJumpInfo finderJumpInfo3 = new com.tencent.wechat.aff.newlife.FinderJumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        finderJumpInfo3.parseFrom(bArr);
                    }
                    this.jump_info = finderJumpInfo3;
                }
                return 0;
            }

            public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo setJumpInfo(com.tencent.wechat.aff.newlife.FinderJumpInfo finderJumpInfo) {
                this.jump_info = finderJumpInfo;
                return this;
            }

            public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo setJump_info(com.tencent.wechat.aff.newlife.FinderJumpInfo finderJumpInfo) {
                this.jump_info = finderJumpInfo;
                return this;
            }

            public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo mergeFrom(byte[] bArr) {
                parseFrom(bArr);
                return this;
            }

            @Override // com.tencent.mm.protobuf.f
            public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo parseFrom(byte[] bArr) {
                return (com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo) super.parseFrom(bArr);
            }
        }

        public static com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo create() {
            return new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo();
        }

        public static com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo newBuilder() {
            return new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo();
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo finderMentionThankInfo = (com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.interaction_type), java.lang.Integer.valueOf(finderMentionThankInfo.interaction_type)) && n51.f.a(java.lang.Integer.valueOf(this.is_hot_like_icon), java.lang.Integer.valueOf(finderMentionThankInfo.is_hot_like_icon)) && n51.f.a(java.lang.Integer.valueOf(this.is_flower_like_icon), java.lang.Integer.valueOf(finderMentionThankInfo.is_flower_like_icon)) && n51.f.a(java.lang.Integer.valueOf(this.thank_icon_type), java.lang.Integer.valueOf(finderMentionThankInfo.thank_icon_type)) && n51.f.a(java.lang.Integer.valueOf(this.has_redpackage), java.lang.Integer.valueOf(finderMentionThankInfo.has_redpackage)) && n51.f.a(this.redpackage_info, finderMentionThankInfo.redpackage_info);
        }

        public int getHasRedpackage() {
            return this.has_redpackage;
        }

        public int getHas_redpackage() {
            return this.has_redpackage;
        }

        public int getInteractionType() {
            return this.interaction_type;
        }

        public int getInteraction_type() {
            return this.interaction_type;
        }

        public int getIsFlowerLikeIcon() {
            return this.is_flower_like_icon;
        }

        public int getIsHotLikeIcon() {
            return this.is_hot_like_icon;
        }

        public int getIs_flower_like_icon() {
            return this.is_flower_like_icon;
        }

        public int getIs_hot_like_icon() {
            return this.is_hot_like_icon;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo getRedpackageInfo() {
            return this.redpackage_info;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo getRedpackage_info() {
            return this.redpackage_info;
        }

        public int getThankIconType() {
            return this.thank_icon_type;
        }

        public int getThank_icon_type() {
            return this.thank_icon_type;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.interaction_type);
                fVar.e(2, this.is_hot_like_icon);
                fVar.e(3, this.is_flower_like_icon);
                fVar.e(4, this.thank_icon_type);
                fVar.e(5, this.has_redpackage);
                com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo redPackageInfo = this.redpackage_info;
                if (redPackageInfo != null) {
                    fVar.i(6, redPackageInfo.computeSize());
                    this.redpackage_info.writeFields(fVar);
                }
                return 0;
            }
            if (i17 == 1) {
                int e17 = b36.f.e(1, this.interaction_type) + 0 + b36.f.e(2, this.is_hot_like_icon) + b36.f.e(3, this.is_flower_like_icon) + b36.f.e(4, this.thank_icon_type) + b36.f.e(5, this.has_redpackage);
                com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo redPackageInfo2 = this.redpackage_info;
                return redPackageInfo2 != null ? e17 + b36.f.i(6, redPackageInfo2.computeSize()) : e17;
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
                    this.interaction_type = aVar2.g(intValue);
                    return 0;
                case 2:
                    this.is_hot_like_icon = aVar2.g(intValue);
                    return 0;
                case 3:
                    this.is_flower_like_icon = aVar2.g(intValue);
                    return 0;
                case 4:
                    this.thank_icon_type = aVar2.g(intValue);
                    return 0;
                case 5:
                    this.has_redpackage = aVar2.g(intValue);
                    return 0;
                case 6:
                    java.util.LinkedList j17 = aVar2.j(intValue);
                    int size = j17.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        byte[] bArr = (byte[]) j17.get(i18);
                        com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo redPackageInfo3 = new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo();
                        if (bArr != null && bArr.length > 0) {
                            redPackageInfo3.parseFrom(bArr);
                        }
                        this.redpackage_info = redPackageInfo3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setHasRedpackage(int i17) {
            this.has_redpackage = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setHas_redpackage(int i17) {
            this.has_redpackage = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setInteractionType(int i17) {
            this.interaction_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setInteraction_type(int i17) {
            this.interaction_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setIsFlowerLikeIcon(int i17) {
            this.is_flower_like_icon = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setIsHotLikeIcon(int i17) {
            this.is_hot_like_icon = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setIs_flower_like_icon(int i17) {
            this.is_flower_like_icon = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setIs_hot_like_icon(int i17) {
            this.is_hot_like_icon = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setRedpackageInfo(com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo redPackageInfo) {
            this.redpackage_info = redPackageInfo;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setRedpackage_info(com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo.RedPackageInfo redPackageInfo) {
            this.redpackage_info = redPackageInfo;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setThankIconType(int i17) {
            this.thank_icon_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo setThank_icon_type(int i17) {
            this.thank_icon_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo) super.parseFrom(bArr);
        }
    }

    /* loaded from: classes10.dex */
    public static class LikeContactInfo extends com.tencent.mm.protobuf.f {
        private static final com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo();
        public int like_type = 0;
        public long like_id = 0;
        public int follow_my_first_like = 0;

        /* loaded from: classes6.dex */
        public enum Type implements com.tencent.mm.protobuf.h {
            OBJECT(1),
            COMMENT(2);

            public static final int COMMENT_VALUE = 2;
            public static final int OBJECT_VALUE = 1;
            public final int value;

            Type(int i17) {
                this.value = i17;
            }

            public static com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo.Type forNumber(int i17) {
                if (i17 == 1) {
                    return OBJECT;
                }
                if (i17 != 2) {
                    return null;
                }
                return COMMENT;
            }

            @Override // com.tencent.mm.protobuf.h
            public final int getNumber() {
                return this.value;
            }

            public static com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo.Type valueOf(int i17) {
                return forNumber(i17);
            }
        }

        public static com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo create() {
            return new com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo();
        }

        public static com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo newBuilder() {
            return new com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo();
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo build() {
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
            if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo)) {
                return false;
            }
            com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo likeContactInfo = (com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo) fVar;
            return n51.f.a(java.lang.Integer.valueOf(this.like_type), java.lang.Integer.valueOf(likeContactInfo.like_type)) && n51.f.a(java.lang.Long.valueOf(this.like_id), java.lang.Long.valueOf(likeContactInfo.like_id)) && n51.f.a(java.lang.Integer.valueOf(this.follow_my_first_like), java.lang.Integer.valueOf(likeContactInfo.follow_my_first_like));
        }

        public int getFollowMyFirstLike() {
            return this.follow_my_first_like;
        }

        public int getFollow_my_first_like() {
            return this.follow_my_first_like;
        }

        public long getLikeId() {
            return this.like_id;
        }

        public int getLikeType() {
            return this.like_type;
        }

        public long getLike_id() {
            return this.like_id;
        }

        public int getLike_type() {
            return this.like_type;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
            parseFrom(fVar.getData());
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.mm.protobuf.f newInstance() {
            return new com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo();
        }

        @Override // com.tencent.mm.protobuf.f
        public final int op(int i17, java.lang.Object... objArr) {
            if (i17 == 0) {
                g36.f fVar = (g36.f) objArr[0];
                fVar.e(1, this.like_type);
                fVar.h(2, this.like_id);
                fVar.e(3, this.follow_my_first_like);
                return 0;
            }
            if (i17 == 1) {
                return b36.f.e(1, this.like_type) + 0 + b36.f.h(2, this.like_id) + b36.f.e(3, this.follow_my_first_like);
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
                this.like_type = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 2) {
                this.like_id = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.follow_my_first_like = aVar2.g(intValue);
            return 0;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo setFollowMyFirstLike(int i17) {
            this.follow_my_first_like = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo setFollow_my_first_like(int i17) {
            this.follow_my_first_like = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo setLikeId(long j17) {
            this.like_id = j17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo setLikeType(int i17) {
            this.like_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo setLike_id(long j17) {
            this.like_id = j17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo setLike_type(int i17) {
            this.like_type = i17;
            return this;
        }

        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo mergeFrom(byte[] bArr) {
            parseFrom(bArr);
            return this;
        }

        @Override // com.tencent.mm.protobuf.f
        public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo) super.parseFrom(bArr);
        }
    }

    public static com.tencent.wechat.aff.newlife.NewLifeMention create() {
        return new com.tencent.wechat.aff.newlife.NewLifeMention();
    }

    public static com.tencent.wechat.aff.newlife.NewLifeMention getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.NewLifeMention newBuilder() {
        return new com.tencent.wechat.aff.newlife.NewLifeMention();
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention addAllElementAggregatedContactList(java.util.Collection<com.tencent.wechat.aff.newlife.FinderContact> collection) {
        this.aggregated_contact_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention addAllElementAggregated_contact_list(java.util.Collection<com.tencent.wechat.aff.newlife.FinderContact> collection) {
        this.aggregated_contact_list.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention addElementAggregatedContactList(com.tencent.wechat.aff.newlife.FinderContact finderContact) {
        this.aggregated_contact_list.add(finderContact);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention addElementAggregated_contact_list(com.tencent.wechat.aff.newlife.FinderContact finderContact) {
        this.aggregated_contact_list.add(finderContact);
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.NewLifeMention)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.NewLifeMention newLifeMention = (com.tencent.wechat.aff.newlife.NewLifeMention) fVar;
        return n51.f.a(this.head_url, newLifeMention.head_url) && n51.f.a(this.nickname, newLifeMention.nickname) && n51.f.a(java.lang.Integer.valueOf(this.mention_type), java.lang.Integer.valueOf(newLifeMention.mention_type)) && n51.f.a(this.mention_content, newLifeMention.mention_content) && n51.f.a(java.lang.Integer.valueOf(this.createtime), java.lang.Integer.valueOf(newLifeMention.createtime)) && n51.f.a(this.thumb_url, newLifeMention.thumb_url) && n51.f.a(java.lang.Long.valueOf(this.mention_id), java.lang.Long.valueOf(newLifeMention.mention_id)) && n51.f.a(java.lang.Long.valueOf(this.ref_object_id), java.lang.Long.valueOf(newLifeMention.ref_object_id)) && n51.f.a(java.lang.Long.valueOf(this.ref_comment_id), java.lang.Long.valueOf(newLifeMention.ref_comment_id)) && n51.f.a(java.lang.Integer.valueOf(this.flag), java.lang.Integer.valueOf(newLifeMention.flag)) && n51.f.a(java.lang.Integer.valueOf(this.extflag), java.lang.Integer.valueOf(newLifeMention.extflag)) && n51.f.a(this.ref_content, newLifeMention.ref_content) && n51.f.a(java.lang.Integer.valueOf(this.media_type), java.lang.Integer.valueOf(newLifeMention.media_type)) && n51.f.a(this.description, newLifeMention.description) && n51.f.a(this.reply_nickname, newLifeMention.reply_nickname) && n51.f.a(this.reply_username, newLifeMention.reply_username) && n51.f.a(this.ref_object_nonce_id, newLifeMention.ref_object_nonce_id) && n51.f.a(this.username, newLifeMention.username) && n51.f.a(this.contact, newLifeMention.contact) && n51.f.a(this.reply_contact, newLifeMention.reply_contact) && n51.f.a(this.aggregated_contact_list, newLifeMention.aggregated_contact_list) && n51.f.a(java.lang.Integer.valueOf(this.aggregated_count), java.lang.Integer.valueOf(newLifeMention.aggregated_count)) && n51.f.a(java.lang.Integer.valueOf(this.follow_expire_time), java.lang.Integer.valueOf(newLifeMention.follow_expire_time)) && n51.f.a(this.client_msg_id, newLifeMention.client_msg_id) && n51.f.a(java.lang.Long.valueOf(this.follow_id), java.lang.Long.valueOf(newLifeMention.follow_id)) && n51.f.a(java.lang.Integer.valueOf(this.ref_object_type), java.lang.Integer.valueOf(newLifeMention.ref_object_type)) && n51.f.a(java.lang.Long.valueOf(this.ref_video_object_id), java.lang.Long.valueOf(newLifeMention.ref_video_object_id)) && n51.f.a(this.ref_video_object_nonce_id, newLifeMention.ref_video_object_nonce_id) && n51.f.a(this.like_info, newLifeMention.like_info) && n51.f.a(this.author_contact, newLifeMention.author_contact) && n51.f.a(this.comment_mentioned_user, newLifeMention.comment_mentioned_user) && n51.f.a(this.ext_info, newLifeMention.ext_info) && n51.f.a(java.lang.Long.valueOf(this.svr_mention_id), java.lang.Long.valueOf(newLifeMention.svr_mention_id)) && n51.f.a(java.lang.Integer.valueOf(this.follow_flag), java.lang.Integer.valueOf(newLifeMention.follow_flag)) && n51.f.a(java.lang.Long.valueOf(this.ref_fav_id), java.lang.Long.valueOf(newLifeMention.ref_fav_id)) && n51.f.a(this.thank_info, newLifeMention.thank_info) && n51.f.a(this.thumb_url_token, newLifeMention.thumb_url_token) && n51.f.a(this.notification, newLifeMention.notification);
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderContact> getAggregatedContactList() {
        return this.aggregated_contact_list;
    }

    public int getAggregatedCount() {
        return this.aggregated_count;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderContact> getAggregated_contact_list() {
        return this.aggregated_contact_list;
    }

    public int getAggregated_count() {
        return this.aggregated_count;
    }

    public com.tencent.wechat.aff.newlife.FinderContact getAuthorContact() {
        return this.author_contact;
    }

    public com.tencent.wechat.aff.newlife.FinderContact getAuthor_contact() {
        return this.author_contact;
    }

    public java.lang.String getClientMsgId() {
        return this.client_msg_id;
    }

    public java.lang.String getClient_msg_id() {
        return this.client_msg_id;
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser getCommentMentionedUser() {
        return this.comment_mentioned_user;
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser getComment_mentioned_user() {
        return this.comment_mentioned_user;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact getContact() {
        return this.contact;
    }

    public int getCreatetime() {
        return this.createtime;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo getExtInfo() {
        return this.ext_info;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionExtInfo getExt_info() {
        return this.ext_info;
    }

    public int getExtflag() {
        return this.extflag;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getFollowExpireTime() {
        return this.follow_expire_time;
    }

    public int getFollowFlag() {
        return this.follow_flag;
    }

    public long getFollowId() {
        return this.follow_id;
    }

    public int getFollow_expire_time() {
        return this.follow_expire_time;
    }

    public int getFollow_flag() {
        return this.follow_flag;
    }

    public long getFollow_id() {
        return this.follow_id;
    }

    public java.lang.String getHeadUrl() {
        return this.head_url;
    }

    public java.lang.String getHead_url() {
        return this.head_url;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo getLikeInfo() {
        return this.like_info;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo getLike_info() {
        return this.like_info;
    }

    public int getMediaType() {
        return this.media_type;
    }

    public int getMedia_type() {
        return this.media_type;
    }

    public java.lang.String getMentionContent() {
        return this.mention_content;
    }

    public long getMentionId() {
        return this.mention_id;
    }

    public int getMentionType() {
        return this.mention_type;
    }

    public java.lang.String getMention_content() {
        return this.mention_content;
    }

    public long getMention_id() {
        return this.mention_id;
    }

    public int getMention_type() {
        return this.mention_type;
    }

    public java.lang.String getNickname() {
        return this.nickname;
    }

    public com.tencent.wechat.aff.newlife.FinderNotification getNotification() {
        return this.notification;
    }

    public long getRefCommentId() {
        return this.ref_comment_id;
    }

    public java.lang.String getRefContent() {
        return this.ref_content;
    }

    public long getRefFavId() {
        return this.ref_fav_id;
    }

    public long getRefObjectId() {
        return this.ref_object_id;
    }

    public java.lang.String getRefObjectNonceId() {
        return this.ref_object_nonce_id;
    }

    public int getRefObjectType() {
        return this.ref_object_type;
    }

    public long getRefVideoObjectId() {
        return this.ref_video_object_id;
    }

    public java.lang.String getRefVideoObjectNonceId() {
        return this.ref_video_object_nonce_id;
    }

    public long getRef_comment_id() {
        return this.ref_comment_id;
    }

    public java.lang.String getRef_content() {
        return this.ref_content;
    }

    public long getRef_fav_id() {
        return this.ref_fav_id;
    }

    public long getRef_object_id() {
        return this.ref_object_id;
    }

    public java.lang.String getRef_object_nonce_id() {
        return this.ref_object_nonce_id;
    }

    public int getRef_object_type() {
        return this.ref_object_type;
    }

    public long getRef_video_object_id() {
        return this.ref_video_object_id;
    }

    public java.lang.String getRef_video_object_nonce_id() {
        return this.ref_video_object_nonce_id;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact getReplyContact() {
        return this.reply_contact;
    }

    public java.lang.String getReplyNickname() {
        return this.reply_nickname;
    }

    public java.lang.String getReplyUsername() {
        return this.reply_username;
    }

    public com.tencent.wechat.aff.newlife.FinderMentionContact getReply_contact() {
        return this.reply_contact;
    }

    public java.lang.String getReply_nickname() {
        return this.reply_nickname;
    }

    public java.lang.String getReply_username() {
        return this.reply_username;
    }

    public long getSvrMentionId() {
        return this.svr_mention_id;
    }

    public long getSvr_mention_id() {
        return this.svr_mention_id;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo getThankInfo() {
        return this.thank_info;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo getThank_info() {
        return this.thank_info;
    }

    public java.lang.String getThumbUrl() {
        return this.thumb_url;
    }

    public java.lang.String getThumbUrlToken() {
        return this.thumb_url_token;
    }

    public java.lang.String getThumb_url() {
        return this.thumb_url;
    }

    public java.lang.String getThumb_url_token() {
        return this.thumb_url_token;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.NewLifeMention();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.head_url;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.nickname;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.mention_type);
            java.lang.String str3 = this.mention_content;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.createtime);
            java.lang.String str4 = this.thumb_url;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.mention_id);
            fVar.h(8, this.ref_object_id);
            fVar.h(9, this.ref_comment_id);
            fVar.e(10, this.flag);
            fVar.e(11, this.extflag);
            java.lang.String str5 = this.ref_content;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.e(14, this.media_type);
            java.lang.String str6 = this.description;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.reply_nickname;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.reply_username;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            java.lang.String str9 = this.ref_object_nonce_id;
            if (str9 != null) {
                fVar.j(18, str9);
            }
            java.lang.String str10 = this.username;
            if (str10 != null) {
                fVar.j(19, str10);
            }
            com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact = this.contact;
            if (finderMentionContact != null) {
                fVar.i(20, finderMentionContact.computeSize());
                this.contact.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact2 = this.reply_contact;
            if (finderMentionContact2 != null) {
                fVar.i(21, finderMentionContact2.computeSize());
                this.reply_contact.writeFields(fVar);
            }
            fVar.g(23, 8, this.aggregated_contact_list);
            fVar.e(24, this.aggregated_count);
            fVar.e(25, this.follow_expire_time);
            java.lang.String str11 = this.client_msg_id;
            if (str11 != null) {
                fVar.j(26, str11);
            }
            fVar.h(27, this.follow_id);
            fVar.e(28, this.ref_object_type);
            fVar.h(29, this.ref_video_object_id);
            java.lang.String str12 = this.ref_video_object_nonce_id;
            if (str12 != null) {
                fVar.j(30, str12);
            }
            com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo likeContactInfo = this.like_info;
            if (likeContactInfo != null) {
                fVar.i(31, likeContactInfo.computeSize());
                this.like_info.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderContact finderContact = this.author_contact;
            if (finderContact != null) {
                fVar.i(32, finderContact.computeSize());
                this.author_contact.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderCommentMentionedUser finderCommentMentionedUser = this.comment_mentioned_user;
            if (finderCommentMentionedUser != null) {
                fVar.i(33, finderCommentMentionedUser.computeSize());
                this.comment_mentioned_user.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.FinderMentionExtInfo finderMentionExtInfo = this.ext_info;
            if (finderMentionExtInfo != null) {
                fVar.i(34, finderMentionExtInfo.computeSize());
                this.ext_info.writeFields(fVar);
            }
            fVar.h(35, this.svr_mention_id);
            fVar.e(36, this.follow_flag);
            fVar.h(37, this.ref_fav_id);
            com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo finderMentionThankInfo = this.thank_info;
            if (finderMentionThankInfo != null) {
                fVar.i(39, finderMentionThankInfo.computeSize());
                this.thank_info.writeFields(fVar);
            }
            java.lang.String str13 = this.thumb_url_token;
            if (str13 != null) {
                fVar.j(44, str13);
            }
            com.tencent.wechat.aff.newlife.FinderNotification finderNotification = this.notification;
            if (finderNotification != null) {
                fVar.i(45, finderNotification.computeSize());
                this.notification.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.head_url;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.nickname;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            int e17 = j17 + b36.f.e(3, this.mention_type);
            java.lang.String str16 = this.mention_content;
            if (str16 != null) {
                e17 += b36.f.j(4, str16);
            }
            int e18 = e17 + b36.f.e(5, this.createtime);
            java.lang.String str17 = this.thumb_url;
            if (str17 != null) {
                e18 += b36.f.j(6, str17);
            }
            int h17 = e18 + b36.f.h(7, this.mention_id) + b36.f.h(8, this.ref_object_id) + b36.f.h(9, this.ref_comment_id) + b36.f.e(10, this.flag) + b36.f.e(11, this.extflag);
            java.lang.String str18 = this.ref_content;
            if (str18 != null) {
                h17 += b36.f.j(12, str18);
            }
            int e19 = h17 + b36.f.e(14, this.media_type);
            java.lang.String str19 = this.description;
            if (str19 != null) {
                e19 += b36.f.j(15, str19);
            }
            java.lang.String str20 = this.reply_nickname;
            if (str20 != null) {
                e19 += b36.f.j(16, str20);
            }
            java.lang.String str21 = this.reply_username;
            if (str21 != null) {
                e19 += b36.f.j(17, str21);
            }
            java.lang.String str22 = this.ref_object_nonce_id;
            if (str22 != null) {
                e19 += b36.f.j(18, str22);
            }
            java.lang.String str23 = this.username;
            if (str23 != null) {
                e19 += b36.f.j(19, str23);
            }
            com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact3 = this.contact;
            if (finderMentionContact3 != null) {
                e19 += b36.f.i(20, finderMentionContact3.computeSize());
            }
            com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact4 = this.reply_contact;
            if (finderMentionContact4 != null) {
                e19 += b36.f.i(21, finderMentionContact4.computeSize());
            }
            int g17 = e19 + b36.f.g(23, 8, this.aggregated_contact_list) + b36.f.e(24, this.aggregated_count) + b36.f.e(25, this.follow_expire_time);
            java.lang.String str24 = this.client_msg_id;
            if (str24 != null) {
                g17 += b36.f.j(26, str24);
            }
            int h18 = g17 + b36.f.h(27, this.follow_id) + b36.f.e(28, this.ref_object_type) + b36.f.h(29, this.ref_video_object_id);
            java.lang.String str25 = this.ref_video_object_nonce_id;
            if (str25 != null) {
                h18 += b36.f.j(30, str25);
            }
            com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo likeContactInfo2 = this.like_info;
            if (likeContactInfo2 != null) {
                h18 += b36.f.i(31, likeContactInfo2.computeSize());
            }
            com.tencent.wechat.aff.newlife.FinderContact finderContact2 = this.author_contact;
            if (finderContact2 != null) {
                h18 += b36.f.i(32, finderContact2.computeSize());
            }
            com.tencent.wechat.aff.newlife.FinderCommentMentionedUser finderCommentMentionedUser2 = this.comment_mentioned_user;
            if (finderCommentMentionedUser2 != null) {
                h18 += b36.f.i(33, finderCommentMentionedUser2.computeSize());
            }
            com.tencent.wechat.aff.newlife.FinderMentionExtInfo finderMentionExtInfo2 = this.ext_info;
            if (finderMentionExtInfo2 != null) {
                h18 += b36.f.i(34, finderMentionExtInfo2.computeSize());
            }
            int h19 = h18 + b36.f.h(35, this.svr_mention_id) + b36.f.e(36, this.follow_flag) + b36.f.h(37, this.ref_fav_id);
            com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo finderMentionThankInfo2 = this.thank_info;
            if (finderMentionThankInfo2 != null) {
                h19 += b36.f.i(39, finderMentionThankInfo2.computeSize());
            }
            java.lang.String str26 = this.thumb_url_token;
            if (str26 != null) {
                h19 += b36.f.j(44, str26);
            }
            com.tencent.wechat.aff.newlife.FinderNotification finderNotification2 = this.notification;
            return finderNotification2 != null ? h19 + b36.f.i(45, finderNotification2.computeSize()) : h19;
        }
        if (i17 == 2) {
            this.aggregated_contact_list.clear();
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
                this.head_url = aVar2.k(intValue);
                return 0;
            case 2:
                this.nickname = aVar2.k(intValue);
                return 0;
            case 3:
                this.mention_type = aVar2.g(intValue);
                return 0;
            case 4:
                this.mention_content = aVar2.k(intValue);
                return 0;
            case 5:
                this.createtime = aVar2.g(intValue);
                return 0;
            case 6:
                this.thumb_url = aVar2.k(intValue);
                return 0;
            case 7:
                this.mention_id = aVar2.i(intValue);
                return 0;
            case 8:
                this.ref_object_id = aVar2.i(intValue);
                return 0;
            case 9:
                this.ref_comment_id = aVar2.i(intValue);
                return 0;
            case 10:
                this.flag = aVar2.g(intValue);
                return 0;
            case 11:
                this.extflag = aVar2.g(intValue);
                return 0;
            case 12:
                this.ref_content = aVar2.k(intValue);
                return 0;
            case 13:
            case 22:
            case 38:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            default:
                return -1;
            case 14:
                this.media_type = aVar2.g(intValue);
                return 0;
            case 15:
                this.description = aVar2.k(intValue);
                return 0;
            case 16:
                this.reply_nickname = aVar2.k(intValue);
                return 0;
            case 17:
                this.reply_username = aVar2.k(intValue);
                return 0;
            case 18:
                this.ref_object_nonce_id = aVar2.k(intValue);
                return 0;
            case 19:
                this.username = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact5 = new com.tencent.wechat.aff.newlife.FinderMentionContact();
                    if (bArr != null && bArr.length > 0) {
                        finderMentionContact5.parseFrom(bArr);
                    }
                    this.contact = finderMentionContact5;
                }
                return 0;
            case 21:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact6 = new com.tencent.wechat.aff.newlife.FinderMentionContact();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderMentionContact6.parseFrom(bArr2);
                    }
                    this.reply_contact = finderMentionContact6;
                }
                return 0;
            case 23:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.tencent.wechat.aff.newlife.FinderContact finderContact3 = new com.tencent.wechat.aff.newlife.FinderContact();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderContact3.parseFrom(bArr3);
                    }
                    this.aggregated_contact_list.add(finderContact3);
                }
                return 0;
            case 24:
                this.aggregated_count = aVar2.g(intValue);
                return 0;
            case 25:
                this.follow_expire_time = aVar2.g(intValue);
                return 0;
            case 26:
                this.client_msg_id = aVar2.k(intValue);
                return 0;
            case 27:
                this.follow_id = aVar2.i(intValue);
                return 0;
            case 28:
                this.ref_object_type = aVar2.g(intValue);
                return 0;
            case 29:
                this.ref_video_object_id = aVar2.i(intValue);
                return 0;
            case 30:
                this.ref_video_object_nonce_id = aVar2.k(intValue);
                return 0;
            case 31:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo likeContactInfo3 = new com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        likeContactInfo3.parseFrom(bArr4);
                    }
                    this.like_info = likeContactInfo3;
                }
                return 0;
            case 32:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    com.tencent.wechat.aff.newlife.FinderContact finderContact4 = new com.tencent.wechat.aff.newlife.FinderContact();
                    if (bArr5 != null && bArr5.length > 0) {
                        finderContact4.parseFrom(bArr5);
                    }
                    this.author_contact = finderContact4;
                }
                return 0;
            case 33:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    com.tencent.wechat.aff.newlife.FinderCommentMentionedUser finderCommentMentionedUser3 = new com.tencent.wechat.aff.newlife.FinderCommentMentionedUser();
                    if (bArr6 != null && bArr6.length > 0) {
                        finderCommentMentionedUser3.parseFrom(bArr6);
                    }
                    this.comment_mentioned_user = finderCommentMentionedUser3;
                }
                return 0;
            case 34:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j38.get(i38);
                    com.tencent.wechat.aff.newlife.FinderMentionExtInfo finderMentionExtInfo3 = new com.tencent.wechat.aff.newlife.FinderMentionExtInfo();
                    if (bArr7 != null && bArr7.length > 0) {
                        finderMentionExtInfo3.parseFrom(bArr7);
                    }
                    this.ext_info = finderMentionExtInfo3;
                }
                return 0;
            case 35:
                this.svr_mention_id = aVar2.i(intValue);
                return 0;
            case 36:
                this.follow_flag = aVar2.g(intValue);
                return 0;
            case 37:
                this.ref_fav_id = aVar2.i(intValue);
                return 0;
            case 39:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size8 = j39.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j39.get(i39);
                    com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo finderMentionThankInfo3 = new com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo();
                    if (bArr8 != null && bArr8.length > 0) {
                        finderMentionThankInfo3.parseFrom(bArr8);
                    }
                    this.thank_info = finderMentionThankInfo3;
                }
                return 0;
            case 44:
                this.thumb_url_token = aVar2.k(intValue);
                return 0;
            case 45:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size9 = j47.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j47.get(i47);
                    com.tencent.wechat.aff.newlife.FinderNotification finderNotification3 = new com.tencent.wechat.aff.newlife.FinderNotification();
                    if (bArr9 != null && bArr9.length > 0) {
                        finderNotification3.parseFrom(bArr9);
                    }
                    this.notification = finderNotification3;
                }
                return 0;
        }
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setAggregatedContactList(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderContact> linkedList) {
        this.aggregated_contact_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setAggregatedCount(int i17) {
        this.aggregated_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setAggregated_contact_list(java.util.LinkedList<com.tencent.wechat.aff.newlife.FinderContact> linkedList) {
        this.aggregated_contact_list = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setAggregated_count(int i17) {
        this.aggregated_count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setAuthorContact(com.tencent.wechat.aff.newlife.FinderContact finderContact) {
        this.author_contact = finderContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setAuthor_contact(com.tencent.wechat.aff.newlife.FinderContact finderContact) {
        this.author_contact = finderContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setClientMsgId(java.lang.String str) {
        this.client_msg_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setClient_msg_id(java.lang.String str) {
        this.client_msg_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setCommentMentionedUser(com.tencent.wechat.aff.newlife.FinderCommentMentionedUser finderCommentMentionedUser) {
        this.comment_mentioned_user = finderCommentMentionedUser;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setComment_mentioned_user(com.tencent.wechat.aff.newlife.FinderCommentMentionedUser finderCommentMentionedUser) {
        this.comment_mentioned_user = finderCommentMentionedUser;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setContact(com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact) {
        this.contact = finderMentionContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setCreatetime(int i17) {
        this.createtime = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setDescription(java.lang.String str) {
        this.description = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setExtInfo(com.tencent.wechat.aff.newlife.FinderMentionExtInfo finderMentionExtInfo) {
        this.ext_info = finderMentionExtInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setExt_info(com.tencent.wechat.aff.newlife.FinderMentionExtInfo finderMentionExtInfo) {
        this.ext_info = finderMentionExtInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setExtflag(int i17) {
        this.extflag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setFlag(int i17) {
        this.flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setFollowExpireTime(int i17) {
        this.follow_expire_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setFollowFlag(int i17) {
        this.follow_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setFollowId(long j17) {
        this.follow_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setFollow_expire_time(int i17) {
        this.follow_expire_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setFollow_flag(int i17) {
        this.follow_flag = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setFollow_id(long j17) {
        this.follow_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setHeadUrl(java.lang.String str) {
        this.head_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setHead_url(java.lang.String str) {
        this.head_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setLikeInfo(com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo likeContactInfo) {
        this.like_info = likeContactInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setLike_info(com.tencent.wechat.aff.newlife.NewLifeMention.LikeContactInfo likeContactInfo) {
        this.like_info = likeContactInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMediaType(int i17) {
        this.media_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMedia_type(int i17) {
        this.media_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMentionContent(java.lang.String str) {
        this.mention_content = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMentionId(long j17) {
        this.mention_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMentionType(int i17) {
        this.mention_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMention_content(java.lang.String str) {
        this.mention_content = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMention_id(long j17) {
        this.mention_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setMention_type(int i17) {
        this.mention_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setNickname(java.lang.String str) {
        this.nickname = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setNotification(com.tencent.wechat.aff.newlife.FinderNotification finderNotification) {
        this.notification = finderNotification;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefCommentId(long j17) {
        this.ref_comment_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefContent(java.lang.String str) {
        this.ref_content = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefFavId(long j17) {
        this.ref_fav_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefObjectId(long j17) {
        this.ref_object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefObjectNonceId(java.lang.String str) {
        this.ref_object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefObjectType(int i17) {
        this.ref_object_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefVideoObjectId(long j17) {
        this.ref_video_object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRefVideoObjectNonceId(java.lang.String str) {
        this.ref_video_object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_comment_id(long j17) {
        this.ref_comment_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_content(java.lang.String str) {
        this.ref_content = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_fav_id(long j17) {
        this.ref_fav_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_object_id(long j17) {
        this.ref_object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_object_nonce_id(java.lang.String str) {
        this.ref_object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_object_type(int i17) {
        this.ref_object_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_video_object_id(long j17) {
        this.ref_video_object_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setRef_video_object_nonce_id(java.lang.String str) {
        this.ref_video_object_nonce_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setReplyContact(com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact) {
        this.reply_contact = finderMentionContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setReplyNickname(java.lang.String str) {
        this.reply_nickname = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setReplyUsername(java.lang.String str) {
        this.reply_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setReply_contact(com.tencent.wechat.aff.newlife.FinderMentionContact finderMentionContact) {
        this.reply_contact = finderMentionContact;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setReply_nickname(java.lang.String str) {
        this.reply_nickname = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setReply_username(java.lang.String str) {
        this.reply_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setSvrMentionId(long j17) {
        this.svr_mention_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setSvr_mention_id(long j17) {
        this.svr_mention_id = j17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setThankInfo(com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo finderMentionThankInfo) {
        this.thank_info = finderMentionThankInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setThank_info(com.tencent.wechat.aff.newlife.NewLifeMention.FinderMentionThankInfo finderMentionThankInfo) {
        this.thank_info = finderMentionThankInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setThumbUrl(java.lang.String str) {
        this.thumb_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setThumbUrlToken(java.lang.String str) {
        this.thumb_url_token = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setThumb_url(java.lang.String str) {
        this.thumb_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setThumb_url_token(java.lang.String str) {
        this.thumb_url_token = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.NewLifeMention mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.NewLifeMention parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.NewLifeMention) super.parseFrom(bArr);
    }
}
