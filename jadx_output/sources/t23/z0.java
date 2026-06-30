package t23;

/* loaded from: classes10.dex */
public class z0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem[i17];
    }
}
