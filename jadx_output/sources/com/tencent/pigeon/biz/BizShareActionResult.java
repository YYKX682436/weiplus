package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/biz/BizShareActionResult;", "", "actionType", "", ya.b.SUCCESS, "", "(Ljava/lang/Long;Ljava/lang/Boolean;)V", "getActionType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/tencent/pigeon/biz/BizShareActionResult;", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BizShareActionResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizShareActionResult.Companion INSTANCE = new com.tencent.pigeon.biz.BizShareActionResult.Companion(null);
    private final java.lang.Long actionType;
    private final java.lang.Boolean success;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizShareActionResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizShareActionResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizShareActionResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.biz.BizShareActionResult(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.Boolean) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BizShareActionResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizShareActionResult copy$default(com.tencent.pigeon.biz.BizShareActionResult bizShareActionResult, java.lang.Long l17, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizShareActionResult.actionType;
        }
        if ((i17 & 2) != 0) {
            bool = bizShareActionResult.success;
        }
        return bizShareActionResult.copy(l17, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getActionType() {
        return this.actionType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public final com.tencent.pigeon.biz.BizShareActionResult copy(java.lang.Long actionType, java.lang.Boolean success) {
        return new com.tencent.pigeon.biz.BizShareActionResult(actionType, success);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizShareActionResult)) {
            return false;
        }
        com.tencent.pigeon.biz.BizShareActionResult bizShareActionResult = (com.tencent.pigeon.biz.BizShareActionResult) other;
        return kotlin.jvm.internal.o.b(this.actionType, bizShareActionResult.actionType) && kotlin.jvm.internal.o.b(this.success, bizShareActionResult.success);
    }

    public final java.lang.Long getActionType() {
        return this.actionType;
    }

    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        java.lang.Long l17 = this.actionType;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Boolean bool = this.success;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.actionType, this.success);
    }

    public java.lang.String toString() {
        return "BizShareActionResult(actionType=" + this.actionType + ", success=" + this.success + ')';
    }

    public BizShareActionResult(java.lang.Long l17, java.lang.Boolean bool) {
        this.actionType = l17;
        this.success = bool;
    }

    public /* synthetic */ BizShareActionResult(java.lang.Long l17, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : bool);
    }
}
