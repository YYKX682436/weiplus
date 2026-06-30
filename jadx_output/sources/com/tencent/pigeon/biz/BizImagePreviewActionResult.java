package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bHÆ\u0003JF\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bJ\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006!"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionResult;", "", "curIdentityType", "", "curIdentityName", "", "followStatus", "actions", "", "Lcom/tencent/pigeon/biz/BizImagePreviewAction;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getCurIdentityName", "()Ljava/lang/String;", "getCurIdentityType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFollowStatus", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/tencent/pigeon/biz/BizImagePreviewActionResult;", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizImagePreviewActionResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizImagePreviewActionResult.Companion INSTANCE = new com.tencent.pigeon.biz.BizImagePreviewActionResult.Companion(null);
    private final java.util.List<com.tencent.pigeon.biz.BizImagePreviewAction> actions;
    private final java.lang.String curIdentityName;
    private final java.lang.Long curIdentityType;
    private final java.lang.Long followStatus;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizImagePreviewActionResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizImagePreviewActionResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.String str = (java.lang.String) list.get(1);
            java.lang.Object obj2 = list.get(2);
            return new com.tencent.pigeon.biz.BizImagePreviewActionResult(valueOf, str, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2, (java.util.List) list.get(3));
        }
    }

    public BizImagePreviewActionResult() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz.BizImagePreviewActionResult copy$default(com.tencent.pigeon.biz.BizImagePreviewActionResult bizImagePreviewActionResult, java.lang.Long l17, java.lang.String str, java.lang.Long l18, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizImagePreviewActionResult.curIdentityType;
        }
        if ((i17 & 2) != 0) {
            str = bizImagePreviewActionResult.curIdentityName;
        }
        if ((i17 & 4) != 0) {
            l18 = bizImagePreviewActionResult.followStatus;
        }
        if ((i17 & 8) != 0) {
            list = bizImagePreviewActionResult.actions;
        }
        return bizImagePreviewActionResult.copy(l17, str, l18, list);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getCurIdentityType() {
        return this.curIdentityType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurIdentityName() {
        return this.curIdentityName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getFollowStatus() {
        return this.followStatus;
    }

    public final java.util.List<com.tencent.pigeon.biz.BizImagePreviewAction> component4() {
        return this.actions;
    }

    public final com.tencent.pigeon.biz.BizImagePreviewActionResult copy(java.lang.Long curIdentityType, java.lang.String curIdentityName, java.lang.Long followStatus, java.util.List<com.tencent.pigeon.biz.BizImagePreviewAction> actions) {
        return new com.tencent.pigeon.biz.BizImagePreviewActionResult(curIdentityType, curIdentityName, followStatus, actions);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizImagePreviewActionResult)) {
            return false;
        }
        com.tencent.pigeon.biz.BizImagePreviewActionResult bizImagePreviewActionResult = (com.tencent.pigeon.biz.BizImagePreviewActionResult) other;
        return kotlin.jvm.internal.o.b(this.curIdentityType, bizImagePreviewActionResult.curIdentityType) && kotlin.jvm.internal.o.b(this.curIdentityName, bizImagePreviewActionResult.curIdentityName) && kotlin.jvm.internal.o.b(this.followStatus, bizImagePreviewActionResult.followStatus) && kotlin.jvm.internal.o.b(this.actions, bizImagePreviewActionResult.actions);
    }

    public final java.util.List<com.tencent.pigeon.biz.BizImagePreviewAction> getActions() {
        return this.actions;
    }

    public final java.lang.String getCurIdentityName() {
        return this.curIdentityName;
    }

    public final java.lang.Long getCurIdentityType() {
        return this.curIdentityType;
    }

    public final java.lang.Long getFollowStatus() {
        return this.followStatus;
    }

    public int hashCode() {
        java.lang.Long l17 = this.curIdentityType;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.curIdentityName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l18 = this.followStatus;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.util.List<com.tencent.pigeon.biz.BizImagePreviewAction> list = this.actions;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.curIdentityType, this.curIdentityName, this.followStatus, this.actions);
    }

    public java.lang.String toString() {
        return "BizImagePreviewActionResult(curIdentityType=" + this.curIdentityType + ", curIdentityName=" + this.curIdentityName + ", followStatus=" + this.followStatus + ", actions=" + this.actions + ')';
    }

    public BizImagePreviewActionResult(java.lang.Long l17, java.lang.String str, java.lang.Long l18, java.util.List<com.tencent.pigeon.biz.BizImagePreviewAction> list) {
        this.curIdentityType = l17;
        this.curIdentityName = str;
        this.followStatus = l18;
        this.actions = list;
    }

    public /* synthetic */ BizImagePreviewActionResult(java.lang.Long l17, java.lang.String str, java.lang.Long l18, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : l18, (i17 & 8) != 0 ? null : list);
    }
}
