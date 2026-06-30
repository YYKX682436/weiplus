package e60;

/* loaded from: classes8.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry.CREATOR.createFromParcel(parcel));
        }
        return new com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs(arrayList, parcel.readInt(), parcel.readInt() == 0 ? null : com.tencent.mm.feature.gallery.api.BizPhotoTargetRect.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt(), com.tencent.mm.feature.gallery.api.BizData.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs[i17];
    }
}
