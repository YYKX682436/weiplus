package com.tencent.pigeon.fav_list;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tJ\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/tencent/pigeon/fav_list/FavLocationCity;", "", "cityName", "", "count", "", "isCurrentLocation", "", "itemLocalIds", "", "items", "Lcom/tencent/pigeon/fav_list/FavoritesItemWrapper;", "(Ljava/lang/String;JZLjava/util/List;Ljava/util/List;)V", "getCityName", "()Ljava/lang/String;", "getCount", "()J", "()Z", "getItemLocalIds", "()Ljava/util/List;", "getItems", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FavLocationCity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.fav_list.FavLocationCity.Companion INSTANCE = new com.tencent.pigeon.fav_list.FavLocationCity.Companion(null);
    private final java.lang.String cityName;
    private final long count;
    private final boolean isCurrentLocation;
    private final java.util.List<java.lang.Long> itemLocalIds;
    private final java.util.List<com.tencent.pigeon.fav_list.FavoritesItemWrapper> items;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavLocationCity$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/fav_list/FavLocationCity;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.fav_list.FavLocationCity fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            long j17 = longValue;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Long?>");
            java.lang.Object obj5 = list.get(4);
            kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.fav_list.FavoritesItemWrapper?>");
            return new com.tencent.pigeon.fav_list.FavLocationCity(str, j17, booleanValue, (java.util.List) obj4, (java.util.List) obj5);
        }
    }

    public FavLocationCity(java.lang.String cityName, long j17, boolean z17, java.util.List<java.lang.Long> itemLocalIds, java.util.List<com.tencent.pigeon.fav_list.FavoritesItemWrapper> items) {
        kotlin.jvm.internal.o.g(cityName, "cityName");
        kotlin.jvm.internal.o.g(itemLocalIds, "itemLocalIds");
        kotlin.jvm.internal.o.g(items, "items");
        this.cityName = cityName;
        this.count = j17;
        this.isCurrentLocation = z17;
        this.itemLocalIds = itemLocalIds;
        this.items = items;
    }

    public static /* synthetic */ com.tencent.pigeon.fav_list.FavLocationCity copy$default(com.tencent.pigeon.fav_list.FavLocationCity favLocationCity, java.lang.String str, long j17, boolean z17, java.util.List list, java.util.List list2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = favLocationCity.cityName;
        }
        if ((i17 & 2) != 0) {
            j17 = favLocationCity.count;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            z17 = favLocationCity.isCurrentLocation;
        }
        boolean z18 = z17;
        if ((i17 & 8) != 0) {
            list = favLocationCity.itemLocalIds;
        }
        java.util.List list3 = list;
        if ((i17 & 16) != 0) {
            list2 = favLocationCity.items;
        }
        return favLocationCity.copy(str, j18, z18, list3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCityName() {
        return this.cityName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCurrentLocation() {
        return this.isCurrentLocation;
    }

    public final java.util.List<java.lang.Long> component4() {
        return this.itemLocalIds;
    }

    public final java.util.List<com.tencent.pigeon.fav_list.FavoritesItemWrapper> component5() {
        return this.items;
    }

    public final com.tencent.pigeon.fav_list.FavLocationCity copy(java.lang.String cityName, long count, boolean isCurrentLocation, java.util.List<java.lang.Long> itemLocalIds, java.util.List<com.tencent.pigeon.fav_list.FavoritesItemWrapper> items) {
        kotlin.jvm.internal.o.g(cityName, "cityName");
        kotlin.jvm.internal.o.g(itemLocalIds, "itemLocalIds");
        kotlin.jvm.internal.o.g(items, "items");
        return new com.tencent.pigeon.fav_list.FavLocationCity(cityName, count, isCurrentLocation, itemLocalIds, items);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.fav_list.FavLocationCity)) {
            return false;
        }
        com.tencent.pigeon.fav_list.FavLocationCity favLocationCity = (com.tencent.pigeon.fav_list.FavLocationCity) other;
        return kotlin.jvm.internal.o.b(this.cityName, favLocationCity.cityName) && this.count == favLocationCity.count && this.isCurrentLocation == favLocationCity.isCurrentLocation && kotlin.jvm.internal.o.b(this.itemLocalIds, favLocationCity.itemLocalIds) && kotlin.jvm.internal.o.b(this.items, favLocationCity.items);
    }

    public final java.lang.String getCityName() {
        return this.cityName;
    }

    public final long getCount() {
        return this.count;
    }

    public final java.util.List<java.lang.Long> getItemLocalIds() {
        return this.itemLocalIds;
    }

    public final java.util.List<com.tencent.pigeon.fav_list.FavoritesItemWrapper> getItems() {
        return this.items;
    }

    public int hashCode() {
        return (((((((this.cityName.hashCode() * 31) + java.lang.Long.hashCode(this.count)) * 31) + java.lang.Boolean.hashCode(this.isCurrentLocation)) * 31) + this.itemLocalIds.hashCode()) * 31) + this.items.hashCode();
    }

    public final boolean isCurrentLocation() {
        return this.isCurrentLocation;
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.cityName, java.lang.Long.valueOf(this.count), java.lang.Boolean.valueOf(this.isCurrentLocation), this.itemLocalIds, this.items);
    }

    public java.lang.String toString() {
        return "FavLocationCity(cityName=" + this.cityName + ", count=" + this.count + ", isCurrentLocation=" + this.isCurrentLocation + ", itemLocalIds=" + this.itemLocalIds + ", items=" + this.items + ')';
    }
}
