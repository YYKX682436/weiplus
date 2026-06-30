package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionSrcCommentInfo;", "", "type", "", "contentId", "replyId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getContentId", "()Ljava/lang/String;", "getReplyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/tencent/pigeon/biz/BizImagePreviewActionSrcCommentInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BizImagePreviewActionSrcCommentInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo.Companion(null);
    private final java.lang.String contentId;
    private final java.lang.Long replyId;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionSrcCommentInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizImagePreviewActionSrcCommentInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.Object obj = list.get(2);
            return new com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo(str, str2, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    public BizImagePreviewActionSrcCommentInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo copy$default(com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo bizImagePreviewActionSrcCommentInfo, java.lang.String str, java.lang.String str2, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = bizImagePreviewActionSrcCommentInfo.type;
        }
        if ((i17 & 2) != 0) {
            str2 = bizImagePreviewActionSrcCommentInfo.contentId;
        }
        if ((i17 & 4) != 0) {
            l17 = bizImagePreviewActionSrcCommentInfo.replyId;
        }
        return bizImagePreviewActionSrcCommentInfo.copy(str, str2, l17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getContentId() {
        return this.contentId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getReplyId() {
        return this.replyId;
    }

    public final com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo copy(java.lang.String type, java.lang.String contentId, java.lang.Long replyId) {
        return new com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo(type, contentId, replyId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo bizImagePreviewActionSrcCommentInfo = (com.tencent.pigeon.biz.BizImagePreviewActionSrcCommentInfo) other;
        return kotlin.jvm.internal.o.b(this.type, bizImagePreviewActionSrcCommentInfo.type) && kotlin.jvm.internal.o.b(this.contentId, bizImagePreviewActionSrcCommentInfo.contentId) && kotlin.jvm.internal.o.b(this.replyId, bizImagePreviewActionSrcCommentInfo.replyId);
    }

    public final java.lang.String getContentId() {
        return this.contentId;
    }

    public final java.lang.Long getReplyId() {
        return this.replyId;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public int hashCode() {
        java.lang.String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.contentId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.replyId;
        return hashCode2 + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.type, this.contentId, this.replyId);
    }

    public java.lang.String toString() {
        return "BizImagePreviewActionSrcCommentInfo(type=" + this.type + ", contentId=" + this.contentId + ", replyId=" + this.replyId + ')';
    }

    public BizImagePreviewActionSrcCommentInfo(java.lang.String str, java.lang.String str2, java.lang.Long l17) {
        this.type = str;
        this.contentId = str2;
        this.replyId = l17;
    }

    public /* synthetic */ BizImagePreviewActionSrcCommentInfo(java.lang.String str, java.lang.String str2, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : l17);
    }
}
