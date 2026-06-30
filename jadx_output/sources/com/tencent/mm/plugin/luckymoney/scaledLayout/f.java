package com.tencent.mm.plugin.luckymoney.scaledLayout;

/* loaded from: classes15.dex */
public class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState[i17];
    }
}
