package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u001b\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR#\u0010\b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006%"}, d2 = {"Lcom/tencent/pigeon/biz/BizTransferRequest;", "", "h5Url", "", "scope", "cgiUrl", ya.b.METHOD, "", "reqHeaders", "", "reqBody", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;)V", "getCgiUrl", "()Ljava/lang/String;", "getH5Url", "getMethod", "()J", "getReqBody", "getReqHeaders", "()Ljava/util/Map;", "getScope", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BizTransferRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizTransferRequest.Companion INSTANCE = new com.tencent.pigeon.biz.BizTransferRequest.Companion(null);
    private final java.lang.String cgiUrl;
    private final java.lang.String h5Url;
    private final long method;
    private final java.lang.String reqBody;
    private final java.util.Map<java.lang.String, java.lang.String> reqHeaders;
    private final java.lang.String scope;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizTransferRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizTransferRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizTransferRequest fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str3 = (java.lang.String) obj3;
            java.lang.Object obj4 = list.get(3);
            if (obj4 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj4).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj4).longValue();
            }
            return new com.tencent.pigeon.biz.BizTransferRequest(str, str2, str3, longValue, (java.util.Map) list.get(4), (java.lang.String) list.get(5));
        }
    }

    public BizTransferRequest(java.lang.String h5Url, java.lang.String scope, java.lang.String cgiUrl, long j17, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        kotlin.jvm.internal.o.g(h5Url, "h5Url");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(cgiUrl, "cgiUrl");
        this.h5Url = h5Url;
        this.scope = scope;
        this.cgiUrl = cgiUrl;
        this.method = j17;
        this.reqHeaders = map;
        this.reqBody = str;
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizTransferRequest copy$default(com.tencent.pigeon.biz.BizTransferRequest bizTransferRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.util.Map map, java.lang.String str4, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = bizTransferRequest.h5Url;
        }
        if ((i17 & 2) != 0) {
            str2 = bizTransferRequest.scope;
        }
        java.lang.String str5 = str2;
        if ((i17 & 4) != 0) {
            str3 = bizTransferRequest.cgiUrl;
        }
        java.lang.String str6 = str3;
        if ((i17 & 8) != 0) {
            j17 = bizTransferRequest.method;
        }
        long j18 = j17;
        if ((i17 & 16) != 0) {
            map = bizTransferRequest.reqHeaders;
        }
        java.util.Map map2 = map;
        if ((i17 & 32) != 0) {
            str4 = bizTransferRequest.reqBody;
        }
        return bizTransferRequest.copy(str, str5, str6, j18, map2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getH5Url() {
        return this.h5Url;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getScope() {
        return this.scope;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCgiUrl() {
        return this.cgiUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final long getMethod() {
        return this.method;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component5() {
        return this.reqHeaders;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getReqBody() {
        return this.reqBody;
    }

    public final com.tencent.pigeon.biz.BizTransferRequest copy(java.lang.String h5Url, java.lang.String scope, java.lang.String cgiUrl, long method, java.util.Map<java.lang.String, java.lang.String> reqHeaders, java.lang.String reqBody) {
        kotlin.jvm.internal.o.g(h5Url, "h5Url");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(cgiUrl, "cgiUrl");
        return new com.tencent.pigeon.biz.BizTransferRequest(h5Url, scope, cgiUrl, method, reqHeaders, reqBody);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizTransferRequest)) {
            return false;
        }
        com.tencent.pigeon.biz.BizTransferRequest bizTransferRequest = (com.tencent.pigeon.biz.BizTransferRequest) other;
        return kotlin.jvm.internal.o.b(this.h5Url, bizTransferRequest.h5Url) && kotlin.jvm.internal.o.b(this.scope, bizTransferRequest.scope) && kotlin.jvm.internal.o.b(this.cgiUrl, bizTransferRequest.cgiUrl) && this.method == bizTransferRequest.method && kotlin.jvm.internal.o.b(this.reqHeaders, bizTransferRequest.reqHeaders) && kotlin.jvm.internal.o.b(this.reqBody, bizTransferRequest.reqBody);
    }

    public final java.lang.String getCgiUrl() {
        return this.cgiUrl;
    }

    public final java.lang.String getH5Url() {
        return this.h5Url;
    }

    public final long getMethod() {
        return this.method;
    }

    public final java.lang.String getReqBody() {
        return this.reqBody;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getReqHeaders() {
        return this.reqHeaders;
    }

    public final java.lang.String getScope() {
        return this.scope;
    }

    public int hashCode() {
        int hashCode = ((((((this.h5Url.hashCode() * 31) + this.scope.hashCode()) * 31) + this.cgiUrl.hashCode()) * 31) + java.lang.Long.hashCode(this.method)) * 31;
        java.util.Map<java.lang.String, java.lang.String> map = this.reqHeaders;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        java.lang.String str = this.reqBody;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.h5Url, this.scope, this.cgiUrl, java.lang.Long.valueOf(this.method), this.reqHeaders, this.reqBody);
    }

    public java.lang.String toString() {
        return "BizTransferRequest(h5Url=" + this.h5Url + ", scope=" + this.scope + ", cgiUrl=" + this.cgiUrl + ", method=" + this.method + ", reqHeaders=" + this.reqHeaders + ", reqBody=" + this.reqBody + ')';
    }

    public /* synthetic */ BizTransferRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.util.Map map, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, str3, j17, (i17 & 16) != 0 ? null : map, (i17 & 32) != 0 ? null : str4);
    }
}
