package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeResult;", "", "status", "Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeResultStatus;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeSuccessResult;", "error", "Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeError;", "(Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeResultStatus;Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeSuccessResult;Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeError;)V", "getData", "()Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeSuccessResult;", "getError", "()Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeError;", "getStatus", "()Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeResultStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LiveWeCoinConsumeResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveWeCoinConsumeResult.Companion INSTANCE = new com.tencent.pigeon.live_common.LiveWeCoinConsumeResult.Companion(null);
    private final com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult data;
    private final com.tencent.pigeon.live_common.LiveWeCoinConsumeError error;
    private final com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus status;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveWeCoinConsumeResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_common.LiveWeCoinConsumeResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Integer num = (java.lang.Integer) list.get(0);
            com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus ofRaw = num != null ? com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus.INSTANCE.ofRaw(num.intValue()) : null;
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(1);
            com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult fromList = list2 != null ? com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult.INSTANCE.fromList(list2) : null;
            java.util.List<? extends java.lang.Object> list3 = (java.util.List) list.get(2);
            return new com.tencent.pigeon.live_common.LiveWeCoinConsumeResult(ofRaw, fromList, list3 != null ? com.tencent.pigeon.live_common.LiveWeCoinConsumeError.INSTANCE.fromList(list3) : null);
        }
    }

    public LiveWeCoinConsumeResult() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.live_common.LiveWeCoinConsumeResult copy$default(com.tencent.pigeon.live_common.LiveWeCoinConsumeResult liveWeCoinConsumeResult, com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus liveWeCoinConsumeResultStatus, com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult liveWeCoinConsumeSuccessResult, com.tencent.pigeon.live_common.LiveWeCoinConsumeError liveWeCoinConsumeError, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            liveWeCoinConsumeResultStatus = liveWeCoinConsumeResult.status;
        }
        if ((i17 & 2) != 0) {
            liveWeCoinConsumeSuccessResult = liveWeCoinConsumeResult.data;
        }
        if ((i17 & 4) != 0) {
            liveWeCoinConsumeError = liveWeCoinConsumeResult.error;
        }
        return liveWeCoinConsumeResult.copy(liveWeCoinConsumeResultStatus, liveWeCoinConsumeSuccessResult, liveWeCoinConsumeError);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final com.tencent.pigeon.live_common.LiveWeCoinConsumeError getError() {
        return this.error;
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinConsumeResult copy(com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus status, com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult data, com.tencent.pigeon.live_common.LiveWeCoinConsumeError error) {
        return new com.tencent.pigeon.live_common.LiveWeCoinConsumeResult(status, data, error);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_common.LiveWeCoinConsumeResult)) {
            return false;
        }
        com.tencent.pigeon.live_common.LiveWeCoinConsumeResult liveWeCoinConsumeResult = (com.tencent.pigeon.live_common.LiveWeCoinConsumeResult) other;
        return this.status == liveWeCoinConsumeResult.status && kotlin.jvm.internal.o.b(this.data, liveWeCoinConsumeResult.data) && kotlin.jvm.internal.o.b(this.error, liveWeCoinConsumeResult.error);
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult getData() {
        return this.data;
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinConsumeError getError() {
        return this.error;
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus liveWeCoinConsumeResultStatus = this.status;
        int hashCode = (liveWeCoinConsumeResultStatus == null ? 0 : liveWeCoinConsumeResultStatus.hashCode()) * 31;
        com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult liveWeCoinConsumeSuccessResult = this.data;
        int hashCode2 = (hashCode + (liveWeCoinConsumeSuccessResult == null ? 0 : liveWeCoinConsumeSuccessResult.hashCode())) * 31;
        com.tencent.pigeon.live_common.LiveWeCoinConsumeError liveWeCoinConsumeError = this.error;
        return hashCode2 + (liveWeCoinConsumeError != null ? liveWeCoinConsumeError.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus liveWeCoinConsumeResultStatus = this.status;
        objArr[0] = liveWeCoinConsumeResultStatus != null ? java.lang.Integer.valueOf(liveWeCoinConsumeResultStatus.getRaw()) : null;
        com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult liveWeCoinConsumeSuccessResult = this.data;
        objArr[1] = liveWeCoinConsumeSuccessResult != null ? liveWeCoinConsumeSuccessResult.toList() : null;
        com.tencent.pigeon.live_common.LiveWeCoinConsumeError liveWeCoinConsumeError = this.error;
        objArr[2] = liveWeCoinConsumeError != null ? liveWeCoinConsumeError.toList() : null;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "LiveWeCoinConsumeResult(status=" + this.status + ", data=" + this.data + ", error=" + this.error + ')';
    }

    public LiveWeCoinConsumeResult(com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus liveWeCoinConsumeResultStatus, com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult liveWeCoinConsumeSuccessResult, com.tencent.pigeon.live_common.LiveWeCoinConsumeError liveWeCoinConsumeError) {
        this.status = liveWeCoinConsumeResultStatus;
        this.data = liveWeCoinConsumeSuccessResult;
        this.error = liveWeCoinConsumeError;
    }

    public /* synthetic */ LiveWeCoinConsumeResult(com.tencent.pigeon.live_common.LiveWeCoinConsumeResultStatus liveWeCoinConsumeResultStatus, com.tencent.pigeon.live_common.LiveWeCoinConsumeSuccessResult liveWeCoinConsumeSuccessResult, com.tencent.pigeon.live_common.LiveWeCoinConsumeError liveWeCoinConsumeError, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : liveWeCoinConsumeResultStatus, (i17 & 2) != 0 ? null : liveWeCoinConsumeSuccessResult, (i17 & 4) != 0 ? null : liveWeCoinConsumeError);
    }
}
