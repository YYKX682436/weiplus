package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionPraiseInfo;", "", "praiseStatus", "", "(Ljava/lang/Long;)V", "getPraiseStatus", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/tencent/pigeon/biz/BizImagePreviewActionPraiseInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BizImagePreviewActionPraiseInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo.Companion(null);
    private final java.lang.Long praiseStatus;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionPraiseInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizImagePreviewActionPraiseInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BizImagePreviewActionPraiseInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo copy$default(com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo bizImagePreviewActionPraiseInfo, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizImagePreviewActionPraiseInfo.praiseStatus;
        }
        return bizImagePreviewActionPraiseInfo.copy(l17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getPraiseStatus() {
        return this.praiseStatus;
    }

    public final com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo copy(java.lang.Long praiseStatus) {
        return new com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo(praiseStatus);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo) && kotlin.jvm.internal.o.b(this.praiseStatus, ((com.tencent.pigeon.biz.BizImagePreviewActionPraiseInfo) other).praiseStatus);
    }

    public final java.lang.Long getPraiseStatus() {
        return this.praiseStatus;
    }

    public int hashCode() {
        java.lang.Long l17 = this.praiseStatus;
        if (l17 == null) {
            return 0;
        }
        return l17.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.praiseStatus);
    }

    public java.lang.String toString() {
        return "BizImagePreviewActionPraiseInfo(praiseStatus=" + this.praiseStatus + ')';
    }

    public BizImagePreviewActionPraiseInfo(java.lang.Long l17) {
        this.praiseStatus = l17;
    }

    public /* synthetic */ BizImagePreviewActionPraiseInfo(java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17);
    }
}
