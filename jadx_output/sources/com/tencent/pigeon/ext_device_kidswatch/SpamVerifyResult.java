package com.tencent.pigeon.ext_device_kidswatch;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/SpamVerifyResult;", "", ya.b.SUCCESS, "", "nextAction", "", "errorMessage", "(ZLjava/lang/String;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getNextAction", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SpamVerifyResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult.Companion INSTANCE = new com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult.Companion(null);
    private final java.lang.String errorMessage;
    private final java.lang.String nextAction;
    private final boolean success;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/SpamVerifyResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ext_device_kidswatch/SpamVerifyResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult(((java.lang.Boolean) obj).booleanValue(), (java.lang.String) list.get(1), (java.lang.String) list.get(2));
        }
    }

    public SpamVerifyResult(boolean z17, java.lang.String str, java.lang.String str2) {
        this.success = z17;
        this.nextAction = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult copy$default(com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult spamVerifyResult, boolean z17, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = spamVerifyResult.success;
        }
        if ((i17 & 2) != 0) {
            str = spamVerifyResult.nextAction;
        }
        if ((i17 & 4) != 0) {
            str2 = spamVerifyResult.errorMessage;
        }
        return spamVerifyResult.copy(z17, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNextAction() {
        return this.nextAction;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult copy(boolean success, java.lang.String nextAction, java.lang.String errorMessage) {
        return new com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult(success, nextAction, errorMessage);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult)) {
            return false;
        }
        com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult spamVerifyResult = (com.tencent.pigeon.ext_device_kidswatch.SpamVerifyResult) other;
        return this.success == spamVerifyResult.success && kotlin.jvm.internal.o.b(this.nextAction, spamVerifyResult.nextAction) && kotlin.jvm.internal.o.b(this.errorMessage, spamVerifyResult.errorMessage);
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String getNextAction() {
        return this.nextAction;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.success) * 31;
        java.lang.String str = this.nextAction;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.errorMessage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.success), this.nextAction, this.errorMessage);
    }

    public java.lang.String toString() {
        return "SpamVerifyResult(success=" + this.success + ", nextAction=" + this.nextAction + ", errorMessage=" + this.errorMessage + ')';
    }

    public /* synthetic */ SpamVerifyResult(boolean z17, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : str2);
    }
}
