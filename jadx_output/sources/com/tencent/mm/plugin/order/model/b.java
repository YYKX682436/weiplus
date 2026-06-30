package com.tencent.mm.plugin.order.model;

/* loaded from: classes9.dex */
public class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.order.model.ProductSectionItem.Skus(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.order.model.ProductSectionItem.Skus[i17];
    }
}
