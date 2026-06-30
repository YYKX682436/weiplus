package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class LiteAppConfigInfo extends com.tencent.mm.plugin.lite.storage.c implements android.os.Parcelable {
    public static final l75.e0 B = com.tencent.mm.plugin.lite.storage.c.initAutoDBInfo(com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo> CREATOR = new com.tencent.mm.plugin.lite.storage.j();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.lite.storage.c, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }

    public java.lang.String toString() {
        return "LiteAppConfigInfo: {appId: " + this.field_appId + ", signatureKey: " + this.field_signatureKey + ", md5: " + this.field_md5 + ", updateTime: " + this.field_updateTime + ", ilinkVersion: " + this.field_iLinkVersion + ", packageConfigPath: " + this.field_packageConfigPath + ", dynamicConfigPath: " + this.field_dynamicConfigPath + ", configJson: " + this.field_configJson + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_appId);
        parcel.writeString(this.field_signatureKey);
        parcel.writeString(this.field_packageConfigPath);
        parcel.writeLong(this.field_updateTime);
        parcel.writeString(this.field_md5);
        parcel.writeString(this.field_dynamicConfigPath);
        parcel.writeInt(this.field_iLinkVersion);
        parcel.writeString(this.field_configJson);
    }
}
