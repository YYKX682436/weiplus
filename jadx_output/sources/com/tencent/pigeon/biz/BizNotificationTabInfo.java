package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J.\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/biz/BizNotificationTabInfo;", "", "notifyMsgVersion", "", "tabList", "", "Lcom/tencent/pigeon/biz/NotifyTabInfo;", "(Ljava/lang/Long;Ljava/util/List;)V", "getNotifyMsgVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTabList", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lcom/tencent/pigeon/biz/BizNotificationTabInfo;", "equals", "", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizNotificationTabInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizNotificationTabInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizNotificationTabInfo.Companion(null);
    private final java.lang.Long notifyMsgVersion;
    private final java.util.List<com.tencent.pigeon.biz.NotifyTabInfo> tabList;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizNotificationTabInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizNotificationTabInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizNotificationTabInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            return new com.tencent.pigeon.biz.BizNotificationTabInfo(obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.util.List) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BizNotificationTabInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz.BizNotificationTabInfo copy$default(com.tencent.pigeon.biz.BizNotificationTabInfo bizNotificationTabInfo, java.lang.Long l17, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = bizNotificationTabInfo.notifyMsgVersion;
        }
        if ((i17 & 2) != 0) {
            list = bizNotificationTabInfo.tabList;
        }
        return bizNotificationTabInfo.copy(l17, list);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getNotifyMsgVersion() {
        return this.notifyMsgVersion;
    }

    public final java.util.List<com.tencent.pigeon.biz.NotifyTabInfo> component2() {
        return this.tabList;
    }

    public final com.tencent.pigeon.biz.BizNotificationTabInfo copy(java.lang.Long notifyMsgVersion, java.util.List<com.tencent.pigeon.biz.NotifyTabInfo> tabList) {
        return new com.tencent.pigeon.biz.BizNotificationTabInfo(notifyMsgVersion, tabList);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizNotificationTabInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.BizNotificationTabInfo bizNotificationTabInfo = (com.tencent.pigeon.biz.BizNotificationTabInfo) other;
        return kotlin.jvm.internal.o.b(this.notifyMsgVersion, bizNotificationTabInfo.notifyMsgVersion) && kotlin.jvm.internal.o.b(this.tabList, bizNotificationTabInfo.tabList);
    }

    public final java.lang.Long getNotifyMsgVersion() {
        return this.notifyMsgVersion;
    }

    public final java.util.List<com.tencent.pigeon.biz.NotifyTabInfo> getTabList() {
        return this.tabList;
    }

    public int hashCode() {
        java.lang.Long l17 = this.notifyMsgVersion;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.util.List<com.tencent.pigeon.biz.NotifyTabInfo> list = this.tabList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.notifyMsgVersion, this.tabList);
    }

    public java.lang.String toString() {
        return "BizNotificationTabInfo(notifyMsgVersion=" + this.notifyMsgVersion + ", tabList=" + this.tabList + ')';
    }

    public BizNotificationTabInfo(java.lang.Long l17, java.util.List<com.tencent.pigeon.biz.NotifyTabInfo> list) {
        this.notifyMsgVersion = l17;
        this.tabList = list;
    }

    public /* synthetic */ BizNotificationTabInfo(java.lang.Long l17, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : list);
    }
}
