package com.tencent.pigeon.fav_list;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006 "}, d2 = {"Lcom/tencent/pigeon/fav_list/NoteAttachmentPreview;", "", "attachmentId", "", "type", "", "displayThumbPath", "webPageThumbUrl", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttachmentId", "()Ljava/lang/String;", "getDisplayThumbPath", "getFileName", "getType", "()J", "getWebPageThumbUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class NoteAttachmentPreview {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.fav_list.NoteAttachmentPreview.Companion INSTANCE = new com.tencent.pigeon.fav_list.NoteAttachmentPreview.Companion(null);
    private final java.lang.String attachmentId;
    private final java.lang.String displayThumbPath;
    private final java.lang.String fileName;
    private final long type;
    private final java.lang.String webPageThumbUrl;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/fav_list/NoteAttachmentPreview$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/fav_list/NoteAttachmentPreview;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.fav_list.NoteAttachmentPreview fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            return new com.tencent.pigeon.fav_list.NoteAttachmentPreview(str, longValue, (java.lang.String) list.get(2), (java.lang.String) list.get(3), (java.lang.String) list.get(4));
        }
    }

    public NoteAttachmentPreview(java.lang.String attachmentId, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(attachmentId, "attachmentId");
        this.attachmentId = attachmentId;
        this.type = j17;
        this.displayThumbPath = str;
        this.webPageThumbUrl = str2;
        this.fileName = str3;
    }

    public static /* synthetic */ com.tencent.pigeon.fav_list.NoteAttachmentPreview copy$default(com.tencent.pigeon.fav_list.NoteAttachmentPreview noteAttachmentPreview, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = noteAttachmentPreview.attachmentId;
        }
        if ((i17 & 2) != 0) {
            j17 = noteAttachmentPreview.type;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            str2 = noteAttachmentPreview.displayThumbPath;
        }
        java.lang.String str5 = str2;
        if ((i17 & 8) != 0) {
            str3 = noteAttachmentPreview.webPageThumbUrl;
        }
        java.lang.String str6 = str3;
        if ((i17 & 16) != 0) {
            str4 = noteAttachmentPreview.fileName;
        }
        return noteAttachmentPreview.copy(str, j18, str5, str6, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAttachmentId() {
        return this.attachmentId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayThumbPath() {
        return this.displayThumbPath;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getWebPageThumbUrl() {
        return this.webPageThumbUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final com.tencent.pigeon.fav_list.NoteAttachmentPreview copy(java.lang.String attachmentId, long type, java.lang.String displayThumbPath, java.lang.String webPageThumbUrl, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(attachmentId, "attachmentId");
        return new com.tencent.pigeon.fav_list.NoteAttachmentPreview(attachmentId, type, displayThumbPath, webPageThumbUrl, fileName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.fav_list.NoteAttachmentPreview)) {
            return false;
        }
        com.tencent.pigeon.fav_list.NoteAttachmentPreview noteAttachmentPreview = (com.tencent.pigeon.fav_list.NoteAttachmentPreview) other;
        return kotlin.jvm.internal.o.b(this.attachmentId, noteAttachmentPreview.attachmentId) && this.type == noteAttachmentPreview.type && kotlin.jvm.internal.o.b(this.displayThumbPath, noteAttachmentPreview.displayThumbPath) && kotlin.jvm.internal.o.b(this.webPageThumbUrl, noteAttachmentPreview.webPageThumbUrl) && kotlin.jvm.internal.o.b(this.fileName, noteAttachmentPreview.fileName);
    }

    public final java.lang.String getAttachmentId() {
        return this.attachmentId;
    }

    public final java.lang.String getDisplayThumbPath() {
        return this.displayThumbPath;
    }

    public final java.lang.String getFileName() {
        return this.fileName;
    }

    public final long getType() {
        return this.type;
    }

    public final java.lang.String getWebPageThumbUrl() {
        return this.webPageThumbUrl;
    }

    public int hashCode() {
        int hashCode = ((this.attachmentId.hashCode() * 31) + java.lang.Long.hashCode(this.type)) * 31;
        java.lang.String str = this.displayThumbPath;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.webPageThumbUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.fileName;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.attachmentId, java.lang.Long.valueOf(this.type), this.displayThumbPath, this.webPageThumbUrl, this.fileName);
    }

    public java.lang.String toString() {
        return "NoteAttachmentPreview(attachmentId=" + this.attachmentId + ", type=" + this.type + ", displayThumbPath=" + this.displayThumbPath + ", webPageThumbUrl=" + this.webPageThumbUrl + ", fileName=" + this.fileName + ')';
    }

    public /* synthetic */ NoteAttachmentPreview(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, kotlin.jvm.internal.i iVar) {
        this(str, j17, (i17 & 4) != 0 ? null : str2, (i17 & 8) != 0 ? null : str3, (i17 & 16) != 0 ? null : str4);
    }
}
