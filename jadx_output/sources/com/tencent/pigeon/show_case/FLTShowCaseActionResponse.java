package com.tencent.pigeon.show_case;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/show_case/FLTShowCaseActionResponse;", "", "code", "", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "(JLjava/lang/String;Ljava/lang/String;)V", "getCode", "()J", "getData", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FLTShowCaseActionResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.show_case.FLTShowCaseActionResponse.Companion INSTANCE = new com.tencent.pigeon.show_case.FLTShowCaseActionResponse.Companion(null);
    private final long code;
    private final java.lang.String data;
    private final java.lang.String message;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/show_case/FLTShowCaseActionResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/show_case/FLTShowCaseActionResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.show_case.FLTShowCaseActionResponse fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            return new com.tencent.pigeon.show_case.FLTShowCaseActionResponse(longValue, (java.lang.String) list.get(1), (java.lang.String) list.get(2));
        }
    }

    public FLTShowCaseActionResponse(long j17, java.lang.String str, java.lang.String str2) {
        this.code = j17;
        this.message = str;
        this.data = str2;
    }

    public static /* synthetic */ com.tencent.pigeon.show_case.FLTShowCaseActionResponse copy$default(com.tencent.pigeon.show_case.FLTShowCaseActionResponse fLTShowCaseActionResponse, long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = fLTShowCaseActionResponse.code;
        }
        if ((i17 & 2) != 0) {
            str = fLTShowCaseActionResponse.message;
        }
        if ((i17 & 4) != 0) {
            str2 = fLTShowCaseActionResponse.data;
        }
        return fLTShowCaseActionResponse.copy(j17, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    public final com.tencent.pigeon.show_case.FLTShowCaseActionResponse copy(long code, java.lang.String message, java.lang.String data) {
        return new com.tencent.pigeon.show_case.FLTShowCaseActionResponse(code, message, data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.show_case.FLTShowCaseActionResponse)) {
            return false;
        }
        com.tencent.pigeon.show_case.FLTShowCaseActionResponse fLTShowCaseActionResponse = (com.tencent.pigeon.show_case.FLTShowCaseActionResponse) other;
        return this.code == fLTShowCaseActionResponse.code && kotlin.jvm.internal.o.b(this.message, fLTShowCaseActionResponse.message) && kotlin.jvm.internal.o.b(this.data, fLTShowCaseActionResponse.data);
    }

    public final long getCode() {
        return this.code;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.code) * 31;
        java.lang.String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.data;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.code), this.message, this.data);
    }

    public java.lang.String toString() {
        return "FLTShowCaseActionResponse(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ')';
    }

    public /* synthetic */ FLTShowCaseActionResponse(long j17, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : str2);
    }
}
