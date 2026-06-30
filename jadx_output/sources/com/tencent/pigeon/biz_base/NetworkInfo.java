package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0004\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/biz_base/NetworkInfo;", "", "type", "", "isFreeSimCard", "", "allowedMobileNet", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAllowedMobileNet", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tencent/pigeon/biz_base/NetworkInfo;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NetworkInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.NetworkInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.NetworkInfo.Companion(null);
    private final java.lang.Boolean allowedMobileNet;
    private final java.lang.Boolean isFreeSimCard;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/NetworkInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/NetworkInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.NetworkInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz_base.NetworkInfo((java.lang.String) list.get(0), (java.lang.Boolean) list.get(1), (java.lang.Boolean) list.get(2));
        }
    }

    public NetworkInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.NetworkInfo copy$default(com.tencent.pigeon.biz_base.NetworkInfo networkInfo, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = networkInfo.type;
        }
        if ((i17 & 2) != 0) {
            bool = networkInfo.isFreeSimCard;
        }
        if ((i17 & 4) != 0) {
            bool2 = networkInfo.allowedMobileNet;
        }
        return networkInfo.copy(str, bool, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getIsFreeSimCard() {
        return this.isFreeSimCard;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getAllowedMobileNet() {
        return this.allowedMobileNet;
    }

    public final com.tencent.pigeon.biz_base.NetworkInfo copy(java.lang.String type, java.lang.Boolean isFreeSimCard, java.lang.Boolean allowedMobileNet) {
        return new com.tencent.pigeon.biz_base.NetworkInfo(type, isFreeSimCard, allowedMobileNet);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.NetworkInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.NetworkInfo networkInfo = (com.tencent.pigeon.biz_base.NetworkInfo) other;
        return kotlin.jvm.internal.o.b(this.type, networkInfo.type) && kotlin.jvm.internal.o.b(this.isFreeSimCard, networkInfo.isFreeSimCard) && kotlin.jvm.internal.o.b(this.allowedMobileNet, networkInfo.allowedMobileNet);
    }

    public final java.lang.Boolean getAllowedMobileNet() {
        return this.allowedMobileNet;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public int hashCode() {
        java.lang.String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Boolean bool = this.isFreeSimCard;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Boolean bool2 = this.allowedMobileNet;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final java.lang.Boolean isFreeSimCard() {
        return this.isFreeSimCard;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.type, this.isFreeSimCard, this.allowedMobileNet);
    }

    public java.lang.String toString() {
        return "NetworkInfo(type=" + this.type + ", isFreeSimCard=" + this.isFreeSimCard + ", allowedMobileNet=" + this.allowedMobileNet + ')';
    }

    public NetworkInfo(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        this.type = str;
        this.isFreeSimCard = bool;
        this.allowedMobileNet = bool2;
    }

    public /* synthetic */ NetworkInfo(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : bool, (i17 & 4) != 0 ? null : bool2);
    }
}
