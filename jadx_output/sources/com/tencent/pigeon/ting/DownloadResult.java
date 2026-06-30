package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/ting/DownloadResult;", "", "code", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/tencent/pigeon/ting/DownloadResult;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DownloadResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.DownloadResult.Companion INSTANCE = new com.tencent.pigeon.ting.DownloadResult.Companion(null);
    private final java.lang.Long code;
    private final java.lang.String path;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/DownloadResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/DownloadResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.DownloadResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.ting.DownloadResult(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.String) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.DownloadResult copy$default(com.tencent.pigeon.ting.DownloadResult downloadResult, java.lang.Long l17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = downloadResult.code;
        }
        if ((i17 & 2) != 0) {
            str = downloadResult.path;
        }
        return downloadResult.copy(l17, str);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    public final com.tencent.pigeon.ting.DownloadResult copy(java.lang.Long code, java.lang.String path) {
        return new com.tencent.pigeon.ting.DownloadResult(code, path);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.DownloadResult)) {
            return false;
        }
        com.tencent.pigeon.ting.DownloadResult downloadResult = (com.tencent.pigeon.ting.DownloadResult) other;
        return kotlin.jvm.internal.o.b(this.code, downloadResult.code) && kotlin.jvm.internal.o.b(this.path, downloadResult.path);
    }

    public final java.lang.Long getCode() {
        return this.code;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public int hashCode() {
        java.lang.Long l17 = this.code;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.path;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.code, this.path);
    }

    public java.lang.String toString() {
        return "DownloadResult(code=" + this.code + ", path=" + this.path + ')';
    }

    public DownloadResult(java.lang.Long l17, java.lang.String str) {
        this.code = l17;
        this.path = str;
    }

    public /* synthetic */ DownloadResult(java.lang.Long l17, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str);
    }
}
