package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tencent/pigeon/biz/PersonalCenterGroupInfo;", "", "cellList", "", "Lcom/tencent/pigeon/biz/PersonalCenterSingleTabInfo;", "(Ljava/util/List;)V", "getCellList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PersonalCenterGroupInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.PersonalCenterGroupInfo.Companion INSTANCE = new com.tencent.pigeon.biz.PersonalCenterGroupInfo.Companion(null);
    private final java.util.List<com.tencent.pigeon.biz.PersonalCenterSingleTabInfo> cellList;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/PersonalCenterGroupInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/PersonalCenterGroupInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.PersonalCenterGroupInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            return new com.tencent.pigeon.biz.PersonalCenterGroupInfo((java.util.List) list.get(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalCenterGroupInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz.PersonalCenterGroupInfo copy$default(com.tencent.pigeon.biz.PersonalCenterGroupInfo personalCenterGroupInfo, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = personalCenterGroupInfo.cellList;
        }
        return personalCenterGroupInfo.copy(list);
    }

    public final java.util.List<com.tencent.pigeon.biz.PersonalCenterSingleTabInfo> component1() {
        return this.cellList;
    }

    public final com.tencent.pigeon.biz.PersonalCenterGroupInfo copy(java.util.List<com.tencent.pigeon.biz.PersonalCenterSingleTabInfo> cellList) {
        return new com.tencent.pigeon.biz.PersonalCenterGroupInfo(cellList);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.tencent.pigeon.biz.PersonalCenterGroupInfo) && kotlin.jvm.internal.o.b(this.cellList, ((com.tencent.pigeon.biz.PersonalCenterGroupInfo) other).cellList);
    }

    public final java.util.List<com.tencent.pigeon.biz.PersonalCenterSingleTabInfo> getCellList() {
        return this.cellList;
    }

    public int hashCode() {
        java.util.List<com.tencent.pigeon.biz.PersonalCenterSingleTabInfo> list = this.cellList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.b0.c(this.cellList);
    }

    public java.lang.String toString() {
        return "PersonalCenterGroupInfo(cellList=" + this.cellList + ')';
    }

    public PersonalCenterGroupInfo(java.util.List<com.tencent.pigeon.biz.PersonalCenterSingleTabInfo> list) {
        this.cellList = list;
    }

    public /* synthetic */ PersonalCenterGroupInfo(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : list);
    }
}
