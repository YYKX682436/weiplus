package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/ting/TingBrandContactInfo;", "", dm.i4.COL_USERNAME, "", "isSubscribe", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUsername", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/tencent/pigeon/ting/TingBrandContactInfo;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingBrandContactInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingBrandContactInfo.Companion INSTANCE = new com.tencent.pigeon.ting.TingBrandContactInfo.Companion(null);
    private final java.lang.Boolean isSubscribe;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingBrandContactInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingBrandContactInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingBrandContactInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.ting.TingBrandContactInfo((java.lang.String) list.get(0), (java.lang.Boolean) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TingBrandContactInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.TingBrandContactInfo copy$default(com.tencent.pigeon.ting.TingBrandContactInfo tingBrandContactInfo, java.lang.String str, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = tingBrandContactInfo.username;
        }
        if ((i17 & 2) != 0) {
            bool = tingBrandContactInfo.isSubscribe;
        }
        return tingBrandContactInfo.copy(str, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    public final com.tencent.pigeon.ting.TingBrandContactInfo copy(java.lang.String username, java.lang.Boolean isSubscribe) {
        return new com.tencent.pigeon.ting.TingBrandContactInfo(username, isSubscribe);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingBrandContactInfo)) {
            return false;
        }
        com.tencent.pigeon.ting.TingBrandContactInfo tingBrandContactInfo = (com.tencent.pigeon.ting.TingBrandContactInfo) other;
        return kotlin.jvm.internal.o.b(this.username, tingBrandContactInfo.username) && kotlin.jvm.internal.o.b(this.isSubscribe, tingBrandContactInfo.isSubscribe);
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        java.lang.String str = this.username;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Boolean bool = this.isSubscribe;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.Boolean isSubscribe() {
        return this.isSubscribe;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, this.isSubscribe);
    }

    public java.lang.String toString() {
        return "TingBrandContactInfo(username=" + this.username + ", isSubscribe=" + this.isSubscribe + ')';
    }

    public TingBrandContactInfo(java.lang.String str, java.lang.Boolean bool) {
        this.username = str;
        this.isSubscribe = bool;
    }

    public /* synthetic */ TingBrandContactInfo(java.lang.String str, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : bool);
    }
}
