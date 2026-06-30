package com.tencent.pigeon.flutter_voip_status;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetSnsImageFileRequest;", "", dm.i4.COL_LOCALID, "", "snsId", "mediaId", "requestThumb", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLocalId", "()Ljava/lang/String;", "getMediaId", "getRequestThumb", "()Z", "getSnsId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetSnsImageFileRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest.Companion INSTANCE = new com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest.Companion(null);
    private final java.lang.String localId;
    private final java.lang.String mediaId;
    private final boolean requestThumb;
    private final java.lang.String snsId;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetSnsImageFileRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip_status/GetSnsImageFileRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, ((java.lang.Boolean) obj4).booleanValue());
        }
    }

    public GetSnsImageFileRequest(java.lang.String localId, java.lang.String snsId, java.lang.String mediaId, boolean z17) {
        kotlin.jvm.internal.o.g(localId, "localId");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.localId = localId;
        this.snsId = snsId;
        this.mediaId = mediaId;
        this.requestThumb = z17;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest copy$default(com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest getSnsImageFileRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = getSnsImageFileRequest.localId;
        }
        if ((i17 & 2) != 0) {
            str2 = getSnsImageFileRequest.snsId;
        }
        if ((i17 & 4) != 0) {
            str3 = getSnsImageFileRequest.mediaId;
        }
        if ((i17 & 8) != 0) {
            z17 = getSnsImageFileRequest.requestThumb;
        }
        return getSnsImageFileRequest.copy(str, str2, str3, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLocalId() {
        return this.localId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSnsId() {
        return this.snsId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMediaId() {
        return this.mediaId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRequestThumb() {
        return this.requestThumb;
    }

    public final com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest copy(java.lang.String localId, java.lang.String snsId, java.lang.String mediaId, boolean requestThumb) {
        kotlin.jvm.internal.o.g(localId, "localId");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        return new com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest(localId, snsId, mediaId, requestThumb);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest getSnsImageFileRequest = (com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest) other;
        return kotlin.jvm.internal.o.b(this.localId, getSnsImageFileRequest.localId) && kotlin.jvm.internal.o.b(this.snsId, getSnsImageFileRequest.snsId) && kotlin.jvm.internal.o.b(this.mediaId, getSnsImageFileRequest.mediaId) && this.requestThumb == getSnsImageFileRequest.requestThumb;
    }

    public final java.lang.String getLocalId() {
        return this.localId;
    }

    public final java.lang.String getMediaId() {
        return this.mediaId;
    }

    public final boolean getRequestThumb() {
        return this.requestThumb;
    }

    public final java.lang.String getSnsId() {
        return this.snsId;
    }

    public int hashCode() {
        return (((((this.localId.hashCode() * 31) + this.snsId.hashCode()) * 31) + this.mediaId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.requestThumb);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.localId, this.snsId, this.mediaId, java.lang.Boolean.valueOf(this.requestThumb));
    }

    public java.lang.String toString() {
        return "GetSnsImageFileRequest(localId=" + this.localId + ", snsId=" + this.snsId + ", mediaId=" + this.mediaId + ", requestThumb=" + this.requestThumb + ')';
    }
}
