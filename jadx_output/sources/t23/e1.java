package t23;

/* loaded from: classes10.dex */
public class e1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem();
        galleryItem$VideoMediaItem.f138430e = parcel.readString();
        galleryItem$VideoMediaItem.f138433h = parcel.readString();
        galleryItem$VideoMediaItem.f138434i = parcel.readLong();
        galleryItem$VideoMediaItem.f138438p = parcel.readString();
        galleryItem$VideoMediaItem.f138448z = parcel.readInt();
        galleryItem$VideoMediaItem.f138447y = parcel.readInt();
        galleryItem$VideoMediaItem.f138446x = parcel.readInt();
        galleryItem$VideoMediaItem.f138444v = parcel.readString();
        galleryItem$VideoMediaItem.f138445w = parcel.readString();
        galleryItem$VideoMediaItem.B = parcel.readInt();
        galleryItem$VideoMediaItem.C = parcel.readInt();
        galleryItem$VideoMediaItem.A = parcel.readInt();
        galleryItem$VideoMediaItem.D = parcel.readInt();
        galleryItem$VideoMediaItem.f138435m = parcel.readLong();
        galleryItem$VideoMediaItem.f138436n = parcel.readString();
        galleryItem$VideoMediaItem.f138443u = (java.util.HashMap) parcel.readSerializable();
        return galleryItem$VideoMediaItem;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem[i17];
    }
}
