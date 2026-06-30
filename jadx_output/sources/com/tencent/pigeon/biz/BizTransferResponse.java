package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001b\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\nHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR#\u0010\t\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/tencent/pigeon/biz/BizTransferResponse;", "", ya.b.SUCCESS, "", "code", "", "msg", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "respHeaders", "", "(ZJLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCode", "()J", "getData", "()Ljava/lang/String;", "getMsg", "getRespHeaders", "()Ljava/util/Map;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BizTransferResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizTransferResponse.Companion INSTANCE = new com.tencent.pigeon.biz.BizTransferResponse.Companion(null);
    private final long code;
    private final java.lang.String data;
    private final java.lang.String msg;
    private final java.util.Map<java.lang.String, java.lang.String> respHeaders;
    private final boolean success;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizTransferResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizTransferResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizTransferResponse fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            return new com.tencent.pigeon.biz.BizTransferResponse(booleanValue, longValue, (java.lang.String) list.get(2), (java.lang.String) list.get(3), (java.util.Map) list.get(4));
        }
    }

    public BizTransferResponse(boolean z17, long j17, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        this.success = z17;
        this.code = j17;
        this.msg = str;
        this.data = str2;
        this.respHeaders = map;
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizTransferResponse copy$default(com.tencent.pigeon.biz.BizTransferResponse bizTransferResponse, boolean z17, long j17, java.lang.String str, java.lang.String str2, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = bizTransferResponse.success;
        }
        if ((i17 & 2) != 0) {
            j17 = bizTransferResponse.code;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            str = bizTransferResponse.msg;
        }
        java.lang.String str3 = str;
        if ((i17 & 8) != 0) {
            str2 = bizTransferResponse.data;
        }
        java.lang.String str4 = str2;
        if ((i17 & 16) != 0) {
            map = bizTransferResponse.respHeaders;
        }
        return bizTransferResponse.copy(z17, j18, str3, str4, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMsg() {
        return this.msg;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component5() {
        return this.respHeaders;
    }

    public final com.tencent.pigeon.biz.BizTransferResponse copy(boolean success, long code, java.lang.String msg, java.lang.String data, java.util.Map<java.lang.String, java.lang.String> respHeaders) {
        return new com.tencent.pigeon.biz.BizTransferResponse(success, code, msg, data, respHeaders);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizTransferResponse)) {
            return false;
        }
        com.tencent.pigeon.biz.BizTransferResponse bizTransferResponse = (com.tencent.pigeon.biz.BizTransferResponse) other;
        return this.success == bizTransferResponse.success && this.code == bizTransferResponse.code && kotlin.jvm.internal.o.b(this.msg, bizTransferResponse.msg) && kotlin.jvm.internal.o.b(this.data, bizTransferResponse.data) && kotlin.jvm.internal.o.b(this.respHeaders, bizTransferResponse.respHeaders);
    }

    public final long getCode() {
        return this.code;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String getMsg() {
        return this.msg;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getRespHeaders() {
        return this.respHeaders;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.success) * 31) + java.lang.Long.hashCode(this.code)) * 31;
        java.lang.String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.data;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.util.Map<java.lang.String, java.lang.String> map = this.respHeaders;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Boolean.valueOf(this.success), java.lang.Long.valueOf(this.code), this.msg, this.data, this.respHeaders);
    }

    public java.lang.String toString() {
        return "BizTransferResponse(success=" + this.success + ", code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ", respHeaders=" + this.respHeaders + ')';
    }

    public /* synthetic */ BizTransferResponse(boolean z17, long j17, java.lang.String str, java.lang.String str2, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, j17, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? null : str2, (i17 & 16) != 0 ? null : map);
    }
}
