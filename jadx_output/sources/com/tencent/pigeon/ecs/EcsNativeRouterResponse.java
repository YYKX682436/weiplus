package com.tencent.pigeon.ecs;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsNativeRouterResponse;", "", "errCode", "", "errMsg", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getErrCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrMsg", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/pigeon/ecs/EcsNativeRouterResponse;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EcsNativeRouterResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ecs.EcsNativeRouterResponse.Companion INSTANCE = new com.tencent.pigeon.ecs.EcsNativeRouterResponse.Companion(null);
    private final java.lang.String data;
    private final java.lang.Long errCode;
    private final java.lang.String errMsg;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsNativeRouterResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsNativeRouterResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ecs.EcsNativeRouterResponse fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.ecs.EcsNativeRouterResponse(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.String) list.get(1), (java.lang.String) list.get(2));
        }
    }

    public EcsNativeRouterResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ecs.EcsNativeRouterResponse copy$default(com.tencent.pigeon.ecs.EcsNativeRouterResponse ecsNativeRouterResponse, java.lang.Long l17, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = ecsNativeRouterResponse.errCode;
        }
        if ((i17 & 2) != 0) {
            str = ecsNativeRouterResponse.errMsg;
        }
        if ((i17 & 4) != 0) {
            str2 = ecsNativeRouterResponse.data;
        }
        return ecsNativeRouterResponse.copy(l17, str, str2);
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
    public final java.lang.String getData() {
        return this.data;
    }

    public final com.tencent.pigeon.ecs.EcsNativeRouterResponse copy(java.lang.Long errCode, java.lang.String errMsg, java.lang.String data) {
        return new com.tencent.pigeon.ecs.EcsNativeRouterResponse(errCode, errMsg, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ecs.EcsNativeRouterResponse)) {
            return false;
        }
        com.tencent.pigeon.ecs.EcsNativeRouterResponse ecsNativeRouterResponse = (com.tencent.pigeon.ecs.EcsNativeRouterResponse) other;
        return kotlin.jvm.internal.o.b(this.errCode, ecsNativeRouterResponse.errCode) && kotlin.jvm.internal.o.b(this.errMsg, ecsNativeRouterResponse.errMsg) && kotlin.jvm.internal.o.b(this.data, ecsNativeRouterResponse.data);
    }

    public final java.lang.String getData() {
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
        java.lang.String str2 = this.data;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.errCode, this.errMsg, this.data);
    }

    public java.lang.String toString() {
        return "EcsNativeRouterResponse(errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", data=" + this.data + ')';
    }

    public EcsNativeRouterResponse(java.lang.Long l17, java.lang.String str, java.lang.String str2) {
        this.errCode = l17;
        this.errMsg = str;
        this.data = str2;
    }

    public /* synthetic */ EcsNativeRouterResponse(java.lang.Long l17, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : str2);
    }
}
