package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionIdentity;", "", "headImg", "", "nickName", "identityType", "", "identityName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getHeadImg", "()Ljava/lang/String;", "getIdentityName", "getIdentityType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNickName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/tencent/pigeon/biz/BizImagePreviewActionIdentity;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BizImagePreviewActionIdentity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizImagePreviewActionIdentity.Companion INSTANCE = new com.tencent.pigeon.biz.BizImagePreviewActionIdentity.Companion(null);
    private final java.lang.String headImg;
    private final java.lang.String identityName;
    private final java.lang.Long identityType;
    private final java.lang.String nickName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizImagePreviewActionIdentity$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizImagePreviewActionIdentity;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizImagePreviewActionIdentity fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.Object obj = list.get(2);
            return new com.tencent.pigeon.biz.BizImagePreviewActionIdentity(str, str2, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.String) list.get(3));
        }
    }

    public BizImagePreviewActionIdentity() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.BizImagePreviewActionIdentity copy$default(com.tencent.pigeon.biz.BizImagePreviewActionIdentity bizImagePreviewActionIdentity, java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = bizImagePreviewActionIdentity.headImg;
        }
        if ((i17 & 2) != 0) {
            str2 = bizImagePreviewActionIdentity.nickName;
        }
        if ((i17 & 4) != 0) {
            l17 = bizImagePreviewActionIdentity.identityType;
        }
        if ((i17 & 8) != 0) {
            str3 = bizImagePreviewActionIdentity.identityName;
        }
        return bizImagePreviewActionIdentity.copy(str, str2, l17, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHeadImg() {
        return this.headImg;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNickName() {
        return this.nickName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getIdentityType() {
        return this.identityType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIdentityName() {
        return this.identityName;
    }

    public final com.tencent.pigeon.biz.BizImagePreviewActionIdentity copy(java.lang.String headImg, java.lang.String nickName, java.lang.Long identityType, java.lang.String identityName) {
        return new com.tencent.pigeon.biz.BizImagePreviewActionIdentity(headImg, nickName, identityType, identityName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizImagePreviewActionIdentity)) {
            return false;
        }
        com.tencent.pigeon.biz.BizImagePreviewActionIdentity bizImagePreviewActionIdentity = (com.tencent.pigeon.biz.BizImagePreviewActionIdentity) other;
        return kotlin.jvm.internal.o.b(this.headImg, bizImagePreviewActionIdentity.headImg) && kotlin.jvm.internal.o.b(this.nickName, bizImagePreviewActionIdentity.nickName) && kotlin.jvm.internal.o.b(this.identityType, bizImagePreviewActionIdentity.identityType) && kotlin.jvm.internal.o.b(this.identityName, bizImagePreviewActionIdentity.identityName);
    }

    public final java.lang.String getHeadImg() {
        return this.headImg;
    }

    public final java.lang.String getIdentityName() {
        return this.identityName;
    }

    public final java.lang.Long getIdentityType() {
        return this.identityType;
    }

    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public int hashCode() {
        java.lang.String str = this.headImg;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l17 = this.identityType;
        int hashCode3 = (hashCode2 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str3 = this.identityName;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.headImg, this.nickName, this.identityType, this.identityName);
    }

    public java.lang.String toString() {
        return "BizImagePreviewActionIdentity(headImg=" + this.headImg + ", nickName=" + this.nickName + ", identityType=" + this.identityType + ", identityName=" + this.identityName + ')';
    }

    public BizImagePreviewActionIdentity(java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.String str3) {
        this.headImg = str;
        this.nickName = str2;
        this.identityType = l17;
        this.identityName = str3;
    }

    public /* synthetic */ BizImagePreviewActionIdentity(java.lang.String str, java.lang.String str2, java.lang.Long l17, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : l17, (i17 & 8) != 0 ? null : str3);
    }
}
