package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizShareResult;", "", "totalCount", "", "successCount", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getSuccessCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalCount", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/biz_base/BizShareResult;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizShareResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizShareResult.Companion INSTANCE = new com.tencent.pigeon.biz_base.BizShareResult.Companion(null);
    private final java.lang.Long successCount;
    private final java.lang.Long totalCount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizShareResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/BizShareResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.BizShareResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(1);
            return new com.tencent.pigeon.biz_base.BizShareResult(valueOf, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BizShareResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.BizShareResult copy$default(com.tencent.pigeon.biz_base.BizShareResult bizShareResult, java.lang.Long l17, java.lang.Long l18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizShareResult.totalCount;
        }
        if ((i17 & 2) != 0) {
            l18 = bizShareResult.successCount;
        }
        return bizShareResult.copy(l17, l18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getTotalCount() {
        return this.totalCount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getSuccessCount() {
        return this.successCount;
    }

    public final com.tencent.pigeon.biz_base.BizShareResult copy(java.lang.Long totalCount, java.lang.Long successCount) {
        return new com.tencent.pigeon.biz_base.BizShareResult(totalCount, successCount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.BizShareResult)) {
            return false;
        }
        com.tencent.pigeon.biz_base.BizShareResult bizShareResult = (com.tencent.pigeon.biz_base.BizShareResult) other;
        return kotlin.jvm.internal.o.b(this.totalCount, bizShareResult.totalCount) && kotlin.jvm.internal.o.b(this.successCount, bizShareResult.successCount);
    }

    public final java.lang.Long getSuccessCount() {
        return this.successCount;
    }

    public final java.lang.Long getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        java.lang.Long l17 = this.totalCount;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Long l18 = this.successCount;
        return hashCode + (l18 != null ? l18.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.totalCount, this.successCount);
    }

    public java.lang.String toString() {
        return "BizShareResult(totalCount=" + this.totalCount + ", successCount=" + this.successCount + ')';
    }

    public BizShareResult(java.lang.Long l17, java.lang.Long l18) {
        this.totalCount = l17;
        this.successCount = l18;
    }

    public /* synthetic */ BizShareResult(java.lang.Long l17, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : l18);
    }
}
