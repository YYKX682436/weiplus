package com.tencent.mm.plugin.scanner;

/* loaded from: classes8.dex */
public class e0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.scanner.ImageQBarDataBean(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.scanner.ImageQBarDataBean[i17];
    }
}
