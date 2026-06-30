package t23;

/* loaded from: classes10.dex */
public class a1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem galleryItem$ImageMediaItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem();
        galleryItem$ImageMediaItem.f138430e = parcel.readString();
        galleryItem$ImageMediaItem.f138433h = parcel.readString();
        galleryItem$ImageMediaItem.f138434i = parcel.readLong();
        galleryItem$ImageMediaItem.f138435m = parcel.readLong();
        galleryItem$ImageMediaItem.f138436n = parcel.readString();
        galleryItem$ImageMediaItem.f138438p = parcel.readString();
        galleryItem$ImageMediaItem.f138443u = (java.util.HashMap) parcel.readSerializable();
        galleryItem$ImageMediaItem.f138424v = parcel.readInt();
        galleryItem$ImageMediaItem.f138425w = parcel.readInt() != 0;
        galleryItem$ImageMediaItem.f138426x = parcel.readString();
        galleryItem$ImageMediaItem.f138427y = parcel.readString();
        return galleryItem$ImageMediaItem;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem[i17];
    }
}
