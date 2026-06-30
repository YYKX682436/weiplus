package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes10.dex */
public class GalleryItem$VideoMediaItem extends com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> CREATOR = new t23.e1();
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f138444v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f138445w;

    /* renamed from: x, reason: collision with root package name */
    public int f138446x;

    /* renamed from: y, reason: collision with root package name */
    public int f138447y;

    /* renamed from: z, reason: collision with root package name */
    public int f138448z;

    public GalleryItem$VideoMediaItem() {
        this.f138446x = -1;
        this.f138447y = -1;
        this.f138448z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public int getType() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public java.lang.String o() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(this.f138433h) ? this.f138433h : this.f138430e;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public boolean r() {
        return false;
    }

    @Override // com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem
    public java.lang.String toString() {
        return "VideoMediaItem{base=" + super.toString() + ", videoTrackMime='" + this.f138444v + "', audioTrackMime='" + this.f138445w + "', durationMs=" + this.f138446x + ", videoHeight=" + this.f138447y + ", videoWidth=" + this.f138448z + ", videoBitRate=" + this.A + ", videoIFrameInterval=" + this.B + ", videoFrameRate=" + this.C + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f138430e);
        parcel.writeString(this.f138433h);
        parcel.writeLong(this.f138434i);
        parcel.writeString(this.f138438p);
        parcel.writeInt(this.f138448z);
        parcel.writeInt(this.f138447y);
        parcel.writeInt(this.f138446x);
        parcel.writeString(this.f138444v);
        parcel.writeString(this.f138445w);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.A);
        parcel.writeInt(this.D);
        parcel.writeLong(this.f138435m);
        parcel.writeString(this.f138436n);
        parcel.writeSerializable(this.f138443u);
    }

    public GalleryItem$VideoMediaItem(long j17) {
        super(j17);
        this.f138446x = -1;
        this.f138447y = -1;
        this.f138448z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
    }

    public GalleryItem$VideoMediaItem(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(j17, str, str2, str3);
        this.f138446x = -1;
        this.f138447y = -1;
        this.f138448z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
    }
}
