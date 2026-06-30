package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class k3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject[i17];
    }
}
