package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class n implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo liteAppSamplingConfigInfo = new com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo();
        liteAppSamplingConfigInfo.field_appId = parcel.readString();
        liteAppSamplingConfigInfo.field_signatureKey = parcel.readString();
        liteAppSamplingConfigInfo.field_updateTime = parcel.readLong();
        liteAppSamplingConfigInfo.field_md5 = parcel.readString();
        liteAppSamplingConfigInfo.field_dynamicConfigPath = parcel.readString();
        liteAppSamplingConfigInfo.field_iLinkVersion = parcel.readInt();
        liteAppSamplingConfigInfo.field_configJson = parcel.readString();
        return liteAppSamplingConfigInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo[i17];
    }
}
