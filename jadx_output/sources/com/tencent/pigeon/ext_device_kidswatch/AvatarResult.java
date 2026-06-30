package com.tencent.pigeon.ext_device_kidswatch;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/AvatarResult;", "", "localPath", "", "url", ya.b.SUCCESS, "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getLocalPath", "getSuccess", "()Z", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AvatarResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ext_device_kidswatch.AvatarResult.Companion INSTANCE = new com.tencent.pigeon.ext_device_kidswatch.AvatarResult.Companion(null);
    private final java.lang.String errorMessage;
    private final java.lang.String localPath;
    private final boolean success;
    private final java.lang.String url;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ext_device_kidswatch/AvatarResult$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ext_device_kidswatch/AvatarResult;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ext_device_kidswatch.AvatarResult fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.Object obj = list.get(2);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new com.tencent.pigeon.ext_device_kidswatch.AvatarResult(str, str2, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) list.get(3));
        }
    }

    public AvatarResult(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        this.localPath = str;
        this.url = str2;
        this.success = z17;
        this.errorMessage = str3;
    }

    public static /* synthetic */ com.tencent.pigeon.ext_device_kidswatch.AvatarResult copy$default(com.tencent.pigeon.ext_device_kidswatch.AvatarResult avatarResult, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = avatarResult.localPath;
        }
        if ((i17 & 2) != 0) {
            str2 = avatarResult.url;
        }
        if ((i17 & 4) != 0) {
            z17 = avatarResult.success;
        }
        if ((i17 & 8) != 0) {
            str3 = avatarResult.errorMessage;
        }
        return avatarResult.copy(str, str2, z17, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLocalPath() {
        return this.localPath;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final com.tencent.pigeon.ext_device_kidswatch.AvatarResult copy(java.lang.String localPath, java.lang.String url, boolean success, java.lang.String errorMessage) {
        return new com.tencent.pigeon.ext_device_kidswatch.AvatarResult(localPath, url, success, errorMessage);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ext_device_kidswatch.AvatarResult)) {
            return false;
        }
        com.tencent.pigeon.ext_device_kidswatch.AvatarResult avatarResult = (com.tencent.pigeon.ext_device_kidswatch.AvatarResult) other;
        return kotlin.jvm.internal.o.b(this.localPath, avatarResult.localPath) && kotlin.jvm.internal.o.b(this.url, avatarResult.url) && this.success == avatarResult.success && kotlin.jvm.internal.o.b(this.errorMessage, avatarResult.errorMessage);
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String getLocalPath() {
        return this.localPath;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        java.lang.String str = this.localPath;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.url;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.success)) * 31;
        java.lang.String str3 = this.errorMessage;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.localPath, this.url, java.lang.Boolean.valueOf(this.success), this.errorMessage);
    }

    public java.lang.String toString() {
        return "AvatarResult(localPath=" + this.localPath + ", url=" + this.url + ", success=" + this.success + ", errorMessage=" + this.errorMessage + ')';
    }

    public /* synthetic */ AvatarResult(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, z17, (i17 & 8) != 0 ? null : str3);
    }
}
