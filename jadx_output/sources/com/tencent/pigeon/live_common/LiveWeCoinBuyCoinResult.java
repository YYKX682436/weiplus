package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinResult;", "", "status", "Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinResultStatus;", "(Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinResultStatus;)V", "getStatus", "()Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinResultStatus;", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LiveWeCoinBuyCoinResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult.Companion INSTANCE = new com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult.Companion(null);
    private final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus status;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult fromList(java.util.List<? extends java.lang.Object> list) {
            com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus liveWeCoinBuyCoinResultStatus;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Integer num = (java.lang.Integer) list.get(0);
            if (num != null) {
                liveWeCoinBuyCoinResultStatus = com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus.INSTANCE.ofRaw(num.intValue());
            } else {
                liveWeCoinBuyCoinResultStatus = null;
            }
            return new com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult(liveWeCoinBuyCoinResultStatus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveWeCoinBuyCoinResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult copy$default(com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult liveWeCoinBuyCoinResult, com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus liveWeCoinBuyCoinResultStatus, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            liveWeCoinBuyCoinResultStatus = liveWeCoinBuyCoinResult.status;
        }
        return liveWeCoinBuyCoinResult.copy(liveWeCoinBuyCoinResultStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus getStatus() {
        return this.status;
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult copy(com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus status) {
        return new com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult(status);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult) && this.status == ((com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResult) other).status;
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus liveWeCoinBuyCoinResultStatus = this.status;
        if (liveWeCoinBuyCoinResultStatus == null) {
            return 0;
        }
        return liveWeCoinBuyCoinResultStatus.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus liveWeCoinBuyCoinResultStatus = this.status;
        return kz5.b0.c(liveWeCoinBuyCoinResultStatus != null ? java.lang.Integer.valueOf(liveWeCoinBuyCoinResultStatus.getRaw()) : null);
    }

    public java.lang.String toString() {
        return "LiveWeCoinBuyCoinResult(status=" + this.status + ')';
    }

    public LiveWeCoinBuyCoinResult(com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus liveWeCoinBuyCoinResultStatus) {
        this.status = liveWeCoinBuyCoinResultStatus;
    }

    public /* synthetic */ LiveWeCoinBuyCoinResult(com.tencent.pigeon.live_common.LiveWeCoinBuyCoinResultStatus liveWeCoinBuyCoinResultStatus, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : liveWeCoinBuyCoinResultStatus);
    }
}
