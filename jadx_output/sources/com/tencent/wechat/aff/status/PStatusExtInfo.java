package com.tencent.wechat.aff.status;

/* loaded from: classes10.dex */
public class PStatusExtInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.status.PStatusExtInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.status.PStatusExtInfo();
    public double longitude = 0.0d;
    public double latitude = 0.0d;
    public int mediaType = 0;
    public com.tencent.wechat.aff.status.PStatusTopicInfo topicInfo = com.tencent.wechat.aff.status.PStatusTopicInfo.getDefaultInstance();
    public java.lang.String mediaUrl = "";
    public java.lang.String mediaAesKey = "";
    public java.lang.String mediaThumbUrl = "";
    public java.lang.String mediaThumbAesKey = "";
    public int visibility = 0;
    public java.lang.String description = "";
    public int createTime = 0;
    public int expireTime = 0;
    public java.lang.String poiId = "";
    public java.lang.String poiName = "";
    public long option = 0;
    public int mediaWidth = 0;
    public int mediaHeight = 0;
    public java.lang.String backgroundId = "";
    public com.tencent.wechat.aff.status.PStatusEmojiInfo emojiInfo = com.tencent.wechat.aff.status.PStatusEmojiInfo.getDefaultInstance();
    public int modifyTime = 0;
    public int modifyCount = 0;
    public int serverCreateTime = 0;
    public java.lang.String referenceUsername = "";
    public java.lang.String referenceTextStatusId = "";
    public int sceneType = 0;
    public java.lang.String duplicateUsername = "";
    public java.lang.String duplicateTextStatusId = "";
    public java.lang.String brand_key_info = "";
    public long profile_seq = 0;
    public java.lang.String text = "";
    public com.tencent.wechat.aff.status.PStatusEmojiInfo emoji = com.tencent.wechat.aff.status.PStatusEmojiInfo.getDefaultInstance();
    public java.lang.String clientMsgId = "";
    public java.util.LinkedList<java.lang.Integer> blackContactLabelIds = new java.util.LinkedList<>();
    public java.lang.String city = "";
    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusMedia> medias = new java.util.LinkedList<>();
    public long media_duration_ms = 0;

    public static com.tencent.wechat.aff.status.PStatusExtInfo create() {
        return new com.tencent.wechat.aff.status.PStatusExtInfo();
    }

    public static com.tencent.wechat.aff.status.PStatusExtInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.status.PStatusExtInfo newBuilder() {
        return new com.tencent.wechat.aff.status.PStatusExtInfo();
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo addAllElementBlackContactLabelIds(java.util.Collection<java.lang.Integer> collection) {
        this.blackContactLabelIds.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo addAllElementMedias(java.util.Collection<com.tencent.wechat.aff.status.PStatusMedia> collection) {
        this.medias.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo addElementBlackContactLabelIds(int i17) {
        this.blackContactLabelIds.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo addElementMedias(com.tencent.wechat.aff.status.PStatusMedia pStatusMedia) {
        this.medias.add(pStatusMedia);
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.status.PStatusExtInfo)) {
            return false;
        }
        com.tencent.wechat.aff.status.PStatusExtInfo pStatusExtInfo = (com.tencent.wechat.aff.status.PStatusExtInfo) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.longitude), java.lang.Double.valueOf(pStatusExtInfo.longitude)) && n51.f.a(java.lang.Double.valueOf(this.latitude), java.lang.Double.valueOf(pStatusExtInfo.latitude)) && n51.f.a(java.lang.Integer.valueOf(this.mediaType), java.lang.Integer.valueOf(pStatusExtInfo.mediaType)) && n51.f.a(this.topicInfo, pStatusExtInfo.topicInfo) && n51.f.a(this.mediaUrl, pStatusExtInfo.mediaUrl) && n51.f.a(this.mediaAesKey, pStatusExtInfo.mediaAesKey) && n51.f.a(this.mediaThumbUrl, pStatusExtInfo.mediaThumbUrl) && n51.f.a(this.mediaThumbAesKey, pStatusExtInfo.mediaThumbAesKey) && n51.f.a(java.lang.Integer.valueOf(this.visibility), java.lang.Integer.valueOf(pStatusExtInfo.visibility)) && n51.f.a(this.description, pStatusExtInfo.description) && n51.f.a(java.lang.Integer.valueOf(this.createTime), java.lang.Integer.valueOf(pStatusExtInfo.createTime)) && n51.f.a(java.lang.Integer.valueOf(this.expireTime), java.lang.Integer.valueOf(pStatusExtInfo.expireTime)) && n51.f.a(this.poiId, pStatusExtInfo.poiId) && n51.f.a(this.poiName, pStatusExtInfo.poiName) && n51.f.a(java.lang.Long.valueOf(this.option), java.lang.Long.valueOf(pStatusExtInfo.option)) && n51.f.a(java.lang.Integer.valueOf(this.mediaWidth), java.lang.Integer.valueOf(pStatusExtInfo.mediaWidth)) && n51.f.a(java.lang.Integer.valueOf(this.mediaHeight), java.lang.Integer.valueOf(pStatusExtInfo.mediaHeight)) && n51.f.a(this.backgroundId, pStatusExtInfo.backgroundId) && n51.f.a(this.emojiInfo, pStatusExtInfo.emojiInfo) && n51.f.a(java.lang.Integer.valueOf(this.modifyTime), java.lang.Integer.valueOf(pStatusExtInfo.modifyTime)) && n51.f.a(java.lang.Integer.valueOf(this.modifyCount), java.lang.Integer.valueOf(pStatusExtInfo.modifyCount)) && n51.f.a(java.lang.Integer.valueOf(this.serverCreateTime), java.lang.Integer.valueOf(pStatusExtInfo.serverCreateTime)) && n51.f.a(this.referenceUsername, pStatusExtInfo.referenceUsername) && n51.f.a(this.referenceTextStatusId, pStatusExtInfo.referenceTextStatusId) && n51.f.a(java.lang.Integer.valueOf(this.sceneType), java.lang.Integer.valueOf(pStatusExtInfo.sceneType)) && n51.f.a(this.duplicateUsername, pStatusExtInfo.duplicateUsername) && n51.f.a(this.duplicateTextStatusId, pStatusExtInfo.duplicateTextStatusId) && n51.f.a(this.brand_key_info, pStatusExtInfo.brand_key_info) && n51.f.a(java.lang.Long.valueOf(this.profile_seq), java.lang.Long.valueOf(pStatusExtInfo.profile_seq)) && n51.f.a(this.text, pStatusExtInfo.text) && n51.f.a(this.emoji, pStatusExtInfo.emoji) && n51.f.a(this.clientMsgId, pStatusExtInfo.clientMsgId) && n51.f.a(this.blackContactLabelIds, pStatusExtInfo.blackContactLabelIds) && n51.f.a(this.city, pStatusExtInfo.city) && n51.f.a(this.medias, pStatusExtInfo.medias) && n51.f.a(java.lang.Long.valueOf(this.media_duration_ms), java.lang.Long.valueOf(pStatusExtInfo.media_duration_ms));
    }

    public java.lang.String getBackgroundId() {
        return this.backgroundId;
    }

    public java.util.LinkedList<java.lang.Integer> getBlackContactLabelIds() {
        return this.blackContactLabelIds;
    }

    public java.lang.String getBrandKeyInfo() {
        return this.brand_key_info;
    }

    public java.lang.String getBrand_key_info() {
        return this.brand_key_info;
    }

    public java.lang.String getCity() {
        return this.city;
    }

    public java.lang.String getClientMsgId() {
        return this.clientMsgId;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getDuplicateTextStatusId() {
        return this.duplicateTextStatusId;
    }

    public java.lang.String getDuplicateUsername() {
        return this.duplicateUsername;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo getEmoji() {
        return this.emoji;
    }

    public com.tencent.wechat.aff.status.PStatusEmojiInfo getEmojiInfo() {
        return this.emojiInfo;
    }

    public int getExpireTime() {
        return this.expireTime;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public java.lang.String getMediaAesKey() {
        return this.mediaAesKey;
    }

    public long getMediaDurationMs() {
        return this.media_duration_ms;
    }

    public int getMediaHeight() {
        return this.mediaHeight;
    }

    public java.lang.String getMediaThumbAesKey() {
        return this.mediaThumbAesKey;
    }

    public java.lang.String getMediaThumbUrl() {
        return this.mediaThumbUrl;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public java.lang.String getMediaUrl() {
        return this.mediaUrl;
    }

    public int getMediaWidth() {
        return this.mediaWidth;
    }

    public long getMedia_duration_ms() {
        return this.media_duration_ms;
    }

    public java.util.LinkedList<com.tencent.wechat.aff.status.PStatusMedia> getMedias() {
        return this.medias;
    }

    public int getModifyCount() {
        return this.modifyCount;
    }

    public int getModifyTime() {
        return this.modifyTime;
    }

    public long getOption() {
        return this.option;
    }

    public java.lang.String getPoiId() {
        return this.poiId;
    }

    public java.lang.String getPoiName() {
        return this.poiName;
    }

    public long getProfileSeq() {
        return this.profile_seq;
    }

    public long getProfile_seq() {
        return this.profile_seq;
    }

    public java.lang.String getReferenceTextStatusId() {
        return this.referenceTextStatusId;
    }

    public java.lang.String getReferenceUsername() {
        return this.referenceUsername;
    }

    public int getSceneType() {
        return this.sceneType;
    }

    public int getServerCreateTime() {
        return this.serverCreateTime;
    }

    public java.lang.String getText() {
        return this.text;
    }

    public com.tencent.wechat.aff.status.PStatusTopicInfo getTopicInfo() {
        return this.topicInfo;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.status.PStatusExtInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.longitude);
            fVar.c(2, this.latitude);
            fVar.e(3, this.mediaType);
            com.tencent.wechat.aff.status.PStatusTopicInfo pStatusTopicInfo = this.topicInfo;
            if (pStatusTopicInfo != null) {
                fVar.i(4, pStatusTopicInfo.computeSize());
                this.topicInfo.writeFields(fVar);
            }
            java.lang.String str = this.mediaUrl;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.mediaAesKey;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.mediaThumbUrl;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.mediaThumbAesKey;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.visibility);
            java.lang.String str5 = this.description;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.createTime);
            fVar.e(12, this.expireTime);
            java.lang.String str6 = this.poiId;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.poiName;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.h(15, this.option);
            fVar.e(16, this.mediaWidth);
            fVar.e(17, this.mediaHeight);
            java.lang.String str8 = this.backgroundId;
            if (str8 != null) {
                fVar.j(18, str8);
            }
            com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo = this.emojiInfo;
            if (pStatusEmojiInfo != null) {
                fVar.i(20, pStatusEmojiInfo.computeSize());
                this.emojiInfo.writeFields(fVar);
            }
            fVar.e(21, this.modifyTime);
            fVar.e(22, this.modifyCount);
            fVar.e(23, this.serverCreateTime);
            java.lang.String str9 = this.referenceUsername;
            if (str9 != null) {
                fVar.j(24, str9);
            }
            java.lang.String str10 = this.referenceTextStatusId;
            if (str10 != null) {
                fVar.j(25, str10);
            }
            fVar.e(26, this.sceneType);
            java.lang.String str11 = this.duplicateUsername;
            if (str11 != null) {
                fVar.j(27, str11);
            }
            java.lang.String str12 = this.duplicateTextStatusId;
            if (str12 != null) {
                fVar.j(28, str12);
            }
            java.lang.String str13 = this.brand_key_info;
            if (str13 != null) {
                fVar.j(29, str13);
            }
            fVar.h(30, this.profile_seq);
            java.lang.String str14 = this.text;
            if (str14 != null) {
                fVar.j(31, str14);
            }
            com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo2 = this.emoji;
            if (pStatusEmojiInfo2 != null) {
                fVar.i(32, pStatusEmojiInfo2.computeSize());
                this.emoji.writeFields(fVar);
            }
            java.lang.String str15 = this.clientMsgId;
            if (str15 != null) {
                fVar.j(33, str15);
            }
            fVar.g(34, 2, this.blackContactLabelIds);
            java.lang.String str16 = this.city;
            if (str16 != null) {
                fVar.j(38, str16);
            }
            fVar.g(39, 8, this.medias);
            fVar.h(40, this.media_duration_ms);
            return 0;
        }
        if (i17 == 1) {
            int c17 = b36.f.c(1, this.longitude) + 0 + b36.f.c(2, this.latitude) + b36.f.e(3, this.mediaType);
            com.tencent.wechat.aff.status.PStatusTopicInfo pStatusTopicInfo2 = this.topicInfo;
            if (pStatusTopicInfo2 != null) {
                c17 += b36.f.i(4, pStatusTopicInfo2.computeSize());
            }
            java.lang.String str17 = this.mediaUrl;
            if (str17 != null) {
                c17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.mediaAesKey;
            if (str18 != null) {
                c17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.mediaThumbUrl;
            if (str19 != null) {
                c17 += b36.f.j(7, str19);
            }
            java.lang.String str20 = this.mediaThumbAesKey;
            if (str20 != null) {
                c17 += b36.f.j(8, str20);
            }
            int e17 = c17 + b36.f.e(9, this.visibility);
            java.lang.String str21 = this.description;
            if (str21 != null) {
                e17 += b36.f.j(10, str21);
            }
            int e18 = e17 + b36.f.e(11, this.createTime) + b36.f.e(12, this.expireTime);
            java.lang.String str22 = this.poiId;
            if (str22 != null) {
                e18 += b36.f.j(13, str22);
            }
            java.lang.String str23 = this.poiName;
            if (str23 != null) {
                e18 += b36.f.j(14, str23);
            }
            int h17 = e18 + b36.f.h(15, this.option) + b36.f.e(16, this.mediaWidth) + b36.f.e(17, this.mediaHeight);
            java.lang.String str24 = this.backgroundId;
            if (str24 != null) {
                h17 += b36.f.j(18, str24);
            }
            com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo3 = this.emojiInfo;
            if (pStatusEmojiInfo3 != null) {
                h17 += b36.f.i(20, pStatusEmojiInfo3.computeSize());
            }
            int e19 = h17 + b36.f.e(21, this.modifyTime) + b36.f.e(22, this.modifyCount) + b36.f.e(23, this.serverCreateTime);
            java.lang.String str25 = this.referenceUsername;
            if (str25 != null) {
                e19 += b36.f.j(24, str25);
            }
            java.lang.String str26 = this.referenceTextStatusId;
            if (str26 != null) {
                e19 += b36.f.j(25, str26);
            }
            int e27 = e19 + b36.f.e(26, this.sceneType);
            java.lang.String str27 = this.duplicateUsername;
            if (str27 != null) {
                e27 += b36.f.j(27, str27);
            }
            java.lang.String str28 = this.duplicateTextStatusId;
            if (str28 != null) {
                e27 += b36.f.j(28, str28);
            }
            java.lang.String str29 = this.brand_key_info;
            if (str29 != null) {
                e27 += b36.f.j(29, str29);
            }
            int h18 = e27 + b36.f.h(30, this.profile_seq);
            java.lang.String str30 = this.text;
            if (str30 != null) {
                h18 += b36.f.j(31, str30);
            }
            com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo4 = this.emoji;
            if (pStatusEmojiInfo4 != null) {
                h18 += b36.f.i(32, pStatusEmojiInfo4.computeSize());
            }
            java.lang.String str31 = this.clientMsgId;
            if (str31 != null) {
                h18 += b36.f.j(33, str31);
            }
            int g17 = h18 + b36.f.g(34, 2, this.blackContactLabelIds);
            java.lang.String str32 = this.city;
            if (str32 != null) {
                g17 += b36.f.j(38, str32);
            }
            return g17 + b36.f.g(39, 8, this.medias) + b36.f.h(40, this.media_duration_ms);
        }
        if (i17 == 2) {
            this.blackContactLabelIds.clear();
            this.medias.clear();
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
                this.longitude = aVar2.e(intValue);
                return 0;
            case 2:
                this.latitude = aVar2.e(intValue);
                return 0;
            case 3:
                this.mediaType = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.status.PStatusTopicInfo pStatusTopicInfo3 = new com.tencent.wechat.aff.status.PStatusTopicInfo();
                    if (bArr != null && bArr.length > 0) {
                        pStatusTopicInfo3.parseFrom(bArr);
                    }
                    this.topicInfo = pStatusTopicInfo3;
                }
                return 0;
            case 5:
                this.mediaUrl = aVar2.k(intValue);
                return 0;
            case 6:
                this.mediaAesKey = aVar2.k(intValue);
                return 0;
            case 7:
                this.mediaThumbUrl = aVar2.k(intValue);
                return 0;
            case 8:
                this.mediaThumbAesKey = aVar2.k(intValue);
                return 0;
            case 9:
                this.visibility = aVar2.g(intValue);
                return 0;
            case 10:
                this.description = aVar2.k(intValue);
                return 0;
            case 11:
                this.createTime = aVar2.g(intValue);
                return 0;
            case 12:
                this.expireTime = aVar2.g(intValue);
                return 0;
            case 13:
                this.poiId = aVar2.k(intValue);
                return 0;
            case 14:
                this.poiName = aVar2.k(intValue);
                return 0;
            case 15:
                this.option = aVar2.i(intValue);
                return 0;
            case 16:
                this.mediaWidth = aVar2.g(intValue);
                return 0;
            case 17:
                this.mediaHeight = aVar2.g(intValue);
                return 0;
            case 18:
                this.backgroundId = aVar2.k(intValue);
                return 0;
            case 19:
            case 35:
            case 36:
            case 37:
            default:
                return -1;
            case 20:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo5 = new com.tencent.wechat.aff.status.PStatusEmojiInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        pStatusEmojiInfo5.parseFrom(bArr2);
                    }
                    this.emojiInfo = pStatusEmojiInfo5;
                }
                return 0;
            case 21:
                this.modifyTime = aVar2.g(intValue);
                return 0;
            case 22:
                this.modifyCount = aVar2.g(intValue);
                return 0;
            case 23:
                this.serverCreateTime = aVar2.g(intValue);
                return 0;
            case 24:
                this.referenceUsername = aVar2.k(intValue);
                return 0;
            case 25:
                this.referenceTextStatusId = aVar2.k(intValue);
                return 0;
            case 26:
                this.sceneType = aVar2.g(intValue);
                return 0;
            case 27:
                this.duplicateUsername = aVar2.k(intValue);
                return 0;
            case 28:
                this.duplicateTextStatusId = aVar2.k(intValue);
                return 0;
            case 29:
                this.brand_key_info = aVar2.k(intValue);
                return 0;
            case 30:
                this.profile_seq = aVar2.i(intValue);
                return 0;
            case 31:
                this.text = aVar2.k(intValue);
                return 0;
            case 32:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo6 = new com.tencent.wechat.aff.status.PStatusEmojiInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        pStatusEmojiInfo6.parseFrom(bArr3);
                    }
                    this.emoji = pStatusEmojiInfo6;
                }
                return 0;
            case 33:
                this.clientMsgId = aVar2.k(intValue);
                return 0;
            case 34:
                this.blackContactLabelIds.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 38:
                this.city = aVar2.k(intValue);
                return 0;
            case 39:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.tencent.wechat.aff.status.PStatusMedia pStatusMedia = new com.tencent.wechat.aff.status.PStatusMedia();
                    if (bArr4 != null && bArr4.length > 0) {
                        pStatusMedia.parseFrom(bArr4);
                    }
                    this.medias.add(pStatusMedia);
                }
                return 0;
            case 40:
                this.media_duration_ms = aVar2.i(intValue);
                return 0;
        }
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setBackgroundId(java.lang.String str) {
        this.backgroundId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setBlackContactLabelIds(java.util.LinkedList<java.lang.Integer> linkedList) {
        this.blackContactLabelIds = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setBrandKeyInfo(java.lang.String str) {
        this.brand_key_info = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setBrand_key_info(java.lang.String str) {
        this.brand_key_info = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setCity(java.lang.String str) {
        this.city = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setClientMsgId(java.lang.String str) {
        this.clientMsgId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setCreateTime(int i17) {
        this.createTime = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setDescription(java.lang.String str) {
        this.description = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setDuplicateTextStatusId(java.lang.String str) {
        this.duplicateTextStatusId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setDuplicateUsername(java.lang.String str) {
        this.duplicateUsername = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setEmoji(com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo) {
        this.emoji = pStatusEmojiInfo;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setEmojiInfo(com.tencent.wechat.aff.status.PStatusEmojiInfo pStatusEmojiInfo) {
        this.emojiInfo = pStatusEmojiInfo;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setExpireTime(int i17) {
        this.expireTime = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setLatitude(double d17) {
        this.latitude = d17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setLongitude(double d17) {
        this.longitude = d17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaAesKey(java.lang.String str) {
        this.mediaAesKey = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaDurationMs(long j17) {
        this.media_duration_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaHeight(int i17) {
        this.mediaHeight = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaThumbAesKey(java.lang.String str) {
        this.mediaThumbAesKey = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaThumbUrl(java.lang.String str) {
        this.mediaThumbUrl = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaType(int i17) {
        this.mediaType = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaUrl(java.lang.String str) {
        this.mediaUrl = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMediaWidth(int i17) {
        this.mediaWidth = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMedia_duration_ms(long j17) {
        this.media_duration_ms = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setMedias(java.util.LinkedList<com.tencent.wechat.aff.status.PStatusMedia> linkedList) {
        this.medias = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setModifyCount(int i17) {
        this.modifyCount = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setModifyTime(int i17) {
        this.modifyTime = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setOption(long j17) {
        this.option = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setPoiId(java.lang.String str) {
        this.poiId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setPoiName(java.lang.String str) {
        this.poiName = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setProfileSeq(long j17) {
        this.profile_seq = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setProfile_seq(long j17) {
        this.profile_seq = j17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setReferenceTextStatusId(java.lang.String str) {
        this.referenceTextStatusId = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setReferenceUsername(java.lang.String str) {
        this.referenceUsername = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setSceneType(int i17) {
        this.sceneType = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setServerCreateTime(int i17) {
        this.serverCreateTime = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setText(java.lang.String str) {
        this.text = str;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setTopicInfo(com.tencent.wechat.aff.status.PStatusTopicInfo pStatusTopicInfo) {
        this.topicInfo = pStatusTopicInfo;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo setVisibility(int i17) {
        this.visibility = i17;
        return this;
    }

    public com.tencent.wechat.aff.status.PStatusExtInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.status.PStatusExtInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.status.PStatusExtInfo) super.parseFrom(bArr);
    }
}
