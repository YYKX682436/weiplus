package com.tencent.pigeon.ext_device_kidswatch;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/PrivacyAgreementResult;", "", "agreed", "", "nextAction", "", "(ZLjava/lang/String;)V", "getAgreed", "()Z", "getNextAction", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PrivacyAgreementResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult.Companion INSTANCE = new com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult.Companion(null);
    private final boolean agreed;
    private final java.lang.String nextAction;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/PrivacyAgreementResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ext_device_kidswatch/PrivacyAgreementResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult(((java.lang.Boolean) obj).booleanValue(), (java.lang.String) list.get(1));
        }
    }

    public PrivacyAgreementResult(boolean z17, java.lang.String str) {
        this.agreed = z17;
        this.nextAction = str;
    }

    public static /* synthetic */ com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult copy$default(com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult privacyAgreementResult, boolean z17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = privacyAgreementResult.agreed;
        }
        if ((i17 & 2) != 0) {
            str = privacyAgreementResult.nextAction;
        }
        return privacyAgreementResult.copy(z17, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAgreed() {
        return this.agreed;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNextAction() {
        return this.nextAction;
    }

    public final com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult copy(boolean agreed, java.lang.String nextAction) {
        return new com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult(agreed, nextAction);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult)) {
            return false;
        }
        com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult privacyAgreementResult = (com.tencent.pigeon.ext_device_kidswatch.PrivacyAgreementResult) other;
        return this.agreed == privacyAgreementResult.agreed && kotlin.jvm.internal.o.b(this.nextAction, privacyAgreementResult.nextAction);
    }

    public final boolean getAgreed() {
        return this.agreed;
    }

    public final java.lang.String getNextAction() {
        return this.nextAction;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.agreed) * 31;
        java.lang.String str = this.nextAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.agreed), this.nextAction);
    }

    public java.lang.String toString() {
        return "PrivacyAgreementResult(agreed=" + this.agreed + ", nextAction=" + this.nextAction + ')';
    }

    public /* synthetic */ PrivacyAgreementResult(boolean z17, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : str);
    }
}
