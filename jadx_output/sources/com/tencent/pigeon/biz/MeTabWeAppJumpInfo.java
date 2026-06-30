package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0006\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/tencent/pigeon/biz/MeTabWeAppJumpInfo;", "", "bizType", "", "biz", "", "isInit", "draftType", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getBiz", "()Ljava/lang/String;", "getBizType", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDraftType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/biz/MeTabWeAppJumpInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MeTabWeAppJumpInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.MeTabWeAppJumpInfo.Companion INSTANCE = new com.tencent.pigeon.biz.MeTabWeAppJumpInfo.Companion(null);
    private final java.lang.String biz;
    private final java.lang.Long bizType;
    private final java.lang.Long draftType;
    private final java.lang.Long isInit;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/MeTabWeAppJumpInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/MeTabWeAppJumpInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.MeTabWeAppJumpInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.String str = (java.lang.String) list.get(1);
            java.lang.Object obj2 = list.get(2);
            java.lang.Long valueOf2 = obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2;
            java.lang.Object obj3 = list.get(3);
            return new com.tencent.pigeon.biz.MeTabWeAppJumpInfo(valueOf, str, valueOf2, obj3 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj3).intValue()) : (java.lang.Long) obj3);
        }
    }

    public MeTabWeAppJumpInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ com.tencent.pigeon.biz.MeTabWeAppJumpInfo copy$default(com.tencent.pigeon.biz.MeTabWeAppJumpInfo meTabWeAppJumpInfo, java.lang.Long l17, java.lang.String str, java.lang.Long l18, java.lang.Long l19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = meTabWeAppJumpInfo.bizType;
        }
        if ((i17 & 2) != 0) {
            str = meTabWeAppJumpInfo.biz;
        }
        if ((i17 & 4) != 0) {
            l18 = meTabWeAppJumpInfo.isInit;
        }
        if ((i17 & 8) != 0) {
            l19 = meTabWeAppJumpInfo.draftType;
        }
        return meTabWeAppJumpInfo.copy(l17, str, l18, l19);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getBizType() {
        return this.bizType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBiz() {
        return this.biz;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getIsInit() {
        return this.isInit;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getDraftType() {
        return this.draftType;
    }

    public final com.tencent.pigeon.biz.MeTabWeAppJumpInfo copy(java.lang.Long bizType, java.lang.String biz, java.lang.Long isInit, java.lang.Long draftType) {
        return new com.tencent.pigeon.biz.MeTabWeAppJumpInfo(bizType, biz, isInit, draftType);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.MeTabWeAppJumpInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.MeTabWeAppJumpInfo meTabWeAppJumpInfo = (com.tencent.pigeon.biz.MeTabWeAppJumpInfo) other;
        return kotlin.jvm.internal.o.b(this.bizType, meTabWeAppJumpInfo.bizType) && kotlin.jvm.internal.o.b(this.biz, meTabWeAppJumpInfo.biz) && kotlin.jvm.internal.o.b(this.isInit, meTabWeAppJumpInfo.isInit) && kotlin.jvm.internal.o.b(this.draftType, meTabWeAppJumpInfo.draftType);
    }

    public final java.lang.String getBiz() {
        return this.biz;
    }

    public final java.lang.Long getBizType() {
        return this.bizType;
    }

    public final java.lang.Long getDraftType() {
        return this.draftType;
    }

    public int hashCode() {
        java.lang.Long l17 = this.bizType;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.String str = this.biz;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Long l18 = this.isInit;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Long l19 = this.draftType;
        return hashCode3 + (l19 != null ? l19.hashCode() : 0);
    }

    public final java.lang.Long isInit() {
        return this.isInit;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.bizType, this.biz, this.isInit, this.draftType);
    }

    public java.lang.String toString() {
        return "MeTabWeAppJumpInfo(bizType=" + this.bizType + ", biz=" + this.biz + ", isInit=" + this.isInit + ", draftType=" + this.draftType + ')';
    }

    public MeTabWeAppJumpInfo(java.lang.Long l17, java.lang.String str, java.lang.Long l18, java.lang.Long l19) {
        this.bizType = l17;
        this.biz = str;
        this.isInit = l18;
        this.draftType = l19;
    }

    public /* synthetic */ MeTabWeAppJumpInfo(java.lang.Long l17, java.lang.String str, java.lang.Long l18, java.lang.Long l19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : str, (i17 & 4) != 0 ? null : l18, (i17 & 8) != 0 ? null : l19);
    }
}
