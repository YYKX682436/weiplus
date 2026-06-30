package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/TingForFileLaunchRequest;", "", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "", "fileExt", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, "tingScene", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFileExt", "()Ljava/lang/String;", "getFileName", "getFilePath", "getTingScene", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/tencent/pigeon/mm_foundation/TingForFileLaunchRequest;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingForFileLaunchRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest.Companion(null);
    private final java.lang.String fileExt;
    private final java.lang.String fileName;
    private final java.lang.String filePath;
    private final java.lang.Long tingScene;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/TingForFileLaunchRequest$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/TingForFileLaunchRequest;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj2;
            java.lang.String str3 = (java.lang.String) list.get(2);
            java.lang.Object obj3 = list.get(3);
            return new com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest(str, str2, str3, obj3 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj3).intValue()) : (java.lang.Long) obj3);
        }
    }

    public TingForFileLaunchRequest(java.lang.String filePath, java.lang.String fileExt, java.lang.String str, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        this.filePath = filePath;
        this.fileExt = fileExt;
        this.fileName = str;
        this.tingScene = l17;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest copy$default(com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest tingForFileLaunchRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = tingForFileLaunchRequest.filePath;
        }
        if ((i17 & 2) != 0) {
            str2 = tingForFileLaunchRequest.fileExt;
        }
        if ((i17 & 4) != 0) {
            str3 = tingForFileLaunchRequest.fileName;
        }
        if ((i17 & 8) != 0) {
            l17 = tingForFileLaunchRequest.tingScene;
        }
        return tingForFileLaunchRequest.copy(str, str2, str3, l17);
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

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getTingScene() {
        return this.tingScene;
    }

    public final com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest copy(java.lang.String filePath, java.lang.String fileExt, java.lang.String fileName, java.lang.Long tingScene) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileExt, "fileExt");
        return new com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest(filePath, fileExt, fileName, tingScene);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest tingForFileLaunchRequest = (com.tencent.pigeon.mm_foundation.TingForFileLaunchRequest) other;
        return kotlin.jvm.internal.o.b(this.filePath, tingForFileLaunchRequest.filePath) && kotlin.jvm.internal.o.b(this.fileExt, tingForFileLaunchRequest.fileExt) && kotlin.jvm.internal.o.b(this.fileName, tingForFileLaunchRequest.fileName) && kotlin.jvm.internal.o.b(this.tingScene, tingForFileLaunchRequest.tingScene);
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

    public final java.lang.Long getTingScene() {
        return this.tingScene;
    }

    public int hashCode() {
        int hashCode = ((this.filePath.hashCode() * 31) + this.fileExt.hashCode()) * 31;
        java.lang.String str = this.fileName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l17 = this.tingScene;
        return hashCode2 + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.filePath, this.fileExt, this.fileName, this.tingScene);
    }

    public java.lang.String toString() {
        return "TingForFileLaunchRequest(filePath=" + this.filePath + ", fileExt=" + this.fileExt + ", fileName=" + this.fileName + ", tingScene=" + this.tingScene + ')';
    }

    public /* synthetic */ TingForFileLaunchRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? null : l17);
    }
}
