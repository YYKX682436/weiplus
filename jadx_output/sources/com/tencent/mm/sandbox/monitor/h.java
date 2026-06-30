package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class h implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.sandbox.monitor.ErrLog$PreventError(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.sandbox.monitor.ErrLog$PreventError[i17];
    }
}
