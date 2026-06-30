package com.tencent.pigeon.status;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/status/FLTStatusActionResponse;", "", "cmdId", "", "errCode", "", "errMsg", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_PROTO, "Lcom/tencent/pigeon/status/FLTStatusPlatformProto;", "(Ljava/lang/String;JLjava/lang/String;Lcom/tencent/pigeon/status/FLTStatusPlatformProto;)V", "getCmdId", "()Ljava/lang/String;", "getErrCode", "()J", "getErrMsg", "getProto", "()Lcom/tencent/pigeon/status/FLTStatusPlatformProto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FLTStatusActionResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.status.FLTStatusActionResponse.Companion INSTANCE = new com.tencent.pigeon.status.FLTStatusActionResponse.Companion(null);
    private final java.lang.String cmdId;
    private final long errCode;
    private final java.lang.String errMsg;
    private final com.tencent.pigeon.status.FLTStatusPlatformProto proto;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/status/FLTStatusActionResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/status/FLTStatusActionResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.status.FLTStatusActionResponse fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            long j17 = longValue;
            java.lang.String str2 = (java.lang.String) list.get(2);
            java.util.List<? extends java.lang.Object> list2 = (java.util.List) list.get(3);
            return new com.tencent.pigeon.status.FLTStatusActionResponse(str, j17, str2, list2 != null ? com.tencent.pigeon.status.FLTStatusPlatformProto.INSTANCE.fromList(list2) : null);
        }
    }

    public FLTStatusActionResponse(java.lang.String cmdId, long j17, java.lang.String str, com.tencent.pigeon.status.FLTStatusPlatformProto fLTStatusPlatformProto) {
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        this.cmdId = cmdId;
        this.errCode = j17;
        this.errMsg = str;
        this.proto = fLTStatusPlatformProto;
    }

    public static /* synthetic */ com.tencent.pigeon.status.FLTStatusActionResponse copy$default(com.tencent.pigeon.status.FLTStatusActionResponse fLTStatusActionResponse, java.lang.String str, long j17, java.lang.String str2, com.tencent.pigeon.status.FLTStatusPlatformProto fLTStatusPlatformProto, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = fLTStatusActionResponse.cmdId;
        }
        if ((i17 & 2) != 0) {
            j17 = fLTStatusActionResponse.errCode;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            str2 = fLTStatusActionResponse.errMsg;
        }
        java.lang.String str3 = str2;
        if ((i17 & 8) != 0) {
            fLTStatusPlatformProto = fLTStatusActionResponse.proto;
        }
        return fLTStatusActionResponse.copy(str, j18, str3, fLTStatusPlatformProto);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCmdId() {
        return this.cmdId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getErrCode() {
        return this.errCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    /* renamed from: component4, reason: from getter */
    public final com.tencent.pigeon.status.FLTStatusPlatformProto getProto() {
        return this.proto;
    }

    public final com.tencent.pigeon.status.FLTStatusActionResponse copy(java.lang.String cmdId, long errCode, java.lang.String errMsg, com.tencent.pigeon.status.FLTStatusPlatformProto proto) {
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        return new com.tencent.pigeon.status.FLTStatusActionResponse(cmdId, errCode, errMsg, proto);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.status.FLTStatusActionResponse)) {
            return false;
        }
        com.tencent.pigeon.status.FLTStatusActionResponse fLTStatusActionResponse = (com.tencent.pigeon.status.FLTStatusActionResponse) other;
        return kotlin.jvm.internal.o.b(this.cmdId, fLTStatusActionResponse.cmdId) && this.errCode == fLTStatusActionResponse.errCode && kotlin.jvm.internal.o.b(this.errMsg, fLTStatusActionResponse.errMsg) && kotlin.jvm.internal.o.b(this.proto, fLTStatusActionResponse.proto);
    }

    public final java.lang.String getCmdId() {
        return this.cmdId;
    }

    public final long getErrCode() {
        return this.errCode;
    }

    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public final com.tencent.pigeon.status.FLTStatusPlatformProto getProto() {
        return this.proto;
    }

    public int hashCode() {
        int hashCode = ((this.cmdId.hashCode() * 31) + java.lang.Long.hashCode(this.errCode)) * 31;
        java.lang.String str = this.errMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.tencent.pigeon.status.FLTStatusPlatformProto fLTStatusPlatformProto = this.proto;
        return hashCode2 + (fLTStatusPlatformProto != null ? fLTStatusPlatformProto.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.cmdId;
        objArr[1] = java.lang.Long.valueOf(this.errCode);
        objArr[2] = this.errMsg;
        com.tencent.pigeon.status.FLTStatusPlatformProto fLTStatusPlatformProto = this.proto;
        objArr[3] = fLTStatusPlatformProto != null ? fLTStatusPlatformProto.toList() : null;
        return kz5.c0.i(objArr);
    }

    public java.lang.String toString() {
        return "FLTStatusActionResponse(cmdId=" + this.cmdId + ", errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", proto=" + this.proto + ')';
    }

    public /* synthetic */ FLTStatusActionResponse(java.lang.String str, long j17, java.lang.String str2, com.tencent.pigeon.status.FLTStatusPlatformProto fLTStatusPlatformProto, int i17, kotlin.jvm.internal.i iVar) {
        this(str, j17, (i17 & 4) != 0 ? null : str2, (i17 & 8) != 0 ? null : fLTStatusPlatformProto);
    }
}
