package com.tencent.mm.plugin.walletlock.gesture.ui.widget;

/* loaded from: classes13.dex */
public class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.SavedState[i17];
    }
}
