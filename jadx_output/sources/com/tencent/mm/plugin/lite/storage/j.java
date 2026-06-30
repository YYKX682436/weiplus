package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class j implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo liteAppConfigInfo = new com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo();
        liteAppConfigInfo.field_appId = parcel.readString();
        liteAppConfigInfo.field_signatureKey = parcel.readString();
        liteAppConfigInfo.field_packageConfigPath = parcel.readString();
        liteAppConfigInfo.field_updateTime = parcel.readLong();
        liteAppConfigInfo.field_md5 = parcel.readString();
        liteAppConfigInfo.field_dynamicConfigPath = parcel.readString();
        liteAppConfigInfo.field_iLinkVersion = parcel.readInt();
        liteAppConfigInfo.field_configJson = parcel.readString();
        return liteAppConfigInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo[i17];
    }
}
