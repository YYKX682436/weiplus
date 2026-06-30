package com.tencent.pigeon.fav_list;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavFilterTypeInfo;", "", "displayName", "", "typeKey", "bitMask", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getBitMask", "()J", "getDisplayName", "()Ljava/lang/String;", "getTypeKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FavFilterTypeInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.fav_list.FavFilterTypeInfo.Companion INSTANCE = new com.tencent.pigeon.fav_list.FavFilterTypeInfo.Companion(null);
    private final long bitMask;
    private final java.lang.String displayName;
    private final java.lang.String typeKey;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavFilterTypeInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/fav_list/FavFilterTypeInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.fav_list.FavFilterTypeInfo fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(2);
            if (obj3 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj3).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj3).longValue();
            }
            return new com.tencent.pigeon.fav_list.FavFilterTypeInfo(str, str2, longValue);
        }
    }

    public FavFilterTypeInfo(java.lang.String displayName, java.lang.String typeKey, long j17) {
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(typeKey, "typeKey");
        this.displayName = displayName;
        this.typeKey = typeKey;
        this.bitMask = j17;
    }

    public static /* synthetic */ com.tencent.pigeon.fav_list.FavFilterTypeInfo copy$default(com.tencent.pigeon.fav_list.FavFilterTypeInfo favFilterTypeInfo, java.lang.String str, java.lang.String str2, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = favFilterTypeInfo.displayName;
        }
        if ((i17 & 2) != 0) {
            str2 = favFilterTypeInfo.typeKey;
        }
        if ((i17 & 4) != 0) {
            j17 = favFilterTypeInfo.bitMask;
        }
        return favFilterTypeInfo.copy(str, str2, j17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTypeKey() {
        return this.typeKey;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBitMask() {
        return this.bitMask;
    }

    public final com.tencent.pigeon.fav_list.FavFilterTypeInfo copy(java.lang.String displayName, java.lang.String typeKey, long bitMask) {
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(typeKey, "typeKey");
        return new com.tencent.pigeon.fav_list.FavFilterTypeInfo(displayName, typeKey, bitMask);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.fav_list.FavFilterTypeInfo)) {
            return false;
        }
        com.tencent.pigeon.fav_list.FavFilterTypeInfo favFilterTypeInfo = (com.tencent.pigeon.fav_list.FavFilterTypeInfo) other;
        return kotlin.jvm.internal.o.b(this.displayName, favFilterTypeInfo.displayName) && kotlin.jvm.internal.o.b(this.typeKey, favFilterTypeInfo.typeKey) && this.bitMask == favFilterTypeInfo.bitMask;
    }

    public final long getBitMask() {
        return this.bitMask;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getTypeKey() {
        return this.typeKey;
    }

    public int hashCode() {
        return (((this.displayName.hashCode() * 31) + this.typeKey.hashCode()) * 31) + java.lang.Long.hashCode(this.bitMask);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.displayName, this.typeKey, java.lang.Long.valueOf(this.bitMask));
    }

    public java.lang.String toString() {
        return "FavFilterTypeInfo(displayName=" + this.displayName + ", typeKey=" + this.typeKey + ", bitMask=" + this.bitMask + ')';
    }
}
