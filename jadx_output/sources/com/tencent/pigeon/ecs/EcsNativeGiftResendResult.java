package com.tencent.pigeon.ecs;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsNativeGiftResendResult;", "", "seqId", "", "errCode", "", "giftOrderId", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getErrCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGiftOrderId", "getSeqId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/ecs/EcsNativeGiftResendResult;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EcsNativeGiftResendResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ecs.EcsNativeGiftResendResult.Companion INSTANCE = new com.tencent.pigeon.ecs.EcsNativeGiftResendResult.Companion(null);
    private final java.lang.Long errCode;
    private final java.lang.Long giftOrderId;
    private final java.lang.String seqId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsNativeGiftResendResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsNativeGiftResendResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ecs.EcsNativeGiftResendResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.Object obj = list.get(1);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(2);
            return new com.tencent.pigeon.ecs.EcsNativeGiftResendResult(str, valueOf, obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2);
        }
    }

    public EcsNativeGiftResendResult() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ecs.EcsNativeGiftResendResult copy$default(com.tencent.pigeon.ecs.EcsNativeGiftResendResult ecsNativeGiftResendResult, java.lang.String str, java.lang.Long l17, java.lang.Long l18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = ecsNativeGiftResendResult.seqId;
        }
        if ((i17 & 2) != 0) {
            l17 = ecsNativeGiftResendResult.errCode;
        }
        if ((i17 & 4) != 0) {
            l18 = ecsNativeGiftResendResult.giftOrderId;
        }
        return ecsNativeGiftResendResult.copy(str, l17, l18);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSeqId() {
        return this.seqId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getErrCode() {
        return this.errCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getGiftOrderId() {
        return this.giftOrderId;
    }

    public final com.tencent.pigeon.ecs.EcsNativeGiftResendResult copy(java.lang.String seqId, java.lang.Long errCode, java.lang.Long giftOrderId) {
        return new com.tencent.pigeon.ecs.EcsNativeGiftResendResult(seqId, errCode, giftOrderId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ecs.EcsNativeGiftResendResult)) {
            return false;
        }
        com.tencent.pigeon.ecs.EcsNativeGiftResendResult ecsNativeGiftResendResult = (com.tencent.pigeon.ecs.EcsNativeGiftResendResult) other;
        return kotlin.jvm.internal.o.b(this.seqId, ecsNativeGiftResendResult.seqId) && kotlin.jvm.internal.o.b(this.errCode, ecsNativeGiftResendResult.errCode) && kotlin.jvm.internal.o.b(this.giftOrderId, ecsNativeGiftResendResult.giftOrderId);
    }

    public final java.lang.Long getErrCode() {
        return this.errCode;
    }

    public final java.lang.Long getGiftOrderId() {
        return this.giftOrderId;
    }

    public final java.lang.String getSeqId() {
        return this.seqId;
    }

    public int hashCode() {
        java.lang.String str = this.seqId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l17 = this.errCode;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.giftOrderId;
        return hashCode2 + (l18 != null ? l18.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.seqId, this.errCode, this.giftOrderId);
    }

    public java.lang.String toString() {
        return "EcsNativeGiftResendResult(seqId=" + this.seqId + ", errCode=" + this.errCode + ", giftOrderId=" + this.giftOrderId + ')';
    }

    public EcsNativeGiftResendResult(java.lang.String str, java.lang.Long l17, java.lang.Long l18) {
        this.seqId = str;
        this.errCode = l17;
        this.giftOrderId = l18;
    }

    public /* synthetic */ EcsNativeGiftResendResult(java.lang.String str, java.lang.Long l17, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : l17, (i17 & 4) != 0 ? null : l18);
    }
}
