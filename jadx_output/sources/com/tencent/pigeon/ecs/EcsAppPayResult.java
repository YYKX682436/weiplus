package com.tencent.pigeon.ecs;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsAppPayResult;", "", "errCode", "", "errMsg", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "(Ljava/lang/Long;Ljava/lang/String;[B)V", "getData", "()[B", "getErrCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;[B)Lcom/tencent/pigeon/ecs/EcsAppPayResult;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EcsAppPayResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ecs.EcsAppPayResult.Companion INSTANCE = new com.tencent.pigeon.ecs.EcsAppPayResult.Companion(null);
    private final byte[] data;
    private final java.lang.Long errCode;
    private final java.lang.String errMsg;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsAppPayResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsAppPayResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ecs.EcsAppPayResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.ecs.EcsAppPayResult(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.String) list.get(1), (byte[]) list.get(2));
        }
    }

    public EcsAppPayResult() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ecs.EcsAppPayResult copy$default(com.tencent.pigeon.ecs.EcsAppPayResult ecsAppPayResult, java.lang.Long l17, java.lang.String str, byte[] bArr, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = ecsAppPayResult.errCode;
        }
        if ((i17 & 2) != 0) {
            str = ecsAppPayResult.errMsg;
        }
        if ((i17 & 4) != 0) {
            bArr = ecsAppPayResult.data;
        }
        return ecsAppPayResult.copy(l17, str, bArr);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getErrCode() {
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

    public final com.tencent.pigeon.ecs.EcsAppPayResult copy(java.lang.Long errCode, java.lang.String errMsg, byte[] data) {
        return new com.tencent.pigeon.ecs.EcsAppPayResult(errCode, errMsg, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ecs.EcsAppPayResult)) {
            return false;
        }
        com.tencent.pigeon.ecs.EcsAppPayResult ecsAppPayResult = (com.tencent.pigeon.ecs.EcsAppPayResult) other;
        return kotlin.jvm.internal.o.b(this.errCode, ecsAppPayResult.errCode) && kotlin.jvm.internal.o.b(this.errMsg, ecsAppPayResult.errMsg) && kotlin.jvm.internal.o.b(this.data, ecsAppPayResult.data);
    }

    public final byte[] getData() {
        return this.data;
    }

    public final java.lang.Long getErrCode() {
        return this.errCode;
    }

    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public int hashCode() {
        java.lang.Long l17 = this.errCode;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.errMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        byte[] bArr = this.data;
        return hashCode2 + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.errCode, this.errMsg, this.data);
    }

    public java.lang.String toString() {
        return "EcsAppPayResult(errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", data=" + java.util.Arrays.toString(this.data) + ')';
    }

    public EcsAppPayResult(java.lang.Long l17, java.lang.String str, byte[] bArr) {
        this.errCode = l17;
        this.errMsg = str;
        this.data = bArr;
    }

    public /* synthetic */ EcsAppPayResult(java.lang.Long l17, java.lang.String str, byte[] bArr, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : bArr);
    }
}
