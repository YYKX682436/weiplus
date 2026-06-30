package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \\2\u00020\u0001:\u0001\\B\u0099\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJ\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010I\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010J\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J¢\u0002\u0010S\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\u00192\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\u000e\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010ZJ\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b&\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b)\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b,\u0010 R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b-\u0010 R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b.\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b/\u0010 R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b0\u0010 R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b1\u0010 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0018\u00104R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b6\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(¨\u0006]"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizFinderPigeonInfo;", "", "fromSessionIdInfo", "", "objectId", "exportId", "nonceId", "mediaType", "", "encryptUsername", "reportInfo", "alignment", "bizFromScene", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "coverImgUrl", "nickName", "headImgUrl", "finderDuration", "finderHeight", "finderWidth", "finderCoverHeight", "finderCoverWidth", "finderMediaType", "currentPlayMs", "isLandscapeVideo", "", "animatedImage", "", "animatedImageRect", "Lcom/tencent/pigeon/biz_base/BizRect;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;[BLcom/tencent/pigeon/biz_base/BizRect;)V", "getAlignment", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAnimatedImage", "()[B", "getAnimatedImageRect", "()Lcom/tencent/pigeon/biz_base/BizRect;", "getBizFromScene", "getCoverImgUrl", "()Ljava/lang/String;", "getCurrentPlayMs", "getEncryptUsername", "getExportId", "getFinderCoverHeight", "getFinderCoverWidth", "getFinderDuration", "getFinderHeight", "getFinderMediaType", "getFinderWidth", "getFromSessionIdInfo", "getHeadImgUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMediaType", "getNickName", "getNonceId", "getObjectId", "getReportInfo", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;[BLcom/tencent/pigeon/biz_base/BizRect;)Lcom/tencent/pigeon/biz_base/BizFinderPigeonInfo;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizFinderPigeonInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizFinderPigeonInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.BizFinderPigeonInfo.Companion(null);
    private final java.lang.Long alignment;
    private final byte[] animatedImage;
    private final com.tencent.pigeon.biz_base.BizRect animatedImageRect;
    private final java.lang.Long bizFromScene;
    private final java.lang.String coverImgUrl;
    private final java.lang.Long currentPlayMs;
    private final java.lang.String encryptUsername;
    private final java.lang.String exportId;
    private final java.lang.Long finderCoverHeight;
    private final java.lang.Long finderCoverWidth;
    private final java.lang.Long finderDuration;
    private final java.lang.Long finderHeight;
    private final java.lang.Long finderMediaType;
    private final java.lang.Long finderWidth;
    private final java.lang.String fromSessionIdInfo;
    private final java.lang.String headImgUrl;
    private final java.lang.Boolean isLandscapeVideo;
    private final java.lang.Long mediaType;
    private final java.lang.String nickName;
    private final java.lang.String nonceId;
    private final java.lang.String objectId;
    private final java.lang.String reportInfo;
    private final java.lang.String title;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizFinderPigeonInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/BizFinderPigeonInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.BizFinderPigeonInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.String str3 = (java.lang.String) list.get(2);
            java.lang.String str4 = (java.lang.String) list.get(3);
            java.lang.Object obj = list.get(4);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.String str5 = (java.lang.String) list.get(5);
            java.lang.String str6 = (java.lang.String) list.get(6);
            java.lang.Object obj2 = list.get(7);
            java.lang.Long valueOf2 = obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2;
            java.lang.Object obj3 = list.get(8);
            java.lang.Long valueOf3 = obj3 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj3).intValue()) : (java.lang.Long) obj3;
            java.lang.String str7 = (java.lang.String) list.get(9);
            java.lang.String str8 = (java.lang.String) list.get(10);
            java.lang.String str9 = (java.lang.String) list.get(11);
            java.lang.String str10 = (java.lang.String) list.get(12);
            java.lang.Object obj4 = list.get(13);
            java.lang.Long valueOf4 = obj4 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj4).intValue()) : (java.lang.Long) obj4;
            java.lang.Object obj5 = list.get(14);
            java.lang.Long valueOf5 = obj5 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj5).intValue()) : (java.lang.Long) obj5;
            java.lang.Object obj6 = list.get(15);
            java.lang.Long valueOf6 = obj6 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj6).intValue()) : (java.lang.Long) obj6;
            java.lang.Object obj7 = list.get(16);
            java.lang.Long valueOf7 = obj7 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj7).intValue()) : (java.lang.Long) obj7;
            java.lang.Object obj8 = list.get(17);
            java.lang.Long valueOf8 = obj8 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj8).intValue()) : (java.lang.Long) obj8;
            java.lang.Object obj9 = list.get(18);
            java.lang.Long valueOf9 = obj9 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj9).intValue()) : (java.lang.Long) obj9;
            java.lang.Object obj10 = list.get(19);
            java.lang.Long valueOf10 = obj10 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj10).intValue()) : (java.lang.Long) obj10;
            java.lang.Boolean bool = (java.lang.Boolean) list.get(20);
            byte[] bArr = (byte[]) list.get(21);
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(22);
            return new com.tencent.pigeon.biz_base.BizFinderPigeonInfo(str, str2, str3, str4, valueOf, str5, str6, valueOf2, valueOf3, str7, str8, str9, str10, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, bool, bArr, list2 != null ? com.tencent.pigeon.biz_base.BizRect.INSTANCE.fromList(list2) : null);
        }
    }

    public BizFinderPigeonInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFromSessionIdInfo() {
        return this.fromSessionIdInfo;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getCoverImgUrl() {
        return this.coverImgUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getNickName() {
        return this.nickName;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getHeadImgUrl() {
        return this.headImgUrl;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.Long getFinderDuration() {
        return this.finderDuration;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.Long getFinderHeight() {
        return this.finderHeight;
    }

    /* renamed from: component16, reason: from getter */
    public final java.lang.Long getFinderWidth() {
        return this.finderWidth;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.Long getFinderCoverHeight() {
        return this.finderCoverHeight;
    }

    /* renamed from: component18, reason: from getter */
    public final java.lang.Long getFinderCoverWidth() {
        return this.finderCoverWidth;
    }

    /* renamed from: component19, reason: from getter */
    public final java.lang.Long getFinderMediaType() {
        return this.finderMediaType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getObjectId() {
        return this.objectId;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.Long getCurrentPlayMs() {
        return this.currentPlayMs;
    }

    /* renamed from: component21, reason: from getter */
    public final java.lang.Boolean getIsLandscapeVideo() {
        return this.isLandscapeVideo;
    }

    /* renamed from: component22, reason: from getter */
    public final byte[] getAnimatedImage() {
        return this.animatedImage;
    }

    /* renamed from: component23, reason: from getter */
    public final com.tencent.pigeon.biz_base.BizRect getAnimatedImageRect() {
        return this.animatedImageRect;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExportId() {
        return this.exportId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getNonceId() {
        return this.nonceId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Long getMediaType() {
        return this.mediaType;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getEncryptUsername() {
        return this.encryptUsername;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getReportInfo() {
        return this.reportInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Long getAlignment() {
        return this.alignment;
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.Long getBizFromScene() {
        return this.bizFromScene;
    }

    public final com.tencent.pigeon.biz_base.BizFinderPigeonInfo copy(java.lang.String fromSessionIdInfo, java.lang.String objectId, java.lang.String exportId, java.lang.String nonceId, java.lang.Long mediaType, java.lang.String encryptUsername, java.lang.String reportInfo, java.lang.Long alignment, java.lang.Long bizFromScene, java.lang.String title, java.lang.String coverImgUrl, java.lang.String nickName, java.lang.String headImgUrl, java.lang.Long finderDuration, java.lang.Long finderHeight, java.lang.Long finderWidth, java.lang.Long finderCoverHeight, java.lang.Long finderCoverWidth, java.lang.Long finderMediaType, java.lang.Long currentPlayMs, java.lang.Boolean isLandscapeVideo, byte[] animatedImage, com.tencent.pigeon.biz_base.BizRect animatedImageRect) {
        return new com.tencent.pigeon.biz_base.BizFinderPigeonInfo(fromSessionIdInfo, objectId, exportId, nonceId, mediaType, encryptUsername, reportInfo, alignment, bizFromScene, title, coverImgUrl, nickName, headImgUrl, finderDuration, finderHeight, finderWidth, finderCoverHeight, finderCoverWidth, finderMediaType, currentPlayMs, isLandscapeVideo, animatedImage, animatedImageRect);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.BizFinderPigeonInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.BizFinderPigeonInfo bizFinderPigeonInfo = (com.tencent.pigeon.biz_base.BizFinderPigeonInfo) other;
        return kotlin.jvm.internal.o.b(this.fromSessionIdInfo, bizFinderPigeonInfo.fromSessionIdInfo) && kotlin.jvm.internal.o.b(this.objectId, bizFinderPigeonInfo.objectId) && kotlin.jvm.internal.o.b(this.exportId, bizFinderPigeonInfo.exportId) && kotlin.jvm.internal.o.b(this.nonceId, bizFinderPigeonInfo.nonceId) && kotlin.jvm.internal.o.b(this.mediaType, bizFinderPigeonInfo.mediaType) && kotlin.jvm.internal.o.b(this.encryptUsername, bizFinderPigeonInfo.encryptUsername) && kotlin.jvm.internal.o.b(this.reportInfo, bizFinderPigeonInfo.reportInfo) && kotlin.jvm.internal.o.b(this.alignment, bizFinderPigeonInfo.alignment) && kotlin.jvm.internal.o.b(this.bizFromScene, bizFinderPigeonInfo.bizFromScene) && kotlin.jvm.internal.o.b(this.title, bizFinderPigeonInfo.title) && kotlin.jvm.internal.o.b(this.coverImgUrl, bizFinderPigeonInfo.coverImgUrl) && kotlin.jvm.internal.o.b(this.nickName, bizFinderPigeonInfo.nickName) && kotlin.jvm.internal.o.b(this.headImgUrl, bizFinderPigeonInfo.headImgUrl) && kotlin.jvm.internal.o.b(this.finderDuration, bizFinderPigeonInfo.finderDuration) && kotlin.jvm.internal.o.b(this.finderHeight, bizFinderPigeonInfo.finderHeight) && kotlin.jvm.internal.o.b(this.finderWidth, bizFinderPigeonInfo.finderWidth) && kotlin.jvm.internal.o.b(this.finderCoverHeight, bizFinderPigeonInfo.finderCoverHeight) && kotlin.jvm.internal.o.b(this.finderCoverWidth, bizFinderPigeonInfo.finderCoverWidth) && kotlin.jvm.internal.o.b(this.finderMediaType, bizFinderPigeonInfo.finderMediaType) && kotlin.jvm.internal.o.b(this.currentPlayMs, bizFinderPigeonInfo.currentPlayMs) && kotlin.jvm.internal.o.b(this.isLandscapeVideo, bizFinderPigeonInfo.isLandscapeVideo) && kotlin.jvm.internal.o.b(this.animatedImage, bizFinderPigeonInfo.animatedImage) && kotlin.jvm.internal.o.b(this.animatedImageRect, bizFinderPigeonInfo.animatedImageRect);
    }

    public final java.lang.Long getAlignment() {
        return this.alignment;
    }

    public final byte[] getAnimatedImage() {
        return this.animatedImage;
    }

    public final com.tencent.pigeon.biz_base.BizRect getAnimatedImageRect() {
        return this.animatedImageRect;
    }

    public final java.lang.Long getBizFromScene() {
        return this.bizFromScene;
    }

    public final java.lang.String getCoverImgUrl() {
        return this.coverImgUrl;
    }

    public final java.lang.Long getCurrentPlayMs() {
        return this.currentPlayMs;
    }

    public final java.lang.String getEncryptUsername() {
        return this.encryptUsername;
    }

    public final java.lang.String getExportId() {
        return this.exportId;
    }

    public final java.lang.Long getFinderCoverHeight() {
        return this.finderCoverHeight;
    }

    public final java.lang.Long getFinderCoverWidth() {
        return this.finderCoverWidth;
    }

    public final java.lang.Long getFinderDuration() {
        return this.finderDuration;
    }

    public final java.lang.Long getFinderHeight() {
        return this.finderHeight;
    }

    public final java.lang.Long getFinderMediaType() {
        return this.finderMediaType;
    }

    public final java.lang.Long getFinderWidth() {
        return this.finderWidth;
    }

    public final java.lang.String getFromSessionIdInfo() {
        return this.fromSessionIdInfo;
    }

    public final java.lang.String getHeadImgUrl() {
        return this.headImgUrl;
    }

    public final java.lang.Long getMediaType() {
        return this.mediaType;
    }

    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public final java.lang.String getNonceId() {
        return this.nonceId;
    }

    public final java.lang.String getObjectId() {
        return this.objectId;
    }

    public final java.lang.String getReportInfo() {
        return this.reportInfo;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        java.lang.String str = this.fromSessionIdInfo;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.objectId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.exportId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.nonceId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Long l17 = this.mediaType;
        int hashCode5 = (hashCode4 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str5 = this.encryptUsername;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.reportInfo;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.Long l18 = this.alignment;
        int hashCode8 = (hashCode7 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Long l19 = this.bizFromScene;
        int hashCode9 = (hashCode8 + (l19 == null ? 0 : l19.hashCode())) * 31;
        java.lang.String str7 = this.title;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.coverImgUrl;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.nickName;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.headImgUrl;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        java.lang.Long l27 = this.finderDuration;
        int hashCode14 = (hashCode13 + (l27 == null ? 0 : l27.hashCode())) * 31;
        java.lang.Long l28 = this.finderHeight;
        int hashCode15 = (hashCode14 + (l28 == null ? 0 : l28.hashCode())) * 31;
        java.lang.Long l29 = this.finderWidth;
        int hashCode16 = (hashCode15 + (l29 == null ? 0 : l29.hashCode())) * 31;
        java.lang.Long l37 = this.finderCoverHeight;
        int hashCode17 = (hashCode16 + (l37 == null ? 0 : l37.hashCode())) * 31;
        java.lang.Long l38 = this.finderCoverWidth;
        int hashCode18 = (hashCode17 + (l38 == null ? 0 : l38.hashCode())) * 31;
        java.lang.Long l39 = this.finderMediaType;
        int hashCode19 = (hashCode18 + (l39 == null ? 0 : l39.hashCode())) * 31;
        java.lang.Long l47 = this.currentPlayMs;
        int hashCode20 = (hashCode19 + (l47 == null ? 0 : l47.hashCode())) * 31;
        java.lang.Boolean bool = this.isLandscapeVideo;
        int hashCode21 = (hashCode20 + (bool == null ? 0 : bool.hashCode())) * 31;
        byte[] bArr = this.animatedImage;
        int hashCode22 = (hashCode21 + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        com.tencent.pigeon.biz_base.BizRect bizRect = this.animatedImageRect;
        return hashCode22 + (bizRect != null ? bizRect.hashCode() : 0);
    }

    public final java.lang.Boolean isLandscapeVideo() {
        return this.isLandscapeVideo;
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[23];
        objArr[0] = this.fromSessionIdInfo;
        objArr[1] = this.objectId;
        objArr[2] = this.exportId;
        objArr[3] = this.nonceId;
        objArr[4] = this.mediaType;
        objArr[5] = this.encryptUsername;
        objArr[6] = this.reportInfo;
        objArr[7] = this.alignment;
        objArr[8] = this.bizFromScene;
        objArr[9] = this.title;
        objArr[10] = this.coverImgUrl;
        objArr[11] = this.nickName;
        objArr[12] = this.headImgUrl;
        objArr[13] = this.finderDuration;
        objArr[14] = this.finderHeight;
        objArr[15] = this.finderWidth;
        objArr[16] = this.finderCoverHeight;
        objArr[17] = this.finderCoverWidth;
        objArr[18] = this.finderMediaType;
        objArr[19] = this.currentPlayMs;
        objArr[20] = this.isLandscapeVideo;
        objArr[21] = this.animatedImage;
        com.tencent.pigeon.biz_base.BizRect bizRect = this.animatedImageRect;
        objArr[22] = bizRect != null ? bizRect.toList() : null;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "BizFinderPigeonInfo(fromSessionIdInfo=" + this.fromSessionIdInfo + ", objectId=" + this.objectId + ", exportId=" + this.exportId + ", nonceId=" + this.nonceId + ", mediaType=" + this.mediaType + ", encryptUsername=" + this.encryptUsername + ", reportInfo=" + this.reportInfo + ", alignment=" + this.alignment + ", bizFromScene=" + this.bizFromScene + ", title=" + this.title + ", coverImgUrl=" + this.coverImgUrl + ", nickName=" + this.nickName + ", headImgUrl=" + this.headImgUrl + ", finderDuration=" + this.finderDuration + ", finderHeight=" + this.finderHeight + ", finderWidth=" + this.finderWidth + ", finderCoverHeight=" + this.finderCoverHeight + ", finderCoverWidth=" + this.finderCoverWidth + ", finderMediaType=" + this.finderMediaType + ", currentPlayMs=" + this.currentPlayMs + ", isLandscapeVideo=" + this.isLandscapeVideo + ", animatedImage=" + java.util.Arrays.toString(this.animatedImage) + ", animatedImageRect=" + this.animatedImageRect + ')';
    }

    public BizFinderPigeonInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l17, java.lang.String str5, java.lang.String str6, java.lang.Long l18, java.lang.Long l19, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.Long l27, java.lang.Long l28, java.lang.Long l29, java.lang.Long l37, java.lang.Long l38, java.lang.Long l39, java.lang.Long l47, java.lang.Boolean bool, byte[] bArr, com.tencent.pigeon.biz_base.BizRect bizRect) {
        this.fromSessionIdInfo = str;
        this.objectId = str2;
        this.exportId = str3;
        this.nonceId = str4;
        this.mediaType = l17;
        this.encryptUsername = str5;
        this.reportInfo = str6;
        this.alignment = l18;
        this.bizFromScene = l19;
        this.title = str7;
        this.coverImgUrl = str8;
        this.nickName = str9;
        this.headImgUrl = str10;
        this.finderDuration = l27;
        this.finderHeight = l28;
        this.finderWidth = l29;
        this.finderCoverHeight = l37;
        this.finderCoverWidth = l38;
        this.finderMediaType = l39;
        this.currentPlayMs = l47;
        this.isLandscapeVideo = bool;
        this.animatedImage = bArr;
        this.animatedImageRect = bizRect;
    }

    public /* synthetic */ BizFinderPigeonInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l17, java.lang.String str5, java.lang.String str6, java.lang.Long l18, java.lang.Long l19, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.Long l27, java.lang.Long l28, java.lang.Long l29, java.lang.Long l37, java.lang.Long l38, java.lang.Long l39, java.lang.Long l47, java.lang.Boolean bool, byte[] bArr, com.tencent.pigeon.biz_base.BizRect bizRect, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? null : str4, (i17 & 16) != 0 ? null : l17, (i17 & 32) != 0 ? null : str5, (i17 & 64) != 0 ? null : str6, (i17 & 128) != 0 ? null : l18, (i17 & 256) != 0 ? null : l19, (i17 & 512) != 0 ? null : str7, (i17 & 1024) != 0 ? null : str8, (i17 & 2048) != 0 ? null : str9, (i17 & 4096) != 0 ? null : str10, (i17 & 8192) != 0 ? null : l27, (i17 & 16384) != 0 ? null : l28, (i17 & 32768) != 0 ? null : l29, (i17 & 65536) != 0 ? null : l37, (i17 & 131072) != 0 ? null : l38, (i17 & 262144) != 0 ? null : l39, (i17 & 524288) != 0 ? null : l47, (i17 & 1048576) != 0 ? null : bool, (i17 & 2097152) != 0 ? null : bArr, (i17 & 4194304) != 0 ? null : bizRect);
    }
}
