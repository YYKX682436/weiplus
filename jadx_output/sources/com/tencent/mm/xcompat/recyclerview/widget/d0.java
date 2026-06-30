package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class d0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState[i17];
    }
}
