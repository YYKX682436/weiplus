package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007HÆ\u0003J:\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizFinderJumpInfo;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "", "targetInfo", "Lcom/tencent/pigeon/biz_base/BizFinderLiveInfo;", "allInfoList", "", "(Ljava/lang/Long;Lcom/tencent/pigeon/biz_base/BizFinderLiveInfo;Ljava/util/List;)V", "getAllInfoList", "()Ljava/util/List;", "getScene", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTargetInfo", "()Lcom/tencent/pigeon/biz_base/BizFinderLiveInfo;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Lcom/tencent/pigeon/biz_base/BizFinderLiveInfo;Ljava/util/List;)Lcom/tencent/pigeon/biz_base/BizFinderJumpInfo;", "equals", "", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizFinderJumpInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizFinderJumpInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.BizFinderJumpInfo.Companion(null);
    private final java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> allInfoList;
    private final java.lang.Long scene;
    private final com.tencent.pigeon.biz_base.BizFinderLiveInfo targetInfo;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizFinderJumpInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/BizFinderJumpInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.BizFinderJumpInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(1);
            return new com.tencent.pigeon.biz_base.BizFinderJumpInfo(valueOf, list2 != null ? com.tencent.pigeon.biz_base.BizFinderLiveInfo.INSTANCE.fromList(list2) : null, (java.util.List) list.get(2));
        }
    }

    public BizFinderJumpInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz_base.BizFinderJumpInfo copy$default(com.tencent.pigeon.biz_base.BizFinderJumpInfo bizFinderJumpInfo, java.lang.Long l17, com.tencent.pigeon.biz_base.BizFinderLiveInfo bizFinderLiveInfo, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizFinderJumpInfo.scene;
        }
        if ((i17 & 2) != 0) {
            bizFinderLiveInfo = bizFinderJumpInfo.targetInfo;
        }
        if ((i17 & 4) != 0) {
            list = bizFinderJumpInfo.allInfoList;
        }
        return bizFinderJumpInfo.copy(l17, bizFinderLiveInfo, list);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getScene() {
        return this.scene;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.biz_base.BizFinderLiveInfo getTargetInfo() {
        return this.targetInfo;
    }

    public final java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> component3() {
        return this.allInfoList;
    }

    public final com.tencent.pigeon.biz_base.BizFinderJumpInfo copy(java.lang.Long scene, com.tencent.pigeon.biz_base.BizFinderLiveInfo targetInfo, java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> allInfoList) {
        return new com.tencent.pigeon.biz_base.BizFinderJumpInfo(scene, targetInfo, allInfoList);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.BizFinderJumpInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.BizFinderJumpInfo bizFinderJumpInfo = (com.tencent.pigeon.biz_base.BizFinderJumpInfo) other;
        return kotlin.jvm.internal.o.b(this.scene, bizFinderJumpInfo.scene) && kotlin.jvm.internal.o.b(this.targetInfo, bizFinderJumpInfo.targetInfo) && kotlin.jvm.internal.o.b(this.allInfoList, bizFinderJumpInfo.allInfoList);
    }

    public final java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> getAllInfoList() {
        return this.allInfoList;
    }

    public final java.lang.Long getScene() {
        return this.scene;
    }

    public final com.tencent.pigeon.biz_base.BizFinderLiveInfo getTargetInfo() {
        return this.targetInfo;
    }

    public int hashCode() {
        java.lang.Long l17 = this.scene;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        com.tencent.pigeon.biz_base.BizFinderLiveInfo bizFinderLiveInfo = this.targetInfo;
        int hashCode2 = (hashCode + (bizFinderLiveInfo == null ? 0 : bizFinderLiveInfo.hashCode())) * 31;
        java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> list = this.allInfoList;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.scene;
        com.tencent.pigeon.biz_base.BizFinderLiveInfo bizFinderLiveInfo = this.targetInfo;
        objArr[1] = bizFinderLiveInfo != null ? bizFinderLiveInfo.toList() : null;
        objArr[2] = this.allInfoList;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "BizFinderJumpInfo(scene=" + this.scene + ", targetInfo=" + this.targetInfo + ", allInfoList=" + this.allInfoList + ')';
    }

    public BizFinderJumpInfo(java.lang.Long l17, com.tencent.pigeon.biz_base.BizFinderLiveInfo bizFinderLiveInfo, java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> list) {
        this.scene = l17;
        this.targetInfo = bizFinderLiveInfo;
        this.allInfoList = list;
    }

    public /* synthetic */ BizFinderJumpInfo(java.lang.Long l17, com.tencent.pigeon.biz_base.BizFinderLiveInfo bizFinderLiveInfo, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : bizFinderLiveInfo, (i17 & 4) != 0 ? null : list);
    }
}
