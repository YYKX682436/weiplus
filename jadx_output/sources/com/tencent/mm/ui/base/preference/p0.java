package com.tencent.mm.ui.base.preference;

/* loaded from: classes13.dex */
public class p0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.ui.base.preference.Preference.BaseSavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.base.preference.Preference.BaseSavedState[i17];
    }
}
