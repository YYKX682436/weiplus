package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes15.dex */
public class w implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState[i17];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new com.tencent.mm.xcompat.viewpager2.widget.ViewPager2.SavedState(parcel, classLoader);
    }
}
