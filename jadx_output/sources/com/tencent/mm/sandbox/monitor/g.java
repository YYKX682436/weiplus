package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class g implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.sandbox.monitor.ErrLog$Error(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.sandbox.monitor.ErrLog$Error[i17];
    }
}
