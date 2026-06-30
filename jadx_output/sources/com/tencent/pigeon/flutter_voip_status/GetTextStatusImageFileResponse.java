package com.tencent.pigeon.flutter_voip_status;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetTextStatusImageFileResponse;", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetTextStatusImageFileResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse.Companion INSTANCE = new com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse.Companion(null);
    private final java.lang.String path;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip_status/GetTextStatusImageFileResponse$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip_status/GetTextStatusImageFileResponse;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse((java.lang.String) list.get(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetTextStatusImageFileResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse copy$default(com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse getTextStatusImageFileResponse, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = getTextStatusImageFileResponse.path;
        }
        return getTextStatusImageFileResponse.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    public final com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse copy(java.lang.String path) {
        return new com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse(path);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse) && kotlin.jvm.internal.o.b(this.path, ((com.tencent.pigeon.flutter_voip_status.GetTextStatusImageFileResponse) other).path);
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public int hashCode() {
        java.lang.String str = this.path;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.path);
    }

    public java.lang.String toString() {
        return "GetTextStatusImageFileResponse(path=" + this.path + ')';
    }

    public GetTextStatusImageFileResponse(java.lang.String str) {
        this.path = str;
    }

    public /* synthetic */ GetTextStatusImageFileResponse(java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str);
    }
}
