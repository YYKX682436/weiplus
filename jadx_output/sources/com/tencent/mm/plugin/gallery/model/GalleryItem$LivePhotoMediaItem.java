package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes10.dex */
public class GalleryItem$LivePhotoMediaItem extends com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> CREATOR = new t23.b1();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public int G;
    public int H;
    public int I;

    /* renamed from: z, reason: collision with root package name */
    public int f138428z;

    public GalleryItem$LivePhotoMediaItem() {
        this.f138428z = 6;
        this.G = 0;
        this.H = 1;
        this.I = 1;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public int getType() {
        return this.f138428z;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public java.lang.String toString() {
        return "LivePhotoMediaItem{base=" + super.toString() + ", type=" + this.f138428z + ", state=" + this.A + ", videoDuration=" + this.B + ", videoHeight=" + this.D + ", videoWidth=" + this.C + ", videoSize=" + this.E + ", coverTimeStampMs=" + this.F + ", isParsedVideo=" + this.G + ", isValid=" + this.H + '}';
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f138430e);
        parcel.writeString(this.f138433h);
        parcel.writeLong(this.f138434i);
        parcel.writeLong(this.f138435m);
        parcel.writeString(this.f138436n);
        parcel.writeString(this.f138438p);
        parcel.writeSerializable(this.f138443u);
        parcel.writeInt(this.f138428z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeLong(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
    }

    public GalleryItem$LivePhotoMediaItem(long j17) {
        super(j17);
        this.f138428z = 6;
        this.G = 0;
        this.H = 1;
        this.I = 1;
    }

    public GalleryItem$LivePhotoMediaItem(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, str, str2, str3);
        this.f138428z = 6;
        this.G = 0;
        this.H = 1;
        this.I = 1;
    }
}
