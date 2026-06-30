package com.tencent.xweb.pinus.sdk.library_loader;

/* loaded from: classes12.dex */
public class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.xweb.pinus.sdk.library_loader.Linker.LibInfo[i17];
    }
}
