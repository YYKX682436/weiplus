package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class q1 implements android.os.Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public java.lang.Object createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState[i17];
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState(parcel, null);
    }
}
