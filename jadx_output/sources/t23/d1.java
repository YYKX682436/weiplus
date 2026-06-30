package t23;

/* loaded from: classes10.dex */
public class d1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$TimeMediaItem galleryItem$TimeMediaItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$TimeMediaItem();
        galleryItem$TimeMediaItem.f138435m = parcel.readLong();
        galleryItem$TimeMediaItem.f138436n = parcel.readString();
        return galleryItem$TimeMediaItem;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem[i17];
    }
}
