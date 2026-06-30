package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask[i17];
    }
}
