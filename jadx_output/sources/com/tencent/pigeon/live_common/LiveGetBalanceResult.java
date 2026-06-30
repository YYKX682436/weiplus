package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveGetBalanceResult;", "", "number", "", ya.b.SUCCESS, "", "(Ljava/lang/Long;Ljava/lang/Boolean;)V", "getNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/tencent/pigeon/live_common/LiveGetBalanceResult;", "equals", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LiveGetBalanceResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveGetBalanceResult.Companion INSTANCE = new com.tencent.pigeon.live_common.LiveGetBalanceResult.Companion(null);
    private final java.lang.Long number;
    private final java.lang.Boolean success;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveGetBalanceResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveGetBalanceResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_common.LiveGetBalanceResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.live_common.LiveGetBalanceResult(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.Boolean) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveGetBalanceResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.live_common.LiveGetBalanceResult copy$default(com.tencent.pigeon.live_common.LiveGetBalanceResult liveGetBalanceResult, java.lang.Long l17, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = liveGetBalanceResult.number;
        }
        if ((i17 & 2) != 0) {
            bool = liveGetBalanceResult.success;
        }
        return liveGetBalanceResult.copy(l17, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public final com.tencent.pigeon.live_common.LiveGetBalanceResult copy(java.lang.Long number, java.lang.Boolean success) {
        return new com.tencent.pigeon.live_common.LiveGetBalanceResult(number, success);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_common.LiveGetBalanceResult)) {
            return false;
        }
        com.tencent.pigeon.live_common.LiveGetBalanceResult liveGetBalanceResult = (com.tencent.pigeon.live_common.LiveGetBalanceResult) other;
        return kotlin.jvm.internal.o.b(this.number, liveGetBalanceResult.number) && kotlin.jvm.internal.o.b(this.success, liveGetBalanceResult.success);
    }

    public final java.lang.Long getNumber() {
        return this.number;
    }

    public final java.lang.Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        java.lang.Long l17 = this.number;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Boolean bool = this.success;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.number, this.success);
    }

    public java.lang.String toString() {
        return "LiveGetBalanceResult(number=" + this.number + ", success=" + this.success + ')';
    }

    public LiveGetBalanceResult(java.lang.Long l17, java.lang.Boolean bool) {
        this.number = l17;
        this.success = bool;
    }

    public /* synthetic */ LiveGetBalanceResult(java.lang.Long l17, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : bool);
    }
}
