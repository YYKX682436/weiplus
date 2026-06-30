package com.tencent.pigeon.ecs;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\u000e\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000106J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00069"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsAddressStruct;", "", "userName", "", "postalCode", "nationalCode", "telNumber", "province", "city", "county", "street", "detail", "houseNum", "addressId", "", "disable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getAddressId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCity", "()Ljava/lang/String;", "getCounty", "getDetail", "getDisable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHouseNum", "getNationalCode", "getPostalCode", "getProvince", "getStreet", "getTelNumber", "getUserName", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/tencent/pigeon/ecs/EcsAddressStruct;", "equals", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class EcsAddressStruct {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ecs.EcsAddressStruct.Companion INSTANCE = new com.tencent.pigeon.ecs.EcsAddressStruct.Companion(null);
    private final java.lang.Long addressId;
    private final java.lang.String city;
    private final java.lang.String county;
    private final java.lang.String detail;
    private final java.lang.Boolean disable;
    private final java.lang.String houseNum;
    private final java.lang.String nationalCode;
    private final java.lang.String postalCode;
    private final java.lang.String province;
    private final java.lang.String street;
    private final java.lang.String telNumber;
    private final java.lang.String userName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ecs/EcsAddressStruct$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ecs/EcsAddressStruct;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ecs.EcsAddressStruct fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.String str = (java.lang.String) list.get(0);
            java.lang.String str2 = (java.lang.String) list.get(1);
            java.lang.String str3 = (java.lang.String) list.get(2);
            java.lang.String str4 = (java.lang.String) list.get(3);
            java.lang.String str5 = (java.lang.String) list.get(4);
            java.lang.String str6 = (java.lang.String) list.get(5);
            java.lang.String str7 = (java.lang.String) list.get(6);
            java.lang.String str8 = (java.lang.String) list.get(7);
            java.lang.String str9 = (java.lang.String) list.get(8);
            java.lang.String str10 = (java.lang.String) list.get(9);
            java.lang.Object obj = list.get(10);
            return new com.tencent.pigeon.ecs.EcsAddressStruct(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj, (java.lang.Boolean) list.get(11));
        }
    }

    public EcsAddressStruct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserName() {
        return this.userName;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getHouseNum() {
        return this.houseNum;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.Long getAddressId() {
        return this.addressId;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.Boolean getDisable() {
        return this.disable;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getNationalCode() {
        return this.nationalCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTelNumber() {
        return this.telNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getProvince() {
        return this.province;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCity() {
        return this.city;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getCounty() {
        return this.county;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getStreet() {
        return this.street;
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getDetail() {
        return this.detail;
    }

    public final com.tencent.pigeon.ecs.EcsAddressStruct copy(java.lang.String userName, java.lang.String postalCode, java.lang.String nationalCode, java.lang.String telNumber, java.lang.String province, java.lang.String city, java.lang.String county, java.lang.String street, java.lang.String detail, java.lang.String houseNum, java.lang.Long addressId, java.lang.Boolean disable) {
        return new com.tencent.pigeon.ecs.EcsAddressStruct(userName, postalCode, nationalCode, telNumber, province, city, county, street, detail, houseNum, addressId, disable);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ecs.EcsAddressStruct)) {
            return false;
        }
        com.tencent.pigeon.ecs.EcsAddressStruct ecsAddressStruct = (com.tencent.pigeon.ecs.EcsAddressStruct) other;
        return kotlin.jvm.internal.o.b(this.userName, ecsAddressStruct.userName) && kotlin.jvm.internal.o.b(this.postalCode, ecsAddressStruct.postalCode) && kotlin.jvm.internal.o.b(this.nationalCode, ecsAddressStruct.nationalCode) && kotlin.jvm.internal.o.b(this.telNumber, ecsAddressStruct.telNumber) && kotlin.jvm.internal.o.b(this.province, ecsAddressStruct.province) && kotlin.jvm.internal.o.b(this.city, ecsAddressStruct.city) && kotlin.jvm.internal.o.b(this.county, ecsAddressStruct.county) && kotlin.jvm.internal.o.b(this.street, ecsAddressStruct.street) && kotlin.jvm.internal.o.b(this.detail, ecsAddressStruct.detail) && kotlin.jvm.internal.o.b(this.houseNum, ecsAddressStruct.houseNum) && kotlin.jvm.internal.o.b(this.addressId, ecsAddressStruct.addressId) && kotlin.jvm.internal.o.b(this.disable, ecsAddressStruct.disable);
    }

    public final java.lang.Long getAddressId() {
        return this.addressId;
    }

    public final java.lang.String getCity() {
        return this.city;
    }

    public final java.lang.String getCounty() {
        return this.county;
    }

    public final java.lang.String getDetail() {
        return this.detail;
    }

    public final java.lang.Boolean getDisable() {
        return this.disable;
    }

    public final java.lang.String getHouseNum() {
        return this.houseNum;
    }

    public final java.lang.String getNationalCode() {
        return this.nationalCode;
    }

    public final java.lang.String getPostalCode() {
        return this.postalCode;
    }

    public final java.lang.String getProvince() {
        return this.province;
    }

    public final java.lang.String getStreet() {
        return this.street;
    }

    public final java.lang.String getTelNumber() {
        return this.telNumber;
    }

    public final java.lang.String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        java.lang.String str = this.userName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.postalCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.nationalCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.telNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.province;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.city;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.county;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.street;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.detail;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.houseNum;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        java.lang.Long l17 = this.addressId;
        int hashCode11 = (hashCode10 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Boolean bool = this.disable;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.userName, this.postalCode, this.nationalCode, this.telNumber, this.province, this.city, this.county, this.street, this.detail, this.houseNum, this.addressId, this.disable);
    }

    public java.lang.String toString() {
        return "EcsAddressStruct(userName=" + this.userName + ", postalCode=" + this.postalCode + ", nationalCode=" + this.nationalCode + ", telNumber=" + this.telNumber + ", province=" + this.province + ", city=" + this.city + ", county=" + this.county + ", street=" + this.street + ", detail=" + this.detail + ", houseNum=" + this.houseNum + ", addressId=" + this.addressId + ", disable=" + this.disable + ')';
    }

    public EcsAddressStruct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.Long l17, java.lang.Boolean bool) {
        this.userName = str;
        this.postalCode = str2;
        this.nationalCode = str3;
        this.telNumber = str4;
        this.province = str5;
        this.city = str6;
        this.county = str7;
        this.street = str8;
        this.detail = str9;
        this.houseNum = str10;
        this.addressId = l17;
        this.disable = bool;
    }

    public /* synthetic */ EcsAddressStruct(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.Long l17, java.lang.Boolean bool, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? null : str4, (i17 & 16) != 0 ? null : str5, (i17 & 32) != 0 ? null : str6, (i17 & 64) != 0 ? null : str7, (i17 & 128) != 0 ? null : str8, (i17 & 256) != 0 ? null : str9, (i17 & 512) != 0 ? null : str10, (i17 & 1024) != 0 ? null : l17, (i17 & 2048) == 0 ? bool : null);
    }
}
