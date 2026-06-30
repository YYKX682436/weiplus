package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes10.dex */
public class GalleryItem$TimeMediaItem extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> CREATOR = new t23.d1();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public int getType() {
        return 5;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public java.lang.String o() {
        return null;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public java.lang.String toString() {
        return "TimeMediaItem{base=" + super.toString() + ", generateDate='" + this.f138435m + "', dateTag='" + this.f138436n + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f138435m);
        parcel.writeString(this.f138436n);
    }
}
