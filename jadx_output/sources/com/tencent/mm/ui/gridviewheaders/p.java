package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes13.dex */
public class p implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState[i17];
    }
}
