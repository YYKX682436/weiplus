package e60;

/* loaded from: classes8.dex */
public final class c implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry[i17];
    }
}
