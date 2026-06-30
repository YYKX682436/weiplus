package t23;

/* loaded from: classes10.dex */
public class b1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem();
        galleryItem$LivePhotoMediaItem.f138430e = parcel.readString();
        galleryItem$LivePhotoMediaItem.f138433h = parcel.readString();
        galleryItem$LivePhotoMediaItem.f138434i = parcel.readLong();
        galleryItem$LivePhotoMediaItem.f138435m = parcel.readLong();
        galleryItem$LivePhotoMediaItem.f138436n = parcel.readString();
        galleryItem$LivePhotoMediaItem.f138438p = parcel.readString();
        galleryItem$LivePhotoMediaItem.f138443u = (java.util.HashMap) parcel.readSerializable();
        galleryItem$LivePhotoMediaItem.f138428z = parcel.readInt();
        galleryItem$LivePhotoMediaItem.A = parcel.readInt();
        galleryItem$LivePhotoMediaItem.B = parcel.readInt();
        galleryItem$LivePhotoMediaItem.C = parcel.readInt();
        galleryItem$LivePhotoMediaItem.D = parcel.readInt();
        galleryItem$LivePhotoMediaItem.E = parcel.readInt();
        galleryItem$LivePhotoMediaItem.F = parcel.readLong();
        galleryItem$LivePhotoMediaItem.G = parcel.readInt();
        galleryItem$LivePhotoMediaItem.H = parcel.readInt();
        galleryItem$LivePhotoMediaItem.I = parcel.readInt();
        return galleryItem$LivePhotoMediaItem;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem[i17];
    }
}
