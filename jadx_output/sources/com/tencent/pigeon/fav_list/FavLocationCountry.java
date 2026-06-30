package com.tencent.pigeon.fav_list;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavLocationCountry;", "", "countryName", "", "cities", "", "Lcom/tencent/pigeon/fav_list/FavLocationCity;", "(Ljava/lang/String;Ljava/util/List;)V", "getCities", "()Ljava/util/List;", "getCountryName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class FavLocationCountry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.fav_list.FavLocationCountry.Companion INSTANCE = new com.tencent.pigeon.fav_list.FavLocationCountry.Companion(null);
    private final java.util.List<com.tencent.pigeon.fav_list.FavLocationCity> cities;
    private final java.lang.String countryName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/fav_list/FavLocationCountry$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/fav_list/FavLocationCountry;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.fav_list.FavLocationCountry fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.pigeon.fav_list.FavLocationCity?>");
            return new com.tencent.pigeon.fav_list.FavLocationCountry((java.lang.String) obj, (java.util.List) obj2);
        }
    }

    public FavLocationCountry(java.lang.String countryName, java.util.List<com.tencent.pigeon.fav_list.FavLocationCity> cities) {
        kotlin.jvm.internal.o.g(countryName, "countryName");
        kotlin.jvm.internal.o.g(cities, "cities");
        this.countryName = countryName;
        this.cities = cities;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.fav_list.FavLocationCountry copy$default(com.tencent.pigeon.fav_list.FavLocationCountry favLocationCountry, java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = favLocationCountry.countryName;
        }
        if ((i17 & 2) != 0) {
            list = favLocationCountry.cities;
        }
        return favLocationCountry.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountryName() {
        return this.countryName;
    }

    public final java.util.List<com.tencent.pigeon.fav_list.FavLocationCity> component2() {
        return this.cities;
    }

    public final com.tencent.pigeon.fav_list.FavLocationCountry copy(java.lang.String countryName, java.util.List<com.tencent.pigeon.fav_list.FavLocationCity> cities) {
        kotlin.jvm.internal.o.g(countryName, "countryName");
        kotlin.jvm.internal.o.g(cities, "cities");
        return new com.tencent.pigeon.fav_list.FavLocationCountry(countryName, cities);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.fav_list.FavLocationCountry)) {
            return false;
        }
        com.tencent.pigeon.fav_list.FavLocationCountry favLocationCountry = (com.tencent.pigeon.fav_list.FavLocationCountry) other;
        return kotlin.jvm.internal.o.b(this.countryName, favLocationCountry.countryName) && kotlin.jvm.internal.o.b(this.cities, favLocationCountry.cities);
    }

    public final java.util.List<com.tencent.pigeon.fav_list.FavLocationCity> getCities() {
        return this.cities;
    }

    public final java.lang.String getCountryName() {
        return this.countryName;
    }

    public int hashCode() {
        return (this.countryName.hashCode() * 31) + this.cities.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.countryName, this.cities);
    }

    public java.lang.String toString() {
        return "FavLocationCountry(countryName=" + this.countryName + ", cities=" + this.cities + ')';
    }
}
