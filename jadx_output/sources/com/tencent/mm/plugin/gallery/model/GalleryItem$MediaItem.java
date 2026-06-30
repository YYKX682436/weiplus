package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes10.dex */
public abstract class GalleryItem$MediaItem implements android.os.Parcelable, java.lang.Comparable<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem>, ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138429d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138430e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f138431f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138432g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138433h;

    /* renamed from: i, reason: collision with root package name */
    public long f138434i;

    /* renamed from: m, reason: collision with root package name */
    public long f138435m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f138436n;

    /* renamed from: o, reason: collision with root package name */
    public long f138437o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f138438p;

    /* renamed from: q, reason: collision with root package name */
    public double f138439q;

    /* renamed from: r, reason: collision with root package name */
    public double f138440r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f138441s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138442t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.HashMap f138443u;

    public GalleryItem$MediaItem() {
        this(0L, "", "", "");
    }

    public static com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a(int i17, long j17) {
        return i17 == 1 ? new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem(j17) : i17 == 6 ? new com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem(j17) : new com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem(j17);
    }

    public static com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return i17 == 1 ? new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem(j17, str, str2, str3) : i17 == 6 ? new com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem(j17, str, str2, str3) : new com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem(j17, str, str2, str3);
    }

    @Override // java.lang.Comparable
    public int compareTo(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        return (int) ((this.f138435m - galleryItem$MediaItem.f138435m) / 1000);
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        if (!(obj instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem)) {
            return false;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
        java.lang.String str3 = this.f138430e;
        return (str3 != null && str3.equals(galleryItem$MediaItem.f138430e)) || ((str = this.f138438p) != null && str.equals("edit") && (str2 = this.f138431f) != null && str2.equals(galleryItem$MediaItem.f138430e));
    }

    public abstract int getType();

    @Override // ip0.c
    public java.lang.String n() {
        return this.f138434i + "_" + this.f138430e.hashCode();
    }

    public abstract java.lang.String o();

    public abstract boolean r();

    public java.lang.String toString() {
        return "MediaItem{mOriginalPath='" + this.f138430e + "', mRawEditPath='" + this.f138431f + "', mThumbPath='" + this.f138433h + "', origId=" + this.f138434i + ", generateDate=" + this.f138435m + ", dateTag=" + this.f138436n + ", isChecked=" + this.f138442t + ", mMimeType='" + this.f138438p + "', mLongitude='" + this.f138439q + "', mLatitude='" + this.f138440r + "', mBusinessTag='" + this.f138441s + "'}";
    }

    public GalleryItem$MediaItem(long j17) {
        this(j17, "", "", "");
    }

    public GalleryItem$MediaItem(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f138439q = 181.0d;
        this.f138440r = 91.0d;
        this.f138442t = false;
        this.f138443u = new java.util.HashMap();
        this.f138434i = j17;
        this.f138430e = str;
        this.f138433h = str2;
        this.f138438p = str3;
    }
}
