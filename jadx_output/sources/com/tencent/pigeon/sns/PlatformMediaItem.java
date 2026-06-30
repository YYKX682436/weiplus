package com.tencent.pigeon.sns;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0001EB\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0014HÆ\u0003J\t\u00103\u001a\u00020\u0014HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u00ad\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010CJ\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006F"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformMediaItem;", "", "type", "Lcom/tencent/pigeon/sns/PlatformMediaType;", "originPath", "", "thumbPath", "thumbSize", "Lcom/tencent/pigeon/sns/PlatformMediaSize;", "originSize", "lpVideoPath", "lpVideoSize", "lpVideoThumbPath", "lpVideoThumbSize", "lpStillImageTimeMs", "", "mediaId", "durationMs", "translateImgPath", "isLivePhoto", "", "isLivePhotoOpt", "imageScaleInfo", "Lcom/tencent/pigeon/sns/PlatformImageScaleInfo;", "(Lcom/tencent/pigeon/sns/PlatformMediaType;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/pigeon/sns/PlatformMediaSize;Lcom/tencent/pigeon/sns/PlatformMediaSize;Ljava/lang/String;Lcom/tencent/pigeon/sns/PlatformMediaSize;Ljava/lang/String;Lcom/tencent/pigeon/sns/PlatformMediaSize;JLjava/lang/String;JLjava/lang/String;ZZLcom/tencent/pigeon/sns/PlatformImageScaleInfo;)V", "getDurationMs", "()J", "getImageScaleInfo", "()Lcom/tencent/pigeon/sns/PlatformImageScaleInfo;", "()Z", "getLpStillImageTimeMs", "getLpVideoPath", "()Ljava/lang/String;", "getLpVideoSize", "()Lcom/tencent/pigeon/sns/PlatformMediaSize;", "getLpVideoThumbPath", "getLpVideoThumbSize", "getMediaId", "getOriginPath", "getOriginSize", "getThumbPath", "getThumbSize", "getTranslateImgPath", "getType", "()Lcom/tencent/pigeon/sns/PlatformMediaType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlatformMediaItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.sns.PlatformMediaItem.Companion INSTANCE = new com.tencent.pigeon.sns.PlatformMediaItem.Companion(null);
    private final long durationMs;
    private final com.tencent.pigeon.sns.PlatformImageScaleInfo imageScaleInfo;
    private final boolean isLivePhoto;
    private final boolean isLivePhotoOpt;
    private final long lpStillImageTimeMs;
    private final java.lang.String lpVideoPath;
    private final com.tencent.pigeon.sns.PlatformMediaSize lpVideoSize;
    private final java.lang.String lpVideoThumbPath;
    private final com.tencent.pigeon.sns.PlatformMediaSize lpVideoThumbSize;
    private final java.lang.String mediaId;
    private final java.lang.String originPath;
    private final com.tencent.pigeon.sns.PlatformMediaSize originSize;
    private final java.lang.String thumbPath;
    private final com.tencent.pigeon.sns.PlatformMediaSize thumbSize;
    private final java.lang.String translateImgPath;
    private final com.tencent.pigeon.sns.PlatformMediaType type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformMediaItem$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/sns/PlatformMediaItem;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.sns.PlatformMediaItem fromList(java.util.List<? extends java.lang.Object> list) {
            java.lang.String str;
            long longValue;
            long longValue2;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Integer num = (java.lang.Integer) list.get(0);
            com.tencent.pigeon.sns.PlatformMediaType ofRaw = num != null ? com.tencent.pigeon.sns.PlatformMediaType.INSTANCE.ofRaw(num.intValue()) : null;
            java.lang.Object obj = list.get(1);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(2);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str3 = (java.lang.String) obj2;
            com.tencent.pigeon.sns.PlatformMediaSize.Companion companion = com.tencent.pigeon.sns.PlatformMediaSize.INSTANCE;
            java.lang.Object obj3 = list.get(3);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            com.tencent.pigeon.sns.PlatformMediaSize fromList = companion.fromList((java.util.List) obj3);
            java.lang.Object obj4 = list.get(4);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            com.tencent.pigeon.sns.PlatformMediaSize fromList2 = companion.fromList((java.util.List) obj4);
            java.lang.Object obj5 = list.get(5);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str4 = (java.lang.String) obj5;
            java.lang.Object obj6 = list.get(6);
            kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            com.tencent.pigeon.sns.PlatformMediaSize fromList3 = companion.fromList((java.util.List) obj6);
            java.lang.Object obj7 = list.get(7);
            kotlin.jvm.internal.o.e(obj7, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str5 = (java.lang.String) obj7;
            java.lang.Object obj8 = list.get(8);
            kotlin.jvm.internal.o.e(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            com.tencent.pigeon.sns.PlatformMediaSize fromList4 = companion.fromList((java.util.List) obj8);
            java.lang.Object obj9 = list.get(9);
            if (obj9 instanceof java.lang.Integer) {
                str = "null cannot be cast to non-null type kotlin.String";
                longValue = ((java.lang.Number) obj9).intValue();
            } else {
                str = "null cannot be cast to non-null type kotlin.String";
                kotlin.jvm.internal.o.e(obj9, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj9).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj10 = list.get(10);
            java.lang.String str6 = str;
            kotlin.jvm.internal.o.e(obj10, str6);
            java.lang.String str7 = (java.lang.String) obj10;
            java.lang.Object obj11 = list.get(11);
            if (obj11 instanceof java.lang.Integer) {
                longValue2 = ((java.lang.Number) obj11).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj11, "null cannot be cast to non-null type kotlin.Long");
                longValue2 = ((java.lang.Long) obj11).longValue();
            }
            long j18 = longValue2;
            java.lang.Object obj12 = list.get(12);
            kotlin.jvm.internal.o.e(obj12, str6);
            java.lang.String str8 = (java.lang.String) obj12;
            java.lang.Object obj13 = list.get(13);
            kotlin.jvm.internal.o.e(obj13, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj13).booleanValue();
            java.lang.Object obj14 = list.get(14);
            kotlin.jvm.internal.o.e(obj14, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((java.lang.Boolean) obj14).booleanValue();
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(15);
            return new com.tencent.pigeon.sns.PlatformMediaItem(ofRaw, str2, str3, fromList, fromList2, str4, fromList3, str5, fromList4, j17, str7, j18, str8, booleanValue, booleanValue2, list2 != null ? com.tencent.pigeon.sns.PlatformImageScaleInfo.INSTANCE.fromList(list2) : null);
        }
    }

    public PlatformMediaItem(com.tencent.pigeon.sns.PlatformMediaType platformMediaType, java.lang.String originPath, java.lang.String thumbPath, com.tencent.pigeon.sns.PlatformMediaSize thumbSize, com.tencent.pigeon.sns.PlatformMediaSize originSize, java.lang.String lpVideoPath, com.tencent.pigeon.sns.PlatformMediaSize lpVideoSize, java.lang.String lpVideoThumbPath, com.tencent.pigeon.sns.PlatformMediaSize lpVideoThumbSize, long j17, java.lang.String mediaId, long j18, java.lang.String translateImgPath, boolean z17, boolean z18, com.tencent.pigeon.sns.PlatformImageScaleInfo platformImageScaleInfo) {
        kotlin.jvm.internal.o.g(originPath, "originPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(thumbSize, "thumbSize");
        kotlin.jvm.internal.o.g(originSize, "originSize");
        kotlin.jvm.internal.o.g(lpVideoPath, "lpVideoPath");
        kotlin.jvm.internal.o.g(lpVideoSize, "lpVideoSize");
        kotlin.jvm.internal.o.g(lpVideoThumbPath, "lpVideoThumbPath");
        kotlin.jvm.internal.o.g(lpVideoThumbSize, "lpVideoThumbSize");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(translateImgPath, "translateImgPath");
        this.type = platformMediaType;
        this.originPath = originPath;
        this.thumbPath = thumbPath;
        this.thumbSize = thumbSize;
        this.originSize = originSize;
        this.lpVideoPath = lpVideoPath;
        this.lpVideoSize = lpVideoSize;
        this.lpVideoThumbPath = lpVideoThumbPath;
        this.lpVideoThumbSize = lpVideoThumbSize;
        this.lpStillImageTimeMs = j17;
        this.mediaId = mediaId;
        this.durationMs = j18;
        this.translateImgPath = translateImgPath;
        this.isLivePhoto = z17;
        this.isLivePhotoOpt = z18;
        this.imageScaleInfo = platformImageScaleInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.sns.PlatformMediaType getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final long getLpStillImageTimeMs() {
        return this.lpStillImageTimeMs;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component12, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getTranslateImgPath() {
        return this.translateImgPath;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsLivePhoto() {
        return this.isLivePhoto;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsLivePhotoOpt() {
        return this.isLivePhotoOpt;
    }

    /* renamed from: component16, reason: from getter */
    public final com.tencent.pigeon.sns.PlatformImageScaleInfo getImageScaleInfo() {
        return this.imageScaleInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOriginPath() {
        return this.originPath;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getThumbPath() {
        return this.thumbPath;
    }

    /* renamed from: component4, reason: from getter */
    public final com.tencent.pigeon.sns.PlatformMediaSize getThumbSize() {
        return this.thumbSize;
    }

    /* renamed from: component5, reason: from getter */
    public final com.tencent.pigeon.sns.PlatformMediaSize getOriginSize() {
        return this.originSize;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getLpVideoPath() {
        return this.lpVideoPath;
    }

    /* renamed from: component7, reason: from getter */
    public final com.tencent.pigeon.sns.PlatformMediaSize getLpVideoSize() {
        return this.lpVideoSize;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getLpVideoThumbPath() {
        return this.lpVideoThumbPath;
    }

    /* renamed from: component9, reason: from getter */
    public final com.tencent.pigeon.sns.PlatformMediaSize getLpVideoThumbSize() {
        return this.lpVideoThumbSize;
    }

    public final com.tencent.pigeon.sns.PlatformMediaItem copy(com.tencent.pigeon.sns.PlatformMediaType type, java.lang.String originPath, java.lang.String thumbPath, com.tencent.pigeon.sns.PlatformMediaSize thumbSize, com.tencent.pigeon.sns.PlatformMediaSize originSize, java.lang.String lpVideoPath, com.tencent.pigeon.sns.PlatformMediaSize lpVideoSize, java.lang.String lpVideoThumbPath, com.tencent.pigeon.sns.PlatformMediaSize lpVideoThumbSize, long lpStillImageTimeMs, java.lang.String mediaId, long durationMs, java.lang.String translateImgPath, boolean isLivePhoto, boolean isLivePhotoOpt, com.tencent.pigeon.sns.PlatformImageScaleInfo imageScaleInfo) {
        kotlin.jvm.internal.o.g(originPath, "originPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(thumbSize, "thumbSize");
        kotlin.jvm.internal.o.g(originSize, "originSize");
        kotlin.jvm.internal.o.g(lpVideoPath, "lpVideoPath");
        kotlin.jvm.internal.o.g(lpVideoSize, "lpVideoSize");
        kotlin.jvm.internal.o.g(lpVideoThumbPath, "lpVideoThumbPath");
        kotlin.jvm.internal.o.g(lpVideoThumbSize, "lpVideoThumbSize");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(translateImgPath, "translateImgPath");
        return new com.tencent.pigeon.sns.PlatformMediaItem(type, originPath, thumbPath, thumbSize, originSize, lpVideoPath, lpVideoSize, lpVideoThumbPath, lpVideoThumbSize, lpStillImageTimeMs, mediaId, durationMs, translateImgPath, isLivePhoto, isLivePhotoOpt, imageScaleInfo);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.sns.PlatformMediaItem)) {
            return false;
        }
        com.tencent.pigeon.sns.PlatformMediaItem platformMediaItem = (com.tencent.pigeon.sns.PlatformMediaItem) other;
        return this.type == platformMediaItem.type && kotlin.jvm.internal.o.b(this.originPath, platformMediaItem.originPath) && kotlin.jvm.internal.o.b(this.thumbPath, platformMediaItem.thumbPath) && kotlin.jvm.internal.o.b(this.thumbSize, platformMediaItem.thumbSize) && kotlin.jvm.internal.o.b(this.originSize, platformMediaItem.originSize) && kotlin.jvm.internal.o.b(this.lpVideoPath, platformMediaItem.lpVideoPath) && kotlin.jvm.internal.o.b(this.lpVideoSize, platformMediaItem.lpVideoSize) && kotlin.jvm.internal.o.b(this.lpVideoThumbPath, platformMediaItem.lpVideoThumbPath) && kotlin.jvm.internal.o.b(this.lpVideoThumbSize, platformMediaItem.lpVideoThumbSize) && this.lpStillImageTimeMs == platformMediaItem.lpStillImageTimeMs && kotlin.jvm.internal.o.b(this.mediaId, platformMediaItem.mediaId) && this.durationMs == platformMediaItem.durationMs && kotlin.jvm.internal.o.b(this.translateImgPath, platformMediaItem.translateImgPath) && this.isLivePhoto == platformMediaItem.isLivePhoto && this.isLivePhotoOpt == platformMediaItem.isLivePhotoOpt && kotlin.jvm.internal.o.b(this.imageScaleInfo, platformMediaItem.imageScaleInfo);
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final com.tencent.pigeon.sns.PlatformImageScaleInfo getImageScaleInfo() {
        return this.imageScaleInfo;
    }

    public final long getLpStillImageTimeMs() {
        return this.lpStillImageTimeMs;
    }

    public final java.lang.String getLpVideoPath() {
        return this.lpVideoPath;
    }

    public final com.tencent.pigeon.sns.PlatformMediaSize getLpVideoSize() {
        return this.lpVideoSize;
    }

    public final java.lang.String getLpVideoThumbPath() {
        return this.lpVideoThumbPath;
    }

    public final com.tencent.pigeon.sns.PlatformMediaSize getLpVideoThumbSize() {
        return this.lpVideoThumbSize;
    }

    public final java.lang.String getMediaId() {
        return this.mediaId;
    }

    public final java.lang.String getOriginPath() {
        return this.originPath;
    }

    public final com.tencent.pigeon.sns.PlatformMediaSize getOriginSize() {
        return this.originSize;
    }

    public final java.lang.String getThumbPath() {
        return this.thumbPath;
    }

    public final com.tencent.pigeon.sns.PlatformMediaSize getThumbSize() {
        return this.thumbSize;
    }

    public final java.lang.String getTranslateImgPath() {
        return this.translateImgPath;
    }

    public final com.tencent.pigeon.sns.PlatformMediaType getType() {
        return this.type;
    }

    public int hashCode() {
        com.tencent.pigeon.sns.PlatformMediaType platformMediaType = this.type;
        int hashCode = (((((((((((((((((((((((((((((platformMediaType == null ? 0 : platformMediaType.hashCode()) * 31) + this.originPath.hashCode()) * 31) + this.thumbPath.hashCode()) * 31) + this.thumbSize.hashCode()) * 31) + this.originSize.hashCode()) * 31) + this.lpVideoPath.hashCode()) * 31) + this.lpVideoSize.hashCode()) * 31) + this.lpVideoThumbPath.hashCode()) * 31) + this.lpVideoThumbSize.hashCode()) * 31) + java.lang.Long.hashCode(this.lpStillImageTimeMs)) * 31) + this.mediaId.hashCode()) * 31) + java.lang.Long.hashCode(this.durationMs)) * 31) + this.translateImgPath.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isLivePhoto)) * 31) + java.lang.Boolean.hashCode(this.isLivePhotoOpt)) * 31;
        com.tencent.pigeon.sns.PlatformImageScaleInfo platformImageScaleInfo = this.imageScaleInfo;
        return hashCode + (platformImageScaleInfo != null ? platformImageScaleInfo.hashCode() : 0);
    }

    public final boolean isLivePhoto() {
        return this.isLivePhoto;
    }

    public final boolean isLivePhotoOpt() {
        return this.isLivePhotoOpt;
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[16];
        com.tencent.pigeon.sns.PlatformMediaType platformMediaType = this.type;
        objArr[0] = platformMediaType != null ? java.lang.Integer.valueOf(platformMediaType.getRaw()) : null;
        objArr[1] = this.originPath;
        objArr[2] = this.thumbPath;
        objArr[3] = this.thumbSize.toList();
        objArr[4] = this.originSize.toList();
        objArr[5] = this.lpVideoPath;
        objArr[6] = this.lpVideoSize.toList();
        objArr[7] = this.lpVideoThumbPath;
        objArr[8] = this.lpVideoThumbSize.toList();
        objArr[9] = java.lang.Long.valueOf(this.lpStillImageTimeMs);
        objArr[10] = this.mediaId;
        objArr[11] = java.lang.Long.valueOf(this.durationMs);
        objArr[12] = this.translateImgPath;
        objArr[13] = java.lang.Boolean.valueOf(this.isLivePhoto);
        objArr[14] = java.lang.Boolean.valueOf(this.isLivePhotoOpt);
        com.tencent.pigeon.sns.PlatformImageScaleInfo platformImageScaleInfo = this.imageScaleInfo;
        objArr[15] = platformImageScaleInfo != null ? platformImageScaleInfo.toList() : null;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "PlatformMediaItem(type=" + this.type + ", originPath=" + this.originPath + ", thumbPath=" + this.thumbPath + ", thumbSize=" + this.thumbSize + ", originSize=" + this.originSize + ", lpVideoPath=" + this.lpVideoPath + ", lpVideoSize=" + this.lpVideoSize + ", lpVideoThumbPath=" + this.lpVideoThumbPath + ", lpVideoThumbSize=" + this.lpVideoThumbSize + ", lpStillImageTimeMs=" + this.lpStillImageTimeMs + ", mediaId=" + this.mediaId + ", durationMs=" + this.durationMs + ", translateImgPath=" + this.translateImgPath + ", isLivePhoto=" + this.isLivePhoto + ", isLivePhotoOpt=" + this.isLivePhotoOpt + ", imageScaleInfo=" + this.imageScaleInfo + ')';
    }

    public /* synthetic */ PlatformMediaItem(com.tencent.pigeon.sns.PlatformMediaType platformMediaType, java.lang.String str, java.lang.String str2, com.tencent.pigeon.sns.PlatformMediaSize platformMediaSize, com.tencent.pigeon.sns.PlatformMediaSize platformMediaSize2, java.lang.String str3, com.tencent.pigeon.sns.PlatformMediaSize platformMediaSize3, java.lang.String str4, com.tencent.pigeon.sns.PlatformMediaSize platformMediaSize4, long j17, java.lang.String str5, long j18, java.lang.String str6, boolean z17, boolean z18, com.tencent.pigeon.sns.PlatformImageScaleInfo platformImageScaleInfo, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : platformMediaType, str, str2, platformMediaSize, platformMediaSize2, str3, platformMediaSize3, str4, platformMediaSize4, j17, str5, j18, str6, z17, z18, (i17 & 32768) != 0 ? null : platformImageScaleInfo);
    }
}
