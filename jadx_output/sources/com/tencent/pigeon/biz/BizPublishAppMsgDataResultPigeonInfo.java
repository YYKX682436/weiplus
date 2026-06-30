package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/biz/BizPublishAppMsgDataResultPigeonInfo;", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "", "bizInfo", "Lcom/tencent/pigeon/biz/BizPublishAppMsgDataResultPigeonBizInfo;", "pictureInfo", "Lcom/tencent/pigeon/biz/BizPublishResultImagePiegonInfo;", "jumpUrl", "(Ljava/lang/String;Lcom/tencent/pigeon/biz/BizPublishAppMsgDataResultPigeonBizInfo;Lcom/tencent/pigeon/biz/BizPublishResultImagePiegonInfo;Ljava/lang/String;)V", "getBizInfo", "()Lcom/tencent/pigeon/biz/BizPublishAppMsgDataResultPigeonBizInfo;", "getJumpUrl", "()Ljava/lang/String;", "getPictureInfo", "()Lcom/tencent/pigeon/biz/BizPublishResultImagePiegonInfo;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizPublishAppMsgDataResultPigeonInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo.Companion(null);
    private final com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizInfo;
    private final java.lang.String jumpUrl;
    private final com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo pictureInfo;
    private final java.lang.String title;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizPublishAppMsgDataResultPigeonInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizPublishAppMsgDataResultPigeonInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(1);
            com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo fromList = list2 != null ? com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo.INSTANCE.fromList(list2) : null;
            java.util.List<? extends java.lang.Object> list3 = (java.util.List) list.get(2);
            return new com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo(str, fromList, list3 != null ? com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo.INSTANCE.fromList(list3) : null, (java.lang.String) list.get(3));
        }
    }

    public BizPublishAppMsgDataResultPigeonInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo copy$default(com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo bizPublishAppMsgDataResultPigeonInfo, java.lang.String str, com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizPublishAppMsgDataResultPigeonBizInfo, com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo bizPublishResultImagePiegonInfo, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = bizPublishAppMsgDataResultPigeonInfo.title;
        }
        if ((i17 & 2) != 0) {
            bizPublishAppMsgDataResultPigeonBizInfo = bizPublishAppMsgDataResultPigeonInfo.bizInfo;
        }
        if ((i17 & 4) != 0) {
            bizPublishResultImagePiegonInfo = bizPublishAppMsgDataResultPigeonInfo.pictureInfo;
        }
        if ((i17 & 8) != 0) {
            str2 = bizPublishAppMsgDataResultPigeonInfo.jumpUrl;
        }
        return bizPublishAppMsgDataResultPigeonInfo.copy(str, bizPublishAppMsgDataResultPigeonBizInfo, bizPublishResultImagePiegonInfo, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo getBizInfo() {
        return this.bizInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo getPictureInfo() {
        return this.pictureInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getJumpUrl() {
        return this.jumpUrl;
    }

    public final com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo copy(java.lang.String title, com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizInfo, com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo pictureInfo, java.lang.String jumpUrl) {
        return new com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo(title, bizInfo, pictureInfo, jumpUrl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo bizPublishAppMsgDataResultPigeonInfo = (com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo) other;
        return kotlin.jvm.internal.o.b(this.title, bizPublishAppMsgDataResultPigeonInfo.title) && kotlin.jvm.internal.o.b(this.bizInfo, bizPublishAppMsgDataResultPigeonInfo.bizInfo) && kotlin.jvm.internal.o.b(this.pictureInfo, bizPublishAppMsgDataResultPigeonInfo.pictureInfo) && kotlin.jvm.internal.o.b(this.jumpUrl, bizPublishAppMsgDataResultPigeonInfo.jumpUrl);
    }

    public final com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo getBizInfo() {
        return this.bizInfo;
    }

    public final java.lang.String getJumpUrl() {
        return this.jumpUrl;
    }

    public final com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo getPictureInfo() {
        return this.pictureInfo;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        java.lang.String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizPublishAppMsgDataResultPigeonBizInfo = this.bizInfo;
        int hashCode2 = (hashCode + (bizPublishAppMsgDataResultPigeonBizInfo == null ? 0 : bizPublishAppMsgDataResultPigeonBizInfo.hashCode())) * 31;
        com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo bizPublishResultImagePiegonInfo = this.pictureInfo;
        int hashCode3 = (hashCode2 + (bizPublishResultImagePiegonInfo == null ? 0 : bizPublishResultImagePiegonInfo.hashCode())) * 31;
        java.lang.String str2 = this.jumpUrl;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.title;
        com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizPublishAppMsgDataResultPigeonBizInfo = this.bizInfo;
        objArr[1] = bizPublishAppMsgDataResultPigeonBizInfo != null ? bizPublishAppMsgDataResultPigeonBizInfo.toList() : null;
        com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo bizPublishResultImagePiegonInfo = this.pictureInfo;
        objArr[2] = bizPublishResultImagePiegonInfo != null ? bizPublishResultImagePiegonInfo.toList() : null;
        objArr[3] = this.jumpUrl;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "BizPublishAppMsgDataResultPigeonInfo(title=" + this.title + ", bizInfo=" + this.bizInfo + ", pictureInfo=" + this.pictureInfo + ", jumpUrl=" + this.jumpUrl + ')';
    }

    public BizPublishAppMsgDataResultPigeonInfo(java.lang.String str, com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizPublishAppMsgDataResultPigeonBizInfo, com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo bizPublishResultImagePiegonInfo, java.lang.String str2) {
        this.title = str;
        this.bizInfo = bizPublishAppMsgDataResultPigeonBizInfo;
        this.pictureInfo = bizPublishResultImagePiegonInfo;
        this.jumpUrl = str2;
    }

    public /* synthetic */ BizPublishAppMsgDataResultPigeonInfo(java.lang.String str, com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizPublishAppMsgDataResultPigeonBizInfo, com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo bizPublishResultImagePiegonInfo, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : bizPublishAppMsgDataResultPigeonBizInfo, (i17 & 4) != 0 ? null : bizPublishResultImagePiegonInfo, (i17 & 8) != 0 ? null : str2);
    }
}
