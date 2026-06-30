package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/ting/UploadLocalPhotoResult;", "", "ret", "", "msg", "", "cdnUrl", "(JLjava/lang/String;Ljava/lang/String;)V", "getCdnUrl", "()Ljava/lang/String;", "getMsg", "getRet", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UploadLocalPhotoResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.UploadLocalPhotoResult.Companion INSTANCE = new com.tencent.pigeon.ting.UploadLocalPhotoResult.Companion(null);
    private final java.lang.String cdnUrl;
    private final java.lang.String msg;
    private final long ret;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/UploadLocalPhotoResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/UploadLocalPhotoResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.UploadLocalPhotoResult fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            if (obj instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj).longValue();
            }
            return new com.tencent.pigeon.ting.UploadLocalPhotoResult(longValue, (java.lang.String) list.get(1), (java.lang.String) list.get(2));
        }
    }

    public UploadLocalPhotoResult(long j17, java.lang.String str, java.lang.String str2) {
        this.ret = j17;
        this.msg = str;
        this.cdnUrl = str2;
    }

    public static /* synthetic */ com.tencent.pigeon.ting.UploadLocalPhotoResult copy$default(com.tencent.pigeon.ting.UploadLocalPhotoResult uploadLocalPhotoResult, long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = uploadLocalPhotoResult.ret;
        }
        if ((i17 & 2) != 0) {
            str = uploadLocalPhotoResult.msg;
        }
        if ((i17 & 4) != 0) {
            str2 = uploadLocalPhotoResult.cdnUrl;
        }
        return uploadLocalPhotoResult.copy(j17, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRet() {
        return this.ret;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMsg() {
        return this.msg;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCdnUrl() {
        return this.cdnUrl;
    }

    public final com.tencent.pigeon.ting.UploadLocalPhotoResult copy(long ret, java.lang.String msg, java.lang.String cdnUrl) {
        return new com.tencent.pigeon.ting.UploadLocalPhotoResult(ret, msg, cdnUrl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.UploadLocalPhotoResult)) {
            return false;
        }
        com.tencent.pigeon.ting.UploadLocalPhotoResult uploadLocalPhotoResult = (com.tencent.pigeon.ting.UploadLocalPhotoResult) other;
        return this.ret == uploadLocalPhotoResult.ret && kotlin.jvm.internal.o.b(this.msg, uploadLocalPhotoResult.msg) && kotlin.jvm.internal.o.b(this.cdnUrl, uploadLocalPhotoResult.cdnUrl);
    }

    public final java.lang.String getCdnUrl() {
        return this.cdnUrl;
    }

    public final java.lang.String getMsg() {
        return this.msg;
    }

    public final long getRet() {
        return this.ret;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.ret) * 31;
        java.lang.String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.cdnUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Long.valueOf(this.ret), this.msg, this.cdnUrl);
    }

    public java.lang.String toString() {
        return "UploadLocalPhotoResult(ret=" + this.ret + ", msg=" + this.msg + ", cdnUrl=" + this.cdnUrl + ')';
    }

    public /* synthetic */ UploadLocalPhotoResult(long j17, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : str2);
    }
}
