package com.tencent.pigeon.flutter_voip_status;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetFinderImageFileRequest;", "", dm.i4.COL_USERNAME, "", "url", "urlToken", "decodeKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDecodeKey", "()Ljava/lang/String;", "getUrl", "getUrlToken", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GetFinderImageFileRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest.Companion INSTANCE = new com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest.Companion(null);
    private final java.lang.String decodeKey;
    private final java.lang.String url;
    private final java.lang.String urlToken;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetFinderImageFileRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip_status/GetFinderImageFileRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) obj4);
        }
    }

    public GetFinderImageFileRequest(java.lang.String username, java.lang.String url, java.lang.String urlToken, java.lang.String decodeKey) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(urlToken, "urlToken");
        kotlin.jvm.internal.o.g(decodeKey, "decodeKey");
        this.username = username;
        this.url = url;
        this.urlToken = urlToken;
        this.decodeKey = decodeKey;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest copy$default(com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest getFinderImageFileRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = getFinderImageFileRequest.username;
        }
        if ((i17 & 2) != 0) {
            str2 = getFinderImageFileRequest.url;
        }
        if ((i17 & 4) != 0) {
            str3 = getFinderImageFileRequest.urlToken;
        }
        if ((i17 & 8) != 0) {
            str4 = getFinderImageFileRequest.decodeKey;
        }
        return getFinderImageFileRequest.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUrlToken() {
        return this.urlToken;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDecodeKey() {
        return this.decodeKey;
    }

    public final com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest copy(java.lang.String username, java.lang.String url, java.lang.String urlToken, java.lang.String decodeKey) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(urlToken, "urlToken");
        kotlin.jvm.internal.o.g(decodeKey, "decodeKey");
        return new com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest(username, url, urlToken, decodeKey);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest getFinderImageFileRequest = (com.tencent.pigeon.flutter_voip_status.GetFinderImageFileRequest) other;
        return kotlin.jvm.internal.o.b(this.username, getFinderImageFileRequest.username) && kotlin.jvm.internal.o.b(this.url, getFinderImageFileRequest.url) && kotlin.jvm.internal.o.b(this.urlToken, getFinderImageFileRequest.urlToken) && kotlin.jvm.internal.o.b(this.decodeKey, getFinderImageFileRequest.decodeKey);
    }

    public final java.lang.String getDecodeKey() {
        return this.decodeKey;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getUrlToken() {
        return this.urlToken;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((((this.username.hashCode() * 31) + this.url.hashCode()) * 31) + this.urlToken.hashCode()) * 31) + this.decodeKey.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, this.url, this.urlToken, this.decodeKey);
    }

    public java.lang.String toString() {
        return "GetFinderImageFileRequest(username=" + this.username + ", url=" + this.url + ", urlToken=" + this.urlToken + ", decodeKey=" + this.decodeKey + ')';
    }
}
