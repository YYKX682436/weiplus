package com.tencent.pigeon.ext_device_kidswatch;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001eJ\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006!"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/CheckMobileStateResult;", "", "errCode", "", "errMsg", "", "regSessionId", "mobileValid", "", "needSpamVerify", "(JLjava/lang/String;Ljava/lang/String;ZZ)V", "getErrCode", "()J", "getErrMsg", "()Ljava/lang/String;", "getMobileValid", "()Z", "getNeedSpamVerify", "getRegSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CheckMobileStateResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult.Companion INSTANCE = new com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult.Companion(null);
    private final long errCode;
    private final java.lang.String errMsg;
    private final boolean mobileValid;
    private final boolean needSpamVerify;
    private final java.lang.String regSessionId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/CheckMobileStateResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ext_device_kidswatch/CheckMobileStateResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            long j17 = longValue;
            java.lang.String str = (java.lang.String) list.get(1);
            java.lang.String str2 = (java.lang.String) list.get(2);
            java.lang.Object obj2 = list.get(3);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = list.get(4);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult(j17, str, str2, booleanValue, ((java.lang.Boolean) obj3).booleanValue());
        }
    }

    public CheckMobileStateResult(long j17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this.errCode = j17;
        this.errMsg = str;
        this.regSessionId = str2;
        this.mobileValid = z17;
        this.needSpamVerify = z18;
    }

    public static /* synthetic */ com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult copy$default(com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult checkMobileStateResult, long j17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = checkMobileStateResult.errCode;
        }
        long j18 = j17;
        if ((i17 & 2) != 0) {
            str = checkMobileStateResult.errMsg;
        }
        java.lang.String str3 = str;
        if ((i17 & 4) != 0) {
            str2 = checkMobileStateResult.regSessionId;
        }
        java.lang.String str4 = str2;
        if ((i17 & 8) != 0) {
            z17 = checkMobileStateResult.mobileValid;
        }
        boolean z19 = z17;
        if ((i17 & 16) != 0) {
            z18 = checkMobileStateResult.needSpamVerify;
        }
        return checkMobileStateResult.copy(j18, str3, str4, z19, z18);
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
    public final java.lang.String getRegSessionId() {
        return this.regSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMobileValid() {
        return this.mobileValid;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getNeedSpamVerify() {
        return this.needSpamVerify;
    }

    public final com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult copy(long errCode, java.lang.String errMsg, java.lang.String regSessionId, boolean mobileValid, boolean needSpamVerify) {
        return new com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult(errCode, errMsg, regSessionId, mobileValid, needSpamVerify);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult)) {
            return false;
        }
        com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult checkMobileStateResult = (com.tencent.pigeon.ext_device_kidswatch.CheckMobileStateResult) other;
        return this.errCode == checkMobileStateResult.errCode && kotlin.jvm.internal.o.b(this.errMsg, checkMobileStateResult.errMsg) && kotlin.jvm.internal.o.b(this.regSessionId, checkMobileStateResult.regSessionId) && this.mobileValid == checkMobileStateResult.mobileValid && this.needSpamVerify == checkMobileStateResult.needSpamVerify;
    }

    public final long getErrCode() {
        return this.errCode;
    }

    public final java.lang.String getErrMsg() {
        return this.errMsg;
    }

    public final boolean getMobileValid() {
        return this.mobileValid;
    }

    public final boolean getNeedSpamVerify() {
        return this.needSpamVerify;
    }

    public final java.lang.String getRegSessionId() {
        return this.regSessionId;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.errCode) * 31;
        java.lang.String str = this.errMsg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.regSessionId;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.mobileValid)) * 31) + java.lang.Boolean.hashCode(this.needSpamVerify);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.errCode), this.errMsg, this.regSessionId, java.lang.Boolean.valueOf(this.mobileValid), java.lang.Boolean.valueOf(this.needSpamVerify));
    }

    public java.lang.String toString() {
        return "CheckMobileStateResult(errCode=" + this.errCode + ", errMsg=" + this.errMsg + ", regSessionId=" + this.regSessionId + ", mobileValid=" + this.mobileValid + ", needSpamVerify=" + this.needSpamVerify + ')';
    }

    public /* synthetic */ CheckMobileStateResult(long j17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : str2, z17, z18);
    }
}
