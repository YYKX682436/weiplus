package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes10.dex */
public class GalleryItem$ImageMediaItem extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> CREATOR = new t23.a1();

    /* renamed from: v, reason: collision with root package name */
    public int f138424v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f138425w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f138426x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f138427y;

    public GalleryItem$ImageMediaItem() {
        this.f138424v = 0;
        this.f138425w = false;
        this.f138426x = "";
        this.f138427y = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public int getType() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public java.lang.String o() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f138433h) ? this.f138433h : this.f138430e;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public boolean r() {
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f138430e);
        parcel.writeString(this.f138433h);
        parcel.writeLong(this.f138434i);
        parcel.writeLong(this.f138435m);
        parcel.writeString(this.f138436n);
        parcel.writeString(this.f138438p);
        parcel.writeSerializable(this.f138443u);
        parcel.writeInt(this.f138424v);
        parcel.writeInt(this.f138425w ? 1 : 0);
        parcel.writeString(this.f138426x);
        parcel.writeString(this.f138427y);
    }

    public GalleryItem$ImageMediaItem(long j17) {
        super(j17);
        this.f138424v = 0;
        this.f138425w = false;
        this.f138426x = "";
        this.f138427y = "";
    }

    public GalleryItem$ImageMediaItem(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, str, str2, str3);
        this.f138424v = 0;
        this.f138425w = false;
        this.f138426x = "";
        this.f138427y = "";
    }
}
