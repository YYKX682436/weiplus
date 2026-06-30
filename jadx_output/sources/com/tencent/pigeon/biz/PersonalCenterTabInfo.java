package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u000f\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/tencent/pigeon/biz/PersonalCenterTabInfo;", "", "groupList", "", "Lcom/tencent/pigeon/biz/PersonalCenterGroupInfo;", "interactiveIdentityEnable", "", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getGroupList", "()Ljava/util/List;", "getInteractiveIdentityEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/tencent/pigeon/biz/PersonalCenterTabInfo;", "equals", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalCenterTabInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.PersonalCenterTabInfo.Companion INSTANCE = new com.tencent.pigeon.biz.PersonalCenterTabInfo.Companion(null);
    private final java.util.List<com.tencent.pigeon.biz.PersonalCenterGroupInfo> groupList;
    private final java.lang.Boolean interactiveIdentityEnable;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/PersonalCenterTabInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/PersonalCenterTabInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.PersonalCenterTabInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz.PersonalCenterTabInfo((java.util.List) list.get(0), (java.lang.Boolean) list.get(1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalCenterTabInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz.PersonalCenterTabInfo copy$default(com.tencent.pigeon.biz.PersonalCenterTabInfo personalCenterTabInfo, java.util.List list, java.lang.Boolean bool, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = personalCenterTabInfo.groupList;
        }
        if ((i17 & 2) != 0) {
            bool = personalCenterTabInfo.interactiveIdentityEnable;
        }
        return personalCenterTabInfo.copy(list, bool);
    }

    public final java.util.List<com.tencent.pigeon.biz.PersonalCenterGroupInfo> component1() {
        return this.groupList;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getInteractiveIdentityEnable() {
        return this.interactiveIdentityEnable;
    }

    public final com.tencent.pigeon.biz.PersonalCenterTabInfo copy(java.util.List<com.tencent.pigeon.biz.PersonalCenterGroupInfo> groupList, java.lang.Boolean interactiveIdentityEnable) {
        return new com.tencent.pigeon.biz.PersonalCenterTabInfo(groupList, interactiveIdentityEnable);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.PersonalCenterTabInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.PersonalCenterTabInfo personalCenterTabInfo = (com.tencent.pigeon.biz.PersonalCenterTabInfo) other;
        return kotlin.jvm.internal.o.b(this.groupList, personalCenterTabInfo.groupList) && kotlin.jvm.internal.o.b(this.interactiveIdentityEnable, personalCenterTabInfo.interactiveIdentityEnable);
    }

    public final java.util.List<com.tencent.pigeon.biz.PersonalCenterGroupInfo> getGroupList() {
        return this.groupList;
    }

    public final java.lang.Boolean getInteractiveIdentityEnable() {
        return this.interactiveIdentityEnable;
    }

    public int hashCode() {
        java.util.List<com.tencent.pigeon.biz.PersonalCenterGroupInfo> list = this.groupList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.Boolean bool = this.interactiveIdentityEnable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.groupList, this.interactiveIdentityEnable);
    }

    public java.lang.String toString() {
        return "PersonalCenterTabInfo(groupList=" + this.groupList + ", interactiveIdentityEnable=" + this.interactiveIdentityEnable + ')';
    }

    public PersonalCenterTabInfo(java.util.List<com.tencent.pigeon.biz.PersonalCenterGroupInfo> list, java.lang.Boolean bool) {
        this.groupList = list;
        this.interactiveIdentityEnable = bool;
    }

    public /* synthetic */ PersonalCenterTabInfo(java.util.List list, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : list, (i17 & 2) != 0 ? null : bool);
    }
}
