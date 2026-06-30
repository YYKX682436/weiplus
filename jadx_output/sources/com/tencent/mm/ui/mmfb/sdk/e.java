package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler[i17];
    }
}
