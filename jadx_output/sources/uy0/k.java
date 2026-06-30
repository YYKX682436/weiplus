package uy0;

/* loaded from: classes4.dex */
public final class k implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(parcel.readParcelable(com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams.class.getClassLoader()));
        }
        return new com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : com.tencent.mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.mj_template.api.MaasAlbumMultiTemplateRequestParams[i17];
    }
}
