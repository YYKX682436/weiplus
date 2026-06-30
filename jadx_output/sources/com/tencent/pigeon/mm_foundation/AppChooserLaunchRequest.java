package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/AppChooserLaunchRequest;", "", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "", "fileExt", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileExt", "()Ljava/lang/String;", "getFileName", "getFilePath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AppChooserLaunchRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest.Companion(null);
    private final java.lang.String fileExt;
    private final java.lang.String fileName;
    private final java.lang.String filePath;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/AppChooserLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/AppChooserLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) list.get(2));
        }
    }

    public AppChooserLaunchRequest(java.lang.String filePath, java.lang.String fileExt, java.lang.String str) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        this.filePath = filePath;
        this.fileExt = fileExt;
        this.fileName = str;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest copy$default(com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest appChooserLaunchRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = appChooserLaunchRequest.filePath;
        }
        if ((i17 & 2) != 0) {
            str2 = appChooserLaunchRequest.fileExt;
        }
        if ((i17 & 4) != 0) {
            str3 = appChooserLaunchRequest.fileName;
        }
        return appChooserLaunchRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFileExt() {
        return this.fileExt;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest copy(java.lang.String filePath, java.lang.String fileExt, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        return new com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest(filePath, fileExt, fileName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest appChooserLaunchRequest = (com.tencent.pigeon.mm_foundation.AppChooserLaunchRequest) other;
        return kotlin.jvm.internal.o.b(this.filePath, appChooserLaunchRequest.filePath) && kotlin.jvm.internal.o.b(this.fileExt, appChooserLaunchRequest.fileExt) && kotlin.jvm.internal.o.b(this.fileName, appChooserLaunchRequest.fileName);
    }

    public final java.lang.String getFileExt() {
        return this.fileExt;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    public int hashCode() {
        int hashCode = ((this.filePath.hashCode() * 31) + this.fileExt.hashCode()) * 31;
        java.lang.String str = this.fileName;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.filePath, this.fileExt, this.fileName);
    }

    public java.lang.String toString() {
        return "AppChooserLaunchRequest(filePath=" + this.filePath + ", fileExt=" + this.fileExt + ", fileName=" + this.fileName + ')';
    }

    public /* synthetic */ AppChooserLaunchRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? null : str3);
    }
}
