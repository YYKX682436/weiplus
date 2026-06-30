package com.tencent.pigeon.ext_device_kidswatch;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aJ\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/ExtRegResult;", "", "errCode", "", "errMsg", "", dm.i4.COL_USERNAME, "openId", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrCode", "()J", "getErrMsg", "()Ljava/lang/String;", "getOpenId", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ExtRegResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ext_device_kidswatch.ExtRegResult.Companion INSTANCE = new com.tencent.pigeon.ext_device_kidswatch.ExtRegResult.Companion(null);
    private final long errCode;
    private final java.lang.String errMsg;
    private final java.lang.String openId;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/ExtRegResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ext_device_kidswatch/ExtRegResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ext_device_kidswatch.ExtRegResult fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            return new com.tencent.pigeon.ext_device_kidswatch.ExtRegResult(longValue, (java.lang.String) list.get(1), (java.lang.String) list.get(2), (java.lang.String) list.get(3));
        }
    }

    public ExtRegResult(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.errCode = j17;
        this.errMsg = str;
        this.username = str2;
        this.openId = str3;
    }

    public static /* synthetic */ com.tencent.pigeon.ext_device_kidswatch.ExtRegResult copy$default(com.tencent.pigeon.ext_device_kidswatch.ExtRegResult extRegResult, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = extRegResult.errCode;
        }
        long j18 = j17;
        if ((i17 & 2) != 0) {
            str = extRegResult.errMsg;
        }
        java.lang.String str4 = str;
        if ((i17 & 4) != 0) {
            str2 = extRegResult.username;
        }
        java.lang.String str5 = str2;
        if ((i17 & 8) != 0) {
            str3 = extRegResult.openId;
        }
        return extRegResult.copy(j18, str4, str5, str3);
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
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getOpenId() {
        return this.openId;
    }

    public final com.tencent.pigeon.ext_device_kidswatch.ExtRegResult copy(long errCode, java.lang.String errMsg, java.lang.String username, java.lang.String openId) {
        return new com.tencent.pigeon.ext_device_kidswatch.ExtRegResult(errCode, errMsg, username, openId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ext_device_kidswatch.ExtRegResult)) {
            return false;
        }
        com.tencent.pigeon.ext_device_kidswatch.ExtRegResult extRegResult = (com.tencent.pigeon.ext_device_kidswatch.ExtRegResult) other;
        return this.errCode == extRegResult.errCode && kotlin.jvm.internal.o.b(this.errMsg, extRegResult.errMsg) && kotlin.jvm.internal.o.b(this.username, extRegResult.username) && kotlin.jvm.internal.o.b(this.openId, extRegResult.openId);
    }

    public final long getErrCode() {
        return this.errCode;
    }

    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public final java.lang.String getOpenId() {
        return this.openId;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.errCode) * 31;
        java.lang.String str = this.errMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.username;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.openId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.errCode), this.errMsg, this.username, this.openId);
    }

    public java.lang.String toString() {
        return "ExtRegResult(errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", username=" + this.username + ", openId=" + this.openId + ')';
    }

    public /* synthetic */ ExtRegResult(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : str2, (i17 & 8) != 0 ? null : str3);
    }
}
