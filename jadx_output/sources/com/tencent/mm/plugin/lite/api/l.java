package com.tencent.mm.plugin.lite.api;

/* loaded from: classes14.dex */
public class l implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener[i17];
    }
}
