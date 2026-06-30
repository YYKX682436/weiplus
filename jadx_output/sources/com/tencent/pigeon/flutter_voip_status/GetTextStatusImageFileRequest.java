package com.tencent.pigeon.flutter_voip_status;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetTextStatusImageFileRequest;", "", dm.i4.COL_USERNAME, "", "statusId", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatusId", "()Ljava/lang/String;", "getUrl", "getUsername", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetTextStatusImageFileRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest.Companion INSTANCE = new com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest.Companion(null);
    private final java.lang.String statusId;
    private final java.lang.String url;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetTextStatusImageFileRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip_status/GetTextStatusImageFileRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
        }
    }

    public GetTextStatusImageFileRequest(java.lang.String username, java.lang.String statusId, java.lang.String url) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(url, "url");
        this.username = username;
        this.statusId = statusId;
        this.url = url;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest copy$default(com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest getTextStatusImageFileRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = getTextStatusImageFileRequest.username;
        }
        if ((i17 & 2) != 0) {
            str2 = getTextStatusImageFileRequest.statusId;
        }
        if ((i17 & 4) != 0) {
            str3 = getTextStatusImageFileRequest.url;
        }
        return getTextStatusImageFileRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStatusId() {
        return this.statusId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public final com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest copy(java.lang.String username, java.lang.String statusId, java.lang.String url) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(url, "url");
        return new com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest(username, statusId, url);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest getTextStatusImageFileRequest = (com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileRequest) other;
        return kotlin.jvm.internal.o.b(this.username, getTextStatusImageFileRequest.username) && kotlin.jvm.internal.o.b(this.statusId, getTextStatusImageFileRequest.statusId) && kotlin.jvm.internal.o.b(this.url, getTextStatusImageFileRequest.url);
    }

    public final java.lang.String getStatusId() {
        return this.statusId;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((this.username.hashCode() * 31) + this.statusId.hashCode()) * 31) + this.url.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, this.statusId, this.url);
    }

    public java.lang.String toString() {
        return "GetTextStatusImageFileRequest(username=" + this.username + ", statusId=" + this.statusId + ", url=" + this.url + ')';
    }
}
