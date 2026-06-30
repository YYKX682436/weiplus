package com.tencent.pigeon.live_common;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinParameter;", "", "businessId", "", "consumeMode", "Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinMode;", "diffWecoinCount", "(Ljava/lang/Long;Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinMode;Ljava/lang/Long;)V", "getBusinessId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getConsumeMode", "()Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinMode;", "getDiffWecoinCount", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinMode;Ljava/lang/Long;)Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinParameter;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LiveWeCoinBuyCoinParameter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter.Companion INSTANCE = new com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter.Companion(null);
    private final java.lang.Long businessId;
    private final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode consumeMode;
    private final java.lang.Long diffWecoinCount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinParameter$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/live_common/LiveWeCoinBuyCoinParameter;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Integer num = (java.lang.Integer) list.get(1);
            com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode ofRaw = num != null ? com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode.INSTANCE.ofRaw(num.intValue()) : null;
            java.lang.Object obj2 = list.get(2);
            return new com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter(valueOf, ofRaw, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2);
        }
    }

    public LiveWeCoinBuyCoinParameter() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter copy$default(com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter liveWeCoinBuyCoinParameter, java.lang.Long l17, com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode liveWeCoinBuyCoinMode, java.lang.Long l18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = liveWeCoinBuyCoinParameter.businessId;
        }
        if ((i17 & 2) != 0) {
            liveWeCoinBuyCoinMode = liveWeCoinBuyCoinParameter.consumeMode;
        }
        if ((i17 & 4) != 0) {
            l18 = liveWeCoinBuyCoinParameter.diffWecoinCount;
        }
        return liveWeCoinBuyCoinParameter.copy(l17, liveWeCoinBuyCoinMode, l18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getBusinessId() {
        return this.businessId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode getConsumeMode() {
        return this.consumeMode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getDiffWecoinCount() {
        return this.diffWecoinCount;
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter copy(java.lang.Long businessId, com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode consumeMode, java.lang.Long diffWecoinCount) {
        return new com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter(businessId, consumeMode, diffWecoinCount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter)) {
            return false;
        }
        com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter liveWeCoinBuyCoinParameter = (com.tencent.pigeon.live_common.LiveWeCoinBuyCoinParameter) other;
        return kotlin.jvm.internal.o.b(this.businessId, liveWeCoinBuyCoinParameter.businessId) && this.consumeMode == liveWeCoinBuyCoinParameter.consumeMode && kotlin.jvm.internal.o.b(this.diffWecoinCount, liveWeCoinBuyCoinParameter.diffWecoinCount);
    }

    public final java.lang.Long getBusinessId() {
        return this.businessId;
    }

    public final com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode getConsumeMode() {
        return this.consumeMode;
    }

    public final java.lang.Long getDiffWecoinCount() {
        return this.diffWecoinCount;
    }

    public int hashCode() {
        java.lang.Long l17 = this.businessId;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode liveWeCoinBuyCoinMode = this.consumeMode;
        int hashCode2 = (hashCode + (liveWeCoinBuyCoinMode == null ? 0 : liveWeCoinBuyCoinMode.hashCode())) * 31;
        java.lang.Long l18 = this.diffWecoinCount;
        return hashCode2 + (l18 != null ? l18.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.businessId;
        com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode liveWeCoinBuyCoinMode = this.consumeMode;
        objArr[1] = liveWeCoinBuyCoinMode != null ? java.lang.Integer.valueOf(liveWeCoinBuyCoinMode.getRaw()) : null;
        objArr[2] = this.diffWecoinCount;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "LiveWeCoinBuyCoinParameter(businessId=" + this.businessId + ", consumeMode=" + this.consumeMode + ", diffWecoinCount=" + this.diffWecoinCount + ')';
    }

    public LiveWeCoinBuyCoinParameter(java.lang.Long l17, com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode liveWeCoinBuyCoinMode, java.lang.Long l18) {
        this.businessId = l17;
        this.consumeMode = liveWeCoinBuyCoinMode;
        this.diffWecoinCount = l18;
    }

    public /* synthetic */ LiveWeCoinBuyCoinParameter(java.lang.Long l17, com.tencent.pigeon.live_common.LiveWeCoinBuyCoinMode liveWeCoinBuyCoinMode, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : liveWeCoinBuyCoinMode, (i17 & 4) != 0 ? null : l18);
    }
}
