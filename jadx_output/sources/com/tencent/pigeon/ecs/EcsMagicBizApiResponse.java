package com.tencent.pigeon.ecs;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsMagicBizApiResponse;", "", "errCode", "", "errMsg", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "(JLjava/lang/String;[B)V", "getData", "()[B", "getErrCode", "()J", "getErrMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EcsMagicBizApiResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ecs.EcsMagicBizApiResponse.Companion INSTANCE = new com.tencent.pigeon.ecs.EcsMagicBizApiResponse.Companion(null);
    private final byte[] data;
    private final long errCode;
    private final java.lang.String errMsg;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsMagicBizApiResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsMagicBizApiResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ecs.EcsMagicBizApiResponse fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.ecs.EcsMagicBizApiResponse(longValue, (java.lang.String) obj2, (byte[]) list.get(2));
        }
    }

    public EcsMagicBizApiResponse(long j17, java.lang.String errMsg, byte[] bArr) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.errCode = j17;
        this.errMsg = errMsg;
        this.data = bArr;
    }

    public static /* synthetic */ com.tencent.pigeon.ecs.EcsMagicBizApiResponse copy$default(com.tencent.pigeon.ecs.EcsMagicBizApiResponse ecsMagicBizApiResponse, long j17, java.lang.String str, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = ecsMagicBizApiResponse.errCode;
        }
        if ((i17 & 2) != 0) {
            str = ecsMagicBizApiResponse.errMsg;
        }
        if ((i17 & 4) != 0) {
            bArr = ecsMagicBizApiResponse.data;
        }
        return ecsMagicBizApiResponse.copy(j17, str, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final long getErrCode() {
        return this.errCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final com.tencent.pigeon.ecs.EcsMagicBizApiResponse copy(long errCode, java.lang.String errMsg, byte[] data) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        return new com.tencent.pigeon.ecs.EcsMagicBizApiResponse(errCode, errMsg, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ecs.EcsMagicBizApiResponse)) {
            return false;
        }
        com.tencent.pigeon.ecs.EcsMagicBizApiResponse ecsMagicBizApiResponse = (com.tencent.pigeon.ecs.EcsMagicBizApiResponse) other;
        return this.errCode == ecsMagicBizApiResponse.errCode && kotlin.jvm.internal.o.b(this.errMsg, ecsMagicBizApiResponse.errMsg) && kotlin.jvm.internal.o.b(this.data, ecsMagicBizApiResponse.data);
    }

    public final byte[] getData() {
        return this.data;
    }

    public final long getErrCode() {
        return this.errCode;
    }

    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.errCode) * 31) + this.errMsg.hashCode()) * 31;
        byte[] bArr = this.data;
        return hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr));
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.errCode), this.errMsg, this.data);
    }

    public java.lang.String toString() {
        return "EcsMagicBizApiResponse(errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", data=" + java.util.Arrays.toString(this.data) + ')';
    }

    public /* synthetic */ EcsMagicBizApiResponse(long j17, java.lang.String str, byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, str, (i17 & 4) != 0 ? null : bArr);
    }
}
