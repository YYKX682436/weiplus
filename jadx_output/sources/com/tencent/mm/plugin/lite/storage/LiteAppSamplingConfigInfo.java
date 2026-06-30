package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class LiteAppSamplingConfigInfo extends com.tencent.mm.plugin.lite.storage.e implements android.os.Parcelable {

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f144172z = com.tencent.mm.plugin.lite.storage.e.initAutoDBInfo(com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo> CREATOR = new com.tencent.mm.plugin.lite.storage.n();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.lite.storage.e, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }

    public java.lang.String toString() {
        return "LiteAppSamplingConfigInfo: {appId: " + this.field_appId + ", signatureKey: " + this.field_signatureKey + ", updateTime: " + this.field_updateTime + ", md5: " + this.field_md5 + ", dynamicConfigPath: " + this.field_dynamicConfigPath + ", iLinkVersion: " + this.field_iLinkVersion + ", configJson: " + this.field_configJson + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.field_appId);
        parcel.writeString(this.field_signatureKey);
        parcel.writeLong(this.field_updateTime);
        parcel.writeString(this.field_md5);
        parcel.writeString(this.field_dynamicConfigPath);
        parcel.writeInt(this.field_iLinkVersion);
        parcel.writeString(this.field_configJson);
    }
}
