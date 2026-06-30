package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\nJ:\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\nR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/tencent/pigeon/biz/NotifyTabInfo;", "", "tabName", "", "notifyScene", "", "", "isDefaultTab", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotifyScene", "()Ljava/util/List;", "getTabName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/tencent/pigeon/biz/NotifyTabInfo;", "equals", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyTabInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.NotifyTabInfo.Companion INSTANCE = new com.tencent.pigeon.biz.NotifyTabInfo.Companion(null);
    private final java.lang.Boolean isDefaultTab;
    private final java.util.List<java.lang.Long> notifyScene;
    private final java.lang.String tabName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/NotifyTabInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/NotifyTabInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.NotifyTabInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz.NotifyTabInfo((java.lang.String) list.get(0), (java.util.List) list.get(1), (java.lang.Boolean) list.get(2));
        }
    }

    public NotifyTabInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz.NotifyTabInfo copy$default(com.tencent.pigeon.biz.NotifyTabInfo notifyTabInfo, java.lang.String str, java.util.List list, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = notifyTabInfo.tabName;
        }
        if ((i17 & 2) != 0) {
            list = notifyTabInfo.notifyScene;
        }
        if ((i17 & 4) != 0) {
            bool = notifyTabInfo.isDefaultTab;
        }
        return notifyTabInfo.copy(str, list, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTabName() {
        return this.tabName;
    }

    public final java.util.List<java.lang.Long> component2() {
        return this.notifyScene;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getIsDefaultTab() {
        return this.isDefaultTab;
    }

    public final com.tencent.pigeon.biz.NotifyTabInfo copy(java.lang.String tabName, java.util.List<java.lang.Long> notifyScene, java.lang.Boolean isDefaultTab) {
        return new com.tencent.pigeon.biz.NotifyTabInfo(tabName, notifyScene, isDefaultTab);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.NotifyTabInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.NotifyTabInfo notifyTabInfo = (com.tencent.pigeon.biz.NotifyTabInfo) other;
        return kotlin.jvm.internal.o.b(this.tabName, notifyTabInfo.tabName) && kotlin.jvm.internal.o.b(this.notifyScene, notifyTabInfo.notifyScene) && kotlin.jvm.internal.o.b(this.isDefaultTab, notifyTabInfo.isDefaultTab);
    }

    public final java.util.List<java.lang.Long> getNotifyScene() {
        return this.notifyScene;
    }

    public final java.lang.String getTabName() {
        return this.tabName;
    }

    public int hashCode() {
        java.lang.String str = this.tabName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.util.List<java.lang.Long> list = this.notifyScene;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.Boolean bool = this.isDefaultTab;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.Boolean isDefaultTab() {
        return this.isDefaultTab;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.tabName, this.notifyScene, this.isDefaultTab);
    }

    public java.lang.String toString() {
        return "NotifyTabInfo(tabName=" + this.tabName + ", notifyScene=" + this.notifyScene + ", isDefaultTab=" + this.isDefaultTab + ')';
    }

    public NotifyTabInfo(java.lang.String str, java.util.List<java.lang.Long> list, java.lang.Boolean bool) {
        this.tabName = str;
        this.notifyScene = list;
        this.isDefaultTab = bool;
    }

    public /* synthetic */ NotifyTabInfo(java.lang.String str, java.util.List list, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : list, (i17 & 4) != 0 ? null : bool);
    }
}
