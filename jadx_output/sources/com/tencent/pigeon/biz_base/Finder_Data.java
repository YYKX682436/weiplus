package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cJ\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/tencent/pigeon/biz_base/Finder_Data;", "", dm.i4.COL_USERNAME, "", "nickname", "logo_url", "finder_uin", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFinder_uin", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLogo_url", "()Ljava/lang/String;", "getNickname", "getUsername", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/tencent/pigeon/biz_base/Finder_Data;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Finder_Data {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.Finder_Data.Companion INSTANCE = new com.tencent.pigeon.biz_base.Finder_Data.Companion(null);
    private final java.lang.Long finder_uin;
    private final java.lang.String logo_url;
    private final java.lang.String nickname;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/Finder_Data$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/Finder_Data;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.Finder_Data fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.String str3 = (java.lang.String) list.get(2);
            java.lang.Object obj = list.get(3);
            return new com.tencent.pigeon.biz_base.Finder_Data(str, str2, str3, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj);
        }
    }

    public Finder_Data() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.Finder_Data copy$default(com.tencent.pigeon.biz_base.Finder_Data finder_Data, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = finder_Data.username;
        }
        if ((i17 & 2) != 0) {
            str2 = finder_Data.nickname;
        }
        if ((i17 & 4) != 0) {
            str3 = finder_Data.logo_url;
        }
        if ((i17 & 8) != 0) {
            l17 = finder_Data.finder_uin;
        }
        return finder_Data.copy(str, str2, str3, l17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLogo_url() {
        return this.logo_url;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getFinder_uin() {
        return this.finder_uin;
    }

    public final com.tencent.pigeon.biz_base.Finder_Data copy(java.lang.String username, java.lang.String nickname, java.lang.String logo_url, java.lang.Long finder_uin) {
        return new com.tencent.pigeon.biz_base.Finder_Data(username, nickname, logo_url, finder_uin);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.Finder_Data)) {
            return false;
        }
        com.tencent.pigeon.biz_base.Finder_Data finder_Data = (com.tencent.pigeon.biz_base.Finder_Data) other;
        return kotlin.jvm.internal.o.b(this.username, finder_Data.username) && kotlin.jvm.internal.o.b(this.nickname, finder_Data.nickname) && kotlin.jvm.internal.o.b(this.logo_url, finder_Data.logo_url) && kotlin.jvm.internal.o.b(this.finder_uin, finder_Data.finder_uin);
    }

    public final java.lang.Long getFinder_uin() {
        return this.finder_uin;
    }

    public final java.lang.String getLogo_url() {
        return this.logo_url;
    }

    public final java.lang.String getNickname() {
        return this.nickname;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        java.lang.String str = this.username;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.nickname;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.logo_url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l17 = this.finder_uin;
        return hashCode3 + (l17 != null ? l17.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, this.nickname, this.logo_url, this.finder_uin);
    }

    public java.lang.String toString() {
        return "Finder_Data(username=" + this.username + ", nickname=" + this.nickname + ", logo_url=" + this.logo_url + ", finder_uin=" + this.finder_uin + ')';
    }

    public Finder_Data(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17) {
        this.username = str;
        this.nickname = str2;
        this.logo_url = str3;
        this.finder_uin = l17;
    }

    public /* synthetic */ Finder_Data(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? null : l17);
    }
}
