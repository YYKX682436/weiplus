package com.tencent.mm.ui.widget.progress;

/* loaded from: classes13.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.widget.progress.MMProgressWheel.WheelSavedState[i17];
    }
}
